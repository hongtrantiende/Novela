package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rm8  reason: default package */
/* loaded from: classes.dex */
public final class rm8 {
    public final we4 a;
    public final String b;
    public final List c;
    public final Integer d;
    public final yc3 e;
    public final List f;
    public final List g;
    public final List h;

    public rm8(we4 we4Var, String str, List list, Integer num, yc3 yc3Var, List list2, List list3, List list4) {
        str.getClass();
        this.a = we4Var;
        this.b = str;
        this.c = list;
        this.d = num;
        this.e = yc3Var;
        this.f = list2;
        this.g = list3;
        this.h = list4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rm8) {
                rm8 rm8Var = (rm8) obj;
                if (this.a != rm8Var.a || !c16.i(this.b, rm8Var.b) || !this.c.equals(rm8Var.c) || !c16.i(this.d, rm8Var.d) || !c16.i(this.e, rm8Var.e) || !c16.i(this.f, rm8Var.f) || !c16.i(this.g, rm8Var.g) || !c16.i(this.h, rm8Var.h)) {
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
        int hashCode4;
        int l = eub.l(eub.j(this.a.hashCode() * 31, 31, this.b), this.c, 31);
        int i = 0;
        Integer num = this.d;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (l + hashCode) * 961;
        yc3 yc3Var = this.e;
        if (yc3Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = yc3Var.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        List list = this.f;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        List list2 = this.g;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        List list3 = this.h;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return (i5 + i) * 961;
    }

    public final String toString() {
        return "ParseSuccess(fileType=" + this.a + ", markdown=" + this.b + ", blocks=" + this.c + ", pageCount=" + this.d + ", isImageBased=null, metadata=" + this.e + ", outline=" + this.f + ", warnings=" + this.g + ", images=" + this.h + ", pageQuality=null, qualitySummary=null)";
    }
}
