package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: if6  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class if6 implements mu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ wea D;
    public final /* synthetic */ float E;
    public final /* synthetic */ g3a F;
    public final /* synthetic */ boolean G;
    public final /* synthetic */ xt4 H;
    public final /* synthetic */ float I;
    public final /* synthetic */ h3a J;
    public final /* synthetic */ vt4 K;
    public final /* synthetic */ vt4 L;
    public final /* synthetic */ boolean M;
    public final /* synthetic */ xt4 N;
    public final /* synthetic */ xt4 O;
    public final /* synthetic */ int a;
    public final /* synthetic */ rh8 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ long f;

    public /* synthetic */ if6(rh8 rh8Var, boolean z, boolean z2, long j, long j2, int i, wea weaVar, float f, g3a g3aVar, boolean z3, xt4 xt4Var, float f2, h3a h3aVar, vt4 vt4Var, vt4 vt4Var2, boolean z4, vt4 vt4Var3, xt4 xt4Var2, xt4 xt4Var3, int i2) {
        this.a = i2;
        this.b = rh8Var;
        this.c = z;
        this.d = z2;
        this.e = j;
        this.f = j2;
        this.C = i;
        this.D = weaVar;
        this.E = f;
        this.F = g3aVar;
        this.G = z3;
        this.H = xt4Var;
        this.I = f2;
        this.J = h3aVar;
        this.K = vt4Var;
        this.L = vt4Var2;
        this.M = z4;
        this.N = xt4Var2;
        this.O = xt4Var3;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        float o;
        f3a f3aVar;
        xt4 xt4Var;
        boolean z2;
        vt4 vt4Var;
        vt4 vt4Var2;
        int i;
        boolean z3;
        float o2;
        f3a f3aVar2;
        xt4 xt4Var2;
        boolean z4;
        vt4 vt4Var3;
        vt4 vt4Var4;
        int i2;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        h3a h3aVar = h3a.b;
        f3a f3aVar3 = f3a.a;
        f3a f3aVar4 = f3a.b;
        Object obj4 = ax1.a;
        long j = this.f;
        long j2 = this.e;
        boolean z5 = this.c;
        rh8 rh8Var = this.b;
        switch (i3) {
            case 0:
                su0 su0Var = (su0) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(su0Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    final float h = x02.h(su0Var.b);
                    tc6 tc6Var = (tc6) rv4Var.j(dy1.n);
                    boolean f = rv4Var.f(rh8Var) | rv4Var.d(tc6Var.ordinal());
                    Object P = rv4Var.P();
                    if (f || P == obj4) {
                        if (z5) {
                            o = zbe.n(rh8Var, tc6Var);
                        } else {
                            o = zbe.o(rh8Var, tc6Var);
                        }
                        P = new rg3(o);
                        rv4Var.o0(P);
                    }
                    float f2 = ((rg3) P).a;
                    if (z5) {
                        f3aVar = f3aVar4;
                    } else {
                        f3aVar = f3aVar3;
                    }
                    final boolean z6 = this.d;
                    if (z6) {
                        j = j2;
                    }
                    int i4 = this.C;
                    boolean d = rv4Var.d(i4) | rv4Var.c(f2);
                    wea weaVar = this.D;
                    boolean f3 = d | rv4Var.f(weaVar);
                    float f4 = this.E;
                    boolean c = f3 | rv4Var.c(f4) | rv4Var.e(j) | rv4Var.d(f3aVar.ordinal());
                    g3a g3aVar = this.F;
                    boolean d2 = c | rv4Var.d(g3aVar.ordinal());
                    Object P2 = rv4Var.P();
                    if (d2 || P2 == obj4) {
                        P2 = new e3a(i4, f2, weaVar, f4, j, f3aVar, g3aVar);
                        rv4Var.o0(P2);
                    }
                    e3a e3aVar = (e3a) P2;
                    boolean f5 = rv4Var.f(null);
                    Object P3 = rv4Var.P();
                    if (f5 || P3 == obj4) {
                        rv4Var.o0(null);
                        P3 = null;
                    }
                    lu4 lu4Var = (lu4) P3;
                    final boolean z7 = this.G;
                    boolean g = rv4Var.g(z7) | rv4Var.g(z6);
                    final xt4 xt4Var3 = this.H;
                    boolean f6 = g | rv4Var.f(xt4Var3);
                    final float f7 = this.I;
                    boolean c2 = f6 | rv4Var.c(f7) | rv4Var.c(h);
                    Object P4 = rv4Var.P();
                    if (!c2 && P4 != obj4) {
                        xt4Var = xt4Var3;
                    } else {
                        P4 = new xt4() { // from class: kf6
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj5) {
                                int i5 = r6;
                                pvc pvcVar2 = pvc.a;
                                float f8 = h;
                                float f9 = f7;
                                xt4 xt4Var4 = xt4Var3;
                                boolean z8 = z6;
                                boolean z9 = z7;
                                float floatValue = ((Float) obj5).floatValue();
                                switch (i5) {
                                    case 0:
                                        if (z9) {
                                            floatValue = -floatValue;
                                        }
                                        if (z8) {
                                            xt4Var4.invoke(Float.valueOf((floatValue / f8) + f9));
                                        }
                                        return pvcVar2;
                                    default:
                                        if (z9) {
                                            floatValue = -floatValue;
                                        }
                                        if (z8) {
                                            xt4Var4.invoke(Float.valueOf((floatValue / f8) + f9));
                                        }
                                        return pvcVar2;
                                }
                            }
                        };
                        xt4Var = xt4Var3;
                        rv4Var.o0(P4);
                    }
                    qj3 b = nj3.b((xt4) P4, rv4Var, 0);
                    h3a h3aVar2 = this.J;
                    boolean d3 = rv4Var.d(h3aVar2.ordinal()) | rv4Var.c(h) | rv4Var.f(b) | rv4Var.g(z7);
                    Object P5 = rv4Var.P();
                    vt4 vt4Var5 = this.K;
                    vt4 vt4Var6 = this.L;
                    if (!d3 && P5 != obj4) {
                        vt4Var2 = vt4Var5;
                        vt4Var = vt4Var6;
                    } else {
                        if (h3aVar2 != h3aVar) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        xt4 xt4Var4 = this.N;
                        xt4 xt4Var5 = this.O;
                        vt4Var = vt4Var6;
                        vt4Var2 = vt4Var5;
                        P5 = nj3.a(kq7.a, b, ff8.a, z2, null, true, new of6(h, z7, vt4Var6, vt4Var5, h3aVar2, xt4Var4, xt4Var, xt4Var5, null, 0), new pf6(0, null, xt4Var5), false, Token.WITH);
                        rv4Var.o0(P5);
                    }
                    rse.c(vt4Var2, vt4Var, this.M, e3aVar, (nq7) P5, lu4Var, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                su0 su0Var2 = (su0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(su0Var2)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z3)) {
                    final float h2 = x02.h(su0Var2.b);
                    tc6 tc6Var2 = (tc6) rv4Var2.j(dy1.n);
                    boolean d4 = rv4Var2.d(tc6Var2.ordinal()) | rv4Var2.f(rh8Var);
                    Object P6 = rv4Var2.P();
                    if (d4 || P6 == obj4) {
                        if (z5) {
                            o2 = zbe.n(rh8Var, tc6Var2);
                        } else {
                            o2 = zbe.o(rh8Var, tc6Var2);
                        }
                        P6 = new rg3(o2);
                        rv4Var2.o0(P6);
                    }
                    float f8 = ((rg3) P6).a;
                    if (z5) {
                        f3aVar2 = f3aVar4;
                    } else {
                        f3aVar2 = f3aVar3;
                    }
                    final boolean z8 = this.d;
                    if (z8) {
                        j = j2;
                    }
                    int i5 = this.C;
                    boolean d5 = rv4Var2.d(i5) | rv4Var2.c(f8);
                    wea weaVar2 = this.D;
                    boolean f9 = d5 | rv4Var2.f(weaVar2);
                    float f10 = this.E;
                    boolean c3 = f9 | rv4Var2.c(f10) | rv4Var2.e(j) | rv4Var2.d(f3aVar2.ordinal());
                    g3a g3aVar2 = this.F;
                    boolean d6 = c3 | rv4Var2.d(g3aVar2.ordinal());
                    Object P7 = rv4Var2.P();
                    if (d6 || P7 == obj4) {
                        P7 = new e3a(i5, f8, weaVar2, f10, j, f3aVar2, g3aVar2);
                        rv4Var2.o0(P7);
                    }
                    e3a e3aVar2 = (e3a) P7;
                    boolean f11 = rv4Var2.f(null);
                    Object P8 = rv4Var2.P();
                    if (f11 || P8 == obj4) {
                        rv4Var2.o0(null);
                        P8 = null;
                    }
                    lu4 lu4Var2 = (lu4) P8;
                    final boolean z9 = this.G;
                    boolean g2 = rv4Var2.g(z9) | rv4Var2.g(z8);
                    final xt4 xt4Var6 = this.H;
                    boolean f12 = g2 | rv4Var2.f(xt4Var6);
                    final float f13 = this.I;
                    boolean c4 = f12 | rv4Var2.c(f13) | rv4Var2.c(h2);
                    Object P9 = rv4Var2.P();
                    if (!c4 && P9 != obj4) {
                        xt4Var2 = xt4Var6;
                    } else {
                        P9 = new xt4() { // from class: kf6
                            @Override // defpackage.xt4
                            public final Object invoke(Object obj5) {
                                int i52 = r6;
                                pvc pvcVar2 = pvc.a;
                                float f82 = h2;
                                float f92 = f13;
                                xt4 xt4Var42 = xt4Var6;
                                boolean z82 = z8;
                                boolean z92 = z9;
                                float floatValue = ((Float) obj5).floatValue();
                                switch (i52) {
                                    case 0:
                                        if (z92) {
                                            floatValue = -floatValue;
                                        }
                                        if (z82) {
                                            xt4Var42.invoke(Float.valueOf((floatValue / f82) + f92));
                                        }
                                        return pvcVar2;
                                    default:
                                        if (z92) {
                                            floatValue = -floatValue;
                                        }
                                        if (z82) {
                                            xt4Var42.invoke(Float.valueOf((floatValue / f82) + f92));
                                        }
                                        return pvcVar2;
                                }
                            }
                        };
                        xt4Var2 = xt4Var6;
                        rv4Var2.o0(P9);
                    }
                    qj3 b2 = nj3.b((xt4) P9, rv4Var2, 0);
                    h3a h3aVar3 = this.J;
                    boolean d7 = rv4Var2.d(h3aVar3.ordinal()) | rv4Var2.c(h2) | rv4Var2.f(b2) | rv4Var2.g(z9);
                    Object P10 = rv4Var2.P();
                    vt4 vt4Var7 = this.K;
                    vt4 vt4Var8 = this.L;
                    if (!d7 && P10 != obj4) {
                        vt4Var4 = vt4Var7;
                        vt4Var3 = vt4Var8;
                    } else {
                        if (h3aVar3 != h3aVar) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        xt4 xt4Var7 = this.N;
                        xt4 xt4Var8 = this.O;
                        vt4Var3 = vt4Var8;
                        vt4Var4 = vt4Var7;
                        P10 = nj3.a(kq7.a, b2, ff8.a, z4, null, true, new of6(h2, z9, vt4Var8, vt4Var7, h3aVar3, xt4Var7, xt4Var2, xt4Var8, null, 1), new pf6(1, null, xt4Var8), false, Token.WITH);
                        rv4Var2.o0(P10);
                    }
                    rse.c(vt4Var4, vt4Var3, this.M, e3aVar2, (nq7) P10, lu4Var2, rv4Var2, 0);
                    return pvcVar;
                }
                rv4Var2.X();
                return pvcVar;
        }
    }
}
