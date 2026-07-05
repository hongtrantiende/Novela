package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gv2  reason: default package */
/* loaded from: classes.dex */
public final class gv2 {
    public final xl0 a;
    public final int b;
    public final List c;

    public gv2(xl0 xl0Var, int i) {
        ArrayList arrayList = new ArrayList();
        this.a = xl0Var;
        this.b = i;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gv2)) {
            return false;
        }
        gv2 gv2Var = (gv2) obj;
        if (c16.i(this.a, gv2Var.a) && this.b == gv2Var.b && c16.i(this.c, gv2Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ListNode(block=");
        sb.append(this.a);
        sb.append(", depth=");
        sb.append(this.b);
        sb.append(", children=");
        return rs8.n(sb, this.c, ")");
    }
}
