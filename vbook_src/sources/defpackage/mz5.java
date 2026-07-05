package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mz5  reason: default package */
/* loaded from: classes3.dex */
public final class mz5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ oz5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mz5(oz5 oz5Var, m42 m42Var, int i) {
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
                return new mz5(oz5Var, m42Var, 0);
            case 1:
                return new mz5(oz5Var, m42Var, 1);
            case 2:
                return new mz5(oz5Var, m42Var, 2);
            case 3:
                return new mz5(oz5Var, m42Var, 3);
            case 4:
                return new mz5(oz5Var, m42Var, 4);
            default:
                return new mz5(oz5Var, m42Var, 5);
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
                return ((mz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((mz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((mz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((mz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((mz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((mz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        oz5 oz5Var = this.c;
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
                lq lqVar = oz5Var.d;
                Float f = new Float(1.0f);
                gxa gxaVar = oz5Var.b;
                this.b = 1;
                if (lq.c(lqVar, f, gxaVar, null, null, this, 12) == n82Var) {
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
                lq lqVar2 = oz5Var.e;
                y78 y78Var = new y78(oz5Var.f);
                this.b = 1;
                if (lqVar2.g(this, y78Var) == n82Var) {
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
                lq lqVar3 = oz5Var.d;
                Float f2 = new Float((float) nae.e);
                gxa gxaVar2 = oz5Var.b;
                this.b = 1;
                if (lq.c(lqVar3, f2, gxaVar2, null, null, this, 12) == n82Var) {
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
                lq lqVar4 = oz5Var.e;
                y78 y78Var2 = new y78(oz5Var.f);
                gxa gxaVar3 = oz5Var.c;
                this.b = 1;
                if (lq.c(lqVar4, y78Var2, gxaVar3, null, null, this, 12) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 4:
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
                lq lqVar5 = oz5Var.d;
                Float f3 = new Float((float) nae.e);
                gxa gxaVar4 = oz5Var.b;
                this.b = 1;
                if (lq.c(lqVar5, f3, gxaVar4, null, null, this, 12) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                lq lqVar6 = oz5Var.e;
                y78 y78Var3 = new y78(oz5Var.f);
                gxa gxaVar5 = oz5Var.c;
                this.b = 1;
                if (lq.c(lqVar6, y78Var3, gxaVar5, null, null, this, 12) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
