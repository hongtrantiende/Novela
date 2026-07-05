package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kh8  reason: default package */
/* loaded from: classes3.dex */
public final class kh8 implements xh1 {
    public final Class a;

    public kh8(Class cls) {
        cls.getClass();
        this.a = cls;
    }

    @Override // defpackage.xh1
    public final Class c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof kh8) {
            if (c16.i(this.a, ((kh8) obj).a)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
