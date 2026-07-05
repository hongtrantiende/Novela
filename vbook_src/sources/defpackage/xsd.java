package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xsd  reason: default package */
/* loaded from: classes3.dex */
public final class xsd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ atd c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xsd(atd atdVar, long j, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = atdVar;
        this.d = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new xsd(this.c, this.d, m42Var, 0);
            default:
                return new xsd(this.c, this.d, m42Var, 1);
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
                return ((xsd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((xsd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        long j = this.d;
        n82 n82Var = n82.a;
        atd atdVar = this.c;
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
                lq lqVar = atdVar.i;
                Float f = new Float(z4d.b(j));
                pq2 pq2Var = atdVar.a;
                this.b = 1;
                if (lqVar.b(f, pq2Var, null, this) == n82Var) {
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
                lq lqVar2 = atdVar.j;
                Float f2 = new Float(z4d.c(j));
                pq2 pq2Var2 = atdVar.a;
                this.b = 1;
                if (lqVar2.b(f2, pq2Var2, null, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
