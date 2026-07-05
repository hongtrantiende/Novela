package org.mozilla.javascript.ast;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class ParenthesizedExpression extends AstNode {
    private AstNode expression;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ParenthesizedExpression(org.mozilla.javascript.ast.AstNode r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L7
            int r0 = r3.getPosition()
            goto L8
        L7:
            r0 = 0
        L8:
            if (r3 == 0) goto Lf
            int r1 = r3.getLength()
            goto L10
        Lf:
            r1 = 1
        L10:
            r2.<init>(r0, r1, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.ast.ParenthesizedExpression.<init>(org.mozilla.javascript.ast.AstNode):void");
    }

    public AstNode getExpression() {
        return this.expression;
    }

    public void setExpression(AstNode astNode) {
        assertNotNull(astNode);
        this.expression = astNode;
        astNode.setParent(this);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        return rs8.l(makeIndent(i), "(", this.expression.toSource(0), ")");
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.expression.visit(nodeVisitor);
        }
    }

    public ParenthesizedExpression(int i) {
        super(i);
        this.type = 96;
    }

    public ParenthesizedExpression(int i, int i2) {
        super(i, i2);
        this.type = 96;
    }

    public ParenthesizedExpression() {
        this.type = 96;
    }

    public ParenthesizedExpression(int i, int i2, AstNode astNode) {
        super(i, i2);
        this.type = 96;
        setExpression(astNode);
    }
}
