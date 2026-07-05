package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ob0  reason: default package */
/* loaded from: classes.dex */
public final class ob0 extends ea2 {
    public final List a;
    public final aa2 b;
    public final s92 c;
    public final rb0 d;
    public final List e;

    public ob0(List list, qb0 qb0Var, s92 s92Var, rb0 rb0Var, List list2) {
        this.a = list;
        this.b = qb0Var;
        this.c = s92Var;
        this.d = rb0Var;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ea2) {
                ea2 ea2Var = (ea2) obj;
                List list = this.a;
                if (list == null) {
                    if (((ob0) ea2Var).a != null) {
                        return false;
                    }
                } else if (!list.equals(((ob0) ea2Var).a)) {
                    return false;
                }
                aa2 aa2Var = this.b;
                if (aa2Var == null) {
                    if (((ob0) ea2Var).b != null) {
                        return false;
                    }
                } else if (!aa2Var.equals(((ob0) ea2Var).b)) {
                    return false;
                }
                s92 s92Var = this.c;
                if (s92Var == null) {
                    if (((ob0) ea2Var).c != null) {
                        return false;
                    }
                } else if (!s92Var.equals(((ob0) ea2Var).c)) {
                    return false;
                }
                ob0 ob0Var = (ob0) ea2Var;
                if (this.d.equals(ob0Var.d) && this.e.equals(ob0Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        List list = this.a;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        aa2 aa2Var = this.b;
        if (aa2Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aa2Var.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        s92 s92Var = this.c;
        if (s92Var != null) {
            i = s92Var.hashCode();
        }
        return this.e.hashCode() ^ ((((i ^ i3) * 1000003) ^ this.d.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Execution{threads=");
        sb.append(this.a);
        sb.append(", exception=");
        sb.append(this.b);
        sb.append(", appExitInfo=");
        sb.append(this.c);
        sb.append(", signal=");
        sb.append(this.d);
        sb.append(", binaries=");
        return rs8.n(sb, this.e, "}");
    }
}
