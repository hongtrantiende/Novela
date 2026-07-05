package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xn4  reason: default package */
/* loaded from: classes3.dex */
public final class xn4 {
    public final boolean a;
    public final int b;
    public final boolean c;
    public final List d;
    public final List e;

    public xn4(boolean z, int i, boolean z2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = list;
        this.e = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.List] */
    public static xn4 a(xn4 xn4Var, int i, boolean z, ArrayList arrayList, ArrayList arrayList2, int i2) {
        boolean z2;
        if ((i2 & 1) != 0) {
            z2 = xn4Var.a;
        } else {
            z2 = false;
        }
        if ((i2 & 2) != 0) {
            i = xn4Var.b;
        }
        if ((i2 & 4) != 0) {
            z = xn4Var.c;
        }
        ArrayList arrayList3 = arrayList;
        if ((i2 & 8) != 0) {
            arrayList3 = xn4Var.d;
        }
        ArrayList arrayList4 = arrayList2;
        if ((i2 & 16) != 0) {
            arrayList4 = xn4Var.e;
        }
        ArrayList arrayList5 = arrayList4;
        xn4Var.getClass();
        arrayList3.getClass();
        arrayList5.getClass();
        ArrayList arrayList6 = arrayList3;
        boolean z3 = z;
        return new xn4(z2, i, z3, arrayList6, arrayList5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xn4)) {
            return false;
        }
        xn4 xn4Var = (xn4) obj;
        if (this.a == xn4Var.a && this.b == xn4Var.b && this.c == xn4Var.c && c16.i(this.d, xn4Var.d) && c16.i(this.e, xn4Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.l(eub.k(hl5.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FollowState(isLoading=");
        sb.append(this.a);
        sb.append(", shelfSize=");
        sb.append(this.b);
        sb.append(", isRefreshing=");
        sb.append(this.c);
        sb.append(", followBooks=");
        sb.append(this.d);
        sb.append(", notFollowBooks=");
        return rs8.n(sb, this.e, ")");
    }
}
