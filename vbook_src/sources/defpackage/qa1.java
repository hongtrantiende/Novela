package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qa1  reason: default package */
/* loaded from: classes.dex */
public final class qa1 {
    public final nk0 a;
    public final xt4 b;
    public final gxa c;

    public qa1(nk0 nk0Var, xt4 xt4Var, gxa gxaVar) {
        this.a = nk0Var;
        this.b = xt4Var;
        this.c = gxaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof qa1) {
            qa1 qa1Var = (qa1) obj;
            if (this.a.equals(qa1Var.a) && this.b.equals(qa1Var.b) && this.c.equals(qa1Var.c)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        return Boolean.hashCode(true) + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChangeSize(alignment=" + this.a + ", size=" + this.b + ", animationSpec=" + this.c + ", clip=true)";
    }
}
