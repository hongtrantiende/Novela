package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jh6  reason: default package */
/* loaded from: classes.dex */
public final class jh6 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ mh6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jh6(mh6 mh6Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = mh6Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        mh6 mh6Var = this.c;
        switch (i) {
            case 0:
                return new jh6(mh6Var, m42Var, 0);
            case 1:
                return new jh6(mh6Var, m42Var, 1);
            case 2:
                return new jh6(mh6Var, m42Var, 2);
            case 3:
                return new jh6(mh6Var, m42Var, 3);
            default:
                return new jh6(mh6Var, m42Var, 4);
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
                return ((jh6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((jh6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((jh6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((jh6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((jh6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        mh6 mh6Var = this.c;
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
                lq lqVar = mh6Var.q;
                Float f = new Float(1.0f);
                this.b = 1;
                if (lqVar.g(this, f) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar2 = mh6Var.p;
                    py5 py5Var = new py5(0L);
                    this.b = 1;
                    if (lqVar2.g(this, py5Var) == n82Var) {
                        return n82Var;
                    }
                }
                mh6Var.h(0L);
                mh6Var.g(false);
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
                lq lqVar3 = mh6Var.p;
                this.b = 1;
                if (lqVar3.h(this) == n82Var) {
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
                lq lqVar4 = mh6Var.q;
                this.b = 1;
                if (lqVar4.h(this) == n82Var) {
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
                lq lqVar5 = mh6Var.q;
                this.b = 1;
                if (lqVar5.h(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
