package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jh1  reason: default package */
/* loaded from: classes.dex */
public final class jh1 implements m4a {
    public final int a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public jh1(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.a = length;
        if (length > 0) {
            int i = length - 1;
            this.f = jArr2[i] + jArr3[i];
            return;
        }
        this.f = 0L;
    }

    @Override // defpackage.m4a
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        long[] jArr = this.e;
        int f = a2d.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.c;
        p4a p4aVar = new p4a(j2, jArr2[f]);
        if (j2 < j && f != this.a - 1) {
            int i = f + 1;
            return new l4a(p4aVar, new p4a(jArr[i], jArr2[i]));
        }
        return new l4a(p4aVar, p4aVar);
    }

    @Override // defpackage.m4a
    public final long g() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
