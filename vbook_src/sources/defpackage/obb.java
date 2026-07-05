package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
@u9a
/* renamed from: obb  reason: default package */
/* loaded from: classes3.dex */
public final class obb {
    public static final nbb Companion = new Object();
    public static final ye6[] f = {null, null, ipe.x(sk6.b, new tab(4)), null, null};
    public final String a;
    public final int b;
    public final List c;
    public final long d;
    public final long e;

    public /* synthetic */ obb(int i, String str, int i2, List list, long j, long j2) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = 0;
        } else {
            this.b = i2;
        }
        if ((i & 4) == 0) {
            this.c = ks3.a;
        } else {
            this.c = list;
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
        if (!(obj instanceof obb)) {
            return false;
        }
        obb obbVar = (obb) obj;
        if (c16.i(this.a, obbVar.a) && this.b == obbVar.b && c16.i(this.c, obbVar.c) && this.d == obbVar.d && this.e == obbVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + hl5.c(eub.l(hl5.a(this.b, this.a.hashCode() * 31, 31), this.c, 31), this.d, 31);
    }

    public final String toString() {
        StringBuilder s = s21.s("SyncContentMeta(id=", this.a, ", position=", this.b, ", keys=");
        s.append(this.c);
        s.append(", createAt=");
        s.append(this.d);
        return a82.n(s, ", updateAt=", this.e, ")");
    }

    public obb(String str, int i, ArrayList arrayList, long j, long j2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = arrayList;
        this.d = j;
        this.e = j2;
    }
}
