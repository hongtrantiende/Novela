package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mkb  reason: default package */
/* loaded from: classes.dex */
public final class mkb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ mu4 c;
    public final /* synthetic */ j59 d;
    public final /* synthetic */ z09 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mkb(mu4 mu4Var, j59 j59Var, z09 z09Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = mu4Var;
        this.d = j59Var;
        this.e = z09Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new mkb(this.c, this.d, this.e, m42Var, 0);
            case 1:
                return new mkb(this.c, this.d, this.e, m42Var, 1);
            default:
                return new mkb(this.c, this.d, this.e, m42Var, 2);
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
                return ((mkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((mkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((mkb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        z09 z09Var = this.e;
        j59 j59Var = this.d;
        mu4 mu4Var = this.c;
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
                y78 y78Var = new y78(z09Var.c);
                this.b = 1;
                if (mu4Var.c(j59Var, y78Var, this) == n82Var) {
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
                y78 y78Var2 = new y78(z09Var.c);
                this.b = 1;
                if (mu4Var.c(j59Var, y78Var2, this) == n82Var) {
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
                y78 y78Var3 = new y78(z09Var.c);
                this.b = 1;
                if (mu4Var.c(j59Var, y78Var3, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
