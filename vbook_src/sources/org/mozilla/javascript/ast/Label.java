package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public class Label extends Jump {
    private String name;

    public Label(int i, int i2) {
        this.type = Token.LABEL;
        this.position = i;
        this.length = i2;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        String trim;
        if (str == null) {
            trim = null;
        } else {
            trim = str.trim();
        }
        if (trim != null && !"".equals(trim)) {
            this.name = trim;
        } else {
            vs.m("invalid label name");
        }
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(makeIndent(i));
        return s21.q(sb, this.name, ":\n");
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public Label(int i) {
        this(i, -1);
    }

    public Label() {
        this.type = Token.LABEL;
    }

    public Label(int i, int i2, String str) {
        this(i, i2);
        setName(str);
    }
}
