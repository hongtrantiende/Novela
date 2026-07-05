package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r88  reason: default package */
/* loaded from: classes.dex */
public final class r88 {
    public int a;
    public long b;
    public int c;
    public int d;
    public int e;
    public final int[] f = new int[255];
    public final km8 g = new km8(255);

    public final boolean a(s94 s94Var, boolean z) {
        boolean z2;
        boolean z3;
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        km8 km8Var = this.g;
        km8Var.J(27);
        try {
            z2 = s94Var.f(km8Var.a, 0, 27, z);
        } catch (EOFException e) {
            if (z) {
                z2 = false;
            } else {
                throw e;
            }
        }
        if (z2 && km8Var.B() == 1332176723) {
            if (km8Var.z() != 0) {
                if (!z) {
                    throw xm8.c("unsupported bit stream revision");
                }
            } else {
                this.a = km8Var.z();
                this.b = km8Var.p();
                km8Var.q();
                km8Var.q();
                km8Var.q();
                int z4 = km8Var.z();
                this.c = z4;
                this.d = z4 + 27;
                km8Var.J(z4);
                try {
                    z3 = s94Var.f(km8Var.a, 0, this.c, z);
                } catch (EOFException e2) {
                    if (z) {
                        z3 = false;
                    } else {
                        throw e2;
                    }
                }
                if (z3) {
                    for (int i = 0; i < this.c; i++) {
                        int z5 = km8Var.z();
                        this.f[i] = z5;
                        this.e += z5;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean b(s94 s94Var, long j) {
        boolean z;
        int i;
        boolean z2;
        if (s94Var.getPosition() == s94Var.h()) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        km8 km8Var = this.g;
        km8Var.J(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (i != 0 && s94Var.getPosition() + 4 >= j) {
                break;
            }
            try {
                z2 = s94Var.f(km8Var.a, 0, 4, true);
            } catch (EOFException unused) {
                z2 = false;
            }
            if (!z2) {
                break;
            }
            km8Var.M(0);
            if (km8Var.B() == 1332176723) {
                s94Var.p();
                return true;
            }
            s94Var.q(1);
        }
        do {
            if (i != 0 && s94Var.getPosition() >= j) {
                break;
            }
        } while (s94Var.j(1) != -1);
        return false;
    }
}
