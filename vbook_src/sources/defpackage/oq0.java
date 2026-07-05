package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oq0  reason: default package */
/* loaded from: classes3.dex */
public final class oq0 {
    public final List a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public oq0(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    public static oq0 a(oq0 oq0Var, List list, boolean z, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            list = oq0Var.a;
        }
        if ((i & 2) != 0) {
            z = oq0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = oq0Var.c;
        }
        if ((i & 8) != 0) {
            z3 = oq0Var.d;
        }
        oq0Var.getClass();
        list.getClass();
        return new oq0(list, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oq0)) {
            return false;
        }
        oq0 oq0Var = (oq0) obj;
        if (c16.i(this.a, oq0Var.a) && this.b == oq0Var.b && this.c == oq0Var.c && this.d == oq0Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.k(eub.k(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "BookPickerState(books=" + this.a + ", isLoading=" + this.b + ", isLoadingMore=" + this.c + ", hasMore=" + this.d + ")";
    }
}
