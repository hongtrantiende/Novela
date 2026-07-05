package defpackage;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vhe  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vhe {
    public final /* synthetic */ int a;

    public /* synthetic */ vhe(int i) {
        this.a = i;
    }

    public final s9e a(bfe bfeVar, Integer num) {
        ECParameterSpec eCParameterSpec;
        bkf bkfVar;
        hlf hlfVar;
        xk9 xk9Var;
        switch (this.a) {
            case 0:
                bie bieVar = (bie) bfeVar;
                int i = bieVar.a;
                if (i != 16 && i != 32) {
                    hfd.j("AES key size must be 16 or 32 bytes");
                    return null;
                }
                odd oddVar = new odd(9, false);
                oddVar.c = null;
                oddVar.d = null;
                oddVar.b = bieVar;
                oddVar.e = num;
                oddVar.c = xk9.s(i);
                oddVar.d = xk9.s(bieVar.b);
                return oddVar.f();
            case 1:
                oie oieVar = (oie) bfeVar;
                int i2 = oieVar.a;
                if (i2 != 24) {
                    yx9 yx9Var = new yx9((char) 0, 27);
                    yx9Var.c = null;
                    yx9Var.b = oieVar;
                    yx9Var.d = num;
                    yx9Var.c = xk9.s(i2);
                    return yx9Var.p();
                }
                hfd.j("192 bit AES EAX Parameters are not valid");
                return null;
            case 2:
                gje gjeVar = (gje) bfeVar;
                int i3 = gjeVar.a;
                if (i3 != 24) {
                    yx9 yx9Var2 = new yx9((char) 0, 28);
                    yx9Var2.c = null;
                    yx9Var2.b = gjeVar;
                    yx9Var2.d = num;
                    yx9Var2.c = xk9.s(i3);
                    return yx9Var2.q();
                }
                hfd.j("192 bit AES GCM Parameters are not valid");
                return null;
            case 3:
                sje sjeVar = (sje) bfeVar;
                jje jjeVar = new jje(0);
                jjeVar.c = null;
                jjeVar.b = sjeVar;
                jjeVar.d = num;
                jjeVar.c = xk9.s(sjeVar.a);
                return jjeVar.c();
            case 4:
                return vje.E(((dke) bfeVar).a, xk9.s(32), num);
            case 5:
                return oke.E((ske) bfeVar, num);
            case 6:
                return rle.E((ole) bfeVar, num);
            case 7:
                return hne.E((rne) bfeVar, xk9.s(32), num);
            case 8:
                return boe.E(((koe) bfeVar).a, xk9.s(32), num);
            case 9:
                lwe lweVar = (lwe) bfeVar;
                int i4 = lweVar.a;
                if (i4 == 64) {
                    jje jjeVar2 = new jje(4);
                    jjeVar2.c = null;
                    jjeVar2.b = lweVar;
                    jjeVar2.d = num;
                    jjeVar2.c = xk9.s(i4);
                    return jjeVar2.d();
                }
                throw new InvalidAlgorithmParameterException(hl5.l("invalid key size: ", ". Valid keys must have 64 bytes.", i4));
            case 10:
                yxe yxeVar = (yxe) bfeVar;
                uxe uxeVar = yxeVar.a;
                if (uxeVar == uxe.b) {
                    eCParameterSpec = u2f.a;
                } else if (uxeVar == uxe.c) {
                    eCParameterSpec = u2f.b;
                } else if (uxeVar == uxe.d) {
                    eCParameterSpec = u2f.c;
                } else {
                    throw new GeneralSecurityException("Unsupported curve type: ".concat(String.valueOf(uxeVar)));
                }
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) kkf.e.a.zza("EC");
                keyPairGenerator.initialize(eCParameterSpec);
                KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
                return cye.F(mye.E(yxeVar, ((ECPublicKey) generateKeyPair.getPublic()).getW(), num), new g99(((ECPrivateKey) generateKeyPair.getPrivate()).getS(), 27));
            case 11:
                kye kyeVar = (kye) bfeVar;
                hye hyeVar = kyeVar.a;
                if (hyeVar.equals(hye.C)) {
                    byte[] a = u6f.a(32);
                    a[0] = (byte) (a[0] | 7);
                    byte b = (byte) (a[31] & 63);
                    a[31] = b;
                    a[31] = (byte) (b | 128);
                    xk9Var = new xk9(hlf.a(a), 26);
                    hlfVar = hlf.a(ese.v(a));
                } else {
                    hye hyeVar2 = hye.f;
                    hye hyeVar3 = hye.e;
                    hye hyeVar4 = hye.d;
                    if (hyeVar != hyeVar4 && hyeVar != hyeVar3 && hyeVar != hyeVar2) {
                        hfd.j("Unknown KEM ID");
                        return null;
                    }
                    byte[] bArr = t1f.a;
                    if (hyeVar == hyeVar4) {
                        bkfVar = bkf.a;
                    } else if (hyeVar == hyeVar3) {
                        bkfVar = bkf.b;
                    } else if (hyeVar == hyeVar2) {
                        bkfVar = bkf.c;
                    } else {
                        hfd.j("Unrecognized NIST HPKE KEM identifier");
                        return null;
                    }
                    ECParameterSpec p = hu7.p(bkfVar);
                    KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) kkf.e.a.zza("EC");
                    keyPairGenerator2.initialize(p);
                    KeyPair generateKeyPair2 = keyPairGenerator2.generateKeyPair();
                    ECPoint w = ((ECPublicKey) generateKeyPair2.getPublic()).getW();
                    EllipticCurve curve = hu7.p(bkfVar).getCurve();
                    u2f.g(w, curve);
                    int n = hu7.n(curve);
                    int i5 = (n * 2) + 1;
                    byte[] bArr2 = new byte[i5];
                    byte[] D = ade.D(w.getAffineX());
                    byte[] D2 = ade.D(w.getAffineY());
                    System.arraycopy(D2, 0, bArr2, i5 - D2.length, D2.length);
                    System.arraycopy(D, 0, bArr2, (n + 1) - D.length, D.length);
                    bArr2[0] = 4;
                    hlf a2 = hlf.a(bArr2);
                    xk9 xk9Var2 = new xk9(hlf.a(ade.E(((ECPrivateKey) generateKeyPair2.getPrivate()).getS(), t1f.a(hyeVar))), 26);
                    hlfVar = a2;
                    xk9Var = xk9Var2;
                }
                return oye.E(yye.E(kyeVar, hlfVar, num), xk9Var);
            case 12:
                ogf ogfVar = (ogf) ((j4f) bfeVar).a.b;
                h3f h3fVar = h3f.d;
                u3f a3 = h3fVar.a(ogfVar.B());
                if (((Boolean) h3fVar.b.get(ogfVar.B())).booleanValue()) {
                    s6e A = ogfVar.A();
                    a3.getClass();
                    mgf t = ogf.t();
                    t.f(a3.a);
                    t.g(A);
                    t.e(eif.RAW);
                    ogf ogfVar2 = (ogf) t.b();
                    s6f s6fVar = new s6f(ogfVar2, k7f.a(ogfVar2.B()));
                    l5f l5fVar = l5f.b;
                    t6f t6fVar = (t6f) l5fVar.c(y4f.b.a(l5fVar.b(s6fVar), null));
                    fgf t2 = hgf.t();
                    t2.c();
                    hgf.v((hgf) t2.b, (String) t6fVar.c);
                    t2.c();
                    hgf.w((hgf) t2.b, (s6e) t6fVar.e);
                    int i6 = t6fVar.b;
                    t2.c();
                    hgf.u((hgf) t2.b, i6);
                    hgf hgfVar = (hgf) t2.b();
                    return new c4f(t6f.p(hgfVar.A(), hgfVar.z(), hgfVar.x(), ogfVar.z(), num));
                }
                hfd.j("Creating new keys is not allowed.");
                return null;
            case 13:
                o7f o7fVar = (o7f) bfeVar;
                int i7 = o7fVar.a;
                if (i7 == 32) {
                    jje jjeVar3 = new jje(11);
                    jjeVar3.c = null;
                    jjeVar3.d = null;
                    jjeVar3.b = o7fVar;
                    jjeVar3.c = xk9.s(i7);
                    jjeVar3.d = num;
                    return jjeVar3.e();
                }
                hfd.j("AesCmacKey size wrong, must be 32 bytes");
                return null;
            default:
                h8f h8fVar = (h8f) bfeVar;
                jje jjeVar4 = new jje(13);
                jjeVar4.c = null;
                jjeVar4.d = null;
                jjeVar4.b = h8fVar;
                jjeVar4.c = xk9.s(h8fVar.a);
                jjeVar4.d = num;
                return jjeVar4.g();
        }
    }
}
