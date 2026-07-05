package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hm0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hm0 implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ hm0(ym0 ym0Var, xl0 xl0Var, zl0 zl0Var, wm0 wm0Var, uo3 uo3Var, ppb ppbVar) {
        this.a = 9;
        this.b = ym0Var;
        this.c = xl0Var;
        this.C = zl0Var;
        this.d = wm0Var;
        this.e = uo3Var;
        this.f = ppbVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v19 */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.Map] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        Object obj2;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        String m;
        Object obj3;
        xt4 xt4Var;
        int i2 = this.a;
        float f = nae.e;
        Object obj4 = null;
        int i3 = 0;
        pvc pvcVar = pvc.a;
        Object obj5 = this.C;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        Object obj9 = this.c;
        Object obj10 = this.b;
        int i4 = 1;
        switch (i2) {
            case 0:
                zl9 zl9Var = (zl9) obj10;
                dm8 dm8Var = (dm8) obj8;
                dm8 dm8Var2 = (dm8) obj7;
                qo3 qo3Var = (qo3) obj6;
                zl0 zl0Var = (zl0) obj5;
                zl9Var.a = null;
                fj6 j = ((kj6) obj9).j();
                int i5 = (int) (4294967295L & ((y78) obj).a);
                gj6 h = bue.h(Float.intBitsToFloat(i5), j);
                if (h != null) {
                    obj2 = h.l;
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str = (String) obj2;
                } else {
                    str = null;
                }
                if (str != null) {
                    str2 = str;
                } else {
                    str2 = null;
                }
                if (h != null && str2 != null) {
                    zl9Var.a = str2;
                    float intBitsToFloat = Float.intBitsToFloat(i5) - h.p;
                    dm8Var.i(Float.intBitsToFloat(i5));
                    dm8Var2.i(nae.e);
                    boolean z5 = qo3Var.i;
                    zl0Var.getClass();
                    if (!z5) {
                        z2 = false;
                    } else {
                        zl0Var.f(str2, intBitsToFloat);
                        z2 = true;
                    }
                    if (!z2 && !z5 && qo3Var.h) {
                        zl0Var.c(new lbc(str2));
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (z2 || z3) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                ou9 ou9Var = (ou9) obj8;
                wl9 wl9Var = (wl9) obj7;
                zl9 zl9Var2 = (zl9) obj10;
                yj yjVar = (yj) obj6;
                hy0 hy0Var = (hy0) obj5;
                ak3 ak3Var = (ak3) obj;
                u5b u5bVar = (u5b) ((bm1) obj9).c;
                u5bVar.getClass();
                float floatValue = Float.valueOf(u5bVar.b).floatValue();
                if (floatValue >= nae.e) {
                    f = floatValue;
                }
                if (2.0f * f > Math.min(Math.abs(ou9Var.b()), Math.abs(ou9Var.a()))) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (wl9Var.a != f) {
                    yjVar.l();
                    yj.d(yjVar, ou9Var);
                    if (!z4) {
                        yj a = dk.a();
                        yj.d(a, new ou9(ou9Var.a + f, ou9Var.b + f, ou9Var.c - f, ou9Var.d - f, zr1.B(f, ou9Var.e), zr1.B(f, ou9Var.f), zr1.B(f, ou9Var.g), zr1.B(f, ou9Var.h)));
                        yjVar.j(yjVar, a, 0);
                    }
                    zl9Var2.a = yjVar;
                    wl9Var.a = f;
                }
                Object obj11 = zl9Var2.a;
                obj11.getClass();
                ak3.N(ak3Var, (yj) obj11, hy0Var, nae.e, null, null, 0, 60);
                return pvcVar;
            case 2:
                mw8[] mw8VarArr = (mw8[]) obj10;
                List list = (List) obj9;
                e37 e37Var = (e37) obj8;
                xl9 xl9Var = (xl9) obj7;
                xl9 xl9Var2 = (xl9) obj6;
                hu0 hu0Var = (hu0) obj5;
                lw8 lw8Var = (lw8) obj;
                int length = mw8VarArr.length;
                int i6 = 0;
                int i7 = 0;
                while (i7 < length) {
                    mw8 mw8Var = mw8VarArr[i7];
                    mw8Var.getClass();
                    fu0.b(lw8Var, mw8Var, (w27) list.get(i6), e37Var.getLayoutDirection(), xl9Var.a, xl9Var2.a, hu0Var.a);
                    i7++;
                    i6++;
                }
                return pvcVar;
            case 3:
                xt4 xt4Var2 = (xt4) obj9;
                m10 m10Var = (m10) obj;
                m10Var.getClass();
                sw2 sw2Var = ab3.a;
                z87.v((m82) obj10, zz6.a.f, null, new r9((Context) obj8, (r10) obj7, (nl1) obj6, m10Var, (aw7) obj5, null, 7), 2);
                if (xt4Var2 != null) {
                    xt4Var2.invoke(m10Var);
                }
                return pvcVar;
            case 4:
                String str3 = (String) obj9;
                List list2 = (List) obj7;
                List list3 = (List) obj6;
                String str4 = (String) obj5;
                ((vjc) obj).getClass();
                ii2 ii2Var = ((n33) obj10).a;
                ii2Var.U.j0(str3);
                Iterator it = ((List) obj8).iterator();
                String str5 = "";
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i8 + 1;
                    if (i8 >= 0) {
                        ob1 ob1Var = (ob1) next;
                        tp2 tp2Var = (tp2) sl1.f0(i8, list2);
                        ob1 ob1Var2 = (ob1) list3.get(i8);
                        int i12 = ob1Var.c;
                        Object obj12 = obj4;
                        String str6 = ob1Var.a;
                        if (i12 == i4) {
                            i = i4;
                        } else {
                            i = 0;
                        }
                        if (i != 0) {
                            m = a82.m(str3, "_section_", i10);
                        } else {
                            m = a82.m(str3, "_", i9);
                        }
                        String str7 = m;
                        if (tp2Var != null) {
                            obj3 = tp2Var.c;
                        } else {
                            obj3 = obj12;
                        }
                        ls3 ls3Var = ls3.a;
                        ls3 ls3Var2 = obj3;
                        if (obj3 == null) {
                            ls3Var2 = ls3Var;
                        }
                        Iterator it2 = it;
                        int i13 = i9;
                        if (c16.i(ls3Var2.get("raw"), str6)) {
                            ls3Var = ls3Var2;
                        }
                        gk2 gk2Var = ii2Var.U;
                        LinkedHashMap u = o17.u(o17.s(new yk8("raw", str6), new yk8(str4, ob1Var2.a)), ls3Var);
                        String str8 = ob1Var.b;
                        yj1 yj1Var = by5.a;
                        String str9 = str3;
                        gk2Var.F0(new tp2(str7, str9, u, str8, str5, i13, yj1Var.k().b(), yj1Var.k().b()));
                        if (i != 0) {
                            i10++;
                            str5 = str7;
                            i9 = i13;
                        } else {
                            i9 = i13 + 1;
                        }
                        it = it2;
                        i8 = i11;
                        str3 = str9;
                        obj4 = obj12;
                        i4 = 1;
                    } else {
                        Throwable th = obj4;
                        tl1.M();
                        throw th;
                    }
                }
                return pvcVar;
            case 5:
                aw7 aw7Var = (aw7) obj10;
                m82 m82Var = (m82) obj9;
                qg6 qg6Var = (qg6) obj8;
                yya yyaVar = (yya) obj7;
                aw7 aw7Var2 = (aw7) obj6;
                vt4 vt4Var = (vt4) obj5;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                if (!((tr3) aw7Var.getValue()).b.isEmpty()) {
                    ri6.y(ri6Var, null, new tu1(new g83(m82Var, qg6Var, yyaVar, aw7Var2, 2), true, 1957979767), 3);
                }
                List list4 = ((tr3) aw7Var.getValue()).c;
                ri6Var.z(list4.size(), new x7(22, new u83(24), list4), new y7(24, list4), new tu1(new sq3(list4, m82Var, qg6Var, yyaVar, aw7Var2, 0), true, 802480018));
                if (!((tr3) aw7Var.getValue()).c.isEmpty()) {
                    ri6.y(ri6Var, null, new tu1(new oq3(0, vt4Var), true, 621622112), 3);
                }
                return pvcVar;
            case 6:
                final l84 l84Var = (l84) obj10;
                vt4 vt4Var2 = (vt4) obj9;
                Set set = (Set) obj8;
                xt4 xt4Var3 = (xt4) obj7;
                xt4 xt4Var4 = (xt4) obj6;
                xt4 xt4Var5 = (xt4) obj5;
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                List list5 = l84Var.j;
                List list6 = l84Var.l;
                List list7 = l84Var.k;
                if (!list5.isEmpty()) {
                    vf6Var.x("update_header", new dw3(18), "update_header", new tu1(new t81(l84Var, vt4Var2, 20), true, 893085538));
                    List list8 = l84Var.j;
                    pg2 pg2Var = new pg2(23);
                    int size = list8.size();
                    x7 x7Var = new x7(29, pg2Var, list8);
                    w74 w74Var = new w74(1, list8);
                    x74 x74Var = new x74(list8, set, xt4Var3, xt4Var4, 1);
                    xt4Var = xt4Var3;
                    vf6Var.z(size, x7Var, null, w74Var, new tu1(x74Var, true, -1942245546));
                } else {
                    xt4Var = xt4Var3;
                }
                if (!list7.isEmpty()) {
                    vf6Var.x("installed_header", new dw3(19), "installed_header", new tu1(new mu4() { // from class: v74
                        @Override // defpackage.mu4
                        public final Object c(Object obj13, Object obj14, Object obj15) {
                            int i14 = r2;
                            pvc pvcVar2 = pvc.a;
                            boolean z6 = false;
                            l84 l84Var2 = l84Var;
                            yf6 yf6Var = (yf6) obj13;
                            rv4 rv4Var = (rv4) obj14;
                            int intValue = ((Integer) obj15).intValue();
                            switch (i14) {
                                case 0:
                                    yf6Var.getClass();
                                    if ((intValue & 17) != 16) {
                                        z6 = true;
                                    }
                                    if (rv4Var.U(intValue & 1, z6)) {
                                        sue.g(l84Var2.k.size(), 0, 12, null, rv4Var, null, yqe.A((y3b) x2b.u.getValue(), rv4Var));
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                                default:
                                    yf6Var.getClass();
                                    if ((intValue & 17) != 16) {
                                        z6 = true;
                                    }
                                    if (rv4Var.U(intValue & 1, z6)) {
                                        sue.g(l84Var2.l.size(), 0, 12, null, rv4Var, null, yqe.A((y3b) v1b.g0.getValue(), rv4Var));
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, true, 1628734681));
                    vf6Var.z(list7.size(), new y74(0, new pg2(24), list7), null, new w74(2, list7), new tu1(new bq0(list7, xt4Var, xt4Var5, 1), true, -1942245546));
                }
                if (!list6.isEmpty()) {
                    vf6Var.x("all_header", new dw3(20), "all_header", new tu1(new mu4() { // from class: v74
                        @Override // defpackage.mu4
                        public final Object c(Object obj13, Object obj14, Object obj15) {
                            int i14 = r2;
                            pvc pvcVar2 = pvc.a;
                            boolean z6 = false;
                            l84 l84Var2 = l84Var;
                            yf6 yf6Var = (yf6) obj13;
                            rv4 rv4Var = (rv4) obj14;
                            int intValue = ((Integer) obj15).intValue();
                            switch (i14) {
                                case 0:
                                    yf6Var.getClass();
                                    if ((intValue & 17) != 16) {
                                        z6 = true;
                                    }
                                    if (rv4Var.U(intValue & 1, z6)) {
                                        sue.g(l84Var2.k.size(), 0, 12, null, rv4Var, null, yqe.A((y3b) x2b.u.getValue(), rv4Var));
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                                default:
                                    yf6Var.getClass();
                                    if ((intValue & 17) != 16) {
                                        z6 = true;
                                    }
                                    if (rv4Var.U(intValue & 1, z6)) {
                                        sue.g(l84Var2.l.size(), 0, 12, null, rv4Var, null, yqe.A((y3b) v1b.g0.getValue(), rv4Var));
                                    } else {
                                        rv4Var.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, true, 1304726298));
                    vf6Var.z(list6.size(), new y74(1, new pg2(25), list6), null, new w74(0, list6), new tu1(new x74(list6, set, xt4Var, xt4Var4, 0), true, -1942245546));
                } else if (l84Var.a) {
                    vf6.A(vf6Var, 6, new dw3(21), null, hud.e, 12);
                }
                return pvcVar;
            case 7:
                mj4 mj4Var = (mj4) obj10;
                String str10 = (String) obj9;
                ((ib3) obj).getClass();
                tu1 tu1Var = new tu1(new i31((aw7) obj8, (aw7) obj7, (aw7) obj6, (tu1) obj5, 3), true, -106026677);
                mj4Var.getClass();
                str10.getClass();
                ora oraVar = mj4Var.a;
                ListIterator listIterator = oraVar.listIterator();
                while (true) {
                    y65 y65Var = (y65) listIterator;
                    if (y65Var.hasNext()) {
                        if (!c16.i(((lj4) y65Var.next()).a, str10)) {
                            i3++;
                        }
                    } else {
                        i3 = -1;
                    }
                }
                if (i3 == -1) {
                    oraVar.add(new lj4(str10, tu1Var));
                }
                return new qf0(2, mj4Var, str10);
            case 8:
                List list9 = (List) obj10;
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                ri6Var2.z(list9.size(), new y74(6, new pg2(28), list9), new w74(4, list9), new tu1(new so4(list9, list9, (pc4) obj9, (String) obj8, (xt4) obj7, (xt4) obj6, (xt4) obj5), true, 2039820996));
                return pvcVar;
            case 9:
                ym0 ym0Var = (ym0) obj10;
                xl0 xl0Var = (xl0) obj9;
                zl0 zl0Var2 = (zl0) obj5;
                wm0 wm0Var = (wm0) obj8;
                uo3 uo3Var = (uo3) obj7;
                ppb ppbVar = (ppb) obj6;
                List<e90> list10 = (List) obj;
                list10.getClass();
                String e = ym0Var.e(xl0Var.a);
                if (e != null) {
                    for (e90 e90Var : list10) {
                        wm0Var.c(xl0Var.a, e90Var.a, e90Var.b, new pva(e90Var.c), e.length());
                    }
                    String str11 = xl0Var.a;
                    zl0Var2.c(new sxc(str11, new cm0(e, wm0Var.i(str11))));
                    no3 g = gwe.g(uo3Var, ym0Var, wm0Var);
                    ppbVar.getClass();
                    ppbVar.a.a();
                    ppbVar.b = g;
                }
                return pvcVar;
            default:
                cyb cybVar = (cyb) obj10;
                kj6 kj6Var = (kj6) obj9;
                kob kobVar = (kob) obj8;
                aw7 aw7Var3 = (aw7) obj7;
                aw7 aw7Var4 = (aw7) obj6;
                aw7 aw7Var5 = (aw7) obj5;
                y78 y78Var = (y78) obj;
                if (cybVar.d() != p7a.a) {
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (y78Var.a >> 32));
                    c3c c3cVar = k3c.a;
                    pwb b = k3c.b(intBitsToFloat2 - ((Number) aw7Var3.getValue()).floatValue(), Float.intBitsToFloat((int) (y78Var.a & 4294967295L)) - ((Number) aw7Var4.getValue()).floatValue(), ((Number) aw7Var5.getValue()).intValue(), kj6Var.j().k, kj6Var.j().p, kobVar.b);
                    int i14 = cybVar.c().c;
                    int i15 = cybVar.b().c;
                    int i16 = b.c;
                    if (i14 > i16 || i16 > i15) {
                        cybVar.a();
                    }
                }
                return pvcVar;
        }
    }

    public /* synthetic */ hm0(bm1 bm1Var, ou9 ou9Var, wl9 wl9Var, zl9 zl9Var, yj yjVar, hy0 hy0Var) {
        this.a = 1;
        this.c = bm1Var;
        this.d = ou9Var;
        this.e = wl9Var;
        this.b = zl9Var;
        this.f = yjVar;
        this.C = hy0Var;
    }

    public /* synthetic */ hm0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.C = obj6;
    }
}
