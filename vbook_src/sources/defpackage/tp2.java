package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tp2  reason: default package */
/* loaded from: classes3.dex */
public final class tp2 {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final String e;
    public final int f;
    public final long g;
    public final long h;

    public tp2(String str, String str2, Map map, String str3, String str4, int i, long j, long j2) {
        str.getClass();
        str2.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = j;
        this.h = j2;
    }

    public static tp2 a(tp2 tp2Var, LinkedHashMap linkedHashMap) {
        String str = tp2Var.a;
        String str2 = tp2Var.b;
        String str3 = tp2Var.d;
        String str4 = tp2Var.e;
        int i = tp2Var.f;
        long j = tp2Var.g;
        long j2 = tp2Var.h;
        str.getClass();
        str2.getClass();
        return new tp2(str, str2, linkedHashMap, str3, str4, i, j, j2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp2)) {
            return false;
        }
        tp2 tp2Var = (tp2) obj;
        if (c16.i(this.a, tp2Var.a) && c16.i(this.b, tp2Var.b) && c16.i(this.c, tp2Var.c) && c16.i(this.d, tp2Var.d) && c16.i(this.e, tp2Var.e) && this.f == tp2Var.f && this.g == tp2Var.g && this.h == tp2Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = rs8.a(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        int i = 0;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str2 = this.e;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Long.hashCode(this.h) + hl5.c(hl5.a(this.f, (i2 + i) * 31, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("DbTocLink(id=", this.a, ", bookId=", this.b, ", title=");
        y.append(this.c);
        y.append(", path=");
        y.append(this.d);
        y.append(", parentId=");
        a82.u(this.f, this.e, ", position=", ", createAt=", y);
        y.append(this.g);
        return a82.n(y, ", updateAt=", this.h, ")");
    }
}
