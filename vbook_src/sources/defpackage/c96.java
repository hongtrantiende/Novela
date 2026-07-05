package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c96  reason: default package */
/* loaded from: classes.dex */
public final class c96 {
    public final Float a;
    public mn3 b;

    public c96(Float f, mn3 mn3Var) {
        this.a = f;
        this.b = mn3Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof c96) {
            c96 c96Var = (c96) obj;
            if (c96Var.a.equals(this.a) && c16.i(c96Var.b, this.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + hl5.a(0, this.a.hashCode() * 31, 31);
    }
}
