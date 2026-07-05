package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c31  reason: default package */
/* loaded from: classes.dex */
public class c31 implements Iterable, Serializable {
    public static final c31 c = new c31(wz5.b);
    public static final z21 d;
    public int a = 0;
    public final byte[] b;

    static {
        z21 abfVar;
        if (ue.a()) {
            abfVar = new j55(18);
        } else {
            abfVar = new abf(17);
        }
        d = abfVar;
    }

    public c31(byte[] bArr) {
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

    public static c31 c(byte[] bArr, int i, int i2) {
        b(i, i + i2, bArr.length);
        return new c31(d.a(bArr, i, i2));
    }

    public byte a(int i) {
        return this.b[i];
    }

    public void d(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public int e() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof c31) && size() == ((c31) obj).size()) {
                if (size() != 0) {
                    if (obj instanceof c31) {
                        c31 c31Var = (c31) obj;
                        int i = this.a;
                        int i2 = c31Var.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int size = size();
                            if (size <= c31Var.size()) {
                                if (size <= c31Var.size()) {
                                    byte[] bArr = c31Var.b;
                                    int e = e() + size;
                                    int e2 = e();
                                    int e3 = c31Var.e();
                                    while (e2 < e) {
                                        if (this.b[e2] == bArr[e3]) {
                                            e2++;
                                            e3++;
                                        }
                                    }
                                    return true;
                                }
                                StringBuilder s = hl5.s("Ran off end of other: 0, ", ", ", size);
                                s.append(c31Var.size());
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

    public byte f(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int size = size();
            int e = e();
            int i2 = size;
            for (int i3 = e; i3 < e + size; i3++) {
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
        c31 w21Var;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            concat = dye.l(this);
        } else {
            int b = b(0, 47, size());
            if (b == 0) {
                w21Var = c;
            } else {
                w21Var = new w21(this.b, e(), b);
            }
            concat = dye.l(w21Var).concat("...");
        }
        return s21.q(s21.s("<ByteString@", hexString, " size=", size, " contents=\""), concat, "\">");
    }
}
