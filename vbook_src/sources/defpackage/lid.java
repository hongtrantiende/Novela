package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lid  reason: default package */
/* loaded from: classes3.dex */
public final class lid {
    public final long a;
    public final int b;
    public final int c;

    public lid(long j) {
        this.a = j;
        int A = k27.A((ug3.b(j) + 30.0f) / 70.0f);
        this.b = A < 1 ? 1 : A;
        int A2 = k27.A((ug3.a(j) + 30.0f) / 70.0f);
        this.c = A2 >= 1 ? A2 : 1;
    }

    public final float a() {
        return iue.H((ug3.a(this.a) - 16.0f) - 16.0f, 24.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lid) && this.a == ((lid) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return hl5.n("WidgetMetrics(size=", ug3.c(this.a), ")");
    }
}
