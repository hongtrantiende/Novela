package defpackage;

import java.math.BigInteger;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cye  reason: default package */
/* loaded from: classes.dex */
public final class cye extends uze {
    public final mye f;
    public final g99 g;
    public final xk9 h;

    public cye(mye myeVar, g99 g99Var, xk9 xk9Var) {
        this.f = myeVar;
        this.g = g99Var;
        this.h = xk9Var;
    }

    public static ECParameterSpec E(uxe uxeVar) {
        if (uxeVar == uxe.b) {
            return u2f.a;
        }
        if (uxeVar == uxe.c) {
            return u2f.b;
        }
        if (uxeVar == uxe.d) {
            return u2f.c;
        }
        vs.m("Unable to determine NIST curve type for ".concat(String.valueOf(uxeVar)));
        return null;
    }

    public static cye F(mye myeVar, g99 g99Var) {
        ECPoint eCPoint = myeVar.g;
        if (eCPoint != null) {
            BigInteger bigInteger = (BigInteger) g99Var.b;
            uxe uxeVar = myeVar.f.a;
            BigInteger order = E(uxeVar).getOrder();
            if (bigInteger.signum() > 0 && bigInteger.compareTo(order) < 0) {
                if (u2f.c(bigInteger, E(uxeVar)).equals(eCPoint)) {
                    return new cye(myeVar, g99Var, null);
                }
                hfd.j("Invalid private value");
                return null;
            }
            hfd.j("Invalid private value");
            return null;
        }
        hfd.j("ECIES private key for NIST curve cannot be constructed with X25519-curve public key");
        return null;
    }

    public static cye G(mye myeVar, xk9 xk9Var) {
        hlf hlfVar = myeVar.h;
        if (hlfVar != null) {
            byte[] b = ((hlf) xk9Var.b).b();
            byte[] b2 = hlfVar.b();
            if (b.length == 32) {
                if (Arrays.equals(ese.v(b), b2)) {
                    return new cye(myeVar, null, xk9Var);
                }
                hfd.j("Invalid private key for public key.");
                return null;
            }
            hfd.j("Private key bytes length for X25519 curve must be 32");
            return null;
        }
        hfd.j("ECIES private key for X25519 curve cannot be constructed with NIST-curve public key");
        return null;
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
