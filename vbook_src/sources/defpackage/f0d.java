package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f0d  reason: default package */
/* loaded from: classes3.dex */
public final class f0d {
    public final boolean a;
    public final boolean b;
    public final List c;

    public f0d(boolean z, boolean z2, List list) {
        list.getClass();
        this.a = z;
        this.b = z2;
        this.c = list;
    }

    public static f0d a(f0d f0dVar, List list) {
        boolean z = f0dVar.a;
        boolean z2 = f0dVar.b;
        f0dVar.getClass();
        return new f0d(z, z2, list);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f0d) {
                f0d f0dVar = (f0d) obj;
                if (this.a != f0dVar.a || this.b != f0dVar.b || !c16.i(this.c, f0dVar.c)) {
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
        return rs8.n(rs8.p("UserListState(isLoading=", this.a, ", hasMore=", this.b, ", users="), this.c, ")");
    }
}
