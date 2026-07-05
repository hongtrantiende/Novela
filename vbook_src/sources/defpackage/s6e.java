package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s6e  reason: default package */
/* loaded from: classes.dex */
public abstract class s6e implements Serializable, Iterable {
    public static final w6e b = new w6e(n7e.a);
    public static final u28 c = new u28(10);
    public int a;

    public static int c(int i, int i2, int i3) {
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

    public static w6e e(byte[] bArr, int i, int i2) {
        try {
            return i(bArr, i, i2);
        } catch (w7e e) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e);
        }
    }

    public static /* synthetic */ boolean g(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        int i4 = i + i3;
        c(i, i4, bArr.length);
        c(i2, i3 + i2, bArr2.length);
        while (i < i4) {
            if (bArr[i] != bArr2[i2]) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public static w6e i(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return b;
        }
        c(i, i + i2, bArr.length);
        c.getClass();
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new w6e(bArr2);
    }

    public abstract byte a(int i);

    public abstract int b();

    public abstract v6e d(int i, int i2);

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof s6e) {
                s6e s6eVar = (s6e) obj;
                int b2 = b();
                if (b2 == s6eVar.b()) {
                    if (b2 == 0) {
                        return true;
                    }
                    int i = this.a;
                    int i2 = s6eVar.a;
                    if (i != 0 && i2 != 0 && i != i2) {
                        return false;
                    }
                    return h(s6eVar);
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public abstract void f(byte[] bArr, int i);

    public abstract boolean h(s6e s6eVar);

    public final int hashCode() {
        int i = this.a;
        if (i == 0) {
            int b2 = b();
            i = k(b2, b2);
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

    public abstract void j(e7e e7eVar);

    public abstract int k(int i, int i2);

    public abstract x6e l();

    public final byte[] m() {
        int b2 = b();
        if (b2 == 0) {
            return n7e.a;
        }
        byte[] bArr = new byte[b2];
        f(bArr, b2);
        return bArr;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int b2 = b();
        if (b() <= 50) {
            concat = k27.H(m());
        } else {
            concat = k27.H(d(0, 47).m()).concat("...");
        }
        return s21.q(s21.s("<ByteString@", hexString, " size=", b2, " contents=\""), concat, "\">");
    }
}
