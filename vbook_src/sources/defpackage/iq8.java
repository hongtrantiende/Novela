package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iq8  reason: default package */
/* loaded from: classes.dex */
public final class iq8 implements jq8 {
    public final byte[] a;

    public iq8(byte[] bArr) {
        this.a = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iq8) {
            if (Arrays.equals(this.a, ((iq8) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return hl5.n("StringObj(bytes=", Arrays.toString(this.a), ")");
    }
}
