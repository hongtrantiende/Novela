package defpackage;

import android.text.InputFilter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kq3  reason: default package */
/* loaded from: classes.dex */
public final class kq3 implements InputFilter {
    public final lw a;
    public jq3 b;

    public kq3(lw lwVar) {
        this.a = lwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L28;
     */
    @Override // android.text.InputFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence filter(java.lang.CharSequence r4, int r5, int r6, android.text.Spanned r7, int r8, int r9) {
        /*
            r3 = this;
            lw r0 = r3.a
            boolean r1 = r0.isInEditMode()
            if (r1 == 0) goto L9
            goto L48
        L9:
            cq3 r1 = defpackage.cq3.a()
            int r1 = r1.c()
            if (r1 == 0) goto L49
            r2 = 1
            if (r1 == r2) goto L1a
            r5 = 3
            if (r1 == r5) goto L49
            goto L48
        L1a:
            if (r9 != 0) goto L2b
            if (r8 != 0) goto L2b
            int r3 = r7.length()
            if (r3 != 0) goto L2b
            java.lang.CharSequence r3 = r0.getText()
            if (r4 != r3) goto L2b
            goto L48
        L2b:
            if (r4 == 0) goto L48
            if (r5 != 0) goto L36
            int r3 = r4.length()
            if (r6 != r3) goto L36
            goto L3a
        L36:
            java.lang.CharSequence r4 = r4.subSequence(r5, r6)
        L3a:
            cq3 r3 = defpackage.cq3.a()
            int r5 = r4.length()
            r6 = 0
            java.lang.CharSequence r3 = r3.g(r4, r6, r5, r6)
            return r3
        L48:
            return r4
        L49:
            cq3 r5 = defpackage.cq3.a()
            jq3 r6 = r3.b
            if (r6 != 0) goto L58
            jq3 r6 = new jq3
            r6.<init>(r0, r3)
            r3.b = r6
        L58:
            jq3 r3 = r3.b
            r5.h(r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kq3.filter(java.lang.CharSequence, int, int, android.text.Spanned, int, int):java.lang.CharSequence");
    }
}
