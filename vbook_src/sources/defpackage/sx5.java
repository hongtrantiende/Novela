package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sx5  reason: default package */
/* loaded from: classes3.dex */
public final class sx5 {
    public final String a;
    public final ux5 b;
    public final List c;

    public sx5(String str, ux5 ux5Var, List list) {
        str.getClass();
        ux5Var.getClass();
        this.a = str;
        this.b = ux5Var;
        this.c = list;
    }

    public static sx5 a(sx5 sx5Var, ux5 ux5Var, List list, int i) {
        String str = sx5Var.a;
        if ((i & 4) != 0) {
            list = sx5Var.c;
        }
        sx5Var.getClass();
        str.getClass();
        list.getClass();
        return new sx5(str, ux5Var, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx5)) {
            return false;
        }
        sx5 sx5Var = (sx5) obj;
        if (c16.i(this.a, sx5Var.a) && this.b == sx5Var.b && c16.i(this.c, sx5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstallSourceState(url=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", extensions=");
        return rs8.n(sb, this.c, ")");
    }

    public /* synthetic */ sx5(String str, int i) {
        this((i & 1) != 0 ? "" : str, ux5.a, ks3.a);
    }
}
