package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jb1  reason: default package */
/* loaded from: classes3.dex */
public final class jb1 {
    public static final ib1 b = new Object();
    public final Object a;

    public /* synthetic */ jb1(Object obj) {
        this.a = obj;
    }

    public static final Object a(Object obj) {
        if (!(obj instanceof ib1)) {
            return obj;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jb1) {
            if (!c16.i(this.a, ((jb1) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof hb1) {
            return ((hb1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
