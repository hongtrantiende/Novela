package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g75  reason: default package */
/* loaded from: classes.dex */
public final class g75 extends z37 {
    public static final AtomicInteger i0 = new AtomicInteger();
    public final int G;
    public final int H;
    public final Uri I;
    public final boolean J;
    public final int K;
    public final jg2 L;
    public final mg2 M;
    public final vz0 N;
    public final boolean O;
    public final boolean P;
    public final lac Q;
    public final du2 R;
    public final List S;
    public final zk3 T;
    public final vk5 U;
    public final km8 V;
    public final boolean W;
    public final boolean X;
    public vz0 Y;
    public g85 Z;
    public int a0;
    public boolean b0;
    public volatile boolean c0;
    public boolean d0;
    public qs5 e0;
    public boolean f0;
    public long g0;
    public boolean h0;

    public g75(du2 du2Var, jg2 jg2Var, mg2 mg2Var, vq4 vq4Var, boolean z, jg2 jg2Var2, mg2 mg2Var2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, int i3, boolean z4, boolean z5, lac lacVar, zk3 zk3Var, vz0 vz0Var, vk5 vk5Var, km8 km8Var, boolean z6, boolean z7, a09 a09Var) {
        super(jg2Var, mg2Var, vq4Var, i, obj, j, j2, j3);
        this.W = z;
        this.K = i2;
        this.g0 = z3 ? j2 - j : -9223372036854775807L;
        this.H = i3;
        this.M = mg2Var2;
        this.L = jg2Var2;
        this.b0 = mg2Var2 != null;
        this.X = z2;
        this.I = uri;
        this.O = z5;
        this.Q = lacVar;
        this.P = z4;
        this.R = du2Var;
        this.S = list;
        this.T = zk3Var;
        this.N = vz0Var;
        this.U = vk5Var;
        this.V = km8Var;
        this.h0 = z6;
        this.J = z7;
        ms5 ms5Var = qs5.b;
        this.e0 = mm9.e;
        this.G = i0.getAndIncrement();
    }

    public static byte[] f(String str) {
        int i;
        if (kve.B(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        if (byteArray.length > 16) {
            i = byteArray.length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - byteArray.length) + i, byteArray.length - i);
        return bArr;
    }

    @Override // defpackage.gs6
    public final void b() {
        vz0 vz0Var;
        this.Z.getClass();
        if (this.Y == null && (vz0Var = this.N) != null) {
            r94 r94Var = (r94) vz0Var.b;
            if ((r94Var instanceof toc) || (r94Var instanceof us4)) {
                this.Y = vz0Var;
                this.b0 = false;
            }
        }
        mg2 mg2Var = this.M;
        jg2 jg2Var = this.L;
        if (this.b0) {
            jg2Var.getClass();
            mg2Var.getClass();
            e(jg2Var, mg2Var, this.X, false);
            this.a0 = 0;
            this.b0 = false;
        }
        if (!this.c0) {
            if (!this.P) {
                e(this.E, this.b, this.W, true);
            }
            this.d0 = !this.c0;
        }
    }

    @Override // defpackage.gs6
    public final void c() {
        this.c0 = true;
    }

    @Override // defpackage.z37
    public final boolean d() {
        throw null;
    }

    public final void e(jg2 jg2Var, mg2 mg2Var, boolean z, boolean z2) {
        mg2 a;
        boolean z3;
        long j;
        boolean z4;
        int i = this.a0;
        if (z) {
            if (i != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            z3 = z4;
            a = mg2Var;
        } else {
            a = mg2Var.a(i);
            z3 = false;
        }
        try {
            tt2 i2 = i(jg2Var, a, z2);
            if (z3) {
                i2.e(this.a0, false);
            }
            do {
                try {
                    if (this.c0) {
                        break;
                    }
                } catch (EOFException e) {
                    if ((this.d.f & 16384) != 0) {
                        ((r94) this.Y.b).d(0L, 0L);
                        j = i2.d;
                    } else {
                        throw e;
                    }
                }
            } while (((r94) this.Y.b).b(i2, vz0.f) == 0);
            j = i2.d;
            this.a0 = (int) (j - mg2Var.e);
        } finally {
            yae.k(jg2Var);
        }
    }

    public final int g(int i) {
        wq9.D(!this.h0);
        if (i >= this.e0.size()) {
            return 0;
        }
        return ((Integer) this.e0.get(i)).intValue();
    }

    public final boolean h() {
        if (this.g0 != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        if (r14 != false) goto L187;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [java.lang.Object, r94] */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r24v0, types: [us4] */
    /* JADX WARN: Type inference failed for: r24v1 */
    /* JADX WARN: Type inference failed for: r24v3, types: [toc] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13, types: [a4] */
    /* JADX WARN: Type inference failed for: r4v15, types: [q8] */
    /* JADX WARN: Type inference failed for: r4v17, types: [os7] */
    /* JADX WARN: Type inference failed for: r4v34, types: [bid] */
    /* JADX WARN: Type inference failed for: r4v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.tt2 i(defpackage.jg2 r33, defpackage.mg2 r34, boolean r35) {
        /*
            Method dump skipped, instructions count: 993
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g75.i(jg2, mg2, boolean):tt2");
    }
}
