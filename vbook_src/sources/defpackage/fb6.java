package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fb6  reason: default package */
/* loaded from: classes3.dex */
public abstract class fb6 implements vu4, Serializable {
    private final int arity;

    public fb6(int i) {
        this.arity = i;
    }

    @Override // defpackage.vu4
    public int getArity() {
        return this.arity;
    }

    public String toString() {
        cm9.a.getClass();
        return dm9.a(this);
    }
}
