package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: btb  reason: default package */
/* loaded from: classes.dex */
public final class btb extends aab implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gtb b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ btb(gtb gtbVar, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.b = gtbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        gtb gtbVar = this.b;
        switch (i) {
            case 0:
                return new btb(gtbVar, m42Var, 0);
            case 1:
                return new btb(gtbVar, m42Var, 1);
            case 2:
                return new btb(gtbVar, m42Var, 2);
            default:
                return new btb(gtbVar, m42Var, 3);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                ((btb) create(m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((btb) create(m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((btb) create(m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((btb) create(m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        gtb gtbVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                gtbVar.B = false;
                return pvcVar;
            case 1:
                hre.r(obj);
                gtbVar.f();
                return pvcVar;
            case 2:
                hre.r(obj);
                gtbVar.d(gtbVar.B);
                return pvcVar;
            default:
                hre.r(obj);
                gtbVar.p();
                return pvcVar;
        }
    }
}
