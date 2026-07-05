package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hi8  reason: default package */
/* loaded from: classes3.dex */
public final class hi8 {
    public final r13 a;
    public final nn b;
    public final float c;
    public final float d;

    public hi8(r13 r13Var, nn nnVar, float f, float f2) {
        r13Var.getClass();
        nnVar.getClass();
        this.a = r13Var;
        this.b = nnVar;
        this.c = f;
        this.d = f2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hi8) {
                hi8 hi8Var = (hi8) obj;
                if (!c16.i(this.a, hi8Var.a) || !c16.i(this.b, hi8Var.b) || !rg3.b(this.c, hi8Var.c) || !rg3.b(this.d, hi8Var.d)) {
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
        return Float.hashCode(this.d) + nk2.d(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        String c = rg3.c(this.c);
        String c2 = rg3.c(this.d);
        StringBuilder sb = new StringBuilder("PageLayout(density=");
        sb.append(this.a);
        sb.append(", textMeasurer=");
        sb.append(this.b);
        sb.append(", width=");
        return nk2.w(sb, c, ", height=", c2, ")");
    }
}
