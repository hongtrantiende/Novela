package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j8f  reason: default package */
/* loaded from: classes.dex */
public abstract class j8f {
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
        m5fVar.a(hhe.k);
        m5fVar.b(hhe.l);
        m5fVar.a(hhe.j);
        int i = s7f.f;
        if (eub.b(i)) {
            hvc hvcVar = a9f.a;
            l5f l5fVar = l5f.b;
            l5fVar.h(a9f.c);
            l5fVar.g(a9f.d);
            l5fVar.f(a9f.e);
            l5fVar.e(a9f.f);
            m5fVar.b(s7f.a);
            m5fVar.b(s7f.b);
            g5f g5fVar = g5f.b;
            HashMap hashMap = new HashMap();
            hashMap.put("HMAC_SHA256_128BITTAG", p8f.a);
            odd b = h8f.b();
            b.b = 32;
            b.c = 16;
            f8f f8fVar = f8f.e;
            b.e = f8fVar;
            g8f g8fVar = g8f.d;
            b.d = g8fVar;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", b.j());
            odd b2 = h8f.b();
            b2.b = 32;
            b2.c = 32;
            f8f f8fVar2 = f8f.b;
            b2.e = f8fVar2;
            b2.d = g8fVar;
            hashMap.put("HMAC_SHA256_256BITTAG", b2.j());
            odd b3 = h8f.b();
            b3.b = 32;
            b3.c = 32;
            b3.e = f8fVar;
            b3.d = g8fVar;
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", b3.j());
            odd b4 = h8f.b();
            b4.b = 64;
            b4.c = 16;
            b4.e = f8fVar2;
            g8f g8fVar2 = g8f.f;
            b4.d = g8fVar2;
            hashMap.put("HMAC_SHA512_128BITTAG", b4.j());
            odd b5 = h8f.b();
            b5.b = 64;
            b5.c = 16;
            b5.e = f8fVar;
            b5.d = g8fVar2;
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", b5.j());
            odd b6 = h8f.b();
            b6.b = 64;
            b6.c = 32;
            b6.e = f8fVar2;
            b6.d = g8fVar2;
            hashMap.put("HMAC_SHA512_256BITTAG", b6.j());
            odd b7 = h8f.b();
            b7.b = 64;
            b7.c = 32;
            b7.e = f8fVar;
            b7.d = g8fVar2;
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", b7.j());
            hashMap.put("HMAC_SHA512_512BITTAG", p8f.b);
            odd b8 = h8f.b();
            b8.b = 64;
            b8.c = 64;
            b8.e = f8fVar;
            b8.d = g8fVar2;
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", b8.j());
            g5fVar.b(Collections.unmodifiableMap(hashMap));
            y4f y4fVar = y4f.b;
            y4fVar.b(s7f.e, h8f.class);
            c5f.b.a(s7f.d, h8f.class);
            h3f h3fVar = h3f.d;
            h3fVar.b(s7f.c, i, true);
            if (lve.a()) {
                return;
            }
            vhe vheVar = m7f.a;
            if (eub.d(1)) {
                l5fVar.h(t8f.a);
                l5fVar.g(t8f.b);
                l5fVar.f(t8f.c);
                l5fVar.e(t8f.d);
                y4fVar.b(m7f.a, o7f.class);
                m5fVar.b(m7f.b);
                m5fVar.b(m7f.c);
                HashMap hashMap2 = new HashMap();
                o7f o7fVar = p8f.c;
                hashMap2.put("AES_CMAC", o7fVar);
                hashMap2.put("AES256_CMAC", o7fVar);
                jje b9 = o7f.b();
                b9.h(32);
                b9.j(16);
                b9.c = oce.J;
                hashMap2.put("AES256_CMAC_RAW", b9.f());
                g5fVar.b(Collections.unmodifiableMap(hashMap2));
                h3fVar.c(m7f.d, true);
                return;
            }
            hfd.j("Registering AES CMAC is not supported in FIPS mode");
            return;
        }
        hfd.j("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
