package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: a0d  reason: default package */
/* loaded from: classes3.dex */
public final class a0d {
    public static final zzc Companion = new Object();
    public static final ye6[] j = {null, null, null, null, null, null, null, null, ipe.x(sk6.b, new tvc(8))};
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final boolean f;
    public final int g;
    public final String h;
    public final List i;

    public /* synthetic */ a0d(int i, String str, String str2, String str3, String str4, int i2, boolean z, int i3, String str5, List list) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = "";
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = "";
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
        if ((i & 64) == 0) {
            this.g = 0;
        } else {
            this.g = i3;
        }
        if ((i & Token.CASE) == 0) {
            this.h = "";
        } else {
            this.h = str5;
        }
        if ((i & 256) == 0) {
            this.i = ks3.a;
        } else {
            this.i = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0d)) {
            return false;
        }
        a0d a0dVar = (a0d) obj;
        if (c16.i(this.a, a0dVar.a) && c16.i(this.b, a0dVar.b) && c16.i(this.c, a0dVar.c) && c16.i(this.d, a0dVar.d) && this.e == a0dVar.e && this.f == a0dVar.f && this.g == a0dVar.g && c16.i(this.h, a0dVar.h) && c16.i(this.i, a0dVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode() + eub.j(hl5.a(this.g, eub.k(hl5.a(this.e, eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31), 31, this.h);
    }

    public final String toString() {
        StringBuilder y = nk2.y("UserInfoDto(id=", this.a, ", name=", this.b, ", email=");
        nk2.C(y, this.c, ", avatar=", this.d, ", role=");
        eub.w(y, this.e, ", premium=", this.f, ", exp=");
        nk2.z(this.g, ", color=", this.h, ", extraColor=", y);
        return rs8.n(y, this.i, ")");
    }

    public a0d() {
        this.a = "";
        this.b = "";
        this.c = "";
        this.d = "";
        this.e = 0;
        this.f = false;
        this.g = 0;
        this.h = "";
        this.i = ks3.a;
    }
}
