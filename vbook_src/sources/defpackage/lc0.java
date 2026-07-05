package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lc0  reason: default package */
/* loaded from: classes.dex */
public final class lc0 extends f14 {
    public final byte[] a;
    public final byte[] b;

    public lc0(byte[] bArr, byte[] bArr2) {
        this.a = bArr;
        this.b = bArr2;
    }

    public final boolean equals(Object obj) {
        byte[] bArr;
        byte[] bArr2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f14) {
            f14 f14Var = (f14) obj;
            boolean z = f14Var instanceof lc0;
            lc0 lc0Var = (lc0) f14Var;
            if (z) {
                bArr = lc0Var.a;
            } else {
                bArr = lc0Var.a;
            }
            if (Arrays.equals(this.a, bArr)) {
                lc0 lc0Var2 = (lc0) f14Var;
                if (z) {
                    bArr2 = lc0Var2.b;
                } else {
                    bArr2 = lc0Var2.b;
                }
                if (Arrays.equals(this.b, bArr2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) ^ ((Arrays.hashCode(this.a) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.a) + ", encryptedBlob=" + Arrays.toString(this.b) + "}";
    }
}
