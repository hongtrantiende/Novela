package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vre  reason: default package */
/* loaded from: classes.dex */
public abstract class vre {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        a = new y5f(dke.class, new fn8(24));
        b = new u5f(c2, new pq8(24));
        c = new t3f(vje.class, new mp8(24));
        d = new m3f(c2, new iv8(24));
    }

    public static yhe a(eif eifVar) {
        int i = fse.a[eifVar.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return yhe.D;
                }
                throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            return yhe.C;
        }
        return yhe.f;
    }

    public static eif b(yhe yheVar) {
        if (yhe.f != yheVar) {
            if (yhe.C != yheVar) {
                if (yhe.D == yheVar) {
                    return eif.RAW;
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(yheVar)));
            }
            return eif.CRUNCHY;
        }
        return eif.TINK;
    }
}
