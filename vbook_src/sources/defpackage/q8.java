package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q8  reason: default package */
/* loaded from: classes.dex */
public final class q8 implements r94 {
    public final km8 c;
    public final ea1 d;
    public t94 e;
    public long f;
    public boolean h;
    public boolean i;
    public final r8 a = new r8(0, null, "audio/mp4a-latm", true);
    public final km8 b = new km8(2048);
    public long g = -1;

    public q8(int i) {
        km8 km8Var = new km8(10);
        this.c = km8Var;
        byte[] bArr = km8Var.a;
        this.d = new ea1(bArr, bArr.length);
    }

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        boolean z;
        this.e.getClass();
        s94Var.getLength();
        km8 km8Var = this.b;
        int read = s94Var.read(km8Var.a, 0, 2048);
        if (read == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!this.i) {
            this.e.v(new ge0(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        km8Var.M(0);
        km8Var.L(read);
        boolean z2 = this.h;
        r8 r8Var = this.a;
        if (!z2) {
            r8Var.u = this.f;
            this.h = true;
        }
        r8Var.b(km8Var);
        return 0;
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        km8 km8Var;
        int i = 0;
        while (true) {
            km8Var = this.c;
            s94Var.x(km8Var.a, 0, 10);
            km8Var.M(0);
            if (km8Var.C() != 4801587) {
                break;
            }
            km8Var.N(3);
            int y = km8Var.y();
            i += y + 10;
            s94Var.i(y);
        }
        s94Var.p();
        s94Var.i(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            tt2 tt2Var = (tt2) s94Var;
            tt2Var.f(km8Var.a, 0, 2, false);
            km8Var.M(0);
            if ((km8Var.G() & 65526) == 65520) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                tt2Var.f(km8Var.a, 0, 4, false);
                ea1 ea1Var = this.d;
                ea1Var.m(14);
                int g = ea1Var.g(13);
                if (g <= 6) {
                    i4++;
                    tt2Var.f = 0;
                    tt2Var.b(i4, false);
                } else {
                    tt2Var.b(g - 6, false);
                    i3 += g;
                }
            } else {
                i4++;
                tt2Var.f = 0;
                tt2Var.b(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        this.h = false;
        this.a.c();
        this.f = j2;
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.e = t94Var;
        this.a.f(t94Var, new zc7(0, 1));
        t94Var.m();
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
