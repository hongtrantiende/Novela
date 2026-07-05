package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cq0  reason: default package */
/* loaded from: classes3.dex */
public final class cq0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;
    public final /* synthetic */ h34 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cq0(xt4 xt4Var, h34 h34Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = xt4Var;
        this.c = h34Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        h34 h34Var = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                return new cq0(xt4Var, h34Var, m42Var, 0);
            default:
                return new cq0(xt4Var, h34Var, m42Var, 1);
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
                ((cq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((cq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        h34 h34Var = this.c;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                xt4Var.invoke(h34Var.e.a);
                return pvcVar;
            default:
                hre.r(obj);
                xt4Var.invoke(h34Var.e.a);
                return pvcVar;
        }
    }
}
