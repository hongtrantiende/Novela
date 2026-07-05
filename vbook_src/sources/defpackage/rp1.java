package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rp1  reason: default package */
/* loaded from: classes3.dex */
public final class rp1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public rp1(String str, String str2, String str3, String str4, List list) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
    }

    public static rp1 a(rp1 rp1Var, String str, String str2, String str3, ArrayList arrayList, int i) {
        List list;
        String str4 = rp1Var.b;
        if ((i & 16) != 0) {
            list = rp1Var.e;
        } else {
            list = arrayList;
        }
        rp1Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        return new rp1(str, str4, str2, str3, list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rp1) {
                rp1 rp1Var = (rp1) obj;
                if (!this.a.equals(rp1Var.a) || !this.b.equals(rp1Var.b) || !c16.i(this.c, rp1Var.c) || !this.d.equals(rp1Var.d) || !this.e.equals(rp1Var.e)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("Comment(name=", this.a, ", avatar=", this.b, ", content=");
        nk2.C(y, this.c, ", description=", this.d, ", subComments=");
        return rs8.n(y, this.e, ")");
    }
}
