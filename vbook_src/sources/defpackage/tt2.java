package defpackage;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tt2  reason: default package */
/* loaded from: classes.dex */
public final class tt2 implements s94 {
    public int C;
    public final eg2 b;
    public final long c;
    public long d;
    public int f;
    public byte[] e = new byte[Parser.ARGC_LIMIT];
    public final byte[] a = new byte[4096];

    static {
        g57.a("media3.extractor");
    }

    public tt2(eg2 eg2Var, long j, long j2) {
        this.b = eg2Var;
        this.d = j;
        this.c = j2;
    }

    @Override // defpackage.s94
    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int min;
        int i3 = this.C;
        if (i3 == 0) {
            min = 0;
        } else {
            min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            k(min);
        }
        int i4 = min;
        while (i4 < i2 && i4 != -1) {
            i4 = g(bArr, i, i2, i4, z);
        }
        if (i4 != -1) {
            this.d += i4;
        }
        if (i4 == -1) {
            return false;
        }
        return true;
    }

    public final boolean b(int i, boolean z) {
        c(i);
        int i2 = this.C - this.f;
        while (i2 < i) {
            tt2 tt2Var = this;
            int i3 = i;
            boolean z2 = z;
            i2 = tt2Var.g(this.e, this.f, i3, i2, z2);
            if (i2 == -1) {
                return false;
            }
            tt2Var.C = tt2Var.f + i2;
            this = tt2Var;
            i = i3;
            z = z2;
        }
        this.f += i;
        return true;
    }

    public final void c(int i) {
        int i2 = this.f + i;
        byte[] bArr = this.e;
        if (i2 > bArr.length) {
            this.e = Arrays.copyOf(this.e, a2d.i(bArr.length * 2, Parser.ARGC_LIMIT + i2, i2 + 524288));
        }
    }

    @Override // defpackage.s94
    public final boolean e(int i, boolean z) {
        int min = Math.min(this.C, i);
        k(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            byte[] bArr = this.a;
            i2 = g(bArr, -i2, Math.min(i, bArr.length + i2), i2, z);
        }
        if (i2 != -1) {
            this.d += i2;
        }
        if (i2 != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.s94
    public final boolean f(byte[] bArr, int i, int i2, boolean z) {
        if (!b(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final int g(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int read = this.b.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }

    @Override // defpackage.s94
    public final long getLength() {
        return this.c;
    }

    @Override // defpackage.s94
    public final long getPosition() {
        return this.d;
    }

    @Override // defpackage.s94
    public final long h() {
        return this.d + this.f;
    }

    @Override // defpackage.s94
    public final void i(int i) {
        b(i, false);
    }

    @Override // defpackage.s94
    public final int j(int i) {
        tt2 tt2Var;
        int min = Math.min(this.C, i);
        k(min);
        if (min == 0) {
            byte[] bArr = this.a;
            tt2Var = this;
            min = tt2Var.g(bArr, 0, Math.min(i, bArr.length), 0, true);
        } else {
            tt2Var = this;
        }
        if (min != -1) {
            tt2Var.d += min;
        }
        return min;
    }

    public final void k(int i) {
        byte[] bArr;
        int i2 = this.C - i;
        this.C = i2;
        this.f = 0;
        byte[] bArr2 = this.e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[Parser.ARGC_LIMIT + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.e = bArr;
    }

    @Override // defpackage.s94
    public final int n(byte[] bArr, int i, int i2) {
        tt2 tt2Var;
        int min;
        c(i2);
        int i3 = this.C;
        int i4 = this.f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            tt2Var = this;
            min = tt2Var.g(this.e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            tt2Var.C += min;
        } else {
            tt2Var = this;
            min = Math.min(i2, i5);
        }
        System.arraycopy(tt2Var.e, tt2Var.f, bArr, i, min);
        tt2Var.f += min;
        return min;
    }

    @Override // defpackage.s94
    public final void p() {
        this.f = 0;
    }

    @Override // defpackage.s94
    public final void q(int i) {
        e(i, false);
    }

    @Override // defpackage.eg2
    public final int read(byte[] bArr, int i, int i2) {
        tt2 tt2Var;
        int i3 = this.C;
        int i4 = 0;
        if (i3 != 0) {
            int min = Math.min(i3, i2);
            System.arraycopy(this.e, 0, bArr, i, min);
            k(min);
            i4 = min;
        }
        if (i4 == 0) {
            tt2Var = this;
            i4 = tt2Var.g(bArr, i, i2, 0, true);
        } else {
            tt2Var = this;
        }
        if (i4 != -1) {
            tt2Var.d += i4;
        }
        return i4;
    }

    @Override // defpackage.s94
    public final void readFully(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    @Override // defpackage.s94
    public final void x(byte[] bArr, int i, int i2) {
        f(bArr, i, i2, false);
    }
}
