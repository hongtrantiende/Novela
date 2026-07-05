package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class Scope extends Jump {
    private List<Scope> childScopes;
    protected Scope parentScope;
    protected Map<String, Symbol> symbolTable;
    protected ScriptNode top;

    public Scope(int i) {
        this.type = Token.BLOCK;
        this.position = i;
    }

    private Map<String, Symbol> ensureSymbolTable() {
        if (this.symbolTable == null) {
            this.symbolTable = new LinkedHashMap(5);
        }
        return this.symbolTable;
    }

    public static void joinScopes(Scope scope, Scope scope2) {
        Map<String, Symbol> ensureSymbolTable = scope.ensureSymbolTable();
        Map<String, Symbol> ensureSymbolTable2 = scope2.ensureSymbolTable();
        if (!Collections.disjoint(ensureSymbolTable.keySet(), ensureSymbolTable2.keySet())) {
            AstNode.codeBug();
        }
        for (Map.Entry<String, Symbol> entry : ensureSymbolTable.entrySet()) {
            Symbol value = entry.getValue();
            value.setContainingTable(scope2);
            ensureSymbolTable2.put(entry.getKey(), value);
        }
    }

    public static Scope splitScope(Scope scope) {
        Scope scope2 = new Scope(scope.getPosition(), scope.getLength());
        scope2.symbolTable = scope.symbolTable;
        scope.symbolTable = null;
        scope2.parent = scope.parent;
        scope2.setParentScope(scope.getParentScope());
        scope.parent = scope2;
        scope2.top = scope.top;
        return scope2;
    }

    public void addChildScope(Scope scope) {
        if (this.childScopes == null) {
            this.childScopes = new ArrayList();
        }
        this.childScopes.add(scope);
        scope.setParentScope(this);
    }

    public void clearParentScope() {
        this.parentScope = null;
    }

    public List<Scope> getChildScopes() {
        return this.childScopes;
    }

    public Scope getDefiningScope(String str) {
        while (this != null) {
            Map<String, Symbol> symbolTable = this.getSymbolTable();
            if (symbolTable != null && symbolTable.containsKey(str)) {
                return this;
            }
            this = this.parentScope;
        }
        return null;
    }

    public Scope getParentScope() {
        return this.parentScope;
    }

    public List<AstNode> getStatements() {
        ArrayList arrayList = new ArrayList();
        for (Node firstChild = getFirstChild(); firstChild != null; firstChild = firstChild.getNext()) {
            arrayList.add((AstNode) firstChild);
        }
        return arrayList;
    }

    public Symbol getSymbol(String str) {
        Map<String, Symbol> map = this.symbolTable;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public Map<String, Symbol> getSymbolTable() {
        return this.symbolTable;
    }

    public ScriptNode getTop() {
        return this.top;
    }

    public void putSymbol(Symbol symbol) {
        if (symbol.getName() != null) {
            ensureSymbolTable();
            this.symbolTable.put(symbol.getName(), symbol);
            symbol.setContainingTable(this);
            this.top.addSymbol(symbol);
            return;
        }
        vs.m("null symbol name");
    }

    public void replaceWith(Scope scope) {
        List<Scope> list = this.childScopes;
        if (list != null) {
            for (Scope scope2 : list) {
                scope.addChildScope(scope2);
            }
            this.childScopes.clear();
            this.childScopes = null;
        }
        Map<String, Symbol> map = this.symbolTable;
        if (map != null && !map.isEmpty()) {
            joinScopes(this, scope);
        }
    }

    public void setParentScope(Scope scope) {
        ScriptNode scriptNode;
        this.parentScope = scope;
        if (scope == null) {
            scriptNode = (ScriptNode) this;
        } else {
            scriptNode = scope.top;
        }
        this.top = scriptNode;
    }

    public void setSymbolTable(Map<String, Symbol> map) {
        this.symbolTable = map;
    }

    public void setTop(ScriptNode scriptNode) {
        this.top = scriptNode;
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        sb.append("{\n");
        Iterator<Node> it = iterator();
        while (it.hasNext()) {
            AstNode astNode = (AstNode) it.next();
            sb.append(astNode.toSource(i + 1));
            if (astNode.getType() == 175) {
                sb.append("\n");
            }
        }
        sb.append(makeIndent(i));
        sb.append("}\n");
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            Iterator<Node> it = iterator();
            while (it.hasNext()) {
                ((AstNode) it.next()).visit(nodeVisitor);
            }
        }
    }

    public Scope() {
        this.type = Token.BLOCK;
    }

    public Scope(int i, int i2) {
        this(i);
        this.length = i2;
    }
}
