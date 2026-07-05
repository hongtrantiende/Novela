package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yyc  reason: default package */
/* loaded from: classes.dex */
public final class yyc {
    public static final /* synthetic */ int a = 0;

    static {
        boolean[] zArr = new boolean[Token.EXPORT];
        zArr[45] = true;
        zArr[46] = true;
        zArr[95] = true;
        for (char c = '0'; c < ':'; c = (char) (c + 1)) {
            zArr[c] = true;
        }
        for (char c2 = 'A'; c2 < '['; c2 = (char) (c2 + 1)) {
            zArr[c2] = true;
        }
        for (char c3 = 'a'; c3 < '{'; c3 = (char) (c3 + 1)) {
            zArr[c3] = true;
        }
    }

    public static String a(String str) {
        if (str.length() != 0) {
            int length = str.length();
            StringBuilder sb = new StringBuilder(length);
            int i = 0;
            int i2 = 0;
            boolean z = false;
            byte[] bArr = null;
            while (i < length) {
                char charAt = str.charAt(i);
                if (charAt == '%') {
                    if (!z) {
                        sb.append((CharSequence) str, 0, i);
                        z = true;
                    }
                    if (bArr == null) {
                        bArr = new byte[(length - i) / 3];
                    }
                    int i3 = i + 1;
                    i += 3;
                    if (length >= i) {
                        try {
                            String substring = str.substring(i3, i);
                            nqe.u(16);
                            int parseInt = Integer.parseInt(substring, 16);
                            if (parseInt >= 0 && parseInt < 256) {
                                bArr[i2] = (byte) parseInt;
                                i2++;
                            } else {
                                throw new IllegalArgumentException("Illegal escape value");
                            }
                        } catch (NumberFormatException e) {
                            throw new IllegalArgumentException("Illegal characters in escape sequence: " + e + ".message", e);
                        }
                    } else {
                        throw new IllegalArgumentException(("Incomplete trailing escape (" + charAt + ") pattern").toString());
                    }
                } else {
                    if (bArr != null) {
                        sb.append(r4b.G(0, bArr, i2, 4));
                        i2 = 0;
                        bArr = null;
                        z = true;
                    }
                    if (z) {
                        sb.append(charAt);
                    }
                    i++;
                }
            }
            if (bArr != null) {
                sb.append(r4b.G(0, bArr, i2, 4));
            }
            if (z) {
                return sb.toString();
            }
        }
        return str;
    }
}
