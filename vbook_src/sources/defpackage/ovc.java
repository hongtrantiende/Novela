package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ovc  reason: default package */
/* loaded from: classes3.dex */
public final class ovc implements qid {
    public final qid a;
    public final qid b;

    public ovc(qid qidVar, qid qidVar2) {
        this.a = qidVar;
        this.b = qidVar2;
    }

    @Override // defpackage.qid
    public final int a(r13 r13Var) {
        return Math.max(this.a.a(r13Var), this.b.a(r13Var));
    }

    @Override // defpackage.qid
    public final int b(r13 r13Var, tc6 tc6Var) {
        return Math.max(this.a.b(r13Var, tc6Var), this.b.b(r13Var, tc6Var));
    }

    @Override // defpackage.qid
    public final int c(r13 r13Var) {
        return Math.max(this.a.c(r13Var), this.b.c(r13Var));
    }

    @Override // defpackage.qid
    public final int d(r13 r13Var, tc6 tc6Var) {
        return Math.max(this.a.d(r13Var, tc6Var), this.b.d(r13Var, tc6Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovc)) {
            return false;
        }
        ovc ovcVar = (ovc) obj;
        if (c16.i(ovcVar.a, this.a) && c16.i(ovcVar.b, this.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return "(" + this.a + " ∪ " + this.b + ")";
    }
}
