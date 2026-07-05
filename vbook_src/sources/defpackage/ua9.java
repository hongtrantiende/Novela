package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ua9  reason: default package */
/* loaded from: classes.dex */
public final class ua9 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ xa9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ua9(xa9 xa9Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = xa9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        xa9 xa9Var = this.c;
        switch (i) {
            case 0:
                return new ua9(xa9Var, m42Var, 0);
            case 1:
                return new ua9(xa9Var, m42Var, 1);
            default:
                return new ua9(xa9Var, m42Var, 2);
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
                return ((ua9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ua9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ua9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        float f;
        int i = this.a;
        pvc pvcVar = pvc.a;
        xa9 xa9Var = this.c;
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
                ya9 ya9Var = xa9Var.P;
                if (xa9Var.M) {
                    f = 1.0f;
                } else {
                    f = nae.e;
                }
                this.b = 1;
                Object g = ya9Var.a.g(this, new Float(f));
                if (g != n82Var) {
                    g = pvcVar;
                }
                if (g == n82Var) {
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
                if (!xa9Var.P.a.f()) {
                    ya9 ya9Var2 = xa9Var.P;
                    this.b = 1;
                    Object g2 = ya9Var2.a.g(this, new Float(xa9Var.S.h() / xa9Var.N1()));
                    if (g2 != n82Var) {
                        g2 = pvcVar;
                    }
                    if (g2 == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1 && i4 != 2) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    return pvcVar;
                }
                hre.r(obj);
                if (!xa9Var.M) {
                    this.b = 1;
                    if (xa9Var.L1(this) != n82Var) {
                        return pvcVar;
                    }
                } else {
                    this.b = 2;
                    if (xa9.K1(xa9Var, this) != n82Var) {
                        return pvcVar;
                    }
                }
                return n82Var;
        }
    }
}
