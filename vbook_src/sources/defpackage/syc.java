package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: syc  reason: default package */
/* loaded from: classes.dex */
public final class syc implements vad {
    public final String a;
    public final Map b;
    public final String c;
    public final String d;

    public syc(String str, String str2, String str3, Map map) {
        str.getClass();
        map.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.vad
    public final Map a() {
        return this.b;
    }

    @Override // defpackage.vad
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syc)) {
            return false;
        }
        syc sycVar = (syc) obj;
        if (c16.i(this.a, sycVar.a) && c16.i(this.b, sycVar.b) && c16.i(this.c, sycVar.c) && c16.i(this.d, sycVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(rs8.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UriVideoSource(uri=");
        sb.append(this.a);
        sb.append(", headers=");
        sb.append(this.b);
        sb.append(", mimeType=");
        return nk2.w(sb, this.c, ", baseUrl=", this.d, ")");
    }
}
