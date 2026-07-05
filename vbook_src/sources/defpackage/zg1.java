package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zg1  reason: default package */
/* loaded from: classes.dex */
public final class zg1 implements pf2, s94, t94, OnFailureListener {
    public final /* synthetic */ int a;
    public long b;
    public Object c;

    public zg1(s94 s94Var, long j) {
        boolean z;
        this.a = 3;
        this.c = s94Var;
        if (s94Var.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        this.b = j;
    }

    public static long F(zg1 zg1Var, long j, float f) {
        float abs;
        long j2;
        long j3 = y78.j(zg1Var.b, j);
        zg1Var.b = j3;
        if (((ff8) zg1Var.c) == null) {
            abs = y78.e(j3);
        } else {
            abs = Math.abs(zg1Var.H(j3));
        }
        if (abs >= f) {
            ff8 ff8Var = (ff8) zg1Var.c;
            long j4 = zg1Var.b;
            if (ff8Var == null) {
                return y78.i(zg1Var.b, y78.k(f, y78.c(y78.e(j4), j4)));
            }
            float H = zg1Var.H(j4) - (Math.signum(zg1Var.H(zg1Var.b)) * f);
            long j5 = zg1Var.b;
            ff8 ff8Var2 = (ff8) zg1Var.c;
            ff8 ff8Var3 = ff8.b;
            if (ff8Var2 == ff8Var3) {
                j2 = j5 & 4294967295L;
            } else {
                j2 = j5 >> 32;
            }
            float intBitsToFloat = Float.intBitsToFloat((int) j2);
            if (((ff8) zg1Var.c) == ff8Var3) {
                return (Float.floatToRawIntBits(H) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
            }
            return (Float.floatToRawIntBits(H) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
        }
        return 9205357640488583168L;
    }

    public int A(int i) {
        zg1 zg1Var = (zg1) this.c;
        if (zg1Var == null) {
            long j = this.b;
            if (i >= 64) {
                return Long.bitCount(j);
            }
            return Long.bitCount(((1 << i) - 1) & j);
        } else if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.b);
        } else {
            return Long.bitCount(this.b) + zg1Var.A(i - 64);
        }
    }

    @Override // defpackage.pf2
    public long B(long j) {
        return ((jh1) this.c).a;
    }

    @Override // defpackage.pf2
    public long C(long j, long j2) {
        return ((jh1) this.c).a;
    }

    public void D() {
        if (((zg1) this.c) == null) {
            this.c = new zg1();
        }
    }

    public boolean E(int i) {
        if (i >= 64) {
            D();
            return ((zg1) this.c).E(i - 64);
        }
        if (((1 << i) & this.b) != 0) {
            return true;
        }
        return false;
    }

    public void G(int i, boolean z) {
        boolean z2;
        if (i >= 64) {
            D();
            ((zg1) this.c).G(i - 64, z);
            return;
        }
        long j = this.b;
        if ((Long.MIN_VALUE & j) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        long j2 = (1 << i) - 1;
        this.b = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            K(i);
        } else {
            y(i);
        }
        if (!z2 && ((zg1) this.c) == null) {
            return;
        }
        D();
        ((zg1) this.c).G(0, z2);
    }

    public float H(long j) {
        long j2;
        if (((ff8) this.c) == ff8.b) {
            j2 = j >> 32;
        } else {
            j2 = j & 4294967295L;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public boolean I(int i) {
        boolean z;
        if (i >= 64) {
            D();
            return ((zg1) this.c).I(i - 64);
        }
        long j = 1 << i;
        long j2 = this.b;
        if ((j2 & j) != 0) {
            z = true;
        } else {
            z = false;
        }
        long j3 = j2 & (~j);
        this.b = j3;
        long j4 = j - 1;
        this.b = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        zg1 zg1Var = (zg1) this.c;
        if (zg1Var != null) {
            if (zg1Var.E(0)) {
                K(63);
            }
            ((zg1) this.c).I(0);
        }
        return z;
    }

    public void J() {
        this.b = 0L;
        zg1 zg1Var = (zg1) this.c;
        if (zg1Var != null) {
            zg1Var.J();
        }
    }

    public void K(int i) {
        if (i >= 64) {
            D();
            ((zg1) this.c).K(i - 64);
            return;
        }
        this.b |= 1 << i;
    }

    @Override // defpackage.s94
    public boolean a(byte[] bArr, int i, int i2, boolean z) {
        return ((s94) this.c).a(bArr, 0, i2, z);
    }

    @Override // defpackage.pf2
    public long b(long j) {
        return ((jh1) this.c).e[(int) j] - this.b;
    }

    @Override // defpackage.pf2
    public long c(long j, long j2) {
        return ((jh1) this.c).d[(int) j];
    }

    @Override // defpackage.s94
    public boolean e(int i, boolean z) {
        return ((s94) this.c).e(i, true);
    }

    @Override // defpackage.s94
    public boolean f(byte[] bArr, int i, int i2, boolean z) {
        return ((s94) this.c).f(bArr, i, i2, z);
    }

    @Override // defpackage.pf2
    public long g(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.s94
    public long getLength() {
        return ((s94) this.c).getLength() - this.b;
    }

    @Override // defpackage.s94
    public long getPosition() {
        return ((s94) this.c).getPosition() - this.b;
    }

    @Override // defpackage.s94
    public long h() {
        return ((s94) this.c).h() - this.b;
    }

    @Override // defpackage.s94
    public void i(int i) {
        ((s94) this.c).i(i);
    }

    @Override // defpackage.s94
    public int j(int i) {
        return ((s94) this.c).j(i);
    }

    @Override // defpackage.pf2
    public long k(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.pf2
    public zg9 l(long j) {
        jh1 jh1Var = (jh1) this.c;
        int i = (int) j;
        return new zg9(jh1Var.c[i], jh1Var.b[i], null);
    }

    @Override // defpackage.t94
    public void m() {
        ((t94) this.c).m();
    }

    @Override // defpackage.s94
    public int n(byte[] bArr, int i, int i2) {
        return ((s94) this.c).n(bArr, i, i2);
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 6:
                ((AtomicLong) ((jje) this.c).d).set(this.b);
                return;
            default:
                ((AtomicLong) ((rwa) this.c).c).set(this.b);
                return;
        }
    }

    @Override // defpackage.s94
    public void p() {
        ((s94) this.c).p();
    }

    @Override // defpackage.s94
    public void q(int i) {
        ((s94) this.c).q(i);
    }

    @Override // defpackage.pf2
    public long r(long j, long j2) {
        return a2d.f(((jh1) this.c).e, j + this.b, true);
    }

    @Override // defpackage.eg2
    public int read(byte[] bArr, int i, int i2) {
        return ((s94) this.c).read(bArr, i, i2);
    }

    @Override // defpackage.s94
    public void readFully(byte[] bArr, int i, int i2) {
        ((s94) this.c).readFully(bArr, i, i2);
    }

    @Override // defpackage.t94
    public fjc s(int i, int i2) {
        return ((t94) this.c).s(i, i2);
    }

    public String toString() {
        switch (this.a) {
            case 0:
                if (((zg1) this.c) == null) {
                    return Long.toBinaryString(this.b);
                }
                return ((zg1) this.c).toString() + "xx" + Long.toBinaryString(this.b);
            default:
                return super.toString();
        }
    }

    @Override // defpackage.t94
    public void v(m4a m4aVar) {
        ((t94) this.c).v(new pya(this, m4aVar, m4aVar));
    }

    @Override // defpackage.pf2
    public boolean w() {
        return true;
    }

    @Override // defpackage.s94
    public void x(byte[] bArr, int i, int i2) {
        ((s94) this.c).x(bArr, i, i2);
    }

    public void y(int i) {
        if (i >= 64) {
            zg1 zg1Var = (zg1) this.c;
            if (zg1Var != null) {
                zg1Var.y(i - 64);
                return;
            }
            return;
        }
        this.b &= ~(1 << i);
    }

    @Override // defpackage.pf2
    public long z() {
        return 0L;
    }

    public /* synthetic */ zg1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public zg1(kh5 kh5Var) {
        this.a = 8;
        am8.s(kh5Var);
        this.c = kh5Var;
    }

    public /* synthetic */ zg1(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    public zg1() {
        this.a = 0;
        this.b = 0L;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zg1(ff8 ff8Var, int i) {
        this((i & 1) != 0 ? null : ff8Var, 0L, 5);
        this.a = 5;
    }
}
