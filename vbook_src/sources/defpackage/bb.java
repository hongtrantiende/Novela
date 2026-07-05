package defpackage;

import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;
import com.reader.data.server.AndroidTestServerService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bb  reason: default package */
/* loaded from: classes3.dex */
public final class bb implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090 A[LOOP:0: B:33:0x0090->B:45:0x00cb, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.f34 r27, defpackage.m42 r28) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.a(f34, m42):java.lang.Object");
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        l9 l9Var;
        boolean z;
        Object value;
        Object value2;
        Object value3;
        ce1 ce1Var;
        String str;
        Object value4;
        kb2 kb2Var;
        boolean z2;
        Object f;
        Object value5;
        Object value6;
        ArrayList arrayList;
        Object value7;
        Object value8;
        n24 n24Var;
        boolean z3;
        Object value9;
        Object value10;
        boolean z4 = true;
        String str2 = null;
        switch (this.a) {
            case 0:
                l9 l9Var2 = (l9) obj;
                eb ebVar = (eb) this.b;
                cza czaVar = ebVar.d;
                if (czaVar != null) {
                    while (true) {
                        Object value11 = czaVar.getValue();
                        za zaVar = (za) value11;
                        if (!c16.i(l9Var2, f9.a) && !(l9Var2 instanceof h9)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        l9 l9Var3 = l9Var2;
                        l9Var = l9Var3;
                        if (!czaVar.l(value11, za.a(zaVar, z, false, null, null, null, l9Var3, null, 190))) {
                            l9Var2 = l9Var;
                        }
                    }
                } else {
                    l9Var = l9Var2;
                }
                if (l9Var instanceof h9) {
                    s02 s02Var = ebVar.e;
                    String message = ((h9) l9Var).a.getMessage();
                    if (message == null) {
                        message = "Data download failed";
                    }
                    ebVar.h(s02Var, new x9(message));
                }
                return pvc.a;
            case 1:
                pvc pvcVar = (pvc) obj;
                kw5 kw5Var = (kw5) this.b;
                if (Build.VERSION.SDK_INT >= 34) {
                    r4.A(kw5Var.r(), (View) kw5Var.b);
                }
                return pvc.a;
            case 2:
                if (c16.i((mlb) obj, mlb.a)) {
                    AndroidTestServerService androidTestServerService = (AndroidTestServerService) this.b;
                    z87.v(androidTestServerService.c, null, null, new um(androidTestServerService, null, 2), 3);
                    return pvc.a;
                }
                xk5.o();
                return null;
            case 3:
                pvc pvcVar2 = (pvc) obj;
                ((kw5) this.b).D();
                return pvc.a;
            case 4:
                kzb kzbVar = (kzb) obj;
                pvc pvcVar3 = pvc.a;
                AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) this.b;
                m41 m41Var = androidTextToSpeechService.L;
                if (c16.i(kzbVar, yyb.a)) {
                    tqc tqcVar = androidTextToSpeechService.J;
                    if (tqcVar != null) {
                        return tqcVar.v(m42Var);
                    }
                } else if (kzbVar instanceof zyb) {
                    boolean z5 = ((zyb) kzbVar).a;
                    cza czaVar2 = ((npc) androidTextToSpeechService.C.getValue()).a;
                    while (true) {
                        Object value12 = czaVar2.getValue();
                        boolean z6 = z5;
                        if (!czaVar2.l(value12, kpc.a((kpc) value12, null, 0, null, z5, false, false, false, Token.INC))) {
                            z5 = z6;
                        }
                    }
                } else if (c16.i(kzbVar, azb.a)) {
                    tqc tqcVar2 = androidTextToSpeechService.J;
                    if (tqcVar2 != null) {
                        long d = ((i2c) tqcVar2.e).d();
                        iya iyaVar = tqcVar2.A;
                        if (iyaVar != null) {
                            iyaVar.cancel(null);
                        }
                        cza czaVar3 = tqcVar2.i.c;
                        do {
                            value = czaVar3.getValue();
                            ((mpc) value).getClass();
                        } while (!czaVar3.l(value, new mpc(d)));
                        if (d > 0) {
                            tqcVar2.B = d;
                            tqcVar2.A = z87.v(tqcVar2.k, null, null, new pqc(tqcVar2, null), 3);
                        }
                    }
                } else if (c16.i(kzbVar, bzb.a)) {
                    boolean z7 = AndroidTextToSpeechService.R;
                    androidTextToSpeechService.g();
                    sw2 sw2Var = ab3.a;
                    z87.v(m41Var, ru2.c, null, new go(0, null, androidTextToSpeechService), 2);
                } else if (c16.i(kzbVar, czb.a)) {
                    sw2 sw2Var2 = ab3.a;
                    z87.v(m41Var, ru2.c, null, new go(1, null, androidTextToSpeechService), 2);
                } else if (c16.i(kzbVar, dzb.a)) {
                    sw2 sw2Var3 = ab3.a;
                    z87.v(m41Var, ru2.c, null, new go(2, null, androidTextToSpeechService), 2);
                } else if (c16.i(kzbVar, ezb.a)) {
                    AndroidTextToSpeechService.b(androidTextToSpeechService);
                } else if (c16.i(kzbVar, fzb.a)) {
                    AndroidTextToSpeechService.b(androidTextToSpeechService);
                } else if (kzbVar instanceof gzb) {
                    float f2 = ((gzb) kzbVar).a;
                    sw2 sw2Var4 = ab3.a;
                    z87.v(m41Var, ru2.c, null, new jo(androidTextToSpeechService, f2, null, 0), 2);
                } else if (c16.i(kzbVar, hzb.a)) {
                    sw2 sw2Var5 = ab3.a;
                    z87.v(m41Var, ru2.c, null, new go(3, null, androidTextToSpeechService), 2);
                } else if (c16.i(kzbVar, izb.a)) {
                    sw2 sw2Var6 = ab3.a;
                    z87.v(m41Var, ru2.c, null, new go(7, null, androidTextToSpeechService), 2);
                } else if (c16.i(kzbVar, jzb.a)) {
                    boolean z8 = AndroidTextToSpeechService.R;
                    androidTextToSpeechService.g();
                    sw2 sw2Var7 = ab3.a;
                    z87.v(m41Var, ru2.c, null, new go(10, null, androidTextToSpeechService), 2);
                } else {
                    xk5.o();
                    return null;
                }
                return pvcVar3;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    uo3 uo3Var = (uo3) this.b;
                    uo3Var.getClass();
                    so3 e = uo3Var.e();
                    e.getClass();
                    uo3Var.j(so3.a(e, null, null, null, null, null, 15).b());
                    uo3Var.c(uo3Var.e().a);
                }
                return pvc.a;
            case 6:
                List list = (List) obj;
                cza czaVar4 = ((z81) this.b).d;
                if (czaVar4 != null) {
                    do {
                        value2 = czaVar4.getValue();
                        ((y81) value2).getClass();
                        list.getClass();
                    } while (!czaVar4.l(value2, new y81(list, false)));
                    return pvc.a;
                }
                return pvc.a;
            case 7:
                return d((moc) obj, m42Var);
            case 8:
                wzc wzcVar = (wzc) obj;
                cza czaVar5 = ((ee1) this.b).e;
                if (czaVar5 != null) {
                    do {
                        value3 = czaVar5.getValue();
                        ce1Var = (ce1) value3;
                        if (wzcVar != null) {
                            str = wzcVar.a;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                    } while (!czaVar5.l(value3, ce1.a(ce1Var, false, false, false, false, str, null, null, Token.ASSIGN_DIV)));
                    return pvc.a;
                }
                return pvc.a;
            case 9:
                return d((moc) obj, m42Var);
            case 10:
                wzc wzcVar2 = (wzc) obj;
                cza czaVar6 = ((lb2) this.b).e;
                if (czaVar6 != null) {
                    do {
                        value4 = czaVar6.getValue();
                        kb2Var = (kb2) value4;
                        if (wzcVar2 != null && wzcVar2.e == 3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } while (!czaVar6.l(value4, kb2.a(kb2Var, false, false, false, false, z2, null, null, null, null, 495)));
                    return pvc.a;
                }
                return pvc.a;
            case 11:
                kw5 kw5Var2 = ((ce2) this.b).c;
                kw5Var2.C().updateCursorAnchorInfo((View) kw5Var2.b, (CursorAnchorInfo) obj);
                return pvc.a;
            case 12:
                pvc pvcVar4 = (pvc) obj;
                pvc pvcVar5 = pvc.a;
                gh2 gh2Var = (gh2) this.b;
                if (!(gh2Var.h.D() instanceof gf4) && (f = gh2.f(gh2Var, true, m42Var)) == n82.a) {
                    return f;
                }
                return pvcVar5;
            case 13:
                return a((f34) obj, m42Var);
            case 14:
                return g((String) obj, m42Var);
            case 15:
                ae3 ae3Var = (ae3) this.b;
                for (cn2 cn2Var : (List) obj) {
                    if (cn2Var.d) {
                        ae3Var.b.put(cn2Var.b, cn2Var.c);
                    }
                }
                return pvc.a;
            case 16:
                List list2 = (List) obj;
                cza czaVar7 = ((ie3) this.b).d;
                if (czaVar7 != null) {
                    do {
                        value5 = czaVar7.getValue();
                        ((ge3) value5).getClass();
                        list2.getClass();
                    } while (!czaVar7.l(value5, new ge3(list2, false)));
                    return pvc.a;
                }
                return pvc.a;
            case 17:
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (ef3 ef3Var : (List) obj) {
                    String f3 = zj1.f(ef3Var.j, "yyyyMMdd");
                    if (linkedHashMap.containsKey(f3)) {
                        ArrayList arrayList2 = (ArrayList) linkedHashMap.get(f3);
                        if (arrayList2 != null) {
                            arrayList2.add(ef3Var);
                        }
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        arrayList3.add(ef3Var);
                        linkedHashMap.put(f3, arrayList3);
                    }
                }
                cza czaVar8 = ((pg3) this.b).d;
                if (czaVar8 != null) {
                    do {
                        value6 = czaVar8.getValue();
                        mg3 mg3Var = (mg3) value6;
                        arrayList = new ArrayList(linkedHashMap.size());
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            arrayList.add(new kg3(((ef3) sl1.c0((List) entry.getValue())).j, (List) entry.getValue()));
                        }
                        mg3Var.getClass();
                    } while (!czaVar8.l(value6, new mg3(arrayList, false)));
                    return pvc.a;
                }
                return pvc.a;
            case 18:
                List list3 = (List) obj;
                cza czaVar9 = ((zq3) this.b).d;
                if (czaVar9 != null) {
                    do {
                        value7 = czaVar9.getValue();
                        ((yq3) value7).getClass();
                        list3.getClass();
                    } while (!czaVar9.l(value7, new yq3(list3)));
                    return pvc.a;
                }
                return pvc.a;
            case 19:
                p8b p8bVar = (p8b) obj;
                i04 i04Var = ((x04) this.b).E;
                gy2 gy2Var = (gy2) i04Var.u();
                gy2Var.getClass();
                fy2 fy2Var = new fy2(gy2Var);
                if (p8bVar != null) {
                    str2 = p8bVar.a;
                }
                fy2Var.f(str2);
                if (p8bVar != null) {
                    z4 = false;
                }
                fy2Var.i(3, z4);
                i04Var.P(new gy2(fy2Var));
                return pvc.a;
            case 20:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                cza czaVar10 = ((p24) this.b).C;
                if (czaVar10 != null) {
                    do {
                        value8 = czaVar10.getValue();
                        n24Var = (n24) value8;
                        if (booleanValue) {
                            z3 = n24Var.z;
                        } else {
                            z3 = false;
                        }
                    } while (!czaVar10.l(value8, n24.a(n24Var, false, null, 0, null, null, null, null, null, null, null, 0, 0, null, 0, 0L, null, null, null, null, null, false, false, false, false, z3, booleanValue, null, null, null, 973078527)));
                    return pvc.a;
                }
                return pvc.a;
            case 21:
                return h((List) obj, m42Var);
            case 22:
                List list4 = (List) obj;
                cza czaVar11 = ((m64) this.b).e;
                if (czaVar11 != null) {
                    do {
                        value9 = czaVar11.getValue();
                        ((l64) value9).getClass();
                        list4.getClass();
                    } while (!czaVar11.l(value9, new l64(list4, false)));
                    return pvc.a;
                }
                return pvc.a;
            case 23:
                ((Collection) this.b).add(obj);
                return pvc.a;
            case 24:
                moc mocVar = (moc) obj;
                w65 w65Var = (w65) this.b;
                klc klcVar = w65Var.c;
                Object obj2 = mocVar.a;
                Object obj3 = mocVar.b;
                ilc ilcVar = (ilc) mocVar.c;
                oia oiaVar = (oia) obj2;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (vl6 vl6Var : (List) obj3) {
                    long j = vl6Var.G;
                    String str3 = vl6Var.m;
                    String f4 = zj1.f(j, "yyyyMMdd");
                    if (linkedHashMap2.containsKey(f4)) {
                        ArrayList arrayList4 = (ArrayList) linkedHashMap2.get(f4);
                        if (arrayList4 != null) {
                            arrayList4.add(c16.z(vl6Var, ((plc) klcVar).h(vl6Var.b, ilcVar.a, vl6Var.C, ilcVar.a(str3), ilcVar.c)));
                        }
                    } else {
                        ArrayList arrayList5 = new ArrayList();
                        arrayList5.add(c16.z(vl6Var, ((plc) klcVar).h(vl6Var.b, ilcVar.a, vl6Var.C, ilcVar.a(str3), ilcVar.c)));
                        linkedHashMap2.put(f4, arrayList5);
                    }
                }
                cza czaVar12 = w65Var.C;
                if (czaVar12 != null) {
                    while (true) {
                        Object value13 = czaVar12.getValue();
                        t65 t65Var = (t65) value13;
                        int i = oiaVar.b;
                        int i2 = oiaVar.c;
                        boolean z9 = oiaVar.h;
                        boolean z10 = oiaVar.f;
                        boolean z11 = oiaVar.g;
                        ArrayList arrayList6 = new ArrayList(linkedHashMap2.size());
                        for (Iterator it = linkedHashMap2.entrySet().iterator(); it.hasNext(); it = it) {
                            Map.Entry entry2 = (Map.Entry) it.next();
                            arrayList6.add(new r65(((cia) sl1.c0((List) entry2.getValue())).j, (List) entry2.getValue()));
                            oiaVar = oiaVar;
                        }
                        oia oiaVar2 = oiaVar;
                        if (!czaVar12.l(value13, t65.a(t65Var, i, i2, z10, z11, z9, false, arrayList6, 64))) {
                            oiaVar = oiaVar2;
                        }
                    }
                }
                return pvc.a;
            case 25:
                if (((Boolean) obj).booleanValue()) {
                    hm8 hm8Var = ((kp6) this.b).g;
                    if (((np6) hm8Var.getValue()) != null) {
                        hm8Var.setValue(null);
                    }
                }
                return pvc.a;
            case 26:
                return a((f34) obj, m42Var);
            case 27:
                return c((ez5) obj, m42Var);
            case 28:
                ((kr7) this.b).c.i(((Number) obj).floatValue());
                return pvc.a;
            default:
                List list5 = (List) obj;
                cza czaVar13 = ((bx7) this.b).d;
                if (czaVar13 != null) {
                    do {
                        value10 = czaVar13.getValue();
                        ((zw7) value10).getClass();
                        list5.getClass();
                    } while (!czaVar13.l(value10, new zw7(list5, false)));
                    return pvc.a;
                }
                return pvc.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        if (defpackage.lq.c((defpackage.lq) r8, r2, null, null, null, r6, 14) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0073, code lost:
        if (defpackage.lq.c((defpackage.lq) r8, r2, null, null, null, r6, 14) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008d, code lost:
        if (defpackage.lq.c((defpackage.lq) r8, r2, null, null, null, r6, 14) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(defpackage.ez5 r9, defpackage.m42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.qq7
            if (r0 == 0) goto L14
            r0 = r10
            qq7 r0 = (defpackage.qq7) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.c = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            qq7 r0 = new qq7
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.a
            int r0 = r6.c
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L35
            if (r0 == r3) goto L31
            if (r0 == r2) goto L31
            if (r0 != r1) goto L2a
            goto L31
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L31:
            defpackage.hre.r(r10)
            goto L90
        L35:
            defpackage.hre.r(r10)
            boolean r10 = r9 instanceof defpackage.l59
            java.lang.Object r8 = r8.b
            n82 r0 = defpackage.n82.a
            if (r10 == 0) goto L59
            r1 = r8
            lq r1 = (defpackage.lq) r1
            java.lang.Float r2 = new java.lang.Float
            r8 = 1064682127(0x3f75c28f, float:0.96)
            r2.<init>(r8)
            r6.c = r3
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            java.lang.Object r8 = defpackage.lq.c(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L90
            goto L8f
        L59:
            boolean r10 = r9 instanceof defpackage.m59
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r10 == 0) goto L76
            r1 = r8
            lq r1 = (defpackage.lq) r1
            r8 = r2
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r3)
            r6.c = r8
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            java.lang.Object r8 = defpackage.lq.c(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L90
            goto L8f
        L76:
            boolean r9 = r9 instanceof defpackage.k59
            if (r9 == 0) goto L90
            lq r8 = (defpackage.lq) r8
            java.lang.Float r2 = new java.lang.Float
            r2.<init>(r3)
            r6.c = r1
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            r1 = r8
            java.lang.Object r8 = defpackage.lq.c(r1, r2, r3, r4, r5, r6, r7)
            if (r8 != r0) goto L90
        L8f:
            return r0
        L90:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.c(ez5, m42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01b7, code lost:
        if (r0 != r6) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0077 A[LOOP:0: B:22:0x0077->B:23:0x0086, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x01b7 -> B:36:0x00c6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(defpackage.moc r40, defpackage.m42 r41) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.d(moc, m42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r6 == r5) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
        if (r6 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006b, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.String r7, defpackage.m42 r8) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            m83 r0 = (defpackage.m83) r0
            boolean r1 = r8 instanceof defpackage.i83
            if (r1 == 0) goto L17
            r1 = r8
            i83 r1 = (defpackage.i83) r1
            int r2 = r1.e
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.e = r2
            goto L1c
        L17:
            i83 r1 = new i83
            r1.<init>(r6, r8)
        L1c:
            java.lang.Object r6 = r1.c
            int r8 = r1.e
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r8 == 0) goto L3d
            if (r8 == r3) goto L39
            if (r8 != r2) goto L33
            cza r7 = r1.b
            f34 r8 = r1.a
            defpackage.hre.r(r6)
            goto L6c
        L33:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L39:
            defpackage.hre.r(r6)
            goto L56
        L3d:
            defpackage.hre.r(r6)
            cza r6 = r0.V
            r6.m(r7)
            n64 r6 = r0.R
            c74 r6 = (defpackage.c74) r6
            hg3 r6 = r6.e(r7)
            r1.e = r3
            java.lang.Object r6 = defpackage.z1d.E(r6, r1)
            if (r6 != r5) goto L56
            goto L6b
        L56:
            r8 = r6
            f34 r8 = (defpackage.f34) r8
            cza r7 = r0.N
            klc r6 = r0.T
            r1.a = r8
            r1.b = r7
            r1.e = r2
            plc r6 = (defpackage.plc) r6
            java.lang.Integer r6 = r6.i()
            if (r6 != r5) goto L6c
        L6b:
            return r5
        L6c:
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            if (r6 != r3) goto L79
            if (r8 == 0) goto L79
            java.lang.String r6 = r8.h
            goto L7a
        L79:
            r6 = r4
        L7a:
            r7.m(r6)
            cza r6 = r0.H
            if (r8 == 0) goto L84
            java.util.Map r7 = r8.r
            goto L85
        L84:
            r7 = r4
        L85:
            if (r7 != 0) goto L89
            ls3 r7 = defpackage.ls3.a
        L89:
            r6.getClass()
            r6.n(r4, r7)
            r0.F()
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.g(java.lang.String, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a A[LOOP:1: B:28:0x007a->B:29:0x0091, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.util.List r6, defpackage.m42 r7) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.b
            p54 r0 = (defpackage.p54) r0
            boolean r1 = r7 instanceof defpackage.n54
            if (r1 == 0) goto L17
            r1 = r7
            n54 r1 = (defpackage.n54) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.d = r2
            goto L1c
        L17:
            n54 r1 = new n54
            r1.<init>(r5, r7)
        L1c:
            java.lang.Object r5 = r1.b
            int r7 = r1.d
            r2 = 1
            if (r7 == 0) goto L32
            if (r7 != r2) goto L2b
            java.util.List r6 = r1.a
            defpackage.hre.r(r5)
            goto L46
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L32:
            defpackage.hre.r(r5)
            n64 r5 = r0.c
            r1.a = r6
            r1.d = r2
            c74 r5 = (defpackage.c74) r5
            l54 r5 = r5.g()
            n82 r7 = defpackage.n82.a
            if (r5 != r7) goto L46
            return r7
        L46:
            l54 r5 = (defpackage.l54) r5
            if (r5 == 0) goto L76
            java.util.List r7 = defpackage.tl1.A(r5)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L57:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L72
            java.lang.Object r2 = r6.next()
            r3 = r2
            l54 r3 = (defpackage.l54) r3
            java.lang.String r3 = r3.a
            java.lang.String r4 = r5.a
            boolean r3 = defpackage.c16.i(r3, r4)
            if (r3 != 0) goto L57
            r1.add(r2)
            goto L57
        L72:
            java.util.ArrayList r6 = defpackage.sl1.n0(r7, r1)
        L76:
            cza r5 = r0.d
            if (r5 == 0) goto L93
        L7a:
            java.lang.Object r7 = r5.getValue()
            r0 = r7
            m54 r0 = (defpackage.m54) r0
            r0.getClass()
            r6.getClass()
            m54 r0 = new m54
            r1 = 0
            r0.<init>(r6, r1)
            boolean r7 = r5.l(r7, r0)
            if (r7 == 0) goto L7a
        L93:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bb.h(java.util.List, m42):java.lang.Object");
    }
}
