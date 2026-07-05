package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ob3  reason: default package */
/* loaded from: classes.dex */
public final class ob3 {
    public final float a;
    public final t79 b;
    public final t79 c;

    public ob3(float f, t79 t79Var, t79 t79Var2) {
        this.a = f;
        this.b = t79Var;
        this.c = t79Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ob3) {
                ob3 ob3Var = (ob3) obj;
                if (Float.compare(this.a, ob3Var.a) != 0 || !this.b.equals(ob3Var.b) || !this.c.equals(ob3Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "DistanceVertex(distance=" + this.a + ", f1=" + this.b + ", f2=" + this.c + ')';
    }
}
