package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u99  reason: default package */
/* loaded from: classes3.dex */
public final class u99 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final String d;
    public final boolean e;
    public final List f;
    public final Set g;

    public u99(boolean z, boolean z2, String str, String str2, boolean z3, List list, Set set) {
        list.getClass();
        set.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = z3;
        this.f = list;
        this.g = set;
    }

    public static u99 a(u99 u99Var, boolean z, boolean z2, String str, String str2, boolean z3, List list, int i) {
        if ((i & 1) != 0) {
            z = u99Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = u99Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            str = u99Var.c;
        }
        String str3 = str;
        if ((i & 8) != 0) {
            str2 = u99Var.d;
        }
        String str4 = str2;
        if ((i & 16) != 0) {
            z3 = u99Var.e;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            list = u99Var.f;
        }
        List list2 = list;
        Set set = u99Var.g;
        u99Var.getClass();
        str3.getClass();
        list2.getClass();
        set.getClass();
        return new u99(z4, z5, str3, str4, z6, list2, set);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u99) {
                u99 u99Var = (u99) obj;
                if (this.a != u99Var.a || this.b != u99Var.b || !this.c.equals(u99Var.c) || !this.d.equals(u99Var.d) || this.e != u99Var.e || !c16.i(this.f, u99Var.f) || !c16.i(this.g, u99Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + eub.l(eub.k(eub.j(eub.j(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("PublicConversationListState(isLoading=", this.a, ", isError=", this.b, ", searchKeyword=");
        nk2.C(p, this.c, ", currentUserId=", this.d, ", isAdmin=");
        p.append(this.e);
        p.append(", conversations=");
        p.append(this.f);
        p.append(", processingConversationIds=");
        p.append(this.g);
        p.append(")");
        return p.toString();
    }
}
