package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cx9  reason: default package */
/* loaded from: classes.dex */
public final class cx9 {
    public final ij1 a;
    public final int b;
    public final km8 c;
    public ju0 d;
    public ju0 e;
    public ju0 f;
    public long g;

    public cx9(ij1 ij1Var) {
        int i;
        this.a = ij1Var;
        synchronized (ij1Var) {
            i = ((jv2) ij1Var.d).c.b;
        }
        this.b = i;
        this.c = new km8(32);
        ju0 ju0Var = new ju0(0L, i);
        this.d = ju0Var;
        this.e = ju0Var;
        this.f = ju0Var;
    }

    public static ju0 c(ju0 ju0Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= ju0Var.b) {
            ju0Var = (ju0) ju0Var.d;
        }
        while (i > 0) {
            int min = Math.min(i, (int) (ju0Var.b - j));
            nc ncVar = (nc) ju0Var.c;
            byteBuffer.put(ncVar.a, ((int) (j - ju0Var.a)) + ncVar.b, min);
            i -= min;
            j += min;
            if (j == ju0Var.b) {
                ju0Var = (ju0) ju0Var.d;
            }
        }
        return ju0Var;
    }

    public static ju0 d(ju0 ju0Var, long j, byte[] bArr, int i) {
        while (j >= ju0Var.b) {
            ju0Var = (ju0) ju0Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (ju0Var.b - j));
            nc ncVar = (nc) ju0Var.c;
            System.arraycopy(ncVar.a, ((int) (j - ju0Var.a)) + ncVar.b, bArr, i - i2, min);
            i2 -= min;
            j += min;
            if (j == ju0Var.b) {
                ju0Var = (ju0) ju0Var.d;
            }
        }
        return ju0Var;
    }

    public static ju0 e(ju0 ju0Var, cr2 cr2Var, x91 x91Var, km8 km8Var) {
        boolean z;
        if (cr2Var.h(1073741824)) {
            long j = x91Var.b;
            int i = 1;
            km8Var.J(1);
            ju0 d = d(ju0Var, j, km8Var.a, 1);
            long j2 = j + 1;
            byte b = km8Var.a[0];
            if ((b & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            int i2 = b & Byte.MAX_VALUE;
            nd2 nd2Var = cr2Var.d;
            byte[] bArr = nd2Var.a;
            if (bArr == null) {
                nd2Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            ju0Var = d(d, j2, nd2Var.a, i2);
            long j3 = j2 + i2;
            if (z) {
                km8Var.J(2);
                ju0Var = d(ju0Var, j3, km8Var.a, 2);
                j3 += 2;
                i = km8Var.G();
            }
            int[] iArr = nd2Var.d;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = nd2Var.e;
            if (iArr2 == null || iArr2.length < i) {
                iArr2 = new int[i];
            }
            if (z) {
                int i3 = i * 6;
                km8Var.J(i3);
                ju0Var = d(ju0Var, j3, km8Var.a, i3);
                j3 += i3;
                km8Var.M(0);
                for (int i4 = 0; i4 < i; i4++) {
                    iArr[i4] = km8Var.G();
                    iArr2[i4] = km8Var.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = x91Var.a - ((int) (j3 - x91Var.b));
            }
            ejc ejcVar = (ejc) x91Var.c;
            String str = a2d.a;
            byte[] bArr2 = ejcVar.b;
            byte[] bArr3 = nd2Var.a;
            int i5 = ejcVar.a;
            int i6 = ejcVar.c;
            int i7 = ejcVar.d;
            nd2Var.f = i;
            nd2Var.d = iArr;
            nd2Var.e = iArr2;
            nd2Var.b = bArr2;
            nd2Var.a = bArr3;
            nd2Var.c = i5;
            nd2Var.g = i6;
            nd2Var.h = i7;
            MediaCodec.CryptoInfo cryptoInfo = nd2Var.i;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i5;
            s6f s6fVar = nd2Var.j;
            s6fVar.getClass();
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) s6fVar.b;
            pattern.set(i6, i7);
            ((MediaCodec.CryptoInfo) s6fVar.a).setPattern(pattern);
            long j4 = x91Var.b;
            int i8 = (int) (j3 - j4);
            x91Var.b = j4 + i8;
            x91Var.a -= i8;
        }
        if (cr2Var.h(268435456)) {
            km8Var.J(4);
            ju0 d2 = d(ju0Var, x91Var.b, km8Var.a, 4);
            int D = km8Var.D();
            x91Var.b += 4;
            x91Var.a -= 4;
            cr2Var.p(D);
            ju0 c = c(d2, x91Var.b, cr2Var.e, D);
            x91Var.b += D;
            int i9 = x91Var.a - D;
            x91Var.a = i9;
            ByteBuffer byteBuffer = cr2Var.D;
            if (byteBuffer != null && byteBuffer.capacity() >= i9) {
                cr2Var.D.clear();
            } else {
                cr2Var.D = ByteBuffer.allocate(i9);
            }
            return c(c, x91Var.b, cr2Var.D, x91Var.a);
        }
        cr2Var.p(x91Var.a);
        return c(ju0Var, x91Var.b, cr2Var.e, x91Var.a);
    }

    public final void a(long j) {
        ju0 ju0Var;
        if (j != -1) {
            while (true) {
                ju0Var = this.d;
                if (j < ju0Var.b) {
                    break;
                }
                ij1 ij1Var = this.a;
                nc ncVar = (nc) ju0Var.c;
                synchronized (ij1Var) {
                    fs2 fs2Var = ((jv2) ij1Var.d).c;
                    synchronized (fs2Var) {
                        nc[] ncVarArr = fs2Var.f;
                        int i = fs2Var.e;
                        fs2Var.e = i + 1;
                        ncVarArr[i] = ncVar;
                        fs2Var.d--;
                    }
                    ij1Var.T(ncVar);
                }
                ju0 ju0Var2 = this.d;
                ju0Var2.c = null;
                ju0Var2.d = null;
                this.d = (ju0) ju0Var2.d;
            }
            if (this.e.a < ju0Var.a) {
                this.e = ju0Var;
            }
        }
    }

    public final int b(int i) {
        nc a;
        ju0 ju0Var = this.f;
        if (((nc) ju0Var.c) == null) {
            ij1 ij1Var = this.a;
            synchronized (ij1Var) {
                a = ((jv2) ij1Var.d).c.a();
                ((HashMap) ij1Var.b).put(a, (a09) ij1Var.c);
                iv2 iv2Var = (iv2) ((jv2) ij1Var.d).p.get((a09) ij1Var.c);
                if (iv2Var != null) {
                    synchronized (iv2Var) {
                        iv2Var.d++;
                    }
                }
            }
            ju0 ju0Var2 = new ju0(this.f.b, this.b);
            ju0Var.c = a;
            ju0Var.d = ju0Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
