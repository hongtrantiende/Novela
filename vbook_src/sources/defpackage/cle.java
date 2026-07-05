package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cle  reason: default package */
/* loaded from: classes.dex */
public abstract class cle {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        a = new y5f(ske.class, new v28(20));
        b = new u5f(c2, new fn8(20));
        c = new t3f(oke.class, new jf8(20));
        d = new m3f(c2, new iv8(20));
    }

    public static zhe a(eif eifVar) {
        int i = jle.a[eifVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return zhe.E;
            }
            throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
        }
        return zhe.D;
    }
}
