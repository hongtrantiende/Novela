package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hq8  reason: default package */
/* loaded from: classes.dex */
public final class hq8 implements jq8 {
    public final cq8 a;
    public final byte[] b;

    public hq8(cq8 cq8Var, byte[] bArr) {
        this.a = cq8Var;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hq8) {
            hq8 hq8Var = (hq8) obj;
            if (this.a.equals(hq8Var.a) && Arrays.equals(this.b, hq8Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.b);
        return "Stream(dict=" + this.a + ", raw=" + arrays + ")";
    }
}
