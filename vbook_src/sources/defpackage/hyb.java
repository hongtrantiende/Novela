package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hyb  reason: default package */
/* loaded from: classes3.dex */
public final class hyb {
    public final String a;
    public final String b;
    public final Map c;
    public final boolean d;
    public final boolean e;

    public hyb(String str, String str2, Map map, boolean z, boolean z2) {
        this.a = str;
        this.b = str2;
        this.c = map;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hyb) {
                hyb hybVar = (hyb) obj;
                if (!this.a.equals(hybVar.a) || !this.b.equals(hybVar.b) || !this.c.equals(hybVar.c) || this.d != hybVar.d || this.e != hybVar.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + eub.k(rs8.a(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder y = nk2.y("TextSourceInfo(name=", this.a, ", sourceId=", this.b, ", translateConfig=");
        y.append(this.c);
        y.append(", isSupportDownload=");
        y.append(this.d);
        y.append(", isSupportCheckNewChapter=");
        return rs8.m(")", y, this.e);
    }
}
