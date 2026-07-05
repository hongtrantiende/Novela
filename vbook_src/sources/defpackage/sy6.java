package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sy6  reason: default package */
/* loaded from: classes.dex */
public final class sy6 extends lw8 {
    public final /* synthetic */ int b;
    public final Object c;

    public /* synthetic */ sy6(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.r13
    public final float G0() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ry6) obj).G0();
            default:
                return ((rg) obj).getDensity().G0();
        }
    }

    @Override // defpackage.r13
    public final float f() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ry6) obj).f();
            default:
                return ((rg) obj).getDensity().f();
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [zl9, java.lang.Object] */
    @Override // defpackage.lw8
    public float g(u95 u95Var, float f) {
        float f2;
        xt4 xt4Var;
        int r0;
        yg8 snapshotObserver;
        int r02;
        switch (this.b) {
            case 0:
                lu4 lu4Var = u95Var.a;
                if (lu4Var != null) {
                    return ((Number) lu4Var.invoke(this, Float.valueOf(f))).floatValue();
                }
                ry6 ry6Var = (ry6) this.c;
                if (!ry6Var.K) {
                    ?? obj = new Object();
                    obj.a = ry6Var;
                    while (true) {
                        t6f t6fVar = ((ry6) obj.a).M;
                        float f3 = Float.NaN;
                        if (t6fVar != null && (r02 = b00.r0(u95Var, (u95[]) t6fVar.c)) >= 0) {
                            f2 = ((float[]) t6fVar.d)[r02];
                        } else {
                            f2 = Float.NaN;
                        }
                        boolean isNaN = Float.isNaN(f2);
                        Object obj2 = obj.a;
                        if (!isNaN) {
                            ((ry6) obj2).H0(ry6Var.U0(), u95Var);
                            return u95Var.a(f2, ((ry6) obj.a).S0(), ry6Var.S0());
                        }
                        ry6 ry6Var2 = (ry6) obj2;
                        lu4 lu4Var2 = ry6Var2.D;
                        if (lu4Var2 != null && (xt4Var = ry6Var2.E) != null && ((Boolean) xt4Var.invoke(u95Var)).booleanValue()) {
                            ry6 ry6Var3 = (ry6) obj.a;
                            tv7 tv7Var = ry6Var3.G;
                            if (tv7Var == null) {
                                long[] jArr = tz9.a;
                                tv7Var = new tv7();
                                ry6Var3.G = tv7Var;
                            }
                            Object g = tv7Var.g(u95Var);
                            if (g == null) {
                                g = new ow8(ry6Var3.V0(), ry6Var3, u95Var);
                                tv7Var.n(u95Var, g);
                            }
                            ow8 ow8Var = (ow8) g;
                            ow8Var.a = ry6Var3.V0();
                            wg8 wg8Var = ry6Var.U0().K;
                            if (wg8Var != null && (snapshotObserver = ((rg) wg8Var).getSnapshotObserver()) != null) {
                                snapshotObserver.a.d(ow8Var, vt3.H, new xb2(3, lu4Var2, obj, u95Var));
                            }
                            ((ry6) obj.a).H0(ry6Var.U0(), u95Var);
                            t6f t6fVar2 = ((ry6) obj.a).M;
                            if (t6fVar2 != null && (r0 = b00.r0(u95Var, (u95[]) t6fVar2.c)) >= 0) {
                                f3 = ((float[]) t6fVar2.d)[r0];
                            }
                            if (!Float.isNaN(f3)) {
                                return u95Var.a(f3, ((ry6) obj.a).S0(), ry6Var.S0());
                            }
                        }
                        ry6 a1 = ((ry6) obj.a).a1();
                        if (a1 == null) {
                            ((ry6) obj.a).H0(ry6Var.U0(), u95Var);
                            return f;
                        }
                        obj.a = a1;
                    }
                } else {
                    return f;
                }
                break;
            default:
                return f;
        }
    }

    @Override // defpackage.lw8
    public final sc6 j() {
        sc6 S0;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ry6 ry6Var = (ry6) obj;
                if (ry6Var.K) {
                    S0 = null;
                } else {
                    S0 = ry6Var.S0();
                }
                if (S0 == null) {
                    ry6Var.U0().d0.b();
                }
                return S0;
            default:
                return (i38) ((rg) obj).getRoot().c0.e;
        }
    }

    @Override // defpackage.lw8
    public final tc6 m() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ry6) obj).getLayoutDirection();
            default:
                return ((rg) obj).getLayoutDirection();
        }
    }

    @Override // defpackage.lw8
    public final int n() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((ry6) obj).v0();
            default:
                return ((rg) obj).getRoot().d0.p.a;
        }
    }
}
