package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zte  reason: default package */
/* loaded from: classes.dex */
public abstract class zte {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.XAesGcmKey");
        a = new y5f(rne.class, new u28(25));
        b = new u5f(c2, new tw8(24));
        c = new t3f(hne.class, new d38(25));
        d = new m3f(c2, new v28(25));
    }

    public static oce a(eif eifVar) {
        int i = nue.a[eifVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return oce.F;
            }
            throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
        }
        return oce.E;
    }
}
