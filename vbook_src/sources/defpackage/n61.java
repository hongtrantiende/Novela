package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n61  reason: default package */
/* loaded from: classes.dex */
public final class n61 implements ak3 {
    public final m61 a;
    public final ij1 b;
    public ljc c;
    public ljc d;

    /* JADX WARN: Type inference failed for: r0v0, types: [m61, java.lang.Object] */
    public n61() {
        u13 u13Var = kte.c;
        ?? obj = new Object();
        obj.a = u13Var;
        obj.b = tc6.a;
        obj.c = es3.a;
        obj.d = 0L;
        this.a = obj;
        this.b = new ij1(this);
    }

    public static ljc a(n61 n61Var, long j, bk3 bk3Var, float f, int i) {
        ljc j2 = n61Var.j(bk3Var);
        if (f != 1.0f) {
            j = zl1.b(zl1.d(j) * f, j);
        }
        if (!zl1.c(j2.g(), j)) {
            j2.p(j);
        }
        if (((Shader) j2.c) != null) {
            j2.t(null);
        }
        if (!c16.i((em1) j2.d, null)) {
            j2.q(null);
        }
        if (j2.a != i) {
            j2.o(i);
        }
        if (((Paint) j2.b).isFilterBitmap()) {
            return j2;
        }
        j2.r(1);
        return j2;
    }

    @Override // defpackage.ak3
    public final void D(yj yjVar, long j, float f, bk3 bk3Var) {
        this.a.c.b(yjVar, a(this, j, bk3Var, f, 3));
    }

    @Override // defpackage.ak3
    public final void F0(nl5 nl5Var, long j, long j2, long j3, long j4, float f, em1 em1Var, int i) {
        this.a.c.a(nl5Var, j, j2, j3, j4, g(null, ye4.a, f, em1Var, 3, i));
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.a.a.G0();
    }

    @Override // defpackage.ak3
    public final void I(long j, float f, long j2, float f2, bk3 bk3Var) {
        this.a.c.n(f, j2, a(this, j, bk3Var, f2, 3));
    }

    @Override // defpackage.ak3
    public final void K(nl5 nl5Var, long j, float f, em1 em1Var, int i) {
        this.a.c.l(nl5Var, j, g(null, ye4.a, f, em1Var, i, 1));
    }

