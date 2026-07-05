package defpackage;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: swe  reason: default package */
/* loaded from: classes.dex */
public abstract class swe {
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
        m5fVar.a(hhe.d);
        m5fVar.b(hhe.e);
        if (lve.a()) {
            return;
        }
        i6f i6fVar = ewe.a;
        if (eub.d(1)) {
            y5f y5fVar = exe.a;
            l5f l5fVar = l5f.b;
            l5fVar.h(exe.a);
            l5fVar.g(exe.b);
            l5fVar.f(exe.c);
            l5fVar.e(exe.d);
            m5fVar.b(ewe.a);
            g5f g5fVar = g5f.b;
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", zwe.a);
            hvc b = lwe.b();
            b.C(64);
            b.c = jwe.d;
            hashMap.put("AES256_SIV_RAW", b.y());
            g5fVar.b(Collections.unmodifiableMap(hashMap));
            c5f.b.a(ewe.c, lwe.class);
            y4f.b.b(ewe.d, lwe.class);
            h3f.d.c(ewe.b, true);
            return;
        }
        hfd.j("Registering AES SIV is not supported in FIPS mode");
    }
}
