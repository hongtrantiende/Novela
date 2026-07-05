package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lk  reason: default package */
/* loaded from: classes.dex */
public final class lk implements w09 {
    public final int b;

    public lk(int i) {
        this.b = i;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (lk.class.equals(cls)) {
                obj.getClass();
                if (this.b != ((lk) obj).b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return hl5.l("AndroidPointerIcon(type=", ")", this.b);
    }
}
