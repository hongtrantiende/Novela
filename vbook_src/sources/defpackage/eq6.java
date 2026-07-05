package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eq6  reason: default package */
/* loaded from: classes.dex */
public final class eq6 implements b37 {
    public final /* synthetic */ int a;
    public final Object b;

    public eq6(wpa wpaVar, aw7 aw7Var) {
        this.a = 2;
        this.b = wpaVar;
    }

    /* JADX WARN: Type inference failed for: r11v4, types: [xl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [xl9, java.lang.Object] */
    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        mw8 M;
        Float valueOf;
        boolean z;
        int i;
        int max;
        int i2;
        int i3;
        int A;
        int i4;
        int A2;
        int i5 = this.a;
        Object obj = this.b;
        ls3 ls3Var = ls3.a;
        switch (i5) {
            case 0:
                return e37Var.q0(x02.i(j), x02.h(j), ls3Var, new j34(23, list, this));
            case 1:
                e37Var.getClass();
                list.getClass();
                yya yyaVar = (yya) obj;
                if (zy5.b(((zy5) yyaVar.getValue()).a, 0L)) {
                    return e37Var.q0(0, 0, ls3Var, new rg8(1));
                }
                return e37Var.q0((int) (((zy5) yyaVar.getValue()).a >> 32), (int) (((zy5) yyaVar.getValue()).a & 4294967295L), ls3Var, new a1(((w27) sl1.c0(list)).M(x02.a(0, (int) (((zy5) yyaVar.getValue()).a >> 32), 0, (int) (((zy5) yyaVar.getValue()).a & 4294967295L))), 12));
            default:
                wpa wpaVar = (wpa) obj;
                int i6 = wpaVar.a;
                float[] fArr = wpaVar.g;
                ff8 ff8Var = wpaVar.n;
                int size = list.size();
                for (int i7 = 0; i7 < size; i7++) {
                    w27 w27Var = (w27) list.get(i7);
                    if (bze.n(w27Var) == hpa.a) {
                        mw8 M2 = w27Var.M(j);
                        int size2 = list.size();
                        for (int i8 = 0; i8 < size2; i8++) {
                            w27 w27Var2 = (w27) list.get(i8);
                            if (bze.n(w27Var2) == hpa.b) {
                                ff8 ff8Var2 = ff8.a;
                                if (ff8Var == ff8Var2) {
                                    M = w27Var2.M(x02.b(y02.j(0, -M2.b, 1, j), 0, 0, 0, 0, 14));
                                } else {
                                    M = w27Var2.M(x02.b(y02.j(-M2.a, 0, 2, j), 0, 0, 0, 0, 11));
                                }
                                ?? obj2 = new Object();
                                ?? obj3 = new Object();
                                float c = wpaVar.c();
                                fArr.getClass();
                                if (fArr.length == 0) {
                                    valueOf = null;
                                } else {
                                    valueOf = Float.valueOf(fArr[0]);
                                }
                                if (!c16.h(c, valueOf) && !c16.h(c, b00.u0(fArr))) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                int o0 = M.o0(vpa.e);
                                if (o0 != Integer.MIN_VALUE) {
                                    i = o0;
                                } else {
                                    i = 0;
                                }
                                int i9 = M2.a;
                                int i10 = M2.b;
                                int i11 = M.a;
                                if (ff8Var == ff8Var2) {
                                    i4 = Math.max(i11, i9);
                                    int i12 = M.b;
                                    max = i10 + i12;
                                    i2 = (i4 - M.a) / 2;
                                    i3 = i10 / 2;
                                    obj2.a = (i4 - M2.a) / 2;
                                    if (i6 > 0 && !z) {
                                        A2 = k27.A((i12 - (i * 2)) * c) + i;
                                    } else {
                                        A2 = k27.A(i12 * c);
                                    }
                                    obj3.a = (i3 - (M2.b / 2)) + A2;
                                } else {
                                    int i13 = i9 + i11;
                                    max = Math.max(M.b, i10);
                                    i2 = i9 / 2;
                                    i3 = (max - M.b) / 2;
                                    if (i6 > 0 && !z) {
                                        A = k27.A((M.a - (i * 2)) * c) + i;
                                    } else {
                                        A = k27.A(M.a * c);
                                    }
                                    obj2.a = (A + i2) - (M2.a / 2);
                                    obj3.a = (max - M2.b) / 2;
                                    i4 = i13;
                                }
                                int i14 = i3;
                                int i15 = i2;
                                wpaVar.h.i(i4);
                                wpaVar.i.i(max);
                                return e37Var.q0(i4, max, ls3Var, new gu0(M, i15, i14, M2, (xl9) obj2, (xl9) obj3));
                            }
                        }
                        throw a82.A("Collection contains no element matching the predicate.");
                    }
                }
                throw a82.A("Collection contains no element matching the predicate.");
        }
    }

    public /* synthetic */ eq6(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
