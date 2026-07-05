package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u45  reason: default package */
/* loaded from: classes3.dex */
public final class u45 extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ i55 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u45(i55 i55Var, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = i55Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        i55 i55Var = this.c;
        switch (i) {
            case 0:
                return new u45(i55Var, m42Var, 0);
            default:
                return new u45(i55Var, m42Var, 1);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((u45) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((u45) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        bt1 bt1Var;
        s45 s45Var;
        switch (this.a) {
            case 0:
                n82 n82Var = n82.a;
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    i55 i55Var = this.c;
                    synchronized (i55Var.h) {
                        bt1Var = i55Var.f;
                    }
                    if (bt1Var == null) {
                        return null;
                    }
                    this.b = 1;
                    if (bt1Var.r(this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvc.a;
            default:
                n82 n82Var2 = n82.a;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    i55 i55Var2 = this.c;
                    synchronized (i55Var2.h) {
                        s45Var = i55Var2.g;
                    }
                    if (s45Var == null) {
                        return null;
                    }
                    bt1 bt1Var2 = s45Var.b;
                    this.b = 1;
                    if (bt1Var2.r(this) == n82Var2) {
                        return n82Var2;
                    }
                }
                return pvc.a;
        }
    }
}
