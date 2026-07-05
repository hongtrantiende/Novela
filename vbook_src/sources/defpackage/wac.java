package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wac  reason: default package */
/* loaded from: classes3.dex */
public final class wac {
    public final String a;
    public final String b;
    public final Map c;
    public final String d;

    public wac(String str, String str2, String str3, Map map) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wac) {
                wac wacVar = (wac) obj;
                if (!c16.i(this.a, wacVar.a) || !c16.i(this.b, wacVar.b) || !c16.i(this.c, wacVar.c) || !this.d.equals(wacVar.d)) {
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
        return this.d.hashCode() + rs8.a((hashCode2 + hashCode) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder y = nk2.y("TocLink(id=", this.a, ", parentId=", this.b, ", title=");
        y.append(this.c);
        y.append(", path=");
        y.append(this.d);
        y.append(")");
        return y.toString();
    }
}
