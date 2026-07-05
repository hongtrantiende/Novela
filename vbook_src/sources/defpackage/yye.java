package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.EllipticCurve;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yye  reason: default package */
/* loaded from: classes.dex */
public final class yye extends zze {
    public final kye f;
    public final hlf g;
    public final hlf h;
    public final Integer i;

    public yye(kye kyeVar, hlf hlfVar, hlf hlfVar2, Integer num) {
        this.f = kyeVar;
        this.g = hlfVar;
        this.h = hlfVar2;
        this.i = num;
    }

    public static yye E(kye kyeVar, hlf hlfVar, Integer num) {
        EllipticCurve curve;
        hlf b;
        gye gyeVar = kyeVar.d;
        gye gyeVar2 = gye.d;
        if (!gyeVar.equals(gyeVar2) && num == null) {
            throw new GeneralSecurityException(hl5.n("'idRequirement' must be non-null for ", String.valueOf(gyeVar), " variant."));
        }
        if (gyeVar != gyeVar2 || num == null) {
            hye hyeVar = kyeVar.a;
            int length = hlfVar.a.length;
            String str = "Encoded public key byte length for " + String.valueOf(hyeVar) + " must be %d, not " + length;
            hye hyeVar2 = hye.f;
            hye hyeVar3 = hye.e;
            hye hyeVar4 = hye.d;
            if (hyeVar == hyeVar4) {
                if (length != 65) {
                    throw new GeneralSecurityException(String.format(str, 65));
                }
            } else if (hyeVar == hyeVar3) {
                if (length != 97) {
                    throw new GeneralSecurityException(String.format(str, 97));
                }
            } else if (hyeVar == hyeVar2) {
                if (length != 133) {
                    throw new GeneralSecurityException(String.format(str, Integer.valueOf((int) Token.BREAK)));
                }
            } else if (hyeVar == hye.C) {
                if (length != 32) {
                    throw new GeneralSecurityException(String.format(str, 32));
                }
            } else {
                throw new GeneralSecurityException("Unable to validate public key length for ".concat(String.valueOf(hyeVar)));
            }
            if (hyeVar == hyeVar4 || hyeVar == hyeVar3 || hyeVar == hyeVar2) {
                if (hyeVar == hyeVar4) {
                    curve = u2f.a.getCurve();
                } else if (hyeVar == hyeVar3) {
                    curve = u2f.b.getCurve();
                } else if (hyeVar == hyeVar2) {
                    curve = u2f.c.getCurve();
                } else {
                    vs.m("Unable to determine NIST curve type for ".concat(String.valueOf(hyeVar)));
                    return null;
                }
                u2f.g(hu7.q(curve, hkf.a, hlfVar.b()), curve);
            }
            if (gyeVar == gyeVar2) {
                b = o5f.a;
            } else if (num != null) {
                if (gyeVar == gye.c) {
                    b = o5f.a(num.intValue());
                } else if (gyeVar == gye.b) {
                    b = o5f.b(num.intValue());
                } else {
                    vs.k("Unknown HpkeParameters.Variant: ".concat(String.valueOf(gyeVar)));
                    return null;
                }
            } else {
                vs.k("idRequirement must be non-null for HpkeParameters.Variant ".concat(String.valueOf(gyeVar)));
                return null;
            }
            return new yye(kyeVar, hlfVar, b, num);
        }
        hfd.j("'idRequirement' must be null for NO_PREFIX variant.");
        return null;
    }

    @Override // defpackage.s9e
    public final /* synthetic */ bfe B() {
        return this.f;
    }

    @Override // defpackage.s9e
    public final Integer C() {
        return this.i;
    }

    @Override // defpackage.zze
    public final hlf D() {
        return this.h;
    }
}
