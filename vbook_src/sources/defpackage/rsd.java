package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rsd  reason: default package */
/* loaded from: classes.dex */
public final class rsd extends aab implements lu4 {
    public final /* synthetic */ float C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qi8 d;
    public final /* synthetic */ xh8 e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsd(qi8 qi8Var, aw7 aw7Var, boolean z, si8 si8Var, float f, xh8 xh8Var, m42 m42Var) {
        super(2, m42Var);
        this.d = qi8Var;
        this.f = aw7Var;
        this.c = z;
        this.D = si8Var;
        this.C = f;
        this.e = xh8Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.D;
        switch (i) {
            case 0:
                float f = this.C;
                xh8 xh8Var = this.e;
                return new rsd(this.d, this.f, this.c, (si8) obj2, f, xh8Var, m42Var);
            default:
                float f2 = this.C;
                return new rsd(this.c, this.d, this.e, this.f, (sk8) obj2, f2, m42Var);
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
                return ((rsd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((rsd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.C;
        Object obj2 = this.D;
        aw7 aw7Var = this.f;
        qi8 qi8Var = this.d;
        boolean z = this.c;
        n82 n82Var = n82.a;
        xh8 xh8Var = this.e;
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
                s02 G = yae.G(new osd(qi8Var, aw7Var, 2));
                qsd qsdVar = new qsd(z, (si8) obj2, f, xh8Var);
                this.b = 1;
                if (G.a(qsdVar, this) == n82Var) {
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
                if (z) {
                    s02 G2 = yae.G(new x8c(6, qi8Var, xh8Var, aw7Var));
                    cf2 cf2Var = new cf2((sk8) obj2, f, xh8Var);
                    this.b = 1;
                    if (G2.a(cf2Var, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsd(boolean z, qi8 qi8Var, xh8 xh8Var, aw7 aw7Var, sk8 sk8Var, float f, m42 m42Var) {
        super(2, m42Var);
        this.c = z;
        this.d = qi8Var;
        this.e = xh8Var;
        this.f = aw7Var;
        this.D = sk8Var;
        this.C = f;
    }
}
