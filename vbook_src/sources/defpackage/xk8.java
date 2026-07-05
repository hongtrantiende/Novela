package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xk8  reason: default package */
/* loaded from: classes.dex */
public final class xk8 extends mq7 implements fd6, zj3 {
    public vk8 K;
    public boolean L;
    public dc M;
    public w22 N;
    public float O;
    public em1 P;

    public static boolean I1(long j) {
        if (!dna.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    public static boolean J1(long j) {
        if (!dna.a(j, 9205357640488583168L) && (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32))) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fd6
    public final int H0(ry6 ry6Var, w27 w27Var, int i) {
        if (H1()) {
            long K1 = K1(y02.b(0, i, 0, 0, 13));
            return Math.max(x02.j(K1), w27Var.j(i));
        }
        return w27Var.j(i);
    }

    public final boolean H1() {
        if (this.L && this.K.h() != 9205357640488583168L) {
            return true;
        }
        return false;
    }

    public final long K1(long j) {
        boolean z;
        int k;
        int j2;
        float intBitsToFloat;
        float intBitsToFloat2;
        boolean z2 = false;
        if (x02.e(j) && x02.d(j)) {
            z = true;
        } else {
            z = false;
        }
        if (x02.g(j) && x02.f(j)) {
            z2 = true;
        }
        if ((!H1() && z) || z2) {
            return x02.b(j, x02.i(j), 0, x02.h(j), 0, 10);
        }
        long h = this.K.h();
        if (J1(h)) {
            k = Math.round(Float.intBitsToFloat((int) (h >> 32)));
        } else {
            k = x02.k(j);
        }
        if (I1(h)) {
            j2 = Math.round(Float.intBitsToFloat((int) (h & 4294967295L)));
        } else {
            j2 = x02.j(j);
        }
        int g = y02.g(k, j);
        long floatToRawIntBits = (Float.floatToRawIntBits(y02.f(j2, j)) & 4294967295L) | (Float.floatToRawIntBits(g) << 32);
        if (H1()) {
            if (!J1(this.K.h())) {
                intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else {
                intBitsToFloat = Float.intBitsToFloat((int) (this.K.h() >> 32));
            }
            if (!I1(this.K.h())) {
                intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            } else {
                intBitsToFloat2 = Float.intBitsToFloat((int) (this.K.h() & 4294967295L));
            }
            long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
            if (Float.intBitsToFloat((int) (floatToRawIntBits >> 32)) == nae.e || Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L)) == nae.e) {
                floatToRawIntBits = 0;
            } else {
                floatToRawIntBits = owe.Q(floatToRawIntBits2, this.N.a(floatToRawIntBits2, floatToRawIntBits));
            }
        }
        return x02.b(j, y02.g(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits >> 32))), j), 0, y02.f(Math.round(Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L))), j), 0, 10);
    }

    @Override // defpackage.fd6
    public final int P0(ry6 ry6Var, w27 w27Var, int i) {
        if (H1()) {
            long K1 = K1(y02.b(0, i, 0, 0, 13));
            return Math.max(x02.j(K1), w27Var.n0(i));
        }
        return w27Var.n0(i);
    }

    @Override // defpackage.zj3
    public final void V0(qd6 qd6Var) {
        float intBitsToFloat;
        float intBitsToFloat2;
        long j;
        n61 n61Var = qd6Var.a;
        long h = this.K.h();
        if (J1(h)) {
            intBitsToFloat = Float.intBitsToFloat((int) (h >> 32));
        } else {
            intBitsToFloat = Float.intBitsToFloat((int) (n61Var.b() >> 32));
        }
        if (I1(h)) {
            intBitsToFloat2 = Float.intBitsToFloat((int) (h & 4294967295L));
        } else {
            intBitsToFloat2 = Float.intBitsToFloat((int) (n61Var.b() & 4294967295L));
        }
        long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
        if (Float.intBitsToFloat((int) (n61Var.b() >> 32)) == nae.e || Float.intBitsToFloat((int) (n61Var.b() & 4294967295L)) == nae.e) {
            j = 0;
        } else {
            j = owe.Q(floatToRawIntBits, this.N.a(floatToRawIntBits, n61Var.b()));
        }
        long a = this.M.a((Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L), (Math.round(Float.intBitsToFloat((int) (n61Var.b() >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (n61Var.b() & 4294967295L))) & 4294967295L), qd6Var.getLayoutDirection());
        float f = (int) (a >> 32);
        float f2 = (int) (a & 4294967295L);
        ((mu9) n61Var.b.b).D(f, f2);
        try {
            this.K.g(qd6Var, j, this.O, this.P);
            ((mu9) n61Var.b.b).D(-f, -f2);
            qd6Var.a();
        } catch (Throwable th) {
            ((mu9) n61Var.b.b).D(-f, -f2);
            throw th;
        }
    }

    @Override // defpackage.fd6
    public final int a1(ry6 ry6Var, w27 w27Var, int i) {
        if (H1()) {
            long K1 = K1(y02.b(0, 0, 0, i, 7));
            return Math.max(x02.k(K1), w27Var.F(i));
        }
        return w27Var.F(i);
    }

    @Override // defpackage.fd6
    public final c37 n(e37 e37Var, w27 w27Var, long j) {
        mw8 M = w27Var.M(K1(j));
        return e37Var.q0(M.a, M.b, ls3.a, new dg(M, 5));
    }

    public final String toString() {
        vk8 vk8Var = this.K;
        boolean z = this.L;
        dc dcVar = this.M;
        float f = this.O;
        em1 em1Var = this.P;
        return "PainterModifier(painter=" + vk8Var + ", sizeToIntrinsics=" + z + ", alignment=" + dcVar + ", alpha=" + f + ", colorFilter=" + em1Var + ")";
    }

    @Override // defpackage.mq7
    public final boolean w1() {
        return false;
    }

    @Override // defpackage.fd6
    public final int z(ry6 ry6Var, w27 w27Var, int i) {
        if (H1()) {
            long K1 = K1(y02.b(0, 0, 0, i, 7));
            return Math.max(x02.k(K1), w27Var.J(i));
        }
        return w27Var.J(i);
    }
}
