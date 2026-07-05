package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sb0  reason: default package */
/* loaded from: classes.dex */
public final class sb0 extends da2 {
    public final String a;
    public final int b;
    public final List c;

    public sb0(int i, String str, List list) {
        this.a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof da2) {
            sb0 sb0Var = (sb0) ((da2) obj);
            if (this.a.equals(sb0Var.a) && this.b == sb0Var.b && this.c.equals(sb0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Thread{name=");
        sb.append(this.a);
        sb.append(", importance=");
        sb.append(this.b);
        sb.append(", frames=");
        return rs8.n(sb, this.c, "}");
    }
}
