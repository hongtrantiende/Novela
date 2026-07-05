package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xv2  reason: default package */
/* loaded from: classes3.dex */
public final class xv2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fw2 b;
    public final /* synthetic */ tl8 c;
    public final /* synthetic */ vyc d;
    public final /* synthetic */ xt4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xv2(fw2 fw2Var, tl8 tl8Var, vyc vycVar, xt4 xt4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = fw2Var;
        this.c = tl8Var;
        this.d = vycVar;
        this.e = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new xv2(this.b, this.c, this.d, this.e, m42Var, 0);
            default:
                return new xv2(this.b, this.c, this.d, this.e, m42Var, 1);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((xv2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((xv2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        xt4 xt4Var = this.e;
        vyc vycVar = this.d;
        tl8 tl8Var = this.c;
        fw2 fw2Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                re5 re5Var = fw2Var.a;
                gh5 gh5Var = new gh5();
                gh5Var.d(pg5.c);
                gh5Var.d = new my2(tl8Var);
                gh5Var.b(null);
                obe.C(gh5Var.a, vycVar);
                if (xt4Var != null) {
                    xt4Var.invoke(gh5Var);
                }
                return new hi5(gh5Var, re5Var);
            default:
                hre.r(obj);
                re5 re5Var2 = fw2Var.a;
                gh5 gh5Var2 = new gh5();
                gh5Var2.d(pg5.c);
                gh5Var2.d = new my2(tl8Var);
                gh5Var2.b(null);
                obe.C(gh5Var2.a, vycVar);
                if (xt4Var != null) {
                    xt4Var.invoke(gh5Var2);
                }
                return new hi5(gh5Var2, re5Var2);
        }
    }
}
