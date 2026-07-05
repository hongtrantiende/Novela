package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t6c  reason: default package */
/* loaded from: classes3.dex */
public final class t6c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w6c b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t6c(w6c w6cVar, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = w6cVar;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new t6c(this.b, this.c, m42Var, 0);
            case 1:
                return new t6c(this.b, this.c, m42Var, 1);
            case 2:
                return new t6c(this.b, this.c, m42Var, 2);
            default:
                return new t6c(this.b, this.c, m42Var, 3);
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
                ((t6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((t6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((t6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((t6c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        w6c w6cVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                n6c n6cVar = (n6c) w6cVar.c;
                n6cVar.a.l.e(dx.W[10], Boolean.valueOf(z));
                cza czaVar = n6cVar.i;
                Boolean valueOf = Boolean.valueOf(z);
                czaVar.getClass();
                czaVar.n(null, valueOf);
                return pvcVar;
            case 1:
                hre.r(obj);
                n6c n6cVar2 = (n6c) w6cVar.c;
                n6cVar2.a.k.e(dx.W[9], Boolean.valueOf(z));
                cza czaVar2 = n6cVar2.h;
                Boolean valueOf2 = Boolean.valueOf(z);
                czaVar2.getClass();
                czaVar2.n(null, valueOf2);
                return pvcVar;
            case 2:
                hre.r(obj);
                n6c n6cVar3 = (n6c) w6cVar.c;
                n6cVar3.a.m.e(dx.W[11], Boolean.valueOf(z));
                cza czaVar3 = n6cVar3.j;
                Boolean valueOf3 = Boolean.valueOf(z);
                czaVar3.getClass();
                czaVar3.n(null, valueOf3);
                return pvcVar;
            default:
                hre.r(obj);
                n6c n6cVar4 = (n6c) w6cVar.c;
                n6cVar4.a.n.e(dx.W[12], Boolean.valueOf(z));
                cza czaVar4 = n6cVar4.k;
                Boolean valueOf4 = Boolean.valueOf(z);
                czaVar4.getClass();
                czaVar4.n(null, valueOf4);
                return pvcVar;
        }
    }
}
