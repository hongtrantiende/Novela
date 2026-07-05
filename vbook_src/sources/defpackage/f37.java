package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f37  reason: default package */
/* loaded from: classes.dex */
public final class f37 {
    public final int a;
    public final List b;
    public final long c;
    public final Object d;
    public final lk0 e;
    public final mk0 f;
    public final tc6 g;
    public final boolean h;
    public final int i;
    public final int[] j;
    public int k;
    public int l;

    public f37(int i, int i2, List list, long j, Object obj, ff8 ff8Var, lk0 lk0Var, mk0 mk0Var, tc6 tc6Var) {
        boolean z;
        int i3;
        this.a = i;
        this.b = list;
        this.c = j;
        this.d = obj;
        this.e = lk0Var;
        this.f = mk0Var;
        this.g = tc6Var;
        if (ff8Var == ff8.a) {
            z = true;
        } else {
            z = false;
        }
        this.h = z;
        int size = list.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            mw8 mw8Var = (mw8) list.get(i5);
            if (!this.h) {
                i3 = mw8Var.b;
            } else {
                i3 = mw8Var.a;
            }
            i4 = Math.max(i4, i3);
        }
        this.i = i4;
        this.j = new int[this.b.size() * 2];
        this.l = Integer.MIN_VALUE;
    }

    public final void a(int i) {
        this.k += i;
        int[] iArr = this.j;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            boolean z = this.h;
            if ((z && i2 % 2 == 1) || (!z && i2 % 2 == 0)) {
                iArr[i2] = iArr[i2] + i;
            }
        }
    }

    public final void b(int i, int i2, int i3) {
        int i4;
        int i5;
        this.k = i;
        boolean z = this.h;
        if (z) {
            i4 = i3;
        } else {
            i4 = i2;
        }
        this.l = i4;
        List list = this.b;
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            mw8 mw8Var = (mw8) list.get(i6);
            int i7 = i6 * 2;
            int[] iArr = this.j;
            if (z) {
                lk0 lk0Var = this.e;
                if (lk0Var != null) {
                    iArr[i7] = lk0Var.a(mw8Var.a, i2, this.g);
                    iArr[i7 + 1] = i;
                    i5 = mw8Var.b;
                } else {
                    throw hl5.d("null horizontalAlignment");
                }
            } else {
                iArr[i7] = i;
                int i8 = i7 + 1;
                mk0 mk0Var = this.f;
                if (mk0Var != null) {
                    iArr[i8] = mk0Var.a(mw8Var.b, i3);
                    i5 = mw8Var.a;
                } else {
                    throw hl5.d("null verticalAlignment");
                }
            }
            i += i5;
        }
    }
}
