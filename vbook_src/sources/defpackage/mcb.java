package defpackage;

import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: mcb  reason: default package */
/* loaded from: classes3.dex */
public final class mcb {
    public static final lcb Companion = new Object();
    public static final ye6[] y;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final Map p;
    public final Map q;
    public final Map r;
    public final Map s;
    public final Map t;
    public final long u;
    public final long v;
    public final long w;
    public final long x;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, lcb] */
    static {
        tab tabVar = new tab(5);
        sk6 sk6Var = sk6.b;
        y = new ye6[]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, ipe.x(sk6Var, tabVar), ipe.x(sk6Var, new tab(6)), ipe.x(sk6Var, new tab(7)), ipe.x(sk6Var, new tab(8)), ipe.x(sk6Var, new tab(9)), null, null, null, null};
    }

    public /* synthetic */ mcb(int i, String str, String str2, String str3, int i2, String str4, String str5, String str6, String str7, String str8, String str9, int i3, boolean z, boolean z2, boolean z3, boolean z4, Map map, Map map2, Map map3, Map map4, Map map5, long j, long j2, long j3, long j4) {
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
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = "";
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = "";
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = "";
        } else {
            this.g = str6;
        }
        if ((i & Token.CASE) == 0) {
            this.h = "";
        } else {
            this.h = str7;
        }
        if ((i & 256) == 0) {
            this.i = "";
        } else {
            this.i = str8;
        }
        if ((i & 512) == 0) {
            this.j = "";
        } else {
            this.j = str9;
        }
        if ((i & 1024) == 0) {
            this.k = 0;
        } else {
            this.k = i3;
        }
        if ((i & 2048) == 0) {
            this.l = false;
        } else {
            this.l = z;
        }
        if ((i & 4096) == 0) {
            this.m = false;
        } else {
            this.m = z2;
        }
        if ((i & 8192) == 0) {
            this.n = false;
        } else {
            this.n = z3;
        }
        if ((i & 16384) == 0) {
            this.o = false;
        } else {
            this.o = z4;
        }
        int i4 = 32768 & i;
        ls3 ls3Var = ls3.a;
        if (i4 == 0) {
            this.p = ls3Var;
        } else {
            this.p = map;
        }
        if ((65536 & i) == 0) {
            this.q = ls3Var;
        } else {
            this.q = map2;
        }
        if ((131072 & i) == 0) {
            this.r = ls3Var;
        } else {
            this.r = map3;
        }
        if ((262144 & i) == 0) {
            this.s = ls3Var;
        } else {
            this.s = map4;
        }
        if ((524288 & i) == 0) {
            this.t = ls3Var;
        } else {
            this.t = map5;
        }
        if ((1048576 & i) == 0) {
            this.u = 0L;
        } else {
            this.u = j;
        }
        if ((2097152 & i) == 0) {
            this.v = 0L;
        } else {
            this.v = j2;
        }
        if ((4194304 & i) == 0) {
            this.w = 0L;
        } else {
            this.w = j3;
        }
        if ((i & 8388608) == 0) {
            this.x = 0L;
        } else {
            this.x = j4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mcb)) {
            return false;
        }
        mcb mcbVar = (mcb) obj;
        if (c16.i(this.a, mcbVar.a) && c16.i(this.b, mcbVar.b) && c16.i(this.c, mcbVar.c) && this.d == mcbVar.d && c16.i(this.e, mcbVar.e) && c16.i(this.f, mcbVar.f) && c16.i(this.g, mcbVar.g) && c16.i(this.h, mcbVar.h) && c16.i(this.i, mcbVar.i) && c16.i(this.j, mcbVar.j) && this.k == mcbVar.k && this.l == mcbVar.l && this.m == mcbVar.m && this.n == mcbVar.n && this.o == mcbVar.o && c16.i(this.p, mcbVar.p) && c16.i(this.q, mcbVar.q) && c16.i(this.r, mcbVar.r) && c16.i(this.s, mcbVar.s) && c16.i(this.t, mcbVar.t) && this.u == mcbVar.u && this.v == mcbVar.v && this.w == mcbVar.w && this.x == mcbVar.x) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.x) + hl5.c(hl5.c(hl5.c(rs8.a(rs8.a(rs8.a(rs8.a(rs8.a(eub.k(eub.k(eub.k(eub.k(hl5.a(this.k, eub.j(eub.j(eub.j(eub.j(eub.j(eub.j(hl5.a(this.d, eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q), 31, this.r), 31, this.s), 31, this.t), this.u, 31), this.v, 31), this.w, 31);
    }

    public final String toString() {
        StringBuilder y2 = nk2.y("SyncExtension(id=", this.a, ", name=", this.b, ", author=");
        a82.u(this.d, this.c, ", version=", ", source=", y2);
        nk2.C(y2, this.e, ", path=", this.f, ", regex=");
        nk2.C(y2, this.g, ", icon=", this.h, ", description=");
        nk2.C(y2, this.i, ", language=", this.j, ", type=");
        eub.w(y2, this.k, ", nsfw=", this.l, ", development=");
        rs8.z(y2, this.m, ", draft=", this.n, ", encrypt=");
        y2.append(this.o);
        y2.append(", scriptMetadata=");
        y2.append(this.p);
        y2.append(", settingMetadata=");
        y2.append(this.q);
        y2.append(", scriptData=");
        y2.append(this.r);
        y2.append(", settingData=");
        y2.append(this.s);
        y2.append(", translateData=");
        y2.append(this.t);
        y2.append(", pinedAt=");
        y2.append(this.u);
        rs8.x(y2, ", lastUse=", this.v, ", createAt=");
        y2.append(this.w);
        return a82.n(y2, ", updateAt=", this.x, ")");
    }

    public mcb(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, String str8, String str9, int i2, boolean z, boolean z2, boolean z3, boolean z4, Map map, Map map2, Map map3, Map map4, Map map5, long j, long j2, long j3, long j4) {
        s21.B(str, str2, str3, str4, str5);
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        map.getClass();
        map2.getClass();
        map3.getClass();
        map4.getClass();
        map5.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = i2;
        this.l = z;
        this.m = z2;
        this.n = z3;
        this.o = z4;
        this.p = map;
        this.q = map2;
        this.r = map3;
        this.s = map4;
        this.t = map5;
        this.u = j;
        this.v = j2;
        this.w = j3;
        this.x = j4;
    }
}
