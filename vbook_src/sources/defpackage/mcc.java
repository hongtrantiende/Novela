package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mcc  reason: default package */
/* loaded from: classes3.dex */
public final class mcc {
    public final hi5 a;
    public final tl8 b;

    public mcc(hi5 hi5Var, tl8 tl8Var) {
        hi5Var.getClass();
        tl8Var.getClass();
        this.a = hi5Var;
        this.b = tl8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcc)) {
            return false;
        }
        mcc mccVar = (mcc) obj;
        if (c16.i(this.a, mccVar.a) && c16.i(this.b, mccVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TokenRequest(request=" + this.a + ", formParameters=" + this.b + ")";
    }
}
