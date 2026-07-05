package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xq5  reason: default package */
/* loaded from: classes3.dex */
public final class xq5 {
    public final int a;
    public final String b;
    public final List c;
    public final String d;

    public xq5(int i, String str, String str2, List list) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xq5)) {
            return false;
        }
        xq5 xq5Var = (xq5) obj;
        if (this.a == xq5Var.a && c16.i(this.b, xq5Var.b) && c16.i(this.c, xq5Var.c) && c16.i(this.d, xq5Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(Integer.hashCode(this.a) * 31, 31, this.b);
        int i = 0;
        List list = this.c;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (j + hashCode) * 31;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder r = s21.r("ImageURL(chapterIndex=", this.a, ", url=", this.b, ", fallback=");
        r.append(this.c);
        r.append(", script=");
        r.append(this.d);
        r.append(")");
        return r.toString();
    }
}
