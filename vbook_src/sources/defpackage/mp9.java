package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mp9  reason: default package */
/* loaded from: classes3.dex */
public final class mp9 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final List d;

    public mp9(List list, boolean z, boolean z2, boolean z3) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = list;
    }

    public static mp9 a(mp9 mp9Var, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = mp9Var.a;
        }
        if ((i & 2) != 0) {
            z2 = mp9Var.b;
        }
        boolean z3 = mp9Var.c;
        List list = mp9Var.d;
        mp9Var.getClass();
        list.getClass();
        return new mp9(list, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp9)) {
            return false;
        }
        mp9 mp9Var = (mp9) obj;
        if (this.a == mp9Var.a && this.b == mp9Var.b && this.c == mp9Var.c && c16.i(this.d, mp9Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder p = rs8.p("ReportTopicState(isLoading=", this.a, ", isError=", this.b, ", hasMore=");
        p.append(this.c);
        p.append(", reportList=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
