package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: vzc  reason: default package */
/* loaded from: classes3.dex */
public final class vzc {
    public static final uzc Companion = new Object();
    public static final ye6[] i = {null, null, null, null, null, null, null, ipe.x(sk6.b, new tvc(7))};
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final boolean e;
    public final int f;
    public final String g;
    public final List h;

    public /* synthetic */ vzc(int i2, String str, String str2, String str3, int i3, boolean z, int i4, String str4, List list) {
        if ((i2 & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i3;
        }
        if ((i2 & 16) == 0) {
            this.e = false;
        } else {
            this.e = z;
        }
        if ((i2 & 32) == 0) {
            this.f = 0;
        } else {
            this.f = i4;
        }
        if ((i2 & 64) == 0) {
            this.g = "";
        } else {
            this.g = str4;
        }
        if ((i2 & Token.CASE) == 0) {
            this.h = ks3.a;
        } else {
            this.h = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzc)) {
            return false;
        }
        vzc vzcVar = (vzc) obj;
        if (c16.i(this.a, vzcVar.a) && c16.i(this.b, vzcVar.b) && c16.i(this.c, vzcVar.c) && this.d == vzcVar.d && this.e == vzcVar.e && this.f == vzcVar.f && c16.i(this.g, vzcVar.g) && c16.i(this.h, vzcVar.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + eub.j(hl5.a(this.f, eub.k(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder y = nk2.y("UserDto(id=", this.a, ", name=", this.b, ", avatar=");
        a82.u(this.d, this.c, ", role=", ", premium=", y);
        y.append(this.e);
        y.append(", exp=");
        y.append(this.f);
        y.append(", color=");
        y.append(this.g);
        y.append(", extraColor=");
        y.append(this.h);
        y.append(")");
        return y.toString();
    }

    public vzc() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = false;
        this.f = 0;
        this.g = "";
        this.h = ks3.a;
    }
}
