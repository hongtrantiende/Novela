package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t8f  reason: default package */
/* loaded from: classes.dex */
public abstract class t8f {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.AesCmacKey");
        a = new y5f(o7f.class, new bl8(28));
        b = new u5f(c2, new mp8(28));
        c = new t3f(j7f.class, new fn8(28));
        d = new m3f(c2, new pq8(28));
    }

    public static oce a(eif eifVar) {
        int i = y8f.a[eifVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return oce.J;
                    }
                    throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
                }
                return oce.I;
            }
            return oce.H;
        }
        return oce.G;
    }

    public static eif b(oce oceVar) {
        if (oce.G != oceVar) {
            if (oce.H != oceVar) {
                if (oce.J != oceVar) {
                    if (oce.I == oceVar) {
                        return eif.LEGACY;
                    }
                    throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(oceVar)));
                }
                return eif.RAW;
            }
            return eif.CRUNCHY;
        }
        return eif.TINK;
    }
}
