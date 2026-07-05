package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lx0  reason: default package */
/* loaded from: classes3.dex */
public final class lx0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;
    public final List e;

    public lx0(boolean z, boolean z2, boolean z3, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
        this.e = list2;
    }

    public static lx0 a(lx0 lx0Var, boolean z, boolean z2, boolean z3, List list, List list2, int i) {
        lx0Var.getClass();
        if ((i & 2) != 0) {
            z = lx0Var.a;
        }
        boolean z4 = z;
        if ((i & 4) != 0) {
            z2 = lx0Var.b;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            z3 = lx0Var.c;
        }
        boolean z6 = z3;
        if ((i & 16) != 0) {
            list = lx0Var.d;
        }
        List list3 = list;
        if ((i & 32) != 0) {
            list2 = lx0Var.e;
        }
        List list4 = list2;
        lx0Var.getClass();
        list3.getClass();
        list4.getClass();
        return new lx0(z4, z5, z6, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof lx0) {
                lx0 lx0Var = (lx0) obj;
                if (this.a != lx0Var.a || this.b != lx0Var.b || this.c != lx0Var.c || !c16.i(this.d, lx0Var.d) || !c16.i(this.e, lx0Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.l(eub.k(eub.k(eub.k(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("BrowserState(isLoading=false, hasDetail=", this.a, ", isAdblock=", this.b, ", isDesktopMode=");
        p.append(this.c);
        p.append(", extensionList=");
        p.append(this.d);
        p.append(", historyList=");
        return rs8.n(p, this.e, ")");
    }
}
