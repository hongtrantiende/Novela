package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wzc  reason: default package */
/* loaded from: classes3.dex */
public final class wzc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final List h;

    public wzc(String str, String str2, String str3, String str4, int i, boolean z, boolean z2, List list) {
        hl5.z(str, str2, str3, str4);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = z;
        this.g = z2;
        this.h = list;
    }

    public static wzc a(wzc wzcVar, boolean z, List list, int i) {
        String str = wzcVar.a;
        String str2 = wzcVar.b;
        String str3 = wzcVar.c;
        String str4 = wzcVar.d;
        int i2 = wzcVar.e;
        if ((i & 32) != 0) {
            z = wzcVar.f;
        }
        boolean z2 = wzcVar.g;
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        return new wzc(str, str2, str3, str4, i2, z, z2, list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wzc) {
                wzc wzcVar = (wzc) obj;
                if (!c16.i(this.a, wzcVar.a) || !c16.i(this.b, wzcVar.b) || !c16.i(this.c, wzcVar.c) || !c16.i(this.d, wzcVar.d) || this.e != wzcVar.e || this.f != wzcVar.f || this.g != wzcVar.g || !this.h.equals(wzcVar.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.h.hashCode() + eub.k(eub.k(hl5.a(this.e, eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder y = nk2.y("UserInfo(id=", this.a, ", name=", this.b, ", email=");
        nk2.C(y, this.c, ", avatar=", this.d, ", role=");
        eub.w(y, this.e, ", premium=", this.f, ", verified=");
        y.append(this.g);
        y.append(", color=");
        y.append(this.h);
        y.append(")");
        return y.toString();
    }
}
