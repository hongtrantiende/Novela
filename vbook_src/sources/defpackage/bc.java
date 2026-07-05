package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bc  reason: default package */
/* loaded from: classes.dex */
public final class bc {
    public final int a;

    public /* synthetic */ bc(int i) {
        this.a = i;
    }

    public static final /* synthetic */ bc a(int i) {
        return new bc(i);
    }

    public static String b(int i) {
        return "Vertical(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bc) {
            if (this.a != ((bc) obj).a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return b(this.a);
    }
}
