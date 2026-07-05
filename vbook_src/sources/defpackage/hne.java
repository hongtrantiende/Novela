package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hne  reason: default package */
/* loaded from: classes.dex */
public final class hne extends ehe {
    public final rne f;
    public final xk9 g;
    public final hlf h;
    public final Integer i;

    public hne(rne rneVar, xk9 xk9Var, hlf hlfVar, Integer num) {
        this.f = rneVar;
        this.g = xk9Var;
        this.h = hlfVar;
        this.i = num;
    }

    public static hne E(rne rneVar, xk9 xk9Var, Integer num) {
        hlf b;
        hlf hlfVar = (hlf) xk9Var.b;
        oce oceVar = rneVar.a;
        oce oceVar2 = oce.F;
        if (oceVar != oceVar2 && num == null) {
            throw new GeneralSecurityException(hl5.n("For given Variant ", String.valueOf(oceVar), " the value of idRequirement must be non-null"));
        }
        if (oceVar == oceVar2 && num != null) {
            hfd.j("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        } else if (hlfVar.a.length == 32) {
            if (oceVar == oceVar2) {
                b = o5f.a;
            } else if (oceVar == oce.E) {
                b = o5f.b(num.intValue());
            } else {
                vs.k("Unknown Variant: ".concat(String.valueOf(oceVar)));
                return null;
            }
            return new hne(rneVar, xk9Var, b, num);
        } else {
            throw new GeneralSecurityException(a82.j(hlfVar.a.length, "XAesGcmKey key must be constructed with key of length 32 bytes, not "));
        }
    }

    @Override // defpackage.s9e
    public final /* synthetic */ bfe B() {
        return this.f;
    }

    @Override // defpackage.s9e
    public final Integer C() {
        return this.i;
    }

    @Override // defpackage.ehe
    public final hlf D() {
        return this.h;
    }
}
