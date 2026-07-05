package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: boe  reason: default package */
/* loaded from: classes.dex */
public final class boe extends ehe {
    public final koe f;
    public final xk9 g;
    public final hlf h;
    public final Integer i;

    public boe(koe koeVar, xk9 xk9Var, hlf hlfVar, Integer num) {
        this.f = koeVar;
        this.g = xk9Var;
        this.h = hlfVar;
        this.i = num;
    }

    public static boe E(yhe yheVar, xk9 xk9Var, Integer num) {
        hlf b;
        hlf hlfVar = (hlf) xk9Var.b;
        yhe yheVar2 = yhe.G;
        if (yheVar != yheVar2 && num == null) {
            throw new GeneralSecurityException(hl5.n("For given Variant ", String.valueOf(yheVar), " the value of idRequirement must be non-null"));
        }
        if (yheVar == yheVar2 && num != null) {
            hfd.j("For given Variant NO_PREFIX the value of idRequirement must be null");
            return null;
        } else if (hlfVar.a.length == 32) {
            koe koeVar = new koe(yheVar);
            if (yheVar == yheVar2) {
                b = o5f.a;
            } else if (yheVar == yhe.F) {
                b = o5f.a(num.intValue());
            } else if (yheVar == yhe.E) {
                b = o5f.b(num.intValue());
            } else {
                vs.k("Unknown Variant: ".concat(String.valueOf(yheVar)));
                return null;
            }
            return new boe(koeVar, xk9Var, b, num);
        } else {
            throw new GeneralSecurityException(a82.j(hlfVar.a.length, "XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not "));
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
