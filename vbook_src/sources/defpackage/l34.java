package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l34  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class l34 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l34(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean h;
        int i;
        boolean z2;
        int i2 = this.a;
        lh9 lh9Var = ax1.a;
        boolean z3 = this.b;
        pvc pvcVar = pvc.a;
        boolean z4 = true;
        Object obj4 = this.c;
        switch (i2) {
            case 0:
                aw7 aw7Var = (aw7) obj4;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((hv9) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ar5 c = rp5.c((wk3) ok3.a0.getValue(), rv4Var, 0);
                    Object P = rv4Var.P();
                    if (P == lh9Var) {
                        P = new cd1(15);
                        rv4Var.o0(P);
                    }
                    kwe.d(c, null, 0L, (vt4) P, rv4Var, 3072, 6);
                    ar5 c2 = rp5.c((wk3) jk3.s.getValue(), rv4Var, 0);
                    Object P2 = rv4Var.P();
                    if (P2 == lh9Var) {
                        P2 = new cd1(15);
                        rv4Var.o0(P2);
                    }
                    kwe.d(c2, null, 0L, (vt4) P2, rv4Var, 3072, 6);
                    if (z3) {
                        rv4Var.e0(-553050260);
                        ar5 c3 = rp5.c((wk3) ok3.m0.getValue(), rv4Var, 0);
                        boolean f = rv4Var.f(aw7Var);
                        Object P3 = rv4Var.P();
                        if (f || P3 == lh9Var) {
                            P3 = new ea3(aw7Var, 21);
                            rv4Var.o0(P3);
                        }
                        kwe.d(c3, null, 0L, (vt4) P3, rv4Var, 0, 6);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-552819620);
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                gpa gpaVar = (gpa) obj4;
                wpa wpaVar = (wpa) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                wpaVar.getClass();
                if ((intValue2 & 6) == 0) {
                    if ((intValue2 & 8) == 0) {
                        h = rv4Var2.f(wpaVar);
                    } else {
                        h = rv4Var2.h(wpaVar);
                    }
                    if (h) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 19) == 18) {
                    z4 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z4)) {
                    kpa kpaVar = kpa.a;
                    nq7 h2 = pna.h(kq7.a, 12.0f);
                    Object P4 = rv4Var2.P();
                    if (P4 == lh9Var) {
                        P4 = new zy9(29);
                        rv4Var2.o0(P4);
                    }
                    kpaVar.a(wpaVar, h2, this.b, gpaVar, (lu4) P4, null, 2.0f, nae.e, rv4Var2, 102260792 | (intValue2 & 14), 160);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                w43 w43Var = (w43) obj4;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var3.U(intValue3 & 1, z2)) {
                    dye.a(jce.E(-1384754819, new jhc(z3, w43Var, 0), rv4Var3), rv4Var3, 6);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
