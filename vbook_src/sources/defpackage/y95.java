package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y95  reason: default package */
/* loaded from: classes3.dex */
public final class y95 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ aa5 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y95(aa5 aa5Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = aa5Var;
        this.d = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new y95(this.c, this.d, m42Var, 0);
            default:
                return new y95(this.c, this.d, m42Var, 1);
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
                return ((y95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((y95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.d;
        aa5 aa5Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            hre.r(obj);
                            return pvc.a;
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    kj6 i4 = aa5Var.i();
                    this.b = 1;
                    if (jxe.q(i4, jw7.c, this) == n82Var) {
                        return n82Var;
                    }
                }
                kj6 i5 = aa5Var.i();
                this.b = 2;
                yy9 yy9Var = kj6.y;
                if (i5.l(i2, 0, this) == n82Var) {
                    return n82Var;
                }
                return pvc.a;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                y95 y95Var = new y95(aa5Var, i2, null, 0);
                this.b = 1;
                Object F = k27.F(100L, y95Var, this);
                if (F == n82Var) {
                    return n82Var;
                }
                return F;
        }
    }
}
