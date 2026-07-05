package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wm5  reason: default package */
/* loaded from: classes.dex */
public final class wm5 implements lu4 {
    public final /* synthetic */ zc2 a;
    public final /* synthetic */ x53 b;
    public final /* synthetic */ rh8 c;
    public final /* synthetic */ wea d;
    public final /* synthetic */ mu4 e;
    public final /* synthetic */ nu4 f;

    public wm5(zc2 zc2Var, x53 x53Var, rh8 rh8Var, wea weaVar, mu4 mu4Var, nu4 nu4Var) {
        this.a = zc2Var;
        this.b = x53Var;
        this.c = rh8Var;
        this.d = weaVar;
        this.e = mu4Var;
        this.f = nu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        rv4 rv4Var = (rv4) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
        } else {
            rv4Var.e0(5004770);
            zc2 zc2Var = this.a;
            boolean f = rv4Var.f(zc2Var);
            Object P = rv4Var.P();
            if (f || P == ax1.a) {
                P = new e62(zc2Var, 7);
                rv4Var.o0(P);
            }
            rv4Var.q(false);
            vqe.a((vt4) P, this.b, jce.E(1000321276, new vm5(this.c, this.d, this.e, zc2Var, this.f), rv4Var), rv4Var, 384);
        }
        return pvc.a;
    }
}
