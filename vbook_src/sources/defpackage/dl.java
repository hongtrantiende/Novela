package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dl  reason: default package */
/* loaded from: classes3.dex */
public final class dl implements im9 {
    @Override // defpackage.im9
    public final jm9 a(g7b g7bVar, bq5 bq5Var) {
        g7bVar.getClass();
        bq5Var.getClass();
        return new fl(g7bVar, bq5Var, g7bVar.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006d  */
    @Override // defpackage.im9
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean b(java.lang.String r2) {
        /*
            r1 = this;
            r2.getClass()
            java.lang.String r1 = "image/"
            r0 = 0
            boolean r1 = defpackage.r4b.Q(r2, r1, r0)
            if (r1 != 0) goto Lf
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        Lf:
            int r1 = r2.hashCode()
            switch(r1) {
                case -1487656890: goto L73;
                case -1487464693: goto L5e;
                case -1487464690: goto L55;
                case -1487394660: goto L49;
                case -1487018032: goto L40;
                case -879272239: goto L34;
                case -879267568: goto L2b;
                case -879258763: goto L22;
                case -227171396: goto L18;
                default: goto L16;
            }
        L16:
            goto L85
        L18:
            java.lang.String r1 = "image/svg+xml"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3d
            goto L85
        L22:
            java.lang.String r1 = "image/png"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L52
            goto L85
        L2b:
            java.lang.String r1 = "image/gif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3d
            goto L85
        L34:
            java.lang.String r1 = "image/bmp"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L3d
            goto L85
        L3d:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L40:
            java.lang.String r1 = "image/webp"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L85
            goto L52
        L49:
            java.lang.String r1 = "image/jpeg"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L52
            goto L85
        L52:
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L55:
            java.lang.String r1 = "image/heif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L67
            goto L85
        L5e:
            java.lang.String r1 = "image/heic"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L67
            goto L85
        L67:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 27
            if (r1 < r2) goto L6e
            r0 = 1
        L6e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            return r1
        L73:
            java.lang.String r1 = "image/avif"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L7c
            goto L85
        L7c:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 35
            if (r1 > r2) goto L85
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L85:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dl.b(java.lang.String):java.lang.Boolean");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dl.class == obj.getClass()) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return cm9.a(dl.class).hashCode();
    }

    public final String toString() {
        return "AndroidRegionDecoder";
    }

    @Override // defpackage.im9
    public final void c() {
    }
}
