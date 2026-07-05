package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g79  reason: default package */
/* loaded from: classes.dex */
public final class g79 {
    public static final g79 d = new g79(nae.e, new jk1(nae.e, nae.e), 0);
    public final float a;
    public final jk1 b;
    public final int c;

    public g79(float f, jk1 jk1Var, int i) {
        this.a = f;
        this.b = jk1Var;
        this.c = i;
        if (!Float.isNaN(f)) {
            return;
        }
        vs.m("current must not be NaN");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g79) {
                g79 g79Var = (g79) obj;
                if (this.a == g79Var.a && c16.i(this.b, g79Var.b) && this.c == g79Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return rs8.g(this.c, ")", sb);
    }
}
