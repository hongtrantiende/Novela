package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bzc  reason: default package */
/* loaded from: classes3.dex */
public final class bzc {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final List f;

    public bzc(String str, String str2, String str3, int i, boolean z, List list) {
        rs8.w(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = z;
        this.f = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bzc) {
                bzc bzcVar = (bzc) obj;
                if (!c16.i(this.a, bzcVar.a) || !c16.i(this.b, bzcVar.b) || !c16.i(this.c, bzcVar.c) || this.d != bzcVar.d || this.e != bzcVar.e || !this.f.equals(bzcVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f.hashCode() + eub.k(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder y = nk2.y("User(id=", this.a, ", name=", this.b, ", avatar=");
        a82.u(this.d, this.c, ", role=", ", premium=", y);
        y.append(this.e);
        y.append(", color=");
        y.append(this.f);
        y.append(")");
        return y.toString();
    }
}
