package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qe1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qe1 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qe1(int i, Object obj, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean h;
        int i = this.a;
        int i2 = 4;
        kq7 kq7Var = kq7.a;
        float f = nae.e;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        int i3 = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                vt4 vt4Var = (vt4) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((qr) obj).getClass();
                if ((intValue & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    ctd.b(jce.E(-1531886357, new zj7(i3, 1), rv4Var), null, jce.E(2099088621, new oq3(2, vt4Var), rv4Var), rv4Var, 390);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                tu1 tu1Var = (tu1) obj4;
                xg6 xg6Var = (xg6) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    if (!rv4Var2.f(xg6Var)) {
                        i2 = 2;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    tu1Var.h(xg6Var, Integer.valueOf(i3), rv4Var2, Integer.valueOf(intValue2 & 14));
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                ora oraVar = (ora) obj4;
                List list = (List) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                list.getClass();
                if ((intValue3 & 6) == 0) {
                    if ((intValue3 & 8) == 0) {
                        h = rv4Var3.f(list);
                    } else {
                        h = rv4Var3.h(list);
                    }
                    if (!h) {
                        i2 = 2;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var3.U(intValue3 & 1, z)) {
                    kjb kjbVar = (kjb) list.get(i3);
                    float f2 = ((rg3) oraVar.get(i3)).a;
                    arc arcVar = d3a.a;
                    kjbVar.getClass();
                    zw1 zw1Var = new zw1(new tl3(f2, 2, kjbVar));
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var3.T);
                    xt8 l = rv4Var3.l();
                    nq7 p = lye.p(rv4Var3, zw1Var);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var3.i0();
                    if (rv4Var3.S) {
                        rv4Var3.k(zx1Var);
                    } else {
                        rv4Var3.r0();
                    }
                    jce.F(qw1.f, rv4Var3, d);
                    jce.F(qw1.e, rv4Var3, l);
                    jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var3);
                    jce.F(qw1.d, rv4Var3, p);
                    tza tzaVar = j27.a;
                    fu0.a(st0.d(pna.h(pna.f(kq7Var, 1.0f), 30.0f), 1.0f, rm1.g(((h27) rv4Var3.j(tzaVar)).a, 4.0f), v72.d(((h27) rv4Var3.j(tzaVar)).c.b, null, null, new sg3(nae.e), new sg3(nae.e), 3)), rv4Var3, 0);
                    fu0.a(nmd.v(pna.h(zbe.C(pna.f(kq7Var, 1.0f), 1.0f, 29.0f, 1.0f, nae.e, 8), 2.0f), rm1.g(((h27) rv4Var3.j(tzaVar)).a, 1.0f), lre.g), rv4Var3, 0);
                    rv4Var3.q(true);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                g58 g58Var = (g58) obj4;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z2 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z2)) {
                    nt6 nt6Var = g58Var.a;
                    boolean h2 = rv4Var4.h(g58Var);
                    Object P = rv4Var4.P();
                    lh9 lh9Var = ax1.a;
                    if (h2 || P == lh9Var) {
                        P = new qq4(g58Var, null, 28);
                        rv4Var4.o0(P);
                    }
                    lu4 lu4Var = (lu4) P;
                    Object P2 = rv4Var4.P();
                    if (P2 == lh9Var) {
                        P2 = yae.z("");
                        rv4Var4.o0(P2);
                    }
                    aw7 aw7Var = (aw7) P2;
                    boolean h3 = rv4Var4.h(lu4Var);
                    Object P3 = rv4Var4.P();
                    if (h3 || P3 == lh9Var) {
                        P3 = new mra(lu4Var, aw7Var, null, 1);
                        rv4Var4.o0(P3);
                    }
                    yte.g((lu4) P3, rv4Var4, nt6Var);
                    String str = (String) aw7Var.getValue();
                    tza tzaVar2 = j27.a;
                    oyb oybVar = ((h27) rv4Var4.j(tzaVar2)).b.g;
                    long j = ((h27) rv4Var4.j(tzaVar2)).a.a;
                    nq7 f3 = pna.f(kq7Var, 1.0f);
                    if (i3 != 0) {
                        f = 8.0f;
                    }
                    cvb.c(str, zbe.C(f3, nae.e, f, nae.e, 6.0f, 5), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var4, 0, 0, 131064);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ qe1(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }
}
