package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cbd  reason: default package */
/* loaded from: classes3.dex */
public final class cbd {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final String e;
    public final List f;
    public final List g;
    public final List h;

    public cbd(String str, String str2, String str3, String str4, List list, List list2, List list3, Map map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        map.getClass();
        str4.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = str4;
        this.f = list;
        this.g = list2;
        this.h = list3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbd)) {
            return false;
        }
        cbd cbdVar = (cbd) obj;
        if (c16.i(this.a, cbdVar.a) && c16.i(this.b, cbdVar.b) && c16.i(this.c, cbdVar.c) && c16.i(this.d, cbdVar.d) && c16.i(this.e, cbdVar.e) && c16.i(this.f, cbdVar.f) && c16.i(this.g, cbdVar.g) && c16.i(this.h, cbdVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + eub.l(eub.l(eub.j(rs8.a(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), this.f, 31), this.g, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("VideoSourceTrackContent(kind=", this.a, ", data=", this.b, ", mimeType=");
        y.append(this.c);
        y.append(", headers=");
        y.append(this.d);
        y.append(", host=");
        y.append(this.e);
        y.append(", timeSkip=");
        y.append(this.f);
        y.append(", audios=");
        y.append(this.g);
        y.append(", subtitles=");
        y.append(this.h);
        y.append(")");
        return y.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ cbd(java.lang.String r10, java.lang.String r11, java.lang.String r12, java.util.Map r13, java.lang.String r14, int r15) {
        /*
            r9 = this;
            r0 = r15 & 8
            if (r0 == 0) goto L6
            ls3 r13 = defpackage.ls3.a
        L6:
            r8 = r13
            r13 = r15 & 16
            if (r13 == 0) goto Ld
            java.lang.String r14 = ""
        Ld:
            r4 = r14
            ks3 r5 = defpackage.ks3.a
            r6 = r5
            r7 = r5
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cbd.<init>(java.lang.String, java.lang.String, java.lang.String, java.util.Map, java.lang.String, int):void");
    }
}
