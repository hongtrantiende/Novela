package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qua  reason: default package */
/* loaded from: classes3.dex */
public final class qua {
    public final String a;
    public final String b;
    public final String c;
    public final LinkedHashMap d;
    public final String e;
    public final ArrayList f;
    public final List g;
    public final List h;

    public qua(String str, String str2, String str3, LinkedHashMap linkedHashMap, String str4, ArrayList arrayList, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = linkedHashMap;
        this.e = str4;
        this.f = arrayList;
        this.g = list;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qua) {
                qua quaVar = (qua) obj;
                if (!c16.i(this.a, quaVar.a) || !c16.i(this.b, quaVar.b) || !c16.i(this.c, quaVar.c) || !this.d.equals(quaVar.d) || !this.e.equals(quaVar.e) || !this.f.equals(quaVar.f) || !c16.i(this.g, quaVar.g) || !c16.i(this.h, quaVar.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.h.hashCode() + eub.l((this.f.hashCode() + eub.j((this.d.hashCode() + eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e)) * 31, this.g, 31);
    }

    public final String toString() {
        StringBuilder y = nk2.y("SourceTrackContent(kind=", this.a, ", mimeType=", this.b, ", data=");
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
}
