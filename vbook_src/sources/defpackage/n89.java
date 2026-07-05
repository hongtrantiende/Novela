package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n89  reason: default package */
/* loaded from: classes.dex */
public final class n89 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;
    public final boolean f;

    public n89(String str, String str2, String str3, String str4, List list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = list;
        this.f = str2.equals("DAV:");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n89)) {
            return false;
        }
        n89 n89Var = (n89) obj;
        if (c16.i(this.a, n89Var.a) && c16.i(this.b, n89Var.b) && c16.i(this.c, n89Var.c) && c16.i(this.d, n89Var.d) && c16.i(this.e, n89Var.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = this.a.hashCode() * 31;
        int i = 0;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode3 + hashCode) * 31;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return this.e.hashCode() + ((i3 + i) * 31);
    }

    public final String toString() {
        String str;
        String str2 = this.c;
        if (str2 != null) {
            str = nk2.u(str2, ":");
        } else {
            str = "";
        }
        return rs8.l(str, this.a, " = ", this.d);
    }

    public /* synthetic */ n89(String str, String str2, String str3, String str4, int i) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, ks3.a);
    }
}
