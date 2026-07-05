package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fq0  reason: default package */
/* loaded from: classes3.dex */
public final class fq0 {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public fq0(String str, List list, boolean z, boolean z2) {
        list.getClass();
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.List] */
    public static fq0 a(fq0 fq0Var, String str, boolean z, boolean z2, ArrayList arrayList, int i) {
        fq0Var.getClass();
        if ((i & 2) != 0) {
            str = fq0Var.a;
        }
        if ((i & 4) != 0) {
            z = fq0Var.b;
        }
        if ((i & 8) != 0) {
            z2 = fq0Var.c;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 16) != 0) {
            arrayList2 = fq0Var.d;
        }
        fq0Var.getClass();
        str.getClass();
        arrayList2.getClass();
        return new fq0(str, arrayList2, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fq0) {
                fq0 fq0Var = (fq0) obj;
                if (!this.a.equals(fq0Var.a) || this.b != fq0Var.b || this.c != fq0Var.c || !c16.i(this.d, fq0Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.k(eub.k(eub.j(Boolean.hashCode(false) * 31, 31, this.a), 31, this.b), 31, this.c);
    }

    public final String toString() {
        return "BookMigrateSearchState(isSearching=false, searchKey=" + this.a + ", isShowAll=" + this.b + ", isShowOnlyHasResult=" + this.c + ", books=" + this.d + ")";
    }
}
