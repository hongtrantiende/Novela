package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mf9  reason: default package */
/* loaded from: classes.dex */
public final class mf9 {
    public final Class a;
    public final Class b;

    public mf9(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public static mf9 a(Class cls) {
        return new mf9(lf9.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mf9.class == obj.getClass()) {
            mf9 mf9Var = (mf9) obj;
            if (this.b.equals(mf9Var.b)) {
                return this.a.equals(mf9Var.a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.b;
        Class cls2 = this.a;
        if (cls2 == lf9.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
