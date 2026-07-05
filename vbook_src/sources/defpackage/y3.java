package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y3  reason: default package */
/* loaded from: classes.dex */
public final class y3 implements r94 {
    public final z3 a = new z3("audio/ac3");
    public final km8 b = new km8(2786);
    public boolean c;

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        km8 km8Var = this.b;
        int read = s94Var.read(km8Var.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        km8Var.M(0);
        km8Var.L(read);
        boolean z = this.c;
        z3 z3Var = this.a;
        if (!z) {
            z3Var.o = 0L;
            this.c = true;
        }
        z3Var.b(km8Var);
        return 0;
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        tt2 tt2Var;
        int o;
        km8 km8Var = new km8(10);
        int i = 0;
        while (true) {
            tt2Var = (tt2) s94Var;
            tt2Var.f(km8Var.a, 0, 10, false);
            km8Var.M(0);
            if (km8Var.C() != 4801587) {
                break;
            }
            km8Var.N(3);
            int y = km8Var.y();
            i += y + 10;
            tt2Var.b(y, false);
        }
        tt2Var.f = 0;
        tt2Var.b(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            tt2Var.f(km8Var.a, 0, 6, false);
            km8Var.M(0);
            if (km8Var.G() != 2935) {
                tt2Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                tt2Var.b(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = km8Var.a;
                if (bArr.length < 6) {
                    o = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    o = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    o = ch0.o((b & 192) >> 6, b & 63);
                }
                if (o == -1) {
                    break;
                }
                tt2Var.b(o - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.a.f(t94Var, new zc7(0, 1));
        t94Var.m();
        t94Var.v(new ge0(-9223372036854775807L));
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
