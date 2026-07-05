package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pt8  reason: default package */
/* loaded from: classes.dex */
public final class pt8 {
    public static final pt8 b;
    public final String a;

    static {
        pt8 pt8Var = new pt8("Notification");
        b = pt8Var;
        fk.a.put(pt8Var, new ek(33, "android.permission.POST_NOTIFICATIONS", 0, 12));
    }

    public pt8(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pt8) {
                if (!this.a.equals(((pt8) obj).a)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
