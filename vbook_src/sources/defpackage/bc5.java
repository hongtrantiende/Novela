package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bc5  reason: default package */
/* loaded from: classes3.dex */
public final class bc5 implements dc5 {
    public final String a;
    public final Map b;
    public final List c;
    public final int d;
    public final int e;

    public bc5(String str, Map map, List list, int i, int i2) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
        this.c = list;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.dc5
    public final int a() {
        return this.d;
    }

    @Override // defpackage.dc5
    public final int b() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bc5) {
                bc5 bc5Var = (bc5) obj;
                if (!c16.i(this.a, bc5Var.a) || !c16.i(this.b, bc5Var.b) || !this.c.equals(bc5Var.c) || this.d != bc5Var.d || this.e != bc5Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + hl5.a(this.d, eub.l(rs8.a(this.a.hashCode() * 31, 31, this.b), this.c, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Element(tag=");
        sb.append(this.a);
        sb.append(", attrs=");
        sb.append(this.b);
        sb.append(", children=");
        sb.append(this.c);
        sb.append(", sourceStart=");
        sb.append(this.d);
        sb.append(", sourceEndExclusive=");
        return rs8.g(this.e, ")", sb);
    }
}
