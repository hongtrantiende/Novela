package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t65  reason: default package */
/* loaded from: classes3.dex */
public final class t65 {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public t65(boolean z, int i, int i2, boolean z2, boolean z3, boolean z4, boolean z5, List list) {
        list.getClass();
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.util.List] */
    public static t65 a(t65 t65Var, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, ArrayList arrayList, int i3) {
        boolean z5;
        if ((i3 & 1) != 0) {
            z5 = t65Var.a;
        } else {
            z5 = false;
        }
        if ((i3 & 2) != 0) {
            i = t65Var.b;
        }
        if ((i3 & 4) != 0) {
            i2 = t65Var.c;
        }
        if ((i3 & 8) != 0) {
            z = t65Var.d;
        }
        if ((i3 & 16) != 0) {
            z2 = t65Var.e;
        }
        if ((i3 & 32) != 0) {
            z3 = t65Var.f;
        }
        if ((i3 & 64) != 0) {
            z4 = t65Var.g;
        }
        ArrayList arrayList2 = arrayList;
        if ((i3 & Token.CASE) != 0) {
            arrayList2 = t65Var.h;
        }
        ArrayList arrayList3 = arrayList2;
        t65Var.getClass();
        arrayList3.getClass();
        boolean z6 = z4;
        boolean z7 = z3;
        boolean z8 = z2;
        boolean z9 = z;
        int i4 = i2;
        return new t65(z5, i, i4, z9, z8, z7, z6, arrayList3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t65)) {
            return false;
        }
        t65 t65Var = (t65) obj;
        if (this.a == t65Var.a && this.b == t65Var.b && this.c == t65Var.c && this.d == t65Var.d && this.e == t65Var.e && this.f == t65Var.f && this.g == t65Var.g && c16.i(this.h, t65Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + eub.k(eub.k(eub.k(eub.k(hl5.a(this.c, hl5.a(this.b, Boolean.hashCode(this.a) * 31, 31), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HistoryState(isLoading=");
        sb.append(this.a);
        sb.append(", viewType=");
        sb.append(this.b);
        sb.append(", shelfSize=");
        eub.w(sb, this.c, ", isShowReadPercent=", this.d, ", isShowTotalChapter=");
        rs8.z(sb, this.e, ", isShowNewChapter=", this.f, ", isSaveReadHistory=");
        sb.append(this.g);
        sb.append(", sections=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }
}
