package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ei0  reason: default package */
/* loaded from: classes.dex */
public abstract class ei0 implements b09 {
    public xfb C;
    public int D;
    public gx9 E;
    public vq4[] F;
    public long G;
    public long H;
    public boolean J;
    public boolean K;
    public e67 M;
    public ly2 N;
    public final int b;
    public ao9 d;
    public int e;
    public a09 f;
    public final Object a = new Object();
    public final s6f c = new Object();
    public long I = Long.MIN_VALUE;
    public aac L = aac.a;

    /* JADX WARN: Type inference failed for: r3v1, types: [s6f, java.lang.Object] */
    public ei0(int i) {
        this.b = i;
    }

    public static int f(int i, int i2, int i3, int i4) {
        return i | i2 | i3 | Token.CASE | i4;
    }

    public static boolean n(int i, boolean z) {
        int i2 = i & 7;
        if (i2 != 4) {
            if (!z || i2 != 3) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void A(vq4[] vq4VarArr, gx9 gx9Var, long j, long j2, e67 e67Var) {
        wq9.D(!this.J);
        this.E = gx9Var;
        this.M = e67Var;
        if (this.I == Long.MIN_VALUE) {
            this.I = j;
        }
        this.F = vq4VarArr;
        this.G = j2;
        w(vq4VarArr, j, j2, e67Var);
    }

    public final void B(long j, boolean z, boolean z2) {
        this.J = false;
        this.H = j;
        this.I = j;
        if (!z2) {
            gx9 gx9Var = this.E;
            gx9Var.getClass();
            if (gx9Var.m(j - this.G) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
        }
        r(j, z, z2);
    }

    public abstract int D(vq4 vq4Var);

    public int E() {
        return 0;
    }

    public boolean F(long j) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.pz3 g(java.lang.Exception r11, defpackage.vq4 r12, boolean r13, int r14) {
        /*
            r10 = this;
            r0 = 4
            if (r12 == 0) goto L1a
            boolean r2 = r10.K
            if (r2 != 0) goto L1a
            r2 = 1
            r10.K = r2
            r2 = 0
            int r3 = r10.D(r12)     // Catch: java.lang.Throwable -> L14 defpackage.pz3 -> L18
            r3 = r3 & 7
            r10.K = r2
            goto L1b
        L14:
            r0 = move-exception
            r10.K = r2
            throw r0
        L18:
            r10.K = r2
        L1a:
            r3 = r0
        L1b:
            java.lang.String r4 = r10.k()
            int r5 = r10.e
            e67 r8 = r10.M
            r1 = r0
            pz3 r0 = new pz3
            if (r12 != 0) goto L2a
            r7 = r1
            goto L2b
        L2a:
            r7 = r3
        L2b:
            r1 = 1
            r2 = r11
            r6 = r12
            r9 = r13
            r3 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ei0.g(java.lang.Exception, vq4, boolean, int):pz3");
    }

    public long i(long j, long j2) {
        if (this.D == 1) {
            if (o() || m()) {
                return 1000000L;
            }
            return 10000L;
        }
        return 10000L;
    }

    public b47 j() {
        return null;
    }

    public abstract String k();

    public final boolean l() {
        if (this.I == Long.MIN_VALUE) {
            return true;
        }
        return false;
    }

    public abstract boolean m();

    public abstract boolean o();

    public abstract void p();

    public abstract void r(long j, boolean z, boolean z2);

    public final int y(s6f s6fVar, cr2 cr2Var, int i) {
        gx9 gx9Var = this.E;
        gx9Var.getClass();
        int c = gx9Var.c(s6fVar, cr2Var, i);
        if (c == -4) {
            if (cr2Var.h(4)) {
                this.I = Long.MIN_VALUE;
                if (this.J) {
                    return -4;
                }
                return -3;
            }
            long j = cr2Var.C + this.G;
            cr2Var.C = j;
            this.I = Math.max(this.I, j);
            return c;
        }
        if (c == -5) {
            vq4 vq4Var = (vq4) s6fVar.b;
            vq4Var.getClass();
            long j2 = vq4Var.t;
            if (j2 != Long.MAX_VALUE) {
                uq4 a = vq4Var.a();
                a.s = j2 + this.G;
                s6fVar.b = new vq4(a);
            }
        }
        return c;
    }

    public abstract void z(long j, long j2);

    public void h() {
    }

    public void s() {
    }

    public void t() {
    }

    public void u() {
    }

    public void v() {
    }

    public void x() {
    }

    public void C(float f, float f2) {
    }

    @Override // defpackage.b09
    public void d(int i, Object obj) {
    }

    public void q(boolean z, boolean z2) {
    }

    public void w(vq4[] vq4VarArr, long j, long j2, e67 e67Var) {
    }
}
