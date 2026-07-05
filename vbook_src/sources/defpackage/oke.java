package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oke  reason: default package */
/* loaded from: classes.dex */
public final class oke extends ehe {
    public final ske f;
    public final hlf g;
    public final Integer h;

    public oke(ske skeVar, hlf hlfVar, Integer num) {
        this.f = skeVar;
        this.g = hlfVar;
        this.h = num;
    }

    public static oke E(ske skeVar, Integer num) {
        hlf a;
        zhe zheVar = skeVar.b;
        if (zheVar == zhe.D) {
            if (num != null) {
                a = hlf.a(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                hfd.j("For given Variant TINK the value of idRequirement must be non-null");
                return null;
            }
        } else if (zheVar == zhe.E) {
            if (num == null) {
                a = hlf.a(new byte[0]);
            } else {
                hfd.j("For given Variant NO_PREFIX the value of idRequirement must be null");
                return null;
            }
        } else {
            throw new GeneralSecurityException("Unknown Variant: ".concat(String.valueOf(zheVar)));
        }
        return new oke(skeVar, a, num);
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
