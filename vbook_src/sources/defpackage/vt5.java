package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vt5  reason: default package */
/* loaded from: classes3.dex */
public final class vt5 {
    public static final vt5 d = new vt5(false, false, ks3.a);
    public final boolean a;
    public final boolean b;
    public final List c;

    public vt5(boolean z, boolean z2, List list) {
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vt5) {
                vt5 vt5Var = (vt5) obj;
                if (this.a != vt5Var.a || this.b != vt5Var.b || !this.c.equals(vt5Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.k(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.n(rs8.p("IndentationState(canIndentForward=", this.a, ", canIndentBackward=", this.b, ", targetBlockIds="), this.c, ")");
    }
}