    @Override // defpackage.ak3
    public final void K0(long j, long j2, long j3, long j4, bk3 bk3Var, float f) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.e(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j4 >> 32)), Float.intBitsToFloat((int) (j4 & 4294967295L)), a(this, j, bk3Var, f, 3));
    }

    @Override // defpackage.ak3
    public final ij1 Q0() {
        return this.b;
    }

    @Override // defpackage.ak3
    public final void U(yj yjVar, hy0 hy0Var, float f, bk3 bk3Var, em1 em1Var, int i) {
        this.a.c.b(yjVar, g(hy0Var, bk3Var, f, em1Var, i, 1));
    }

    @Override // defpackage.ak3
    public final void V(long j, float f, float f2, boolean z, long j2, long j3, float f3, bk3 bk3Var) {
        int i = (int) (j2 >> 32);
        int i2 = (int) (j2 & 4294967295L);
        this.a.c.u(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i2), f, f2, z, a(this, j, bk3Var, f3, 3));
    }

    @Override // defpackage.ak3
    public final void X(long j, long j2, long j3, float f, bk3 bk3Var, int i) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        this.a.c.g(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3), a(this, j, bk3Var, f, i));
    }

    @Override // defpackage.ak3
    public final void e1(hy0 hy0Var, long j, long j2, long j3, float f, bk3 bk3Var, em1 em1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.e(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)), g(hy0Var, bk3Var, f, em1Var, i, 1));
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a.a.f();
    }

    public final ljc g(hy0 hy0Var, bk3 bk3Var, float f, em1 em1Var, int i, int i2) {
        ljc j = j(bk3Var);
        Paint paint = (Paint) j.b;
        if (hy0Var != null) {
            hy0Var.a(f, b(), j);
        } else {
            if (((Shader) j.c) != null) {
                j.t(null);
            }
            long g = j.g();
            long j2 = zl1.b;
            if (!zl1.c(g, j2)) {
                j.p(j2);
            }
            if (paint.getAlpha() / 255.0f != f) {
                j.n(f);
            }
        }
        if (!c16.i((em1) j.d, em1Var)) {
            j.q(em1Var);
        }
        if (j.a != i) {
            j.o(i);
        }
        if (paint.isFilterBitmap() == i2) {
            return j;
        }
        j.r(i2);
        return j;
    }

    @Override // defpackage.ak3
    public final tc6 getLayoutDirection() {
        return this.a.b;
    }

    public final ljc j(bk3 bk3Var) {
        if (c16.i(bk3Var, ye4.a)) {
            ljc ljcVar = this.c;
            if (ljcVar == null) {
                ljc c = lre.c();
                c.x(0);
                this.c = c;
                return c;
            }
            return ljcVar;
        } else if (bk3Var instanceof s4b) {
            ljc ljcVar2 = this.d;
            if (ljcVar2 == null) {
                ljcVar2 = lre.c();
                ljcVar2.x(1);
                this.d = ljcVar2;
            }
            Paint paint = (Paint) ljcVar2.b;
            float strokeWidth = paint.getStrokeWidth();
            s4b s4bVar = (s4b) bk3Var;
            zj zjVar = s4bVar.e;
            float f = s4bVar.a;
            if (strokeWidth != f) {
                ljcVar2.w(f);
            }
            int h = ljcVar2.h();
            int i = s4bVar.c;
            if (h != i) {
                ljcVar2.u(i);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f2 = s4bVar.b;
            if (strokeMiter != f2) {
                paint.setStrokeMiter(f2);
            }
            int i2 = ljcVar2.i();
            int i3 = s4bVar.d;
            if (i2 != i3) {
                ljcVar2.v(i3);
            }
            if (!c16.i((zj) ljcVar2.e, zjVar)) {
                ljcVar2.s(zjVar);
            }
            return ljcVar2;
        } else {
            xk5.o();
            return null;
        }
    }

    @Override // defpackage.ak3
    public final void n1(long j, long j2, long j3, float f, int i, float f2) {
        k61 k61Var = this.a.c;
        ljc ljcVar = this.d;
        if (ljcVar == null) {
            ljcVar = lre.c();
            ljcVar.x(1);
            this.d = ljcVar;
        }
        Paint paint = (Paint) ljcVar.b;
        if (f2 != 1.0f) {
            j = zl1.b(zl1.d(j) * f2, j);
        }
        if (!zl1.c(ljcVar.g(), j)) {
            ljcVar.p(j);
        }
        if (((Shader) ljcVar.c) != null) {
            ljcVar.t(null);
        }
        if (!c16.i((em1) ljcVar.d, null)) {
            ljcVar.q(null);
        }
        if (ljcVar.a != 3) {
            ljcVar.o(3);
        }
        if (paint.getStrokeWidth() != f) {
            ljcVar.w(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (ljcVar.h() != i) {
            ljcVar.u(i);
        }
        if (ljcVar.i() != 0) {
            ljcVar.v(0);
        }
        if (!c16.i((zj) ljcVar.e, null)) {
            ljcVar.s(null);
        }
        if (!paint.isFilterBitmap()) {
            ljcVar.r(1);
        }
        k61Var.s(j2, j3, ljcVar);
    }

    @Override // defpackage.ak3
    public final void r1(hy0 hy0Var, long j, long j2, float f, bk3 bk3Var, em1 em1Var, int i) {
        int i2 = (int) (j >> 32);
        int i3 = (int) (j & 4294967295L);
        this.a.c.g(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (4294967295L & j2)) + Float.intBitsToFloat(i3), g(hy0Var, bk3Var, f, em1Var, i, 1));
    }

    @Override // defpackage.ak3
    public final void s0(hy0 hy0Var, long j, long j2, float f, int i, float f2) {
        k61 k61Var = this.a.c;
        ljc ljcVar = this.d;
        if (ljcVar == null) {
            ljcVar = lre.c();
            ljcVar.x(1);
            this.d = ljcVar;
        }
        Paint paint = (Paint) ljcVar.b;
        if (hy0Var != null) {
            hy0Var.a(f2, b(), ljcVar);
        } else if (paint.getAlpha() / 255.0f != f2) {
            ljcVar.n(f2);
        }
        if (!c16.i((em1) ljcVar.d, null)) {
            ljcVar.q(null);
        }
        if (ljcVar.a != 3) {
            ljcVar.o(3);
        }
        if (paint.getStrokeWidth() != f) {
            ljcVar.w(f);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            paint.setStrokeMiter(4.0f);
        }
        if (ljcVar.h() != i) {
            ljcVar.u(i);
        }
        if (ljcVar.i() != 0) {
            ljcVar.v(0);
        }
        if (!c16.i((zj) ljcVar.e, null)) {
            ljcVar.s(null);
        }
        if (!paint.isFilterBitmap()) {
            ljcVar.r(1);
        }
        k61Var.s(j, j2, ljcVar);
    }
}
