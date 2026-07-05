package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tf8  reason: default package */
/* loaded from: classes.dex */
public final class tf8 extends kwe {
    public final rk9 c;

    public tf8(rk9 rk9Var) {
        this.c = rk9Var;
    }

    @Override // defpackage.kwe
    public final rk9 E() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf8)) {
            return false;
        }
        if (c16.i(this.c, ((tf8) obj).c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
