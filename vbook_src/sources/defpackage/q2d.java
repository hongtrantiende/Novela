package defpackage;

import java.io.Serializable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q2d  reason: default package */
/* loaded from: classes3.dex */
public final class q2d implements Comparable, Serializable {
    public static final q2d c = new q2d(0, 0);
    public final long a;
    public final long b;

    public q2d(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q2d q2dVar = (q2d) obj;
        q2dVar.getClass();
        long j = q2dVar.a;
        long j2 = this.a;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.b ^ Long.MIN_VALUE, q2dVar.b ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q2d)) {
            return false;
        }
        q2d q2dVar = (q2d) obj;
        if (this.a == q2dVar.a && this.b == q2dVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a ^ this.b);
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        lre.i(this.a, bArr, 0, 0, 4);
        bArr[8] = 45;
        lre.i(this.a, bArr, 9, 4, 6);
        bArr[13] = 45;
        lre.i(this.a, bArr, 14, 6, 8);
        bArr[18] = 45;
        lre.i(this.b, bArr, 19, 0, 2);
        bArr[23] = 45;
        lre.i(this.b, bArr, 24, 2, 8);
        return r4b.F(bArr);
    }
}
