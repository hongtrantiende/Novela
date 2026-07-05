package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fx0  reason: default package */
/* loaded from: classes3.dex */
public final class fx0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lhd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fx0(lhd lhdVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = lhdVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        lhd lhdVar = this.c;
        switch (i) {
            case 0:
                return new fx0(lhdVar, m42Var, 0);
            case 1:
                return new fx0(lhdVar, m42Var, 1);
            case 2:
                return new fx0(lhdVar, m42Var, 2);
            case 3:
                return new fx0(lhdVar, m42Var, 3);
            case 4:
                return new fx0(lhdVar, m42Var, 4);
            case 5:
                return new fx0(lhdVar, m42Var, 5);
            case 6:
                return new fx0(lhdVar, m42Var, 6);
            case 7:
                return new fx0(lhdVar, m42Var, 7);
            default:
                return new fx0(lhdVar, m42Var, 8);
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
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((fx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lhd lhdVar = this.c;
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
                if (lhdVar.m(this) == n82Var) {
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
                if (lhdVar.p(this) == n82Var) {
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
                if (lhdVar.m(this) == n82Var) {
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
                if (lhdVar.p(this) == n82Var) {
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
                this.b = 1;
                if (lhdVar.i(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 5:
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
                this.b = 1;
                if (lhdVar.h(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 6:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (lhdVar.i(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 7:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (lhdVar.h(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                s02 G = yae.G(new yw0(lhdVar, 2));
                jx0 jx0Var = new jx0(2, 1, null);
                this.b = 1;
                Object D = z1d.D(G, jx0Var, this);
                if (D == n82Var) {
                    return n82Var;
                }
                return D;
        }
    }
}
