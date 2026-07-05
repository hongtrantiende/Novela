package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ft8  reason: default package */
/* loaded from: classes3.dex */
public final class ft8 implements ih9 {
    public final psa a;
    public final ly0 b;
    public d5a c;
    public int d;
    public boolean e;
    public long f;

    public ft8(psa psaVar) {
        int i;
        this.a = psaVar;
        ly0 b = psaVar.b();
        this.b = b;
        d5a d5aVar = b.a;
        this.c = d5aVar;
        if (d5aVar != null) {
            i = d5aVar.b;
        } else {
            i = -1;
        }
        this.d = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r3 == r5.b) goto L14;
     */
    @Override // defpackage.ih9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long M(defpackage.ly0 r12, long r13) {
        /*
            Method dump skipped, instructions count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ft8.M(ly0, long):long");
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.e = true;
    }
}
