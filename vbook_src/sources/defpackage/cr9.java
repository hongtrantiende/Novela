package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cr9  reason: default package */
/* loaded from: classes3.dex */
public final class cr9 {
    public final Set a;
    public final String b;
    public final long c;
    public final long d;

    public cr9(Set set, String str, long j, long j2) {
        this.a = set;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof cr9) {
                cr9 cr9Var = (cr9) obj;
                if (!this.a.equals(cr9Var.a) || !this.b.equals(cr9Var.b) || this.c != cr9Var.c || this.d != cr9Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + hl5.c(eub.j(this.a.hashCode() * 31, 31, this.b), this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ResourceItem(qualifiers=");
        sb.append(this.a);
        sb.append(", path=");
        sb.append(this.b);
        sb.append(", offset=");
        sb.append(this.c);
        return a82.n(sb, ", size=", this.d, ")");
    }
}
