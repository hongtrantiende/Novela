package defpackage;

import java.io.EOFException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q88  reason: default package */
/* loaded from: classes.dex */
public final class q88 {
    public final r88 a = new r88();
    public final km8 b = new km8(new byte[65025], 0);
    public int c = -1;
    public int d;
    public boolean e;

    public final int a(int i) {
        int i2;
        int i3 = 0;
        this.d = 0;
        do {
            int i4 = this.d;
            int i5 = i + i4;
            r88 r88Var = this.a;
            if (i5 >= r88Var.c) {
                break;
            }
            int[] iArr = r88Var.f;
            this.d = i4 + 1;
            i2 = iArr[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final boolean b(s94 s94Var) {
        boolean z;
        boolean z2;
        int i;
        if (s94Var != null) {
            z = true;
        } else {
            z = false;
        }
        wq9.D(z);
        boolean z3 = this.e;
        km8 km8Var = this.b;
        if (z3) {
            this.e = false;
            km8Var.J(0);
        }
        while (!this.e) {
            int i2 = this.c;
            r88 r88Var = this.a;
            if (i2 < 0) {
                if (r88Var.b(s94Var, -1L) && r88Var.a(s94Var, true)) {
                    int i3 = r88Var.d;
                    if ((r88Var.a & 1) == 1 && km8Var.c == 0) {
                        i3 += a(0);
                        i = this.d;
                    } else {
                        i = 0;
                    }
                    try {
                        s94Var.q(i3);
                        this.c = i;
                    } catch (EOFException unused) {
                    }
                }
                return false;
            }
            int a = a(this.c);
            int i4 = this.c + this.d;
            if (a > 0) {
                km8Var.c(km8Var.c + a);
                try {
                    s94Var.readFully(km8Var.a, km8Var.c, a);
                    km8Var.L(km8Var.c + a);
                    if (r88Var.f[i4 - 1] != 255) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    this.e = z2;
                } catch (EOFException unused2) {
                    return false;
                }
            }
            if (i4 == r88Var.c) {
                i4 = -1;
            }
            this.c = i4;
        }
        return true;
    }
}
