package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pk8  reason: default package */
/* loaded from: classes.dex */
public final class pk8 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lq c;
    public final /* synthetic */ long d;
    public final /* synthetic */ sk8 e;
    public final /* synthetic */ qi8 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pk8(lq lqVar, long j, sk8 sk8Var, qi8 qi8Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = lqVar;
        this.d = j;
        this.e = sk8Var;
        this.f = qi8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new pk8(this.c, this.d, this.e, this.f, m42Var, 0);
            default:
                return new pk8(this.c, this.d, this.e, this.f, m42Var, 1);
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
                return ((pk8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((pk8) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        qi8 qi8Var = this.f;
        sk8 sk8Var = this.e;
        long j = this.d;
        lq lqVar = this.c;
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
                ok8 ok8Var = new ok8(qi8Var, 0);
                this.b = 1;
                if (lqVar.b(new Float(z4d.b(j)), (pq2) sk8Var.e, ok8Var, this) == n82Var) {
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
                ok8 ok8Var2 = new ok8(qi8Var, 1);
                this.b = 1;
                if (lqVar.b(new Float(z4d.c(j)), (pq2) sk8Var.e, ok8Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
