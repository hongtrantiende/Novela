package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p73  reason: default package */
/* loaded from: classes3.dex */
public final class p73 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final List f;

    public p73(boolean z, boolean z2, boolean z3, boolean z4, String str, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = list;
    }

    public static p73 a(p73 p73Var, boolean z, boolean z2, boolean z3, boolean z4, List list, int i) {
        if ((i & 2) != 0) {
            z2 = p73Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = p73Var.c;
        }
        boolean z6 = z3;
        if ((i & 8) != 0) {
            z4 = p73Var.d;
        }
        boolean z7 = z4;
        String str = p73Var.e;
        if ((i & 32) != 0) {
            list = p73Var.f;
        }
        List list2 = list;
        p73Var.getClass();
        list2.getClass();
        return new p73(z, z5, z6, z7, str, list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p73) {
                p73 p73Var = (p73) obj;
                if (this.a != p73Var.a || this.b != p73Var.b || this.c != p73Var.c || this.d != p73Var.d || !this.e.equals(p73Var.e) || !c16.i(this.f, p73Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + eub.j(eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder p = rs8.p("DiscoveryContentState(isLoading=", this.a, ", hasGenre=", this.b, ", hasExplore=");
        rs8.z(p, this.c, ", isError=", this.d, ", errorMessage=");
        p.append(this.e);
        p.append(", tabs=");
        p.append(this.f);
        p.append(")");
        return p.toString();
    }
}
