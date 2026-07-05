package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ho9  reason: default package */
/* loaded from: classes.dex */
public final class ho9 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ mo9 c;
    public final /* synthetic */ af6 d;
    public final /* synthetic */ af6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ho9(mo9 mo9Var, af6 af6Var, af6 af6Var2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = mo9Var;
        this.d = af6Var;
        this.e = af6Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new ho9(this.c, this.d, this.e, m42Var, 0);
            default:
                return new ho9(this.c, this.d, this.e, m42Var, 1);
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
                return ((ho9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ho9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        af6 af6Var = this.e;
        af6 af6Var2 = this.d;
        mo9 mo9Var = this.c;
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
                if (mo9.b(mo9Var, af6Var2, af6Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                if (mo9.b(mo9Var, af6Var2, af6Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
