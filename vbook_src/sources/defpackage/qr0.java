package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qr0  reason: default package */
/* loaded from: classes3.dex */
public final class qr0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final List e;

    public qr0(boolean z, boolean z2, boolean z3, boolean z4, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = list;
    }

    public static qr0 a(qr0 qr0Var, boolean z, boolean z2, boolean z3, List list, int i) {
        if ((i & 1) != 0) {
            z = qr0Var.a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            z2 = qr0Var.b;
        }
        boolean z5 = z2;
        if ((i & 4) != 0) {
            z3 = qr0Var.c;
        }
        boolean z6 = z3;
        boolean z7 = qr0Var.d;
        if ((i & 16) != 0) {
            list = qr0Var.e;
        }
        List list2 = list;
        qr0Var.getClass();
        list2.getClass();
        return new qr0(z4, z5, z6, z7, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr0)) {
            return false;
        }
        qr0 qr0Var = (qr0) obj;
        if (this.a == qr0Var.a && this.b == qr0Var.b && this.c == qr0Var.c && this.d == qr0Var.d && c16.i(this.e, qr0Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder p = rs8.p("BookTopicState(isLoading=", this.a, ", isError=", this.b, ", isSearchMode=");
        rs8.z(p, this.c, ", hasMore=", this.d, ", bookList=");
        return rs8.n(p, this.e, ")");
    }
}
