package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a31  reason: default package */
/* loaded from: classes.dex */
public class a31 implements Iterable, Serializable {
    public static final a31 c = new a31(uz5.b);
    public static final x21 d;
    public int a = 0;
    public final byte[] b;

    static {
        x21 cneVar;
        if (se.a()) {
            cneVar = new zj1(18);
        } else {
            cneVar = new cne(17);
        }
        d = cneVar;
    }

    public a31(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int b(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    cy7.k(rs8.k("Beginning index larger than ending index: ", i, i2, ", "));
                    return 0;
                }
                cy7.k(rs8.k("End index: ", i2, i3, " >= "));
                return 0;
            }
            cy7.k(hl5.l("Beginning index: ", " < 0", i));
            return 0;
        }
        return i4;
    }

    public static a31 c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new a31(d.a(bArr, i, i2));
    }

    public byte a(int i) {
        return this.b[i];
    }

    public int d() {
        return 0;
    }

    public byte e(int i) {
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof a31) && size() == ((a31) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof a31) {
                        a31 a31Var = (a31) obj;
                        int i = this.a;
                        int i2 = a31Var.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int size = size();
                            if (size <= a31Var.size()) {
                                if (size <= a31Var.size()) {
                                    byte[] bArr = a31Var.b;
                                    int d2 = d() + size;
                                    int d3 = d();
                                    int d4 = a31Var.d();
                                    while (d3 < d2) {
                                        if (this.b[d3] == bArr[d4]) {
                                            d3++;
                                            d4++;
                                        }
                                    }
                                    return true;
                                }
                                StringBuilder s = hl5.s("Ran off end of other: 0, ", ", ", size);
                                s.append(a31Var.size());
                                throw new IllegalArgumentException(s.toString());
                            }
                            hfd.o(size, size());
                            return false;
                        }
                    } else {
                        return obj.equals(this);
                    }
                } else {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            int d2 = d();
            int i2 = size;
            for (int i3 = d2; i3 < d2 + size; i3++) {
                i2 = (i2 * 31) + this.b[i3];
            }
            if (i2 == 0) {
                i2 = 1;
            }
            this.a = i2;
            return i2;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new t21(this);
    }

    public int size() {
        return this.b.length;
    }

    public final String toString() {
        a31 u21Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = aye.g(this);
        } else {
            int b = b(0, 47, size());
            if (b == 0) {
                u21Var = c;
            } else {
                u21Var = new u21(this.b, d(), b);
            }
            concat = aye.g(u21Var).concat("...");
        }
        return s21.q(s21.s("<ByteString@", hexString, " size=", size, " contents=\""), concat, "\">");
    }
}
