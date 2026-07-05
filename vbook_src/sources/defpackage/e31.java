package defpackage;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e31  reason: default package */
/* loaded from: classes3.dex */
public class e31 implements Serializable, Comparable {
    public static final e31 d = new e31(new byte[0]);
    public final byte[] a;
    public transient int b;
    public transient String c;

    public e31(byte[] bArr) {
        bArr.getClass();
        this.a = bArr;
    }

    public static int h(e31 e31Var, e31 e31Var2) {
        e31Var.getClass();
        e31Var2.getClass();
        return e31Var.g(e31Var2.i(), 0);
    }

    public static int l(e31 e31Var, e31 e31Var2) {
        int e = e31Var.e();
        e31Var.getClass();
        e31Var2.getClass();
        return e31Var.k(e31Var2.i(), e);
    }

    public static e31 q(e31 e31Var, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = e31Var.e();
        }
        return e31Var.p(i, i2);
    }

    public String a() {
        return a.a(this.a, a.a);
    }

    public String b() {
        return a.a(this.a, a.b);
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(e31 e31Var) {
        e31Var.getClass();
        int e = e();
        int e2 = e31Var.e();
        int min = Math.min(e, e2);
        for (int i = 0; i < min; i++) {
            int j = j(i) & 255;
            int j2 = e31Var.j(i) & 255;
            if (j != j2) {
                if (j < j2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        if (e == e2) {
            return 0;
        }
        if (e < e2) {
            return -1;
        }
        return 1;
    }

    public e31 d(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        messageDigest.update(this.a, 0, e());
        byte[] digest = messageDigest.digest();
        digest.getClass();
        return new e31(digest);
    }

    public int e() {
        return this.a.length;
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e31) {
                e31 e31Var = (e31) obj;
                int e = e31Var.e();
                byte[] bArr = this.a;
                if (e == bArr.length && e31Var.n(0, bArr, 0, bArr.length)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public String f() {
        byte[] bArr = this.a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = fca.b;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    public int g(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.a;
        int length = bArr2.length - bArr.length;
        int max = Math.max(i, 0);
        if (max <= length) {
            while (!bbe.l(max, 0, bArr.length, bArr2, bArr)) {
                if (max != length) {
                    max++;
                } else {
                    return -1;
                }
            }
            return max;
        }
        return -1;
    }

    public int hashCode() {
        int i = this.b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.a);
        this.b = hashCode;
        return hashCode;
    }

    public byte[] i() {
        return this.a;
    }

    public byte j(int i) {
        return this.a[i];
    }

    public int k(byte[] bArr, int i) {
        bArr.getClass();
        byte[] bArr2 = this.a;
        for (int min = Math.min(i, bArr2.length - bArr.length); -1 < min; min--) {
            if (bbe.l(min, 0, bArr.length, bArr2, bArr)) {
                return min;
            }
        }
        return -1;
    }

    public boolean m(int i, e31 e31Var, int i2) {
        e31Var.getClass();
        return e31Var.n(0, this.a, i, i2);
    }

    public boolean n(int i, byte[] bArr, int i2, int i3) {
        bArr.getClass();
        if (i >= 0) {
            byte[] bArr2 = this.a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && bbe.l(i, i2, i3, bArr2, bArr)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String o(Charset charset) {
        charset.getClass();
        return new String(this.a, charset);
    }

    public e31 p(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.a;
            if (i2 <= bArr.length) {
                if (i2 - i >= 0) {
                    if (i == 0 && i2 == bArr.length) {
                        return this;
                    }
                    return new e31(b00.d0(bArr, i, i2));
                }
                vs.m("endIndex < beginIndex");
                return null;
            }
            p1a.k(hl5.p(new StringBuilder("endIndex > length("), bArr.length, ')'));
            return null;
        }
        vs.m("beginIndex < 0");
        return null;
    }

    public e31 r() {
        int i = 0;
        while (true) {
            byte[] bArr = this.a;
            if (i < bArr.length) {
                byte b = bArr[i];
                if (b >= 65 && b <= 90) {
                    byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                    copyOf[i] = (byte) (b + 32);
                    for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                        byte b2 = copyOf[i2];
                        if (b2 >= 65 && b2 <= 90) {
                            copyOf[i2] = (byte) (b2 + 32);
                        }
                    }
                    return new e31(copyOf);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public byte[] s() {
        byte[] bArr = this.a;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final String t() {
        String str = this.c;
        if (str == null) {
            byte[] i = i();
            i.getClass();
            String str2 = new String(i, ed1.a);
            this.c = str2;
            return str2;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0130, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0134, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0140, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x016c, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0173, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x017a, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x01aa, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x01ad, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x01b0, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x01b3, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0085, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0096, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c4, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00d6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x00f6, code lost:
        if (r6 == 64) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00fe, code lost:
        if (r6 == 64) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 609
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e31.toString():java.lang.String");
    }

    public void u(my0 my0Var, int i) {
        my0Var.write(this.a, 0, i);
    }
}
