package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wqe  reason: default package */
/* loaded from: classes.dex */
public abstract class wqe {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        a = new y5f(sje.class, new h88(24));
        b = new u5f(c2, new d38(24));
        c = new t3f(lje.class, new bl8(24));
        d = new m3f(c2, new jf8(24));
    }

    public static oce a(eif eifVar) {
        int i = rre.a[eifVar.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return oce.D;
                }
                throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            return oce.C;
        }
        return oce.f;
    }

    public static eif b(oce oceVar) {
        if (oce.f != oceVar) {
            if (oce.C != oceVar) {
                if (oce.D == oceVar) {
                    return eif.RAW;
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(oceVar)));
            }
            return eif.CRUNCHY;
        }
        return eif.TINK;
    }
}
