package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rh4  reason: default package */
/* loaded from: classes.dex */
public final class rh4 implements sz9 {
    public final float a;

    public rh4(float f) {
        this.a = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof rh4) && Float.compare(this.a, ((rh4) obj).a) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }

    @Override // defpackage.sz9
    public final rz9 j(long j, long j2, long j3, y22 y22Var, float f, float f2) {
        return twe.f(this, j, j2, j3, y22Var, f, f2);
    }

    @Override // defpackage.sz9
    public final rz9 n(long j, long j2, long j3, y22 y22Var, float f, float f2) {
        y22Var.getClass();
        boolean equals = y22Var.equals(x22.g);
        float f3 = this.a;
        if (equals || f2 <= f) {
            f2 = f * f3;
        }
        return new rz9(f, f2, f3 * f2);
    }

    public final String toString() {
        return "FixedScalesCalculator(multiple=" + yz1.k(2, this.a) + ')';
    }
}
