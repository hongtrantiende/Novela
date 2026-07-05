package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rrb  reason: default package */
/* loaded from: classes.dex */
public final class rrb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ trb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rrb(trb trbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = trbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        trb trbVar = this.c;
        switch (i) {
            case 0:
                return new rrb(trbVar, m42Var, 0);
            case 1:
                return new rrb(trbVar, m42Var, 1);
            case 2:
                return new rrb(trbVar, m42Var, 2);
            case 3:
                return new rrb(trbVar, m42Var, 3);
            case 4:
                return new rrb(trbVar, m42Var, 4);
            default:
                return new rrb(trbVar, m42Var, 5);
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
                return ((rrb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((rrb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((rrb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((rrb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((rrb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((rrb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        trb trbVar = this.c;
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
                ytb ytbVar = trbVar.O;
                this.b = 1;
                ytbVar.e(true, this);
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
                ytb ytbVar2 = trbVar.O;
                this.b = 1;
                ytbVar2.f(this);
                if (pvcVar == n82Var) {
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
                ytb ytbVar3 = trbVar.O;
                this.b = 1;
                if (ytbVar3.s(this) == n82Var) {
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
                this.b = 1;
                Object a = z1d.L(new mx(yae.G(new prb(trbVar, 7)), 3), 1).a(new r58(trbVar, 13), this);
                if (a != n82Var) {
                    a = pvcVar;
                }
                if (a == n82Var) {
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
                ytb ytbVar4 = trbVar.O;
                this.b = 1;
                if (ytbVar4.x(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                koa koaVar = new koa(trbVar, null, 19);
                this.b = 1;
                ey8.a(trbVar, koaVar, this);
                return n82Var;
        }
    }
}
