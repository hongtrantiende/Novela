package defpackage;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oye  reason: default package */
/* loaded from: classes.dex */
public final class oye extends uze {
    public final yye f;
    public final xk9 g;

    public oye(yye yyeVar, xk9 xk9Var) {
        this.f = yyeVar;
        this.g = xk9Var;
    }

    public static oye E(yye yyeVar, xk9 xk9Var) {
        ECParameterSpec eCParameterSpec;
        kye kyeVar = yyeVar.f;
        hlf hlfVar = (hlf) xk9Var.b;
        hye hyeVar = kyeVar.a;
        int length = hlfVar.a.length;
        String str = "Encoded private key byte length for " + String.valueOf(hyeVar) + " must be %d, not " + length;
        hye hyeVar2 = hye.C;
        hye hyeVar3 = hye.f;
        hye hyeVar4 = hye.e;
        hye hyeVar5 = hye.d;
        if (hyeVar == hyeVar5) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (hyeVar == hyeVar4) {
            if (length != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (hyeVar == hyeVar3) {
            if (length != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else if (hyeVar == hyeVar2) {
            if (length != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else {
            throw new GeneralSecurityException("Unable to validate private key length for ".concat(String.valueOf(hyeVar)));
        }
        byte[] b = yyeVar.g.b();
        byte[] b2 = hlfVar.b();
        if (hyeVar != hyeVar5 && hyeVar != hyeVar4 && hyeVar != hyeVar3) {
            if (hyeVar == hyeVar2) {
                if (!Arrays.equals(ese.v(b2), b)) {
                    hfd.j("Invalid private key for public key.");
                    return null;
                }
            } else {
                vs.m("Unable to validate key pair for ".concat(String.valueOf(hyeVar)));
                return null;
            }
        } else {
            if (hyeVar == hyeVar5) {
                eCParameterSpec = u2f.a;
            } else if (hyeVar == hyeVar4) {
                eCParameterSpec = u2f.b;
            } else if (hyeVar == hyeVar3) {
                eCParameterSpec = u2f.c;
            } else {
                vs.m("Unable to determine NIST curve params for ".concat(String.valueOf(hyeVar)));
                return null;
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger C = ade.C(b2);
            if (C.signum() > 0 && C.compareTo(order) < 0) {
                if (!u2f.c(C, eCParameterSpec).equals(hu7.q(eCParameterSpec.getCurve(), hkf.a, b))) {
                    hfd.j("Invalid private key for public key.");
                    return null;
                }
            } else {
                hfd.j("Invalid private key.");
                return null;
            }
        }
        return new oye(yyeVar, xk9Var);
    }

    @Override // defpackage.s9e
    public final /* synthetic */ bfe B() {
        return this.f.f;
    }

    @Override // defpackage.uze
    public final /* synthetic */ s9e D() {
        return this.f;
    }
}
