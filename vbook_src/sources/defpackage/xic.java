package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xic  reason: default package */
/* loaded from: classes3.dex */
public final class xic {
    public final cjc a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;
    public final ArrayList f;
    public final ArrayList g;
    public final ArrayList h;

    public xic(cjc cjcVar, String str, String str2, Map map, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        str.getClass();
        str2.getClass();
        map.getClass();
        str3.getClass();
        this.a = cjcVar;
        this.b = str;
        this.c = str2;
        this.d = map;
        this.e = str3;
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xic) {
                xic xicVar = (xic) obj;
                if (this.a != xicVar.a || !c16.i(this.b, xicVar.b) || !c16.i(this.c, xicVar.c) || !c16.i(this.d, xicVar.d) || !c16.i(this.e, xicVar.e) || !this.f.equals(xicVar.f) || !this.g.equals(xicVar.g) || !this.h.equals(xicVar.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = eub.j(rs8.a(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        int hashCode = this.g.hashCode();
        return this.h.hashCode() + ((hashCode + ((this.f.hashCode() + j) * 31)) * 31);
    }

    public final String toString() {
        return "TrackContent(kind=" + this.a + ", data=" + this.b + ", mimeType=" + this.c + ", headers=" + this.d + ", host=" + this.e + ", timeSkip=" + this.f + ", audios=" + this.g + ", subtitles=" + this.h + ")";
    }
}
