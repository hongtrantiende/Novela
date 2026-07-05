package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zc2  reason: default package */
/* loaded from: classes.dex */
public final class zc2 {
    public final cs5 a;
    public wc2 b;
    public boolean c;
    public final boolean d;
    public final hm8 e;
    public final rk9 f;
    public rk9 g;
    public final hm8 h;
    public final h23 i;
    public final hm8 j;
    public final hm8 k;
    public final hm8 l;
    public final hm8 m;
    public final /* synthetic */ pl5 n;
    public final /* synthetic */ ym5 o;

    public zc2(pl5 pl5Var, ym5 ym5Var) {
        this.n = pl5Var;
        this.o = ym5Var;
        cs5 cs5Var = cs5.d;
        this.a = cs5Var;
        this.b = yc2.a;
        this.d = true;
        this.e = yae.z(cs5Var);
        rk9 n = npe.n(0L, eg0.A(pl5Var.b));
        this.f = n;
        this.g = n;
        this.h = yae.z(n);
        this.i = yae.q(new t7(26, this, pl5Var));
        this.j = yae.z(this.b);
        this.k = yae.z(Boolean.TRUE);
        this.l = yae.z(Boolean.valueOf(this.c));
        this.m = yae.z(Boolean.FALSE);
    }

    public final cs5 a() {
        return (cs5) this.e.getValue();
    }

    public final rk9 b() {
        return (rk9) this.h.getValue();
    }

    public final void c(rk9 rk9Var) {
        char c;
        rk9 rk9Var2;
        rk9Var.getClass();
        rk9 b = b();
        rk9 rk9Var3 = (rk9) this.i.getValue();
        boolean booleanValue = ((Boolean) this.l.getValue()).booleanValue();
        b.getClass();
        float f = rk9Var.b;
        float f2 = rk9Var.d;
        rk9Var3.getClass();
        float f3 = rk9Var3.b;
        float f4 = rk9Var3.a;
        float f5 = rk9Var3.d;
        float f6 = rk9Var3.c;
        float f7 = b.c - b.a;
        float f8 = rk9Var.c;
        float f9 = rk9Var.a;
        if (Math.abs((f8 - f9) - f7) <= 2.4414062E-4f && Math.abs((f2 - f) - (b.d - b.b)) <= 2.4414062E-4f) {
            rk9Var2 = lpe.q(rk9Var, rk9Var3);
        } else {
            if (booleanValue) {
                long h = rk9Var.h();
                long h2 = b.h();
                c = ' ';
                float intBitsToFloat = Float.intBitsToFloat((int) (h & 4294967295L)) * Float.intBitsToFloat((int) (h >> 32));
                int i = (int) (h2 >> 32);
                int i2 = (int) (h2 & 4294967295L);
                rk9Var2 = lpe.y(rk9Var, b, (Float.floatToRawIntBits((float) Math.sqrt((Float.intBitsToFloat(i) * intBitsToFloat) / Float.intBitsToFloat(i2))) << 32) | (Float.floatToRawIntBits((float) Math.sqrt((Float.intBitsToFloat(i2) * intBitsToFloat) / Float.intBitsToFloat(i))) & 4294967295L));
                float f10 = rk9Var2.a;
                float f11 = rk9Var2.b;
                float f12 = rk9Var2.c;
                float f13 = rk9Var2.d;
                float f14 = f6 - f10;
                float f15 = f12 - f10;
                float f16 = f5 - f11;
                float f17 = f13 - f11;
                float t = hxe.t(f14 / f15, f16 / f17, (f12 - f4) / f15, (f13 - f3) / f17);
                if (t < 1.0f) {
                    rk9Var2 = lpe.y(rk9Var2, b, dna.e(t, rk9Var2.h()));
                }
            } else {
                c = ' ';
                if (f9 >= f4) {
                    f4 = f9;
                }
                if (f < f3) {
                    f = f3;
                }
                if (f8 <= f6) {
                    f6 = f8;
                }
                if (f2 > f5) {
                    f2 = f5;
                }
                rk9Var2 = new rk9(f4, f, f6, f2);
            }
            if (rk9Var2.l()) {
                rk9Var2 = lpe.q(lpe.y(rk9Var2, b, (Float.floatToRawIntBits(1.0f) << c) | (Float.floatToRawIntBits(1.0f) & 4294967295L)), rk9Var3);
            }
        }
        this.h.setValue(rk9Var2);
    }

    public final void d(cs5 cs5Var) {
        cs5Var.getClass();
        cs5 a = a();
        long j = this.n.b;
        float[] g = dye.g(a, j);
        l27.b(g);
        this.h.setValue(l27.d(dye.g(cs5Var, j), l27.d(g, b())));
        this.e.setValue(cs5Var);
    }
}
