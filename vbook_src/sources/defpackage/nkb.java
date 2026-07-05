package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nkb  reason: default package */
/* loaded from: classes.dex */
public final class nkb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j59 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nkb(j59 j59Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = j59Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        j59 j59Var = this.b;
        switch (i) {
            case 0:
                return new nkb(j59Var, m42Var, 0);
            case 1:
                return new nkb(j59Var, m42Var, 1);
            case 2:
                return new nkb(j59Var, m42Var, 2);
            case 3:
                return new nkb(j59Var, m42Var, 3);
            case 4:
                return new nkb(j59Var, m42Var, 4);
            case 5:
                return new nkb(j59Var, m42Var, 5);
            case 6:
                return new nkb(j59Var, m42Var, 6);
            default:
                return new nkb(j59Var, m42Var, 7);
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
                ((nkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((nkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((nkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((nkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((nkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                ((nkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 6:
                ((nkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((nkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        j59 j59Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                j59Var.a();
                return pvcVar;
            case 1:
                hre.r(obj);
                j59Var.g();
                return pvcVar;
            case 2:
                hre.r(obj);
                j59Var.g();
                return pvcVar;
            case 3:
                hre.r(obj);
                j59Var.a();
                return pvcVar;
            case 4:
                hre.r(obj);
                j59Var.g();
                return pvcVar;
            case 5:
                hre.r(obj);
                j59Var.g();
                return pvcVar;
            case 6:
                hre.r(obj);
                j59Var.a();
                return pvcVar;
            default:
                hre.r(obj);
                j59Var.g();
                return pvcVar;
        }
    }
}
