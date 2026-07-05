package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gva  reason: default package */
/* loaded from: classes.dex */
public abstract class gva {
    public static final gpb a;

    static {
        List B = tl1.B(gpb.c, gpb.d);
        Integer num = 0;
        int size = B.size();
        for (int i = 0; i < size; i++) {
            num = Integer.valueOf(num.intValue() | ((gpb) B.get(i)).a);
        }
        a = new gpb(num.intValue());
    }

    public static void a(frb frbVar, List list, long j, long j2, long j3, long j4, gpb gpbVar) {
        int c;
        int c2;
        list.getClass();
        if (!list.isEmpty()) {
            List<fva> b = b(list, j, j2, j3, j4, gpbVar);
            if (!b.isEmpty()) {
                int length = frbVar.c.length() - 1;
                if (length < 0) {
                    length = 0;
                }
                for (fva fvaVar : b) {
                    int n = dce.n(fvaVar.a, 0, length);
                    int n2 = dce.n(fvaVar.b, n, length);
                    if (n < n2) {
                        uva uvaVar = fvaVar.c;
                        long a2 = sze.a(n + 1, n2 + 1);
                        frbVar.d(a2);
                        if (fxb.h(a2)) {
                            ov5.a("Expected " + fxb.i(a2) + " to not be reversed.");
                        }
                        int i = (int) (a2 >> 32);
                        int i2 = (int) (a2 & 4294967295L);
                        frbVar.a().F(i, i2, i2 - i);
                        pyb pybVar = frbVar.d;
                        if (pybVar == null) {
                            pybVar = new pyb((pyb) null, 3);
                            frbVar.d = pybVar;
                        }
                        long y = zr1.y(i, i2, false, true);
                        if (!pybVar.a) {
                            ov5.c("This TextStyleBuffer is immutable");
                        }
                        int F = zr1.F(y);
                        boolean D = zr1.D(y);
                        int i3 = pybVar.d;
                        if (F >= i3) {
                            if (F == i3) {
                                if (!D) {
                                    c2 = pybVar.c();
                                }
                            } else {
                                c2 = pybVar.c();
                            }
                            F += c2;
                        }
                        int i4 = (int) (y & 2147483647L);
                        boolean E = zr1.E(y);
                        int i5 = pybVar.d;
                        if (i4 >= i5) {
                            if (i4 == i5) {
                                if (E) {
                                    c = pybVar.c();
                                }
                            } else {
                                c = pybVar.c();
                            }
                            i4 += c;
                        }
                        long y2 = zr1.y(F, i4, zr1.D(y), zr1.E(y));
                        ky5 ky5Var = pybVar.c;
                        if (zr1.F(y2) >= ((int) (2147483647L & y2))) {
                            ky5Var.getClass();
                        } else {
                            int i6 = ky5Var.f;
                            ky5Var.f = i6 + 1;
                            int a3 = ky5Var.a(uvaVar, y2, i6, 0);
                            ky5Var.d(a3);
                            ky5Var.b.c(a3);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02b6  */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v18, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v19, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List b(java.util.List r63, long r64, long r66, long r68, long r70, defpackage.gpb r72) {
        /*
            Method dump skipped, instructions count: 1296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gva.b(java.util.List, long, long, long, long, gpb):java.util.List");
    }

    public static List c(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return ks3.a;
        }
        List u0 = sl1.u0(arrayList, hxe.i(new dva(0), new dva(1)));
        ArrayList arrayList2 = new ArrayList();
        eva evaVar = (eva) sl1.c0(u0);
        int size = u0.size();
        for (int i = 1; i < size; i++) {
            eva evaVar2 = (eva) u0.get(i);
            int i2 = evaVar2.a;
            int i3 = evaVar.b;
            if (i2 <= i3) {
                evaVar = new eva(evaVar.a, Math.max(i3, evaVar2.b));
            } else {
                arrayList2.add(evaVar);
                evaVar = evaVar2;
            }
        }
        arrayList2.add(evaVar);
        return arrayList2;
    }
}
