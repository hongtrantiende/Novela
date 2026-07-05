package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wge  reason: default package */
/* loaded from: classes.dex */
public abstract class wge {
    static {
        int i = cif.a;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        m5f m5fVar = m5f.b;
        m5fVar.a(hhe.b);
        m5fVar.b(hhe.c);
        j8f.a();
        int i = the.e;
        if (eub.b(i)) {
            y5f y5fVar = noe.a;
            l5f l5fVar = l5f.b;
            l5fVar.h(noe.a);
            l5fVar.g(noe.b);
            l5fVar.f(noe.c);
            l5fVar.e(noe.d);
            m5fVar.b(the.a);
            g5f g5fVar = g5f.b;
            HashMap hashMap = new HashMap();
            hashMap.put("AES128_CTR_HMAC_SHA256", hme.e);
            yv b = bie.b();
            b.L(16);
            b.N(32);
            b.T(16);
            b.Q(16);
            zhe zheVar = zhe.e;
            b.e = zheVar;
            yhe yheVar = yhe.e;
            b.f = yheVar;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", b.J());
            hashMap.put("AES256_CTR_HMAC_SHA256", hme.f);
            yv b2 = bie.b();
            b2.L(32);
            b2.N(32);
            b2.T(32);
            b2.Q(16);
            b2.e = zheVar;
            b2.f = yheVar;
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", b2.J());
            g5fVar.b(Collections.unmodifiableMap(hashMap));
            c5f c5fVar = c5f.b;
            c5fVar.a(the.c, bie.class);
            y4f y4fVar = y4f.b;
            y4fVar.b(the.d, bie.class);
            h3f h3fVar = h3f.d;
            h3fVar.b(the.b, i, true);
            int i2 = bje.e;
            if (eub.b(i2)) {
                l5fVar.h(vpe.a);
                l5fVar.g(vpe.b);
                l5fVar.f(vpe.c);
                l5fVar.e(vpe.d);
                m5fVar.b(bje.a);
                HashMap hashMap2 = new HashMap();
                hashMap2.put("AES128_GCM", hme.a);
                odd b3 = gje.b();
                b3.l();
                b3.t(16);
                b3.x();
                fje fjeVar = fje.e;
                b3.e = fjeVar;
                hashMap2.put("AES128_GCM_RAW", b3.h());
                hashMap2.put("AES256_GCM", hme.b);
                odd b4 = gje.b();
                b4.l();
                b4.t(32);
                b4.x();
                b4.e = fjeVar;
                hashMap2.put("AES256_GCM_RAW", b4.h());
                g5fVar.b(Collections.unmodifiableMap(hashMap2));
                c5fVar.a(bje.c, gje.class);
                y4fVar.b(bje.d, gje.class);
                h3fVar.b(bje.b, i2, true);
                if (lve.a()) {
                    return;
                }
                i6f i6fVar = kie.a;
                if (eub.d(1)) {
                    l5fVar.h(epe.a);
                    l5fVar.g(epe.b);
                    l5fVar.f(epe.c);
                    l5fVar.e(epe.d);
                    m5fVar.b(kie.a);
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put("AES128_EAX", hme.c);
                    odd b5 = oie.b();
                    b5.m(16);
                    b5.t(16);
                    b5.x();
                    lie lieVar = lie.e;
                    b5.e = lieVar;
                    hashMap3.put("AES128_EAX_RAW", b5.g());
                    hashMap3.put("AES256_EAX", hme.d);
                    odd b6 = oie.b();
                    b6.m(16);
                    b6.t(32);
                    b6.x();
                    b6.e = lieVar;
                    hashMap3.put("AES256_EAX_RAW", b6.g());
                    g5fVar.b(Collections.unmodifiableMap(hashMap3));
                    y4fVar.b(kie.c, oie.class);
                    h3fVar.c(kie.b, true);
                    i6f i6fVar2 = nje.a;
                    if (eub.d(1)) {
                        l5fVar.h(wqe.a);
                        l5fVar.g(wqe.b);
                        l5fVar.f(wqe.c);
                        l5fVar.e(wqe.d);
                        HashMap hashMap4 = new HashMap();
                        hvc b7 = sje.b();
                        b7.C(16);
                        oce oceVar = oce.f;
                        b7.c = oceVar;
                        hashMap4.put("AES128_GCM_SIV", b7.x());
                        hvc b8 = sje.b();
                        b8.C(16);
                        oce oceVar2 = oce.D;
                        b8.c = oceVar2;
                        hashMap4.put("AES128_GCM_SIV_RAW", b8.x());
                        hvc b9 = sje.b();
                        b9.C(32);
                        b9.c = oceVar;
                        hashMap4.put("AES256_GCM_SIV", b9.x());
                        hvc b10 = sje.b();
                        b10.C(32);
                        b10.c = oceVar2;
                        hashMap4.put("AES256_GCM_SIV_RAW", b10.x());
                        g5fVar.b(Collections.unmodifiableMap(hashMap4));
                        c5fVar.a(nje.c, sje.class);
                        y4fVar.b(nje.b, sje.class);
                        m5fVar.b(nje.a);
                        h3fVar.c(nje.d, true);
                        i6f i6fVar3 = ake.a;
                        if (eub.d(1)) {
                            l5fVar.h(vre.a);
                            l5fVar.g(vre.b);
                            l5fVar.f(vre.c);
                            l5fVar.e(vre.d);
                            m5fVar.b(ake.a);
                            y4fVar.b(ake.b, dke.class);
                            HashMap hashMap5 = new HashMap();
                            hashMap5.put("CHACHA20_POLY1305", new dke(yhe.f));
                            hashMap5.put("CHACHA20_POLY1305_RAW", new dke(yhe.D));
                            g5fVar.b(Collections.unmodifiableMap(hashMap5));
                            h3fVar.c(ake.c, true);
                            i6f i6fVar4 = hke.a;
                            if (eub.d(1)) {
                                l5fVar.h(cle.a);
                                l5fVar.g(cle.b);
                                l5fVar.f(cle.c);
                                l5fVar.e(cle.d);
                                m5fVar.b(hke.a);
                                y4fVar.b(hke.c, ske.class);
                                h3fVar.c(hke.b, true);
                                u3f u3fVar = mke.a;
                                if (eub.d(1)) {
                                    l5fVar.h(xle.a);
                                    l5fVar.g(xle.b);
                                    l5fVar.f(xle.c);
                                    l5fVar.e(xle.d);
                                    y4fVar.b(mke.b, ole.class);
                                    m5fVar.b(mke.c);
                                    h3fVar.c(mke.a, true);
                                    i6f i6fVar5 = une.a;
                                    if (eub.d(1)) {
                                        l5fVar.h(pue.a);
                                        l5fVar.g(pue.b);
                                        l5fVar.f(pue.c);
                                        l5fVar.e(pue.d);
                                        m5fVar.b(une.a);
                                        HashMap hashMap6 = new HashMap();
                                        hashMap6.put("XCHACHA20_POLY1305", new koe(yhe.E));
                                        hashMap6.put("XCHACHA20_POLY1305_RAW", new koe(yhe.G));
                                        g5fVar.b(Collections.unmodifiableMap(hashMap6));
                                        y4fVar.b(une.d, koe.class);
                                        c5fVar.a(une.c, koe.class);
                                        h3fVar.c(une.b, true);
                                        l5fVar.h(zte.a);
                                        l5fVar.g(zte.b);
                                        l5fVar.f(zte.c);
                                        l5fVar.e(zte.d);
                                        HashMap hashMap7 = new HashMap();
                                        hashMap7.put("XAES_256_GCM_192_BIT_NONCE", hme.g);
                                        hashMap7.put("XAES_256_GCM_192_BIT_NONCE_NO_PREFIX", hme.h);
                                        hashMap7.put("XAES_256_GCM_160_BIT_NONCE_NO_PREFIX", hme.i);
                                        hashMap7.put("X_AES_GCM_8_BYTE_SALT_NO_PREFIX", hme.j);
                                        g5fVar.b(Collections.unmodifiableMap(hashMap7));
                                        m5fVar.b(jsc.g);
                                        y4fVar.b(jsc.f, rne.class);
                                        return;
                                    }
                                    hfd.j("Registering XChaCha20Poly1305 is not supported in FIPS mode");
                                    return;
                                }
                                hfd.j("Registering KMS Envelope AEAD is not supported in FIPS mode");
                                return;
                            }
                            hfd.j("Registering KMS AEAD is not supported in FIPS mode");
                            return;
                        }
                        hfd.j("Registering ChaCha20Poly1305 is not supported in FIPS mode");
                        return;
                    }
                    hfd.j("Registering AES GCM SIV is not supported in FIPS mode");
                    return;
                }
                hfd.j("Registering AES EAX is not supported in FIPS mode");
                return;
            }
            hfd.j("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
            return;
        }
        hfd.j("Can not use AES-CTR-HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
