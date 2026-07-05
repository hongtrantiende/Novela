package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bbd  reason: default package */
/* loaded from: classes.dex */
public final class bbd {
    public final String a;
    public final Map b;
    public final String c;
    public final String d;
    public final String e;

    public bbd(String str, Map map, String str2, String str3, String str4) {
        str.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbd)) {
            return false;
        }
        bbd bbdVar = (bbd) obj;
        if (c16.i(this.a, bbdVar.a) && c16.i(this.b, bbdVar.b) && c16.i(this.c, bbdVar.c) && c16.i(this.d, bbdVar.d) && c16.i(this.e, bbdVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + eub.j(eub.j(rs8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoSourceTrackAudio(data=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", type=");
        nk2.C(sb, this.c, ", label=", this.d, ", language=");
        return s21.q(sb, this.e, ")");
    }
}
