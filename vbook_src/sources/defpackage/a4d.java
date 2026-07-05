package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a4d  reason: default package */
/* loaded from: classes.dex */
public final class a4d implements qid {
    public final String a;
    public final hm8 b;

    public a4d(jx5 jx5Var, String str) {
        this.a = str;
        this.b = yae.z(jx5Var);
    }

    @Override // defpackage.qid
    public final int a(r13 r13Var) {
        return e().b;
    }

    @Override // defpackage.qid
    public final int b(r13 r13Var, tc6 tc6Var) {
        return e().c;
    }

    @Override // defpackage.qid
    public final int c(r13 r13Var) {
        return e().d;
    }

    @Override // defpackage.qid
    public final int d(r13 r13Var, tc6 tc6Var) {
        return e().a;
    }

    public final jx5 e() {
        return (jx5) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a4d)) {
            return false;
        }
        return c16.i(e(), ((a4d) obj).e());
    }

    public final void f(jx5 jx5Var) {
        this.b.setValue(jx5Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        int i = e().a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(i);
        sb.append(", top=");
        sb.append(i2);
        a82.t(i3, i4, ", right=", ", bottom=", sb);
        sb.append(")");
        return sb.toString();
    }
}
