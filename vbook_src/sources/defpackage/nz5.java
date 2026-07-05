package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nz5  reason: default package */
/* loaded from: classes3.dex */
public final class nz5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ oz5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nz5(oz5 oz5Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = oz5Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        oz5 oz5Var = this.c;
        switch (i) {
            case 0:
                nz5 nz5Var = new nz5(oz5Var, m42Var, 0);
                nz5Var.b = obj;
                return nz5Var;
            case 1:
                nz5 nz5Var2 = new nz5(oz5Var, m42Var, 1);
                nz5Var2.b = obj;
                return nz5Var2;
            default:
                nz5 nz5Var3 = new nz5(oz5Var, m42Var, 2);
                nz5Var3.b = obj;
                return nz5Var3;
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
                ((nz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((nz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((nz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        oz5 oz5Var = this.c;
        m82 m82Var = (m82) this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                z87.v(m82Var, null, null, new mz5(oz5Var, null, 0), 3);
                z87.v(m82Var, null, null, new mz5(oz5Var, null, 1), 3);
                return pvcVar;
            case 1:
                hre.r(obj);
                z87.v(m82Var, null, null, new mz5(oz5Var, null, 2), 3);
                z87.v(m82Var, null, null, new mz5(oz5Var, null, 3), 3);
                return pvcVar;
            default:
                hre.r(obj);
                z87.v(m82Var, null, null, new mz5(oz5Var, null, 4), 3);
                z87.v(m82Var, null, null, new mz5(oz5Var, null, 5), 3);
                return pvcVar;
        }
    }
}
