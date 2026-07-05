package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v6c  reason: default package */
/* loaded from: classes3.dex */
public final class v6c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6c b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6c(w6c w6cVar, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.b = w6cVar;
        this.c = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new v6c(this.b, this.c, m42Var, 0);
            case 1:
                return new v6c(this.b, this.c, m42Var, 1);
            default:
                return new v6c(this.b, this.c, m42Var, 2);
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
                ((v6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((v6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((v6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.c;
        w6c w6cVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                n6c n6cVar = (n6c) w6cVar.c;
                n6cVar.a.j.e(dx.W[8], Integer.valueOf(i2));
                cza czaVar = n6cVar.g;
                Integer valueOf = Integer.valueOf(i2);
                czaVar.getClass();
                czaVar.n(null, valueOf);
                return pvcVar;
            case 1:
                hre.r(obj);
                n6c n6cVar2 = (n6c) w6cVar.c;
                n6cVar2.a.r.e(dx.W[16], Integer.valueOf(i2));
                cza czaVar2 = n6cVar2.o;
                Integer valueOf2 = Integer.valueOf(i2);
                czaVar2.getClass();
                czaVar2.n(null, valueOf2);
                return pvcVar;
            default:
                hre.r(obj);
                n6c n6cVar3 = (n6c) w6cVar.c;
                n6cVar3.a.h.e(dx.W[6], Integer.valueOf(i2));
                cza czaVar3 = n6cVar3.c;
                Integer valueOf3 = Integer.valueOf(i2);
                czaVar3.getClass();
                czaVar3.n(null, valueOf3);
                return pvcVar;
        }
    }
}
