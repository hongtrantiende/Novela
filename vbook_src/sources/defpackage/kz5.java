package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kz5  reason: default package */
/* loaded from: classes.dex */
public final class kz5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lz5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz5(lz5 lz5Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = lz5Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new kz5(this.c, m42Var, 0);
            default:
                return new kz5(this.c, m42Var, 1);
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
                return ((kz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((kz5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
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
                    this.c.a();
                    lz5 lz5Var = this.c;
                    this.b = 1;
                    f61 f61Var = new f61(1, w92.t(this));
                    f61Var.u();
                    synchronized (lz5Var.c) {
                        lz5Var.d = 20;
                        lz5Var.f = f61Var;
                    }
                    f61Var.w(new jc(lz5Var, 24));
                    if (f61Var.s() == n82Var) {
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
                    lz5 lz5Var2 = this.c;
                    this.b = 1;
                    lz5Var2.getClass();
                    if (k27.F(5000L, new kz5(lz5Var2, null, 0), this) == n82Var2) {
                        return n82Var2;
                    }
                }
                return pvc.a;
        }
    }
}
