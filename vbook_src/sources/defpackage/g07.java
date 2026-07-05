package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g07  reason: default package */
/* loaded from: classes3.dex */
public final class g07 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ iw2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g07(iw2 iw2Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = iw2Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        iw2 iw2Var = this.c;
        switch (i) {
            case 0:
                return new g07(iw2Var, m42Var, 0);
            default:
                return new g07(iw2Var, m42Var, 1);
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
                return ((g07) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((g07) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object f2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        iw2 iw2Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                f = iw2Var.f(0, tte.v(nae.e, nae.e, 7, null), this);
                if (f == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                f2 = iw2Var.f(1, tte.v(nae.e, nae.e, 7, null), this);
                if (f2 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
