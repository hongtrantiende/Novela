package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class TaggedTemplateLiteral extends AstNode {
    private AstNode target;
    private AstNode templateLiteral;

    public TaggedTemplateLiteral() {
        this.type = Token.TAGGED_TEMPLATE_LITERAL;
    }

    public AstNode getTarget() {
        return this.target;
    }

    public AstNode getTemplateLiteral() {
        return this.templateLiteral;
    }

    public void setTarget(AstNode astNode) {
        this.target = astNode;
        astNode.setParent(this);
    }

    public void setTemplateLiteral(AstNode astNode) {
        this.templateLiteral = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return makeIndent(i) + this.target.toSource(0) + this.templateLiteral.toSource(0);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.target.visit(nodeVisitor);
            this.templateLiteral.visit(nodeVisitor);
        }
    }

    public TaggedTemplateLiteral(int i) {
        super(i);
        this.type = Token.TAGGED_TEMPLATE_LITERAL;
    }

    public TaggedTemplateLiteral(int i, int i2) {
        super(i, i2);
        this.type = Token.TAGGED_TEMPLATE_LITERAL;
    }
}
