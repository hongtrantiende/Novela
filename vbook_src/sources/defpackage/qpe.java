package defpackage;

import java.io.ByteArrayInputStream;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qpe  reason: default package */
/* loaded from: classes.dex */
public class qpe implements Iterable, Serializable {
    public static final qpe c = new qpe(pqe.a);
    public int a = 0;
    public final byte[] b;

    static {
        int i = zoe.a;
    }

    public qpe(byte[] bArr) {
        bArr.getClass();
        this.b = bArr;
    }

    public static int g(int i, int i2, int i3) {
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

    public static qpe h(byte[] bArr, int i) {
        g(0, i, bArr.length);
        byte[] bArr2 = new byte[i];
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return new qpe(bArr2);
    }

    public byte a(int i) {
        return this.b[i];
    }

    public byte b(int i) {
        return this.b[i];
    }

    public int c() {
        return 0;
    }

    public int d() {
        return this.b.length;
    }

    public void e(byte[] bArr, int i) {
        System.arraycopy(this.b, 0, bArr, 0, i);
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if ((obj instanceof qpe) && d() == ((qpe) obj).d()) {
                if (d() != 0) {
                    if (obj instanceof qpe) {
                        qpe qpeVar = (qpe) obj;
                        int i = this.a;
                        int i2 = qpeVar.a;
                        if (i == 0 || i2 == 0 || i == i2) {
                            int d = d();
                            if (d <= qpeVar.d()) {
                                if (d <= qpeVar.d()) {
                                    byte[] bArr = qpeVar.b;
                                    int c2 = c() + d;
                                    int c3 = c();
                                    int c4 = qpeVar.c();
                                    while (c3 < c2) {
                                        if (this.b[c3] == bArr[c4]) {
                                            c3++;
                                            c4++;
                                        }
                                    }
                                    return true;
                                }
                                vs.m(rs8.k("Ran off end of other: 0, ", d, qpeVar.d(), ", "));
                                return false;
                            }
                            hfd.o(d, d());
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

    public final ByteArrayInputStream f() {
        return new ByteArrayInputStream(this.b, c(), d());
    }

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int d = d();
            int c2 = c();
            byte[] bArr = pqe.a;
            int i2 = d;
            for (int i3 = c2; i3 < c2 + d; i3++) {
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

    public final byte[] i() {
        int d = d();
        if (d == 0) {
            return pqe.a;
        }
        byte[] bArr = new byte[d];
        e(bArr, d);
        return bArr;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new t21(this);
    }

    public final String toString() {
        qpe kpeVar;
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int d = d();
        if (d() <= 50) {
            concat = bbe.B(this);
        } else {
            int g = g(0, 47, d());
            if (g == 0) {
                kpeVar = c;
            } else {
                kpeVar = new kpe(this.b, c(), g);
            }
            concat = bbe.B(kpeVar).concat("...");
        }
        return s21.q(s21.s("<ByteString@", hexString, " size=", d, " contents=\""), concat, "\">");
    }
}
