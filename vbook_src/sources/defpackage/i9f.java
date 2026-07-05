package defpackage;

import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i9f  reason: default package */
/* loaded from: classes.dex */
public final class i9f extends bfe {
    public final int a;

    public i9f(int i) {
        this.a = i;
    }

    public static i9f b(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit are supported", Integer.valueOf(i << 3)));
        }
        return new i9f(i);
    }

    @Override // defpackage.bfe
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof i9f) || ((i9f) obj).a != this.a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(i9f.class, Integer.valueOf(this.a));
    }

    public final String toString() {
        return hl5.l("AesCmac PRF Parameters (", "-byte key)", this.a);
    }
}
