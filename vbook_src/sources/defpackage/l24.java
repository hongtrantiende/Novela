package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l24  reason: default package */
/* loaded from: classes3.dex */
public final class l24 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zm4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l24(zm4 zm4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = zm4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new l24(this.b, m42Var, 0);
            case 1:
                return new l24(this.b, m42Var, 1);
            case 2:
                return new l24(this.b, m42Var, 2);
            case 3:
                return new l24(this.b, m42Var, 3);
            case 4:
                return new l24(this.b, m42Var, 4);
            case 5:
                return new l24(this.b, m42Var, 5);
            case 6:
                return new l24(this.b, m42Var, 6);
            case 7:
                return new l24(this.b, m42Var, 7);
            case 8:
                return new l24(this.b, m42Var, 8);
            default:
                return new l24(this.b, m42Var, 9);
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
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 6:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 7:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 8:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((l24) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        zm4 zm4Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            case 1:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            case 2:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            case 3:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            case 4:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            case 5:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            case 6:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            case 7:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            case 8:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
            default:
                hre.r(obj);
                zm4.a(zm4Var);
                return pvcVar;
        }
    }
}
