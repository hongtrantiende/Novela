package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dg0  reason: default package */
/* loaded from: classes.dex */
public final class dg0 extends uq7 {
    public final long b;
    public final hy0 c;
    public final float d;
    public final wea e;
    public final vt3 f;

    public dg0(long j, hy0 hy0Var, wea weaVar, int i) {
        vt3 vt3Var = vt3.F;
        j = (i & 1) != 0 ? zl1.i : j;
        hy0Var = (i & 2) != 0 ? null : hy0Var;
        this.b = j;
        this.c = hy0Var;
        this.d = 1.0f;
        this.e = weaVar;
        this.f = vt3Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, lg0] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        mq7Var.N = this.e;
        mq7Var.O = 9205357640488583168L;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        this.f.getClass();
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        lg0 lg0Var = (lg0) mq7Var;
        lg0Var.K = this.b;
        lg0Var.L = this.c;
        lg0Var.M = this.d;
        wea weaVar = lg0Var.N;
        wea weaVar2 = this.e;
        if (!c16.i(weaVar, weaVar2)) {
            lg0Var.N = weaVar2;
            ak0.t(lg0Var);
        }
        hud.o(lg0Var);
    }

    public final boolean equals(Object obj) {
        dg0 dg0Var;
        if (obj instanceof dg0) {
            dg0Var = (dg0) obj;
        } else {
            dg0Var = null;
        }
        if (dg0Var == null || !zl1.c(this.b, dg0Var.b) || !c16.i(this.c, dg0Var.c) || this.d != dg0Var.d || !c16.i(this.e, dg0Var.e)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2 = zl1.j;
        int hashCode = Long.hashCode(this.b) * 31;
        hy0 hy0Var = this.c;
        if (hy0Var != null) {
            i = hy0Var.hashCode();
        } else {
            i = 0;
        }
        return this.e.hashCode() + nk2.d(this.d, (hashCode + i) * 31, 31);
    }
}
