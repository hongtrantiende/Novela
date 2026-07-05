package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xk7  reason: default package */
/* loaded from: classes3.dex */
public final class xk7 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ float b;
    public final /* synthetic */ xt4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xk7(int i, m42 m42Var, xt4 xt4Var) {
        super(3, m42Var);
        this.a = i;
        this.c = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        m82 m82Var = (m82) obj;
        float floatValue = ((Number) obj2).floatValue();
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                xk7 xk7Var = new xk7(0, m42Var, xt4Var);
                xk7Var.b = floatValue;
                xk7Var.invokeSuspend(pvcVar);
                return pvcVar;
            default:
                xk7 xk7Var2 = new xk7(1, m42Var, xt4Var);
                xk7Var2.b = floatValue;
                xk7Var2.invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                xt4Var.invoke(new Float(f));
                return pvcVar;
            default:
                hre.r(obj);
                xt4Var.invoke(new Float(f));
                return pvcVar;
        }
    }
}
