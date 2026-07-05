package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xoa  reason: default package */
/* loaded from: classes3.dex */
public final class xoa {
    public final String a;
    public final String b;
    public final apa c;
    public final List d;
    public final String e;

    public xoa(String str, String str2, apa apaVar, List list, String str3) {
        str.getClass();
        str2.getClass();
        apaVar.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = apaVar;
        this.d = list;
        this.e = str3;
    }

    public static xoa a(xoa xoaVar, String str, apa apaVar, List list, String str2, int i) {
        String str3 = str;
        String str4 = xoaVar.a;
        if ((i & 2) != 0) {
            str3 = xoaVar.b;
        }
        if ((i & 4) != 0) {
            apaVar = xoaVar.c;
        }
        if ((i & 8) != 0) {
            list = xoaVar.d;
        }
        if ((i & 16) != 0) {
            str2 = xoaVar.e;
        }
        String str5 = str2;
        xoaVar.getClass();
        str4.getClass();
        str3.getClass();
        apaVar.getClass();
        list.getClass();
        List list2 = list;
        return new xoa(str4, str3, apaVar, list2, str5);
    }

    public final boolean equals(Object obj) {
        boolean i;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xoa)) {
            return false;
        }
        xoa xoaVar = (xoa) obj;
        if (!c16.i(this.a, xoaVar.a) || !c16.i(this.b, xoaVar.b) || !c16.i(this.c, xoaVar.c) || !c16.i(this.d, xoaVar.d)) {
            return false;
        }
        String str = xoaVar.e;
        String str2 = this.e;
        if (str2 == null) {
            if (str == null) {
                i = true;
            }
            i = false;
        } else {
            if (str != null) {
                i = c16.i(str2, str);
            }
            i = false;
        }
        if (i) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int l = eub.l((this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b)) * 31, this.d, 31);
        String str = this.e;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return l + hashCode;
    }

    public final String toString() {
        String a;
        String a2 = pm0.a(this.a);
        String str = this.e;
        if (str == null) {
            a = "null";
        } else {
            a = noa.a(str);
        }
        StringBuilder y = nk2.y("SlashCommandState(anchorBlockId=", a2, ", query=", this.b, ", queryRange=");
        y.append(this.c);
        y.append(", navigationPath=");
        y.append(this.d);
        y.append(", highlightedCommandId=");
        return s21.q(y, a, ")");
    }
}
