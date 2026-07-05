package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gr5  reason: default package */
/* loaded from: classes3.dex */
public final class gr5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur5 b;
    public final /* synthetic */ float c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gr5(float f, int i, m42 m42Var, ur5 ur5Var) {
        super(2, m42Var);
        this.a = i;
        this.b = ur5Var;
        this.c = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new gr5(this.c, 0, m42Var, this.b);
            default:
                return new gr5(this.c, 1, m42Var, this.b);
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
                ((gr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((gr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.c;
        ur5 ur5Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                ((cm5) ur5Var.F).a.g.e(xh9.s[5], Float.valueOf(f));
                cza czaVar = ur5Var.X;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, dm5.a((dm5) value, 0, 0, nae.e, 0, 0, false, false, false, false, this.c, 0, 0, false, false, false, false, false, false, false, false, 0, 4193791)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                hre.r(obj);
                ((cm5) ur5Var.F).b.c.e(so5.l[2], Float.valueOf(f));
                cza czaVar2 = ur5Var.X;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, dm5.a((dm5) value2, 0, 0, this.c, 0, 0, false, false, false, false, nae.e, 0, 0, false, false, false, false, false, false, false, false, 0, 4194299)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
