package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fob  reason: default package */
/* loaded from: classes3.dex */
public final class fob extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5c b;
    public final /* synthetic */ aw7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fob(y5c y5cVar, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = y5cVar;
        this.c = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.c;
        y5c y5cVar = this.b;
        switch (i) {
            case 0:
                return new fob(y5cVar, aw7Var, m42Var, 0);
            default:
                return new fob(y5cVar, aw7Var, m42Var, 1);
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
                ((fob) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((fob) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        y5c y5cVar = this.b;
        aw7 aw7Var = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                if (!((Boolean) aw7Var.getValue()).booleanValue()) {
                    y5cVar.Z();
                }
                return pvcVar;
            default:
                hre.r(obj);
                if (((Boolean) aw7Var.getValue()).booleanValue()) {
                    y5cVar.getClass();
                    hk1 a = jdd.a(y5cVar);
                    sw2 sw2Var = ab3.a;
                    y5cVar.f(a, ru2.c, new i4c(5, null, y5cVar));
                }
                return pvcVar;
        }
    }
}
