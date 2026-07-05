package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pf6  reason: default package */
/* loaded from: classes3.dex */
public final class pf6 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf6(int i, m42 m42Var, xt4 xt4Var) {
        super(3, m42Var);
        this.a = i;
        this.b = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.b;
        m82 m82Var = (m82) obj;
        ((Number) obj2).floatValue();
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                new pf6(0, m42Var, xt4Var).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                new pf6(1, m42Var, xt4Var).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                new pf6(2, m42Var, xt4Var).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            case 1:
                hre.r(obj);
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
            default:
                hre.r(obj);
                xt4Var.invoke(Boolean.FALSE);
                return pvcVar;
        }
    }
}
