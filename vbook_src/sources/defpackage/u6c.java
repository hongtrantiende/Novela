package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u6c  reason: default package */
/* loaded from: classes3.dex */
public final class u6c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6c b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u6c(w6c w6cVar, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = w6cVar;
        this.c = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new u6c(this.b, this.c, m42Var, 0);
            default:
                return new u6c(this.b, this.c, m42Var, 1);
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
                ((u6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((u6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.c;
        w6c w6cVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                n6c n6cVar = (n6c) w6cVar.c;
                n6cVar.a.i.e(dx.W[7], Float.valueOf(f));
                cza czaVar = n6cVar.d;
                Float valueOf = Float.valueOf(f);
                czaVar.getClass();
                czaVar.n(null, valueOf);
                return pvcVar;
            default:
                hre.r(obj);
                n6c n6cVar2 = (n6c) w6cVar.c;
                n6cVar2.getClass();
                float m = dce.m(f, nae.e, 1.0f);
                n6cVar2.a.g.e(dx.W[5], Float.valueOf(m));
                cza czaVar2 = n6cVar2.q;
                Float valueOf2 = Float.valueOf(m);
                czaVar2.getClass();
                czaVar2.n(null, valueOf2);
                return pvcVar;
        }
    }
}
