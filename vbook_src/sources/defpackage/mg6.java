package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mg6  reason: default package */
/* loaded from: classes.dex */
public final class mg6 {
    public final vf6 a;
    public final ArrayList b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final ArrayList g;
    public List h;
    public int i;

    public mg6(vf6 vf6Var) {
        this.a = vf6Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new kg6(0, 0));
        this.b = arrayList;
        this.f = -1;
        this.g = new ArrayList();
        this.h = ks3.a;
    }

    public final int a() {
        return ((int) Math.sqrt((d() * 1.0d) / this.i)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        if (r9 < r7) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qy2 b(int r13) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg6.b(int):qy2");
    }

    public final int c(int i) {
        if (d() <= 0) {
            return 0;
        }
        if (i >= d()) {
            ov5.a("ItemIndex > total count");
        }
        if (!this.a.i) {
            return i / this.i;
        }
        tr0 tr0Var = new tr0(i, 9);
        ArrayList arrayList = this.b;
        int n = tl1.n(tr0Var, arrayList, arrayList.size());
        if (n < 0) {
            n = (-n) - 2;
        }
        int a = a() * n;
        int i2 = ((kg6) arrayList.get(n)).a;
        if (i2 > i) {
            ov5.a("currentItemIndex > itemIndex");
        }
        int i3 = 0;
        while (true) {
            int i4 = 1;
            if (i2 >= i) {
                break;
            }
            int i5 = i2 + 1;
            int e = e(i2);
            i3 += e;
            int i6 = this.i;
            if (i3 >= i6) {
                if (i3 == i6) {
                    a++;
                    i3 = 0;
                } else {
                    a++;
                    i3 = e;
                }
            }
            if (a % a() == 0 && a / a() >= arrayList.size()) {
                if (i3 <= 0) {
                    i4 = 0;
                }
                arrayList.add(new kg6(i5 - i4, 0));
            }
            i2 = i5;
        }
        if (e(i) + i3 > this.i) {
            return a + 1;
        }
        return a;
    }

    public final int d() {
        return this.a.h.a;
    }

    public final int e(int i) {
        lg6.b = this.i;
        q06 l = this.a.h.l(i);
        return (int) ((i25) ((tf6) l.c).b.invoke(lg6.a, Integer.valueOf(i - l.a))).a;
    }
}
