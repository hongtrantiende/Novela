package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ia4  reason: default package */
/* loaded from: classes.dex */
public final class ia4 {
    public final oaa a;
    public final ja4 b;
    public final ka4 c;

    public ia4(oaa oaaVar, ja4 ja4Var, ka4 ka4Var) {
        this.a = oaaVar;
        this.b = ja4Var;
        this.c = ka4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ia4) {
                ia4 ia4Var = (ia4) obj;
                if (this.a == ia4Var.a && this.b.equals(ia4Var.b) && this.c.equals(ia4Var.c)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "FBDescription(titleInfo=" + this.a + ", documentInfo=" + this.b + ", publishInfo=" + this.c + ")";
    }
}
