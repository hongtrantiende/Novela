package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vpe  reason: default package */
/* loaded from: classes.dex */
public abstract class vpe {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.AesGcmKey");
        a = new y5f(gje.class, new tw8(23));
        b = new u5f(c2, new mp8(23));
        c = new t3f(rie.class, new v28(24));
        d = new m3f(c2, new u28(24));
    }

    public static fje a(eif eifVar) {
        int i = tqe.a[eifVar.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return fje.e;
                }
                throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            return fje.d;
        }
        return fje.c;
    }

    public static eif b(fje fjeVar) {
        if (fje.c != fjeVar) {
            if (fje.d != fjeVar) {
                if (fje.e == fjeVar) {
                    return eif.RAW;
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(fjeVar)));
            }
            return eif.CRUNCHY;
        }
        return eif.TINK;
    }

    public static void c(gje gjeVar) {
        int i = gjeVar.c;
        int i2 = gjeVar.b;
        if (i == 16) {
            if (i2 == 12) {
                return;
            }
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(i2)));
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(gjeVar.c)));
    }
}
