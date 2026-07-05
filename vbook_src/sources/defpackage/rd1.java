package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rd1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class rd1 implements lu4 {
    public final /* synthetic */ hu4 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rd1(nq7 nq7Var, bgc bgcVar, boolean z, boolean z2, tu1 tu1Var, mu4 mu4Var, String str, mu4 mu4Var2, tu1 tu1Var2) {
        this.c = nq7Var;
        this.D = bgcVar;
        this.d = z;
        this.e = z2;
        this.E = tu1Var;
        this.F = mu4Var;
        this.b = str;
        this.f = mu4Var2;
        this.C = tu1Var2;
    }

    /* JADX WARN: Type inference failed for: r38v0, types: [java.lang.Object, qid] */
    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.C;
        Object obj3 = this.F;
        Object obj4 = this.f;
        Object obj5 = this.D;
        Object obj6 = this.c;
        Object obj7 = this.b;
        Object obj8 = this.E;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                hma.g(this.d, (String) obj7, (String) obj6, (f76) obj5, this.e, (xt4) obj8, (xt4) obj3, (vt4) obj4, (vt4) hu4Var, (rv4) obj, xoe.p(1769473));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                twe.a((String) obj7, (String) obj6, (pc4) obj5, this.d, this.e, (ng3) obj8, (nq7) obj3, (vt4) obj4, (vt4) hu4Var, (rv4) obj, xoe.p(513));
                return pvcVar;
            case 2:
                nq7 nq7Var = (nq7) obj6;
                bgc bgcVar = (bgc) obj5;
                tu1 tu1Var = (tu1) obj8;
                mu4 mu4Var = (mu4) obj3;
                String str = (String) obj7;
                mu4 mu4Var2 = (mu4) obj4;
                tu1 tu1Var2 = (tu1) hu4Var;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 A = yae.A(nq7Var, bgcVar.a(), null);
                    long j = zl1.h;
                    ?? obj9 = new Object();
                    boolean z5 = this.d;
                    mwe.d(A, jce.E(1928785825, new y0a(z5, this.e, bgcVar, tu1Var, mu4Var, str, 1), rv4Var), null, null, null, 0, j, 0L, obj9, jce.E(1060992118, new a1a(mu4Var2, z5, tu1Var2, 0), rv4Var), rv4Var, 806879280);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                xt4 xt4Var = (xt4) obj8;
                aw7 aw7Var = (aw7) obj7;
                aw7 aw7Var2 = (aw7) obj6;
                aw7 aw7Var3 = (aw7) obj5;
                aw7 aw7Var4 = (aw7) obj4;
                xt4 xt4Var2 = (xt4) obj3;
                xt4 xt4Var3 = (xt4) hu4Var;
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    gv9 a = ev9.a(lz.a, kh5.F, rv4Var2, 0);
                    int hashCode = Long.hashCode(rv4Var2.T);
                    xt8 l = rv4Var2.l();
                    nq7 p = lye.p(rv4Var2, kq7.a);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var2.i0();
                    if (rv4Var2.S) {
                        rv4Var2.k(zx1Var);
                    } else {
                        rv4Var2.r0();
                    }
                    jce.F(qw1.f, rv4Var2, a);
                    jce.F(qw1.e, rv4Var2, l);
                    jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var2);
                    jce.F(qw1.d, rv4Var2, p);
                    boolean z6 = this.d;
                    boolean z7 = this.e;
                    if (z6 && !z7) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean f = rv4Var2.f(xt4Var) | rv4Var2.f(aw7Var) | rv4Var2.f(aw7Var2) | rv4Var2.f(aw7Var3) | rv4Var2.f(aw7Var4);
                    Object P = rv4Var2.P();
                    lh9 lh9Var = ax1.a;
                    if (f || P == lh9Var) {
                        w24 w24Var = new w24(xt4Var, aw7Var, aw7Var2, aw7Var3, aw7Var4);
                        rv4Var2.o0(w24Var);
                        P = w24Var;
                    }
                    nmd.j((vt4) P, null, z3, null, null, null, jce.E(-219707031, new kd1(6, z7), rv4Var2), rv4Var2, 805306368, 506);
                    if (z6 && !z7) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean f2 = rv4Var2.f(xt4Var2) | rv4Var2.f(aw7Var) | rv4Var2.f(aw7Var2) | rv4Var2.f(aw7Var3) | rv4Var2.f(aw7Var4) | rv4Var2.f(xt4Var3);
                    Object P2 = rv4Var2.P();
                    if (f2 || P2 == lh9Var) {
                        le1 le1Var = new le1((hu4) xt4Var2, (Object) xt4Var3, aw7Var, aw7Var2, aw7Var3, aw7Var4, 8);
                        rv4Var2.o0(le1Var);
                        P2 = le1Var;
                    }
                    nmd.j((vt4) P2, null, z4, null, null, null, rae.i, rv4Var2, 805306368, 506);
                    rv4Var2.q(true);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ rd1(String str, String str2, pc4 pc4Var, boolean z, boolean z2, ng3 ng3Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, int i) {
        this.b = str;
        this.c = str2;
        this.D = pc4Var;
        this.d = z;
        this.e = z2;
        this.E = ng3Var;
        this.F = nq7Var;
        this.f = vt4Var;
        this.C = vt4Var2;
    }

    public /* synthetic */ rd1(boolean z, String str, String str2, f76 f76Var, boolean z2, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, vt4 vt4Var2, int i) {
        this.d = z;
        this.b = str;
        this.c = str2;
        this.D = f76Var;
        this.e = z2;
        this.E = xt4Var;
        this.F = xt4Var2;
        this.f = vt4Var;
        this.C = vt4Var2;
    }

    public /* synthetic */ rd1(boolean z, boolean z2, xt4 xt4Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, xt4 xt4Var2, xt4 xt4Var3) {
        this.d = z;
        this.e = z2;
        this.E = xt4Var;
        this.b = aw7Var;
        this.c = aw7Var2;
        this.D = aw7Var3;
        this.f = aw7Var4;
        this.F = xt4Var2;
        this.C = xt4Var3;
    }
}
