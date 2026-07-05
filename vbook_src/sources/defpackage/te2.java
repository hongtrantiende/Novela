package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: te2  reason: default package */
/* loaded from: classes.dex */
public final class te2 extends aab implements lu4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te2(m42 m42Var, xt4 xt4Var, fu9 fu9Var, boolean z, boolean z2) {
        super(2, m42Var);
        this.e = fu9Var;
        this.c = z;
        this.d = z2;
        this.f = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (i) {
            case 0:
                return new te2(m42Var, (xt4) obj2, (fu9) obj3, this.c, this.d);
            default:
                return new te2((qi8) obj3, (xh8) obj2, this.c, this.d, m42Var);
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
                return ((te2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((te2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
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
                fu9 fu9Var = (fu9) obj3;
                boolean z = this.d;
                boolean z2 = this.c;
                se2 se2Var = new se2(null, (xt4) obj2, fu9Var, z, z2);
                this.b = 1;
                Object q = fu9Var.q(z2, se2Var, this);
                if (q == n82Var) {
                    return n82Var;
                }
                return q;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    s02 G = yae.G(new msd((qi8) obj3, 2));
                    psd psdVar = new psd((xh8) obj2, this.c, this.d);
                    this.b = 1;
                    if (G.a(psdVar, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvc.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te2(qi8 qi8Var, xh8 xh8Var, boolean z, boolean z2, m42 m42Var) {
        super(2, m42Var);
        this.e = qi8Var;
        this.f = xh8Var;
        this.c = z;
        this.d = z2;
    }
}
