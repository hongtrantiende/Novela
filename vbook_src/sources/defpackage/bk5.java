package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bk5  reason: default package */
/* loaded from: classes.dex */
public final class bk5 {
    public final String a;
    public final int b;
    public final int c;
    public final List d;
    public final Boolean e;

    public bk5(String str, int i, int i2, List list, Boolean bool) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = list;
        this.e = bool;
    }

    public static bk5 a(bk5 bk5Var, String str, List list, int i) {
        Boolean bool = Boolean.TRUE;
        if ((i & 1) != 0) {
            str = bk5Var.a;
        }
        String str2 = str;
        int i2 = bk5Var.b;
        int i3 = bk5Var.c;
        if ((i & 8) != 0) {
            list = bk5Var.d;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            bool = bk5Var.e;
        }
        bk5Var.getClass();
        str2.getClass();
        return new bk5(str2, i2, i3, list2, bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk5)) {
            return false;
        }
        bk5 bk5Var = (bk5) obj;
        if (c16.i(this.a, bk5Var.a) && this.b == bk5Var.b && this.c == bk5Var.c && c16.i(this.d, bk5Var.d) && c16.i(this.e, bk5Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = hl5.a(this.c, hl5.a(this.b, this.a.hashCode() * 31, 31), 31);
        int i = 0;
        List list = this.d;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        Boolean bool = this.e;
        if (bool != null) {
            i = bool.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder s = s21.s("IRCell(text=", this.a, ", colSpan=", this.b, ", rowSpan=");
        s.append(this.c);
        s.append(", blocks=");
        s.append(this.d);
        s.append(", isHeader=");
        s.append(this.e);
        s.append(")");
        return s.toString();
    }

    public /* synthetic */ bk5(String str, int i, int i2) {
        this(str, i, i2, null, null);
    }
}
