package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zsb  reason: default package */
/* loaded from: classes3.dex */
public final class zsb {
    public static final yy9 g = oue.G(new tsa(7, (byte) 0), new clb(17));
    public final dm8 a;
    public final dm8 b = new dm8(nae.e);
    public final em8 c = new em8(0);
    public rk9 d = rk9.e;
    public long e = fxb.b;
    public final hm8 f;

    public zsb(ff8 ff8Var, float f) {
        this.a = new dm8(f);
        this.f = new hm8(ff8Var, zj1.G);
    }

    public final void a(ff8 ff8Var, rk9 rk9Var, int i, int i2) {
        boolean z;
        float f;
        int i3;
        float f2;
        float f3 = i2 - i;
        this.b.i(f3);
        float f4 = rk9Var.a;
        float f5 = rk9Var.b;
        rk9 rk9Var2 = this.d;
        int i4 = (f4 > rk9Var2.a ? 1 : (f4 == rk9Var2.a ? 0 : -1));
        dm8 dm8Var = this.a;
        if (i4 != 0 || f5 != rk9Var2.b) {
            if (ff8Var == ff8.a) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f4 = f5;
            }
            if (z) {
                f = rk9Var.d;
            } else {
                f = rk9Var.c;
            }
            float h = dm8Var.h();
            float f6 = i;
            float f7 = h + f6;
            if (f > f7 || (f4 < h && f - f4 > f6)) {
                f2 = f - f7;
            } else if (i3 < 0 && f - f4 <= f6) {
                f2 = f4 - h;
            } else {
                f2 = 0.0f;
            }
            dm8Var.i(dm8Var.h() + f2);
            this.d = rk9Var;
        }
        dm8Var.i(dce.m(dm8Var.h(), nae.e, f3));
        this.c.i(i);
    }
}
