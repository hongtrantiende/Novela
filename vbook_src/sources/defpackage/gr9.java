package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gr9  reason: default package */
/* loaded from: classes.dex */
public final class gr9 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lu4 c;
    public final /* synthetic */ sq9 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr9(lu4 lu4Var, sq9 sq9Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = lu4Var;
        this.d = sq9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        sq9 sq9Var = this.d;
        lu4 lu4Var = this.c;
        switch (i) {
            case 0:
                return new gr9(lu4Var, sq9Var, m42Var, 0);
            case 1:
                return new gr9(lu4Var, sq9Var, m42Var, 1);
            default:
                return new gr9(lu4Var, sq9Var, m42Var, 2);
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
                return ((gr9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((gr9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((gr9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        sq9 sq9Var = this.d;
        lu4 lu4Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object invoke = lu4Var.invoke(sq9Var, this);
                if (invoke == n82Var) {
                    return n82Var;
                }
                return invoke;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object invoke2 = lu4Var.invoke(sq9Var, this);
                if (invoke2 == n82Var) {
                    return n82Var;
                }
                return invoke2;
            default:
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
                this.b = 1;
                Object invoke3 = lu4Var.invoke(sq9Var, this);
                if (invoke3 == n82Var) {
                    return n82Var;
                }
                return invoke3;
        }
    }
}
