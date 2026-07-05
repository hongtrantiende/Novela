package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rp  reason: default package */
/* loaded from: classes.dex */
public final class rp implements qid {
    public final int a;
    public final String b;
    public final hm8 c = yae.z(cx5.e);
    public final hm8 d = yae.z(Boolean.TRUE);

    public rp(int i, String str) {
        this.a = i;
        this.b = str;
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

    public final cx5 e() {
        return (cx5) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rp) {
                if (this.a == ((rp) obj).a) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(tjd tjdVar, int i) {
        int i2 = this.a;
        if (i != 0 && (i & i2) == 0) {
            return;
        }
        this.c.setValue(tjdVar.a.i(i2));
        f(tjdVar.a.u(i2));
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        int i = e().a;
        int i2 = e().b;
        int i3 = e().c;
        int i4 = e().d;
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        a82.t(i3, i4, ", ", ", ", sb);
        sb.append(")");
        return sb.toString();
    }
}
