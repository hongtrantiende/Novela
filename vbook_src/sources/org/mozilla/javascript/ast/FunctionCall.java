package org.mozilla.javascript.ast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class FunctionCall extends AstNode {
    protected static final List<AstNode> NO_ARGS = Collections.unmodifiableList(new ArrayList());
    protected List<AstNode> arguments;
    protected int lp;
    protected boolean optionalCall;
    protected int rp;
    protected AstNode target;

    public FunctionCall() {
        this.lp = -1;
        this.rp = -1;
        this.optionalCall = false;
        this.type = 43;
    }

    public void addArgument(AstNode astNode) {
        assertNotNull(astNode);
        if (this.arguments == null) {
            this.arguments = new ArrayList();
        }
        this.arguments.add(astNode);
        astNode.setParent(this);
    }

    public List<AstNode> getArguments() {
        List<AstNode> list = this.arguments;
        if (list != null) {
            return list;
        }
        return NO_ARGS;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public boolean isOptionalCall() {
        return this.optionalCall;
    }

    public void markIsOptionalCall() {
        this.optionalCall = true;
    }

    public void setArguments(List<AstNode> list) {
        if (list == null) {
            this.arguments = null;
            return;
        }
        List<AstNode> list2 = this.arguments;
        if (list2 != null) {
            list2.clear();
        }
        for (AstNode astNode : list) {
            addArgument(astNode);
        }
    }

    public void setLp(int i) {
        this.lp = i;
    }

    public void setParens(int i, int i2) {
        this.lp = i;
        this.rp = i2;
    }

    public void setRp(int i) {
        this.rp = i;
    }

    public void setTarget(AstNode astNode) {
        assertNotNull(astNode);
        this.target = astNode;
        astNode.setParent(this);
        setLineColumnNumber(astNode.getLineno(), astNode.getColumn());
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        sb.append(this.target.toSource(0));
        if (this.optionalCall) {
            sb.append("?.");
        }
        sb.append("(");
        List<AstNode> list = this.arguments;
        if (list != null) {
            printList(list, sb);
        }
        sb.append(")");
        if (getInlineComment() != null) {
            sb.append(getInlineComment().toSource(i));
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            for (AstNode astNode : getArguments()) {
                astNode.visit(nodeVisitor);
            }
        }
    }

    public FunctionCall(int i) {
        super(i);
        this.lp = -1;
        this.rp = -1;
        this.optionalCall = false;
        this.type = 43;
    }

    public FunctionCall(int i, int i2) {
        super(i, i2);
        this.lp = -1;
        this.rp = -1;
        this.optionalCall = false;
        this.type = 43;
    }
}
