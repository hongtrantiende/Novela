package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: epe  reason: default package */
/* loaded from: classes.dex */
public abstract class epe {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.AesEaxKey");
        a = new y5f(oie.class, new jf8(23));
        b = new u5f(c2, new h88(23));
        c = new t3f(eie.class, new fn8(23));
        d = new m3f(c2, new bl8(23));
    }

    public static lie a(eif eifVar) {
        int i = upe.a[eifVar.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return lie.e;
                }
                throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            return lie.d;
        }
        return lie.c;
    }

    public static eif b(lie lieVar) {
        if (lie.c != lieVar) {
            if (lie.d != lieVar) {
                if (lie.e == lieVar) {
                    return eif.RAW;
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(lieVar)));
            }
            return eif.CRUNCHY;
        }
        return eif.TINK;
    }

    public static ybf c(oie oieVar) {
        if (oieVar.c == 16) {
            xbf v = ybf.v();
            int i = oieVar.b;
            v.c();
            ((ybf) v.b).zze = i;
            return (ybf) v.b();
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports aes eax keys with tag size equal to 16 bytes.", Integer.valueOf(oieVar.c)));
    }
}
