package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bx1  reason: default package */
/* loaded from: classes.dex */
public final class bx1 {
    public final rv4 a;
    public pa1 b;
    public boolean c;
    public int f;
    public int g;
    public int l;
    public final bz5 d = new bz5(1, false);
    public boolean e = true;
    public final ArrayList h = new ArrayList();
    public int i = -1;
    public int j = -1;
    public int k = -1;

    public bx1(rv4 rv4Var, pa1 pa1Var) {
        this.a = rv4Var;
        this.b = pa1Var;
    }

    public final void a() {
        c();
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            arrayList.remove(arrayList.size() - 1);
        } else {
            this.g++;
        }
    }

    public final void b() {
        int i = this.g;
        if (i > 0) {
            re8 re8Var = this.b.d;
            re8Var.p(ne8.c);
            re8Var.m[re8Var.n - re8Var.k[re8Var.l - 1].a] = i;
            this.g = 0;
        }
        ArrayList arrayList = this.h;
        if (!arrayList.isEmpty()) {
            pa1 pa1Var = this.b;
            int size = arrayList.size();
            Object[] objArr = new Object[size];
            for (int i2 = 0; i2 < size; i2++) {
                objArr[i2] = arrayList.get(i2);
            }
            pa1Var.getClass();
            if (size != 0) {
                re8 re8Var2 = pa1Var.d;
                re8Var2.p(nd8.c);
                vve.l(re8Var2, 0, objArr);
            }
            arrayList.clear();
        }
    }

    public final void c() {
        int i = this.l;
        if (i > 0) {
            int i2 = this.i;
            if (i2 >= 0) {
                b();
                re8 re8Var = this.b.d;
                re8Var.p(de8.c);
                int i3 = re8Var.n - re8Var.k[re8Var.l - 1].a;
                int[] iArr = re8Var.m;
                iArr[i3] = i2;
                iArr[i3 + 1] = i;
                this.i = -1;
            } else {
                int i4 = this.k;
                int i5 = this.j;
                b();
                re8 re8Var2 = this.b.d;
                re8Var2.p(yd8.c);
                int i6 = re8Var2.n - re8Var2.k[re8Var2.l - 1].a;
                int[] iArr2 = re8Var2.m;
                iArr2[i6 + 1] = i4;
                iArr2[i6] = i5;
                iArr2[i6 + 2] = i;
                this.j = -1;
                this.k = -1;
            }
            this.l = 0;
        }
    }

    public final void d(boolean z) {
        int i;
        aqa aqaVar = this.a.G;
        if (z) {
            i = aqaVar.i;
        } else {
            i = aqaVar.g;
        }
        int i2 = i - this.f;
        if (i2 < 0) {
            ex1.a("Tried to seek backward");
        }
        if (i2 > 0) {
            re8 re8Var = this.b.d;
            re8Var.p(gd8.c);
            re8Var.m[re8Var.n - re8Var.k[re8Var.l - 1].a] = i2;
            this.f = i;
        }
    }

    public final void e() {
        aqa aqaVar = this.a.G;
        if (aqaVar.c > 0) {
            int i = aqaVar.i;
            bz5 bz5Var = this.d;
            if (bz5Var.c(-2) != i) {
                if (!this.c && this.e) {
                    d(false);
                    this.b.d.p(td8.c);
                    this.c = true;
                }
                if (i > 0) {
                    lv4 a = aqaVar.a(i);
                    bz5Var.e(i);
                    d(false);
                    re8 re8Var = this.b.d;
                    re8Var.p(sd8.c);
                    vve.l(re8Var, 0, a);
                    this.c = true;
                }
            }
        }
    }

    public final void f(int i, int i2) {
        boolean z;
        if (i2 > 0) {
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                ex1.a("Invalid remove index " + i);
            }
            if (this.i == i) {
                this.l += i2;
                return;
            }
            c();
            this.i = i;
            this.l = i2;
        }
    }
}
