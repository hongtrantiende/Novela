package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: my0  reason: default package */
/* loaded from: classes3.dex */
public final class my0 implements bz0, az0, Cloneable, ByteChannel {
    public e5a a;
    public long b;

    @Override // defpackage.bz0
    public final e31 B(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                if (j >= 4096) {
                    e31 V0 = V0((int) j);
                    skip(j);
                    return V0;
                }
                return new e31(p0(j));
            }
            throw new EOFException();
        }
        p1a.k(hl5.k(j, "byteCount: "));
        return null;
    }

    public final void C(my0 my0Var, long j, long j2) {
        my0Var.getClass();
        long j3 = j;
        bbe.n(this.b, j3, j2);
        if (j2 != 0) {
            my0Var.b += j2;
            e5a e5aVar = this.a;
            while (true) {
                e5aVar.getClass();
                long j4 = e5aVar.c - e5aVar.b;
                if (j3 < j4) {
                    break;
                }
                j3 -= j4;
                e5aVar = e5aVar.f;
            }
            long j5 = j2;
            while (j5 > 0) {
                e5aVar.getClass();
                e5a c = e5aVar.c();
                int i = c.b + ((int) j3);
                c.b = i;
                c.c = Math.min(i + ((int) j5), c.c);
                e5a e5aVar2 = my0Var.a;
                if (e5aVar2 == null) {
                    c.g = c;
                    c.f = c;
                    my0Var.a = c;
                } else {
                    e5a e5aVar3 = e5aVar2.g;
                    e5aVar3.getClass();
                    e5aVar3.b(c);
                }
                j5 -= c.c - c.b;
                e5aVar = e5aVar.f;
                j3 = 0;
            }
        }
    }

    @Override // defpackage.bz0
    public final String F0() {
        return c0(Long.MAX_VALUE);
    }

    public final String I0(long j, Charset charset) {
        charset.getClass();
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                if (i == 0) {
                    return "";
                }
                e5a e5aVar = this.a;
                e5aVar.getClass();
                int i2 = e5aVar.b;
                if (i2 + j > e5aVar.c) {
                    return new String(p0(j), charset);
                }
                int i3 = (int) j;
                String str = new String(e5aVar.a, i2, i3, charset);
                int i4 = e5aVar.b + i3;
                e5aVar.b = i4;
                this.b -= j;
                if (i4 == e5aVar.c) {
                    this.a = e5aVar.a();
                    n5a.a(e5aVar);
                }
                return str;
            }
            throw new EOFException();
        }
        p1a.k(hl5.k(j, "byteCount: "));
        return null;
    }

    @Override // defpackage.az0
    public final long J(osa osaVar) {
        osaVar.getClass();
        long j = 0;
        while (true) {
            long read = osaVar.read(this, 8192L);
            if (read != -1) {
                j += read;
            } else {
                return j;
            }
        }
    }

    @Override // defpackage.bz0
    public final byte[] K() {
        return p0(this.b);
    }

    public final String N0() {
        return I0(this.b, ed1.a);
    }

    @Override // defpackage.bz0
    public final boolean P0(long j, e31 e31Var) {
        e31Var.getClass();
        return j0(e31Var.e(), j, e31Var);
    }

    public final byte S(long j) {
        bbe.n(this.b, j, 1L);
        e5a e5aVar = this.a;
        e5aVar.getClass();
        long j2 = this.b;
        if (j2 - j < j) {
            while (j2 > j) {
                e5aVar = e5aVar.g;
                e5aVar.getClass();
                j2 -= e5aVar.c - e5aVar.b;
            }
            return e5aVar.a[(int) ((e5aVar.b + j) - j2)];
        }
        long j3 = 0;
        while (true) {
            int i = e5aVar.c;
            int i2 = e5aVar.b;
            long j4 = (i - i2) + j3;
            if (j4 <= j) {
                e5aVar = e5aVar.f;
                e5aVar.getClass();
                j3 = j4;
            } else {
                return e5aVar.a[(int) ((i2 + j) - j3)];
            }
        }
    }

    @Override // defpackage.az0
    public final /* bridge */ /* synthetic */ az0 S0(e31 e31Var) {
        g1(e31Var);
        return this;
    }

    public final long V(byte b, long j, long j2) {
        e5a e5aVar;
        long j3 = j;
        long j4 = j2;
        long j5 = 0;
        if (0 <= j3 && j3 <= j4) {
            long j6 = this.b;
            if (j4 > j6) {
                j4 = j6;
            }
            long j7 = -1;
            if (j3 == j4 || (e5aVar = this.a) == null) {
                return -1L;
            }
            if (j6 - j3 < j3) {
                while (j6 > j3) {
                    e5aVar = e5aVar.g;
                    e5aVar.getClass();
                    j6 -= e5aVar.c - e5aVar.b;
                }
                while (j6 < j4) {
                    byte[] bArr = e5aVar.a;
                    long j8 = j7;
                    int min = (int) Math.min(e5aVar.c, (e5aVar.b + j4) - j6);
                    for (int i = (int) ((e5aVar.b + j3) - j6); i < min; i++) {
                        if (bArr[i] == b) {
                            return (i - e5aVar.b) + j6;
                        }
                    }
                    j6 += e5aVar.c - e5aVar.b;
                    e5aVar = e5aVar.f;
                    e5aVar.getClass();
                    j7 = j8;
                    j3 = j6;
                }
                return j7;
            }
            while (true) {
                long j9 = (e5aVar.c - e5aVar.b) + j5;
                if (j9 > j3) {
                    break;
                }
                e5aVar = e5aVar.f;
                e5aVar.getClass();
                j5 = j9;
            }
            while (j5 < j4) {
                byte[] bArr2 = e5aVar.a;
                int min2 = (int) Math.min(e5aVar.c, (e5aVar.b + j4) - j5);
                for (int i2 = (int) ((e5aVar.b + j3) - j5); i2 < min2; i2++) {
                    if (bArr2[i2] == b) {
                        return (i2 - e5aVar.b) + j5;
                    }
                }
                j5 += e5aVar.c - e5aVar.b;
                e5aVar = e5aVar.f;
                e5aVar.getClass();
                j3 = j5;
            }
            return -1L;
        }
        StringBuilder sb = new StringBuilder("size=");
        sb.append(this.b);
        rs8.x(sb, " fromIndex=", j3, " toIndex=");
        sb.append(j4);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final e31 V0(int i) {
        if (i == 0) {
            return e31.d;
        }
        bbe.n(this.b, 0L, i);
        e5a e5aVar = this.a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            e5aVar.getClass();
            int i5 = e5aVar.c;
            int i6 = e5aVar.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                e5aVar = e5aVar.f;
            } else {
                vs.j("s.limit == s.pos");
                return null;
            }
        }
        byte[][] bArr = new byte[i4];
        int[] iArr = new int[i4 * 2];
        e5a e5aVar2 = this.a;
        int i7 = 0;
        while (i2 < i) {
            e5aVar2.getClass();
            bArr[i7] = e5aVar2.a;
            i2 += e5aVar2.c - e5aVar2.b;
            iArr[i7] = Math.min(i2, i);
            iArr[i7 + i4] = e5aVar2.b;
            e5aVar2.d = true;
            i7++;
            e5aVar2 = e5aVar2.f;
        }
        return new p5a(bArr, iArr);
    }

    public final e5a b1(int i) {
        if (i >= 1 && i <= 8192) {
            e5a e5aVar = this.a;
            if (e5aVar == null) {
                e5a b = n5a.b();
                this.a = b;
                b.g = b;
                b.f = b;
                return b;
            }
            e5a e5aVar2 = e5aVar.g;
            e5aVar2.getClass();
            if (e5aVar2.c + i <= 8192 && e5aVar2.e) {
                return e5aVar2;
            }
            e5a b2 = n5a.b();
            e5aVar2.b(b2);
            return b2;
        }
        vs.m("unexpected capacity");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [my0, java.lang.Object] */
    @Override // defpackage.bz0
    public final String c0(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long j3 = j2;
            long V = V((byte) 10, 0L, j3);
            if (V != -1) {
                return b.c(this, V);
            }
            if (j3 < this.b && S(j3 - 1) == 13 && S(j3) == 10) {
                return b.c(this, j3);
            }
            ?? obj = new Object();
            C(obj, 0L, Math.min(32L, this.b));
            long min = Math.min(this.b, j);
            String f = obj.B(obj.b).f();
            throw new EOFException("\\n not found: limit=" + min + " content=" + f + (char) 8230);
        }
        p1a.k(hl5.k(j, "limit < 0: "));
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [my0, java.lang.Object] */
    public final Object clone() {
        ?? obj = new Object();
        if (this.b == 0) {
            return obj;
        }
        e5a e5aVar = this.a;
        e5aVar.getClass();
        e5a c = e5aVar.c();
        obj.a = c;
        c.g = c;
        c.f = c;
        for (e5a e5aVar2 = e5aVar.f; e5aVar2 != e5aVar; e5aVar2 = e5aVar2.f) {
            e5a e5aVar3 = c.g;
            e5aVar3.getClass();
            e5aVar2.getClass();
            e5aVar3.b(e5aVar2.c());
        }
        obj.b = this.b;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my0)) {
            return false;
        }
        long j = this.b;
        my0 my0Var = (my0) obj;
        if (j != my0Var.b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        e5a e5aVar = this.a;
        e5aVar.getClass();
        e5a e5aVar2 = my0Var.a;
        e5aVar2.getClass();
        int i = e5aVar.b;
        int i2 = e5aVar2.b;
        long j2 = 0;
        while (j2 < this.b) {
            long min = Math.min(e5aVar.c - i, e5aVar2.c - i2);
            long j3 = 0;
            while (j3 < min) {
                int i3 = i + 1;
                int i4 = i2 + 1;
                if (e5aVar.a[i] != e5aVar2.a[i2]) {
                    return false;
                }
                j3++;
                i = i3;
                i2 = i4;
            }
            if (i == e5aVar.c) {
                e5aVar = e5aVar.f;
                e5aVar.getClass();
                i = e5aVar.b;
            }
            if (i2 == e5aVar2.c) {
                e5aVar2 = e5aVar2.f;
                e5aVar2.getClass();
                i2 = e5aVar2.b;
            }
            j2 += min;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[EDGE_INSN: B:41:0x008d->B:37:0x008d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r14v3, types: [my0, java.lang.Object] */
    @Override // defpackage.bz0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long f1() {
        /*
            r14 = this;
            long r0 = r14.b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L94
            r0 = 0
            r1 = r0
            r4 = r2
        Lb:
            e5a r6 = r14.a
            r6.getClass()
            byte[] r7 = r6.a
            int r8 = r6.b
            int r9 = r6.c
        L16:
            if (r8 >= r9) goto L79
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L25
            r11 = 57
            if (r10 > r11) goto L25
            int r11 = r10 + (-48)
            goto L3a
        L25:
            r11 = 97
            if (r10 < r11) goto L30
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L30
            int r11 = r10 + (-87)
            goto L3a
        L30:
            r11 = 65
            if (r10 < r11) goto L65
            r11 = 70
            if (r10 > r11) goto L65
            int r11 = r10 + (-55)
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L16
        L4a:
            my0 r14 = new my0
            r14.<init>()
            r14.m1(r4)
            r14.k1(r10)
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r14 = r14.N0()
            java.lang.String r1 = "Number too large: "
            java.lang.String r14 = r1.concat(r14)
            r0.<init>(r14)
            throw r0
        L65:
            if (r0 == 0) goto L69
            r1 = 1
            goto L79
        L69:
            java.lang.NumberFormatException r14 = new java.lang.NumberFormatException
            java.lang.String r0 = defpackage.bbe.w(r10)
            java.lang.String r1 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r1.concat(r0)
            r14.<init>(r0)
            throw r14
        L79:
            if (r8 != r9) goto L85
            e5a r7 = r6.a()
            r14.a = r7
            defpackage.n5a.a(r6)
            goto L87
        L85:
            r6.b = r8
        L87:
            if (r1 != 0) goto L8d
            e5a r6 = r14.a
            if (r6 != 0) goto Lb
        L8d:
            long r1 = r14.b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.b = r1
            return r4
        L94:
            java.io.EOFException r14 = new java.io.EOFException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my0.f1():long");
    }

    public final long g0(e31 e31Var) {
        int i;
        int i2;
        e31Var.getClass();
        e5a e5aVar = this.a;
        if (e5aVar != null) {
            long j = this.b;
            long j2 = 0;
            if (j < 0) {
                while (j > 0) {
                    e5aVar = e5aVar.g;
                    e5aVar.getClass();
                    j -= e5aVar.c - e5aVar.b;
                }
                if (e31Var.e() == 2) {
                    byte j3 = e31Var.j(0);
                    byte j4 = e31Var.j(1);
                    while (j < this.b) {
                        byte[] bArr = e5aVar.a;
                        i = (int) ((e5aVar.b + j2) - j);
                        int i3 = e5aVar.c;
                        while (i < i3) {
                            byte b = bArr[i];
                            if (b != j3 && b != j4) {
                                i++;
                            }
                            i2 = e5aVar.b;
                        }
                        j2 = (e5aVar.c - e5aVar.b) + j;
                        e5aVar = e5aVar.f;
                        e5aVar.getClass();
                        j = j2;
                    }
                    return -1L;
                }
                byte[] i4 = e31Var.i();
                while (j < this.b) {
                    byte[] bArr2 = e5aVar.a;
                    i = (int) ((e5aVar.b + j2) - j);
                    int i5 = e5aVar.c;
                    while (i < i5) {
                        byte b2 = bArr2[i];
                        for (byte b3 : i4) {
                            if (b2 == b3) {
                                i2 = e5aVar.b;
                            }
                        }
                        i++;
                    }
                    j2 = (e5aVar.c - e5aVar.b) + j;
                    e5aVar = e5aVar.f;
                    e5aVar.getClass();
                    j = j2;
                }
                return -1L;
            }
            j = 0;
            while (true) {
                long j5 = (e5aVar.c - e5aVar.b) + j;
                if (j5 > 0) {
                    break;
                }
                e5aVar = e5aVar.f;
                e5aVar.getClass();
                j = j5;
            }
            if (e31Var.e() == 2) {
                byte j6 = e31Var.j(0);
                byte j7 = e31Var.j(1);
                while (j < this.b) {
                    byte[] bArr3 = e5aVar.a;
                    i = (int) ((e5aVar.b + j2) - j);
                    int i6 = e5aVar.c;
                    while (i < i6) {
                        byte b4 = bArr3[i];
                        if (b4 != j6 && b4 != j7) {
                            i++;
                        }
                        i2 = e5aVar.b;
                    }
                    j2 = (e5aVar.c - e5aVar.b) + j;
                    e5aVar = e5aVar.f;
                    e5aVar.getClass();
                    j = j2;
                }
                return -1L;
            }
            byte[] i7 = e31Var.i();
            while (j < this.b) {
                byte[] bArr4 = e5aVar.a;
                i = (int) ((e5aVar.b + j2) - j);
                int i8 = e5aVar.c;
                while (i < i8) {
                    byte b5 = bArr4[i];
                    for (byte b6 : i7) {
                        if (b5 == b6) {
                            i2 = e5aVar.b;
                        }
                    }
                    i++;
                }
                j2 = (e5aVar.c - e5aVar.b) + j;
                e5aVar = e5aVar.f;
                e5aVar.getClass();
                j = j2;
            }
            return -1L;
            return (i - i2) + j;
        }
        return -1L;
    }

    public final void g1(e31 e31Var) {
        e31Var.getClass();
        e31Var.u(this, e31Var.e());
    }

    public final int hashCode() {
        e5a e5aVar = this.a;
        if (e5aVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = e5aVar.c;
            for (int i3 = e5aVar.b; i3 < i2; i3++) {
                i = (i * 31) + e5aVar.a[i3];
            }
            e5aVar = e5aVar.f;
            e5aVar.getClass();
        } while (e5aVar != this.a);
        return i;
    }

    @Override // defpackage.az0
    public final /* bridge */ /* synthetic */ az0 i0(String str) {
        q1(str);
        return this;
    }

    @Override // defpackage.bz0
    public final InputStream i1() {
        return new ln0(this, 1);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final boolean j0(int i, long j, e31 e31Var) {
        e31Var.getClass();
        if (i >= 0 && j >= 0 && i + j <= this.b && i <= e31Var.e()) {
            if (i == 0 || b.a(this, e31Var, j, j + 1, i) != -1) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.bz0
    public final boolean k() {
        if (this.b == 0) {
            return true;
        }
        return false;
    }

    public final void k1(int i) {
        e5a b1 = b1(1);
        byte[] bArr = b1.a;
        int i2 = b1.c;
        b1.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
    }

    public final void l1(long j) {
        boolean z;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            k1(48);
            return;
        }
        int i2 = 0;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                q1("-9223372036854775808");
                return;
            }
            z = true;
        } else {
            z = false;
        }
        byte[] bArr = b.a;
        int numberOfLeadingZeros = ((64 - Long.numberOfLeadingZeros(j)) * 10) >>> 5;
        if (j > b.b[numberOfLeadingZeros]) {
            i2 = 1;
        }
        int i3 = numberOfLeadingZeros + i2;
        if (z) {
            i3++;
        }
        e5a b1 = b1(i3);
        byte[] bArr2 = b1.a;
        int i4 = b1.c + i3;
        while (j != 0) {
            i4--;
            bArr2[i4] = b.a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr2[i4 - 1] = 45;
        }
        b1.c += i3;
        this.b += i3;
    }

    public final void m0(ky0 ky0Var) {
        ky0Var.getClass();
        byte[] bArr = b.a;
        if (ky0Var.a == null) {
            ky0Var.a = this;
            ky0Var.b = true;
            return;
        }
        vs.k("already attached to a buffer");
    }

    public final void m1(long j) {
        if (j == 0) {
            k1(48);
            return;
        }
        long j2 = (j >>> 1) | j;
        long j3 = j2 | (j2 >>> 2);
        long j4 = j3 | (j3 >>> 4);
        long j5 = j4 | (j4 >>> 8);
        long j6 = j5 | (j5 >>> 16);
        long j7 = j6 | (j6 >>> 32);
        long j8 = j7 - ((j7 >>> 1) & 6148914691236517205L);
        long j9 = ((j8 >>> 2) & 3689348814741910323L) + (j8 & 3689348814741910323L);
        long j10 = ((j9 >>> 4) + j9) & 1085102592571150095L;
        long j11 = j10 + (j10 >>> 8);
        long j12 = j11 + (j11 >>> 16);
        int i = (int) ((((j12 & 63) + ((j12 >>> 32) & 63)) + 3) / 4);
        e5a b1 = b1(i);
        byte[] bArr = b1.a;
        int i2 = b1.c;
        for (int i3 = (i2 + i) - 1; i3 >= i2; i3--) {
            bArr[i3] = b.a[(int) (15 & j)];
            j >>>= 4;
        }
        b1.c += i;
        this.b += i;
    }

    @Override // defpackage.az0
    public final /* bridge */ /* synthetic */ az0 n(byte[] bArr, int i) {
        write(bArr, 0, i);
        return this;
    }

    public final void n1(int i) {
        m9writeInt(bbe.v(i));
    }

    public final void o() {
        skip(this.b);
    }

    public final void o1(int i) {
        e5a b1 = b1(2);
        byte[] bArr = b1.a;
        int i2 = b1.c;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 1] = (byte) (i & 255);
        b1.c = i2 + 2;
        this.b += 2;
    }

    public final byte[] p0(long j) {
        if (j >= 0 && j <= 2147483647L) {
            if (this.b >= j) {
                byte[] bArr = new byte[(int) j];
                readFully(bArr);
                return bArr;
            }
            throw new EOFException();
        }
        p1a.k(hl5.k(j, "byteCount: "));
        return null;
    }

    public final void p1(int i, int i2, String str) {
        char charAt;
        char c;
        str.getClass();
        if (i >= 0) {
            if (i2 >= i) {
                if (i2 <= str.length()) {
                    while (i < i2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 128) {
                            e5a b1 = b1(1);
                            byte[] bArr = b1.a;
                            int i3 = b1.c - i;
                            int min = Math.min(i2, 8192 - i3);
                            int i4 = i + 1;
                            bArr[i + i3] = (byte) charAt2;
                            while (true) {
                                i = i4;
                                if (i >= min || (charAt = str.charAt(i)) >= 128) {
                                    break;
                                }
                                i4 = i + 1;
                                bArr[i + i3] = (byte) charAt;
                            }
                            int i5 = b1.c;
                            int i6 = (i3 + i) - i5;
                            b1.c = i5 + i6;
                            this.b += i6;
                        } else {
                            if (charAt2 < 2048) {
                                e5a b12 = b1(2);
                                byte[] bArr2 = b12.a;
                                int i7 = b12.c;
                                bArr2[i7] = (byte) ((charAt2 >> 6) | 192);
                                bArr2[i7 + 1] = (byte) ((charAt2 & '?') | Token.CASE);
                                b12.c = i7 + 2;
                                this.b += 2;
                            } else if (charAt2 >= 55296 && charAt2 <= 57343) {
                                int i8 = i + 1;
                                if (i8 < i2) {
                                    c = str.charAt(i8);
                                } else {
                                    c = 0;
                                }
                                if (charAt2 <= 56319 && 56320 <= c && c < 57344) {
                                    int i9 = (((charAt2 & 1023) << 10) | (c & 1023)) + Parser.ARGC_LIMIT;
                                    e5a b13 = b1(4);
                                    byte[] bArr3 = b13.a;
                                    int i10 = b13.c;
                                    bArr3[i10] = (byte) ((i9 >> 18) | 240);
                                    bArr3[i10 + 1] = (byte) (((i9 >> 12) & 63) | Token.CASE);
                                    bArr3[i10 + 2] = (byte) (((i9 >> 6) & 63) | Token.CASE);
                                    bArr3[i10 + 3] = (byte) ((i9 & 63) | Token.CASE);
                                    b13.c = i10 + 4;
                                    this.b += 4;
                                    i += 2;
                                } else {
                                    k1(63);
                                    i = i8;
                                }
                            } else {
                                e5a b14 = b1(3);
                                byte[] bArr4 = b14.a;
                                int i11 = b14.c;
                                bArr4[i11] = (byte) ((charAt2 >> '\f') | 224);
                                bArr4[i11 + 1] = (byte) ((63 & (charAt2 >> 6)) | Token.CASE);
                                bArr4[i11 + 2] = (byte) ((charAt2 & '?') | Token.CASE);
                                b14.c = i11 + 3;
                                this.b += 3;
                            }
                            i++;
                        }
                    }
                    return;
                }
                p1a.i(str.length(), hl5.s("endIndex > string.length: ", " > ", i2));
                return;
            }
            p1a.k(rs8.k("endIndex < beginIndex: ", i2, i, " < "));
            return;
        }
        p1a.k(a82.j(i, "beginIndex < 0: "));
    }

    public final long q() {
        long j = this.b;
        if (j == 0) {
            return 0L;
        }
        e5a e5aVar = this.a;
        e5aVar.getClass();
        e5a e5aVar2 = e5aVar.g;
        e5aVar2.getClass();
        int i = e5aVar2.c;
        if (i < 8192 && e5aVar2.e) {
            return j - (i - e5aVar2.b);
        }
        return j;
    }

    @Override // defpackage.az0
    public final /* bridge */ /* synthetic */ az0 q0(long j) {
        m1(j);
        return this;
    }

    public final void q1(String str) {
        str.getClass();
        p1(0, str.length(), str);
    }

    public final void r1(int i) {
        if (i < 128) {
            k1(i);
        } else if (i < 2048) {
            e5a b1 = b1(2);
            byte[] bArr = b1.a;
            int i2 = b1.c;
            bArr[i2] = (byte) ((i >> 6) | 192);
            bArr[i2 + 1] = (byte) ((i & 63) | Token.CASE);
            b1.c = i2 + 2;
            this.b += 2;
        } else if (55296 <= i && i < 57344) {
            k1(63);
        } else if (i < 65536) {
            e5a b12 = b1(3);
            byte[] bArr2 = b12.a;
            int i3 = b12.c;
            bArr2[i3] = (byte) ((i >> 12) | 224);
            bArr2[i3 + 1] = (byte) (((i >> 6) & 63) | Token.CASE);
            bArr2[i3 + 2] = (byte) ((i & 63) | Token.CASE);
            b12.c = i3 + 3;
            this.b += 3;
        } else if (i <= 1114111) {
            e5a b13 = b1(4);
            byte[] bArr3 = b13.a;
            int i4 = b13.c;
            bArr3[i4] = (byte) ((i >> 18) | 240);
            bArr3[i4 + 1] = (byte) (((i >> 12) & 63) | Token.CASE);
            bArr3[i4 + 2] = (byte) (((i >> 6) & 63) | Token.CASE);
            bArr3[i4 + 3] = (byte) ((i & 63) | Token.CASE);
            b13.c = i4 + 4;
            this.b += 4;
        } else {
            vs.m("Unexpected code point: 0x".concat(bbe.x(i)));
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        bbe.n(bArr.length, i, i2);
        e5a e5aVar = this.a;
        if (e5aVar == null) {
            return -1;
        }
        int min = Math.min(i2, e5aVar.c - e5aVar.b);
        byte[] bArr2 = e5aVar.a;
        int i3 = e5aVar.b;
        b00.U(i, i3, i3 + min, bArr2, bArr);
        int i4 = e5aVar.b + min;
        e5aVar.b = i4;
        this.b -= min;
        if (i4 == e5aVar.c) {
            this.a = e5aVar.a();
            n5a.a(e5aVar);
        }
        return min;
    }

    @Override // defpackage.bz0
    public final byte readByte() {
        if (this.b != 0) {
            e5a e5aVar = this.a;
            e5aVar.getClass();
            int i = e5aVar.b;
            int i2 = e5aVar.c;
            int i3 = i + 1;
            byte b = e5aVar.a[i];
            this.b--;
            if (i3 == i2) {
                this.a = e5aVar.a();
                n5a.a(e5aVar);
                return b;
            }
            e5aVar.b = i3;
            return b;
        }
        throw new EOFException();
    }

    @Override // defpackage.bz0
    public final void readFully(byte[] bArr) {
        bArr.getClass();
        int i = 0;
        while (i < bArr.length) {
            int read = read(bArr, i, bArr.length - i);
            if (read != -1) {
                i += read;
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.bz0
    public final int readInt() {
        if (this.b >= 4) {
            e5a e5aVar = this.a;
            e5aVar.getClass();
            int i = e5aVar.b;
            int i2 = e5aVar.c;
            if (i2 - i < 4) {
                return (readByte() & 255) | ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8);
            }
            byte[] bArr = e5aVar.a;
            int i3 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
            int i4 = i + 3;
            int i5 = i + 4;
            int i6 = (bArr[i4] & 255) | i3 | ((bArr[i + 2] & 255) << 8);
            this.b -= 4;
            if (i5 == i2) {
                this.a = e5aVar.a();
                n5a.a(e5aVar);
                return i6;
            }
            e5aVar.b = i5;
            return i6;
        }
        throw new EOFException();
    }

    @Override // defpackage.bz0
    public final long readLong() {
        if (this.b >= 8) {
            e5a e5aVar = this.a;
            e5aVar.getClass();
            int i = e5aVar.b;
            int i2 = e5aVar.c;
            if (i2 - i < 8) {
                return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
            }
            byte[] bArr = e5aVar.a;
            long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40);
            int i3 = i + 7;
            int i4 = i + 8;
            long j2 = j | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8) | (bArr[i3] & 255);
            this.b -= 8;
            if (i4 == i2) {
                this.a = e5aVar.a();
                n5a.a(e5aVar);
                return j2;
            }
            e5aVar.b = i4;
            return j2;
        }
        throw new EOFException();
    }

    @Override // defpackage.bz0
    public final short readShort() {
        if (this.b >= 2) {
            e5a e5aVar = this.a;
            e5aVar.getClass();
            int i = e5aVar.b;
            int i2 = e5aVar.c;
            if (i2 - i < 2) {
                return (short) ((readByte() & 255) | ((readByte() & 255) << 8));
            }
            byte[] bArr = e5aVar.a;
            int i3 = i + 1;
            int i4 = i + 2;
            int i5 = (bArr[i3] & 255) | ((bArr[i] & 255) << 8);
            this.b -= 2;
            if (i4 == i2) {
                this.a = e5aVar.a();
                n5a.a(e5aVar);
            } else {
                e5aVar.b = i4;
            }
            return (short) i5;
        }
        throw new EOFException();
    }

    @Override // defpackage.bz0
    public final boolean request(long j) {
        if (this.b >= j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.bz0
    public final void skip(long j) {
        while (j > 0) {
            e5a e5aVar = this.a;
            if (e5aVar != null) {
                int min = (int) Math.min(j, e5aVar.c - e5aVar.b);
                long j2 = min;
                this.b -= j2;
                j -= j2;
                int i = e5aVar.b + min;
                e5aVar.b = i;
                if (i == e5aVar.c) {
                    this.a = e5aVar.a();
                    n5a.a(e5aVar);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    @Override // defpackage.bz0
    public final e31 t0() {
        return B(this.b);
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return dac.d;
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            return V0((int) j).toString();
        }
        long j2 = this.b;
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + j2).toString());
    }

    @Override // defpackage.bz0
    public final void w(long j) {
        if (this.b >= j) {
            return;
        }
        throw new EOFException();
    }

    @Override // defpackage.bz0
    public final void w0(my0 my0Var, long j) {
        long j2 = this.b;
        if (j2 >= j) {
            my0Var.write(this, j);
        } else {
            my0Var.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // defpackage.yma
    public final void write(my0 my0Var, long j) {
        e5a e5aVar;
        e5a e5aVar2;
        e5a b;
        int i;
        my0Var.getClass();
        if (my0Var != this) {
            bbe.n(my0Var.b, 0L, j);
            while (j > 0) {
                e5a e5aVar3 = my0Var.a;
                e5aVar3.getClass();
                int i2 = e5aVar3.c;
                my0Var.a.getClass();
                int i3 = (j > (i2 - e5aVar.b) ? 1 : (j == (i2 - e5aVar.b) ? 0 : -1));
                int i4 = 0;
                if (i3 < 0) {
                    e5a e5aVar4 = this.a;
                    if (e5aVar4 != null) {
                        e5aVar2 = e5aVar4.g;
                    } else {
                        e5aVar2 = null;
                    }
                    if (e5aVar2 != null && e5aVar2.e) {
                        long j2 = e5aVar2.c + j;
                        if (e5aVar2.d) {
                            i = 0;
                        } else {
                            i = e5aVar2.b;
                        }
                        if (j2 - i <= 8192) {
                            e5a e5aVar5 = my0Var.a;
                            e5aVar5.getClass();
                            e5aVar5.d(e5aVar2, (int) j);
                            my0Var.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    e5a e5aVar6 = my0Var.a;
                    e5aVar6.getClass();
                    int i5 = (int) j;
                    if (i5 > 0 && i5 <= e5aVar6.c - e5aVar6.b) {
                        if (i5 >= 1024) {
                            b = e5aVar6.c();
                        } else {
                            b = n5a.b();
                            byte[] bArr = e5aVar6.a;
                            byte[] bArr2 = b.a;
                            int i6 = e5aVar6.b;
                            b00.c0(bArr, 0, i6, bArr2, i6 + i5, 2);
                        }
                        b.c = b.b + i5;
                        e5aVar6.b += i5;
                        e5a e5aVar7 = e5aVar6.g;
                        e5aVar7.getClass();
                        e5aVar7.b(b);
                        my0Var.a = b;
                    } else {
                        vs.m("byteCount out of range");
                        return;
                    }
                }
                e5a e5aVar8 = my0Var.a;
                e5aVar8.getClass();
                long j3 = e5aVar8.c - e5aVar8.b;
                my0Var.a = e5aVar8.a();
                e5a e5aVar9 = this.a;
                if (e5aVar9 == null) {
                    this.a = e5aVar8;
                    e5aVar8.g = e5aVar8;
                    e5aVar8.f = e5aVar8;
                } else {
                    e5a e5aVar10 = e5aVar9.g;
                    e5aVar10.getClass();
                    e5aVar10.b(e5aVar8);
                    e5a e5aVar11 = e5aVar8.g;
                    if (e5aVar11 != e5aVar8) {
                        e5aVar11.getClass();
                        if (e5aVar11.e) {
                            int i7 = e5aVar8.c - e5aVar8.b;
                            e5a e5aVar12 = e5aVar8.g;
                            e5aVar12.getClass();
                            int i8 = 8192 - e5aVar12.c;
                            e5a e5aVar13 = e5aVar8.g;
                            e5aVar13.getClass();
                            if (!e5aVar13.d) {
                                e5a e5aVar14 = e5aVar8.g;
                                e5aVar14.getClass();
                                i4 = e5aVar14.b;
                            }
                            if (i7 <= i8 + i4) {
                                e5a e5aVar15 = e5aVar8.g;
                                e5aVar15.getClass();
                                e5aVar8.d(e5aVar15, i7);
                                e5aVar8.a();
                                n5a.a(e5aVar8);
                            }
                        }
                    } else {
                        vs.k("cannot compact");
                        return;
                    }
                }
                my0Var.b -= j3;
                this.b += j3;
                j -= j3;
            }
            return;
        }
        vs.m("source == this");
    }

    @Override // defpackage.az0
    public final /* bridge */ /* synthetic */ az0 writeByte(int i) {
        k1(i);
        return this;
    }

    /* renamed from: writeInt  reason: collision with other method in class */
    public final void m9writeInt(int i) {
        e5a b1 = b1(4);
        byte[] bArr = b1.a;
        int i2 = b1.c;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        bArr[i2 + 1] = (byte) ((i >>> 16) & 255);
        bArr[i2 + 2] = (byte) ((i >>> 8) & 255);
        bArr[i2 + 3] = (byte) (i & 255);
        b1.c = i2 + 4;
        this.b += 4;
    }

    @Override // defpackage.az0
    public final /* bridge */ /* synthetic */ az0 writeShort(int i) {
        o1(i);
        return this;
    }

    public final short y0() {
        short readShort = readShort();
        return (short) (((readShort & 255) << 8) | ((65280 & readShort) >>> 8));
    }

    @Override // defpackage.az0
    public final az0 a0() {
        return this;
    }

    @Override // defpackage.bz0
    public final my0 b() {
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, defpackage.yma
    public final void close() {
    }

    @Override // defpackage.az0, defpackage.yma, java.io.Flushable
    public final void flush() {
    }

    @Override // defpackage.az0
    public final /* bridge */ /* synthetic */ az0 writeInt(int i) {
        m9writeInt(i);
        return this;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        e5a e5aVar = this.a;
        if (e5aVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), e5aVar.c - e5aVar.b);
        byteBuffer.put(e5aVar.a, e5aVar.b, min);
        int i = e5aVar.b + min;
        e5aVar.b = i;
        this.b -= min;
        if (i == e5aVar.c) {
            this.a = e5aVar.a();
            n5a.a(e5aVar);
        }
        return min;
    }

    @Override // defpackage.bz0
    public final int read(byte[] bArr) {
        bArr.getClass();
        return read(bArr, 0, bArr.length);
    }

    @Override // defpackage.osa
    public final long read(my0 my0Var, long j) {
        my0Var.getClass();
        if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            my0Var.write(this, j);
            return j;
        }
        p1a.k(hl5.k(j, "byteCount < 0: "));
        return 0L;
    }

    @Override // defpackage.az0
    public final /* bridge */ /* synthetic */ az0 write(byte[] bArr) {
        m8write(bArr);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        byteBuffer.getClass();
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            e5a b1 = b1(1);
            int min = Math.min(i, 8192 - b1.c);
            byteBuffer.get(b1.a, b1.c, min);
            i -= min;
            b1.c += min;
        }
        this.b += remaining;
        return remaining;
    }

    /* renamed from: write  reason: collision with other method in class */
    public final void m8write(byte[] bArr) {
        bArr.getClass();
        write(bArr, 0, bArr.length);
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = i2;
        bbe.n(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            e5a b1 = b1(1);
            int min = Math.min(i3 - i, 8192 - b1.c);
            int i4 = i + min;
            b00.U(b1.c, i, i4, bArr, b1.a);
            b1.c += min;
            i = i4;
        }
        this.b += j;
    }
}
