package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bs  reason: default package */
/* loaded from: classes.dex */
public final class bs extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bs(vt4 vt4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = vt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new bs(this.b, m42Var, 0);
            default:
                return new bs(this.b, m42Var, 1);
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
                ((bs) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((bs) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                hre.r(obj);
                return pvcVar;
            default:
                hre.r(obj);
                this.b.invoke();
                return pvcVar;
        }
    }
}
