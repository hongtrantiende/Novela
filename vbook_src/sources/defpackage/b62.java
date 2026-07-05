package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b62  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class b62 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ b62(qq0 qq0Var, boolean z, xt4 xt4Var, vt4 vt4Var, wza wzaVar, int i) {
        this.a = 11;
        this.e = qq0Var;
        this.b = z;
        this.c = xt4Var;
        this.d = vt4Var;
        this.f = wzaVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        List list;
        int i;
        int g;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                i62.a((vt4) obj6, (rk9) obj5, (xt4) obj3, this.b, (xt4) obj4, (rv4) obj, xoe.p(7));
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                vqe.f(this.b, (l54) obj6, (cz7) obj5, (nq7) obj4, (xt4) obj3, (rv4) obj, xoe.p(3073));
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                jue.v(this.b, (String) obj6, (String) obj5, (xt4) obj3, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 3:
                ((Integer) obj2).getClass();
                c16.e(this.b, (mv) obj6, (String) obj5, (xt4) obj3, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 4:
                ((Integer) obj2).getClass();
                gae.b(this.b, (String) obj6, (xeb) obj5, (xt4) obj3, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 5:
                ((Integer) obj2).getClass();
                rae.b(this.b, (String) obj6, (cs9) obj5, (xt4) obj3, (xt4) obj4, (rv4) obj, xoe.p(3073));
                return pvcVar;
            case 6:
                ((Integer) obj2).getClass();
                cbe.b(this.b, (gq0) obj5, (xt4) obj3, (xt4) obj4, (vt4) obj6, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 7:
                ((Integer) obj2).getClass();
                pbe.a(this.b, (xt4) obj3, (vt4) obj6, (vt4) obj5, (vt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 8:
                ((Integer) obj2).getClass();
                ube.d(this.b, (List) obj6, (List) obj5, (xt4) obj3, (xt4) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 9:
                wzc wzcVar = (wzc) obj6;
                List list2 = (List) obj5;
                aw7 aw7Var = (aw7) obj4;
                xt4 xt4Var = (xt4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    String str = (String) aw7Var.getValue();
                    if (list2.isEmpty()) {
                        list = wzcVar.h;
                    } else {
                        list = list2;
                    }
                    boolean f = rv4Var.f(aw7Var);
                    Object P = rv4Var.P();
                    lh9 lh9Var = ax1.a;
                    if (f || P == lh9Var) {
                        P = new qo7(aw7Var, 6);
                        rv4Var.o0(P);
                    }
                    xt4 xt4Var2 = (xt4) P;
                    boolean f2 = rv4Var.f(xt4Var) | rv4Var.h(list2);
                    Object P2 = rv4Var.P();
                    if (f2 || P2 == lh9Var) {
                        P2 = new mm7(6, xt4Var, list2);
                        rv4Var.o0(P2);
                    }
                    p1d.e(wzcVar, str, list, this.b, xt4Var2, (vt4) P2, null, rv4Var, 8);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 10:
                ((Integer) obj2).getClass();
                p1d.c((wzc) obj6, this.b, (xt4) obj3, (xt4) obj4, (xt4) obj5, (rv4) obj, xoe.p(9));
                return pvcVar;
            case 11:
                ((Integer) obj2).getClass();
                owe.a((qq0) obj5, this.b, (xt4) obj3, (vt4) obj6, (wza) obj4, (rv4) obj, xoe.p(1));
                return pvcVar;
            case 12:
                ((Integer) obj2).getClass();
                iue.w((xy4) obj6, (lid) obj5, (rq9) obj3, (String) obj4, this.b, (rv4) obj, xoe.p(3073));
                return pvcVar;
            case 13:
                yl9 yl9Var = (yl9) obj6;
                ytb ytbVar = (ytb) obj5;
                h35 h35Var = (h35) obj3;
                yl9 yl9Var2 = (yl9) obj4;
                z09 z09Var = (z09) obj;
                yl9Var.a = y78.j(yl9Var.a, ((y78) obj2).a);
                hvb hvbVar = ytbVar.b;
                mkc mkcVar = ytbVar.a;
                fvb c = hvbVar.c();
                if (c != null) {
                    it7 it7Var = c.b;
                    ytbVar.z(h35Var, y78.j(yl9Var2.a, yl9Var.a));
                    boolean z2 = this.b;
                    if (z2) {
                        i = it7Var.g(ytbVar.n());
                    } else {
                        long j = mkcVar.f().e;
                        int i3 = fxb.c;
                        i = (int) (j >> 32);
                    }
                    int i4 = i;
                    if (z2) {
                        long j2 = mkcVar.f().e;
                        int i5 = fxb.c;
                        g = (int) (j2 & 4294967295L);
                    } else {
                        g = it7Var.g(ytbVar.n());
                    }
                    int i6 = g;
                    long j3 = mkcVar.f().e;
                    long A = ytbVar.A(mkcVar.f(), i4, i6, z2, abf.L, false, false, new t35(9));
                    if (fxb.d(j3) || !fxb.d(A)) {
                        mkcVar.m(A);
                    }
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                rgc.p((w43) obj6, (List) obj5, this.b, (nq7) obj4, (xt4) obj3, (rv4) obj, xoe.p(3081));
                return pvcVar;
        }
    }

    public /* synthetic */ b62(w43 w43Var, List list, boolean z, nq7 nq7Var, xt4 xt4Var, int i) {
        this.a = 14;
        this.d = w43Var;
        this.e = list;
        this.b = z;
        this.f = nq7Var;
        this.c = xt4Var;
    }

    public /* synthetic */ b62(vt4 vt4Var, rk9 rk9Var, xt4 xt4Var, boolean z, xt4 xt4Var2, int i) {
        this.a = 0;
        this.d = vt4Var;
        this.e = rk9Var;
        this.c = xt4Var;
        this.b = z;
        this.f = xt4Var2;
    }

    public /* synthetic */ b62(xy4 xy4Var, lid lidVar, rq9 rq9Var, String str, boolean z, int i) {
        this.a = 12;
        this.d = xy4Var;
        this.e = lidVar;
        this.c = rq9Var;
        this.f = str;
        this.b = z;
    }

    public /* synthetic */ b62(h35 h35Var, yl9 yl9Var, yl9 yl9Var2, ytb ytbVar, boolean z) {
        this.a = 13;
        this.d = yl9Var;
        this.e = ytbVar;
        this.c = h35Var;
        this.f = yl9Var2;
        this.b = z;
    }

    public /* synthetic */ b62(wzc wzcVar, List list, boolean z, aw7 aw7Var, xt4 xt4Var) {
        this.a = 9;
        this.d = wzcVar;
        this.e = list;
        this.b = z;
        this.f = aw7Var;
        this.c = xt4Var;
    }

    public /* synthetic */ b62(wzc wzcVar, boolean z, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, int i) {
        this.a = 10;
        this.d = wzcVar;
        this.b = z;
        this.c = xt4Var;
        this.f = xt4Var2;
        this.e = xt4Var3;
    }

    public /* synthetic */ b62(boolean z, gq0 gq0Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, int i) {
        this.a = 6;
        this.b = z;
        this.e = gq0Var;
        this.c = xt4Var;
        this.f = xt4Var2;
        this.d = vt4Var;
    }

    public /* synthetic */ b62(boolean z, l54 l54Var, cz7 cz7Var, nq7 nq7Var, xt4 xt4Var, int i) {
        this.a = 1;
        this.b = z;
        this.d = l54Var;
        this.e = cz7Var;
        this.f = nq7Var;
        this.c = xt4Var;
    }

    public /* synthetic */ b62(boolean z, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, int i) {
        this.a = 7;
        this.b = z;
        this.c = xt4Var;
        this.d = vt4Var;
        this.e = vt4Var2;
        this.f = vt4Var3;
    }

    public /* synthetic */ b62(boolean z, Object obj, Object obj2, xt4 xt4Var, xt4 xt4Var2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.c = xt4Var;
        this.f = xt4Var2;
    }
}
