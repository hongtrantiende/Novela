package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ce1  reason: default package */
/* loaded from: classes3.dex */
public final class ce1 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final List g;

    public ce1(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = list;
    }

    public static ce1 a(ce1 ce1Var, boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, List list, int i) {
        if ((i & 1) != 0) {
            z = ce1Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = ce1Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = ce1Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = ce1Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            str = ce1Var.e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = ce1Var.f;
        }
        String str4 = str2;
        if ((i & 64) != 0) {
            list = ce1Var.g;
        }
        List list2 = list;
        ce1Var.getClass();
        str4.getClass();
        list2.getClass();
        return new ce1(z5, z6, z7, z8, str3, str4, list2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ce1) {
                ce1 ce1Var = (ce1) obj;
                if (this.a != ce1Var.a || this.b != ce1Var.b || this.c != ce1Var.c || this.d != ce1Var.d || !this.e.equals(ce1Var.e) || !this.f.equals(ce1Var.f) || !c16.i(this.g, ce1Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.g.hashCode() + eub.j(eub.j(eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder p = rs8.p("ChatConversationState(isLoading=", this.a, ", isError=", this.b, ", isLoadingMore=");
        rs8.z(p, this.c, ", hasMore=", this.d, ", currentUserId=");
        nk2.C(p, this.e, ", searchKeyword=", this.f, ", conversations=");
        return rs8.n(p, this.g, ")");
    }
}
