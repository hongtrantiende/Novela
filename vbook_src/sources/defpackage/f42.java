package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f42  reason: default package */
/* loaded from: classes3.dex */
public final class f42 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h42 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f42(h42 h42Var, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = h42Var;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        boolean z = this.c;
        h42 h42Var = this.b;
        switch (i) {
            case 0:
                return new f42(h42Var, z, m42Var, 0);
            default:
                return new f42(h42Var, z, m42Var, 1);
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
                ((f42) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((f42) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        h42 h42Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((mnb) h42Var.c).a.x.e(qwb.A[25], Boolean.valueOf(z));
                cza czaVar = h42Var.d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, c42.a((c42) value, false, z, null, 5)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((mnb) h42Var.c).a.w.e(qwb.A[24], Boolean.valueOf(z));
                cza czaVar2 = h42Var.d;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, c42.a((c42) value2, z, false, null, 6)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
