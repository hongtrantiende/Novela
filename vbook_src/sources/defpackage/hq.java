package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.util.Size;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hq implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ hq(xt4 xt4Var, aw7 aw7Var, dm8 dm8Var, aw7 aw7Var2) {
        this.a = 28;
        this.b = xt4Var;
        this.c = aw7Var;
        this.d = dm8Var;
        this.e = aw7Var2;
    }

    private final Object a(Object obj) {
        xt4 xt4Var = (xt4) this.b;
        aw7 aw7Var = (aw7) this.c;
        dm8 dm8Var = (dm8) this.d;
        aw7 aw7Var2 = (aw7) this.e;
        ef2 ef2Var = (ef2) obj;
        ef2Var.getClass();
        boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
        boolean z = false;
        float f = nae.e;
        if (booleanValue) {
            if (ef2Var.b() >= 0.5f) {
                f = 1.0f;
            }
            dm8Var.i(f);
            if (dm8Var.h() == 1.0f) {
                z = true;
            }
            xt4Var.invoke(Boolean.valueOf(z));
            aw7Var.setValue(Boolean.FALSE);
        } else {
            if (!((Boolean) aw7Var2.getValue()).booleanValue()) {
                f = 1.0f;
            }
            dm8Var.i(f);
            if (dm8Var.h() == 1.0f) {
                z = true;
            }
            xt4Var.invoke(Boolean.valueOf(z));
        }
        return pvc.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r15v18, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v12, types: [zl9, java.lang.Object] */
    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        ls3 ls3Var;
        Map map;
        long j;
        long j2;
        boolean z;
        int i;
        long j3;
        boolean z2;
        ls3 ls3Var2;
        boolean z3;
        ls3 ls3Var3;
        Map map2;
        Set set;
        int i2 = this.a;
        ls3 ls3Var4 = ls3.a;
        int i3 = 9;
        Throwable th = null;
        pvc pvcVar = pvc.a;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.b;
        Object obj5 = this.c;
        switch (i2) {
            case 0:
                lq lqVar = (lq) obj5;
                es esVar = (es) obj3;
                xt4 xt4Var = (xt4) obj4;
                vl9 vl9Var = (vl9) obj2;
                wr wrVar = (wr) obj;
                es esVar2 = lqVar.c;
                ote.A(wrVar, esVar2);
                hm8 hm8Var = wrVar.e;
                Object d = lqVar.d(hm8Var.getValue());
                if (!c16.i(d, hm8Var.getValue())) {
                    esVar2.b.setValue(d);
                    esVar.b.setValue(d);
                    if (xt4Var != null) {
                        xt4Var.invoke(lqVar);
                    }
                    wrVar.a();
                    vl9Var.a = true;
                } else if (xt4Var != null) {
                    xt4Var.invoke(lqVar);
                }
                return pvcVar;
            case 1:
                ak3 ak3Var = (ak3) obj;
                ak3Var.getClass();
                ((xf0) obj5).a.b(ak3Var, (r13) obj3, (sc6) obj2, (xt4) obj4);
                return pvcVar;
            case 2:
                qr0 qr0Var = (qr0) obj5;
                wj6 wj6Var = (wj6) obj;
                wj6Var.getClass();
                List list = qr0Var.e;
                wj6Var.g.b(list.size(), new vj6(new x7(4, new nj0(11), list), new y7(6, list), null, new tu1(new gr0(list, (xt4) obj4, (xt4) obj3, (xt4) obj2, 0), true, -334987442)));
                if (qr0Var.d && qr0Var.a) {
                    wj6.x(wj6Var, new tu1(new qo4(qr0Var, 4), true, -1084871417));
                }
                return pvcVar;
            case 3:
                String str = (String) obj;
                str.getClass();
                ((aw7) obj3).setValue(Boolean.FALSE);
                z87.v((m82) obj5, null, null, new cx0(str, (lhd) obj4, (fy0) obj2, null, 1), 3);
                return pvcVar;
            case 4:
                List list2 = (List) obj5;
                vf6 vf6Var = (vf6) obj;
                vf6Var.getClass();
                vf6Var.z(list2.size(), new x7(7, new v71(5), list2), null, new y7(10, list2), new tu1(new ya(list2, (qo9) obj3, (aw7) obj4, 1), true, -1117249557));
                vf6.y(vf6Var, null, null, new tu1(new oq3(1, (vt4) obj2), true, -147883912), 7);
                return pvcVar;
            case 5:
                z86 z86Var = (z86) obj5;
                vt4 vt4Var = (vt4) obj3;
                aw7 aw7Var = (aw7) obj2;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                ((aw7) obj4).setValue(bool);
                if (!booleanValue) {
                    aw7Var.setValue(Boolean.FALSE);
                    z86Var.b();
                    vt4Var.invoke();
                }
                return pvcVar;
            case 6:
                int i4 = 0;
                lp1 lp1Var = (lp1) obj5;
                ArrayList arrayList = (ArrayList) obj3;
                List list3 = (List) obj4;
                HashMap hashMap = (HashMap) obj2;
                ((vjc) obj).getClass();
                ii2 ii2Var = lp1Var.b;
                gk2 gk2Var = ii2Var.U;
                String str2 = lp1Var.a;
                gk2Var.j0(str2);
                int size = arrayList.size();
                int i5 = 0;
                while (i5 < size) {
                    Object obj6 = arrayList.get(i5);
                    i5++;
                    int i6 = i4 + 1;
                    if (i4 >= 0) {
                        sm2 sm2Var = (sm2) obj6;
                        tp2 tp2Var = (tp2) sl1.f0(i4, list3);
                        String str3 = (String) hashMap.get(Integer.valueOf(i4));
                        if (tp2Var != null) {
                            ls3Var = tp2Var.c;
                        } else {
                            ls3Var = null;
                        }
                        if (ls3Var == null) {
                            ls3Var = ls3Var4;
                        }
                        if (str3 != null && str3.length() != 0) {
                            map = Collections.singletonMap("raw", str3);
                            map.getClass();
                        } else {
                            map = ls3Var4;
                        }
                        LinkedHashMap u = o17.u(ls3Var, map);
                        gk2 gk2Var2 = ii2Var.U;
                        String m = a82.m(str2, "_", i4);
                        String str4 = lp1Var.a;
                        String str5 = sm2Var.e;
                        yj1 yj1Var = by5.a;
                        gk2Var2.F0(new tp2(m, str4, u, str5, "", i4, yj1Var.k().b(), yj1Var.k().b()));
                        i4 = i6;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
            case 7:
                ol6 ol6Var = (ol6) obj5;
                tub tubVar = (tub) obj3;
                jub jubVar = (jub) obj4;
                as5 as5Var = (as5) obj2;
                ib3 ib3Var = (ib3) obj;
                if (ol6Var.b()) {
                    s6f s6fVar = ol6Var.d;
                    h72 h72Var = ol6Var.v;
                    h72 h72Var2 = ol6Var.w;
                    ?? obj7 = new Object();
                    r6a r6aVar = new r6a(10, s6fVar, h72Var, obj7);
                    fy8 fy8Var = tubVar.a;
                    fy8Var.f(jubVar, as5Var, r6aVar, h72Var2);
                    wub wubVar = new wub(tubVar, fy8Var);
                    tubVar.b.set(wubVar);
                    obj7.a = wubVar;
                    ol6Var.e = wubVar;
                }
                return new ok(1);
            case 8:
                Set set2 = (Set) obj5;
                ib3 ib3Var2 = (ib3) obj;
                set2.add(obj3);
                return new ir2(set2, obj3, (Set) obj4, (aw7) obj2);
            case 9:
                ka3 ka3Var = (ka3) obj5;
                wj6 wj6Var2 = (wj6) obj;
                wj6Var2.getClass();
                List list4 = ka3Var.e;
                wj6Var2.g.b(list4.size(), new vj6(new x7(19, new u83(3), list4), new y7(21, list4), null, new tu1(new td0(list4, (xt4) obj4, (xt4) obj3, (lu4) obj2, 3), true, -334987442)));
                if (ka3Var.d && ka3Var.a) {
                    wj6.x(wj6Var2, new tu1(new qo4(ka3Var, 13), true, 1323115892));
                }
                return pvcVar;
            case 10:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                float floatValue = ((Number) ((yya) obj5).getValue()).floatValue();
                t15Var.v(floatValue);
                t15Var.l(floatValue);
                t15Var.x(((Number) ((yya) obj3).getValue()).floatValue() * floatValue);
                t15Var.i(((Number) ((yya) obj4).getValue()).floatValue() * floatValue);
                if (((Boolean) ((yya) obj2).getValue()).booleanValue()) {
                    j = y9e.j(0.5f, nae.e);
                } else {
                    j = y9e.j(nae.e, 0.5f);
                }
                t15Var.Z0(j);
                return pvcVar;
            case 11:
                aw7 aw7Var2 = (aw7) obj5;
                ri6 ri6Var = (ri6) obj;
                ri6Var.getClass();
                List list5 = (List) aw7Var2.getValue();
                ri6Var.z(list5.size(), new x7(20, new u83(7), list5), new y7(22, list5), new tu1(new sq3(list5, (vo9) obj3, (lu4) obj2, (xt4) obj4, aw7Var2, 2), true, 802480018));
                return pvcVar;
            case 12:
                av5 av5Var = (av5) obj3;
                wl9 wl9Var = (wl9) obj4;
                m82 m82Var = (m82) obj2;
                long longValue = ((Long) obj).longValue();
                yya yyaVar = (yya) ((aw7) obj5).getValue();
                if (yyaVar != null) {
                    j2 = ((Number) yyaVar.getValue()).longValue();
                } else {
                    j2 = longValue;
                }
                long j4 = av5Var.c;
                gw7 gw7Var = av5Var.a;
                if (j4 == Long.MIN_VALUE || wl9Var.a != ote.v(m82Var.q())) {
                    av5Var.c = longValue;
                    Object[] objArr = gw7Var.a;
                    int i7 = gw7Var.c;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((yu5) objArr[i8]).f = true;
                    }
                    wl9Var.a = ote.v(m82Var.q());
                }
                float f = wl9Var.a;
                if (f == nae.e) {
                    Object[] objArr2 = gw7Var.a;
                    int i9 = gw7Var.c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        yu5 yu5Var = (yu5) objArr2[i10];
                        yu5Var.c.setValue(yu5Var.d.c);
                        yu5Var.f = true;
                    }
                } else {
                    long j5 = ((float) (j2 - av5Var.c)) / f;
                    Object[] objArr3 = gw7Var.a;
                    int i11 = gw7Var.c;
                    boolean z4 = true;
                    for (int i12 = 0; i12 < i11; i12++) {
                        yu5 yu5Var2 = (yu5) objArr3[i12];
                        if (!yu5Var2.e) {
                            yu5Var2.D.b.setValue(Boolean.FALSE);
                            if (yu5Var2.f) {
                                z = false;
                                yu5Var2.f = false;
                                yu5Var2.C = j5;
                            } else {
                                z = false;
                            }
                            long j6 = j5 - yu5Var2.C;
                            yu5Var2.c.setValue(yu5Var2.d.f(j6));
                            yu5Var2.e = yu5Var2.d.e(j6);
                        } else {
                            z = false;
                        }
                        if (!yu5Var2.e) {
                            z4 = z;
                        }
                    }
                    av5Var.d.setValue(Boolean.valueOf(!z4));
                }
                return pvcVar;
            case 13:
                List list6 = (List) obj5;
                xl9 xl9Var = (xl9) obj3;
                List list7 = (List) obj4;
                eg6 eg6Var = (eg6) obj2;
                z49 z49Var = (z49) obj;
                m6b m6bVar = z49Var.e;
                if (m6bVar != null) {
                    i = m6bVar.d();
                } else {
                    i = 0;
                }
                int i13 = 0;
                for (int i14 = 0; i14 < i; i14++) {
                    ff8 ff8Var = eg6Var.q;
                    m6b m6bVar2 = z49Var.e;
                    long j7 = 0;
                    if (ff8Var == ff8.a) {
                        if (m6bVar2 != null) {
                            j7 = m6bVar2.c(i14);
                        }
                        j3 = 4294967295L & j7;
                    } else {
                        if (m6bVar2 != null) {
                            j7 = m6bVar2.c(i14);
                        }
                        j3 = j7 >> 32;
                    }
                    i13 += (int) j3;
                }
                if (list6 != null) {
                    list6.add(Integer.valueOf(i13));
                }
                if (xl9Var.a != list7.size()) {
                    xl9Var.a++;
                }
                return pvcVar;
            case 14:
                ei6 ei6Var = (ei6) obj5;
                ib3 ib3Var3 = (ib3) obj;
                ei6Var.c = new o40((sh6) obj3, (o6b) obj4, (a59) obj2);
                return new r6(ei6Var, 12);
            case 15:
                pu3 pu3Var = (pu3) obj5;
                ri6 ri6Var2 = (ri6) obj;
                ri6Var2.getClass();
                ri6Var2.z(((v0) pu3Var).a(), null, new w74(19, pu3Var), new tu1(new td0(pu3Var, (mv) obj3, (xt4) obj4, (String) obj2, 6), true, 802480018));
                ri6.y(ri6Var2, null, axe.a, 3);
                return pvcVar;
            case 16:
                List list8 = (List) obj5;
                ri6 ri6Var3 = (ri6) obj;
                ri6Var3.getClass();
                ri6Var3.z(list8.size(), null, new w74(20, list8), new tu1(new td0(list8, (aw7) obj3, (aw7) obj4, (aw7) obj2), true, 802480018));
                return pvcVar;
            case 17:
                List list9 = (List) obj5;
                ri6 ri6Var4 = (ri6) obj;
                ri6Var4.getClass();
                ri6Var4.z(list9.size(), new y74(24, new j35(15), list9), new w74(22, list9), new tu1(new gr0(list9, (xt4) obj4, (xt4) obj3, (xt4) obj2, 3), true, 2039820996));
                return pvcVar;
            case 18:
                ho5 ho5Var = (ho5) obj3;
                xt4 xt4Var2 = (xt4) obj4;
                xt4 xt4Var3 = (xt4) obj2;
                vf6 vf6Var2 = (vf6) obj;
                vf6Var2.getClass();
                for (Map.Entry entry : ((Map) obj5).entrySet()) {
                    List list10 = (List) entry.getValue();
                    vf6.y(vf6Var2, null, new ww6(25), new tu1(new la(2, list10), true, -34261737), 5);
                    vf6 vf6Var3 = vf6Var2;
                    vf6Var3.z(list10.size(), new y74(25, new ww6(26), list10), null, new w74(25, list10), new tu1(new td0(list10, ho5Var, xt4Var2, xt4Var3, 8), true, -1117249557));
                    vf6Var2 = vf6Var3;
                }
                return pvcVar;
            case 19:
                wl9 wl9Var2 = (wl9) obj5;
                ds7 ds7Var = (ds7) obj3;
                s3a s3aVar = (s3a) obj4;
                p6 p6Var = (p6) obj2;
                wr wrVar2 = (wr) obj;
                float floatValue2 = ((Number) wrVar2.e.getValue()).floatValue() - wl9Var2.a;
                if (!nqe.s(floatValue2)) {
                    if (!nqe.s(floatValue2 - ds7Var.m(s3aVar, floatValue2))) {
                        wrVar2.a();
                        return pvcVar;
                    }
                    wl9Var2.a += floatValue2;
                }
                if (((Boolean) p6Var.invoke(Float.valueOf(wl9Var2.a))).booleanValue()) {
                    wrVar2.a();
                }
                return pvcVar;
            case 20:
                h68 h68Var = (h68) obj5;
                ArrayList arrayList2 = (ArrayList) obj3;
                List list11 = (List) obj4;
                HashMap hashMap2 = (HashMap) obj2;
                ((vjc) obj).getClass();
                ii2 ii2Var2 = h68Var.b;
                gk2 gk2Var3 = ii2Var2.U;
                String str6 = h68Var.a;
                gk2Var3.j0(str6);
                int size2 = arrayList2.size();
                String str7 = "";
                int i15 = 0;
                int i16 = 0;
                while (i16 < size2) {
                    Object obj8 = arrayList2.get(i16);
                    i16++;
                    int i17 = i15 + 1;
                    if (i15 >= 0) {
                        sm2 sm2Var2 = (sm2) obj8;
                        tp2 tp2Var2 = (tp2) sl1.f0(i15, list11);
                        String str8 = (String) hashMap2.get(Integer.valueOf(i15));
                        int i18 = size2;
                        if (sm2Var2.e.length() == 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (tp2Var2 != null) {
                            ls3Var2 = tp2Var2.c;
                        } else {
                            ls3Var2 = null;
                        }
                        if (ls3Var2 == null) {
                            ls3Var2 = ls3Var4;
                        }
                        if (str8 == null || str8.length() == 0) {
                            z3 = z2;
                            ls3Var3 = ls3Var2;
                        } else {
                            z3 = z2;
                            boolean i19 = c16.i(ls3Var2.get("raw"), str8);
                            ls3Var3 = ls3Var2;
                            if (!i19) {
                                ls3Var3 = ls3Var4;
                            }
                        }
                        if (str8 != null && str8.length() != 0) {
                            map2 = Collections.singletonMap("raw", str8);
                            map2.getClass();
                        } else {
                            map2 = ls3Var4;
                        }
                        LinkedHashMap u2 = o17.u(ls3Var3, map2);
                        gk2 gk2Var4 = ii2Var2.U;
                        String m2 = a82.m(str6, "_", i15);
                        String str9 = h68Var.a;
                        String str10 = sm2Var2.e;
                        yj1 yj1Var2 = by5.a;
                        gk2Var4.F0(new tp2(m2, str9, u2, str10, str7, i15, yj1Var2.k().b(), yj1Var2.k().b()));
                        if (z3) {
                            str7 = a82.m(str6, "_", i15);
                        }
                        size2 = i18;
                        i15 = i17;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                return pvcVar;
            case 21:
                oe4 oe4Var = (oe4) obj4;
                d82 d82Var = (d82) obj2;
                try {
                    ((xl9) obj5).a = ((bz0) obj3).read((ByteBuffer) obj);
                    return pvcVar;
                } finally {
                }
            case 22:
                cs9 cs9Var = (cs9) obj5;
                pa8 pa8Var = (pa8) obj3;
                s46 s46Var = pa8Var.b;
                ii2 ii2Var3 = pa8Var.a;
                gn8 gn8Var = (gn8) obj4;
                gn8 gn8Var2 = (gn8) obj2;
                ((vjc) obj).getClass();
                if (cs9Var == cs9.a) {
                    gk2 gk2Var5 = ii2Var3.d;
                    ((mm) gk2Var5.a).q(1647723763, "DELETE FROM DbBookmark", null);
                    gk2Var5.C(1647723763, new bk2(27));
                }
                cs9 cs9Var2 = cs9.c;
                if (cs9Var == cs9Var2) {
                    gk2 gk2Var6 = ii2Var3.d;
                    gk2Var6.getClass();
                    bm2 bm2Var = bm2.a;
                    mm mmVar = (mm) gk2Var6.a;
                    yl2 yl2Var = new yl2(gk2Var6, 0);
                    mmVar.getClass();
                    List<xl2> c = new xla(-1870240114, new String[]{"DbBookmark"}, mmVar, "DbBookmark.sq", "getAll", "SELECT DbBookmark.id, DbBookmark.bookId, DbBookmark.chapterIndex, DbBookmark.chapterName, DbBookmark.type, DbBookmark.content, DbBookmark.description, DbBookmark.color, DbBookmark.startPosition, DbBookmark.endPosition, DbBookmark.createAt\nFROM DbBookmark\nORDER BY createAt DESC", yl2Var).c();
                    ArrayList arrayList3 = new ArrayList(tl1.s(c, 10));
                    for (xl2 xl2Var : c) {
                        arrayList3.add(pa8.a(xl2Var));
                    }
                    set = sl1.A0(arrayList3);
                } else {
                    set = rs3.a;
                }
                abf abfVar = qe4.a;
                abfVar.getClass();
                if (gn8Var.a.exists()) {
                    wj9 wj9Var = new wj9(abfVar.A(gn8Var));
                    try {
                        s46Var.getClass();
                        Iterator it = ((k02) ie2.p(s46Var, wj9Var, v98.Companion.serializer())).iterator();
                        while (it.hasNext()) {
                            v98 v98Var = (v98) it.next();
                            v98Var.getClass();
                            String B = ube.B();
                            String str11 = v98Var.b;
                            int i20 = v98Var.e;
                            String str12 = v98Var.d;
                            String str13 = v98Var.c;
                            long j8 = v98Var.f;
                            xl2 xl2Var2 = new xl2(B, str11, i20, str12, 0, str13, "", "", j8, j8, v98Var.g);
                            cs9Var2 = cs9Var2;
                            if (cs9Var != cs9Var2 || !set.contains(pa8.a(xl2Var2))) {
                                ii2Var3.d.y0(xl2Var2);
                            }
                            th = null;
                        }
                        dxe.r(wj9Var, th);
                    } finally {
                    }
                }
                abf abfVar2 = qe4.a;
                abfVar2.getClass();
                if (gn8Var2.a.exists()) {
                    wj9 wj9Var2 = new wj9(abfVar2.A(gn8Var2));
                    try {
                        s46Var.getClass();
                        Iterator it2 = ((k02) ie2.p(s46Var, wj9Var2, va8.Companion.serializer())).iterator();
                        while (it2.hasNext()) {
                            va8 va8Var = (va8) it2.next();
                            va8Var.getClass();
                            String B2 = ube.B();
                            String str14 = va8Var.b;
                            int i21 = va8Var.e;
                            String str15 = va8Var.d;
                            String str16 = va8Var.c;
                            long j9 = va8Var.f;
                            xl2 xl2Var3 = new xl2(B2, str14, i21, str15, 1, str16, str15, "", j9, j9, va8Var.g);
                            if (cs9Var != cs9Var2 || !set.contains(pa8.a(xl2Var3))) {
                                ii2Var3.d.y0(xl2Var3);
                            }
                        }
                        dxe.r(wj9Var2, null);
                    } finally {
                    }
                }
                return pvcVar;
            case 23:
                ar8 ar8Var = (ar8) obj4;
                sc6 sc6Var = (sc6) obj;
                sc6Var.getClass();
                ((aw7) obj2).setValue(sc6Var);
                if (((sk8) obj5).c() == ((xh8) obj3).b) {
                    ar8Var.h.setValue(sc6Var);
                }
                return pvcVar;
            case 24:
                wb9 wb9Var = (wb9) obj5;
                vf6 vf6Var4 = (vf6) obj;
                vf6Var4.getClass();
                List list12 = wb9Var.a;
                vf6Var4.z(list12.size(), new oj7(14, new mx8(9), list12), null, new pj7(18, list12), new tu1(new sq3(list12, wb9Var, (xt4) obj4, (xt4) obj3, (xt4) obj2, 5), true, -1942245546));
                return pvcVar;
            case 25:
                Rect rect = (Rect) obj5;
                ix9 ix9Var = (ix9) obj3;
                Size size3 = (Size) obj4;
                yn9 yn9Var = ((lx9) obj2).C;
                fp8 fp8Var = (fp8) obj;
                fp8Var.getClass();
                if (rect == null) {
                    Bitmap A = fp8Var.A(ix9Var.a, size3.getWidth(), size3.getHeight(), yn9Var);
                    if (A == null) {
                        Bitmap createBitmap = Bitmap.createBitmap(size3.getWidth(), size3.getHeight(), Bitmap.Config.ARGB_8888);
                        createBitmap.getClass();
                        createBitmap.eraseColor(-1);
                        return createBitmap;
                    }
                    return A;
                }
                Bitmap K = fp8Var.K(ix9Var.a, rect.width(), rect.height(), size3.getWidth(), size3.getHeight(), rect.left, rect.top, yn9Var);
                if (K == null) {
                    Bitmap createBitmap2 = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
                    createBitmap2.getClass();
                    createBitmap2.eraseColor(-1);
                    return createBitmap2;
                }
                return K;
            case 26:
                fla flaVar = (fla) obj5;
                ((p86) obj).getClass();
                String str17 = (String) ((aw7) obj3).getValue();
                String str18 = (String) ((aw7) obj4).getValue();
                String str19 = (String) ((aw7) obj2).getValue();
                str17.getClass();
                str18.getClass();
                str19.getClass();
                fdd.g(flaVar, jdd.a(flaVar), new lc9(flaVar, str18, str19, str17, (m42) null, 6));
                return pvcVar;
            case 27:
                c0b c0bVar = (c0b) obj5;
                xt4 xt4Var4 = (xt4) obj4;
                ri6 ri6Var5 = (ri6) obj;
                ri6Var5.getClass();
                ri6.y(ri6Var5, null, pae.g, 3);
                ri6.y(ri6Var5, null, new tu1(new xza(c0bVar, (wza) obj3, 4), true, 553705462), 3);
                ri6.y(ri6Var5, null, new tu1(new em7(8, c0bVar, (vt4) obj2), true, 1505537301), 3);
                if (c0bVar.n.isEmpty()) {
                    ri6.y(ri6Var5, null, pae.h, 3);
                } else {
                    List list13 = c0bVar.n;
                    ri6Var5.z(list13.size(), new poa(4, new dva(7), list13), new pj7(27, list13), new tu1(new xa(list13, xt4Var4, 11), true, 802480018));
                }
                if (c0bVar.p) {
                    ri6.y(ri6Var5, null, pae.i, 3);
                }
                ri6.y(ri6Var5, null, pae.j, 3);
                return pvcVar;
            case 28:
                return a(obj);
            default:
                xt4 xt4Var5 = (xt4) obj4;
                xt4 xt4Var6 = (xt4) obj3;
                xt4 xt4Var7 = (xt4) obj2;
                ri6 ri6Var6 = (ri6) obj;
                ri6Var6.getClass();
                for (Map.Entry entry2 : ((Map) ((aw7) obj5).getValue()).entrySet()) {
                    ri6.B(ri6Var6, entry2.getKey(), new tu1(new zd1(entry2, i3), true, 1986971705));
                    List list14 = (List) entry2.getValue();
                    ri6Var6.z(list14.size(), new poa(8, new clb(7), list14), new zgb(3, list14), new tu1(new gr0(list14, xt4Var5, xt4Var6, xt4Var7, 6), true, 802480018));
                    i3 = 9;
                }
                return pvcVar;
        }
    }

    public /* synthetic */ hq(int i, xt4 xt4Var, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = xt4Var;
    }

    public /* synthetic */ hq(Object obj, xt4 xt4Var, xt4 xt4Var2, hu4 hu4Var, int i) {
        this.a = i;
        this.c = obj;
        this.b = xt4Var;
        this.d = xt4Var2;
        this.e = hu4Var;
    }

    public /* synthetic */ hq(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ hq(ArrayList arrayList, xl9 xl9Var, List list, int i, eg6 eg6Var) {
        this.a = 13;
        this.c = arrayList;
        this.d = xl9Var;
        this.b = list;
        this.e = eg6Var;
    }
}
