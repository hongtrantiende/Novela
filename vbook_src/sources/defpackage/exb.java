package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: exb  reason: default package */
/* loaded from: classes3.dex */
public final class exb {
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final Map f;
    public final List g;
    public final List h;
    public final List i;
    public final boolean j;
    public final boolean k;

    public exb(String str, String str2, int i, int i2, String str3, Map map, List list, List list2, List list3, boolean z, boolean z2) {
        str.getClass();
        str3.getClass();
        map.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = map;
        this.g = list;
        this.h = list2;
        this.i = list3;
        this.j = z;
        this.k = z2;
    }

    public static exb a(exb exbVar, String str, int i, int i2, String str2, Map map, List list, boolean z, boolean z2, int i3) {
        int i4;
        String str3;
        Map map2;
        List list2;
        boolean z3;
        boolean z4;
        String str4 = exbVar.a;
        if ((i3 & 2) != 0) {
            str = exbVar.b;
        }
        String str5 = str;
        if ((i3 & 4) != 0) {
            i = exbVar.c;
        }
        int i5 = i;
        if ((i3 & 8) != 0) {
            i4 = exbVar.d;
        } else {
            i4 = i2;
        }
        if ((i3 & 16) != 0) {
            str3 = exbVar.e;
        } else {
            str3 = str2;
        }
        if ((i3 & 32) != 0) {
            map2 = exbVar.f;
        } else {
            map2 = map;
        }
        if ((i3 & 64) != 0) {
            list2 = exbVar.g;
        } else {
            list2 = list;
        }
        List list3 = exbVar.h;
        List list4 = exbVar.i;
        if ((i3 & 512) != 0) {
            z3 = exbVar.j;
        } else {
            z3 = z;
        }
        if ((i3 & 1024) != 0) {
            z4 = exbVar.k;
        } else {
            z4 = z2;
        }
        exbVar.getClass();
        str4.getClass();
        str3.getClass();
        map2.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        return new exb(str4, str5, i5, i4, str3, map2, list2, list3, list4, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exb)) {
            return false;
        }
        exb exbVar = (exb) obj;
        if (c16.i(this.a, exbVar.a) && c16.i(this.b, exbVar.b) && this.c == exbVar.c && this.d == exbVar.d && c16.i(this.e, exbVar.e) && c16.i(this.f, exbVar.f) && c16.i(this.g, exbVar.g) && c16.i(this.h, exbVar.h) && c16.i(this.i, exbVar.i) && this.j == exbVar.j && this.k == exbVar.k) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Boolean.hashCode(this.k) + eub.k(eub.l(eub.l(eub.l(rs8.a(eub.j(hl5.a(this.d, hl5.a(this.c, (hashCode2 + hashCode) * 31, 31), 31), 31, this.e), 31, this.f), this.g, 31), this.h, 31), this.i, 31), 31, this.j);
    }

    public final String toString() {
        StringBuilder y = nk2.y("TextQtTranslateState(sentence=", this.a, ", translate=", this.b, ", selectionStart=");
        rs8.q(this.c, this.d, ", selectionEnd=", ", translateType=", y);
        y.append(this.e);
        y.append(", translateSentence=");
        y.append(this.f);
        y.append(", translateSuggests=");
        y.append(this.g);
        y.append(", translateLookups=");
        y.append(this.h);
        y.append(", translateEngines=");
        y.append(this.i);
        y.append(", isNameSavePriority=");
        y.append(this.j);
        y.append(", isPrivSavePriority=");
        return rs8.m(")", y, this.k);
    }
}
