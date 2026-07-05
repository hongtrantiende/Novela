package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: gfb  reason: default package */
/* loaded from: classes3.dex */
public final class gfb {
    public static final ffb Companion = new Object();
    public static final ye6[] h = {null, ipe.x(sk6.b, new tab(21)), null, null, null, null, null};
    public final String a;
    public final Map b;
    public final String c;
    public final String d;
    public final int e;
    public final long f;
    public final long g;

    public /* synthetic */ gfb(int i, String str, Map map, String str2, String str3, int i2, long j, long j2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = ls3.a;
        } else {
            this.b = map;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = 0;
        } else {
            this.e = i2;
        }
        if ((i & 32) == 0) {
            this.f = 0L;
        } else {
            this.f = j;
        }
        if ((i & 64) == 0) {
            this.g = 0L;
        } else {
            this.g = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfb)) {
            return false;
        }
        gfb gfbVar = (gfb) obj;
        if (c16.i(this.a, gfbVar.a) && c16.i(this.b, gfbVar.b) && c16.i(this.c, gfbVar.c) && c16.i(this.d, gfbVar.d) && this.e == gfbVar.e && this.f == gfbVar.f && this.g == gfbVar.g) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = rs8.a(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (a + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return Long.hashCode(this.g) + hl5.c(hl5.a(this.e, (i2 + i) * 31, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SyncTocLink(id=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", path=");
        nk2.C(sb, this.c, ", parentId=", this.d, ", position=");
        sb.append(this.e);
        sb.append(", createAt=");
        sb.append(this.f);
        return a82.n(sb, ", updateAt=", this.g, ")");
    }

    public gfb(String str, Map map, String str2, String str3, int i, long j, long j2) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = j;
        this.g = j2;
    }
}
