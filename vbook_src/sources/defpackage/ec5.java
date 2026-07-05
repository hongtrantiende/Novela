package defpackage;

import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ec5  reason: default package */
/* loaded from: classes3.dex */
public final class ec5 implements gc5 {
    public final String a;
    public final Map b;
    public final ArrayList c;
    public final int d;
    public final int e;

    public ec5(String str, Map map, ArrayList arrayList, int i, int i2) {
        str.getClass();
        map.getClass();
        this.a = str;
        this.b = map;
        this.c = arrayList;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ec5) {
                ec5 ec5Var = (ec5) obj;
                if (!c16.i(this.a, ec5Var.a) || !c16.i(this.b, ec5Var.b) || !this.c.equals(ec5Var.c) || this.d != ec5Var.d || this.e != ec5Var.e) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int a = rs8.a(this.a.hashCode() * 31, 31, this.b);
        return Integer.hashCode(this.e) + hl5.a(this.d, (this.c.hashCode() + a) * 31, 31);
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
