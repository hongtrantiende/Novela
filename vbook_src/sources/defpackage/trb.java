package defpackage;

import android.view.KeyEvent;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: trb  reason: default package */
/* loaded from: classes.dex */
public final class trb extends m03 implements zj3, by8, z7a, hz4, c19, l86, wx1, sq7, r78, oc6, xm4 {
    public mkc M;
    public hvb N;
    public ytb O;
    public boolean P;
    public boolean Q;
    public t86 R;
    public pg0 S;
    public boolean T;
    public yu7 U;
    public xv7 V;
    public final mn4 W;
    public final hab X;
    public ch3 Y;
    public final hh3 Z;
    public oid a0;
    public iya b0;
    public final ij1 c0;
    public final qrb d0;
    public iya e0;
    public final prb f0;
    public final hm8 g0;

    public trb(mkc mkcVar, hvb hvbVar, ytb ytbVar, og0 og0Var, boolean z, boolean z2, t86 t86Var, pg0 pg0Var, boolean z3, yu7 yu7Var, xv7 xv7Var) {
        this.M = mkcVar;
        this.N = hvbVar;
        this.O = ytbVar;
        this.P = z;
        this.Q = z2;
        this.R = t86Var;
        this.S = pg0Var;
        this.T = z3;
        this.U = yu7Var;
        this.V = xv7Var;
        ytbVar.m = new prb(this, 3);
        this.W = new mn4(yu7Var, new qrb(this, 0), 2);
        hab a = dab.a(new vi(this, 13));
        H1(a);
        this.X = a;
        prb prbVar = new prb(this, 5);
        el7 el7Var = new el7(this, 28);
        hh3 hh3Var = new hh3(new jk(9, new ux9(prbVar, 28), new vrb(new qrb(this, 1), el7Var, new qrb(this, 2), new qrb(this, 3), new qrb(this, 4), new qrb(this, 5))), 1);
        H1(hh3Var);
        this.Z = hh3Var;
        this.c0 = new ij1(10);
        this.d0 = new qrb(this, 6);
        this.f0 = new prb(this, 4);
        this.g0 = yae.z(Boolean.FALSE);
    }

    @Override // defpackage.mq7
    public final void A1() {
        K1();
        this.O.n = null;
    }

    @Override // defpackage.l86
    public final boolean H(KeyEvent keyEvent) {
        mkc mkcVar = this.M;
        ytb ytbVar = this.O;
        pm4 pm4Var = (pm4) nye.q(this, dy1.i);
        O1();
        this.c0.getClass();
        if (fxb.d(mkcVar.f().e) || keyEvent.getKeyCode() != 4 || gae.j(keyEvent) != 1) {
            return false;
        }
        mkc mkcVar2 = ytbVar.a;
        if (!fxb.d(mkcVar2.f().e)) {
            dub dubVar = mkcVar2.a;
            og0 og0Var = mkcVar2.b;
            dubVar.b.a().k();
            frb frbVar = dubVar.b;
            int i = (int) (frbVar.f & 4294967295L);
            uwe.p(frbVar, i, i);
            dub.a(dubVar, og0Var, true, wrb.a);
            dubVar.f(true);
        }
        ytbVar.v(false);
        ytbVar.w(x2c.a);
        return true;
    }

    public final void K1() {
        iya iyaVar = this.e0;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.e0 = null;
        xv7 xv7Var = this.V;
        if (xv7Var != null) {
            xv7Var.e();
        }
    }

    @Override // defpackage.oc6
    public final void L(sc6 sc6Var) {
        this.Z.getClass();
    }

    public final void L1() {
        ch3 ch3Var = this.Y;
        if (ch3Var != null) {
            this.U.c(new dh3(ch3Var));
            this.Y = null;
        }
    }

    public final boolean M1() {
        oid oidVar;
        if (this.W.R.M1().b() && (oidVar = this.a0) != null && ((zk6) oidVar).c()) {
            return true;
        }
        return false;
    }

    public final boolean N1(int i) {
        pg0 pg0Var;
        int i2 = 0;
        if (i == 0 || i == 1 || (pg0Var = this.S) == null) {
            if (i == 6) {
                ((rm4) ((pm4) nye.q(this, dy1.i))).g(1, true);
                return true;
            } else if (i == 5) {
                ((rm4) ((pm4) nye.q(this, dy1.i))).g(2, true);
                return true;
            } else if (i != 7) {
                return false;
            } else {
                ((w03) O1()).a();
                return true;
            }
        }
        dub dubVar = pg0Var.a;
        xt4 xt4Var = pg0Var.b;
        if (!((Boolean) pg0Var.c.getValue()).booleanValue()) {
            long j = dubVar.d().e;
            int i3 = fxb.c;
            int i4 = ((int) (j >> 32)) - 1;
            if (i4 >= 0) {
                i2 = i4;
            }
            xt4Var.invoke(Integer.valueOf(i2));
        }
        return true;
    }

    public final bsa O1() {
        bsa bsaVar = (bsa) nye.q(this, dy1.q);
        if (bsaVar != null) {
            return bsaVar;
        }
        vs.k("No software keyboard controller");
        return null;
    }

