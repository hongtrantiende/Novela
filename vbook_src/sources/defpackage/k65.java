package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k65  reason: default package */
/* loaded from: classes.dex */
public final class k65 implements l65 {
    public final long b = zl1.b(0.38f, zl1.e);
    public final int c = 12;

    @Override // defpackage.l65
    public final int D() {
        return this.c;
    }

    @Override // defpackage.l65
    public final long a() {
        return this.b;
    }

    @Override // defpackage.l65
    public final sv9 b(qd6 qd6Var, jfa jfaVar, tv9 tv9Var) {
        tv9Var.getClass();
        return null;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof k65) {
                k65 k65Var = (k65) obj;
                if (zl1.c(this.b, k65Var.b) && this.c == k65Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Integer.hashCode(this.c) + (Long.hashCode(this.b) * 31);
    }

    public final String toString() {
        return hl5.o("Plain(color=", zl1.i(this.b), ", blendMode=", vl0.a(this.c), ")");
    }
}
