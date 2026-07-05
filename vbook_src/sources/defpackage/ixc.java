package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ixc  reason: default package */
/* loaded from: classes3.dex */
public final class ixc extends w68 {
    public final Integer c;
    public final Integer d;
    public final o89 e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ixc(java.lang.Integer r3, java.lang.Integer r4, defpackage.o89 r5, java.lang.String r6, boolean r7) {
        /*
            r2 = this;
            boolean r0 = r3.equals(r4)
            r1 = 0
            if (r0 == 0) goto L9
            r0 = r3
            goto La
        L9:
            r0 = r1
        La:
            r2.<init>(r0, r6)
            r2.c = r3
            r2.d = r4
            r2.e = r5
            r2.f = r7
            if (r0 == 0) goto L32
            ty5 r2 = new ty5
            r3 = 9
            r4 = 1
            r2.<init>(r4, r3, r4)
            int r3 = r0.intValue()
            if (r4 > r3) goto L2a
            int r2 = r2.b
            if (r3 > r2) goto L2a
            return
        L2a:
            java.lang.String r2 = "Invalid length for field "
            java.lang.String r3 = ": "
            defpackage.cy7.g(r2, r6, r3, r0)
            throw r1
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ixc.<init>(java.lang.Integer, java.lang.Integer, o89, java.lang.String, boolean):void");
    }

    @Override // defpackage.w68
    public final x68 a(int i, String str, Object obj, int i2) {
        Integer valueOf;
        Integer num = this.d;
        if (num != null && i2 - i > num.intValue()) {
            return new r95(num.intValue(), 5);
        }
        Integer num2 = this.c;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new r95(num2.intValue(), 4);
        }
        int i3 = 0;
        while (true) {
            if (i < i2) {
                i3 = (i3 * 10) + (str.charAt(i) - '0');
                if (i3 < 0) {
                    valueOf = null;
                    break;
                }
                i++;
            } else {
                valueOf = Integer.valueOf(i3);
                break;
            }
        }
        if (valueOf == null) {
            return tn3.E;
        }
        boolean z = this.f;
        int intValue = valueOf.intValue();
        if (z) {
            intValue = -intValue;
        }
        Object b = this.e.b(obj, Integer.valueOf(intValue));
        if (b == null) {
            return null;
        }
        return new fz5(b);
    }
}
