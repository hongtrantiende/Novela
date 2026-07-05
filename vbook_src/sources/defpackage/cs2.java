package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cs2  reason: default package */
/* loaded from: classes3.dex */
public final class cs2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ es2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs2(es2 es2Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = es2Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        es2 es2Var = this.b;
        switch (i) {
            case 0:
                return new cs2(es2Var, m42Var, 0);
            case 1:
                return new cs2(es2Var, m42Var, 1);
            case 2:
                return new cs2(es2Var, m42Var, 2);
            default:
                return new cs2(es2Var, m42Var, 3);
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
                ((cs2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((cs2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((cs2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((cs2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        es2 es2Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                es2Var.h(es2Var.f, qr2.a);
                return pvcVar;
            case 1:
                hre.r(obj);
                es2Var.h(es2Var.f, rr2.a);
                return pvcVar;
            case 2:
                hre.r(obj);
                es2Var.h(es2Var.f, sr2.a);
                return pvcVar;
            default:
                hre.r(obj);
                es2Var.h(es2Var.f, tr2.a);
                return pvcVar;
        }
    }
}
