package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d4d  reason: default package */
/* loaded from: classes.dex */
public final class d4d implements a5a {
    public final long[] a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public d4d(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j3;
        this.e = i;
    }

    @Override // defpackage.a5a
    public final long a() {
        return this.d;
    }

    @Override // defpackage.a5a
    public final long b(long j) {
        return this.a[a2d.f(this.b, j, true)];
    }

    @Override // defpackage.m4a
    public final boolean c() {
        return true;
    }

    @Override // defpackage.m4a
    public final l4a e(long j) {
        long[] jArr = this.a;
        int f = a2d.f(jArr, j, true);
        long j2 = jArr[f];
        long[] jArr2 = this.b;
        p4a p4aVar = new p4a(j2, jArr2[f]);
        if (j2 < j && f != jArr.length - 1) {
            int i = f + 1;
            return new l4a(p4aVar, new p4a(jArr[i], jArr2[i]));
        }
        return new l4a(p4aVar, p4aVar);
    }

    @Override // defpackage.a5a
    public final int f() {
        return this.e;
    }

    @Override // defpackage.m4a
    public final long g() {
        return this.c;
    }
}
