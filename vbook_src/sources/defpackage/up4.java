package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: up4  reason: default package */
/* loaded from: classes3.dex */
public final class up4 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vp4 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ up4(vp4 vp4Var, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = vp4Var;
        this.c = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        float f = this.c;
        vp4 vp4Var = this.b;
        switch (i) {
            case 0:
                return new up4(vp4Var, f, m42Var, 0);
            default:
                return new up4(vp4Var, f, m42Var, 1);
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
                ((up4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((up4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.c;
        vp4 vp4Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                n6c n6cVar = (n6c) vp4Var.c;
                n6cVar.a.q.e(dx.W[15], Float.valueOf(f));
                cza czaVar = n6cVar.n;
                Float valueOf = Float.valueOf(f);
                czaVar.getClass();
                czaVar.n(null, valueOf);
                return pvcVar;
            default:
                hre.r(obj);
                n6c n6cVar2 = (n6c) vp4Var.c;
                n6cVar2.a.p.e(dx.W[14], Float.valueOf(f));
                cza czaVar2 = n6cVar2.m;
                Float valueOf2 = Float.valueOf(f);
                czaVar2.getClass();
                czaVar2.n(null, valueOf2);
                return pvcVar;
        }
    }
}
