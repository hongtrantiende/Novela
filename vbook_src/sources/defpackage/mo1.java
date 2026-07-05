package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mo1  reason: default package */
/* loaded from: classes.dex */
public final class mo1 implements xy4 {
    public final xy4 a;
    public final xy4 b;

    public mo1(xy4 xy4Var, xy4 xy4Var2) {
        this.a = xy4Var;
        this.b = xy4Var2;
    }

    @Override // defpackage.xy4
    public final Object a(Object obj, lu4 lu4Var) {
        return this.b.a(this.a.a(obj, lu4Var), lu4Var);
    }

    @Override // defpackage.xy4
    public final boolean b(xt4 xt4Var) {
        if (!this.a.b(xt4Var) && !this.b.b(xt4Var)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.xy4
    public final boolean c() {
        if (this.a.c() && this.b.c()) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof mo1) {
            mo1 mo1Var = (mo1) obj;
            if (this.a.equals(mo1Var.a) && c16.i(this.b, mo1Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public final String toString() {
        return s21.p(new StringBuilder("["), (String) a("", np.N), ']');
    }
}
