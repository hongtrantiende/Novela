package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lj8  reason: default package */
/* loaded from: classes.dex */
public final class lj8 implements kj8 {
    @Override // defpackage.kj8
    public final int d(int i, int i2) {
        long j = i;
        long j2 = j - 1;
        if (j2 < 0) {
            j2 = 0;
        }
        int i3 = (int) j2;
        long j3 = j + 1;
        if (j3 > 2147483647L) {
            j3 = 2147483647L;
        }
        return dce.n(i2, i3, (int) j3);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lj8) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(1);
    }
}
