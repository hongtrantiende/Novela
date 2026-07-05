package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x39  reason: default package */
/* loaded from: classes.dex */
public final class x39 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lu4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x39(lu4 lu4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = lu4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        lu4 lu4Var = this.d;
        switch (i) {
            case 0:
                x39 x39Var = new x39(lu4Var, m42Var, 0);
                x39Var.c = obj;
                return x39Var;
            case 1:
                x39 x39Var2 = new x39(lu4Var, m42Var, 1);
                x39Var2.c = obj;
                return x39Var2;
            default:
                x39 x39Var3 = new x39(lu4Var, m42Var, 2);
                x39Var3.c = obj;
                return x39Var3;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((x39) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((x39) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((x39) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        lu4 lu4Var = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
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
                    this.b = 1;
                    obj = lu4Var.invoke((pv7) this.c, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                pv7 pv7Var = (pv7) obj;
                pv7Var.getClass();
                pv7Var.b.a.set(true);
                return pv7Var;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        pv7 pv7Var2 = (pv7) this.c;
                        hre.r(obj);
                        return pv7Var2;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                pv7 g = ((pv7) this.c).g();
                this.c = g;
                this.b = 1;
                if (lu4Var.invoke(g, this) == n82Var) {
                    return n82Var;
                }
                return g;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    if (lu4Var.invoke((m82) this.c, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvc.a;
        }
    }
}
