package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ix5  reason: default package */
/* loaded from: classes3.dex */
public final class ix5 implements rh8 {
    public final qid a;
    public final r13 b;

    public ix5(qid qidVar, r13 r13Var) {
        this.a = qidVar;
        this.b = r13Var;
    }

    @Override // defpackage.rh8
    public final float a() {
        qid qidVar = this.a;
        r13 r13Var = this.b;
        return r13Var.y0(qidVar.c(r13Var));
    }

    @Override // defpackage.rh8
    public final float b(tc6 tc6Var) {
        qid qidVar = this.a;
        r13 r13Var = this.b;
        return r13Var.y0(qidVar.d(r13Var, tc6Var));
    }

    @Override // defpackage.rh8
    public final float c(tc6 tc6Var) {
        qid qidVar = this.a;
        r13 r13Var = this.b;
        return r13Var.y0(qidVar.b(r13Var, tc6Var));
    }

    @Override // defpackage.rh8
    public final float d() {
        qid qidVar = this.a;
        r13 r13Var = this.b;
        return r13Var.y0(qidVar.a(r13Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ix5)) {
            return false;
        }
        ix5 ix5Var = (ix5) obj;
        if (c16.i(this.a, ix5Var.a) && c16.i(this.b, ix5Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.a + ", density=" + this.b + ")";
    }
}
