package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vtb  reason: default package */
/* loaded from: classes.dex */
public final class vtb extends aab implements lu4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ ytb c;
    public final /* synthetic */ d19 d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtb(d19 d19Var, ytb ytbVar, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.d = d19Var;
        this.c = ytbVar;
        this.e = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.e;
        d19 d19Var = this.d;
        ytb ytbVar = this.c;
        switch (i) {
            case 0:
                return new vtb(d19Var, ytbVar, z, m42Var);
            default:
                return new vtb(ytbVar, d19Var, z, m42Var);
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
                return ((vtb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((vtb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.e;
        d19 d19Var = this.d;
        ytb ytbVar = this.c;
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
                ih1 ih1Var = new ih1(ytbVar, z);
                yi0 yi0Var = new yi0(ytbVar, 6);
                this.b = 1;
                Object h = yae.h(d19Var, new gm0(ih1Var, yi0Var, null, 3), this);
                if (h != n82Var) {
                    h = pvcVar;
                }
                if (h == n82Var) {
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
                if (ytb.b(ytbVar, d19Var, z, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vtb(ytb ytbVar, d19 d19Var, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.c = ytbVar;
        this.d = d19Var;
        this.e = z;
    }
}
