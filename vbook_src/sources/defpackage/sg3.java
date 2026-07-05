package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sg3  reason: default package */
/* loaded from: classes.dex */
public final class sg3 implements z72, kx5 {
    public final float a;

    public sg3(float f) {
        this.a = f;
    }

    @Override // defpackage.z72
    public final float a(long j, r13 r13Var) {
        return r13Var.L0(this.a);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof sg3) || !rg3.b(this.a, ((sg3) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.kx5
    public final Object g() {
        return new rg3(this.a);
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    public final String toString() {
        return a82.k("CornerSize(size = ", this.a, ".dp)");
    }
}
