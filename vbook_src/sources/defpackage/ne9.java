package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ne9  reason: default package */
/* loaded from: classes3.dex */
public final class ne9 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ re9 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne9(re9 re9Var, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = re9Var;
        this.c = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new ne9(this.b, this.c, m42Var, 0);
            default:
                return new ne9(this.b, this.c, m42Var, 1);
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
                ((ne9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((ne9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
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
        re9 re9Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                be9 be9Var = (be9) re9Var.c;
                be9Var.c.l.e(rc9.q[11], Boolean.valueOf(z));
                be9Var.S();
                cza czaVar = re9Var.d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, me9.a((me9) value, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, this.c, false, 49151)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((be9) re9Var.c).c.o.e(rc9.q[14], Boolean.valueOf(z));
                cza czaVar2 = re9Var.d;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, me9.a((me9) value2, null, null, null, null, null, false, 0L, 0L, 0, 0, 0, 0, 0, 0, false, this.c, 32767)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
