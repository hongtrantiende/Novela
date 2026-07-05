package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k93  reason: default package */
/* loaded from: classes3.dex */
public final class k93 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k93(br6 br6Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = br6Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        br6 br6Var = this.b;
        switch (i) {
            case 0:
                return new k93(br6Var, m42Var, 0);
            default:
                return new k93(br6Var, m42Var, 1);
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
                ((k93) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((k93) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        br6 br6Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                hk1 a = jdd.a(br6Var);
                sw2 sw2Var = ab3.a;
                br6Var.f(a, ru2.c, new k93(br6Var, null, 1));
                return pvcVar;
            default:
                hre.r(obj);
                yj1 yj1Var = by5.a;
                hq7 hq7Var = wl3.b;
                if (yj1Var.k().b() - br6Var.f0 > wl3.e(jue.O(10, am3.MINUTES))) {
                    br6Var.f0 = yj1Var.k().b();
                }
                return pvcVar;
        }
    }
}
