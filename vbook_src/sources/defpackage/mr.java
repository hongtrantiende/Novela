package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mr  reason: default package */
/* loaded from: classes.dex */
public final class mr {
    public final gi1 a;
    public final Object b;

    public mr(wz9 wz9Var) {
        gi1 a = cm9.a(wz9Var.getClass());
        Object key = wz9Var.getKey();
        this.a = a;
        this.b = key;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mr) {
                mr mrVar = (mr) obj;
                if (!c16.i(this.a, mrVar.a) || !c16.i(this.b, mrVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimatedSceneKey(clazz=" + this.a + ", key=" + this.b + ")";
    }
}
