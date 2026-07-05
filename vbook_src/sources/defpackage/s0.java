package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s0  reason: default package */
/* loaded from: classes.dex */
public final class s0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(t0 t0Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = t0Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        t0 t0Var = this.b;
        switch (i) {
            case 0:
                return new s0(t0Var, m42Var, 0);
            default:
                return new s0(t0Var, m42Var, 1);
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
                ((s0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((s0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, ga5] */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        t0 t0Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                if (t0Var.Z == null) {
                    ?? obj2 = new Object();
                    yu7 yu7Var = t0Var.M;
                    if (yu7Var != null) {
                        z87.v(t0Var.v1(), null, null, new l0(yu7Var, obj2, null, 0), 3);
                    }
                    t0Var.Z = obj2;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ga5 ga5Var = t0Var.Z;
                if (ga5Var != null) {
                    ha5 ha5Var = new ha5(ga5Var);
                    yu7 yu7Var2 = t0Var.M;
                    if (yu7Var2 != null) {
                        z87.v(t0Var.v1(), null, null, new l0(yu7Var2, ha5Var, null, 1), 3);
                    }
                    t0Var.Z = null;
                }
                return pvcVar;
        }
    }
}
