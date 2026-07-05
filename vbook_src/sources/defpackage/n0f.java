package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n0f  reason: default package */
/* loaded from: classes.dex */
public abstract class n0f {
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
        hlf c2 = k7f.c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        hlf c3 = k7f.c("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey");
        a = new y5f(yxe.class, new h88(27));
        b = new u5f(c2, new bl8(27));
        c = new t3f(mye.class, new jf8(27));
        d = new m3f(c3, new mp8(27));
        e = new t3f(cye.class, new fn8(27));
        f = new m3f(c2, new pq8(27));
        c3f z = hvc.z();
        z.b(eif.RAW, vxe.d);
        z.b(eif.TINK, vxe.b);
        eif eifVar = eif.LEGACY;
        vxe vxeVar = vxe.c;
        z.b(eifVar, vxeVar);
        z.b(eif.CRUNCHY, vxeVar);
        g = z.a();
        c3f z2 = hvc.z();
        z2.b(lef.SHA1, txe.b);
        z2.b(lef.SHA224, txe.c);
        z2.b(lef.SHA256, txe.d);
        z2.b(lef.SHA384, txe.e);
        z2.b(lef.SHA512, txe.f);
        h = z2.a();
        c3f z3 = hvc.z();
        z3.b(def.NIST_P256, uxe.b);
        z3.b(def.NIST_P384, uxe.c);
        z3.b(def.NIST_P521, uxe.d);
        z3.b(def.CURVE25519, uxe.e);
        i = z3.a();
        c3f z4 = hvc.z();
        z4.b(fdf.UNCOMPRESSED, wxe.c);
        z4.b(fdf.COMPRESSED, wxe.b);
        z4.b(fdf.DO_NOT_USE_CRUNCHY_UNCOMPRESSED, wxe.d);
        j = z4.a();
    }

    public static int a(uxe uxeVar) {
        if (uxe.b != uxeVar) {
            if (uxe.c != uxeVar) {
                if (uxe.d == uxeVar) {
                    return 67;
                }
                throw new GeneralSecurityException("Unable to serialize CurveType ".concat(String.valueOf(uxeVar)));
            }
            return 49;
        }
        return 33;
    }

    public static yxe b(eif eifVar, mdf mdfVar) {
        mgf t = ogf.t();
        t.f(mdfVar.x().w().B());
        t.e(eif.RAW);
        t.g(mdfVar.x().w().A());
        yv b2 = yxe.b();
        b2.e = (vxe) g.t(eifVar);
        b2.a = (uxe) i.t(mdfVar.A().y());
        b2.b = (txe) h.t(mdfVar.A().z());
        b2.M(y9e.s(((ogf) t.b()).c()));
        hlf a2 = hlf.a(mdfVar.A().A().m());
        if (a2.a.length == 0) {
            b2.f = null;
        } else {
            b2.f = a2;
        }
        if (!mdfVar.A().y().equals(def.CURVE25519)) {
            b2.c = (wxe) j.t(mdfVar.t());
        } else if (!mdfVar.t().equals(fdf.COMPRESSED)) {
            hfd.j("For CURVE25519 EcPointFormat must be compressed");
            return null;
        }
        return b2.K();
    }

    public static sdf c(mye myeVar) {
        yxe yxeVar = myeVar.f;
        if (yxeVar.a.equals(uxe.e)) {
            rdf A = sdf.A();
            A.c();
            ((sdf) A.b).zzf = 0;
            mdf d2 = d(yxeVar);
            A.c();
            sdf.x((sdf) A.b, d2);
            byte[] b2 = myeVar.h.b();
            w6e e2 = s6e.e(b2, 0, b2.length);
            A.c();
            sdf.w((sdf) A.b, e2);
            w6e w6eVar = s6e.b;
            A.c();
            sdf.z((sdf) A.b, w6eVar);
            return (sdf) A.b();
        }
        int a2 = a(yxeVar.a);
        ECPoint eCPoint = myeVar.g;
        if (eCPoint != null) {
            rdf A2 = sdf.A();
            A2.c();
            ((sdf) A2.b).zzf = 0;
            mdf d3 = d(yxeVar);
            A2.c();
            sdf.x((sdf) A2.b, d3);
            byte[] E = ade.E(eCPoint.getAffineX(), a2);
            w6e e3 = s6e.e(E, 0, E.length);
            A2.c();
            sdf.w((sdf) A2.b, e3);
            byte[] E2 = ade.E(eCPoint.getAffineY(), a2);
            w6e e4 = s6e.e(E2, 0, E2.length);
            A2.c();
            sdf.z((sdf) A2.b, e4);
            return (sdf) A2.b();
        }
        hfd.j("NistCurvePoint was null for NIST curve");
        return null;
    }

    public static mdf d(yxe yxeVar) {
        xdf t = zdf.t();
        t.c();
        ((zdf) t.b).zze = ((def) i.r(yxeVar.a)).zza();
        t.c();
        ((zdf) t.b).zzf = ((lef) h.r(yxeVar.b)).zza();
        hlf hlfVar = yxeVar.f;
        if (hlfVar != null && hlfVar.a.length > 0) {
            byte[] b2 = hlfVar.b();
            w6e e2 = s6e.e(b2, 0, b2.length);
            t.c();
            zdf.u((zdf) t.b, e2);
        }
        zdf zdfVar = (zdf) t.b();
        try {
            ogf u = ogf.u(y9e.u(yxeVar.e), g7e.a);
            ddf t2 = edf.t();
            mgf t3 = ogf.t();
            t3.f(u.B());
            t3.e(eif.TINK);
            t3.g(u.A());
            t2.c();
            edf.u((edf) t2.b, (ogf) t3.b());
            edf edfVar = (edf) t2.b();
            wxe wxeVar = yxeVar.c;
            if (wxeVar == null) {
                wxeVar = wxe.b;
            }
            kdf y = mdf.y();
            y.c();
            mdf.w((mdf) y.b, zdfVar);
            y.c();
            mdf.u((mdf) y.b, edfVar);
            y.c();
            ((mdf) y.b).zzh = ((fdf) j.r(wxeVar)).zza();
            return (mdf) y.b();
        } catch (w7e e3) {
            throw new GeneralSecurityException("Parsing EciesParameters failed: ", e3);
        }
    }
}
