package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f6c  reason: default package */
/* loaded from: classes3.dex */
public final class f6c {
    public final int a;
    public final double b;
    public final float c;
    public final float d;
    public final eo4 e;

    public f6c(int i, double d, float f, float f2, eo4 eo4Var) {
        eo4Var.getClass();
        this.a = i;
        this.b = d;
        this.c = f;
        this.d = f2;
        this.e = eo4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f6c)) {
            return false;
        }
        f6c f6cVar = (f6c) obj;
        if (this.a == f6cVar.a && Double.compare(this.b, f6cVar.b) == 0 && Float.compare(this.c, f6cVar.c) == 0 && Float.compare(this.d, f6cVar.d) == 0 && c16.i(this.e, f6cVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Double.hashCode(this.b);
        return this.e.hashCode() + nk2.d(this.d, nk2.d(this.c, (hashCode + (Integer.hashCode(this.a) * 31)) * 31, 31), 31);
    }

    public final String toString() {
        return "ThemeMetricState(style=" + this.a + ", contrastLevel=" + this.b + ", fontScale=" + this.c + ", densityScale=" + this.d + ", fontFamily=" + this.e + ")";
    }
}
