package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u43  reason: default package */
/* loaded from: classes3.dex */
public final class u43 {
    public final String a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public u43(String str, List list, boolean z, boolean z2) {
        this.a = str;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u43) {
                u43 u43Var = (u43) obj;
                if (!this.a.equals(u43Var.a) || !this.b.equals(u43Var.b) || this.c != u43Var.c || this.d != u43Var.d) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + eub.k(eub.l(this.a.hashCode() * 31, this.b, 31), 31, this.c);
    }

    public final String toString() {
        return "DetailSection(title=" + this.a + ", chapters=" + this.b + ", isGrid=" + this.c + ", isReverted=" + this.d + ")";
    }
}
