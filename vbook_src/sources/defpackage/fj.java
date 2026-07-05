package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fj  reason: default package */
/* loaded from: classes.dex */
public final class fj implements rx8 {
    public final int a;

    public fj(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof fj) && this.a == ((fj) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("AndroidFontResolveInterceptor(fontWeightAdjustment=", ")", this.a);
    }
}
