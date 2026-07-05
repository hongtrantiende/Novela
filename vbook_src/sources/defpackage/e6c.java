package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e6c  reason: default package */
/* loaded from: classes3.dex */
public final class e6c {
    public final boolean a;
    public final boolean b;
    public final long c;
    public final long d;
    public final String e;
    public final eo4 f;

    public e6c(boolean z, boolean z2, long j, long j2, String str, eo4 eo4Var) {
        eo4Var.getClass();
        this.a = z;
        this.b = z2;
        this.c = j;
        this.d = j2;
        this.e = str;
        this.f = eo4Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof e6c) {
                e6c e6cVar = (e6c) obj;
                if (this.a != e6cVar.a || this.b != e6cVar.b || !zl1.c(this.c, e6cVar.c) || !zl1.c(this.d, e6cVar.d) || !this.e.equals(e6cVar.e) || !c16.i(this.f, e6cVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int k = eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
        int i = zl1.j;
        return this.f.hashCode() + eub.j(hl5.c(hl5.c(k, this.c, 31), this.d, 31), 31, this.e);
    }

    public final String toString() {
        String i = zl1.i(this.c);
        String i2 = zl1.i(this.d);
        StringBuilder p = rs8.p("ThemeConfigState(isUseAppColor=", this.a, ", darkMode=", this.b, ", textColor=");
        nk2.C(p, i, ", backgroundColor=", i2, ", backgroundImagePath=");
        p.append(this.e);
        p.append(", fontFamily=");
        p.append(this.f);
        p.append(")");
        return p.toString();
    }
}
