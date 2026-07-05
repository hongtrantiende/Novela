package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ci  reason: default package */
/* loaded from: classes.dex */
public final class ci implements b37 {
    public static final ci b = new ci(0);
    public static final ci c = new ci(1);
    public static final ci d = new ci(2);
    public static final ci e = new ci(3);
    public static final ci f = new ci(4);
    public static final ci g = new ci(5);
    public static final ci h = new ci(6);
    public static final oi5 i = new oi5(8);
    public static final ci j = new ci(7);
    public static final ci k = new ci(8);
    public static final ci l = new ci(9);
    public static final ci m = new ci(10);
    public final /* synthetic */ int a;

    public /* synthetic */ ci(int i2) {
        this.a = i2;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j2) {
        int i2;
        int i3 = this.a;
        int i4 = 0;
        ls3 ls3Var = ls3.a;
        switch (i3) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int i5 = 0;
                int i6 = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    mw8 M = ((w27) list.get(i7)).M(j2);
                    i5 = Math.max(i5, M.a);
                    i6 = Math.max(i6, M.b);
                    arrayList.add(M);
                }
                if (list.isEmpty()) {
                    i5 = x02.k(j2);
                    i6 = x02.j(j2);
                }
                return e37Var.q0(i5, i6, ls3Var, new bi(0, arrayList));
            case 1:
                int size2 = list.size();
                if (size2 != 0) {
                    if (size2 != 1) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size3 = list.size();
                        int i8 = 0;
                        int i9 = 0;
                        while (i4 < size3) {
                            mw8 M2 = ((w27) list.get(i4)).M(j2);
                            i8 = Math.max(i8, M2.a);
                            i9 = Math.max(i9, M2.b);
                            arrayList2.add(M2);
                            i4++;
                        }
                        return e37Var.q0(i8, i9, ls3Var, new bi(1, arrayList2));
                    }
                    mw8 M3 = ((w27) list.get(0)).M(j2);
                    return e37Var.q0(M3.a, M3.b, ls3Var, new dg(M3, 1));
                }
                return e37Var.q0(0, 0, ls3Var, kg.F);
            case 2:
                ArrayList arrayList3 = new ArrayList(list.size());
                int size4 = list.size();
                for (int i10 = 0; i10 < size4; i10++) {
                    arrayList3.add(((w27) list.get(i10)).M(j2));
                }
                return e37Var.q0(x02.i(j2), x02.h(j2), ls3Var, new rs(0, arrayList3));
            case 3:
                int size5 = list.size();
                for (int i11 = 0; i11 < size5; i11++) {
                    w27 w27Var = (w27) list.get(i11);
                    if (c16.i(bze.n(w27Var), "badge")) {
                        mw8 M4 = w27Var.M(x02.b(j2, 0, 0, 0, 0, 11));
                        int size6 = list.size();
                        while (i4 < size6) {
                            w27 w27Var2 = (w27) list.get(i4);
                            if (c16.i(bze.n(w27Var2), "anchor")) {
                                mw8 M5 = w27Var2.M(j2);
                                n95 n95Var = hc.a;
                                int o0 = M5.o0(n95Var);
                                n95 n95Var2 = hc.b;
                                return e37Var.q0(M5.a, M5.b, o17.s(new yk8(n95Var, Integer.valueOf(o0)), new yk8(n95Var2, Integer.valueOf(M5.o0(n95Var2)))), new k0(8, M4, M5));
                            }
                            i4++;
                        }
                        throw a82.A("Collection contains no element matching the predicate.");
                    }
                }
                throw a82.A("Collection contains no element matching the predicate.");
            case 4:
                e37Var.getClass();
                list.getClass();
                return e37Var.q0(x02.k(j2), x02.j(j2), ls3Var, new y4(28));
            case 5:
                return e37Var.q0(x02.k(j2), x02.j(j2), ls3Var, new oi5(8));
            case 6:
                return e37Var.q0(x02.i(j2), x02.h(j2), ls3Var, i);
            case 7:
                return e37Var.q0(x02.k(j2), x02.j(j2), ls3Var, new oi5(8));
            case 8:
                ArrayList arrayList4 = new ArrayList(list.size());
                int size7 = list.size();
                int i12 = 0;
                int i13 = 0;
                while (i4 < size7) {
                    mw8 M6 = ((w27) list.get(i4)).M(j2);
                    i12 = Math.max(i12, M6.a);
                    i13 = Math.max(i13, M6.b);
                    arrayList4.add(M6);
                    i4++;
                }
                return e37Var.q0(i12, i13, ls3Var, new rs(4, arrayList4));
            case 9:
                if (x02.g(j2)) {
                    i2 = x02.i(j2);
                } else {
                    i2 = 0;
                }
                if (x02.f(j2)) {
                    i4 = x02.h(j2);
                }
                return e37Var.q0(i2, i4, ls3Var, new oi5(8));
            default:
                return e37Var.q0(x02.k(j2), x02.j(j2), ls3Var, new oi5(8));
        }
    }
}
