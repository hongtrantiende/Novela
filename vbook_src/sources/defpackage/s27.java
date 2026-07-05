package defpackage;

import android.util.SparseArray;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s27  reason: default package */
/* loaded from: classes.dex */
public final class s27 implements r94 {
    public static final byte[] k0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] l0;
    public static final byte[] m0;
    public static final byte[] n0;
    public static final UUID o0;
    public static final Map p0;
    public int A;
    public long B;
    public final SparseArray C;
    public boolean D;
    public long E;
    public int F;
    public long G;
    public long H;
    public int I;
    public boolean J;
    public long K;
    public long L;
    public long M;
    public boolean N;
    public int O;
    public long P;
    public long Q;
    public int R;
    public int S;
    public int[] T;
    public int U;
    public int V;
    public int W;
    public int X;
    public boolean Y;
    public long Z;
    public final pt2 a;
    public int a0;
    public final c4d b;
    public int b0;
    public final SparseArray c;
    public int c0;
    public final boolean d;
    public boolean d0;
    public final boolean e;
    public boolean e0;
    public final m8b f;
    public boolean f0;
    public final km8 g;
    public int g0;
    public final km8 h;
    public byte h0;
    public final km8 i;
    public boolean i0;
    public final km8 j;
    public t94 j0;
    public final km8 k;
    public final km8 l;
    public final km8 m;
    public final km8 n;
    public final km8 o;
    public final km8 p;
    public ByteBuffer q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public boolean w;
    public boolean x;
    public r27 y;
    public boolean z;

    static {
        String str = a2d.a;
        l0 = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        m0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        n0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        o0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap hashMap = new HashMap();
        s21.u(0, hashMap, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        s21.u(180, hashMap, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        p0 = Collections.unmodifiableMap(hashMap);
    }

    public s27(m8b m8bVar, int i) {
        boolean z;
        boolean z2;
        pt2 pt2Var = new pt2();
        this.s = -1L;
        this.t = -9223372036854775807L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.a = pt2Var;
        pt2Var.d = new fz4(this);
        this.f = m8bVar;
        this.C = new SparseArray();
        if ((i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        this.d = z;
        if ((i & 2) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.e = z2;
        this.b = new c4d(0);
        this.c = new SparseArray();
        this.i = new km8(4);
        this.j = new km8(ByteBuffer.allocate(4).putInt(-1).array());
        this.k = new km8(4);
        this.g = new km8(dae.i);
        this.h = new km8(4);
        this.l = new km8();
        this.m = new km8();
        this.n = new km8(8);
        this.o = new km8();
        this.p = new km8();
        this.T = new int[1];
        this.x = true;
    }

    public static byte[] j(long j, long j2, String str) {
        boolean z;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        int i = (int) (j / 3600000000L);
        long j3 = j - (i * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (i2 * 60000000);
        int i3 = (int) (j4 / 1000000);
        String format = String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (i3 * 1000000)) / j2)));
        String str2 = a2d.a;
        return format.getBytes(StandardCharsets.UTF_8);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:608:0x0a10, code lost:
        if (r0.t() == r4.getLeastSignificantBits()) goto L493;
     */
    /* JADX WARN: Code restructure failed: missing block: B:756:0x0d2d, code lost:
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:869:0x0f56, code lost:
        if (r5 == false) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:870:0x0f58, code lost:
        r2 = r1.getPosition();
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:871:0x0f60, code lost:
        if (r0.J == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:872:0x0f62, code lost:
        r0.L = r2;
        r45.a = r0.K;
        r0.J = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:873:0x0f6e, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:874:0x0f6f, code lost:
        r35 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:875:0x0f75, code lost:
        if (r0.z == false) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:876:0x0f77, code lost:
        r6 = r0.L;
     */
    /* JADX WARN: Code restructure failed: missing block: B:877:0x0f7b, code lost:
        if (r6 == (-1)) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:878:0x0f7d, code lost:
        r45.a = r6;
        r0.L = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:879:0x0f83, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:880:0x0f84, code lost:
        r35 = true;
        r0 = r43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:881:0x0f8a, code lost:
        r4 = r35;
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:930:0x0f8a, code lost:
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0a57  */
    /* JADX WARN: Removed duplicated region for block: B:627:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:628:0x0a71  */
    /* JADX WARN: Removed duplicated region for block: B:631:0x0a84  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0a90  */
    /* JADX WARN: Removed duplicated region for block: B:722:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:727:0x0c63  */
    /* JADX WARN: Removed duplicated region for block: B:728:0x0c66  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x019d  */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v40, types: [java.lang.RuntimeException] */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r6v100 */
    /* JADX WARN: Type inference failed for: r6v101, types: [int] */
    /* JADX WARN: Type inference failed for: r6v103 */
    /* JADX WARN: Type inference failed for: r6v104, types: [int] */
    /* JADX WARN: Type inference failed for: r6v117 */
    /* JADX WARN: Type inference failed for: r6v118, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r9v2, types: [android.util.SparseArray] */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r44, defpackage.fr2 r45) {
        /*
            Method dump skipped, instructions count: 4882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s27.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        long k;
        int i;
        jt1 jt1Var = new jt1(14, (byte) 0);
        km8 km8Var = (km8) jt1Var.c;
        tt2 tt2Var = (tt2) s94Var;
        long j = tt2Var.c;
        int i2 = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
        long j2 = 1024;
        if (i2 != 0 && j <= 1024) {
            j2 = j;
        }
        int i3 = (int) j2;
        tt2Var.f(km8Var.a, 0, 4, false);
        long B = km8Var.B();
        jt1Var.b = 4;
        while (true) {
            if (B != 440786851) {
                int i4 = jt1Var.b + 1;
                jt1Var.b = i4;
                if (i4 == i3) {
                    break;
                }
                tt2Var.f(km8Var.a, 0, 1, false);
                B = (km8Var.a[0] & 255) | ((B << 8) & (-256));
            } else {
                long k2 = jt1Var.k(tt2Var);
                long j3 = jt1Var.b;
                if (k2 != Long.MIN_VALUE && (i2 == 0 || j3 + k2 < j)) {
                    while (true) {
                        int i5 = (jt1Var.b > (j3 + k2) ? 1 : (jt1Var.b == (j3 + k2) ? 0 : -1));
                        if (i5 < 0) {
                            if (jt1Var.k(tt2Var) == Long.MIN_VALUE || (k = jt1Var.k(tt2Var)) < 0 || k > 2147483647L) {
                                break;
                            } else if (i != 0) {
                                int i6 = (int) k;
                                tt2Var.b(i6, false);
                                jt1Var.b += i6;
                            }
                        } else if (i5 == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        this.M = -9223372036854775807L;
        this.O = 0;
        pt2 pt2Var = this.a;
        pt2Var.e = 0;
        pt2Var.b.clear();
        c4d c4dVar = pt2Var.c;
        c4dVar.b = 0;
        c4dVar.c = 0;
        c4d c4dVar2 = this.b;
        c4dVar2.b = 0;
        c4dVar2.c = 0;
        m();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.z) {
            this.C.clear();
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.c;
            if (i < sparseArray.size()) {
                ooc oocVar = ((r27) sparseArray.valueAt(i)).V;
                if (oocVar != null) {
                    oocVar.b = false;
                    oocVar.c = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        if (this.e) {
            t94Var = new o40(t94Var, this.f);
        }
        this.j0 = t94Var;
    }

    public final void g(int i) {
        if (this.D) {
            return;
        }
        throw xm8.a(null, "Element " + i + " must be in a Cues");
    }

    public final void h(int i) {
        if (this.y != null) {
            return;
        }
        throw xm8.a(null, "Element " + i + " must be in a TrackEntry");
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(defpackage.r27 r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s27.i(r27, long, int, int, int):void");
    }

    public final void k() {
        if (this.x) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = this.c;
                if (i < sparseArray.size()) {
                    if (((r27) sparseArray.valueAt(i)).W) {
                        return;
                    }
                    i++;
                } else {
                    t94 t94Var = this.j0;
                    t94Var.getClass();
                    t94Var.m();
                    this.x = false;
                    return;
                }
            }
        }
    }

    public final void l(s94 s94Var, int i) {
        km8 km8Var = this.i;
        if (km8Var.c >= i) {
            return;
        }
        byte[] bArr = km8Var.a;
        if (bArr.length < i) {
            km8Var.c(Math.max(bArr.length * 2, i));
        }
        byte[] bArr2 = km8Var.a;
        int i2 = km8Var.c;
        s94Var.readFully(bArr2, i2, i - i2);
        km8Var.L(i);
    }

    public final void m() {
        this.a0 = 0;
        this.b0 = 0;
        this.c0 = 0;
        this.d0 = false;
        this.e0 = false;
        this.f0 = false;
        this.g0 = 0;
        this.h0 = (byte) 0;
        this.i0 = false;
        this.l.J(0);
    }

    public final long n(long j) {
        long j2 = this.t;
        if (j2 != -9223372036854775807L) {
            String str = a2d.a;
            return a2d.Y(j, j2, 1000L, RoundingMode.DOWN);
        }
        throw xm8.a(null, "Can't scale timecode prior to timecodeScale being set.");
    }

    public final int o(s94 s94Var, r27 r27Var, int i, boolean z) {
        int f;
        int f2;
        int i2;
        boolean z2;
        boolean z3;
        int i3;
        if ("S_TEXT/UTF8".equals(r27Var.c)) {
            p(s94Var, k0, i);
            int i4 = this.b0;
            m();
            return i4;
        } else if (!"S_TEXT/ASS".equals(r27Var.c) && !"S_TEXT/SSA".equals(r27Var.c)) {
            if ("S_TEXT/WEBVTT".equals(r27Var.c)) {
                p(s94Var, n0, i);
                int i5 = this.b0;
                m();
                return i5;
            }
            int i6 = 2;
            boolean z4 = true;
            if (r27Var.W) {
                r27Var.b0.getClass();
                km8 km8Var = new km8(i);
                if (s94Var.f(km8Var.a, 0, i, true)) {
                    s94Var.p();
                    if (tte.n(km8Var.i()) == 1 && km8Var.a() >= 10) {
                        byte[] bArr = new byte[10];
                        km8Var.k(bArr, 0, 10);
                        km8Var.M(0);
                        int m = tte.m(bArr);
                        if (m > 0 && km8Var.a() >= m + 4) {
                            km8Var.N(m);
                            if (tte.n(km8Var.m()) == 2) {
                                uq4 a = r27Var.b0.a();
                                a.n = lc7.p("audio/vnd.dts.hd");
                                r27Var.b0 = new vq4(a);
                            }
                        }
                    }
                }
                r27Var.a0.g(r27Var.b0);
                r27Var.W = false;
                k();
            }
            fjc fjcVar = r27Var.a0;
            boolean z5 = this.d0;
            km8 km8Var2 = this.l;
            if (!z5) {
                boolean z6 = r27Var.i;
                km8 km8Var3 = this.i;
                if (z6) {
                    this.W &= -1073741825;
                    boolean z7 = this.e0;
                    int i7 = Token.CASE;
                    if (!z7) {
                        s94Var.readFully(km8Var3.a, 0, 1);
                        this.a0++;
                        byte b = km8Var3.a[0];
                        if ((b & 128) != 128) {
                            this.h0 = b;
                            this.e0 = true;
                        } else {
                            throw xm8.a(null, "Extension bit is set in signal byte");
                        }
                    }
                    byte b2 = this.h0;
                    if ((b2 & 1) == 1) {
                        if ((b2 & 2) == 2) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        this.W |= 1073741824;
                        if (!this.i0) {
                            km8 km8Var4 = this.n;
                            s94Var.readFully(km8Var4.a, 0, 8);
                            this.a0 += 8;
                            this.i0 = true;
                            byte[] bArr2 = km8Var3.a;
                            if (!z3) {
                                i7 = 0;
                            }
                            bArr2[0] = (byte) (i7 | 8);
                            km8Var3.M(0);
                            fjcVar.b(km8Var3, 1, 1);
                            this.b0++;
                            km8Var4.M(0);
                            fjcVar.b(km8Var4, 8, 1);
                            this.b0 += 8;
                        }
                        if (z3) {
                            if (!this.f0) {
                                s94Var.readFully(km8Var3.a, 0, 1);
                                this.a0++;
                                km8Var3.M(0);
                                this.g0 = km8Var3.z();
                                this.f0 = true;
                            }
                            int i8 = this.g0 * 4;
                            km8Var3.J(i8);
                            s94Var.readFully(km8Var3.a, 0, i8);
                            this.a0 += i8;
                            short s = (short) ((this.g0 / 2) + 1);
                            int i9 = (s * 6) + 2;
                            ByteBuffer byteBuffer = this.q;
                            if (byteBuffer == null || byteBuffer.capacity() < i9) {
                                this.q = ByteBuffer.allocate(i9);
                            }
                            this.q.position(0);
                            this.q.putShort(s);
                            int i10 = 0;
                            int i11 = 0;
                            while (true) {
                                i3 = this.g0;
                                if (i10 >= i3) {
                                    break;
                                }
                                int D = km8Var3.D();
                                int i12 = i10 % 2;
                                int i13 = i6;
                                ByteBuffer byteBuffer2 = this.q;
                                if (i12 == 0) {
                                    byteBuffer2.putShort((short) (D - i11));
                                } else {
                                    byteBuffer2.putInt(D - i11);
                                }
                                i10++;
                                i11 = D;
                                i6 = i13;
                            }
                            i2 = i6;
                            int i14 = (i - this.a0) - i11;
                            int i15 = i3 % 2;
                            ByteBuffer byteBuffer3 = this.q;
                            if (i15 == 1) {
                                byteBuffer3.putInt(i14);
                            } else {
                                byteBuffer3.putShort((short) i14);
                                this.q.putInt(0);
                            }
                            byte[] array = this.q.array();
                            km8 km8Var5 = this.o;
                            km8Var5.K(array, i9);
                            fjcVar.b(km8Var5, i9, 1);
                            this.b0 += i9;
                        }
                    }
                    i2 = 2;
                } else {
                    i2 = 2;
                    byte[] bArr3 = r27Var.j;
                    if (bArr3 != null) {
                        km8Var2.K(bArr3, bArr3.length);
                    }
                }
                if ("A_OPUS".equals(r27Var.c)) {
                    z2 = z;
                } else if (r27Var.g > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.W |= 268435456;
                    this.p.J(0);
                    int i16 = (km8Var2.c + i) - this.a0;
                    km8Var3.J(4);
                    byte[] bArr4 = km8Var3.a;
                    bArr4[0] = (byte) ((i16 >> 24) & 255);
                    bArr4[1] = (byte) ((i16 >> 16) & 255);
                    bArr4[i2] = (byte) ((i16 >> 8) & 255);
                    bArr4[3] = (byte) (i16 & 255);
                    fjcVar.b(km8Var3, 4, i2);
                    this.b0 += 4;
                }
                this.d0 = true;
            }
            int i17 = i + km8Var2.c;
            if (!"V_MPEG4/ISO/AVC".equals(r27Var.c) && !"V_MPEGH/ISO/HEVC".equals(r27Var.c)) {
                if (r27Var.V != null) {
                    if (km8Var2.c != 0) {
                        z4 = false;
                    }
                    wq9.D(z4);
                    r27Var.V.c(s94Var);
                }
                while (true) {
                    int i18 = this.a0;
                    if (i18 >= i17) {
                        break;
                    }
                    int i19 = i17 - i18;
                    int a2 = km8Var2.a();
                    if (a2 > 0) {
                        f2 = Math.min(i19, a2);
                        fjcVar.e(f2, km8Var2);
                    } else {
                        f2 = fjcVar.f(s94Var, i19, false);
                    }
                    this.a0 += f2;
                    this.b0 += f2;
                }
            } else {
                km8 km8Var6 = this.h;
                byte[] bArr5 = km8Var6.a;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i20 = r27Var.c0;
                int i21 = 4 - i20;
                while (this.a0 < i17) {
                    int i22 = this.c0;
                    if (i22 == 0) {
                        int min = Math.min(i20, km8Var2.a());
                        s94Var.readFully(bArr5, i21 + min, i20 - min);
                        if (min > 0) {
                            km8Var2.k(bArr5, i21, min);
                        }
                        this.a0 += i20;
                        km8Var6.M(0);
                        this.c0 = km8Var6.D();
                        km8 km8Var7 = this.g;
                        km8Var7.M(0);
                        fjcVar.e(4, km8Var7);
                        this.b0 += 4;
                    } else {
                        int a3 = km8Var2.a();
                        if (a3 > 0) {
                            f = Math.min(i22, a3);
                            fjcVar.e(f, km8Var2);
                        } else {
                            f = fjcVar.f(s94Var, i22, false);
                        }
                        this.a0 += f;
                        this.b0 += f;
                        this.c0 -= f;
                    }
                }
            }
            if ("A_VORBIS".equals(r27Var.c)) {
                km8 km8Var8 = this.j;
                km8Var8.M(0);
                fjcVar.e(4, km8Var8);
                this.b0 += 4;
            }
            int i23 = this.b0;
            m();
            return i23;
        } else {
            p(s94Var, m0, i);
            int i24 = this.b0;
            m();
            return i24;
        }
    }

    public final void p(s94 s94Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        km8 km8Var = this.m;
        byte[] bArr2 = km8Var.a;
        if (bArr2.length < length) {
            byte[] copyOf = Arrays.copyOf(bArr, length + i);
            km8Var.getClass();
            km8Var.K(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        s94Var.readFully(km8Var.a, bArr.length, i);
        km8Var.M(0);
        km8Var.L(length);
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
