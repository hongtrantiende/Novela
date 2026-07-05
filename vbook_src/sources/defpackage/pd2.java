package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pd2  reason: default package */
/* loaded from: classes.dex */
public final class pd2 {
    public final int a;
    public final int b;
    public final String c;

    public pd2(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof pd2) {
                pd2 pd2Var = (pd2) obj;
                if (this.a != pd2Var.a || this.b != pd2Var.b || !this.c.equals(pd2Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return s21.q(hl5.r(this.a, this.b, "CtrlSimple(extraBytes=", ", extraHchar=", ", emit="), this.c, ")");
    }
}
