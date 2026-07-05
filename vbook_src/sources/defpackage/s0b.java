package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s0b  reason: default package */
/* loaded from: classes.dex */
public final class s0b {
    public static final s0b n;
    public final g96 a;
    public final List b;
    public final List c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final tu7 j;
    public final tu7 k;
    public final boolean l;
    public List m;

    static {
        g96 g96Var = g96.D;
        ks3 ks3Var = ks3.a;
        n = new s0b(g96Var, ks3Var, ks3Var, nae.e, nae.e, nae.e, nae.e);
    }

    public s0b(g96 g96Var, List list, List list2, float f, float f2, float f3, float f4) {
        float max;
        float max2;
        this.a = g96Var;
        this.b = list;
        this.c = list2;
        this.d = f;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        if (list.isEmpty()) {
            max = 0.0f;
        } else {
            max = Math.max(((f96) sl1.c0((List) sl1.j0(list))).c - ((f96) sl1.c0((List) sl1.c0(list))).c, f3);
        }
        this.h = max;
        if (list2.isEmpty()) {
            max2 = 0.0f;
        } else {
            max2 = Math.max(((f96) sl1.j0((List) sl1.c0(list2))).c - ((f96) sl1.j0((List) sl1.j0(list2))).c, f4);
        }
        this.i = max2;
        boolean z = true;
        this.j = r1d.g(max, list, true);
        this.k = r1d.g(max2, list2, false);
        this.l = (g96Var.a.isEmpty() || f == nae.e || a() == nae.e) ? false : z;
    }

    public final float a() {
        return this.a.b().a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final g96 b(float f, float f2, boolean z) {
        tu7 tu7Var;
        xja xjaVar;
        float max = Math.max((float) nae.e, f);
        float max2 = Math.max((float) nae.e, f2 - this.i);
        float f3 = this.h;
        if (f3 <= max && max <= max2) {
            return this.a;
        }
        float p = r1d.p(1.0f, nae.e, nae.e, f3, max);
        int i = (max > max2 ? 1 : (max == max2 ? 0 : -1));
        List list = this.b;
        if (i > 0) {
            p = r1d.p(nae.e, 1.0f, max2, f2, max);
            int i2 = (max2 > 0.01f ? 1 : (max2 == 0.01f ? 0 : -1));
            List list2 = this.c;
            tu7Var = this.k;
            if (i2 < 0 && list.size() == 2 && list2.size() == 2) {
                if (this.m == null) {
                    this.m = tl1.B(sl1.j0(list), sl1.j0(list2));
                }
                list = this.m;
                list.getClass();
            } else {
                list = list2;
            }
        } else {
            tu7Var = this.j;
        }
        int size = list.size();
        float b = tu7Var.b(0);
        Iterator it = dce.F(1, size).iterator();
        while (true) {
            sy5 sy5Var = (sy5) it;
            if (sy5Var.c) {
                int nextInt = sy5Var.nextInt();
                float b2 = tu7Var.b(nextInt);
                if (p <= b2) {
                    xjaVar = new xja(r1d.p(nae.e, 1.0f, b, b2, p), nextInt - 1, nextInt);
                    break;
                }
                b = b2;
            } else {
                xjaVar = new xja(nae.e, 0, 0);
                break;
            }
        }
        int i3 = xjaVar.b;
        int i4 = xjaVar.a;
        float f4 = xjaVar.c;
        if (z) {
            if (k27.A(f4) == 0) {
                i3 = i4;
            }
            return (g96) list.get(i3);
        }
        g96 g96Var = (g96) list.get(i4);
        g96 g96Var2 = (g96) list.get(i3);
        ArrayList arrayList = new ArrayList(g96Var.a.size());
        int size2 = g96Var.a.size();
        for (int i5 = 0; i5 < size2; i5++) {
            arrayList.add(bbe.u(g96Var.get(i5), g96Var2.get(i5), f4));
        }
        return new g96(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0b)) {
            return false;
        }
        boolean z = this.l;
        if (!z && !((s0b) obj).l) {
            return true;
        }
        s0b s0bVar = (s0b) obj;
        if (z == s0bVar.l && this.d == s0bVar.d && this.e == s0bVar.e && this.f == s0bVar.f && this.g == s0bVar.g && a() == s0bVar.a() && this.h == s0bVar.h && this.i == s0bVar.i && c16.i(this.j, s0bVar.j) && c16.i(this.k, s0bVar.k) && c16.i(this.a, s0bVar.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        boolean z = this.l;
        if (!z) {
            return Boolean.hashCode(z);
        }
        int d = nk2.d(this.g, nk2.d(this.f, nk2.d(this.e, nk2.d(this.d, Boolean.hashCode(z) * 31, 31), 31), 31), 31);
        int d2 = nk2.d(this.i, nk2.d(this.h, (Float.hashCode(a()) + d) * 31, 31), 31);
        int hashCode = this.k.hashCode();
        return this.a.hashCode() + ((hashCode + ((this.j.hashCode() + d2) * 31)) * 31);
    }
}
