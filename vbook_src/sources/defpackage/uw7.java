package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uw7  reason: default package */
/* loaded from: classes.dex */
public final class uw7 {
    public final int a;
    public final Integer b;
    public final Integer c;
    public final String d;
    public final Integer e;
    public final List f;
    public final Integer g;
    public final Integer h;
    public final Integer i;
    public ArrayList j = null;

    public uw7(int i, Integer num, Integer num2, String str, Integer num3, List list, Integer num4, Integer num5, Integer num6) {
        this.a = i;
        this.b = num;
        this.c = num2;
        this.d = str;
        this.e = num3;
        this.f = list;
        this.g = num4;
        this.h = num5;
        this.i = num6;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uw7) {
                uw7 uw7Var = (uw7) obj;
                if (this.a != uw7Var.a || !c16.i(this.b, uw7Var.b) || !c16.i(this.c, uw7Var.c) || !this.d.equals(uw7Var.d) || !c16.i(this.e, uw7Var.e) || !c16.i(this.f, uw7Var.f) || !c16.i(this.g, uw7Var.g) || !c16.i(this.h, uw7Var.h) || !c16.i(this.i, uw7Var.i) || !c16.i(this.j, uw7Var.j)) {
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
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8 = Integer.hashCode(this.a) * 31;
        int i = 0;
        Integer num = this.b;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = (hashCode8 + hashCode) * 31;
        Integer num2 = this.c;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int j = eub.j((i2 + hashCode2) * 31, 31, this.d);
        Integer num3 = this.e;
        if (num3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num3.hashCode();
        }
        int i3 = (j + hashCode3) * 31;
        List list = this.f;
        if (list == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        Integer num4 = this.g;
        if (num4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = num4.hashCode();
        }
        int i5 = (i4 + hashCode5) * 31;
        Integer num5 = this.h;
        if (num5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = num5.hashCode();
        }
        int i6 = (i5 + hashCode6) * 31;
        Integer num6 = this.i;
        if (num6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = num6.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        ArrayList arrayList = this.j;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return i7 + i;
    }

    public final String toString() {
        ArrayList arrayList = this.j;
        return "NCX(index=" + this.a + ", offset=" + this.b + ", size=" + this.c + ", label=" + this.d + ", headingLevel=" + this.e + ", pos=" + this.f + ", parent=" + this.g + ", firstChild=" + this.h + ", lastChild=" + this.i + ", children=" + arrayList + ")";
    }
}
