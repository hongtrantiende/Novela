package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: et8  reason: default package */
/* loaded from: classes3.dex */
public final class et8 implements osa {
    public final bz0 a;
    public final my0 b;
    public e5a c;
    public int d;
    public boolean e;
    public long f;

    public et8(bz0 bz0Var) {
        int i;
        this.a = bz0Var;
        my0 b = bz0Var.b();
        this.b = b;
        e5a e5aVar = b.a;
        this.c = e5aVar;
        if (e5aVar != null) {
            i = e5aVar.b;
        } else {
            i = -1;
        }
        this.d = i;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r3 == r5.b) goto L14;
     */
    @Override // defpackage.osa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long read(defpackage.my0 r9, long r10) {
        /*
            r8 = this;
            r9.getClass()
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 < 0) goto L65
            boolean r3 = r8.e
            if (r3 != 0) goto L5f
            e5a r3 = r8.c
            my0 r4 = r8.b
            if (r3 == 0) goto L27
            e5a r5 = r4.a
            if (r3 != r5) goto L21
            int r3 = r8.d
            r5.getClass()
            int r5 = r5.b
            if (r3 != r5) goto L21
            goto L27
        L21:
            java.lang.String r8 = "Peek source is invalid because upstream source was used"
            defpackage.vs.k(r8)
            return r0
        L27:
            if (r2 != 0) goto L2a
            return r0
        L2a:
            long r0 = r8.f
            r2 = 1
            long r0 = r0 + r2
            bz0 r2 = r8.a
            boolean r0 = r2.request(r0)
            if (r0 != 0) goto L3a
            r8 = -1
            return r8
        L3a:
            e5a r0 = r8.c
            if (r0 != 0) goto L48
            e5a r0 = r4.a
            if (r0 == 0) goto L48
            r8.c = r0
            int r0 = r0.b
            r8.d = r0
        L48:
            long r0 = r4.b
            long r2 = r8.f
            long r0 = r0 - r2
            long r6 = java.lang.Math.min(r10, r0)
            my0 r2 = r8.b
            long r4 = r8.f
            r3 = r9
            r2.C(r3, r4, r6)
            long r9 = r8.f
            long r9 = r9 + r6
            r8.f = r9
            return r6
        L5f:
            java.lang.String r8 = "closed"
            defpackage.vs.k(r8)
            return r0
        L65:
            java.lang.String r8 = "byteCount < 0: "
            java.lang.String r8 = defpackage.hl5.k(r10, r8)
            defpackage.p1a.k(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.et8.read(my0, long):long");
    }

    @Override // defpackage.osa
    public final dac timeout() {
        return this.a.timeout();
    }
}
