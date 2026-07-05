package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kua  reason: default package */
/* loaded from: classes3.dex */
public final class kua {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public kua(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
    }

    public static kua a(kua kuaVar, boolean z, List list, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z = kuaVar.a;
        }
        boolean z3 = kuaVar.b;
        if ((i & 4) != 0) {
            list = kuaVar.c;
        }
        if ((i & 8) != 0) {
            z2 = kuaVar.d;
        } else {
            z2 = true;
        }
        kuaVar.getClass();
        list.getClass();
        return new kua(list, z, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kua)) {
            return false;
        }
        kua kuaVar = (kua) obj;
        if (this.a == kuaVar.a && this.b == kuaVar.b && c16.i(this.c, kuaVar.c) && this.d == kuaVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.l(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("SourceSuggestState(isLoading=", this.a, ", hasMore=", this.b, ", items=");
        p.append(this.c);
        p.append(", isError=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
