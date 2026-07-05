package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b48  reason: default package */
/* loaded from: classes3.dex */
public abstract class b48 {
    public static final pw6 a = sw6.b("io.ktor.util.random");
    public static final List b = tl1.B("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");
    public static final int c = b(30000, "reseed-period");
    public static final int d = b(64, "nonce.buffer-size");
    public static final int e = b(256, "reseed-bytes");
    public static final int f = b(4, "insecure-factor");
    public static final xy0 g = xpe.a(b(Token.CASE, "nonce.channel-size"), 6, null);
    public static final iya h;

    /* JADX WARN: Type inference failed for: r1v10, types: [aab, lu4] */
    static {
        i82 i82Var = new i82("nonce-generator");
        sw2 sw2Var = ab3.a;
        u38 u38Var = u38.b;
        sw2Var.getClass();
        h = z87.u(jz4.a, nq2.C(sw2Var, u38Var).plus(i82Var), p82.b, new aab(2, null));
    }

    public static final SecureRandom a() {
        SecureRandom secureRandom;
        SecureRandom secureRandom2;
        SecureRandom secureRandom3;
        String property = System.getProperty("io.ktor.random.secure.random.provider");
        if (property != null) {
            try {
                secureRandom = SecureRandom.getInstance(property);
            } catch (NoSuchAlgorithmException unused) {
                secureRandom = null;
            }
            if (secureRandom != null) {
                return secureRandom;
            }
        }
        for (String str : b) {
            if (str != null) {
                try {
                    secureRandom3 = SecureRandom.getInstance(str);
                    continue;
                } catch (NoSuchAlgorithmException unused2) {
                    secureRandom3 = null;
                    continue;
                }
            } else {
                secureRandom3 = new SecureRandom();
                continue;
            }
            if (secureRandom3 != null) {
                return secureRandom3;
            }
        }
        pw6 pw6Var = a;
        pw6Var.h("None of the " + sl1.i0(b, null, null, null, null, 63) + " found, falling back to the JDK strong default");
        try {
            SecureRandom instanceStrong = SecureRandom.getInstanceStrong();
            instanceStrong.getClass();
            return instanceStrong;
        } catch (NoSuchAlgorithmException unused3) {
            pw6Var.h("None of the JDK determined strong SecureRandom providers were available, falling back to the default");
            try {
                secureRandom2 = new SecureRandom();
            } catch (NoSuchAlgorithmException unused4) {
                secureRandom2 = null;
            }
            if (secureRandom2 != null) {
                return secureRandom2;
            }
            vs.k("No SecureRandom implementation found");
            return null;
        }
    }

    public static final int b(int i, String str) {
        String property = System.getProperty("io.ktor.random.secure.".concat(str), null);
        if (property != null) {
            try {
                return Integer.parseInt(property);
            } catch (NumberFormatException unused) {
                a.h(hl5.o("Invalid integer '", property, "' for property io.ktor.random.secure.", str, ", falling back to default"));
            }
        }
        return i;
    }
}
