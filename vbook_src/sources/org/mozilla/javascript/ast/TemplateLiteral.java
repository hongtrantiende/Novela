package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class TemplateLiteral extends AstNode {
    private List<AstNode> elements;

    public TemplateLiteral() {
        this.type = 180;
    }

    public void addElement(AstNode astNode) {
        assertNotNull(astNode);
        if (this.elements == null) {
            this.elements = new ArrayList();
        }
        this.elements.add(astNode);
        astNode.setParent(this);
    }

    public AstNode getElement(int i) {
        List<AstNode> list = this.elements;
        if (list != null) {
            return list.get(i);
        }
        cy7.k("no elements");
        return null;
    }

    public List<AstNode> getElements() {
        List<AstNode> list = this.elements;
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public int getSize() {
        List<AstNode> list = this.elements;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public List<AstNode> getSubstitutions() {
        if (this.elements == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (AstNode astNode : this.elements) {
            if (astNode.getType() != 181) {
                arrayList.add(astNode);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public List<TemplateCharacters> getTemplateStrings() {
        if (this.elements == null) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (AstNode astNode : this.elements) {
            if (astNode.getType() == 181) {
                arrayList.add((TemplateCharacters) astNode);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public void setElements(List<AstNode> list) {
        if (list == null) {
            this.elements = null;
            return;
        }
        List<AstNode> list2 = this.elements;
        if (list2 != null) {
            list2.clear();
        }
        for (AstNode astNode : list) {
            addElement(astNode);
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        sb.append("`");
        for (AstNode astNode : getElements()) {
            if (astNode.getType() == 181) {
                sb.append(astNode.toSource(0));
            } else {
                sb.append("${");
                sb.append(astNode.toSource(0));
                sb.append("}");
            }
        }
        sb.append("`");
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            for (AstNode astNode : getElements()) {
                astNode.visit(nodeVisitor);
            }
        }
    }

    public TemplateLiteral(int i) {
        super(i);
        this.type = 180;
    }

    public TemplateLiteral(int i, int i2) {
        super(i, i2);
        this.type = 180;
    }
}
