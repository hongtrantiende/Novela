package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: se1  reason: default package */
/* loaded from: classes3.dex */
public final class se1 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ kj6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se1(kj6 kj6Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = kj6Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        kj6 kj6Var = this.c;
        switch (i) {
            case 0:
                return new se1(kj6Var, m42Var, 0);
            case 1:
                return new se1(kj6Var, m42Var, 1);
            case 2:
                return new se1(kj6Var, m42Var, 2);
            default:
                return new se1(kj6Var, m42Var, 3);
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
                return ((se1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((se1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((se1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((se1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        kj6 kj6Var = this.c;
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
                yy9 yy9Var = kj6.y;
                if (kj6Var.l(0, 0, this) == n82Var) {
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
                qo qoVar = new qo(2, 1, null);
                this.b = 1;
                if (kj6Var.e(jw7.a, qoVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                s02 G = yae.G(new ne1(kj6Var, 16));
                jx0 jx0Var = new jx0(2, 3, null);
                this.b = 1;
                Object D = z1d.D(G, jx0Var, this);
                if (D == n82Var) {
                    return n82Var;
                }
                return D;
            default:
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
                yy9 yy9Var2 = kj6.y;
                if (kj6Var.f(0, 0, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
