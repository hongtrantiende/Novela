package defpackage;

import android.util.SparseArray;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tz0  reason: default package */
/* loaded from: classes.dex */
public final class tz0 implements t94 {
    public static final fr2 G = new Object();
    public kw5 C;
    public long D;
    public m4a E;
    public vq4[] F;
    public final r94 a;
    public final int b;
    public final vq4 c;
    public final SparseArray d;
    public final sz0 e;
    public boolean f;

    public tz0(r94 r94Var, int i, vq4 vq4Var) {
        sz0 sz0Var = sz0.b;
        this.a = r94Var;
        this.b = i;
        this.c = vq4Var;
        this.d = new SparseArray();
        this.e = sz0Var;
    }

    public final jh1 a() {
        m4a m4aVar = this.E;
        if (m4aVar instanceof jh1) {
            return (jh1) m4aVar;
        }
        if (m4aVar instanceof q27) {
            return ((q27) m4aVar).a;
        }
        return null;
    }

    public final void b(kw5 kw5Var, long j, long j2) {
        this.C = kw5Var;
        this.D = j2;
        boolean z = this.f;
        r94 r94Var = this.a;
        if (!z) {
            r94Var.f(this);
            if (j != -9223372036854775807L) {
                r94Var.d(0L, j);
            }
            this.f = true;
            return;
        }
        if (j == -9223372036854775807L) {
            j = 0;
        }
        r94Var.d(0L, j);
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.d;
            if (i < sparseArray.size()) {
                rz0 rz0Var = (rz0) sparseArray.valueAt(i);
                if (kw5Var == null) {
                    rz0Var.f = rz0Var.c;
                } else {
                    rz0Var.g = j2;
                    fjc E = kw5Var.E(rz0Var.a);
                    rz0Var.f = E;
                    vq4 vq4Var = rz0Var.e;
                    if (vq4Var != null) {
                        E.g(vq4Var);
                    }
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.t94
    public final void m() {
        SparseArray sparseArray = this.d;
        vq4[] vq4VarArr = new vq4[sparseArray.size()];
        for (int i = 0; i < sparseArray.size(); i++) {
            vq4 vq4Var = ((rz0) sparseArray.valueAt(i)).e;
            vq4Var.getClass();
            vq4VarArr[i] = vq4Var;
        }
        this.F = vq4VarArr;
    }

    @Override // defpackage.t94
    public final fjc s(int i, int i2) {
        boolean z;
        vq4 vq4Var;
        SparseArray sparseArray = this.d;
        rz0 rz0Var = (rz0) sparseArray.get(i);
        if (rz0Var == null) {
            if (this.F == null) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
            if (i2 == this.b) {
                vq4Var = this.c;
            } else {
                vq4Var = null;
            }
            rz0Var = new rz0(i, i2, vq4Var, this.e);
            kw5 kw5Var = this.C;
            long j = this.D;
            if (kw5Var == null) {
                rz0Var.f = rz0Var.c;
            } else {
                rz0Var.g = j;
                fjc E = kw5Var.E(i2);
                rz0Var.f = E;
                vq4 vq4Var2 = rz0Var.e;
                if (vq4Var2 != null) {
                    E.g(vq4Var2);
                }
            }
            sparseArray.put(i, rz0Var);
        }
        return rz0Var;
    }

    @Override // defpackage.t94
    public final void v(m4a m4aVar) {
        this.E = m4aVar;
    }
}
