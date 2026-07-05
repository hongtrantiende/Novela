package j$.time.format;

import j$.time.DateTimeException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes2.dex */
public final class l implements e {
    public final e a;
    public final int b;
    public final char c;

    public l(e eVar, int i, char c) {
        this.a = eVar;
        this.b = i;
        this.c = c;
    }

    @Override // j$.time.format.e
    public final int A(v vVar, CharSequence charSequence, int i) {
        boolean z = vVar.c;
        if (i <= charSequence.length()) {
            if (i == charSequence.length()) {
                return ~i;
            }
            int i2 = this.b + i;
            if (i2 > charSequence.length()) {
                if (z) {
                    return ~i;
                }
                i2 = charSequence.length();
            }
            int i3 = i;
            while (i3 < i2 && vVar.a(charSequence.charAt(i3), this.c)) {
                i3++;
            }
            int A = this.a.A(vVar, charSequence.subSequence(0, i2), i3);
            if (A != i2 && z) {
                return ~(i + i3);
            }
            return A;
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        String str;
        char c = this.c;
        if (c == ' ') {
            str = ")";
        } else {
            str = ",'" + c + "')";
        }
        return "Pad(" + this.a + "," + this.b + str;
    }

    @Override // j$.time.format.e
    public final boolean v(x xVar, StringBuilder sb) {
        int length = sb.length();
        if (!this.a.v(xVar, sb)) {
            return false;
        }
        int length2 = sb.length() - length;
        int i = this.b;
        if (length2 <= i) {
            for (int i2 = 0; i2 < i - length2; i2++) {
                sb.insert(length, this.c);
            }
            return true;
        }
        throw new DateTimeException("Cannot print as output of " + length2 + " characters exceeds pad width of " + i);
    }
}
