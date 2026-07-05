package org.mozilla.javascript.ast;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class Loop extends Scope {
    protected AstNode body;
    protected int lp;
    protected int rp;

    public Loop() {
        this.lp = -1;
        this.rp = -1;
    }

    public AstNode getBody() {
        return this.body;
    }

    public int getLp() {
        return this.lp;
    }

    public int getRp() {
        return this.rp;
    }

    public void setBody(AstNode astNode) {
        this.body = astNode;
        setLength((astNode.getLength() + astNode.getPosition()) - getPosition());
        astNode.setParent(this);
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

    public Loop(int i) {
        super(i);
        this.lp = -1;
        this.rp = -1;
    }

    public Loop(int i, int i2) {
        super(i, i2);
        this.lp = -1;
        this.rp = -1;
    }
}
