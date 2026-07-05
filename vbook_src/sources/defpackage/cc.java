package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cc  reason: default package */
/* loaded from: classes.dex */
public final class cc {
    public static final cc c = new cc(0, 0);
    public static final cc d = new cc(1, 1);
    public final int a;
    public final int b;

    public cc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!cc.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        cc ccVar = (cc) obj;
        if (this.a == ccVar.a && this.b == ccVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Alignment(horizontal=" + ((Object) ac.b(this.a)) + ", vertical=" + ((Object) bc.b(this.b)) + ')';
    }
}
