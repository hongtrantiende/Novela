package defpackage;

import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mye  reason: default package */
/* loaded from: classes.dex */
public final class mye extends zze {
    public final yxe f;
    public final ECPoint g;
    public final hlf h;
    public final hlf i;
    public final Integer j;

    public mye(yxe yxeVar, ECPoint eCPoint, hlf hlfVar, hlf hlfVar2, Integer num) {
        this.f = yxeVar;
        this.g = eCPoint;
        this.h = hlfVar;
        this.i = hlfVar2;
        this.j = num;
    }

    public static mye E(yxe yxeVar, ECPoint eCPoint, Integer num) {
        EllipticCurve curve;
        uxe uxeVar = yxeVar.a;
        vxe vxeVar = yxeVar.d;
        if (!uxeVar.equals(uxe.e)) {
            H(vxeVar, num);
            if (uxeVar == uxe.b) {
                curve = u2f.a.getCurve();
            } else if (uxeVar == uxe.c) {
                curve = u2f.b.getCurve();
            } else if (uxeVar == uxe.d) {
                curve = u2f.c.getCurve();
            } else {
                vs.m("Unable to determine NIST curve type for ".concat(String.valueOf(uxeVar)));
                return null;
            }
            u2f.g(eCPoint, curve);
            return new mye(yxeVar, eCPoint, null, G(vxeVar, num), num);
        }
        hfd.j("createForNistCurve may only be called with parameters for NIST curve");
        return null;
    }

    public static mye F(yxe yxeVar, hlf hlfVar, Integer num) {
        uxe uxeVar = yxeVar.a;
        vxe vxeVar = yxeVar.d;
        if (uxeVar.equals(uxe.e)) {
            H(vxeVar, num);
            if (hlfVar.a.length == 32) {
                return new mye(yxeVar, null, hlfVar, G(vxeVar, num), num);
            }
            hfd.j("Encoded public point byte length for X25519 curve must be 32");
            return null;
        }
        hfd.j("createForCurveX25519 may only be called with parameters for curve X25519");
        return null;
    }

    public static hlf G(vxe vxeVar, Integer num) {
        if (vxeVar == vxe.d) {
            return o5f.a;
        }
        if (num != null) {
            if (vxeVar == vxe.c) {
                return o5f.a(num.intValue());
            }
            if (vxeVar == vxe.b) {
                return o5f.b(num.intValue());
            }
            vs.k("Unknown EciesParameters.Variant: ".concat(String.valueOf(vxeVar)));
            return null;
        }
        vs.k("idRequirement must be non-null for EciesParameters.Variant: ".concat(String.valueOf(vxeVar)));
        return null;
    }

    public static void H(vxe vxeVar, Integer num) {
        vxe vxeVar2 = vxe.d;
        if (!vxeVar.equals(vxeVar2) && num == null) {
            throw new GeneralSecurityException(hl5.n("'idRequirement' must be non-null for ", String.valueOf(vxeVar), " variant."));
        }
        if (vxeVar != vxeVar2 || num == null) {
            return;
        }
        hfd.j("'idRequirement' must be null for NO_PREFIX variant.");
    }

    @Override // defpackage.s9e
    public final /* synthetic */ bfe B() {
        return this.f;
    }

    @Override // defpackage.s9e
    public final Integer C() {
        return this.j;
    }

    @Override // defpackage.zze
    public final hlf D() {
        return this.i;
    }
}
