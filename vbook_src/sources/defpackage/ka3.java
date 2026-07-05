package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ka3  reason: default package */
/* loaded from: classes3.dex */
public final class ka3 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public ka3(boolean z, boolean z2, boolean z3, boolean z4, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
    }

    public static ka3 a(ka3 ka3Var, boolean z, boolean z2, boolean z3, List list, int i) {
        if ((i & 1) != 0) {
            z = ka3Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = ka3Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = ka3Var.c;
        }
        boolean z6 = z3;
        boolean z7 = ka3Var.d;
        if ((i & 16) != 0) {
            list = ka3Var.e;
        }
        List list2 = list;
        ka3Var.getClass();
        list2.getClass();
        return new ka3(z4, z5, z6, z7, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka3)) {
            return false;
        }
        ka3 ka3Var = (ka3) obj;
        if (this.a == ka3Var.a && this.b == ka3Var.b && this.c == ka3Var.c && this.d == ka3Var.d && c16.i(this.e, ka3Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder p = rs8.p("DiscussTopicState(isLoading=", this.a, ", isError=", this.b, ", isSearchMode=");
        rs8.z(p, this.c, ", hasMore=", this.d, ", topicList=");
        return rs8.n(p, this.e, ")");
    }
}