    public final void P1(boolean z) {
        boolean z2;
        if (!z) {
            Boolean bool = this.R.e;
            if (bool != null) {
                z2 = bool.booleanValue();
            } else {
                z2 = true;
            }
            if (!z2) {
                return;
            }
        }
        ck9.a(this);
        this.e0 = z87.v(v1(), null, null, new rrb(this, null, 5), 3);
    }

    @Override // defpackage.r78
    public final void S0() {
        iue.R(this, new prb(this, 1));
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        qd6Var.a();
        if (((Boolean) this.g0.getValue()).booleanValue()) {
            hy0 hy0Var = (hy0) nye.q(this, yd0.a);
            long j = ((zl1) nye.q(this, yd0.b)).a;
            if (!zl1.c(j, sve.b(1308617531))) {
                hy0Var = new esa(j);
            }
            ak3.h1(qd6Var, hy0Var, 0L, 0L, nae.e, null, null, 0, Token.ELSE);
        }
    }

    @Override // defpackage.c19
    public final void b0(r09 r09Var, s09 s09Var, long j) {
        this.X.b0(r09Var, s09Var, j);
    }

    @Override // defpackage.xm4
    public final void e0(tm4 tm4Var) {
        sc6 b;
        ytb ytbVar = this.O;
        hvb hvbVar = ytbVar.b;
        fvb c = hvbVar.c();
        rk9 rk9Var = rk9.e;
        if (c != null) {
            if (!ytbVar.h) {
                rk9Var = j55.f;
            } else {
                grb f = ytbVar.a.f();
                if (fxb.d(f.e)) {
                    rk9Var = ytbVar.c(c, f);
                } else {
                    long j = f.e;
                    if (!fxb.d(j)) {
                        int i = (int) (j >> 32);
                        it7 it7Var = c.b;
                        int d = it7Var.d(i);
                        int i2 = (int) (4294967295L & j);
                        int d2 = it7Var.d(i2);
                        if (d == d2) {
                            float f2 = c.f(i, true);
                            float f3 = c.f(i2, true);
                            rk9Var = new rk9(Math.min(f2, f3), it7Var.f(d), Math.max(f2, f3), it7Var.b(d2));
                        } else {
                            rk9Var = c.j(fxb.g(j), fxb.f(j)).g();
                        }
                    }
                }
                sc6 e = hvbVar.e();
                if (e != null) {
                    sc6 sc6Var = null;
                    if (!e.t()) {
                        e = null;
                    }
                    if (e != null && (b = hvbVar.b()) != null) {
                        if (b.t()) {
                            sc6Var = b;
                        }
                        if (sc6Var != null) {
                            rk9Var = rk9Var.o(sc6Var.g0(e, false).j());
                        }
                    }
                }
            }
        }
        tm4Var.e(rk9Var);
    }

