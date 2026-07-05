package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sbd  reason: default package */
/* loaded from: classes3.dex */
public final class sbd implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ubd b;

    public /* synthetic */ sbd(ubd ubdVar, int i) {
        this.a = i;
        this.b = ubdVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        Object value2;
        int i;
        Object value3;
        Object value4;
        int i2 = this.a;
        ubd ubdVar = this.b;
        pvc pvcVar = pvc.a;
        switch (i2) {
            case 0:
                oad oadVar = (oad) obj;
                ubd ubdVar2 = this.b;
                cza czaVar = ubdVar2.V;
                if (oadVar instanceof mad) {
                    if (czaVar != null) {
                        do {
                            value3 = czaVar.getValue();
                        } while (!czaVar.l(value3, fbd.a((fbd) value3, true, false, null, null, 0, null, null, 0, null, 0, 1020)));
                    }
                } else if (oadVar instanceof nad) {
                    nad nadVar = (nad) oadVar;
                    xic xicVar = nadVar.a;
                    ArrayList arrayList = xicVar.g;
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList.get(i3);
                        i3++;
                        if (!k4b.j0(((wic) obj2).a)) {
                            arrayList2.add(obj2);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(tl1.s(arrayList2, 10));
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < size2) {
                        Object obj3 = arrayList2.get(i5);
                        i5++;
                        int i6 = i4 + 1;
                        if (i4 >= 0) {
                            wic wicVar = (wic) obj3;
                            String str = wicVar.a;
                            Map map = wicVar.b;
                            String str2 = wicVar.d;
                            if (k4b.j0(str2)) {
                                str2 = wicVar.e;
                                if (k4b.j0(str2)) {
                                    str2 = a82.j(i6, "Audio ");
                                }
                            }
                            arrayList3.add(new o6d(str, map, str2, wicVar.e, wicVar.c));
                            i4 = i6;
                        } else {
                            tl1.M();
                            throw null;
                        }
                    }
                    if (czaVar != null) {
                        while (true) {
                            Object value5 = czaVar.getValue();
                            fbd fbdVar = (fbd) value5;
                            xic xicVar2 = nadVar.a;
                            if (!arrayList3.isEmpty()) {
                                i = 0;
                            } else {
                                i = -1;
                            }
                            ArrayList arrayList4 = arrayList3;
                            if (!czaVar.l(value5, fbd.a(fbdVar, false, false, null, null, 0, xicVar2, arrayList4, i, null, 0, 796))) {
                                arrayList3 = arrayList4;
                            }
                        }
                    }
                    ArrayList arrayList5 = xicVar.h;
                    int i7 = 0;
                    ArrayList arrayList6 = new ArrayList();
                    int size3 = arrayList5.size();
                    while (i7 < size3) {
                        Object obj4 = arrayList5.get(i7);
                        i7++;
                        if (!k4b.j0(((mjc) obj4).a)) {
                            arrayList6.add(obj4);
                        }
                    }
                    if (arrayList6.isEmpty()) {
                        if (czaVar != null) {
                            do {
                                value2 = czaVar.getValue();
                            } while (!czaVar.l(value2, fbd.a((fbd) value2, false, false, null, null, 0, null, null, 0, ks3.a, -1, 255)));
                        }
                    } else {
                        hk1 a = jdd.a(ubdVar2);
                        sw2 sw2Var = ab3.a;
                        ubdVar2.N = ubdVar2.f(a, ru2.c, new qkb(ubdVar2, arrayList6, xicVar, null, 27));
                    }
                } else if (oadVar instanceof lad) {
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                        } while (!czaVar.l(value, fbd.a((fbd) value, false, true, ((lad) oadVar).a.getMessage(), null, 0, null, null, 0, null, 0, 1016)));
                    }
                } else {
                    xk5.o();
                    return null;
                }
                return pvcVar;
            case 1:
                fo0 fo0Var = (fo0) obj;
                cza czaVar2 = ubdVar.S;
                if (czaVar2 != null) {
                    while (true) {
                        Object value6 = czaVar2.getValue();
                        p6d p6dVar = (p6d) value6;
                        String str3 = fo0Var.d;
                        String str4 = fo0Var.e;
                        int i8 = fo0Var.f;
                        boolean z = fo0Var.j;
                        boolean z2 = fo0Var.k;
                        boolean z3 = fo0Var.l;
                        boolean z4 = fo0Var.m;
                        String str5 = p6dVar.a;
                        String str6 = p6dVar.b;
                        String str7 = p6dVar.c;
                        String str8 = p6dVar.g;
                        fo0 fo0Var2 = fo0Var;
                        boolean z5 = p6dVar.l;
                        boolean z6 = p6dVar.m;
                        boolean z7 = p6dVar.n;
                        boolean z8 = p6dVar.o;
                        s21.B(str5, str6, str7, str3, str4);
                        str8.getClass();
                        if (!czaVar2.l(value6, new p6d(str5, str6, str7, str3, str4, i8, str8, z, z2, z3, z4, z5, z6, z7, z8))) {
                            fo0Var = fo0Var2;
                        }
                    }
                }
                return pvcVar;
            default:
                yk8 yk8Var = (yk8) obj;
                Object obj5 = yk8Var.a;
                List list = (List) yk8Var.b;
                List list2 = (List) obj5;
                int k = p17.k(tl1.s(list2, 10));
                int i9 = 16;
                if (k < 16) {
                    k = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(k);
                for (Object obj6 : list2) {
                    linkedHashMap.put(((su3) obj6).c, obj6);
                }
                ubdVar.I = linkedHashMap;
                int k2 = p17.k(tl1.s(list, 10));
                if (k2 >= 16) {
                    i9 = k2;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i9);
                for (Object obj7 : list) {
                    linkedHashMap2.put(((wac) obj7).a, obj7);
                }
                ubdVar.J = linkedHashMap2;
                cza czaVar3 = ubdVar.H;
                if (czaVar3 != null) {
                    do {
                        value4 = czaVar3.getValue();
                        List list3 = (List) value4;
                    } while (!czaVar3.l(value4, list2));
                    hk1 a2 = jdd.a(ubdVar);
                    sw2 sw2Var2 = ab3.a;
                    ubdVar.f(a2, ru2.c, new tbd(ubdVar, null, 1));
                    return pvcVar;
                }
                hk1 a22 = jdd.a(ubdVar);
                sw2 sw2Var22 = ab3.a;
                ubdVar.f(a22, ru2.c, new tbd(ubdVar, null, 1));
                return pvcVar;
        }
    }
}
