package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l84  reason: default package */
/* loaded from: classes3.dex */
public final class l84 {
    public final boolean a;
    public final boolean b;
    public final Set c;
    public final Set d;
    public final Set e;
    public final Set f;
    public final Set g;
    public final Set h;
    public final Set i;
    public final List j;
    public final List k;
    public final List l;

    public l84(boolean z, boolean z2, Set set, Set set2, Set set3, Set set4, Set set5, Set set6, Set set7, List list, List list2, List list3) {
        set.getClass();
        set2.getClass();
        set3.getClass();
        set4.getClass();
        set5.getClass();
        set6.getClass();
        set7.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = z;
        this.b = z2;
        this.c = set;
        this.d = set2;
        this.e = set3;
        this.f = set4;
        this.g = set5;
        this.h = set6;
        this.i = set7;
        this.j = list;
        this.k = list2;
        this.l = list3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v17, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.util.Set] */
    public static l84 a(l84 l84Var, boolean z, boolean z2, Set set, LinkedHashSet linkedHashSet, Set set2, LinkedHashSet linkedHashSet2, Set set3, LinkedHashSet linkedHashSet3, Set set4, ArrayList arrayList, List list, List list2, int i) {
        Set set5;
        LinkedHashSet linkedHashSet4;
        Set set6;
        LinkedHashSet linkedHashSet5;
        Set set7;
        LinkedHashSet linkedHashSet6;
        Set set8;
        ArrayList arrayList2;
        List list3;
        List list4;
        if ((i & 1) != 0) {
            z = l84Var.a;
        }
        boolean z3 = z;
        if ((i & 2) != 0) {
            z2 = l84Var.b;
        }
        boolean z4 = z2;
        if ((i & 4) != 0) {
            set5 = l84Var.c;
        } else {
            set5 = set;
        }
        if ((i & 8) != 0) {
            linkedHashSet4 = l84Var.d;
        } else {
            linkedHashSet4 = linkedHashSet;
        }
        if ((i & 16) != 0) {
            set6 = l84Var.e;
        } else {
            set6 = set2;
        }
        if ((i & 32) != 0) {
            linkedHashSet5 = l84Var.f;
        } else {
            linkedHashSet5 = linkedHashSet2;
        }
        if ((i & 64) != 0) {
            set7 = l84Var.g;
        } else {
            set7 = set3;
        }
        if ((i & Token.CASE) != 0) {
            linkedHashSet6 = l84Var.h;
        } else {
            linkedHashSet6 = linkedHashSet3;
        }
        if ((i & 256) != 0) {
            set8 = l84Var.i;
        } else {
            set8 = set4;
        }
        if ((i & 512) != 0) {
            arrayList2 = l84Var.j;
        } else {
            arrayList2 = arrayList;
        }
        if ((i & 1024) != 0) {
            list3 = l84Var.k;
        } else {
            list3 = list;
        }
        if ((i & 2048) != 0) {
            list4 = l84Var.l;
        } else {
            list4 = list2;
        }
        l84Var.getClass();
        set5.getClass();
        linkedHashSet4.getClass();
        set6.getClass();
        linkedHashSet5.getClass();
        set7.getClass();
        linkedHashSet6.getClass();
        set8.getClass();
        arrayList2.getClass();
        list3.getClass();
        list4.getClass();
        return new l84(z3, z4, set5, linkedHashSet4, set6, linkedHashSet5, set7, linkedHashSet6, set8, arrayList2, list3, list4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l84)) {
            return false;
        }
        l84 l84Var = (l84) obj;
        if (this.a == l84Var.a && this.b == l84Var.b && c16.i(this.c, l84Var.c) && c16.i(this.d, l84Var.d) && c16.i(this.e, l84Var.e) && c16.i(this.f, l84Var.f) && c16.i(this.g, l84Var.g) && c16.i(this.h, l84Var.h) && c16.i(this.i, l84Var.i) && c16.i(this.j, l84Var.j) && c16.i(this.k, l84Var.k) && c16.i(this.l, l84Var.l)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.l.hashCode() + eub.l(eub.l(s21.b(this.i, s21.b(this.h, s21.b(this.g, s21.b(this.f, s21.b(this.e, s21.b(this.d, s21.b(this.c, eub.k(Boolean.hashCode(this.a) * 31, 31, this.b), 31), 31), 31), 31), 31), 31), 31), this.j, 31), this.k, 31);
    }

    public final String toString() {
        StringBuilder p = rs8.p("ExtensionState(isLoading=", this.a, ", isNsfw=", this.b, ", categories=");
        p.append(this.c);
        p.append(", allCategories=");
        p.append(this.d);
        p.append(", languages=");
        p.append(this.e);
        p.append(", allLanguages=");
        p.append(this.f);
        p.append(", authors=");
        p.append(this.g);
        p.append(", allAuthors=");
        p.append(this.h);
        p.append(", downloadExtensions=");
        p.append(this.i);
        p.append(", updateExtensions=");
        p.append(this.j);
        p.append(", installedExtensions=");
        p.append(this.k);
        p.append(", allExtensions=");
        p.append(this.l);
        p.append(")");
        return p.toString();
    }
}
