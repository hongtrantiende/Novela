package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wy  reason: default package */
/* loaded from: classes.dex */
public final class wy implements uy, e37, yy6 {
    public final id6 a;
    public cga b;
    public boolean c;

    public wy(id6 id6Var, cga cgaVar) {
        this.a = id6Var;
        this.b = cgaVar;
    }

    @Override // defpackage.r13
    public final float B0(float f) {
        return f / this.a.f();
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.a.G0();
    }

    @Override // defpackage.u06
    public final boolean I0() {
        return false;
    }

    @Override // defpackage.r13
    public final float L0(float f) {
        return this.a.f() * f;
    }

    @Override // defpackage.r13
    public final long P(float f) {
        return this.a.P(f);
    }

    @Override // defpackage.r13
    public final long Q(long j) {
        return this.a.Q(j);
    }

    @Override // defpackage.e37
    public final c37 W0(int i, int i2, Map map, xt4 xt4Var, xt4 xt4Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            lv5.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new vy(i, i2, map, xt4Var, xt4Var2, this, 0);
    }

    @Override // defpackage.r13
    public final int X0(float f) {
        return this.a.X0(f);
    }

    @Override // defpackage.yy6
    public final sc6 a(sc6 sc6Var) {
        uy6 uy6Var;
        if (sc6Var instanceof uy6) {
            return sc6Var;
        }
        if (sc6Var instanceof i38) {
            ty6 C1 = ((i38) sc6Var).C1();
            if (C1 != null && (uy6Var = C1.R) != null) {
                return uy6Var;
            }
            return sc6Var;
        }
        lv5.b("Unsupported LayoutCoordinates");
        ls2.c();
        return null;
    }

    @Override // defpackage.r13
    public final float c0(long j) {
        return this.a.c0(j);
    }

    @Override // defpackage.r13
    public final float f() {
        return this.a.f();
    }

    @Override // defpackage.r13
    public final long f1(long j) {
        return this.a.f1(j);
    }

    @Override // defpackage.u06
    public final tc6 getLayoutDirection() {
        return this.a.O.W;
    }

    @Override // defpackage.e37
    public final c37 i0(int i, int i2, jc jcVar, y0 y0Var, Map map, dg dgVar) {
        return this.a.i0(i, i2, jcVar, y0Var, map, dgVar);
    }

    @Override // defpackage.r13
    public final float k1(long j) {
        return this.a.k1(j);
    }

    @Override // defpackage.r13
    public final long p0(int i) {
        return this.a.p0(i);
    }

    @Override // defpackage.e37
    public final c37 q0(int i, int i2, Map map, xt4 xt4Var) {
        return this.a.W0(i, i2, map, null, xt4Var);
    }

    @Override // defpackage.r13
    public final long r0(float f) {
        return this.a.r0(f);
    }

    @Override // defpackage.r13
    public final float y0(int i) {
        return this.a.y0(i);
    }
}
