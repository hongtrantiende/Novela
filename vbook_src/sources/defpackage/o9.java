package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o9  reason: default package */
/* loaded from: classes3.dex */
public final class o9 implements p9 {
    public final t9 a;

    public o9(t9 t9Var) {
        t9Var.getClass();
        this.a = t9Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof o9) && c16.i(this.a, ((o9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnImported(model=" + this.a + ")";
    }
}
