package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zw0  reason: default package */
/* loaded from: classes3.dex */
public final class zw0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zw0(fy0 fy0Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = fy0Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                return new zw0(fy0Var, m42Var, 0);
            default:
                return new zw0(fy0Var, m42Var, 1);
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
                ((zw0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((zw0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        lw0 lw0Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                if (((wx0) fy0Var.F.getValue()).e.isEmpty()) {
                    hk1 a = jdd.a(fy0Var);
                    sw2 sw2Var = ab3.a;
                    fy0Var.f(a, ru2.c, new yx0(fy0Var, null, 4));
                }
                return pvcVar;
            default:
                hre.r(obj);
                mw0 mw0Var = fy0Var.d;
                cza czaVar = fy0Var.D;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        lw0Var = ((qw0) mw0Var).b;
                    } while (!czaVar.l(value, lx0.a((lx0) value, false, ((Boolean) lw0Var.a.c(lw0.h[0], lw0Var)).booleanValue(), ((qw0) mw0Var).b.a(), null, null, 51)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
