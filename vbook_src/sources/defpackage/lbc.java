package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lbc  reason: default package */
/* loaded from: classes3.dex */
public final class lbc implements mo3 {
    public final String a;

    public lbc(String str) {
        str.getClass();
        this.a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    @Override // defpackage.mo3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.so3 a(defpackage.so3 r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.Set r0 = r8.c
            pm0 r1 = new pm0
            java.lang.String r7 = r7.a
            r1.<init>(r7)
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L37
            java.util.List r2 = r8.a
            if (r2 == 0) goto L1d
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L1d
            goto L36
        L1d:
            java.util.Iterator r2 = r2.iterator()
        L21:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            xl0 r3 = (defpackage.xl0) r3
            java.lang.String r3 = r3.a
            boolean r3 = defpackage.c16.i(r3, r7)
            if (r3 == 0) goto L21
            goto L37
        L36:
            return r8
        L37:
            if (r1 == 0) goto L44
            pm0 r1 = new pm0
            r1.<init>(r7)
            java.util.LinkedHashSet r7 = defpackage.fca.s(r0, r1)
        L42:
            r3 = r7
            goto L4e
        L44:
            pm0 r1 = new pm0
            r1.<init>(r7)
            java.util.LinkedHashSet r7 = defpackage.fca.w(r0, r1)
            goto L42
        L4e:
            boolean r7 = r3.isEmpty()
            if (r7 != 0) goto L57
            r7 = 0
        L55:
            r2 = r7
            goto L5a
        L57:
            java.lang.String r7 = r8.b
            goto L55
        L5a:
            r5 = 0
            r6 = 25
            r1 = 0
            r4 = 0
            r0 = r8
            so3 r7 = defpackage.so3.a(r0, r1, r2, r3, r4, r5, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lbc.a(so3):so3");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lbc) && c16.i(this.a, ((lbc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("ToggleBlockSelection(blockId=", pm0.a(this.a), ")");
    }
}
