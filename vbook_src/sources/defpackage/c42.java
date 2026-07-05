package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c42  reason: default package */
/* loaded from: classes3.dex */
public final class c42 {
    public final boolean a;
    public final boolean b;
    public final List c;

    public c42(boolean z, boolean z2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public static c42 a(c42 c42Var, boolean z, boolean z2, List list, int i) {
        if ((i & 1) != 0) {
            z = c42Var.a;
        }
        if ((i & 2) != 0) {
            z2 = c42Var.b;
        }
        if ((i & 4) != 0) {
            list = c42Var.c;
        }
        c42Var.getClass();
        list.getClass();
        return new c42(z, z2, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c42)) {
            return false;
        }
        c42 c42Var = (c42) obj;
        if (this.a == c42Var.a && this.b == c42Var.b && c16.i(this.c, c42Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.n(rs8.p("ContextMenuState(isShowOneLine=", this.a, ", isShowContextHighlight=", this.b, ", contextMenuItems="), this.c, ")");
    }
}
