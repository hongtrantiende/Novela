package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: srb  reason: default package */
/* loaded from: classes.dex */
public final class srb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ytb c;
    public final /* synthetic */ d19 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srb(d19 d19Var, ytb ytbVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.d = d19Var;
        this.c = ytbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        d19 d19Var = this.d;
        ytb ytbVar = this.c;
        switch (i) {
            case 0:
                return new srb(ytbVar, d19Var, m42Var, 0);
            case 1:
                return new srb(ytbVar, d19Var, m42Var, 1);
            case 2:
                return new srb(ytbVar, d19Var, m42Var, 2);
            case 3:
                return new srb(d19Var, ytbVar, m42Var);
            default:
                return new srb(ytbVar, d19Var, m42Var, 4);
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
                return ((srb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((srb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((srb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((srb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((srb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        d19 d19Var = this.d;
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
                if (ytbVar.i(d19Var, this) == n82Var) {
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
                this.b = 1;
                if (ytbVar.i(d19Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
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
                if (ytb.a(ytbVar, d19Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                cj0 cj0Var = new cj0(ytbVar, 1);
                this.b = 1;
                if (ukb.e(this.d, null, null, null, cj0Var, this, 7) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (ytbVar.i(d19Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ srb(ytb ytbVar, d19 d19Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ytbVar;
        this.d = d19Var;
    }
}
