package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tkf  reason: default package */
/* loaded from: classes.dex */
public final class tkf {
    public static final long d;
    public static final tkf e;
    public final int a;
    public final int b;
    public final int c;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        d = j;
        e = new tkf(0, -1, -1);
    }

    public tkf(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static int e(int i, int i2, String str) {
        if (i != i2) {
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                char charAt = (char) (str.charAt(i4) - '0');
                if (charAt < '\n') {
                    i3 = (i3 * 10) + charAt;
                    if (i3 > 999999) {
                        throw gt1.a("precision too large", i, i2, str);
                    }
                } else {
                    throw gt1.b("invalid precision character", str, i4);
                }
            }
            if (i3 == 0) {
                if (i2 == i + 1) {
                    return 0;
                }
                throw gt1.a("invalid precision", i, i2, str);
            }
            return i3;
        }
        throw gt1.b("missing precision", str, i - 1);
    }

    public final boolean a() {
        if (this == e) {
            return true;
        }
        return false;
    }

    public final boolean b(int i, boolean z) {
        int i2;
        if (!a()) {
            int i3 = ~i;
            int i4 = this.a;
            if ((i3 & i4) == 0) {
                if ((z || this.c == -1) && (i4 & 9) != 9 && (i2 = i4 & 96) != 96) {
                    if (i2 != 0 && this.b == -1) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean c() {
        if ((this.a & Token.CASE) != 0) {
            return true;
        }
        return false;
    }

    public final void d(StringBuilder sb) {
        if (!a()) {
            int i = 0;
            while (true) {
                int i2 = this.a & (-129);
                int i3 = 1 << i;
                if (i3 > i2) {
                    break;
                }
                if ((i2 & i3) != 0) {
                    sb.append(" #(+,-0".charAt(i));
                }
                i++;
            }
            int i4 = this.b;
            if (i4 != -1) {
                sb.append(i4);
            }
            int i5 = this.c;
            if (i5 != -1) {
                sb.append('.');
                sb.append(i5);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tkf) {
            tkf tkfVar = (tkf) obj;
            if (tkfVar.a == this.a && tkfVar.b == this.b && tkfVar.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
