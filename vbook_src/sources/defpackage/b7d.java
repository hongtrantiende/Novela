package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b7d  reason: default package */
/* loaded from: classes3.dex */
public final class b7d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ gcd b;
    public final /* synthetic */ s6d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b7d(gcd gcdVar, s6d s6dVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = gcdVar;
        this.c = s6dVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        s6d s6dVar = this.c;
        gcd gcdVar = this.b;
        switch (i) {
            case 0:
                return new b7d(gcdVar, s6dVar, m42Var, 0);
            default:
                return new b7d(gcdVar, s6dVar, m42Var, 1);
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
                ((b7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((b7d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        s6d s6dVar = this.c;
        gcd gcdVar = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                boolean z = s6dVar.n;
                gcdVar.q = Boolean.valueOf(z);
                j9d j9dVar = gcdVar.n;
                if (j9dVar != null) {
                    j9dVar.c(z);
                }
                return pvcVar;
            default:
                hre.r(obj);
                float f = s6dVar.p;
                gcdVar.r = Float.valueOf(f);
                j9d j9dVar2 = gcdVar.n;
                if (j9dVar2 != null) {
                    j9dVar2.b(f);
                }
                return pvcVar;
        }
    }
}
