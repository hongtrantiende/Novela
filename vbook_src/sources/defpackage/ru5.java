package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ru5  reason: default package */
/* loaded from: classes.dex */
public final class ru5 implements hj3 {
    public c5d C;
    public zg1 D;
    public final jt1 E;
    public final jt1 F;
    public final ti3 a;
    public mu5 b;
    public pu5 c;
    public ou5 d;
    public nu5 e;
    public lye f;

    public ru5(ti3 ti3Var) {
        this.a = ti3Var;
        jt1 jt1Var = new jt1((char) 0, 1);
        jt1Var.c = new kv7();
        this.E = jt1Var;
        jt1 jt1Var2 = new jt1((char) 0, 7);
        jt1Var2.c = new bv7();
        this.F = jt1Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, ou5] */
    public static void c(ru5 ru5Var, ku5 ku5Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        ti3 ti3Var = ru5Var.a;
        ou5 ou5Var = ru5Var.d;
        ou5 ou5Var2 = ou5Var;
        if (ou5Var == null) {
            ?? obj = new Object();
            obj.f = null;
            obj.g = Long.MAX_VALUE;
            obj.h = false;
            ru5Var.d = obj;
            ou5Var2 = obj;
        }
        ou5Var2.f = ku5Var;
        ou5Var2.g = j;
        zg1 zg1Var = ru5Var.D;
        ff8 ff8Var = ti3Var.M;
        if (zg1Var == null) {
            ru5Var.D = new zg1(ff8Var, 2);
        } else {
            zg1Var.c = ff8Var;
            zg1Var.b = j2;
        }
        ou5Var2.h = false;
        ru5Var.f = ou5Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mu5] */
    public final void a() {
        mu5 mu5Var = this.b;
        lu5 lu5Var = lu5.c;
        mu5 mu5Var2 = mu5Var;
        if (mu5Var == null) {
            ?? obj = new Object();
            obj.f = lu5Var;
            obj.g = false;
            obj.h = false;
            this.b = obj;
            mu5Var2 = obj;
        }
        mu5Var2.f = lu5Var;
        mu5Var2.g = false;
        mu5Var2.h = false;
        this.f = mu5Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nu5] */
    public final void b(ku5 ku5Var, long j, zg1 zg1Var) {
        nu5 nu5Var = this.e;
        nu5 nu5Var2 = nu5Var;
        if (nu5Var == null) {
            ?? obj = new Object();
            obj.f = null;
            obj.g = Long.MAX_VALUE;
            this.e = obj;
            nu5Var2 = obj;
        }
        nu5Var2.f = ku5Var;
        nu5Var2.g = j;
        zg1Var.b = 0L;
        this.f = nu5Var2;
    }

