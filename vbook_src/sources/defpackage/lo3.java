package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lo3  reason: default package */
/* loaded from: classes3.dex */
public final class lo3 {
    public final String a;
    public final fxb b;
    public final Set c;
    public final Set d;

    public lo3(String str, fxb fxbVar, Set set, Set set2) {
        set2.getClass();
        this.a = str;
        this.b = fxbVar;
        this.c = set;
        this.d = set2;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            goto L43
        L4:
            boolean r1 = r5 instanceof defpackage.lo3
            r2 = 0
            if (r1 != 0) goto La
            goto L42
        La:
            lo3 r5 = (defpackage.lo3) r5
            java.lang.String r1 = r5.a
            java.lang.String r3 = r4.a
            if (r3 != 0) goto L18
            if (r1 != 0) goto L16
            r1 = r0
            goto L1f
        L16:
            r1 = r2
            goto L1f
        L18:
            if (r1 != 0) goto L1b
            goto L16
        L1b:
            boolean r1 = r3.equals(r1)
        L1f:
            if (r1 != 0) goto L22
            goto L42
        L22:
            fxb r1 = r4.b
            fxb r3 = r5.b
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L2d
            goto L42
        L2d:
            java.util.Set r1 = r4.c
            java.util.Set r3 = r5.c
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L38
            goto L42
        L38:
            java.util.Set r4 = r4.d
            java.util.Set r5 = r5.d
            boolean r4 = defpackage.c16.i(r4, r5)
            if (r4 != 0) goto L43
        L42:
            return r2
        L43:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo3.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        fxb fxbVar = this.b;
        if (fxbVar != null) {
            i = Long.hashCode(fxbVar.a);
        }
        return this.d.hashCode() + s21.b(this.c, (i2 + i) * 31, 31);
    }

    public final String toString() {
        String a;
        String str = this.a;
        if (str == null) {
            a = "null";
        } else {
            a = pm0.a(str);
        }
        return "EditingUiState(focusedBlockId=" + a + ", focusedTextSelection=" + this.b + ", focusedPendingStyles=" + this.c + ", selectedBlockIds=" + this.d + ")";
    }
}
