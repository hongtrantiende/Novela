package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ft9  reason: default package */
/* loaded from: classes.dex */
public final class ft9 {
    public final long a = zl1.i;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft9)) {
            return false;
        }
        if (zl1.c(this.a, ((ft9) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.a) * 961;
    }

    public final String toString() {
        return hl5.n("RippleConfiguration(color=", zl1.i(this.a), ", focus=null, rippleAlpha=null)");
    }
}
