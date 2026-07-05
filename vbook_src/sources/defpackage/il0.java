package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: il0  reason: default package */
/* loaded from: classes3.dex */
public final class il0 {
    public long[] a;

    public final boolean equals(Object obj) {
        if (!(obj instanceof il0)) {
            return false;
        }
        il0 il0Var = (il0) obj;
        int min = Math.min(this.a.length, il0Var.a.length);
        int i = 0;
        while (true) {
            long[] jArr = this.a;
            if (i < min) {
                if (jArr[i] != il0Var.a[i]) {
                    return false;
                }
                i++;
            } else {
                int length = jArr.length;
                for (int i2 = i; i2 < length; i2++) {
                    if (this.a[i2] != 0) {
                        return false;
                    }
                }
                int length2 = il0Var.a.length;
                while (i < length2) {
                    if (il0Var.a[i] != 0) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
    }

    public final int hashCode() {
        int length = this.a.length;
        long j = 1234;
        while (length > 0) {
            long j2 = length;
            length--;
            j ^= j2 * this.a[length];
        }
        return (int) ((j >> 32) ^ j);
    }
}
