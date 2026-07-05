package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h34  reason: default package */
/* loaded from: classes3.dex */
public final class h34 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final String d;
    public final l54 e;
    public final boolean f;
    public final List g;

    public h34(boolean z, boolean z2, boolean z3, String str, l54 l54Var, boolean z4, List list) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = str;
        this.e = l54Var;
        this.f = z4;
        this.g = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    public static h34 a(h34 h34Var, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            z = h34Var.a;
        }
        boolean z5 = z;
        if ((i & 2) != 0) {
            z2 = h34Var.b;
        }
        boolean z6 = z2;
        String str = h34Var.d;
        l54 l54Var = h34Var.e;
        if ((i & 32) != 0) {
            z4 = h34Var.f;
        }
        boolean z7 = z4;
        ArrayList arrayList2 = arrayList;
        if ((i & 64) != 0) {
            arrayList2 = h34Var.g;
        }
        h34Var.getClass();
        str.getClass();
        l54Var.getClass();
        return new h34(z5, z6, z3, str, l54Var, z7, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h34) {
                h34 h34Var = (h34) obj;
                if (this.a != h34Var.a || this.b != h34Var.b || this.c != h34Var.c || !c16.i(this.d, h34Var.d) || !c16.i(this.e, h34Var.e) || this.f != h34Var.f || !c16.i(this.g, h34Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k((this.e.hashCode() + eub.j(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
        List list = this.g;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        StringBuilder p = rs8.p("ExtensionBook(isLoading=", this.a, ", isSearching=", this.b, ", isError=");
        p.append(this.c);
        p.append(", errorMessage=");
        p.append(this.d);
        p.append(", extension=");
        p.append(this.e);
        p.append(", hasMore=");
        p.append(this.f);
        p.append(", books=");
        return rs8.n(p, this.g, ")");
    }

    public /* synthetic */ h34(l54 l54Var) {
        this(true, false, false, "", l54Var, false, null);
    }
}
