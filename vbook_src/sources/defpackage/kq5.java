package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kq5  reason: default package */
/* loaded from: classes3.dex */
public final class kq5 {
    public final String a;
    public final List b;
    public final Set c;

    public kq5(String str, List list, Set set) {
        this.a = str;
        this.b = list;
        this.c = set;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    public static kq5 a(kq5 kq5Var, String str, ArrayList arrayList, Set set, int i) {
        if ((i & 1) != 0) {
            str = kq5Var.a;
        }
        ArrayList arrayList2 = arrayList;
        if ((i & 2) != 0) {
            arrayList2 = kq5Var.b;
        }
        if ((i & 4) != 0) {
            set = kq5Var.c;
        }
        kq5Var.getClass();
        str.getClass();
        arrayList2.getClass();
        set.getClass();
        return new kq5(str, arrayList2, set);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq5)) {
            return false;
        }
        kq5 kq5Var = (kq5) obj;
        if (c16.i(this.a, kq5Var.a) && c16.i(this.b, kq5Var.b) && c16.i(this.c, kq5Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + eub.l(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "ImageTableOfContentState(currentId=" + this.a + ", tocLinks=" + this.b + ", downloadingIds=" + this.c + ")";
    }

    public /* synthetic */ kq5() {
        this("", ks3.a, rs3.a);
    }
}
