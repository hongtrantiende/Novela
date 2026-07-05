package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h83  reason: default package */
/* loaded from: classes3.dex */
public final class h83 {
    public final boolean a;
    public final boolean b;
    public final String c;
    public final List d;

    public h83(String str, List list, boolean z, boolean z2) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = list;
    }

    public static h83 a(h83 h83Var, boolean z, boolean z2, String str, List list, int i) {
        if ((i & 1) != 0) {
            z = h83Var.a;
        }
        if ((i & 2) != 0) {
            z2 = h83Var.b;
        }
        if ((i & 4) != 0) {
            str = h83Var.c;
        }
        if ((i & 8) != 0) {
            list = h83Var.d;
        }
        h83Var.getClass();
        list.getClass();
        return new h83(str, list, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h83) {
                h83 h83Var = (h83) obj;
                if (this.a != h83Var.a || this.b != h83Var.b || !this.c.equals(h83Var.c) || !c16.i(this.d, h83Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.j(eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder p = rs8.p("DiscoveryGenreContentState(isLoading=", this.a, ", isError=", this.b, ", errorMessage=");
        p.append(this.c);
        p.append(", genres=");
        p.append(this.d);
        p.append(")");
        return p.toString();
    }
}
