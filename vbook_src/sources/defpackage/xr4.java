package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xr4  reason: default package */
/* loaded from: classes3.dex */
public final class xr4 {
    public final uy5 a;
    public final float b;
    public final long c;
    public final int d;

    public xr4(uy5 uy5Var, float f, long j, int i) {
        uy5Var.getClass();
        this.a = uy5Var;
        this.b = f;
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xr4) {
                xr4 xr4Var = (xr4) obj;
                if (!c16.i(this.a, xr4Var.a) || Float.compare(this.b, xr4Var.b) != 0 || !zy5.b(this.c, xr4Var.c) || this.d != xr4Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + hl5.c(nk2.d(this.b, this.a.hashCode() * 31, 31), this.c, 31);
    }

    public final String toString() {
        String c = zy5.c(this.c);
        return "FragmentKey(rect=" + this.a + ", zoom=" + this.b + ", pageSize=" + c + ", generation=" + this.d + ")";
    }
}
