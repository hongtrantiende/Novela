package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fib  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class fib implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rq9 b;
    public final /* synthetic */ rq9 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ rq9 e;
    public final /* synthetic */ rq9 f;

    public /* synthetic */ fib(rq9 rq9Var, rq9 rq9Var2, boolean z, rq9 rq9Var3, rq9 rq9Var4, int i) {
        this.a = i;
        this.b = rq9Var;
        this.c = rq9Var2;
        this.d = z;
        this.e = rq9Var3;
        this.f = rq9Var4;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        vy4 vy4Var = vy4.a;
        boolean z3 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    iue.y(s9e.t(s9e.s(vy4Var), 44.0f), this.d, this.b, this.c, 10.0f, 24.0f, rv4Var, 221184, 0);
                    ube.p(s9e.t(vy4Var, 8.0f), rv4Var, 0);
                    iue.v(s9e.t(s9e.s(vy4Var), 44.0f), this.e, this.f, 10.0f, 24.0f, rv4Var, 27648, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    xy4 t = s9e.t(s9e.s(vy4Var), 42.0f);
                    rq9 rq9Var = this.b;
                    rq9 rq9Var2 = this.c;
                    iue.z(t, rq9Var, rq9Var2, 10.0f, 24.0f, rv4Var2, 27648, 0);
                    ube.p(s9e.t(vy4Var, 8.0f), rv4Var2, 0);
                    iue.y(s9e.t(s9e.s(vy4Var), 42.0f), this.d, this.e, this.f, 10.0f, 24.0f, rv4Var2, 221184, 0);
                    ube.p(s9e.t(vy4Var, 8.0f), rv4Var2, 0);
                    iue.v(s9e.t(s9e.s(vy4Var), 42.0f), rq9Var, rq9Var2, 10.0f, 24.0f, rv4Var2, 27648, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    kwe.b(hc2.h(s9e.s(vy4Var), 360.0f), 0, 0, jce.E(1401699610, new fib(this.b, this.c, this.d, this.e, this.f, 1), rv4Var3), rv4Var3, 3072, 6);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((yn1) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z3)) {
                    kwe.b(hc2.h(s9e.s(vy4Var), 60.0f), 0, 0, jce.E(-1932953541, new fib(this.d, this.b, this.c, this.e, this.f, 0), rv4Var4), rv4Var4, 3072, 6);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ fib(boolean z, rq9 rq9Var, rq9 rq9Var2, rq9 rq9Var3, rq9 rq9Var4, int i) {
        this.a = i;
        this.d = z;
        this.b = rq9Var;
        this.c = rq9Var2;
        this.e = rq9Var3;
        this.f = rq9Var4;
    }
}
