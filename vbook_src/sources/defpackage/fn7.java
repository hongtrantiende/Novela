package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fn7  reason: default package */
/* loaded from: classes3.dex */
public final class fn7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sj8 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fn7(sj8 sj8Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = sj8Var;
        this.d = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        int i2 = this.d;
        sj8 sj8Var = this.c;
        switch (i) {
            case 0:
                return new fn7(sj8Var, i2, m42Var, 0);
            default:
                return new fn7(sj8Var, i2, m42Var, 1);
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
                return ((fn7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((fn7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object f2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        sj8 sj8Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
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
                f = sj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                f2 = sj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f2 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
