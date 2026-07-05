package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: av5  reason: default package */
/* loaded from: classes.dex */
public final class av5 {
    public final gw7 a = new gw7(new yu5[16], 0);
    public final hm8 b = yae.z(Boolean.FALSE);
    public long c = Long.MIN_VALUE;
    public final hm8 d = yae.z(Boolean.TRUE);

    public final void a(int i, rv4 rv4Var) {
        int i2;
        boolean z;
        rv4Var.g0(-318043801);
        if (rv4Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(null);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            if (!((Boolean) this.d.getValue()).booleanValue() && !((Boolean) this.b.getValue()).booleanValue()) {
                rv4Var.e0(-143455237);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-144841960);
                boolean h = rv4Var.h(this);
                Object P2 = rv4Var.P();
                if (h || P2 == lh9Var) {
                    P2 = new z45(aw7Var, this, (m42) null, 5);
                    rv4Var.o0(P2);
                }
                yte.g((lu4) P2, rv4Var, this);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sj(this, i, 21);
        }
    }
}
