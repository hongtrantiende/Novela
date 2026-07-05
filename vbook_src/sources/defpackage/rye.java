package defpackage;

import java.math.BigInteger;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rye  reason: default package */
/* loaded from: classes.dex */
public abstract class rye {
    public static final y5f a;
    public static final u5f b;
    public static final t3f c;
    public static final m3f d;
    public static final t3f e;
    public static final m3f f;
    public static final hvc g;
    public static final hvc h;
    public static final hvc i;
    public static final hvc j;

    static {
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.HpkePrivateKey");
        hlf c3 = k7f.c("type.googleapis.com/google.crypto.tink.HpkePublicKey");
        a = new y5f(kye.class, new fn8(26));
        b = new u5f(c2, new pq8(26));
        c = new t3f(yye.class, new mp8(26));
        d = new m3f(c3, new tw8(26));
        e = new t3f(oye.class, new iv8(26));
        f = new m3f(c2, new u28(27));
        c3f z = hvc.z();
        z.b(eif.RAW, gye.d);
        z.b(eif.TINK, gye.b);
        eif eifVar = eif.LEGACY;
        gye gyeVar = gye.c;
        z.b(eifVar, gyeVar);
        z.b(eif.CRUNCHY, gyeVar);
        g = z.a();
        c3f z2 = hvc.z();
        z2.b(fff.DHKEM_P256_HKDF_SHA256, hye.d);
        z2.b(fff.DHKEM_P384_HKDF_SHA384, hye.e);
        z2.b(fff.DHKEM_P521_HKDF_SHA512, hye.f);
        z2.b(fff.DHKEM_X25519_HKDF_SHA256, hye.C);
        h = z2.a();
        c3f z3 = hvc.z();
        z3.b(gff.HKDF_SHA256, fye.d);
        z3.b(gff.HKDF_SHA384, fye.e);
        z3.b(gff.HKDF_SHA512, fye.f);
        i = z3.a();
        c3f z4 = hvc.z();
        z4.b(bff.AES_128_GCM, eye.d);
        z4.b(bff.AES_256_GCM, eye.e);
        z4.b(bff.CHACHA20_POLY1305, eye.f);
        j = z4.a();
    }

    public static kye a(eif eifVar, qff qffVar) {
        odd b2 = kye.b();
        b2.e = (gye) g.t(eifVar);
        b2.b = (hye) h.t(qffVar.y());
        b2.c = (fye) i.t(qffVar.x());
        b2.d = (eye) j.t(qffVar.t());
        return b2.i();
    }

    public static cgf b(yye yyeVar) {
        agf z = cgf.z();
        z.c();
        ((cgf) z.b).zzf = 0;
        qff d2 = d(yyeVar.f);
        z.c();
        cgf.x((cgf) z.b, d2);
        byte[] b2 = yyeVar.g.b();
        w6e e2 = s6e.e(b2, 0, b2.length);
        z.c();
        cgf.w((cgf) z.b, e2);
        return (cgf) z.b();
    }

    public static hlf c(hye hyeVar, byte[] bArr) {
        int i2;
        BigInteger C = ade.C(bArr);
        byte[] bArr2 = t1f.a;
        if (hyeVar == hye.C) {
            i2 = 32;
        } else if (hyeVar == hye.d) {
            i2 = 65;
        } else if (hyeVar == hye.e) {
            i2 = 97;
        } else if (hyeVar == hye.f) {
            i2 = Token.BREAK;
        } else {
            hfd.j("Unrecognized HPKE KEM identifier");
            return null;
        }
        return hlf.a(ade.E(C, i2));
    }

    public static qff d(kye kyeVar) {
        pff z = qff.z();
        z.c();
        ((qff) z.b).zze = ((fff) h.r(kyeVar.a)).zza();
        z.c();
        ((qff) z.b).zzf = ((gff) i.r(kyeVar.b)).zza();
        z.c();
        ((qff) z.b).zzg = ((bff) j.r(kyeVar.c)).zza();
        return (qff) z.b();
    }
}
