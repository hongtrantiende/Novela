package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ae6  reason: default package */
/* loaded from: classes.dex */
public final class ae6 implements m6b {
    public final xu7 a;
    public final /* synthetic */ be6 b;
    public final /* synthetic */ Object c;

    public ae6(be6 be6Var, Object obj) {
        this.b = be6Var;
        this.c = obj;
        int[] iArr = yy5.a;
        this.a = new xu7();
    }

    @Override // defpackage.m6b
    public final void a() {
        be6.b(this.b, this.c);
    }

    @Override // defpackage.m6b
    public final void b(xi1 xi1Var) {
        mq7 mq7Var;
        kn knVar;
        od6 od6Var = (od6) this.b.F.g(this.c);
        if (od6Var != null && (knVar = od6Var.c0) != null) {
            mq7Var = (mq7) knVar.C;
        } else {
            mq7Var = null;
        }
        if (mq7Var != null && mq7Var.J) {
            dae.G(mq7Var, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", xi1Var);
        }
    }

    @Override // defpackage.m6b
    public final long c(int i) {
        od6 od6Var = (od6) this.b.F.g(this.c);
        if (od6Var != null && od6Var.J()) {
            int i2 = ((gw7) ((iv7) od6Var.o()).b).c;
            if (i < 0 || i >= i2) {
                lv5.e("Index (" + i + ") is out of bound of [0, " + i2 + ")");
            }
            if (this.a.c(i)) {
                int i3 = ((od6) ((iv7) od6Var.o()).get(i)).d0.p.a;
                return (((od6) ((iv7) od6Var.o()).get(i)).d0.p.b & 4294967295L) | (i3 << 32);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.m6b
    public final int d() {
        od6 od6Var = (od6) this.b.F.g(this.c);
        if (od6Var != null) {
            return ((gw7) ((iv7) od6Var.o()).b).c;
        }
        return 0;
    }

    @Override // defpackage.m6b
    public final void e(int i, long j) {
        be6 be6Var = this.b;
        od6 od6Var = (od6) be6Var.F.g(this.c);
        if (od6Var != null && od6Var.J()) {
            int i2 = ((gw7) ((iv7) od6Var.o()).b).c;
            if (i < 0 || i >= i2) {
                lv5.e("Index (" + i + ") is out of bound of [0, " + i2 + ")");
            }
            if (od6Var.K()) {
                lv5.a("Pre-measure called on node that is not placed");
            }
            od6 od6Var2 = be6Var.a;
            od6Var2.N = true;
            ((rg) rd6.a(od6Var)).v((od6) ((iv7) od6Var.o()).get(i), j);
            od6Var2.N = false;
            this.a.a(i);
        }
    }
}
