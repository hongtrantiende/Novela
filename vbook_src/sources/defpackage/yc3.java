package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yc3  reason: default package */
/* loaded from: classes.dex */
public final class yc3 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Integer f;
    public final String g;
    public final String h;
    public final List i;

    public /* synthetic */ yc3(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, ArrayList arrayList, int i) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : str6, (i & Token.CASE) != 0 ? null : str7, (i & 256) != 0 ? null : arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    public static yc3 a(yc3 yc3Var, String str, String str2, String str3, String str4, Integer num, String str5, ArrayList arrayList, int i) {
        String str6;
        Integer num2;
        String str7;
        ArrayList arrayList2;
        if ((i & 1) != 0) {
            str = yc3Var.a;
        }
        String str8 = str;
        if ((i & 2) != 0) {
            str2 = yc3Var.b;
        }
        String str9 = str2;
        String str10 = yc3Var.c;
        if ((i & 8) != 0) {
            str3 = yc3Var.d;
        }
        String str11 = str3;
        if ((i & 16) != 0) {
            str6 = yc3Var.e;
        } else {
            str6 = str4;
        }
        if ((i & 32) != 0) {
            num2 = yc3Var.f;
        } else {
            num2 = num;
        }
        String str12 = yc3Var.g;
        if ((i & Token.CASE) != 0) {
            str7 = yc3Var.h;
        } else {
            str7 = str5;
        }
        if ((i & 256) != 0) {
            arrayList2 = yc3Var.i;
        } else {
            arrayList2 = arrayList;
        }
        yc3Var.getClass();
        return new yc3(str8, str9, str10, str11, str6, num2, str12, str7, arrayList2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yc3)) {
            return false;
        }
        yc3 yc3Var = (yc3) obj;
        if (c16.i(this.a, yc3Var.a) && c16.i(this.b, yc3Var.b) && c16.i(this.c, yc3Var.c) && c16.i(this.d, yc3Var.d) && c16.i(this.e, yc3Var.e) && c16.i(this.f, yc3Var.f) && c16.i(this.g, yc3Var.g) && c16.i(this.h, yc3Var.h) && c16.i(this.i, yc3Var.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int i = 0;
        String str = this.a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.e;
        if (str5 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str5.hashCode();
        }
        int i6 = (i5 + hashCode5) * 31;
        Integer num = this.f;
        if (num == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num.hashCode();
        }
        int i7 = (i6 + hashCode6) * 31;
        String str6 = this.g;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i8 = (i7 + hashCode7) * 31;
        String str7 = this.h;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i9 = (i8 + hashCode8) * 31;
        List list = this.i;
        if (list != null) {
            i = list.hashCode();
        }
        return i9 + i;
    }

    public final String toString() {
        StringBuilder y = nk2.y("DocumentMetadata(title=", this.a, ", author=", this.b, ", creator=");
        nk2.C(y, this.c, ", createdAt=", this.d, ", modifiedAt=");
        y.append(this.e);
        y.append(", pageCount=");
        y.append(this.f);
        y.append(", version=");
        nk2.C(y, this.g, ", description=", this.h, ", keywords=");
        return rs8.n(y, this.i, ")");
    }

    public yc3(String str, String str2, String str3, String str4, String str5, Integer num, String str6, String str7, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = num;
        this.g = str6;
        this.h = str7;
        this.i = list;
    }
}
