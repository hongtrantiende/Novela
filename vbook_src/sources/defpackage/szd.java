package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: szd */
/* loaded from: classes.dex */
public abstract class szd implements Iterable, Serializable {
    public static final rzd b = new rzd(d1e.a);
    public int a;

    static {
        int i = kzd.a;
    }

    public static rzd h(byte[] bArr, int i, int i2) {
        try {
            return i(bArr, i, i2);
        } catch (i1e e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static rzd i(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return b;
        }
        k(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new rzd(bArr2);
    }

    public static int k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 44 + String.valueOf(i2).length());
                    sb.append("Beginning index larger than ending index: ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(String.valueOf(i2).length() + 15 + String.valueOf(i3).length());
                sb2.append("End index: ");
                sb2.append(i2);
                sb2.append(" >= ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(i).length() + 21);
            sb3.append("Beginning index: ");
            sb3.append(i);
            sb3.append(" < 0");
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        return i4;
    }

    public static /* synthetic */ boolean l(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        k(i, i4, bArr.length);
        k(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract qzd c(int i, int i2);

    public abstract void d(byte[] bArr, int i);

    public abstract void e(g0e g0eVar);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof szd) {
                szd szdVar = (szd) obj;
                int b2 = b();
                if (b2 == szdVar.b()) {
                    if (b2 != 0) {
                        int i = this.a;
                        int i2 = szdVar.a;
                        if (i != 0 && i2 != 0 && i != i2) {
                            return false;
                        }
                        return f(szdVar);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public abstract boolean f(szd szdVar);

    public abstract int g(int i, int i2);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int b2 = b();
            i = g(b2, b2);
            if (i == 0) {
                i = 1;
            }
            this.a = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new t21(this);
    }

    public final byte[] j() {
        int b2 = b();
        if (b2 == 0) {
            return d1e.a;
        }
        byte[] bArr = new byte[b2];
        d(bArr, b2);
        return bArr;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int b2 = b();
        if (b() <= 50) {
            concat = yz1.B(j());
        } else {
            concat = yz1.B(c(0, 47).j()).concat("...");
        }
        return s21.q(s21.s("<ByteString@", hexString, " size=", b2, " contents=\""), concat, "\">");
    }
}
