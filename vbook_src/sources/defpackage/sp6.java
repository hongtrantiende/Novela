package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sp6  reason: default package */
/* loaded from: classes3.dex */
public final class sp6 {
    public static final sp6 k = new sp6(false, null, null, "", true, null, null, null, false, false);
    public final boolean a;
    public final String b;
    public final xp6 c;
    public final String d;
    public final boolean e;
    public final String f;
    public final xp6 g;
    public final String h;
    public final boolean i;
    public final boolean j;

    public sp6(boolean z, String str, xp6 xp6Var, String str2, boolean z2, String str3, xp6 xp6Var2, String str4, boolean z3, boolean z4) {
        this.a = z;
        this.b = str;
        this.c = xp6Var;
        this.d = str2;
        this.e = z2;
        this.f = str3;
        this.g = xp6Var2;
        this.h = str4;
        this.i = z3;
        this.j = z4;
    }

    public static sp6 a(sp6 sp6Var, String str) {
        boolean z = sp6Var.a;
        xp6 xp6Var = sp6Var.c;
        String str2 = sp6Var.d;
        boolean z2 = sp6Var.e;
        String str3 = sp6Var.f;
        xp6 xp6Var2 = sp6Var.g;
        String str4 = sp6Var.h;
        boolean z3 = sp6Var.i;
        boolean z4 = sp6Var.j;
        sp6Var.getClass();
        return new sp6(z, str, xp6Var, str2, z2, str3, xp6Var2, str4, z3, z4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L5
            goto L78
        L5:
            boolean r1 = r5 instanceof defpackage.sp6
            r2 = 0
            if (r1 != 0) goto Lc
            goto L77
        Lc:
            sp6 r5 = (defpackage.sp6) r5
            boolean r1 = r4.a
            boolean r3 = r5.a
            if (r1 == r3) goto L16
            goto L77
        L16:
            java.lang.String r1 = r5.b
            java.lang.String r3 = r4.b
            if (r3 != 0) goto L22
            if (r1 != 0) goto L20
            r1 = r0
            goto L29
        L20:
            r1 = r2
            goto L29
        L22:
            if (r1 != 0) goto L25
            goto L20
        L25:
            boolean r1 = r3.equals(r1)
        L29:
            if (r1 != 0) goto L2c
            goto L77
        L2c:
            xp6 r1 = r4.c
            xp6 r3 = r5.c
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L37
            goto L77
        L37:
            java.lang.String r1 = r4.d
            java.lang.String r3 = r5.d
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L42
            goto L77
        L42:
            boolean r1 = r4.e
            boolean r3 = r5.e
            if (r1 == r3) goto L49
            goto L77
        L49:
            java.lang.String r1 = r4.f
            java.lang.String r3 = r5.f
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L54
            goto L77
        L54:
            xp6 r1 = r4.g
            xp6 r3 = r5.g
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L5f
            goto L77
        L5f:
            java.lang.String r1 = r4.h
            java.lang.String r3 = r5.h
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 != 0) goto L6a
            goto L77
        L6a:
            boolean r1 = r4.i
            boolean r3 = r5.i
            if (r1 == r3) goto L71
            goto L77
        L71:
            boolean r4 = r4.j
            boolean r5 = r5.j
            if (r4 == r5) goto L78
        L77:
            return r2
        L78:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sp6.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = Boolean.hashCode(this.a) * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 + hashCode) * 31;
        xp6 xp6Var = this.c;
        if (xp6Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = xp6Var.hashCode();
        }
        int k2 = eub.k(eub.j((i2 + hashCode2) * 31, 31, this.d), 31, this.e);
        String str2 = this.f;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i3 = (k2 + hashCode3) * 31;
        xp6 xp6Var2 = this.g;
        if (xp6Var2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = xp6Var2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        String str3 = this.h;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return Boolean.hashCode(this.j) + eub.k((i4 + i) * 31, 31, this.i);
    }

    public final String toString() {
        String a;
        String str = this.b;
        if (str == null) {
            a = "null";
        } else {
            a = pm0.a(str);
        }
        return "LinkState(canLink=" + this.a + ", focusedBlockId=" + a + ", target=" + this.c + ", targetText=" + this.d + ", selectionCollapsed=" + this.e + ", existingUrl=" + this.f + ", existingLinkRange=" + this.g + ", existingLinkText=" + this.h + ", isInsideLink=" + this.i + ", intersectsLink=" + this.j + ")";
    }
}
