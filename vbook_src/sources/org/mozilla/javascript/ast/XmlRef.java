package org.mozilla.javascript.ast;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes3.dex */
public abstract class XmlRef extends AstNode {
    protected int atPos;
    protected int colonPos;
    protected Name namespace;

    public XmlRef() {
        this.atPos = -1;
        this.colonPos = -1;
    }

    public int getAtPos() {
        return this.atPos;
    }

    public int getColonPos() {
        return this.colonPos;
    }

    public Name getNamespace() {
        return this.namespace;
    }

    public boolean isAttributeAccess() {
        if (this.atPos >= 0) {
            return true;
        }
        return false;
    }

    public void setAtPos(int i) {
        this.atPos = i;
    }

    public void setColonPos(int i) {
        this.colonPos = i;
    }

    public void setNamespace(Name name) {
        this.namespace = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public XmlRef(int i) {
        super(i);
        this.atPos = -1;
        this.colonPos = -1;
    }

    public XmlRef(int i, int i2) {
        super(i, i2);
        this.atPos = -1;
        this.colonPos = -1;
    }
}
