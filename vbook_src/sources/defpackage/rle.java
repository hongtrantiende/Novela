package defpackage;

import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rle  reason: default package */
/* loaded from: classes.dex */
public final class rle extends ehe {
    public final ole f;
    public final hlf g;
    public final Integer h;

    public rle(ole oleVar, hlf hlfVar, Integer num) {
        this.f = oleVar;
        this.g = hlfVar;
        this.h = num;
    }

    public static rle E(ole oleVar, Integer num) {
        hlf b;
        fje fjeVar = oleVar.a;
        if (fjeVar == fje.C) {
            if (num == null) {
                b = o5f.a;
            } else {
                hfd.j("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
        } else if (fjeVar == fje.f) {
            if (num != null) {
                b = o5f.b(num.intValue());
            } else {
                hfd.j("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(fjeVar)));
        }
        return new rle(oleVar, b, num);
    }

    @Override // defpackage.s9e
    public final /* synthetic */ bfe B() {
        return this.f;
    }

    @Override // defpackage.s9e
    public final Integer C() {
        return this.h;
    }

    @Override // defpackage.ehe
    public final hlf D() {
        return this.g;
    }
}
