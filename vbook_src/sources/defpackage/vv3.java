package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vv3  reason: default package */
/* loaded from: classes.dex */
public final class vv3 {
    public final String a;
    public final String b;
    public final List c;

    public vv3(String str, String str2, List list) {
        str.getClass();
        str2.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vv3)) {
            return false;
        }
        vv3 vv3Var = (vv3) obj;
        if (c16.i(this.a, vv3Var.a) && c16.i(this.b, vv3Var.b) && c16.i(this.c, vv3Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.j(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rs8.n(nk2.y("EpubReference(href=", this.a, ", text=", this.b, ", children="), this.c, ")");
    }
}
