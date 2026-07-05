package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jo9  reason: default package */
/* loaded from: classes.dex */
public final class jo9 extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ mo9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jo9(mo9 mo9Var, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = mo9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        switch (this.a) {
            case 0:
                return new jo9(this.c, m42Var, 0);
            default:
                return new jo9(this.c, m42Var, 1);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((jo9) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((jo9) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
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
                if (mo9.a(mo9Var, i3a.a, this) == n82Var) {
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
                if (mo9.a(mo9Var, i3a.b, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
