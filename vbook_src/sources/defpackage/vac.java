package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vac  reason: default package */
/* loaded from: classes3.dex */
public final class vac {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;
    public final int e;

    public vac(String str, String str2, Map map, String str3, int i) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
        this.e = i;
    }

    public static vac a(vac vacVar, LinkedHashMap linkedHashMap) {
        String str = vacVar.a;
        String str2 = vacVar.b;
        String str3 = vacVar.d;
        int i = vacVar.e;
        vacVar.getClass();
        str.getClass();
        return new vac(str, str2, linkedHashMap, str3, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vac) {
                vac vacVar = (vac) obj;
                if (!c16.i(this.a, vacVar.a) || !c16.i(this.b, vacVar.b) || !c16.i(this.c, vacVar.c) || !this.d.equals(vacVar.d) || this.e != vacVar.e) {
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
        int hashCode2 = this.a.hashCode() * 31;
        String str = this.b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.e) + eub.j(rs8.a((hashCode2 + hashCode) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("TocLink(id=", this.a, ", parentId=", this.b, ", title=");
        y.append(this.c);
        y.append(", path=");
        y.append(this.d);
        y.append(", position=");
        return rs8.g(this.e, ")", y);
    }
}
