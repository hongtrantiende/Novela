package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ql7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ql7 implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ hu4 F;
    public final /* synthetic */ hu4 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ xt4 f;

    public /* synthetic */ ql7(wqc wqcVar, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7, int i) {
        this.D = wqcVar;
        this.E = rh8Var;
        this.H = nq7Var;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = xt4Var3;
        this.e = xt4Var4;
        this.f = xt4Var5;
        this.F = xt4Var6;
        this.G = xt4Var7;
        this.C = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        int i2 = this.C;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.G;
        hu4 hu4Var2 = this.F;
        Object obj3 = this.H;
        Object obj4 = this.E;
        Object obj5 = this.D;
        switch (i) {
            case 0:
                s6d s6dVar = (s6d) obj5;
                List list = (List) obj4;
                xt4 xt4Var = (xt4) hu4Var2;
                xt4 xt4Var2 = (xt4) hu4Var;
                xt4 xt4Var3 = (xt4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ze4 ze4Var = pna.c;
                    nq7 x = zbe.x(ze4Var, mwe.f(13, rv4Var, false));
                    xn1 a = wn1.a(lz.c, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, x);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    xl7.e(0, rv4Var);
                    xl7.d(s6dVar, list, this.C, rte.C(ze4Var, rte.u(rv4Var), 14), this.b, this.c, this.d, this.e, this.f, xt4Var, xt4Var2, xt4Var3, rv4Var, 0);
                    rv4Var.q(true);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                ube.l((String) obj5, (nq7) obj4, (vt4) hu4Var2, (lu4) hu4Var, this.b, this.c, this.d, this.e, this.f, (vt4) obj3, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                q0f.i((wqc) obj5, (rh8) obj4, (nq7) obj3, this.b, this.c, this.d, this.e, this.f, (xt4) hu4Var2, (xt4) hu4Var, (rv4) obj, xoe.p(i2 | 1));
                return pvcVar;
        }
    }

    public /* synthetic */ ql7(s6d s6dVar, List list, int i, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7, xt4 xt4Var8) {
        this.D = s6dVar;
        this.E = list;
        this.C = i;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = xt4Var3;
        this.e = xt4Var4;
        this.f = xt4Var5;
        this.F = xt4Var6;
        this.G = xt4Var7;
        this.H = xt4Var8;
    }

    public /* synthetic */ ql7(String str, nq7 nq7Var, vt4 vt4Var, lu4 lu4Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, vt4 vt4Var2, int i) {
        this.D = str;
        this.E = nq7Var;
        this.F = vt4Var;
        this.G = lu4Var;
        this.b = xt4Var;
        this.c = xt4Var2;
        this.d = xt4Var3;
        this.e = xt4Var4;
        this.f = xt4Var5;
        this.H = vt4Var2;
        this.C = i;
    }
}
