package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mi8  reason: default package */
/* loaded from: classes.dex */
public final class mi8 {
    public final int a;
    public final float b;
    public final float c;
    public final uy5 d;

    public mi8(int i, float f, float f2, uy5 uy5Var) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = uy5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mi8) {
                mi8 mi8Var = (mi8) obj;
                if (this.a != mi8Var.a || Float.compare(this.b, mi8Var.b) != 0 || Float.compare(this.c, mi8Var.c) != 0 || !this.d.equals(mi8Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + nk2.d(this.c, nk2.d(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return "PagePosition(index=" + this.a + ", start=" + this.b + ", end=" + this.c + ", rect=" + this.d + ")";
    }
}
