package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vg3  reason: default package */
/* loaded from: classes.dex */
public final class vg3 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof vg3) && rg3.b(10.0f, 10.0f) && rg3.b(40.0f, 40.0f) && rg3.b(10.0f, 10.0f) && rg3.b(40.0f, 40.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + nk2.d(40.0f, nk2.d(10.0f, nk2.d(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        String c = rg3.c(10.0f);
        String c2 = rg3.c(40.0f);
        return nk2.w(nk2.y("DpTouchBoundsExpansion(start=", c, ", top=", c2, ", end="), rg3.c(10.0f), ", bottom=", rg3.c(40.0f), ", isLayoutDirectionAware=true)");
    }
}