    @Override // defpackage.oc6, defpackage.i37
    public final void g(long j) {
        this.Z.N = j;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0482  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x04bf  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x04ec  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x04f5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0270  */
    @Override // defpackage.l86
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean g0(android.view.KeyEvent r27) {
        /*
            Method dump skipped, instructions count: 1426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.trb.g0(android.view.KeyEvent):boolean");
    }

    @Override // defpackage.z7a
    public final void m1(l8a l8aVar) {
        final boolean z;
        grb d = this.M.d();
        long j = d.e;
        ps psVar = new ps(this.M.a.d().d.toString());
        r76[] r76VarArr = j8a.a;
        k8a k8aVar = h8a.F;
        r76[] r76VarArr2 = j8a.a;
        r76 r76Var = r76VarArr2[18];
        l8aVar.a(k8aVar, psVar);
        ps psVar2 = new ps(d.d.toString());
        k8a k8aVar2 = h8a.G;
        r76 r76Var2 = r76VarArr2[19];
        l8aVar.a(k8aVar2, psVar2);
        k8a k8aVar3 = h8a.H;
        r76 r76Var3 = r76VarArr2[20];
        l8aVar.a(k8aVar3, new fxb(j));
        fxb fxbVar = this.M.a.d().f;
        k8a k8aVar4 = h8a.I;
        r76 r76Var4 = r76VarArr2[21];
        l8aVar.a(k8aVar4, fxbVar);
        rw5 rw5Var = new rw5(((Boolean) this.M.a.e.getValue()).booleanValue());
        k8a k8aVar5 = h8a.M;
        r76 r76Var5 = r76VarArr2[27];
        l8aVar.a(k8aVar5, rw5Var);
        if (!this.P) {
            l8aVar.a(h8a.j, pvc.a);
        }
        if (this.P && !this.Q) {
            z = true;
        } else {
            z = false;
        }
        k8a k8aVar6 = h8a.Q;
        r76 r76Var6 = r76VarArr2[28];
        l8aVar.a(k8aVar6, Boolean.valueOf(z));
        j8a.d(l8aVar, ox9.d);
        bj k = h50.k(d);
        if (k != null) {
            j8a.g(l8aVar, k);
        }
        j8a.b(l8aVar, new xt4() { // from class: orb
            @Override // defpackage.xt4
            public final Object invoke(Object obj) {
                int i = r3;
                boolean z2 = true;
                trb trbVar = this;
                boolean z3 = z;
                switch (i) {
                    case 0:
                        bf4 bf4Var = (bf4) obj;
                        if (!z3) {
                            z2 = false;
                        } else {
                            CharSequence b = ((bj) bf4Var).b();
                            if (b != null) {
                                trbVar.M.j(b);
                            }
                            trbVar.g0.setValue(Boolean.TRUE);
                            z87.v(trbVar.v1(), null, null, new rrb(trbVar, null, 3), 3);
                        }
                        return Boolean.valueOf(z2);
                    case 1:
                        ps psVar3 = (ps) obj;
                        if (!z3) {
                            z2 = false;
                        } else {
                            trbVar.M.j(psVar3);
                        }
                        return Boolean.valueOf(z2);
                    default:
                        ps psVar4 = (ps) obj;
                        if (!z3) {
                            z2 = false;
                        } else {
                            mkc.k(trbVar.M, psVar4, false, 12);
                        }
                        return Boolean.valueOf(z2);
                }
            }
        });
        int i = this.R.c;
        if (i == 6) {
            f32.a.getClass();
            j8a.f(l8aVar, b32.c);
        } else if (i == 7) {
            f32.a.getClass();
            j8a.f(l8aVar, b32.b);
        } else if (i == 8) {
            f32.a.getClass();
            j8a.f(l8aVar, b32.b);
        } else if (i == 4) {
            f32.a.getClass();
            j8a.f(l8aVar, b32.d);
        }
        j8a.a(l8aVar, new qrb(this, 7));
        if (z) {
            l8aVar.a(s7a.k, new g4(null, new xt4() { // from class: orb
                @Override // defpackage.xt4
                public final Object invoke(Object obj) {
                    int i2 = r3;
                    boolean z2 = true;
                    trb trbVar = this;
                    boolean z3 = z;
                    switch (i2) {
                        case 0:
                            bf4 bf4Var = (bf4) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                CharSequence b = ((bj) bf4Var).b();
                                if (b != null) {
                                    trbVar.M.j(b);
                                }
                                trbVar.g0.setValue(Boolean.TRUE);
                                z87.v(trbVar.v1(), null, null, new rrb(trbVar, null, 3), 3);
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            ps psVar3 = (ps) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                trbVar.M.j(psVar3);
                            }
                            return Boolean.valueOf(z2);
                        default:
                            ps psVar4 = (ps) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                mkc.k(trbVar.M, psVar4, false, 12);
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
            l8aVar.a(s7a.o, new g4(null, new xt4() { // from class: orb
                @Override // defpackage.xt4
                public final Object invoke(Object obj) {
                    int i2 = r3;
                    boolean z2 = true;
                    trb trbVar = this;
                    boolean z3 = z;
                    switch (i2) {
                        case 0:
                            bf4 bf4Var = (bf4) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                CharSequence b = ((bj) bf4Var).b();
                                if (b != null) {
                                    trbVar.M.j(b);
                                }
                                trbVar.g0.setValue(Boolean.TRUE);
                                z87.v(trbVar.v1(), null, null, new rrb(trbVar, null, 3), 3);
                            }
                            return Boolean.valueOf(z2);
                        case 1:
                            ps psVar3 = (ps) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                trbVar.M.j(psVar3);
                            }
                            return Boolean.valueOf(z2);
                        default:
                            ps psVar4 = (ps) obj;
                            if (!z3) {
                                z2 = false;
                            } else {
                                mkc.k(trbVar.M, psVar4, false, 12);
                            }
                            return Boolean.valueOf(z2);
                    }
                }
            }));
        }
        l8aVar.a(s7a.j, new g4(null, new pl7(this, 15)));
        int a = this.R.a();
        j8a.c(l8aVar, a, new t93(this, a, 9));
        l8aVar.a(s7a.b, new g4(null, new prb(this, 8)));
        l8aVar.a(s7a.c, new g4(null, new prb(this, 9)));
        if (!fxb.d(j)) {
            l8aVar.a(s7a.q, new g4(null, new prb(this, 10)));
            if (this.P && !this.Q) {
                l8aVar.a(s7a.r, new g4(null, new prb(this, 0)));
            }
        }
        if (z) {
            l8aVar.a(s7a.s, new g4(null, new prb(this, 6)));
        }
        if (this.P) {
            this.W.m1(l8aVar);
        }
    }

    @Override // defpackage.c19
    public final void n0() {
        this.X.n0();
    }

    @Override // defpackage.z7a
    public final boolean o1() {
        return true;
    }

    @Override // defpackage.hz4
    public final void t(i38 i38Var) {
        this.N.f.setValue(i38Var);
        if (this.P) {
            this.W.t(i38Var);
        }
    }

    @Override // defpackage.mq7
    public final void z1() {
        iue.R(this, new prb(this, 1));
        this.O.n = this.f0;
        if (this.P) {
            H1(this.W);
        }
    }
}
