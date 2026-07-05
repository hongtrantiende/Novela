package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ztb  reason: default package */
/* loaded from: classes.dex */
public final class ztb extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ytb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ztb(ytb ytbVar, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = ytbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        ytb ytbVar = this.c;
        switch (i) {
            case 0:
                return new ztb(ytbVar, m42Var, 0);
            case 1:
                return new ztb(ytbVar, m42Var, 1);
            default:
                return new ztb(ytbVar, m42Var, 2);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((ztb) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ztb) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ztb) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ytb ytbVar = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                ytbVar.f(this);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
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
                boolean booleanValue = ((Boolean) ytbVar.u.getValue()).booleanValue();
                this.b = 1;
                ytbVar.e(booleanValue, this);
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (ytbVar.s(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
