package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a8  reason: default package */
/* loaded from: classes3.dex */
public final class a8 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public /* synthetic */ a8(int i) {
        this((i & 1) == 0, false, false, false, ks3.a);
    }

    public static a8 a(a8 a8Var, boolean z, boolean z2, boolean z3, boolean z4, List list, int i) {
        if ((i & 1) != 0) {
            z = a8Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = a8Var.b;
        }
        boolean z6 = z2;
        if ((i & 4) != 0) {
            z3 = a8Var.c;
        }
        boolean z7 = z3;
        if ((i & 8) != 0) {
            z4 = a8Var.d;
        }
        boolean z8 = z4;
        if ((i & 16) != 0) {
            list = a8Var.e;
        }
        List list2 = list;
        a8Var.getClass();
        list2.getClass();
        return new a8(z5, z6, z7, z8, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8)) {
            return false;
        }
        a8 a8Var = (a8) obj;
        if (this.a == a8Var.a && this.b == a8Var.b && this.c == a8Var.c && this.d == a8Var.d && c16.i(this.e, a8Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder p = rs8.p("AddConversationState(isLoading=", this.a, ", isError=", this.b, ", isCreating=");
        rs8.z(p, this.c, ", hasMore=", this.d, ", users=");
        return rs8.n(p, this.e, ")");
    }

    public a8(boolean z, boolean z2, boolean z3, boolean z4, List list) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
    }
}
