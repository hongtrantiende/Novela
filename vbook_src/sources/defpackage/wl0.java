package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wl0  reason: default package */
/* loaded from: classes.dex */
public final class wl0 extends em1 {
    public final long b;
    public final int c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wl0(long r4, int r6) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L16
            defpackage.dm.j()
            int r0 = defpackage.sve.x(r4)
            android.graphics.BlendMode r1 = defpackage.ff.D(r6)
            android.graphics.BlendModeColorFilter r0 = defpackage.dm.a(r0, r1)
            goto L23
        L16:
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            int r1 = defpackage.sve.x(r4)
            android.graphics.PorterDuff$Mode r2 = defpackage.ff.F(r6)
            r0.<init>(r1, r2)
        L23:
            r3.<init>(r0)
            r3.b = r4
            r3.c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wl0.<init>(long, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wl0)) {
            return false;
        }
        wl0 wl0Var = (wl0) obj;
        if (zl1.c(this.b, wl0Var.b) && this.c == wl0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return hl5.o("BlendModeColorFilter(color=", zl1.i(this.b), ", blendMode=", vl0.a(this.c), ")");
    }
}
