package defpackage;

import android.graphics.LightingColorFilter;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: io6  reason: default package */
/* loaded from: classes.dex */
public final class io6 extends em1 {
    public final long b;
    public final long c;

    public io6(long j, long j2) {
        super(new LightingColorFilter(sve.x(j), sve.x(j2)));
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io6)) {
            return false;
        }
        io6 io6Var = (io6) obj;
        if (zl1.c(this.b, io6Var.b) && zl1.c(this.c, io6Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return hl5.o("LightingColorFilter(multiply=", zl1.i(this.b), ", add=", zl1.i(this.c), ")");
    }
}
