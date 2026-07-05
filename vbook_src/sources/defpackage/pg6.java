package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pg6  reason: default package */
/* loaded from: classes.dex */
public final class pg6 extends aab implements lu4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ qg6 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg6(qg6 qg6Var, int i, int i2, m42 m42Var) {
        super(2, m42Var);
        this.c = qg6Var;
        this.b = i;
        this.d = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        int i2 = this.d;
        qg6 qg6Var = this.c;
        switch (i) {
            case 0:
                return new pg6(qg6Var, this.b, i2, m42Var);
            default:
                return new pg6(qg6Var, i2, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((pg6) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((pg6) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        qg6 qg6Var = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                qg6Var.m(this.b, i2, true);
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object f = qg6.f(qg6Var, i2, this);
                n82 n82Var = n82.a;
                if (f == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg6(qg6 qg6Var, int i, m42 m42Var) {
        super(2, m42Var);
        this.c = qg6Var;
        this.d = i;
    }
}
