package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j06  reason: default package */
/* loaded from: classes.dex */
public final class j06 {
    public final String a;
    public final List b;
    public final yc3 c;
    public final List d;
    public final List e;
    public final List f;

    public j06(String str, List list, yc3 yc3Var, ArrayList arrayList, List list2, List list3, int i) {
        yc3Var = (i & 4) != 0 ? null : yc3Var;
        arrayList = (i & 8) != 0 ? null : arrayList;
        list2 = (i & 16) != 0 ? null : list2;
        list3 = (i & 32) != 0 ? null : list3;
        str.getClass();
        this.a = str;
        this.b = list;
        this.c = yc3Var;
        this.d = arrayList;
        this.e = list2;
        this.f = list3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof j06) {
                j06 j06Var = (j06) obj;
                if (!c16.i(this.a, j06Var.a) || !this.b.equals(j06Var.b) || !c16.i(this.c, j06Var.c) || !c16.i(this.d, j06Var.d) || !c16.i(this.e, j06Var.e) || !c16.i(this.f, j06Var.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int l = eub.l(this.a.hashCode() * 31, this.b, 31);
        int i = 0;
        yc3 yc3Var = this.c;
        if (yc3Var == null) {
            hashCode = 0;
        } else {
            hashCode = yc3Var.hashCode();
        }
        int i2 = (l + hashCode) * 31;
        List list = this.d;
        if (list == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list2 = this.e;
        if (list2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List list3 = this.f;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return (i4 + i) * 29791;
    }

    public final String toString() {
        return "InternalParseResult(markdown=" + this.a + ", blocks=" + this.b + ", metadata=" + this.c + ", outline=" + this.d + ", warnings=" + this.e + ", images=" + this.f + ", isImageBased=null, pageQuality=null, qualitySummary=null)";
    }
}
