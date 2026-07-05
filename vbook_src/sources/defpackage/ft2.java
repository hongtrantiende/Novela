package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ft2  reason: default package */
/* loaded from: classes.dex */
public final class ft2 {
    public final js6 a;
    public final oaa b;
    public final int[] c;
    public final int d;
    public final jg2 e;
    public final long f;
    public final int g;
    public final xz8 h;
    public final dt2[] i;
    public c14 j;
    public ff2 k;
    public int l;
    public hk0 m;
    public boolean n;

    public ft2(du2 du2Var, js6 js6Var, ff2 ff2Var, oaa oaaVar, int i, int[] iArr, c14 c14Var, int i2, jg2 jg2Var, long j, int i3, boolean z, ArrayList arrayList, xz8 xz8Var) {
        int i4;
        dt2[] dt2VarArr;
        vq4 vq4Var;
        tp9 tp9Var;
        r94 us4Var;
        tz0 tz0Var;
        this.a = js6Var;
        this.k = ff2Var;
        this.b = oaaVar;
        this.c = iArr;
        this.j = c14Var;
        this.d = i2;
        this.e = jg2Var;
        this.l = i;
        this.f = j;
        this.g = i3;
        xz8 xz8Var2 = xz8Var;
        this.h = xz8Var2;
        long d = ff2Var.d(i);
        ArrayList a = a();
        this.i = new dt2[c14Var.length()];
        int i5 = 0;
        int i6 = 0;
        while (i6 < this.i.length) {
            tp9 tp9Var2 = (tp9) a.get(c14Var.j(i6));
            mi0 N = oaaVar.N(tp9Var2.b);
            dt2[] dt2VarArr2 = this.i;
            mi0 mi0Var = N == null ? (mi0) tp9Var2.b.get(i5) : N;
            vq4 vq4Var2 = tp9Var2.a;
            du2Var.getClass();
            String str = vq4Var2.n;
            if (lc7.n(str)) {
                if (!du2Var.b) {
                    tz0Var = null;
                    tp9Var = tp9Var2;
                    dt2VarArr = dt2VarArr2;
                    tz0 tz0Var2 = tz0Var;
                    long j2 = d;
                    int i7 = i6;
                    dt2VarArr[i7] = new dt2(j2, tp9Var, mi0Var, tz0Var2, 0L, tp9Var.d());
                    i6 = i7 + 1;
                    xz8Var2 = xz8Var;
                    d = j2;
                    i5 = 0;
                } else {
                    us4Var = new d8b(du2Var.a.f(vq4Var2), vq4Var2);
                }
            } else {
                if (str != null && (str.startsWith("video/webm") || str.startsWith("audio/webm") || str.startsWith("application/webm") || str.startsWith("video/x-matroska") || str.startsWith("audio/x-matroska") || str.startsWith("application/x-matroska"))) {
                    tp9Var = tp9Var2;
                    vq4Var = vq4Var2;
                    dt2VarArr = dt2VarArr2;
                    us4Var = new s27(du2Var.a, du2Var.b ? 1 : 3);
                } else if (Objects.equals(str, "image/jpeg")) {
                    us4Var = new vn0(1);
                } else if (Objects.equals(str, "image/png")) {
                    us4Var = new vn0(1, (byte) 0);
                } else {
                    if (z) {
                        i4 = 4;
                    } else {
                        i4 = 0;
                    }
                    dt2VarArr = dt2VarArr2;
                    vq4Var = vq4Var2;
                    tp9Var = tp9Var2;
                    us4Var = new us4(du2Var.a, (du2Var.b ? i4 : i4 | 32) | us4.g(du2Var.c), null, arrayList, xz8Var2);
                }
                tz0Var = new tz0(us4Var, i2, vq4Var);
                tz0 tz0Var22 = tz0Var;
                long j22 = d;
                int i72 = i6;
                dt2VarArr[i72] = new dt2(j22, tp9Var, mi0Var, tz0Var22, 0L, tp9Var.d());
                i6 = i72 + 1;
                xz8Var2 = xz8Var;
                d = j22;
                i5 = 0;
            }
            tp9Var = tp9Var2;
            vq4Var = vq4Var2;
            dt2VarArr = dt2VarArr2;
            tz0Var = new tz0(us4Var, i2, vq4Var);
            tz0 tz0Var222 = tz0Var;
            long j222 = d;
            int i722 = i6;
            dt2VarArr[i722] = new dt2(j222, tp9Var, mi0Var, tz0Var222, 0L, tp9Var.d());
            i6 = i722 + 1;
            xz8Var2 = xz8Var;
            d = j222;
            i5 = 0;
        }
    }

    public final ArrayList a() {
        List list = this.k.b(this.l).c;
        ArrayList arrayList = new ArrayList();
        for (int i : this.c) {
            arrayList.addAll(((g7) list.get(i)).c);
        }
        return arrayList;
    }

    public final dt2 b(int i) {
        dt2[] dt2VarArr = this.i;
        dt2 dt2Var = dt2VarArr[i];
        mi0 N = this.b.N(dt2Var.b.b);
        if (N != null && !N.equals(dt2Var.c)) {
            dt2 dt2Var2 = new dt2(dt2Var.e, dt2Var.b, N, dt2Var.a, dt2Var.f, dt2Var.d);
            dt2VarArr[i] = dt2Var2;
            return dt2Var2;
        }
        return dt2Var;
    }
}
