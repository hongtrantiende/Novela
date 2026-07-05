package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pe9  reason: default package */
/* loaded from: classes3.dex */
public final class pe9 extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ re9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pe9(re9 re9Var, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = re9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        switch (this.a) {
            case 0:
                return new pe9(this.c, m42Var, 0);
            case 1:
                return new pe9(this.c, m42Var, 1);
            case 2:
                return new pe9(this.c, m42Var, 2);
            case 3:
                return new pe9(this.c, m42Var, 3);
            default:
                return new pe9(this.c, m42Var, 4);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((pe9) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((pe9) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((pe9) create(m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((pe9) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((pe9) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        re9 re9Var = this.c;
        n82 n82Var = n82.a;
        String str = null;
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
                sc9 sc9Var = re9Var.c;
                this.b = 1;
                be9 be9Var = (be9) sc9Var;
                eb9 a = be9Var.c.a();
                if (a != null) {
                    str = a.a;
                }
                Object x = be9Var.x(str, "LuatNhan", this);
                if (x == n82Var) {
                    return n82Var;
                }
                return x;
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
                sc9 sc9Var2 = re9Var.c;
                this.b = 1;
                be9 be9Var2 = (be9) sc9Var2;
                eb9 d = be9Var2.c.d();
                if (d != null) {
                    str = d.a;
                }
                Object y = be9Var2.y(str, "Name", this);
                if (y == n82Var) {
                    return n82Var;
                }
                return y;
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
                sc9 sc9Var3 = re9Var.c;
                this.b = 1;
                be9 be9Var3 = (be9) sc9Var3;
                eb9 g = be9Var3.c.g();
                if (g != null) {
                    str = g.a;
                }
                Object x2 = be9Var3.x(str, "PhienAm", this);
                if (x2 == n82Var) {
                    return n82Var;
                }
                return x2;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                sc9 sc9Var4 = re9Var.c;
                this.b = 1;
                be9 be9Var4 = (be9) sc9Var4;
                eb9 h = be9Var4.c.h();
                if (h != null) {
                    str = h.a;
                }
                Object y2 = be9Var4.y(str, "Pronouns", this);
                if (y2 == n82Var) {
                    return n82Var;
                }
                return y2;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                sc9 sc9Var5 = re9Var.c;
                this.b = 1;
                be9 be9Var5 = (be9) sc9Var5;
                eb9 j = be9Var5.c.j();
                if (j != null) {
                    str = j.a;
                }
                Object y3 = be9Var5.y(str, "VietPhrase", this);
                if (y3 == n82Var) {
                    return n82Var;
                }
                return y3;
        }
    }
}
