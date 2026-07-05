package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: du3  reason: default package */
/* loaded from: classes.dex */
public final class du3 extends x06 {
    public tkc L;
    public pkc M;
    public pkc N;
    public pkc O;
    public eu3 P;
    public lz3 Q;
    public sga R;
    public vt4 S;
    public ut3 T;
    public long U;
    public dc V;
    public final cu3 W;
    public final cu3 X;

    public du3(tkc tkcVar, pkc pkcVar, pkc pkcVar2, pkc pkcVar3, eu3 eu3Var, lz3 lz3Var, sga sgaVar, vt4 vt4Var, ut3 ut3Var) {
        super(1);
        this.L = tkcVar;
        this.M = pkcVar;
        this.N = pkcVar2;
        this.O = pkcVar3;
        this.P = eu3Var;
        this.Q = lz3Var;
        this.R = sgaVar;
        this.S = vt4Var;
        this.T = ut3Var;
        this.U = -9223372034707292160L;
        y02.b(0, 0, 0, 0, 15);
        this.W = new cu3(this, 0);
        this.X = new cu3(this, 1);
    }

    public final dc J1() {
        if (this.L.f().c(st3.a, st3.b)) {
            qa1 qa1Var = this.P.a.c;
            if (qa1Var != null) {
                return qa1Var.a;
            }
            qa1 qa1Var2 = this.Q.a.c;
            if (qa1Var2 != null) {
                return qa1Var2.a;
            }
            return null;
        }
        qa1 qa1Var3 = this.Q.a.c;
        if (qa1Var3 != null) {
            return qa1Var3.a;
        }
        qa1 qa1Var4 = this.P.a.c;
        if (qa1Var4 != null) {
            return qa1Var4.a;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.x06, defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        long j2;
        okc okcVar;
        okc okcVar2;
        ckc ckcVar;
        ckc ckcVar2;
        sga sgaVar;
        okc okcVar3;
        long j3;
        okc okcVar4;
        long j4;
        long j5;
        long j6;
        gs gsVar;
        long j7;
        long j8;
        okc okcVar5;
        Object obj;
        float f;
        float f2;
        ckc ckcVar3;
        Float f3;
        fs fsVar;
        float f4;
        Float f5;
        if (this.L.a.z() == this.L.d.getValue()) {
            this.V = null;
        } else if (this.V == null) {
            dc J1 = J1();
            if (J1 == null) {
                J1 = kh5.a;
            }
            this.V = J1;
        }
        boolean I0 = e37Var.I0();
        ls3 ls3Var = ls3.a;
        if (I0) {
            mw8 M = w27Var.M(j);
            long j9 = (M.a << 32) | (M.b & 4294967295L);
            this.U = j9;
            return e37Var.q0((int) (j9 >> 32), (int) (j9 & 4294967295L), ls3Var, new dg(M, 3));
        } else if (((Boolean) this.S.invoke()).booleanValue()) {
            ut3 ut3Var = this.T;
            pkc pkcVar = ut3Var.a;
            sga sgaVar2 = ut3Var.b;
            pkc pkcVar2 = ut3Var.c;
            tkc tkcVar = ut3Var.d;
            eu3 eu3Var = ut3Var.e;
            ukc ukcVar = eu3Var.a;
            lz3 lz3Var = ut3Var.f;
            pkc pkcVar3 = ut3Var.g;
            if (pkcVar != null) {
                wt3 wt3Var = new wt3(eu3Var, lz3Var, 0);
                if (sgaVar2.a()) {
                    j2 = 4294967295L;
                    f5 = Float.valueOf(sgaVar2.f);
                } else {
                    j2 = 4294967295L;
                    f5 = null;
                }
                okcVar = pkcVar.a(wt3Var, f5, null, new xt3(eu3Var, lz3Var, sgaVar2, 0));
            } else {
                j2 = 4294967295L;
                okcVar = null;
            }
            if (pkcVar2 != null) {
                wt3 wt3Var2 = new wt3(eu3Var, lz3Var, 1);
                if (sgaVar2.a()) {
                    f3 = Float.valueOf(sgaVar2.g);
                } else {
                    f3 = null;
                }
                if (sgaVar2.a()) {
                    b5d b5dVar = sgaVar2.j;
                    if (b5dVar != null) {
                        float b = b5dVar.b();
                        Float valueOf = Float.valueOf(b);
                        if (Float.isNaN(b)) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            f4 = valueOf.floatValue();
                            fsVar = new fs(f4);
                        }
                    }
                    f4 = nae.e;
                    fsVar = new fs(f4);
                } else {
                    fsVar = null;
                }
                okcVar2 = pkcVar2.a(wt3Var2, f3, fsVar, new xt3(eu3Var, lz3Var, sgaVar2, 1));
            } else {
                okcVar2 = null;
            }
            if (tkcVar.a.z() == st3.a) {
                iz9 iz9Var = ukcVar.d;
                if (iz9Var != null) {
                    ckcVar = new ckc(iz9Var.b);
                } else {
                    iz9 iz9Var2 = lz3Var.a.d;
                    if (iz9Var2 != null) {
                        ckcVar = new ckc(iz9Var2.b);
                    }
                    ckcVar2 = null;
                }
                ckcVar2 = ckcVar;
            } else {
                iz9 iz9Var3 = lz3Var.a.d;
                if (iz9Var3 != null) {
                    ckcVar = new ckc(iz9Var3.b);
                } else {
                    iz9 iz9Var4 = ukcVar.d;
                    if (iz9Var4 != null) {
                        ckcVar = new ckc(iz9Var4.b);
                    }
                    ckcVar2 = null;
                }
                ckcVar2 = ckcVar;
            }
            if (pkcVar3 != null) {
                vt3 vt3Var = vt3.d;
                if (sgaVar2.a()) {
                    ckcVar3 = new ckc(sgaVar2.h);
                } else {
                    ckcVar3 = null;
                }
                sgaVar = sgaVar2;
                okcVar3 = pkcVar3.a(vt3Var, ckcVar3, null, new kj3(ckcVar2, eu3Var, lz3Var, sgaVar2, 3));
            } else {
                sgaVar = sgaVar2;
                okcVar3 = null;
            }
            kj3 kj3Var = new kj3(sgaVar, okcVar, okcVar2, okcVar3, 2);
            mw8 M2 = w27Var.M(j);
            long j10 = (M2.b & j2) | (M2.a << 32);
            if (c16.q(this.U)) {
                j3 = this.U;
            } else {
                j3 = j10;
            }
            pkc pkcVar4 = this.M;
            if (pkcVar4 != null) {
                okcVar4 = pkcVar4.a(this.W, null, null, new bu3(this, j3, 0));
            } else {
                okcVar4 = null;
            }
            if (okcVar4 != null) {
                j4 = ((zy5) okcVar4.getValue()).a;
            } else {
                j4 = j10;
            }
            long j11 = j3;
            long d = y02.d(j, j4);
            pkc pkcVar5 = this.N;
            if (pkcVar5 != null) {
                j5 = j11;
                j6 = 0;
                gsVar = null;
                j7 = ((py5) pkcVar5.a(vt3.e, null, null, new bu3(this, j5, 2)).getValue()).a;
            } else {
                j5 = j11;
                j6 = 0;
                gsVar = null;
                j7 = 0;
            }
            pkc pkcVar6 = this.O;
            if (pkcVar6 != null) {
                sga sgaVar3 = this.R;
                if (sgaVar3.a()) {
                    j8 = j7;
                    obj = new py5(sgaVar3.i);
                } else {
                    j8 = j7;
                    obj = gsVar;
                }
                gs gsVar2 = gsVar;
                if (this.R.a()) {
                    float b2 = z4d.b(j6);
                    Float valueOf2 = Float.valueOf(b2);
                    if (Float.isNaN(b2)) {
                        valueOf2 = gsVar;
                    }
                    if (valueOf2 != null) {
                        f = valueOf2.floatValue();
                    } else {
                        f = nae.e;
                    }
                    float c = z4d.c(j6);
                    Float valueOf3 = Float.valueOf(c);
                    Float f6 = gsVar;
                    if (!Float.isNaN(c)) {
                        f6 = valueOf3;
                    }
                    if (f6 != null) {
                        f2 = f6.floatValue();
                    } else {
                        f2 = nae.e;
                    }
                    gsVar2 = new gs(f, f2);
                }
                okcVar5 = pkcVar6.a(this.X, obj, gsVar2, new bu3(this, j5, 1));
            } else {
                j8 = j7;
                okcVar5 = gsVar;
            }
            return e37Var.q0((int) (d >> 32), (int) (d & j2), ls3Var, new au3(this, okcVar5, j10, j5, d, M2, j8, kj3Var));
        } else {
            mw8 M3 = w27Var.M(j);
            return e37Var.q0(M3.a, M3.b, ls3Var, new dg(M3, 4));
        }
    }

    @Override // defpackage.mq7
    public final void z1() {
        this.U = -9223372034707292160L;
    }
}
