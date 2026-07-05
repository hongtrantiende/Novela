package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ko9  reason: default package */
/* loaded from: classes.dex */
public final class ko9 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko9(qd6 qd6Var, rk9 rk9Var, cga cgaVar) {
        super(1);
        this.a = 5;
        this.b = qd6Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = true;
        pvc pvcVar = pvc.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                af6 af6Var = (af6) obj;
                af6Var.getClass();
                if (af6Var.getIndex() == ((af6) obj2).getIndex()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                j8a.i((l8a) obj, ((xt9) obj2).a);
                return pvcVar;
            case 2:
                ((List) obj).add((Float) ((ni6) obj2).invoke());
                return true;
            case 3:
                Throwable th = (Throwable) obj;
                ((w26) obj2).cancel(null);
                return pvcVar;
            case 4:
                t15 t15Var = (t15) obj;
                pea peaVar = (pea) obj2;
                t15Var.e(t15Var.f() * peaVar.b);
                t15Var.J0(peaVar.c);
                t15Var.w(peaVar.d);
                t15Var.u(peaVar.e);
                t15Var.y(peaVar.f);
                return pvcVar;
            case 5:
                ak3 ak3Var = (ak3) obj;
                ((qd6) obj2).a();
                return pvcVar;
            case 6:
                t15 t15Var2 = (t15) obj;
                rla rlaVar = (rla) obj2;
                t15Var2.v(rlaVar.K);
                t15Var2.l(rlaVar.L);
                t15Var2.q(rlaVar.M);
                t15Var2.x(nae.e);
                t15Var2.i(nae.e);
                t15Var2.e(rlaVar.N);
                t15Var2.C(nae.e);
                t15Var2.c(nae.e);
                t15Var2.h(rlaVar.O);
                t15Var2.A(rlaVar.P);
                t15Var2.Z0(rlaVar.Q);
                t15Var2.J0(rlaVar.R);
                t15Var2.w(rlaVar.S);
                t15Var2.r(null);
                t15Var2.u(rlaVar.T);
                t15Var2.y(rlaVar.U);
                t15Var2.k0(0);
                t15Var2.k(rlaVar.V);
                t15Var2.s(rlaVar.W);
                t15Var2.s1(rlaVar.X);
                return pvcVar;
            case 7:
                ((t15) obj).w(((Boolean) ((vt4) obj2).invoke()).booleanValue());
                return pvcVar;
            default:
                Throwable th2 = (Throwable) obj;
                gab gabVar = (gab) obj2;
                f61 f61Var = gabVar.c;
                if (f61Var != null) {
                    f61Var.a(th2);
                }
                gabVar.c = null;
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ko9(Object obj, int i) {
        super(1);
        this.a = i;
        this.b = obj;
    }
}
