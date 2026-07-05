package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ux  reason: default package */
/* loaded from: classes.dex */
public final class ux implements uy4 {
    public final int a;

    public ux(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ux) && this.a == ((ux) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.p(new StringBuilder("AppWidgetId(appWidgetId="), this.a, ')');
    }
}
