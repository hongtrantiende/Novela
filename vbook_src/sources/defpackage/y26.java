package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y26  reason: default package */
/* loaded from: classes3.dex */
public class y26 extends l36 {
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y26(w26 w26Var) {
        super(true);
        yg1 yg1Var;
        yg1 yg1Var2;
        boolean z = true;
        L(w26Var);
        xg1 H = H();
        if (H instanceof yg1) {
            yg1Var = (yg1) H;
        } else {
            yg1Var = null;
        }
        if (yg1Var != null) {
            l36 p = yg1Var.p();
            while (!p.D()) {
                xg1 H2 = p.H();
                if (H2 instanceof yg1) {
                    yg1Var2 = (yg1) H2;
                } else {
                    yg1Var2 = null;
                }
                if (yg1Var2 != null) {
                    p = yg1Var2.p();
                }
            }
            this.e = z;
        }
        z = false;
        this.e = z;
    }

    @Override // defpackage.l36
    public final boolean D() {
        return this.e;
    }

    @Override // defpackage.l36
    public final boolean E() {
        return true;
    }

    public final void o0() {
        P(pvc.a);
    }
}
