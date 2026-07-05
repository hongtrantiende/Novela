package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: noe  reason: default package */
/* loaded from: classes.dex */
public abstract class noe {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        a = new y5f(bie.class, new u28(23));
        b = new u5f(c2, new tw8(22));
        c = new t3f(mhe.class, new d38(23));
        d = new m3f(c2, new v28(23));
    }

    public static yhe a(eif eifVar) {
        int i = gpe.a[eifVar.ordinal()];
        if (i != 1) {
            if (i != 2 && i != 3) {
                if (i == 4) {
                    return yhe.e;
                }
                throw new GeneralSecurityException(a82.j(eifVar.zza(), "Unable to parse OutputPrefixType: "));
            }
            return yhe.d;
        }
        return yhe.c;
    }

    public static zhe b(lef lefVar) {
        int i = gpe.b[lefVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return zhe.C;
                        }
                        throw new GeneralSecurityException(a82.j(lefVar.zza(), "Unable to parse HashType: "));
                    }
                    return zhe.f;
                }
                return zhe.e;
            }
            return zhe.d;
        }
        return zhe.c;
    }

    public static eif c(yhe yheVar) {
        if (yhe.c != yheVar) {
            if (yhe.d != yheVar) {
                if (yhe.e == yheVar) {
                    return eif.RAW;
                }
                throw new GeneralSecurityException("Unable to serialize variant: ".concat(String.valueOf(yheVar)));
            }
            return eif.CRUNCHY;
        }
        return eif.TINK;
    }

    public static vef d(bie bieVar) {
        lef lefVar;
        uef x = vef.x();
        int i = bieVar.d;
        x.c();
        ((vef) x.b).zzf = i;
        zhe zheVar = bieVar.f;
        if (zhe.c != zheVar) {
            if (zhe.d != zheVar) {
                if (zhe.e != zheVar) {
                    if (zhe.f != zheVar) {
                        if (zhe.C == zheVar) {
                            lefVar = lef.SHA512;
                        } else {
                            throw new GeneralSecurityException("Unable to serialize HashType ".concat(String.valueOf(zheVar)));
                        }
                    } else {
                        lefVar = lef.SHA384;
                    }
                } else {
                    lefVar = lef.SHA256;
                }
            } else {
                lefVar = lef.SHA224;
            }
        } else {
            lefVar = lef.SHA1;
        }
        x.c();
        ((vef) x.b).zze = lefVar.zza();
        return (vef) x.b();
    }
}
