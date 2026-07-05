package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ir7  reason: default package */
/* loaded from: classes.dex */
public final class ir7 {
    public final ArrayList a;

    public ir7(xu9 xu9Var, xu9 xu9Var2) {
        float f;
        Throwable th;
        float f2;
        Collection collection;
        Iterator it;
        float f3;
        float B;
        int i;
        float c;
        float f4;
        float B2;
        yk8 yk8Var;
        yk8 yk8Var2;
        float f5;
        float j;
        h37 u = ak0.u(new r0f(27), xu9Var);
        h37 u2 = ak0.u(new r0f(27), xu9Var2);
        List list = u.c;
        List list2 = u2.c;
        List list3 = pb4.a;
        list.getClass();
        list2.getClass();
        jq6 t = tl1.t();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((t79) list.get(i2)).b instanceof jb4) {
                t.add(list.get(i2));
            }
        }
        jq6 r = tl1.r(t);
        jq6 t2 = tl1.t();
        int size2 = list2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            if (((t79) list2.get(i3)).b instanceof jb4) {
                t2.add(list2.get(i3));
            }
        }
        jq6 r2 = tl1.r(t2);
        r.getClass();
        r2.getClass();
        jq6 t3 = tl1.t();
        ListIterator listIterator = r.listIterator(0);
        while (true) {
            y65 y65Var = (y65) listIterator;
            if (!y65Var.hasNext()) {
                break;
            }
            t79 t79Var = (t79) y65Var.next();
            ListIterator listIterator2 = r2.listIterator(0);
            while (true) {
                y65 y65Var2 = (y65) listIterator2;
                if (y65Var2.hasNext()) {
                    t79 t79Var2 = (t79) y65Var2.next();
                    ob4 ob4Var = t79Var.b;
                    ob4 ob4Var2 = t79Var2.b;
                    ob4Var.getClass();
                    ob4Var2.getClass();
                    if ((ob4Var instanceof jb4) && (ob4Var2 instanceof jb4) && ((jb4) ob4Var).b != ((jb4) ob4Var2).b) {
                        f5 = Float.MAX_VALUE;
                        j = Float.MAX_VALUE;
                    } else {
                        f5 = Float.MAX_VALUE;
                        long l = nc2.l(pb4.a(ob4Var), pb4.a(ob4Var2));
                        j = (nc2.j(l) * nc2.j(l)) + (nc2.i(l) * nc2.i(l));
                    }
                    if (j != f5) {
                        t3.add(new ob3(j, t79Var, t79Var2));
                    }
                }
            }
        }
        List u0 = sl1.u0(tl1.r(t3), new kn4(27));
        float f6 = 1.0f;
        int i4 = 1;
        if (u0.isEmpty()) {
            collection = pb4.a;
        } else if (u0.size() == 1) {
            ob3 ob3Var = (ob3) sl1.c0(u0);
            float f7 = ob3Var.b.a;
            float f8 = ob3Var.c.a;
            collection = tl1.B(new yk8(Float.valueOf(f7), Float.valueOf(f8)), new yk8(Float.valueOf((f7 + 0.5f) % 1.0f), Float.valueOf((f8 + 0.5f) % 1.0f)));
        } else {
            ArrayList arrayList = new ArrayList();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator it2 = u0.iterator();
            while (it2.hasNext()) {
                ob3 ob3Var2 = (ob3) it2.next();
                t79 t79Var3 = ob3Var2.b;
                t79 t79Var4 = ob3Var2.c;
                float f9 = t79Var3.a;
                float f10 = t79Var4.a;
                if (linkedHashSet.contains(t79Var3) || linkedHashSet2.contains(t79Var4)) {
                    it = it2;
                    f3 = f6;
                } else {
                    f3 = f6;
                    int n = tl1.n(new jc(Float.valueOf(f9), 26), arrayList, arrayList.size());
                    if (n < 0) {
                        int i5 = (-n) - i4;
                        int size3 = arrayList.size();
                        if (size3 >= i4) {
                            yk8 yk8Var3 = (yk8) arrayList.get(((i5 + size3) - i4) % size3);
                            float floatValue = ((Number) yk8Var3.a).floatValue();
                            float floatValue2 = ((Number) yk8Var3.b).floatValue();
                            yk8 yk8Var4 = (yk8) arrayList.get(i5 % size3);
                            it = it2;
                            float floatValue3 = ((Number) yk8Var4.a).floatValue();
                            float floatValue4 = ((Number) yk8Var4.b).floatValue();
                            if (am8.E(f9, floatValue) >= 1.0E-4f && am8.E(f9, floatValue3) >= 1.0E-4f && am8.E(f10, floatValue2) >= 1.0E-4f && am8.E(f10, floatValue4) >= 1.0E-4f) {
                                if (size3 > 1) {
                                    if (floatValue4 >= floatValue2) {
                                        if (floatValue2 <= f10) {
                                            if (f10 > floatValue4) {
                                            }
                                        }
                                    } else if (f10 < floatValue2 && f10 > floatValue4) {
                                    }
                                }
                            }
                        } else {
                            it = it2;
                        }
                        arrayList.add(i5, new yk8(Float.valueOf(f9), Float.valueOf(f10)));
                        linkedHashSet.add(t79Var3);
                        linkedHashSet2.add(t79Var4);
                    } else {
                        vs.m("There can't be two features with the same progress");
                        throw null;
                    }
                }
                f6 = f3;
                it2 = it;
                i4 = 1;
            }
            f = f6;
            th = null;
            f2 = 1.0E-4f;
            collection = arrayList;
            yk8[] yk8VarArr = (yk8[]) collection.toArray(new yk8[0]);
            ue3 ue3Var = new ue3((yk8[]) Arrays.copyOf(yk8VarArr, yk8VarArr.length));
            tu7 tu7Var = ue3Var.a;
            tu7 tu7Var2 = ue3Var.b;
            B = am8.B(tu7Var, tu7Var2, nae.e);
            ArrayList arrayList2 = u2.b;
            if (nae.e > B && B <= f) {
                if (B < f2) {
                    i = 1;
                } else {
                    int size4 = arrayList2.size();
                    int i6 = 0;
                    int i7 = 0;
                    while (true) {
                        if (i7 < size4) {
                            Object obj = arrayList2.get(i7);
                            i7++;
                            g37 g37Var = (g37) obj;
                            float f11 = g37Var.c;
                            if (B <= g37Var.d && f11 <= B) {
                                break;
                            }
                            i6++;
                        } else {
                            i6 = -1;
                            break;
                        }
                    }
                    yk8 a = ((g37) arrayList2.get(i6)).a(B);
                    g37 g37Var2 = (g37) a.a;
                    ArrayList C = tl1.C(((g37) a.b).a);
                    int size5 = arrayList2.size();
                    for (int i8 = 1; i8 < size5; i8++) {
                        C.add(((g37) arrayList2.get((i8 + i6) % arrayList2.size())).a);
                    }
                    C.add(g37Var2.a);
                    tu7 tu7Var3 = new tu7(arrayList2.size() + 2);
                    int size6 = arrayList2.size() + 2;
                    for (int i9 = 0; i9 < size6; i9++) {
                        if (i9 == 0) {
                            c = 0.0f;
                        } else if (i9 == arrayList2.size() + 1) {
                            c = f;
                        } else {
                            c = d2d.c(((g37) arrayList2.get(((i6 + i9) - 1) % arrayList2.size())).d - B);
                        }
                        tu7Var3.a(c);
                    }
                    i = 1;
                    jq6 t4 = tl1.t();
                    int size7 = list2.size();
                    for (int i10 = 0; i10 < size7; i10++) {
                        t4.add(new t79(d2d.c(((t79) list2.get(i10)).a - B), ((t79) list2.get(i10)).b));
                    }
                    u2 = new h37(u2.a, tl1.r(t4), C, tu7Var3);
                }
                ArrayList arrayList3 = new ArrayList();
                g37 g37Var3 = (g37) sl1.f0(0, u);
                g37 g37Var4 = (g37) sl1.f0(0, u2);
                int i11 = i;
                int i12 = i11;
                while (g37Var3 != null && g37Var4 != null) {
                    if (i12 == u.b.size()) {
                        f4 = f;
                    } else {
                        f4 = g37Var3.d;
                    }
                    if (i11 == u2.b.size()) {
                        B2 = f;
                    } else {
                        B2 = am8.B(tu7Var2, tu7Var, d2d.c(g37Var4.d + B));
                    }
                    float min = Math.min(f4, B2);
                    float f12 = 1.0E-6f + min;
                    if (f4 > f12) {
                        yk8Var = g37Var3.a(min);
                    } else {
                        yk8 yk8Var5 = new yk8(g37Var3, sl1.f0(i12, u));
                        i12++;
                        yk8Var = yk8Var5;
                    }
                    g37 g37Var5 = (g37) yk8Var.a;
                    g37Var3 = (g37) yk8Var.b;
                    if (B2 > f12) {
                        yk8Var2 = g37Var4.a(d2d.c(am8.B(tu7Var, tu7Var2, min) - B));
                    } else {
                        yk8 yk8Var6 = new yk8(g37Var4, sl1.f0(i11, u2));
                        i11++;
                        yk8Var2 = yk8Var6;
                    }
                    g37Var4 = (g37) yk8Var2.b;
                    arrayList3.add(new yk8(g37Var5.a, ((g37) yk8Var2.a).a));
                }
                if (g37Var3 == null && g37Var4 == null) {
                    this.a = arrayList3;
                    return;
                } else {
                    vs.m("Expected both Polygon's Cubic to be fully matched");
                    throw th;
                }
            }
            vs.m("Cutting point is expected to be between 0 and 1");
            throw th;
        }
        f = 1.0f;
        th = null;
        f2 = 1.0E-4f;
        yk8[] yk8VarArr2 = (yk8[]) collection.toArray(new yk8[0]);
        ue3 ue3Var2 = new ue3((yk8[]) Arrays.copyOf(yk8VarArr2, yk8VarArr2.length));
        tu7 tu7Var4 = ue3Var2.a;
        tu7 tu7Var22 = ue3Var2.b;
        B = am8.B(tu7Var4, tu7Var22, nae.e);
        ArrayList arrayList22 = u2.b;
        if (nae.e > B) {
        }
        vs.m("Cutting point is expected to be between 0 and 1");
        throw th;
    }
}
