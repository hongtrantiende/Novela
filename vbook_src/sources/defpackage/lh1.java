package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lh1  reason: default package */
/* loaded from: classes.dex */
public final class lh1 implements gx9 {
    public final mh1 a;
    public final fx9 b;
    public final int c;
    public boolean d;
    public final /* synthetic */ mh1 e;

    public lh1(mh1 mh1Var, mh1 mh1Var2, fx9 fx9Var, int i) {
        this.e = mh1Var;
        this.a = mh1Var2;
        this.b = fx9Var;
        this.c = i;
    }

    @Override // defpackage.gx9
    public final boolean a() {
        mh1 mh1Var = this.e;
        if (!mh1Var.z() && this.b.z(mh1Var.V)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gx9
    public final int c(s6f s6fVar, cr2 cr2Var, int i) {
        mh1 mh1Var = this.e;
        if (!mh1Var.z()) {
            ai0 ai0Var = mh1Var.R;
            fx9 fx9Var = this.b;
            if (ai0Var != null && ai0Var.e(this.c + 1) <= fx9Var.u()) {
                return -3;
            }
            d();
            return fx9Var.E(s6fVar, cr2Var, i, mh1Var.V);
        }
        return -3;
    }

    public final void d() {
        if (!this.d) {
            mh1 mh1Var = this.e;
            cl3 cl3Var = mh1Var.C;
            int[] iArr = mh1Var.b;
            int i = this.c;
            cl3Var.b(iArr[i], mh1Var.c[i], 0, null, mh1Var.P);
            this.d = true;
        }
    }

    @Override // defpackage.gx9
    public final int m(long j) {
        mh1 mh1Var = this.e;
        if (mh1Var.z()) {
            return 0;
        }
        boolean z = mh1Var.V;
        fx9 fx9Var = this.b;
        int w = fx9Var.w(z, j);
        ai0 ai0Var = mh1Var.R;
        if (ai0Var != null) {
            w = Math.min(w, ai0Var.e(this.c + 1) - fx9Var.u());
        }
        fx9Var.J(w);
        if (w > 0) {
            d();
        }
        return w;
    }

    @Override // defpackage.gx9
    public final void b() {
    }
}
