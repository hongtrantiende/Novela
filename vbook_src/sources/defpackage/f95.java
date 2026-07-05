package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f95  reason: default package */
/* loaded from: classes3.dex */
public final class f95 {
    public final int a;
    public final int b;
    public final List c;

    public f95(int i, List list, int i2) {
        list.getClass();
        this.a = i;
        this.b = i2;
        this.c = list;
    }

    public static f95 a(f95 f95Var, int i, int i2, List list, int i3) {
        if ((i3 & 1) != 0) {
            i = f95Var.a;
        }
        if ((i3 & 2) != 0) {
            i2 = f95Var.b;
        }
        f95Var.getClass();
        if ((i3 & 8) != 0) {
            list = f95Var.c;
        }
        f95Var.getClass();
        list.getClass();
        return new f95(i, list, i2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f95) {
                f95 f95Var = (f95) obj;
                if (this.a != f95Var.a || this.b != f95Var.b || !c16.i(this.c, f95Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + hl5.a(0, hl5.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return rs8.n(hl5.r(this.a, this.b, "HomeState(filterTab=", ", downloadCount=", ", messageCount=0, tabBookCount="), this.c, ")");
    }
}
