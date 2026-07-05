package defpackage;

import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: phc  reason: default package */
/* loaded from: classes3.dex */
public final class phc {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final w43 g;
    public final List h;
    public final List i;
    public final Map j;

    public phc(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, w43 w43Var, List list, List list2, Map map) {
        list.getClass();
        map.getClass();
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = w43Var;
        this.h = list;
        this.i = list2;
        this.j = map;
    }

    public static phc a(phc phcVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, w43 w43Var, List list, List list2, Map map, int i) {
        boolean z7;
        boolean z8;
        w43 w43Var2;
        List list3;
        List list4;
        Map map2;
        if ((i & 1) != 0) {
            z = phcVar.a;
        }
        boolean z9 = z;
        if ((i & 2) != 0) {
            z2 = phcVar.b;
        }
        boolean z10 = z2;
        if ((i & 4) != 0) {
            z3 = phcVar.c;
        }
        boolean z11 = z3;
        if ((i & 8) != 0) {
            z4 = phcVar.d;
        }
        boolean z12 = z4;
        if ((i & 16) != 0) {
            z7 = phcVar.e;
        } else {
            z7 = z5;
        }
        if ((i & 32) != 0) {
            z8 = phcVar.f;
        } else {
            z8 = z6;
        }
        if ((i & 64) != 0) {
            w43Var2 = phcVar.g;
        } else {
            w43Var2 = w43Var;
        }
        if ((i & Token.CASE) != 0) {
            list3 = phcVar.h;
        } else {
            list3 = list;
        }
        if ((i & 256) != 0) {
            list4 = phcVar.i;
        } else {
            list4 = list2;
        }
        if ((i & 512) != 0) {
            map2 = phcVar.j;
        } else {
            map2 = map;
        }
        phcVar.getClass();
        list3.getClass();
        map2.getClass();
        return new phc(z9, z10, z11, z12, z7, z8, w43Var2, list3, list4, map2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof phc)) {
            return false;
        }
        phc phcVar = (phc) obj;
        if (this.a == phcVar.a && this.b == phcVar.b && this.c == phcVar.c && this.d == phcVar.d && this.e == phcVar.e && this.f == phcVar.f && c16.i(this.g, phcVar.g) && c16.i(this.h, phcVar.h) && c16.i(this.i, phcVar.i) && c16.i(this.j, phcVar.j)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int k = eub.k(eub.k(eub.k(eub.k(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        int i = 0;
        w43 w43Var = this.g;
        if (w43Var == null) {
            hashCode = 0;
        } else {
            hashCode = w43Var.hashCode();
        }
        int l = eub.l((k + hashCode) * 31, this.h, 31);
        List list = this.i;
        if (list != null) {
            i = list.hashCode();
        }
        return this.j.hashCode() + ((l + i) * 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("TopicDetailState(isLoading=", this.a, ", isLoadingMore=", this.b, ", isError=");
        rs8.z(p, this.c, ", hasMore=", this.d, ", isSendingReply=");
        rs8.z(p, this.e, ", sortNewestFirst=", this.f, ", topic=");
        p.append(this.g);
        p.append(", posts=");
        p.append(this.h);
        p.append(", topicBlocks=");
        p.append(this.i);
        p.append(", postBlocks=");
        p.append(this.j);
        p.append(")");
        return p.toString();
    }
}
