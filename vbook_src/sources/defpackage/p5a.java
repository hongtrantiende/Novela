package defpackage;

import java.nio.charset.Charset;
import java.security.MessageDigest;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p5a  reason: default package */
/* loaded from: classes3.dex */
public final class p5a extends e31 {
    public final transient byte[][] e;
    public final transient int[] f;

    public p5a(byte[][] bArr, int[] iArr) {
        super(e31.d.a);
        this.e = bArr;
        this.f = iArr;
    }

    @Override // defpackage.e31
    public final String a() {
        throw null;
    }

    @Override // defpackage.e31
    public final String b() {
        return v().b();
    }

    @Override // defpackage.e31
    public final e31 d(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            messageDigest.update(bArr[i], i3, i4 - i2);
            i++;
            i2 = i4;
        }
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new e31(digest);
    }

    @Override // defpackage.e31
    public final int e() {
        return this.f[this.e.length - 1];
    }

    @Override // defpackage.e31
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e31) {
                e31 e31Var = (e31) obj;
                if (e31Var.e() == e() && m(0, e31Var, e())) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e31
    public final String f() {
        return v().f();
    }

    @Override // defpackage.e31
    public final int g(byte[] bArr, int i) {
        bArr.getClass();
        return v().g(bArr, i);
    }

    @Override // defpackage.e31
    public final int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.e;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            int[] iArr = this.f;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            byte[] bArr2 = bArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.b = i3;
        return i3;
    }

    @Override // defpackage.e31
    public final byte[] i() {
        return s();
    }

    @Override // defpackage.e31
    public final byte j(int i) {
        int i2;
        byte[][] bArr = this.e;
        int[] iArr = this.f;
        bbe.n(iArr[bArr.length - 1], i, 1L);
        int F = yae.F(this, i);
        if (F == 0) {
            i2 = 0;
        } else {
            i2 = iArr[F - 1];
        }
        return bArr[F][(i - i2) + iArr[bArr.length + F]];
    }

    @Override // defpackage.e31
    public final int k(byte[] bArr, int i) {
        bArr.getClass();
        return v().k(bArr, i);
    }

    @Override // defpackage.e31
    public final boolean m(int i, e31 e31Var, int i2) {
        int i3;
        e31Var.getClass();
        if (i >= 0 && i <= e() - i2) {
            int i4 = i2 + i;
            int F = yae.F(this, i);
            int i5 = 0;
            while (i < i4) {
                int[] iArr = this.f;
                if (F == 0) {
                    i3 = 0;
                } else {
                    i3 = iArr[F - 1];
                }
                byte[][] bArr = this.e;
                int i6 = iArr[bArr.length + F];
                int min = Math.min(i4, (iArr[F] - i3) + i3) - i;
                if (e31Var.n(i5, bArr[F], (i - i3) + i6, min)) {
                    i5 += min;
                    i += min;
                    F++;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.e31
    public final boolean n(int i, byte[] bArr, int i2, int i3) {
        int i4;
        bArr.getClass();
        if (i < 0 || i > e() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i5 = i3 + i;
        int F = yae.F(this, i);
        while (i < i5) {
            int[] iArr = this.f;
            if (F == 0) {
                i4 = 0;
            } else {
                i4 = iArr[F - 1];
            }
            byte[][] bArr2 = this.e;
            int i6 = iArr[bArr2.length + F];
            int min = Math.min(i5, (iArr[F] - i4) + i4) - i;
            if (!bbe.l((i - i4) + i6, i2, min, bArr2[F], bArr)) {
                return false;
            }
            i2 += min;
            i += min;
            F++;
        }
        return true;
    }

    @Override // defpackage.e31
    public final String o(Charset charset) {
        charset.getClass();
        return v().o(charset);
    }

    @Override // defpackage.e31
    public final e31 p(int i, int i2) {
        if (i >= 0) {
            if (i2 <= e()) {
                int i3 = i2 - i;
                if (i3 >= 0) {
                    if (i == 0 && i2 == e()) {
                        return this;
                    }
                    if (i == i2) {
                        return e31.d;
                    }
                    int F = yae.F(this, i);
                    int F2 = yae.F(this, i2 - 1);
                    byte[][] bArr = this.e;
                    byte[][] bArr2 = (byte[][]) b00.e0(bArr, F, F2 + 1);
                    int[] iArr = new int[bArr2.length * 2];
                    int i4 = 0;
                    int[] iArr2 = this.f;
                    if (F <= F2) {
                        int i5 = F;
                        int i6 = 0;
                        while (true) {
                            iArr[i6] = Math.min(iArr2[i5] - i, i3);
                            int i7 = i6 + 1;
                            iArr[i6 + bArr2.length] = iArr2[bArr.length + i5];
                            if (i5 == F2) {
                                break;
                            }
                            i5++;
                            i6 = i7;
                        }
                    }
                    if (F != 0) {
                        i4 = iArr2[F - 1];
                    }
                    int length = bArr2.length;
                    iArr[length] = (i - i4) + iArr[length];
                    return new p5a(bArr2, iArr);
                }
                p1a.k(rs8.k("endIndex=", i2, i, " < beginIndex="));
                return null;
            }
            StringBuilder s = hl5.s("endIndex=", " > length(", i2);
            s.append(e());
            s.append(')');
            throw new IllegalArgumentException(s.toString().toString());
        }
        p1a.k(hl5.l("beginIndex=", " < 0", i));
        return null;
    }

    @Override // defpackage.e31
    public final e31 r() {
        return v().r();
    }

    @Override // defpackage.e31
    public final byte[] s() {
        byte[] bArr = new byte[e()];
        byte[][] bArr2 = this.e;
        int length = bArr2.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int[] iArr = this.f;
            int i4 = iArr[length + i];
            int i5 = iArr[i];
            int i6 = i5 - i2;
            b00.U(i3, i4, i4 + i6, bArr2[i], bArr);
            i3 += i6;
            i++;
            i2 = i5;
        }
        return bArr;
    }

    @Override // defpackage.e31
    public final String toString() {
        return v().toString();
    }

    @Override // defpackage.e31
    public final void u(my0 my0Var, int i) {
        int i2;
        int F = yae.F(this, 0);
        int i3 = 0;
        while (i3 < i) {
            int[] iArr = this.f;
            if (F == 0) {
                i2 = 0;
            } else {
                i2 = iArr[F - 1];
            }
            byte[][] bArr = this.e;
            int i4 = iArr[bArr.length + F];
            int min = Math.min(i, (iArr[F] - i2) + i2) - i3;
            int i5 = (i3 - i2) + i4;
            e5a e5aVar = new e5a(bArr[F], i5, i5 + min, true, false);
            e5a e5aVar2 = my0Var.a;
            if (e5aVar2 == null) {
                e5aVar.g = e5aVar;
                e5aVar.f = e5aVar;
                my0Var.a = e5aVar;
            } else {
                e5a e5aVar3 = e5aVar2.g;
                e5aVar3.getClass();
                e5aVar3.b(e5aVar);
            }
            i3 += min;
            F++;
        }
        my0Var.b += i;
    }

    public final e31 v() {
        return new e31(s());
    }
}
