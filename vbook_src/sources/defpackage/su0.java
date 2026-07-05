package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: su0  reason: default package */
/* loaded from: classes.dex */
public final class su0 implements ou0 {
    public final r13 a;
    public final long b;

    public su0(p6b p6bVar, long j) {
        this.a = p6bVar;
        this.b = j;
    }

    @Override // defpackage.ou0
    public final nq7 a(nq7 nq7Var, dc dcVar) {
        return nq7Var.a0(new au0(dcVar, false));
    }

    @Override // defpackage.ou0
    public final nq7 b() {
        return new au0(kh5.e, true);
    }

    public final float c() {
        long j = this.b;
        if (x02.d(j)) {
            return this.a.y0(x02.h(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final float d() {
        long j = this.b;
        if (x02.e(j)) {
            return this.a.y0(x02.i(j));
        }
        return Float.POSITIVE_INFINITY;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof su0) {
                su0 su0Var = (su0) obj;
                if (!c16.i(this.a, su0Var.a) || !x02.c(this.b, su0Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String m = x02.m(this.b);
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + m + ")";
    }
}
