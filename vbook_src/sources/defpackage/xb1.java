package defpackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xb1  reason: default package */
/* loaded from: classes.dex */
public abstract class xb1 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;

    public xb1(tkf tkfVar, int i) {
        this.a = 5;
        if (tkfVar != null) {
            if (i >= 0) {
                this.b = i;
                this.c = tkfVar;
                return;
            }
            vs.m(nk2.s(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        vs.m("format options cannot be null");
        throw null;
    }

    public static long K(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static x6e M(byte[] bArr, int i, int i2) {
        x6e x6eVar = new x6e(bArr, i, i2);
        try {
            x6eVar.Q(i2);
            return x6eVar;
        } catch (w7e e) {
            xk5.m(e);
            return null;
        }
    }

    public static int u(int i, FileInputStream fileInputStream) {
        if ((i & Token.CASE) == 0) {
            return i;
        }
        int i2 = i & Token.SWITCH;
        int i3 = 7;
        while (i3 < 32) {
            int read = fileInputStream.read();
            if (read != -1) {
                i2 |= (read & Token.SWITCH) << i3;
                if ((read & Token.CASE) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw p16.e();
            }
        }
        while (i3 < 64) {
            int read2 = fileInputStream.read();
            if (read2 != -1) {
                if ((read2 & Token.CASE) == 0) {
                    return i2;
                }
                i3 += 7;
            } else {
                throw p16.e();
            }
        }
        throw p16.c();
    }

    public abstract String A();

    public abstract int B();

    public abstract int C();

    public abstract long D();

    public void E(char[] cArr) {
        cArr.getClass();
        synchronized (this) {
            int i = this.b;
            if (cArr.length + i < zz.a) {
                this.b = i + cArr.length;
                ((rz) this.c).addLast(cArr);
            }
        }
    }

    public abstract boolean F(int i);

    public void G() {
        int B;
        do {
            B = B();
            if (B != 0) {
                int i = this.b;
                if (i < 100) {
                    this.b = i + 1;
                    this.b--;
                } else {
                    throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                }
            } else {
                return;
            }
        } while (F(B));
    }

    public char[] H(int i) {
        char[] cArr;
        Object removeLast;
        synchronized (this) {
            rz rzVar = (rz) this.c;
            cArr = null;
            if (rzVar.isEmpty()) {
                removeLast = null;
            } else {
                removeLast = rzVar.removeLast();
            }
            char[] cArr2 = (char[]) removeLast;
            if (cArr2 != null) {
                this.b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            return new char[i];
        }
        return cArr;
    }

    public abstract double I();

    public abstract int J();

    public ByteBuffer L(byte[] bArr, int i) {
        int[] O = O(i, mse.d(bArr));
        int[] iArr = (int[]) O.clone();
        mse.b(iArr);
        for (int i2 = 0; i2 < O.length; i2++) {
            O[i2] = O[i2] + iArr[i2];
        }
        ByteBuffer order = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        order.asIntBuffer().put(O, 0, 16);
        return order;
    }

    public void N(byte[] bArr, ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        if (bArr.length == J()) {
            int remaining = byteBuffer2.remaining();
            int i = remaining / 64;
            int i2 = i + 1;
            for (int i3 = 0; i3 < i2; i3++) {
                ByteBuffer L = L(bArr, this.b + i3);
                if (i3 == i) {
                    yqe.E(byteBuffer, byteBuffer2, L, remaining % 64);
                } else {
                    yqe.E(byteBuffer, byteBuffer2, L, 64);
                }
            }
            return;
        }
        throw new GeneralSecurityException(a82.j(J(), "The nonce length (in bytes) must be "));
    }

    public abstract int[] O(int i, int[] iArr);

    public abstract float P();

    public abstract int Q(int i);

    public abstract void R(cr3 cr3Var, Object obj);

    public abstract int S();

    public abstract void T(int i);

    public abstract int U();

    public abstract void V(int i);

    public abstract int W();

    public abstract int X();

    public abstract int Y();

    public abstract int Z();

    public abstract void a(int i);

    public abstract int a0();

    public abstract int b();

    public abstract int b0();

    public abstract boolean c();

    public abstract long c0();

    public abstract long d0();

    public abstract long e0();

    public abstract tjd f(tjd tjdVar, List list);

    public abstract long f0();

    public abstract rwa g(zid zidVar, rwa rwaVar);

    public abstract long g0();

    public abstract void h(int i);

    public abstract w6e h0();

    public abstract String i0();

    public abstract int j(int i);

    public abstract String j0();

    public abstract boolean k();

    public abstract boolean k0();

    public abstract a31 l();

    public abstract boolean l0();

    public abstract c31 m();

    public abstract double n();

    public abstract int o();

    public abstract int p();

    public abstract long q();

    public abstract float r();

    public abstract int s();

    public abstract long t();

    public String toString() {
        switch (this.a) {
            case 8:
                return String.format("%s(0x%04x)", (String) this.c, Integer.valueOf(this.b));
            default:
                return super.toString();
        }
    }

    public abstract int v();

    public abstract long w();

    public abstract int x();

    public abstract long y();

    public abstract String z();

    public void d(zid zidVar) {
    }

    public void e(zid zidVar) {
    }

    public /* synthetic */ xb1(int i, byte b) {
        this.a = i;
    }

    public xb1(String str, int i) {
        this.a = 8;
        this.c = str;
        this.b = i;
    }

    public xb1(byte[] bArr, int i) {
        this.a = 7;
        if (bArr.length == 32) {
            this.c = mse.d(bArr);
            this.b = i;
            return;
        }
        throw new InvalidKeyException("The key length in bytes must be 32.");
    }

    public xb1() {
        this.a = 0;
        this.c = new rz();
    }

    public xb1(int i) {
        this.a = 4;
        this.b = i;
    }
}
