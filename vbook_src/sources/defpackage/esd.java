package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: esd  reason: default package */
/* loaded from: classes3.dex */
public final class esd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ d19 d;
    public final /* synthetic */ atd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ esd(d19 d19Var, atd atdVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = d19Var;
        this.e = atdVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        atd atdVar = this.e;
        d19 d19Var = this.d;
        switch (i) {
            case 0:
                esd esdVar = new esd(d19Var, atdVar, m42Var, 0);
                esdVar.c = obj;
                return esdVar;
            default:
                esd esdVar2 = new esd(d19Var, atdVar, m42Var, 1);
                esdVar2.c = obj;
                return esdVar2;
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
                return ((esd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((esd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        atd atdVar = this.e;
        d19 d19Var = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                m82 m82Var = (m82) this.c;
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
                t3c t3cVar = new t3c(27, m82Var, atdVar);
                this.c = null;
                this.b = 1;
                Object p = k27.p(new q4c(d19Var, t3cVar, null, 29), this);
                if (p != n82Var) {
                    p = pvcVar;
                }
                if (p == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                m82 m82Var2 = (m82) this.c;
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
                hk7 hk7Var = new hk7(atdVar, 1);
                hk7 hk7Var2 = new hk7(atdVar, 2);
                em7 em7Var = new em7(18, atdVar, m82Var2);
                this.c = null;
                this.b = 1;
                if (yae.h(d19Var, new gm0(hk7Var, em7Var, hk7Var2, null, 6), this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
