package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b95  reason: default package */
/* loaded from: classes3.dex */
public final class b95 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e95 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b95(e95 e95Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = e95Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        e95 e95Var = this.b;
        switch (i) {
            case 0:
                return new b95(e95Var, m42Var, 0);
            case 1:
                return new b95(e95Var, m42Var, 1);
            default:
                return new b95(e95Var, m42Var, 2);
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
                ((b95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((b95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((b95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        e95 e95Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                a4a a4aVar = e95Var.e;
                cza czaVar = e95Var.f;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, x85.a((x85) value, !((b4a) a4aVar).b(), ((b4a) a4aVar).c(), null, 9)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                hre.r(obj);
                e95Var.k();
                return pvcVar;
            default:
                hre.r(obj);
                e95Var.k();
                return pvcVar;
        }
    }
}
