package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dd5  reason: default package */
/* loaded from: classes3.dex */
public final class dd5 {
    public final String a;
    public final LinkedHashMap b;
    public final int c;
    public final List d;

    public dd5(String str, LinkedHashMap linkedHashMap, int i) {
        ArrayList arrayList = new ArrayList();
        this.a = str;
        this.b = linkedHashMap;
        this.c = i;
        this.d = arrayList;
    }

    public final bc5 a(int i) {
        return new bc5(this.a, this.b, sl1.C0(this.d), this.c, i);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof dd5) {
                dd5 dd5Var = (dd5) obj;
                if (!c16.i(this.a, dd5Var.a) || !c16.i(this.b, dd5Var.b) || this.c != dd5Var.c || !c16.i(this.d, dd5Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.d.hashCode() + hl5.a(this.c, (hashCode + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ElementBuilder(tag=" + this.a + ", attrs=" + this.b + ", sourceStart=" + this.c + ", children=" + this.d + ")";
    }
}
