package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rq  reason: default package */
/* loaded from: classes.dex */
public final class rq extends fb6 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ hu4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rq(Object obj, Object obj2, Object obj3, hu4 hu4Var, int i) {
        super(3);
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = hu4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean h;
        int i;
        boolean z2;
        int i2 = this.a;
        Object obj4 = this.c;
        Object obj5 = ax1.a;
        Object obj6 = this.b;
        Object obj7 = this.e;
        Object obj8 = this.d;
        switch (i2) {
            case 0:
                qr qrVar = (qr) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Number) obj3).intValue();
                ora oraVar = (ora) obj6;
                er erVar = (er) obj8;
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h = rv4Var.f(qrVar);
                    } else {
                        h = rv4Var.h(qrVar);
                    }
                    if (h) {
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
                    boolean f = rv4Var.f(oraVar) | rv4Var.h(obj4) | rv4Var.h(erVar);
                    Object P = rv4Var.P();
                    if (f || P == obj5) {
                        P = new gp(1, oraVar, obj4, erVar);
                        rv4Var.o0(P);
                    }
                    yte.b(qrVar, (xt4) P, rv4Var);
                    tv7 tv7Var = erVar.e;
                    qrVar.getClass();
                    tv7Var.n(obj4, ((rr) qrVar).b);
                    Object P2 = rv4Var.P();
                    if (P2 == obj5) {
                        P2 = new wq(qrVar);
                        rv4Var.o0(P2);
                    }
                    ((tu1) obj7).h((wq) P2, obj4, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvc.a;
            default:
                xt4 xt4Var = (xt4) obj8;
                nq7 nq7Var = (nq7) obj;
                rv4 rv4Var2 = (rv4) obj2;
                ((Number) obj3).intValue();
                Object obj9 = (vt4) obj7;
                do9 do9Var = (do9) obj6;
                nq7Var.getClass();
                rv4Var2.e0(231415144);
                rv4Var2.e0(-1020090083);
                Object P3 = rv4Var2.P();
                if (P3 == obj5) {
                    P3 = yae.z(new y78(0L));
                    rv4Var2.o0(P3);
                }
                aw7 aw7Var = (aw7) P3;
                rv4Var2.q(false);
                rv4Var2.e0(-1020087938);
                Object P4 = rv4Var2.P();
                if (P4 == obj5) {
                    P4 = yae.z(new zy5(0L));
                    rv4Var2.o0(P4);
                }
                aw7 aw7Var2 = (aw7) P4;
                rv4Var2.q(false);
                Object P5 = rv4Var2.P();
                if (P5 == obj5) {
                    Object ey1Var = new ey1(yte.s(rv4Var2));
                    rv4Var2.o0(ey1Var);
                    P5 = ey1Var;
                }
                Object obj10 = ((ey1) P5).a;
                rv4Var2.e0(-1020083824);
                Object P6 = rv4Var2.P();
                if (P6 == obj5) {
                    P6 = new jk(13, aw7Var, aw7Var2);
                    rv4Var2.o0(P6);
                }
                rv4Var2.q(false);
                nq7 y = obe.y(nq7Var, (xt4) P6);
                mo9 mo9Var = do9Var.a;
                Object obj11 = do9Var.b;
                mo9Var.getClass();
                obj11.getClass();
                if (!((Boolean) yae.q(new hg(22, obj11, mo9Var)).getValue()).booleanValue() && ((Boolean) do9Var.a.l.getValue()).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                vh3 vh3Var = (vh3) obj4;
                rv4Var2.e0(-1020069521);
                boolean h2 = rv4Var2.h(obj10) | rv4Var2.f(do9Var) | rv4Var2.f(xt4Var);
                Object P7 = rv4Var2.P();
                if (h2 || P7 == obj5) {
                    Object mkVar = new mk(obj10, xt4Var, do9Var, aw7Var, aw7Var2, 1);
                    rv4Var2.o0(mkVar);
                    P7 = mkVar;
                }
                xt4 xt4Var2 = (xt4) P7;
                rv4Var2.q(false);
                rv4Var2.e0(-1020052768);
                boolean f2 = rv4Var2.f(do9Var) | rv4Var2.f(obj9);
                Object P8 = rv4Var2.P();
                if (f2 || P8 == obj5) {
                    P8 = new hg(21, do9Var, obj9);
                    rv4Var2.o0(P8);
                }
                vt4 vt4Var = (vt4) P8;
                rv4Var2.q(false);
                rv4Var2.e0(-1020048579);
                boolean f3 = rv4Var2.f(do9Var);
                Object P9 = rv4Var2.P();
                if (f3 || P9 == obj5) {
                    P9 = new y0(do9Var, 10);
                    rv4Var2.o0(P9);
                }
                lu4 lu4Var = (lu4) P9;
                rv4Var2.q(false);
                y.getClass();
                xt4Var2.getClass();
                vt4Var.getClass();
                lu4Var.getClass();
                nq7 j = lye.j(y, new mj3(mo9Var, vt4Var, z2, vh3Var, xt4Var2, lu4Var));
                rv4Var2.q(false);
                return j;
        }
    }
}
