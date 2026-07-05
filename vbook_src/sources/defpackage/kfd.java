package defpackage;

import java.math.RoundingMode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kfd  reason: default package */
/* loaded from: classes.dex */
public final class kfd implements jfd {
    public final t94 a;
    public final fjc b;
    public final lm8 c;
    public final vq4 d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public kfd(t94 t94Var, fjc fjcVar, lm8 lm8Var, String str, int i) {
        this.a = t94Var;
        this.b = fjcVar;
        this.c = lm8Var;
        int i2 = lm8Var.a;
        int i3 = lm8Var.b;
        int i4 = (lm8Var.d * i2) / 8;
        int i5 = lm8Var.c;
        if (i5 == i4) {
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int max = Math.max(i4, i6 / 10);
            this.e = max;
            uq4 uq4Var = new uq4();
            uq4Var.m = lc7.p("audio/wav");
            uq4Var.n = lc7.p(str);
            uq4Var.h = i7;
            uq4Var.i = i7;
            uq4Var.o = max;
            uq4Var.F = i2;
            uq4Var.G = i3;
            uq4Var.H = i;
            this.d = new vq4(uq4Var);
            return;
        }
        throw xm8.a(null, "Expected block size: " + i4 + "; got: " + i5);
    }

    @Override // defpackage.jfd
    public final void a(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.jfd
    public final boolean b(s94 s94Var, long j) {
        int i;
        int i2;
        int i3;
        long j2 = j;
        while (true) {
            i = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
            if (i <= 0 || (i2 = this.g) >= (i3 = this.e)) {
                break;
            }
            int f = this.b.f(s94Var, (int) Math.min(i3 - i2, j2), true);
            if (f == -1) {
                j2 = 0;
            } else {
                this.g += f;
                j2 -= f;
            }
        }
        lm8 lm8Var = this.c;
        int i4 = lm8Var.c;
        int i5 = this.g / i4;
        if (i5 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = lm8Var.b;
            String str = a2d.a;
            int i6 = i5 * i4;
            int i7 = this.g - i6;
            this.b.a(j3 + a2d.Y(j4, 1000000L, j5, RoundingMode.DOWN), 1, i6, i7, null);
            this.h += i5;
            this.g = i7;
        }
        if (i <= 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jfd
    public final void c(int i, long j) {
        mfd mfdVar = new mfd(this.c, 1, i, j);
        this.a.v(mfdVar);
        vq4 vq4Var = this.d;
        fjc fjcVar = this.b;
        fjcVar.g(vq4Var);
        fjcVar.d(mfdVar.e);
    }
}
