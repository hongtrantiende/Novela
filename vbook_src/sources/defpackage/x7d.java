package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x7d  reason: default package */
/* loaded from: classes.dex */
public final class x7d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ aw7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7d(xt4 xt4Var, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = xt4Var;
        this.c = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                return new x7d(xt4Var, aw7Var, m42Var, 0);
            default:
                return new x7d(xt4Var, aw7Var, m42Var, 1);
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
                ((x7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((x7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                Boolean bool = (Boolean) aw7Var.getValue();
                bool.booleanValue();
                xt4Var.invoke(bool);
                return pvcVar;
            default:
                hre.r(obj);
                Boolean bool2 = (Boolean) aw7Var.getValue();
                bool2.booleanValue();
                xt4Var.invoke(bool2);
                return pvcVar;
        }
    }
}
