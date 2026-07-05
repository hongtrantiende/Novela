package defpackage;

import java.io.IOException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z79  reason: default package */
/* loaded from: classes.dex */
public final class z79 implements gx9 {
    public final int a;
    public final /* synthetic */ b89 b;

    public z79(b89 b89Var, int i) {
        this.b = b89Var;
        this.a = i;
    }

    @Override // defpackage.gx9
    public final boolean a() {
        b89 b89Var = this.b;
        if (!b89Var.G() && b89Var.Q[this.a].z(b89Var.l0)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gx9
    public final void b() {
        int i = this.a;
        b89 b89Var = this.b;
        b89Var.Q[i].B();
        ij1 ij1Var = b89Var.H;
        int r = b89Var.d.r(b89Var.a0);
        IOException iOException = (IOException) ij1Var.d;
        if (iOException == null) {
            fs6 fs6Var = (fs6) ij1Var.c;
            if (fs6Var != null) {
                if (r == Integer.MIN_VALUE) {
                    r = fs6Var.a;
                }
                IOException iOException2 = fs6Var.e;
                if (iOException2 != null && fs6Var.f > r) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    @Override // defpackage.gx9
    public final int c(s6f s6fVar, cr2 cr2Var, int i) {
        b89 b89Var = this.b;
        if (b89Var.G()) {
            return -3;
        }
        int i2 = this.a;
        b89Var.B(i2);
        int E = b89Var.Q[i2].E(s6fVar, cr2Var, i, b89Var.l0);
        if (E == -3) {
            b89Var.C(i2);
        }
        return E;
    }

    @Override // defpackage.gx9
    public final int m(long j) {
        b89 b89Var = this.b;
        if (b89Var.G()) {
            return 0;
        }
        int i = this.a;
        b89Var.B(i);
        fx9 fx9Var = b89Var.Q[i];
        int w = fx9Var.w(b89Var.l0, j);
        fx9Var.J(w);
        if (w == 0) {
            b89Var.C(i);
        }
        return w;
    }
}
