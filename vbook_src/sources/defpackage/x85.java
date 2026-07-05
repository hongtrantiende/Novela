package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x85  reason: default package */
/* loaded from: classes3.dex */
public final class x85 {
    public final boolean a;
    public final boolean b;
    public final List c;

    public x85(boolean z, boolean z2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    public static x85 a(x85 x85Var, boolean z, boolean z2, ArrayList arrayList, int i) {
        x85Var.getClass();
        if ((i & 2) != 0) {
            z = x85Var.a;
        }
        if ((i & 4) != 0) {
            z2 = x85Var.b;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 8) != 0) {
            arrayList2 = x85Var.c;
        }
        x85Var.getClass();
        arrayList2.getClass();
        return new x85(z, z2, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x85) {
                x85 x85Var = (x85) obj;
                if (this.a != x85Var.a || this.b != x85Var.b || !c16.i(this.c, x85Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.k(eub.k(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b);
    }

    public final String toString() {
        return rs8.n(rs8.p("HomeSearchState(isSearching=false, isShowAll=", this.a, ", isShowOnlyHasResult=", this.b, ", extensionBooks="), this.c, ")");
    }
}
