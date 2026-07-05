package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ac  reason: default package */
/* loaded from: classes.dex */
public final class ac {
    public final int a;

    public /* synthetic */ ac(int i) {
        this.a = i;
    }

    public static final /* synthetic */ ac a(int i) {
        return new ac(i);
    }

    public static String b(int i) {
        return "Horizontal(value=" + i + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ac) {
            if (this.a != ((ac) obj).a) {
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
