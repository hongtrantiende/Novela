package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lrd  reason: default package */
/* loaded from: classes.dex */
public final class lrd extends mq7 implements zj3, wx1 {
    public btd K;
    public t1a L;
    public final lq M;
    public uy5 N;
    public iya O;

    public lrd(btd btdVar, t1a t1aVar) {
        t1aVar.getClass();
        this.K = btdVar;
        this.L = t1aVar;
        this.M = tc4.a(1.0f, 0.01f);
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        boolean z;
        float f;
        float f2;
        float f3;
        qd6Var.a();
        long f4 = this.K.f();
        rk9 rk9Var = (rk9) this.K.a0.getValue();
        mfb mfbVar = yw1.a;
        rk9Var.getClass();
        int A = k27.A(rk9Var.a);
        int A2 = k27.A(rk9Var.b);
        int A3 = k27.A(rk9Var.c);
        int A4 = k27.A(rk9Var.d);
        uy5 uy5Var = new uy5(A, A2, A3, A4);
        if (!yw1.a(f4) && !uy5Var.f()) {
            if (!c16.i(this.N, uy5Var)) {
                this.N = uy5Var;
                iya iyaVar = this.O;
                if (iyaVar != null) {
                    iyaVar.cancel(null);
                }
                m82 v1 = v1();
                sw2 sw2Var = ab3.a;
                this.O = z87.v(v1, zz6.a.f, null, new rzc(this, null, 7), 2);
            }
            float f5 = this.K.g().c;
            r13 r13Var = (r13) nye.q(this, dy1.h);
            float L0 = r13Var.L0(this.L.b);
            float L02 = r13Var.L0(this.L.c);
            float f6 = L0 / 2.0f;
            long floatToRawIntBits = (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f6) & 4294967295L);
            float L03 = r13Var.L0(10.0f);
            float floatValue = ((Number) this.M.e()).floatValue();
            int A5 = k27.A(f5);
            if (A5 % 90 == 0) {
                int i = A5 % 360;
                if (i < 0) {
                    i += 360;
                }
                if (i != 90) {
                    if (i != 180) {
                        if (i == 270) {
                            int i2 = (int) (f4 >> 32);
                            uy5Var = new uy5(A2, i2 - A3, A4, i2 - A);
                        }
                    } else {
                        int i3 = (int) (f4 >> 32);
                        int i4 = (int) (f4 & 4294967295L);
                        uy5Var = new uy5(i3 - A3, i4 - A4, i3 - A, i4 - A2);
                    }
                } else {
                    int i5 = (int) (f4 & 4294967295L);
                    uy5Var = new uy5(i5 - A4, A, i5 - A2, A3);
                }
                if (k27.A(f5) % 180 != 0) {
                    f4 = (((int) (f4 & 4294967295L)) << 32) | (((int) (f4 >> 32)) & 4294967295L);
                }
                long b = qd6Var.a.b();
                int i6 = (int) (f4 >> 32);
                boolean z2 = false;
                if (uy5Var.e() < i6) {
                    z = true;
                } else {
                    z = false;
                }
                int i7 = (int) (f4 & 4294967295L);
                if (uy5Var.b() < i7) {
                    z2 = true;
                }
                ye4 ye4Var = ye4.a;
                if (z) {
                    float intBitsToFloat = (Float.intBitsToFloat((int) (b >> 32)) - (L02 * 4.0f)) / i6;
                    long j = this.L.a;
                    f = 4.0f;
                    f2 = L03;
                    long floatToRawIntBits2 = (Float.floatToRawIntBits((uy5Var.a * intBitsToFloat) + (L02 * 2.0f)) << 32) | (Float.floatToRawIntBits((Float.intBitsToFloat((int) (b & 4294967295L)) - L02) - L0) & 4294967295L);
                    float e = uy5Var.e() * intBitsToFloat;
                    if (e < f2) {
                        e = f2;
                    }
                    ak3.Y(qd6Var, j, floatToRawIntBits2, (Float.floatToRawIntBits(e) << 32) | (Float.floatToRawIntBits(L0) & 4294967295L), floatToRawIntBits, ye4Var, floatValue, 192);
                } else {
                    f = 4.0f;
                    f2 = L03;
                }
                if (z2) {
                    float intBitsToFloat2 = (Float.intBitsToFloat((int) (b & 4294967295L)) - (L02 * f)) / i7;
                    long j2 = this.L.a;
                    float f7 = uy5Var.b * intBitsToFloat2;
                    long floatToRawIntBits3 = (Float.floatToRawIntBits((Float.intBitsToFloat((int) (b >> 32)) - L02) - L0) << 32) | (Float.floatToRawIntBits(f7 + (L02 * 2.0f)) & 4294967295L);
                    float b2 = uy5Var.b() * intBitsToFloat2;
                    if (b2 < f2) {
                        f3 = f2;
                    } else {
                        f3 = b2;
                    }
                    ak3.Y(qd6Var, j2, floatToRawIntBits3, (Float.floatToRawIntBits(L0) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L), floatToRawIntBits, ye4Var, floatValue, 192);
                    return;
                }
                return;
            }
            p1a.k(a82.j(A5, "rotation must be a multiple of 90, rotation: "));
        }
    }
}
