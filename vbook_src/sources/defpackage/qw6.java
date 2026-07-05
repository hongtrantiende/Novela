package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qw6  reason: default package */
/* loaded from: classes.dex */
public final class qw6 {
    public final String a;
    public final pj b;
    public final mw6 c;

    public qw6(String str) {
        str.getClass();
        this.a = str;
        this.b = pj.a;
        this.c = mw6.c;
    }

    public final boolean a(mw6 mw6Var) {
        if (mw6Var.compareTo(this.c) >= 0) {
            return true;
        }
        return false;
    }

    public final void b(mw6 mw6Var, vt4 vt4Var) {
        if (a(mw6Var)) {
            this.b.getClass();
            pj.a(mw6Var, this.a, (String) vt4Var.invoke());
        }
    }

    public final void c(mw6 mw6Var, String str) {
        if (a(mw6Var)) {
            this.b.getClass();
            pj.a(mw6Var, this.a, str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qw6.class == obj.getClass()) {
            return c16.i(this.a, ((qw6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Logger(tag='" + this.a + "', level=" + this.c + ", pipeline=" + this.b + ')';
    }
}
