package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vh6  reason: default package */
/* loaded from: classes.dex */
public final class vh6 implements e37 {
    public final sh6 a;
    public final p6b b;
    public final th6 c;
    public final wu7 d;

    public vh6(sh6 sh6Var, p6b p6bVar) {
        this.a = sh6Var;
        this.b = p6bVar;
        this.c = (th6) sh6Var.b.invoke();
        oy5.a();
        this.d = new wu7();
    }

    @Override // defpackage.r13
    public final float B0(float f) {
        return this.b.B0(f);
    }

    @Override // defpackage.r13
    public final float G0() {
        return this.b.G0();
    }

    @Override // defpackage.u06
    public final boolean I0() {
        return this.b.I0();
    }

    @Override // defpackage.r13
    public final float L0(float f) {
        return this.b.L0(f);
    }

    @Override // defpackage.r13
    public final long P(float f) {
        return this.b.P(f);
    }

    @Override // defpackage.r13
    public final long Q(long j) {
        return this.b.Q(j);
    }

    @Override // defpackage.e37
    public final c37 W0(int i, int i2, Map map, xt4 xt4Var, xt4 xt4Var2) {
        return this.b.W0(i, i2, map, xt4Var, xt4Var2);
    }

    @Override // defpackage.r13
    public final int X0(float f) {
        return this.b.X0(f);
    }

    public final List a(int i) {
        wu7 wu7Var = this.d;
        List list = (List) wu7Var.b(i);
        if (list != null) {
            return list;
        }
        th6 th6Var = this.c;
        Object b = th6Var.b(i);
        List j0 = this.b.j0(b, this.a.a(i, b, th6Var.c(i)));
        wu7Var.i(i, j0);
        return j0;
    }

    @Override // defpackage.r13
    public final float c0(long j) {
        return this.b.c0(j);
    }

    @Override // defpackage.r13
    public final float f() {
        return this.b.f();
    }

    @Override // defpackage.r13
    public final long f1(long j) {
        return this.b.f1(j);
    }

    @Override // defpackage.u06
    public final tc6 getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.e37
    public final c37 i0(int i, int i2, jc jcVar, y0 y0Var, Map map, dg dgVar) {
        return this.b.i0(i, i2, jcVar, y0Var, map, dgVar);
    }

    @Override // defpackage.r13
    public final float k1(long j) {
        return this.b.k1(j);
    }

    @Override // defpackage.r13
    public final long p0(int i) {
        return this.b.p0(i);
    }

    @Override // defpackage.e37
    public final c37 q0(int i, int i2, Map map, xt4 xt4Var) {
        return this.b.q0(i, i2, map, xt4Var);
    }

    @Override // defpackage.r13
    public final long r0(float f) {
        return this.b.r0(f);
    }

    @Override // defpackage.r13
    public final float y0(int i) {
        return this.b.y0(i);
    }
}
