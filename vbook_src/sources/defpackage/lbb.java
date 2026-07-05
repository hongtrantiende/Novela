package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: lbb  reason: default package */
/* loaded from: classes3.dex */
public final class lbb {
    public static final kbb Companion = new Object();
    public static final ye6[] f = {null, null, ipe.x(sk6.b, new tab(3)), null, null};
    public final String a;
    public final int b;
    public final Map c;
    public final long d;
    public final long e;

    public /* synthetic */ lbb(int i, String str, int i2, Map map, long j, long j2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = ls3.a;
        } else {
            this.c = map;
        }
        if ((i & 8) == 0) {
            this.d = 0L;
        } else {
            this.d = j;
        }
        if ((i & 16) == 0) {
            this.e = 0L;
        } else {
            this.e = j2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbb)) {
            return false;
        }
        lbb lbbVar = (lbb) obj;
        if (c16.i(this.a, lbbVar.a) && this.b == lbbVar.b && c16.i(this.c, lbbVar.c) && this.d == lbbVar.d && this.e == lbbVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + hl5.c(rs8.a(hl5.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), this.d, 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("SyncContent(id=", this.a, ", position=", this.b, ", content=");
        s.append(this.c);
        s.append(", createAt=");
        s.append(this.d);
        return a82.n(s, ", updateAt=", this.e, ")");
    }
}
