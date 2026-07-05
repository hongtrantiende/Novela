package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v42  reason: default package */
/* loaded from: classes3.dex */
public final class v42 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v42(a52 a52Var, y78 y78Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.c = a52Var;
        this.d = y78Var;
        this.b = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new v42((a52) this.c, (y78) obj2, this.b, m42Var);
            case 1:
                v42 v42Var = new v42((String) obj2, this.b, m42Var, 1);
                v42Var.c = obj;
                return v42Var;
            default:
                v42 v42Var2 = new v42((atd) obj2, this.b, m42Var, 2);
                v42Var2.c = obj;
                return v42Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((v42) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((v42) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((v42) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        long j = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                hre.r(obj);
                ((a52) this.c).b(((y78) obj2).a, j);
                return pvcVar;
            case 1:
                hre.r(obj);
                pv7 pv7Var = (pv7) this.c;
                e49 u = s9e.u((String) obj2);
                Long l = new Long(j);
                pv7Var.getClass();
                pv7Var.f(u, l);
                return pvcVar;
            default:
                m82 m82Var = (m82) this.c;
                hre.r(obj);
                atd atdVar = (atd) obj2;
                atdVar.p = (w26) m82Var.q().get(r0f.I);
                long j2 = this.b;
                z87.v(m82Var, null, null, new xsd(atdVar, j2, null, 0), 3);
                return z87.v(m82Var, null, null, new xsd(atdVar, j2, null, 1), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v42(Object obj, long j, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.b = j;
    }
}
