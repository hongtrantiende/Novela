package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ck5  reason: default package */
/* loaded from: classes.dex */
public final class ck5 {
    public final int a;
    public final int b;
    public final List c;
    public final boolean d;
    public final String e;

    public ck5(int i, int i2, List list, boolean z, String str) {
        this.a = i;
        this.b = i2;
        this.c = list;
        this.d = z;
        this.e = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    public static ck5 a(ck5 ck5Var, ArrayList arrayList, String str, int i) {
        int i2 = ck5Var.a;
        int i3 = ck5Var.b;
        ArrayList arrayList2 = arrayList;
        if ((i & 4) != 0) {
            arrayList2 = ck5Var.c;
        }
        ArrayList arrayList3 = arrayList2;
        boolean z = ck5Var.d;
        if ((i & 16) != 0) {
            str = ck5Var.e;
        }
        ck5Var.getClass();
        arrayList3.getClass();
        return new ck5(i2, i3, arrayList3, z, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ck5)) {
            return false;
        }
        ck5 ck5Var = (ck5) obj;
        if (this.a == ck5Var.a && this.b == ck5Var.b && c16.i(this.c, ck5Var.c) && this.d == ck5Var.d && c16.i(this.e, ck5Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(eub.l(hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31), 31, this.d);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return k + hashCode;
    }

    public final String toString() {
        StringBuilder r = hl5.r(this.a, this.b, "IRTable(rows=", ", cols=", ", cells=");
        r.append(this.c);
        r.append(", hasHeader=");
        r.append(this.d);
        r.append(", caption=");
        return s21.q(r, this.e, ")");
    }
}
