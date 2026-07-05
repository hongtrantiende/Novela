package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ed3  reason: default package */
/* loaded from: classes.dex */
public final class ed3 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ iw2 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ed3(iw2 iw2Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = iw2Var;
        this.d = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        int i2 = this.d;
        iw2 iw2Var = this.c;
        switch (i) {
            case 0:
                return new ed3(iw2Var, i2, m42Var, 0);
            case 1:
                return new ed3(iw2Var, i2, m42Var, 1);
            default:
                return new ed3(iw2Var, i2, m42Var, 2);
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
                return ((ed3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ed3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ed3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object f;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        iw2 iw2Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
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
                f = iw2Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
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
                if (rj8.u(iw2Var, i2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
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
                if (rj8.u(iw2Var, i2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
