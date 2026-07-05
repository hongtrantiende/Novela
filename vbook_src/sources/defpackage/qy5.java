package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qy5  reason: default package */
/* loaded from: classes.dex */
public final class qy5 {
    public static final long b = uaf.e(0, 0);
    public static final /* synthetic */ int c = 0;
    public final long a;

    public /* synthetic */ qy5(long j) {
        this.a = j;
    }

    public static String a(long j) {
        StringBuilder sb = new StringBuilder("(");
        sb.append((int) (j >> 32));
        sb.append(", ");
        return hl5.p(sb, (int) (j & 4294967295L), ')');
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qy5) {
            if (this.a != ((qy5) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return a(this.a);
    }
}
