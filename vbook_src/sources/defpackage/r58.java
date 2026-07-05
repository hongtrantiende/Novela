package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r58  reason: default package */
/* loaded from: classes3.dex */
public final class r58 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public r58(m82 m82Var, djb djbVar) {
        this.a = 12;
        this.b = djbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.f34 r13, defpackage.m42 r14) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r58.a(f34, m42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        Object value2;
        u99 u99Var;
        String str;
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Object obj2;
        Object value3;
        Object value4;
        Object value5;
        Set H0;
        Object value6;
        Object obj3;
        String str3;
        Object value7;
        qzc qzcVar;
        String str4;
        String str5;
        List list;
        List list2;
        String str6;
        String str7;
        String str8;
        String str9;
        int i = this.a;
        int i2 = 0;
        pvc pvcVar = pvc.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                List u0 = sl1.u0((List) obj, new pa5(15));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : u0) {
                    zx5 zx5Var = zx5.c;
                    zx5 k = bze.k(((j48) obj5).e);
                    int i3 = w9c.b;
                    nt6 a = c16.x(k, b16.p()).a();
                    Object obj6 = linkedHashMap.get(a);
                    if (obj6 == null) {
                        obj6 = new ArrayList();
                        linkedHashMap.put(a, obj6);
                    }
                    ((List) obj6).add(obj5);
                }
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    arrayList.add(new g58((nt6) entry.getKey(), (List) entry.getValue()));
                }
                cza czaVar = ((t58) obj4).d;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                        ((q58) value).getClass();
                    } while (!czaVar.l(value, new q58(arrayList, false)));
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                wzc wzcVar = (wzc) obj;
                cza czaVar2 = ((v99) obj4).e;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                        u99Var = (u99) value2;
                        if (wzcVar != null) {
                            str = wzcVar.a;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str2 = "";
                        } else {
                            str2 = str;
                        }
                        if (wzcVar != null && wzcVar.e == 3) {
                            z = true;
                        }
                        z = false;
                    } while (!czaVar2.l(value2, u99.a(u99Var, false, false, null, str2, z, null, Token.ASSIGN_BITAND)));
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                String str10 = (String) obj;
                ((zb9) obj4).k();
                return pvcVar;
            case 3:
                vaa vaaVar = (vaa) obj;
                eha ehaVar = (eha) obj4;
                vaaVar.getClass();
                ehaVar.h = vaaVar;
                if (ehaVar.j) {
                    ehaVar.j = false;
                    ehaVar.c();
                }
                Object a2 = eha.a(ehaVar, vaaVar.a.a, bha.a, m42Var);
                if (a2 == n82.a) {
                    return a2;
                }
                return pvcVar;
            case 4:
                moc mocVar = (moc) obj;
                gia giaVar = (gia) obj4;
                Object obj7 = mocVar.a;
                Object obj8 = mocVar.b;
                List list3 = (List) mocVar.c;
                vl6 vl6Var = (vl6) obj8;
                wzc wzcVar2 = (wzc) obj7;
                List<String> list4 = vl6Var.g;
                int i4 = vl6Var.e;
                String str11 = vl6Var.a;
                String str12 = vl6Var.m;
                ArrayList arrayList2 = new ArrayList();
                for (String str13 : list4) {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (c16.i(((r81) obj2).a, str13)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    r81 r81Var = (r81) obj2;
                    if (r81Var != null) {
                        arrayList2.add(r81Var);
                    }
                }
                cza czaVar3 = giaVar.D;
                klc klcVar = giaVar.C;
                if (czaVar3 != null) {
                    while (true) {
                        Object value8 = czaVar3.getValue();
                        eia eiaVar = (eia) value8;
                        if (wzcVar2 != null) {
                            z2 = wzcVar2.g;
                        } else {
                            z2 = i2;
                        }
                        plc plcVar = (plc) klcVar;
                        String f = plcVar.f(vl6Var.b, str11, str12);
                        String f2 = plcVar.f(vl6Var.c, str11, str12);
                        String str14 = vl6Var.d;
                        String str15 = vl6Var.j;
                        String str16 = vl6Var.l;
                        boolean z6 = vl6Var.y;
                        wzc wzcVar3 = wzcVar2;
                        int i5 = vl6Var.n;
                        boolean z7 = vl6Var.x;
                        int i6 = vl6Var.o;
                        long j = vl6Var.G;
                        String h = rqe.h("%.2f", new Float(kte.g(vl6Var)));
                        String str17 = vl6Var.q;
                        if (i4 != 1 && i4 != 2 && i4 != 3 && i4 != 4) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        boolean i7 = kte.i(vl6Var);
                        int i8 = vl6Var.f;
                        if (i8 != 10 && i8 != 20) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        if (i4 != 1 && i4 != 2) {
                            z5 = false;
                        } else {
                            z5 = true;
                        }
                        eiaVar.getClass();
                        str14.getClass();
                        str15.getClass();
                        str16.getClass();
                        str17.getClass();
                        list3.getClass();
                        ArrayList arrayList3 = arrayList2;
                        String str18 = str12;
                        if (!czaVar3.l(value8, new eia(false, z2, str11, f, f2, str14, str15, str16, str18, z6, z7, j, h, str17, z3, i7, z4, z5, i5, i6, arrayList3, list3))) {
                            wzcVar2 = wzcVar3;
                            str12 = str18;
                            arrayList2 = arrayList3;
                            i2 = 0;
                        }
                    }
                }
                return pvcVar;
            case 5:
                oia oiaVar = (oia) obj;
                cza czaVar4 = ((sia) obj4).d;
                if (czaVar4 != null) {
                    do {
                        value3 = czaVar4.getValue();
                        pia piaVar = (pia) value3;
                    } while (!czaVar4.l(value3, new pia(oiaVar.b, oiaVar.c, oiaVar.d, oiaVar.e, oiaVar.f, oiaVar.g, oiaVar.h)));
                    return pvcVar;
                }
                return pvcVar;
            case 6:
                return g((moc) obj, m42Var);
            case 7:
                rk9 rk9Var = (rk9) obj;
                zja zjaVar = (zja) obj4;
                if (!c16.i(zjaVar.c, rk9Var)) {
                    zjaVar.c = rk9Var;
                    zjaVar.a();
                }
                return pvcVar;
            case 8:
                return a((f34) obj, m42Var);
            case 9:
                return a((f34) obj, m42Var);
            case 10:
                return h((Object[]) obj, m42Var);
            case 11:
                List list5 = (List) obj;
                cza czaVar5 = ((vhb) obj4).f;
                if (czaVar5 != null) {
                    do {
                        value4 = czaVar5.getValue();
                    } while (!czaVar5.l(value4, rhb.a((rhb) value4, null, null, false, false, false, false, false, nae.e, null, list5, 0, 1535)));
                    return pvcVar;
                }
                return pvcVar;
            case 12:
                return d((yk8) obj, m42Var);
            case 13:
                String str19 = (String) obj;
                ((trb) obj4).g0.setValue(Boolean.FALSE);
                return pvcVar;
            case 14:
                List list6 = (List) obj;
                cza czaVar6 = ((c4c) obj4).d;
                if (czaVar6 != null) {
                    do {
                        value5 = czaVar6.getValue();
                        ((a4c) value5).getClass();
                        list6.getClass();
                    } while (!czaVar6.l(value5, new a4c(list6, false)));
                    return pvcVar;
                }
                return pvcVar;
            case 15:
                zc6 zc6Var = (zc6) obj;
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj4;
                cd6 cd6Var = zc6Var.k;
                List<xh8> list7 = zc6Var.e;
                if (cd6Var.a()) {
                    ArrayList arrayList4 = new ArrayList(tl1.s(list7, 10));
                    for (xh8 xh8Var : list7) {
                        arrayList4.add(new Integer(xh8Var.b));
                    }
                    H0 = sl1.H0(arrayList4);
                } else {
                    List<mi8> list8 = (List) zc6Var.n.getValue();
                    ArrayList arrayList5 = new ArrayList(tl1.s(list8, 10));
                    for (mi8 mi8Var : list8) {
                        arrayList5.add(new Integer(mi8Var.a));
                    }
                    H0 = sl1.H0(arrayList5);
                }
                int k2 = p17.k(tl1.s(list7, 10));
                if (k2 < 16) {
                    k2 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(k2);
                for (Object obj9 : list7) {
                    linkedHashMap2.put(new Integer(((xh8) obj9).b), obj9);
                }
                for (Number number : fca.t(H0, linkedHashSet)) {
                    xh8 xh8Var2 = (xh8) linkedHashMap2.get(new Integer(number.intValue()));
                    if (xh8Var2 != null) {
                        cza czaVar7 = xh8Var2.f.g;
                        do {
                            value6 = czaVar7.getValue();
                            ((Boolean) value6).getClass();
                        } while (!czaVar7.l(value6, Boolean.TRUE));
                    }
                }
                for (Number number2 : fca.t(linkedHashSet, H0)) {
                    xh8 xh8Var3 = (xh8) linkedHashMap2.get(new Integer(number2.intValue()));
                    if (xh8Var3 != null) {
                        xh8Var3.f.d();
                    }
                }
                linkedHashSet.clear();
                linkedHashSet.addAll(H0);
                return pvcVar;
            case 16:
                plc plcVar2 = (plc) obj4;
                jlc jlcVar = plcVar2.b;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.add(new tmc("qt", false, "QT", ""));
                for (ey4 ey4Var : (List) obj) {
                    arrayList6.add(new tmc(ey4Var.a, true, ey4Var.b, ey4Var.g));
                }
                int size = arrayList6.size();
                while (true) {
                    if (i2 < size) {
                        obj3 = arrayList6.get(i2);
                        i2++;
                        if (((tmc) obj3).a.equals(jlcVar.a())) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                tmc tmcVar = (tmc) obj3;
                if (tmcVar != null) {
                    str3 = tmcVar.a;
                } else {
                    str3 = ((tmc) sl1.c0(arrayList6)).a;
                }
                cza czaVar8 = plcVar2.h;
                h49 h49Var = jlcVar.a;
                czaVar8.getClass();
                czaVar8.n(null, str3);
                plcVar2.i.m(h49Var.e("from_language_".concat(str3), ""));
                plcVar2.j.m(h49Var.e("to_language_".concat(str3), ""));
                cza czaVar9 = plcVar2.f;
                czaVar9.getClass();
                czaVar9.n(null, arrayList6);
                return pvcVar;
            case 17:
                wzc wzcVar4 = (wzc) obj;
                cza czaVar10 = ((szc) obj4).d;
                if (czaVar10 != null) {
                    do {
                        value7 = czaVar10.getValue();
                        qzcVar = (qzc) value7;
                        if (wzcVar4 != null) {
                            str4 = wzcVar4.b;
                        } else {
                            str4 = null;
                        }
                        if (str4 == null) {
                            str5 = "";
                        } else {
                            str5 = str4;
                        }
                        if (wzcVar4 != null) {
                            list = wzcVar4.h;
                        } else {
                            list = null;
                        }
                        if (list == null) {
                            list = ks3.a;
                        }
                        list2 = list;
                        if (wzcVar4 != null) {
                            str6 = wzcVar4.d;
                        } else {
                            str6 = null;
                        }
                        if (str6 == null) {
                            str7 = "";
                        } else {
                            str7 = str6;
                        }
                        if (wzcVar4 != null) {
                            str8 = wzcVar4.c;
                        } else {
                            str8 = null;
                        }
                        if (str8 == null) {
                            str9 = "";
                        } else {
                            str9 = str8;
                        }
                    } while (!czaVar10.l(value7, qzc.a(qzcVar, str5, str9, str7, list2, false, 16)));
                    return pvcVar;
                }
                return pvcVar;
            case 18:
                return c((hh4) obj, m42Var);
            case 19:
                return ((j9d) obj4).d((xic) obj, m42Var);
            case 20:
                yk8 yk8Var = (yk8) obj;
                float floatValue = ((Number) yk8Var.a).floatValue();
                if (((Boolean) yk8Var.b).booleanValue()) {
                    dm8 dm8Var = (dm8) obj4;
                    if (floatValue < 1.0f) {
                        dm8Var.i(floatValue);
                    } else {
                        dm8Var.i(1.0f);
                    }
                }
                return pvcVar;
            default:
                float floatValue2 = ((Number) obj).floatValue();
                if (floatValue2 < 1.0f) {
                    ((qi8) obj4).e(floatValue2);
                }
                return pvcVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.hh4 r23, defpackage.m42 r24) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r58.c(hh4, m42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:(1:(1:(1:(5:14|15|16|17|18)(2:21|22))(7:23|24|25|(3:27|28|29)|32|28|29))(7:33|34|35|(4:37|(2:39|31)|25|(0))|32|28|29))(5:40|41|42|28|29))(2:43|44))(6:62|63|(1:65)|66|(1:68)(1:74)|(2:70|(2:72|31))(3:73|(7:(1:48)(1:56)|(1:52)|53|(1:55)|42|28|29)(1:(7:58|(1:60)|35|(0)|32|28|29)(3:61|28|29))|31))|45|(0)(0)|31))|76|6|7|(0)(0)|45|(0)(0)|31) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012c, code lost:
        if (defpackage.djb.a(r13, r15, r0) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa A[Catch: all -> 0x013f, TryCatch #0 {all -> 0x013f, blocks: (B:16:0x0033, B:76:0x012f, B:21:0x0042, B:68:0x010d, B:73:0x011e, B:71:0x0112, B:24:0x004b, B:63:0x00f6, B:65:0x00fa, B:27:0x0054, B:57:0x00d5, B:30:0x0061, B:44:0x00b0, B:48:0x00b8, B:51:0x00bf, B:54:0x00c4, B:49:0x00bb, B:60:0x00dd, B:72:0x0118, B:33:0x0077, B:35:0x007f, B:36:0x0083, B:41:0x0096), top: B:80:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.yk8 r14, defpackage.m42 r15) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r58.d(yk8, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:0: B:25:0x008c->B:30:0x00bd, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(defpackage.moc r22, defpackage.m42 r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r23
            java.lang.Object r3 = r0.b
            r4 = r3
            sja r4 = (defpackage.sja) r4
            cza r3 = r4.e
            boolean r5 = r2 instanceof defpackage.rja
            if (r5 == 0) goto L21
            r5 = r2
            rja r5 = (defpackage.rja) r5
            int r6 = r5.b
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r6 & r7
            if (r8 == 0) goto L21
            int r6 = r6 - r7
            r5.b = r6
        L1f:
            r9 = r5
            goto L27
        L21:
            rja r5 = new rja
            r5.<init>(r0, r2)
            goto L1f
        L27:
            java.lang.Object r0 = r9.a
            int r2 = r9.b
            r10 = 1
            if (r2 == 0) goto L3f
            if (r2 != r10) goto L38
            oia r1 = r9.e
            ilc r2 = r9.d
            defpackage.hre.r(r0)
            goto L84
        L38:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L3f:
            defpackage.hre.r(r0)
            java.lang.Object r0 = r1.a
            java.lang.Object r2 = r1.b
            java.lang.Object r1 = r1.c
            ilc r1 = (defpackage.ilc) r1
            oia r2 = (defpackage.oia) r2
            java.lang.Number r0 = (java.lang.Number) r0
            long r5 = r0.longValue()
            java.lang.Object r0 = r3.getValue()
            uja r0 = (defpackage.uja) r0
            java.util.List r0 = r0.b
            int r0 = r0.size()
            r4.f = r2
            r4.C = r1
            r4.D = r5
            r5 = 24
            if (r0 >= r5) goto L6a
            r7 = r5
            goto L6b
        L6a:
            r7 = r0
        L6b:
            int r5 = r2.d
            int r6 = r2.e
            r9.d = r1
            r9.e = r2
            r9.b = r10
            r8 = 0
            java.util.ArrayList r0 = r4.n(r5, r6, r7, r8, r9)
            n82 r5 = defpackage.n82.a
            if (r0 != r5) goto L7f
            return r5
        L7f:
            r20 = r2
            r2 = r1
            r1 = r20
        L84:
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r12 = defpackage.sja.j(r4, r0, r2)
            if (r3 == 0) goto Lbf
        L8c:
            java.lang.Object r0 = r3.getValue()
            r2 = r0
            uja r2 = (defpackage.uja) r2
            int r2 = r12.size()
            long r5 = (long) r2
            long r7 = r4.D
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 >= 0) goto La1
            r18 = r10
            goto La4
        La1:
            r2 = 0
            r18 = r2
        La4:
            int r13 = r1.b
            int r14 = r1.c
            boolean r2 = r1.h
            boolean r15 = r1.f
            boolean r5 = r1.g
            uja r11 = new uja
            r19 = 256(0x100, float:3.59E-43)
            r17 = r2
            r16 = r5
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            boolean r0 = r3.l(r0, r11)
            if (r0 == 0) goto L8c
        Lbf:
            pvc r0 = defpackage.pvc.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r58.g(moc, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x030b A[LOOP:0: B:60:0x030b->B:79:0x047d, LOOP_START, PHI: r1 r2 
      PHI: (r1v24 java.util.List) = (r1v23 java.util.List), (r1v34 java.util.List) binds: [B:59:0x0309, B:79:0x047d] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r2v6 long) = (r2v5 long), (r2v12 long) binds: [B:59:0x0309, B:79:0x047d] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.Object[] r60, defpackage.m42 r61) {
        /*
            Method dump skipped, instructions count: 1176
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r58.h(java.lang.Object[], m42):java.lang.Object");
    }

    public /* synthetic */ r58(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
