package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g5b  reason: default package */
/* loaded from: classes.dex */
public final class g5b extends IllegalStateException {
    public final int a;
    public final int b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g5b(int r3, int r4) {
        /*
            r2 = this;
            java.lang.String r0 = " ms"
            if (r3 == 0) goto L31
            r1 = 1
            if (r3 == r1) goto L2a
            r1 = 2
            if (r3 == r1) goto L23
            r1 = 3
            if (r3 == r1) goto L1c
            r1 = 4
            if (r3 != r1) goto L17
            java.lang.String r1 = "Player stuck suppressed for "
            java.lang.String r0 = defpackage.hl5.l(r1, r0, r4)
            goto L37
        L17:
            defpackage.vm1.d()
            r2 = 0
            throw r2
        L1c:
            java.lang.String r1 = "Player stuck playing without ending for "
            java.lang.String r0 = defpackage.hl5.l(r1, r0, r4)
            goto L37
        L23:
            java.lang.String r1 = "Player stuck playing with no progress for "
            java.lang.String r0 = defpackage.hl5.l(r1, r0, r4)
            goto L37
        L2a:
            java.lang.String r1 = "Player stuck buffering with no progress for "
            java.lang.String r0 = defpackage.hl5.l(r1, r0, r4)
            goto L37
        L31:
            java.lang.String r1 = "Player stuck buffering and not loading for "
            java.lang.String r0 = defpackage.hl5.l(r1, r0, r4)
        L37:
            r2.<init>(r0)
            r2.a = r3
            r2.b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g5b.<init>(int, int):void");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g5b.class == obj.getClass()) {
                g5b g5bVar = (g5b) obj;
                if (this.a == g5bVar.a && this.b == g5bVar.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((527 + this.a) * 31) + this.b;
    }
}
