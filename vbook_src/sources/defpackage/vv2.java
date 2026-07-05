package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vv2  reason: default package */
/* loaded from: classes.dex */
public final class vv2 implements s88 {
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long H;
    public final r88 a;
    public final long b;
    public final long c;
    public final j1b d;
    public int e;
    public long f;

    public vv2(j1b j1bVar, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j >= 0 && j2 > j) {
            z2 = true;
        } else {
            z2 = false;
        }
        wq9.s(z2);
        this.d = j1bVar;
        this.b = j;
        this.c = j2;
        if (j3 != j2 - j && !z) {
            this.e = 0;
        } else {
            this.f = j4;
            this.e = 4;
        }
        this.a = new r88();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2  */
    @Override // defpackage.s88
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b(defpackage.s94 r28) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv2.b(s94):long");
    }

    @Override // defpackage.s88
    public final m4a e() {
        if (this.f != 0) {
            return new uv2(this);
        }
        return null;
    }

    @Override // defpackage.s88
    public final void f(long j) {
        this.D = a2d.j(j, 0L, this.f - 1);
        this.e = 2;
        this.E = this.b;
        this.F = this.c;
        this.G = 0L;
        this.H = this.f;
    }
}