    public final c5d d() {
        c5d c5dVar = this.C;
        if (c5dVar != null) {
            return c5dVar;
        }
        vs.m("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(ku5 ku5Var, ju5 ju5Var, long j) {
        long j2;
        long j3;
        float intBitsToFloat;
        long j4 = ku5Var.c;
        ti3 ti3Var = this.a;
        ff8 ff8Var = ti3Var.M;
        ff8Var.getClass();
        ij3 ij3Var = nj3.a;
        long j5 = 4294967295L;
        if (ff8Var == ff8.a) {
            j2 = j & 4294967295L;
        } else {
            j2 = j >> 32;
        }
        if (Math.abs(Float.intBitsToFloat((int) j2)) > 2.0f) {
            c5d d = d();
            ff8 ff8Var2 = ti3Var.M;
            jt1 jt1Var = this.E;
            kv7 kv7Var = (kv7) jt1Var.c;
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j4 >> 32));
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j4 & 4294967295L));
            if (nye.o(ku5Var)) {
                jt1Var.b = 0;
                kv7Var.d();
            }
            boolean n = nye.n(ku5Var);
            float f = nae.e;
            if (!n && !nye.o(ku5Var)) {
                if (kv7Var.b == 3) {
                    int i = jt1Var.b;
                    jt1Var.b = i + 1;
                    kv7Var.n(i, ku5Var);
                } else {
                    kv7Var.a(ku5Var);
                }
                if (jt1Var.b == 3) {
                    jt1Var.b = 0;
                }
                Object[] objArr = kv7Var.a;
                int i2 = kv7Var.b;
                int i3 = 0;
                float f2 = 0.0f;
                while (i3 < i2) {
                    f2 += Float.intBitsToFloat((int) (((ku5) objArr[i3]).c >> 32));
                    i3++;
                    j5 = j5;
                }
                j3 = j5;
                int i4 = kv7Var.b;
                intBitsToFloat2 = f2 / i4;
                Object[] objArr2 = kv7Var.a;
                float f3 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    f3 += Float.intBitsToFloat((int) (((ku5) objArr2[i5]).c & j3));
                }
                intBitsToFloat3 = f3 / kv7Var.b;
            } else {
                j3 = 4294967295L;
            }
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat3) & j3) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
            if (ff8Var2 != null) {
                int i6 = ju5Var.a;
                if (i6 == 1) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j3));
                }
                floatToRawIntBits = ff8Var2 == ff8.b ? (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(nae.e) & j3) : (Float.floatToRawIntBits(intBitsToFloat) & j3) | (Float.floatToRawIntBits(nae.e) << 32);
            }
            d.a(ku5Var.b, floatToRawIntBits);
            jt1 jt1Var2 = this.F;
            bv7 bv7Var = (bv7) jt1Var2.c;
            if (bv7Var.b == 3) {
                int i7 = jt1Var2.b;
                jt1Var2.b = i7 + 1;
                bv7Var.e(i7, j);
            } else {
                bv7Var.a(j);
            }
            if (jt1Var2.b == 3) {
                jt1Var2.b = 0;
            }
            long[] jArr = bv7Var.a;
            int i8 = bv7Var.b;
            float f4 = 0.0f;
            for (int i9 = 0; i9 < i8; i9++) {
                f4 += Float.intBitsToFloat((int) (jArr[i9] >> 32));
            }
            int i10 = bv7Var.b;
            float f5 = f4 / i10;
            long[] jArr2 = bv7Var.a;
            for (int i11 = 0; i11 < i10; i11++) {
                f = Float.intBitsToFloat((int) (jArr2[i11] & j3)) + f;
            }
            float f6 = f / bv7Var.b;
            ti3Var.S1(new rh3(true, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f6) & j3)));
        }
    }

    public final void f(ku5 ku5Var, ku5 ku5Var2, ju5 ju5Var, long j) {
        char c;
        long j2;
        float intBitsToFloat;
        if (this.C == null) {
            this.C = new c5d();
        }
        c5d d = d();
        ti3 ti3Var = this.a;
        ff8 ff8Var = ti3Var.M;
        jt1 jt1Var = this.E;
        kv7 kv7Var = (kv7) jt1Var.c;
        char c2 = ' ';
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ku5Var.c >> 32));
        long j3 = 4294967295L;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (ku5Var.c & 4294967295L));
        if (nye.o(ku5Var)) {
            jt1Var.b = 0;
            kv7Var.d();
        }
        if (!nye.n(ku5Var) && !nye.o(ku5Var)) {
            if (kv7Var.b == 3) {
                int i = jt1Var.b;
                jt1Var.b = i + 1;
                kv7Var.n(i, ku5Var);
            } else {
                kv7Var.a(ku5Var);
            }
            if (jt1Var.b == 3) {
                jt1Var.b = 0;
            }
            Object[] objArr = kv7Var.a;
            int i2 = kv7Var.b;
            int i3 = 0;
            float f = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                f += Float.intBitsToFloat((int) (((ku5) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = kv7Var.b;
            intBitsToFloat2 = f / i4;
            Object[] objArr2 = kv7Var.a;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += Float.intBitsToFloat((int) (((ku5) objArr2[i5]).c & j2));
            }
            intBitsToFloat3 = f2 / kv7Var.b;
        } else {
            c = ' ';
            j2 = 4294967295L;
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) << c) | (Float.floatToRawIntBits(intBitsToFloat3) & j2);
        if (ff8Var != null) {
            int i6 = ju5Var.a;
            if (i6 == 1) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> c));
            } else if (i6 == 2) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits & j2));
            }
            floatToRawIntBits = ff8Var == ff8.b ? (Float.floatToRawIntBits(intBitsToFloat) << c) | (Float.floatToRawIntBits(nae.e) & j2) : (Float.floatToRawIntBits(nae.e) << c) | (Float.floatToRawIntBits(intBitsToFloat) & j2);
        }
        d.a(ku5Var.b, floatToRawIntBits);
        long i7 = y78.i(nye.z(ku5Var2, ti3Var.M, ju5Var), j);
        if (((Boolean) ti3Var.N.invoke(new i19(1))).booleanValue()) {
            ti3Var.S1(new sh3(i7));
        }
        jt1 jt1Var2 = this.F;
        jt1Var2.b = 0;
        ((bv7) jt1Var2.c).b = 0;
    }

    @Override // defpackage.hj3
    public final ff8 o() {
        return this.a.M;
    }

    @Override // defpackage.ax4
    public final String x0() {
        lye lyeVar = this.f;
        if (lyeVar instanceof mu5) {
            if (((mu5) lyeVar).h) {
                return "waiting";
            }
            return "idle";
        } else if ((lyeVar instanceof ou5) || (lyeVar instanceof nu5)) {
            return "waiting";
        } else {
            if (lyeVar instanceof pu5) {
                return "recognized";
            }
            return "idle";
        }
    }
}
