package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uy6  reason: default package */
/* loaded from: classes.dex */
public final class uy6 implements sc6 {
    public final ty6 a;

    public uy6(ty6 ty6Var) {
        this.a = ty6Var;
    }

    @Override // defpackage.sc6
    public final void E(sc6 sc6Var, float[] fArr) {
        this.a.O.E(sc6Var, fArr);
    }

    @Override // defpackage.sc6
    public final long L(long j) {
        return this.a.O.L(y78.j(j, b()));
    }

    @Override // defpackage.sc6
    public final long O(long j) {
        return y78.j(this.a.O.O(j), b());
    }

    @Override // defpackage.sc6
    public final sc6 Z() {
        ty6 C1;
        if (!t()) {
            lv5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        i38 i38Var = ((i38) this.a.O.O.c0.e).S;
        if (i38Var != null && (C1 = i38Var.C1()) != null) {
            return C1.R;
        }
        return null;
    }

    @Override // defpackage.sc6
    public final long a() {
        ty6 ty6Var = this.a;
        return (ty6Var.a << 32) | (ty6Var.b & 4294967295L);
    }

    public final long b() {
        ty6 ty6Var = this.a;
        ty6 v = dxe.v(ty6Var);
        return y78.i(l0(v.R, 0L, true), ty6Var.O.l0(v.O, 0L, true));
    }

    @Override // defpackage.sc6
    public final long e0(sc6 sc6Var, long j) {
        return l0(sc6Var, j, true);
    }

    @Override // defpackage.sc6
    public final long f0(long j) {
        return y78.j(this.a.O.f0(j), b());
    }

    @Override // defpackage.sc6
    public final rk9 g0(sc6 sc6Var, boolean z) {
        return this.a.O.g0(sc6Var, z);
    }

    @Override // defpackage.sc6
    public final long h0(long j) {
        return this.a.O.h0(y78.j(j, b()));
    }

    @Override // defpackage.sc6
    public final long l0(sc6 sc6Var, long j, boolean z) {
        boolean z2 = sc6Var instanceof uy6;
        ty6 ty6Var = this.a;
        if (z2) {
            ty6 ty6Var2 = ((uy6) sc6Var).a;
            i38 i38Var = ty6Var2.O;
            i38Var.N1();
            ty6 C1 = ty6Var.O.A1(i38Var).C1();
            if (C1 != null) {
                boolean z3 = !z;
                long c = py5.c(py5.d(ty6Var2.x1(C1, z3), hif.v(j)), ty6Var.x1(C1, z3));
                return (Float.floatToRawIntBits((int) (c >> 32)) << 32) | (Float.floatToRawIntBits((int) (c & 4294967295L)) & 4294967295L);
            }
            ty6 v = dxe.v(ty6Var2);
            boolean z4 = !z;
            long d = py5.d(py5.d(ty6Var2.x1(v, z4), v.P), hif.v(j));
            ty6 v2 = dxe.v(ty6Var);
            long c2 = py5.c(d, py5.d(ty6Var.x1(v2, z4), v2.P));
            long floatToRawIntBits = Float.floatToRawIntBits((int) (c2 & 4294967295L)) & 4294967295L;
            i38 i38Var2 = v2.O.S;
            i38Var2.getClass();
            i38 i38Var3 = v.O.S;
            i38Var3.getClass();
            return i38Var2.l0(i38Var3, floatToRawIntBits | (Float.floatToRawIntBits((int) (c2 >> 32)) << 32), z);
        }
        ty6 v3 = dxe.v(ty6Var);
        i38 i38Var4 = v3.O;
        long l0 = l0(v3.R, j, z);
        long j2 = v3.P;
        long i = y78.i(l0, (4294967295L & Float.floatToRawIntBits((int) (j2 & 4294967295L))) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32));
        if (!i38Var4.E1().J) {
            lv5.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        i38Var4.N1();
        i38 i38Var5 = i38Var4.S;
        if (i38Var5 != null) {
            i38Var4 = i38Var5;
        }
        return y78.j(i, i38Var4.l0(sc6Var, 0L, z));
    }

    @Override // defpackage.sc6
    public final long m(long j) {
        return this.a.O.m(y78.j(j, b()));
    }

    @Override // defpackage.sc6
    public final boolean t() {
        return this.a.O.E1().J;
    }

    @Override // defpackage.sc6
    public final void z(float[] fArr) {
        this.a.O.z(fArr);
    }
}
