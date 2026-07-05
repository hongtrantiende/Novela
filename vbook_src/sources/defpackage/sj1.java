package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sj1  reason: default package */
/* loaded from: classes.dex */
public final class sj1 implements n57, m57 {
    public long C;
    public vj1 D;
    public final n57 a;
    public m57 b;
    public rj1[] c = new rj1[0];
    public long d;
    public long e;
    public long f;

    public sj1(n57 n57Var, boolean z, long j, long j2, int i) {
        long j3;
        this.a = n57Var;
        if (z) {
            j3 = j;
        } else {
            j3 = -9223372036854775807L;
        }
        this.d = j3;
        this.e = -9223372036854775807L;
        this.f = j;
        this.C = j2;
    }

    @Override // defpackage.m57
    public final void a(n57 n57Var) {
        if (this.D != null) {
            return;
        }
        m57 m57Var = this.b;
        m57Var.getClass();
        m57Var.a(this);
    }

    public final boolean b() {
        if (this.d != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e9a
    public final void d(f9a f9aVar) {
        n57 n57Var = (n57) f9aVar;
        m57 m57Var = this.b;
        m57Var.getClass();
        m57Var.d(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0079  */
    @Override // defpackage.n57
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long e(defpackage.c14[] r18, boolean[] r19, defpackage.gx9[] r20, boolean[] r21, long r22) {
        /*
            r17 = this;
            r0 = r17
            r8 = r20
            int r1 = r8.length
            rj1[] r1 = new defpackage.rj1[r1]
            r0.c = r1
            int r1 = r8.length
            gx9[] r4 = new defpackage.gx9[r1]
            r1 = 0
        Ld:
            int r2 = r8.length
            if (r1 >= r2) goto L23
            rj1[] r2 = r0.c
            r3 = r8[r1]
            rj1 r3 = (defpackage.rj1) r3
            r2[r1] = r3
            if (r3 == 0) goto L1d
            gx9 r10 = r3.a
            goto L1e
        L1d:
            r10 = 0
        L1e:
            r4[r1] = r10
            int r1 = r1 + 1
            goto Ld
        L23:
            n57 r1 = r0.a
            r2 = r18
            r3 = r19
            r5 = r21
            r6 = r22
            long r11 = r1.e(r2, r3, r4, r5, r6)
            long r13 = r0.C
            r3 = 0
            long r9 = java.lang.Math.max(r11, r6)
            r15 = -9223372036854775808
            int r5 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r5 == 0) goto L42
            long r9 = java.lang.Math.min(r9, r13)
        L42:
            boolean r5 = r0.b()
            if (r5 == 0) goto L6e
            int r5 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r5 >= 0) goto L4d
            goto L69
        L4d:
            r5 = 0
            int r5 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r5 == 0) goto L6e
            int r5 = r2.length
            r6 = 0
        L55:
            if (r6 >= r5) goto L6e
            r7 = r2[r6]
            if (r7 == 0) goto L6b
            vq4 r7 = r7.n()
            java.lang.String r11 = r7.o
            java.lang.String r7 = r7.k
            boolean r7 = defpackage.lc7.a(r11, r7)
            if (r7 != 0) goto L6b
        L69:
            r5 = r9
            goto L73
        L6b:
            int r6 = r6 + 1
            goto L55
        L6e:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L73:
            r0.d = r5
            r1 = 0
        L76:
            int r2 = r8.length
            if (r1 >= r2) goto L98
            r2 = r4[r1]
            rj1[] r5 = r0.c
            if (r2 != 0) goto L82
            r5[r1] = r3
            goto L91
        L82:
            r6 = r5[r1]
            if (r6 == 0) goto L8a
            gx9 r6 = r6.a
            if (r6 == r2) goto L91
        L8a:
            rj1 r6 = new rj1
            r6.<init>(r0, r2)
            r5[r1] = r6
        L91:
            r2 = r5[r1]
            r8[r1] = r2
            int r1 = r1 + 1
            goto L76
        L98:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj1.e(c14[], boolean[], gx9[], boolean[], long):long");
    }

    @Override // defpackage.f9a
    public final long g() {
        long g = this.a.g();
        if (g != Long.MIN_VALUE) {
            long j = this.C;
            if (j == Long.MIN_VALUE || g < j) {
                return g;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.n57
    public final long h(long j, o4a o4aVar) {
        long j2;
        long j3 = this.f;
        if (j == j3) {
            return j3;
        }
        long j4 = a2d.j(o4aVar.a, 0L, j - j3);
        long j5 = o4aVar.b;
        long j6 = this.C;
        if (j6 == Long.MIN_VALUE) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j6 - j;
        }
        long j7 = a2d.j(j5, 0L, j2);
        if (j4 != o4aVar.a || j7 != o4aVar.b) {
            o4aVar = new o4a(j4, j7);
        }
        return this.a.h(j, o4aVar);
    }

    @Override // defpackage.n57
    public final void j() {
        vj1 vj1Var = this.D;
        if (vj1Var == null) {
            this.a.j();
            return;
        }
        throw vj1Var;
    }

    @Override // defpackage.n57
    public final long k(long j) {
        rj1[] rj1VarArr;
        this.d = -9223372036854775807L;
        for (rj1 rj1Var : this.c) {
            if (rj1Var != null) {
                rj1Var.b = false;
            }
        }
        long k = this.a.k(j);
        long j2 = this.f;
        long j3 = this.C;
        long max = Math.max(k, j2);
        if (j3 != Long.MIN_VALUE) {
            return Math.min(max, j3);
        }
        return max;
    }

    @Override // defpackage.n57
    public final void l(long j) {
        this.a.l(j);
    }

    @Override // defpackage.f9a
    public final boolean n() {
        return this.a.n();
    }

    @Override // defpackage.n57
    public final long p() {
        if (b()) {
            long j = this.d;
            this.d = -9223372036854775807L;
            this.e = j;
            long p = p();
            if (p != -9223372036854775807L) {
                return p;
            }
            return j;
        }
        long p2 = this.a.p();
        if (p2 != -9223372036854775807L) {
            long j2 = this.f;
            long j3 = this.C;
            long max = Math.max(p2, j2);
            if (j3 != Long.MIN_VALUE) {
                max = Math.min(max, j3);
            }
            if (max != this.e) {
                this.e = max;
                return max;
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.n57
    public final void q(m57 m57Var, long j) {
        this.b = m57Var;
        this.a.q(this, j);
    }

    @Override // defpackage.n57
    public final bjc r() {
        return this.a.r();
    }

    @Override // defpackage.f9a
    public final boolean t(vs6 vs6Var) {
        return this.a.t(vs6Var);
    }

    @Override // defpackage.f9a
    public final long u() {
        long u = this.a.u();
        if (u != Long.MIN_VALUE) {
            long j = this.C;
            if (j == Long.MIN_VALUE || u < j) {
                return u;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // defpackage.f9a
    public final void x(long j) {
        this.a.x(j);
    }
}
