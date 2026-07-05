package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lj4  reason: default package */
/* loaded from: classes3.dex */
public final class lj4 {
    public final String a;
    public final tu1 b;

    public lj4(String str, tu1 tu1Var) {
        str.getClass();
        this.a = str;
        this.b = tu1Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lj4)) {
            return false;
        }
        return c16.i(this.a, ((lj4) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
