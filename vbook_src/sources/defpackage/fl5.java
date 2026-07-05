package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fl5  reason: default package */
/* loaded from: classes.dex */
public final class fl5 {
    public final Object a;

    public fl5(Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof fl5) && ((fl5) obj).a == this.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }
}
