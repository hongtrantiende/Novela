package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q9a  reason: default package */
/* loaded from: classes3.dex */
public final class q9a implements o9a, h51 {
    public final String a;
    public final bze b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final o9a[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final o9a[] k;
    public final mfb l;

    public q9a(String str, bze bzeVar, int i, List list, hi1 hi1Var) {
        this.a = str;
        this.b = bzeVar;
        this.c = i;
        this.d = hi1Var.b;
        ArrayList arrayList = hi1Var.c;
        this.e = sl1.A0(arrayList);
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = q1d.f(hi1Var.e);
        this.h = (List[]) hi1Var.f.toArray(new List[0]);
        ArrayList arrayList2 = hi1Var.g;
        arrayList2.getClass();
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            zArr[i2] = ((Boolean) obj).booleanValue();
            i2++;
        }
        this.i = zArr;
        String[] strArr = this.f;
        strArr.getClass();
        eu5 eu5Var = new eu5(new ve(strArr, 12), 0);
        ArrayList arrayList3 = new ArrayList(tl1.s(eu5Var, 10));
        Iterator it = eu5Var.iterator();
        while (true) {
            il3 il3Var = (il3) it;
            if (il3Var.b.hasNext()) {
                du5 du5Var = (du5) il3Var.next();
                arrayList3.add(new yk8(du5Var.b, Integer.valueOf(du5Var.a)));
            } else {
                this.j = o17.x(arrayList3);
                this.k = q1d.f(list);
                this.l = new mfb(new ak9(this, 13));
                return;
            }
        }
    }

    @Override // defpackage.o9a
    public final String a() {
        return this.a;
    }

    @Override // defpackage.h51
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.o9a
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.o9a
    public final bze e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q9a) {
                o9a o9aVar = (o9a) obj;
                if (this.a.equals(o9aVar.a()) && Arrays.equals(this.k, ((q9a) obj).k)) {
                    int f = o9aVar.f();
                    int i = this.c;
                    if (i == f) {
                        for (int i2 = 0; i2 < i; i2++) {
                            o9a[] o9aVarArr = this.g;
                            if (c16.i(o9aVarArr[i2].a(), o9aVar.i(i2).a()) && c16.i(o9aVarArr[i2].e(), o9aVar.i(i2).e())) {
                            }
                        }
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.o9a
    public final int f() {
        return this.c;
    }

    @Override // defpackage.o9a
    public final String g(int i) {
        return this.f[i];
    }

    @Override // defpackage.o9a
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.o9a
    public final List h(int i) {
        return this.h[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.o9a
    public final o9a i(int i) {
        return this.g[i];
    }

    @Override // defpackage.o9a
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return hc2.t(this);
    }
}
