package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hq5  reason: default package */
/* loaded from: classes3.dex */
public final class hq5 {
    public final String a;
    public final List b;
    public final int c;
    public final int d;
    public final String e;

    public hq5(String str, ArrayList arrayList, int i, int i2, String str2) {
        this.a = str;
        this.b = arrayList;
        this.c = i;
        this.d = i2;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq5)) {
            return false;
        }
        hq5 hq5Var = (hq5) obj;
        if (c16.i(this.a, hq5Var.a) && c16.i(this.b, hq5Var.b) && this.c == hq5Var.c && this.d == hq5Var.d && c16.i(this.e, hq5Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        int i = 0;
        List list = this.b;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int a = hl5.a(this.d, hl5.a(this.c, (hashCode2 + hashCode) * 31, 31), 31);
        String str = this.e;
        if (str != null) {
            i = str.hashCode();
        }
        return a + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImageSourceImage(path=");
        sb.append(this.a);
        sb.append(", fallback=");
        sb.append(this.b);
        sb.append(", width=");
        rs8.q(this.c, this.d, ", height=", ", script=", sb);
        return s21.q(sb, this.e, ")");
    }
}
