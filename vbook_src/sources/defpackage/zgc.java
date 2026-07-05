package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: zgc  reason: default package */
/* loaded from: classes3.dex */
public final class zgc implements lz7 {
    public static final ygc Companion = new Object();
    public final int a;

    public /* synthetic */ zgc(int i, int i2) {
        if (1 == (i & 1)) {
            this.a = i2;
        } else {
            w92.x(i, 1, xgc.a.e());
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof zgc) && this.a == ((zgc) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return hl5.l("TopicDetailRoute(id=", ")", this.a);
    }

    public zgc(int i) {
        this.a = i;
    }
}
