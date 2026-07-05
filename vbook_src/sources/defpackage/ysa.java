package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ysa  reason: default package */
/* loaded from: classes3.dex */
public final class ysa {
    public final boolean a;
    public final boolean b;
    public final List c;
    public final boolean d;

    public ysa(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
        this.d = z3;
    }

    public static ysa a(ysa ysaVar, boolean z, List list, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = ysaVar.a;
        }
        boolean z3 = ysaVar.b;
        if ((i & 4) != 0) {
            list = ysaVar.c;
        }
        if ((i & 8) != 0) {
            z2 = ysaVar.d;
        }
        ysaVar.getClass();
        list.getClass();
        return new ysa(list, z, z3, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ysa)) {
            return false;
        }
        ysa ysaVar = (ysa) obj;
        if (this.a == ysaVar.a && this.b == ysaVar.b && c16.i(this.c, ysaVar.c) && this.d == ysaVar.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.l(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("SourceCommentState(isLoading=", this.a, ", hasMore=", this.b, ", comments=");
        p.append(this.c);
        p.append(", isError=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
