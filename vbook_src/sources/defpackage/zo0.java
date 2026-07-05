package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zo0  reason: default package */
/* loaded from: classes3.dex */
public abstract class zo0 {
    public Object a;
    public Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public zo0(ii2 ii2Var, bnc bncVar, fyb fybVar, fq5 fq5Var) {
        ii2Var.getClass();
        bncVar.getClass();
        fybVar.getClass();
        fq5Var.getClass();
        this.a = ii2Var;
        this.b = bncVar;
        this.c = fybVar;
        this.d = fq5Var;
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public static String c(String str) {
        String obj = k4b.N0(str).toString();
        if (r4b.Q(obj, "[", false) && r4b.I(obj, "]", false)) {
            List e0 = g9a.e0(new ki4(3, gm9.c(new gm9("\"(https?://[^\"]+)\""), obj), new nj0(3)));
            if (!e0.isEmpty()) {
                return sl1.i0(e0, "", null, null, new nj0(4), 30);
            }
            return str;
        }
        return str;
    }

    public static Object d(zo0 zo0Var, tj4 tj4Var, String str, aab aabVar) {
        return tj4Var.b(new b34(y24.C, 1, 1, z24.b, "", str), aabVar);
    }

    public static Object e(tj4 tj4Var, String str, aab aabVar) {
        str.getClass();
        return tj4Var.b(new b34(y24.D, 0, 0, z24.c, str, 38), aabVar);
    }

    public static Object f(zo0 zo0Var, tj4 tj4Var, y24 y24Var, int i, int i2, m42 m42Var) {
        zo0Var.getClass();
        return tj4Var.b(new b34(y24Var, i, i2, z24.a, "", 32), m42Var);
    }

    public static String i(hk2 hk2Var, boolean z) {
        String str;
        String str2;
        hk2Var.getClass();
        Map map = hk2Var.c;
        Map map2 = hk2Var.b;
        String str3 = "book";
        if (z) {
            str = p(map2, hk2Var);
        } else {
            String str4 = (String) map2.get("raw");
            if (str4 == null) {
                str = (String) sl1.d0(map2.values());
                if (str == null) {
                    str = "book";
                }
            } else {
                str = str4;
            }
        }
        if (z) {
            str2 = p(map, hk2Var);
        } else {
            str2 = (String) map.get("raw");
            if (str2 == null && (str2 = (String) sl1.d0(map.values())) == null) {
                str2 = "";
            }
        }
        StringBuilder sb = new StringBuilder();
        String o = o(str);
        if (!k4b.j0(o)) {
            str3 = o;
        }
        sb.append(str3);
        String o2 = o(str2);
        if (!k4b.j0(o2)) {
            sb.append("_");
            sb.append(o2);
        }
        return sb.toString();
    }

    public static final yk8 l(wmc wmcVar, int i, int i2) {
        Object obj;
        Object obj2;
        List list = wmcVar.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    xmc xmcVar = (xmc) obj;
                    int i3 = xmcVar.a;
                    if (i3 <= i && i < i3 + xmcVar.b) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            xmc xmcVar2 = (xmc) obj;
            if (xmcVar2 != null) {
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        xmc xmcVar3 = (xmc) obj2;
                        int i4 = xmcVar3.a;
                        if (i4 < i2 && i2 <= i4 + xmcVar3.b) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                xmc xmcVar4 = (xmc) obj2;
                if (xmcVar4 != null) {
                    return new yk8(Integer.valueOf(xmcVar2.c), Integer.valueOf(xmcVar4.c + xmcVar4.d));
                }
            }
        }
        return null;
    }

    public static String m(String str, List list, List list2) {
        List<String> list3;
        String a;
        k46 k46Var;
        String x;
        String obj = k4b.N0(str).toString();
        int i = 0;
        if (r4b.Q(obj, "[", false) && r4b.I(obj, "]", false)) {
            ArrayList arrayList = new ArrayList();
            try {
                for (k46 k46Var2 : l46.f(r36.d.c(k4b.N0(str).toString())).a) {
                    String str2 = null;
                    if (k46Var2 instanceof i56) {
                        i56 i56Var = (i56) k46Var2;
                        if (i56Var instanceof a56) {
                            a = null;
                        } else {
                            a = i56Var.a();
                        }
                        if (a != null) {
                            if (!k4b.j0(a)) {
                                str2 = a;
                            }
                            if (str2 != null) {
                                arrayList.add(str2);
                            }
                        }
                    } else if ((k46Var2 instanceof d56) && (k46Var = (k46) ((d56) k46Var2).get("link")) != null && (x = oc2.x(k46Var)) != null) {
                        if (!k4b.j0(x)) {
                            str2 = x;
                        }
                        if (str2 != null) {
                            arrayList.add(str2);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            if (arrayList.isEmpty()) {
                return "";
            }
            return sl1.i0(arrayList, "", null, null, new nj0(5), 30);
        }
        qa5 qa5Var = qa5.a;
        ps g = qa5.g(qa5.d(c(str)));
        String str3 = g.b;
        str3.getClass();
        ArrayList arrayList2 = new ArrayList(str3.length());
        int i2 = 0;
        int i3 = 0;
        while (i2 < str3.length()) {
            arrayList2.add(new o29(str3.charAt(i2), i3));
            i2++;
            i3++;
        }
        tb1 tb1Var = new tb1(arrayList2);
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            zp2 zp2Var = (zp2) it.next();
            tb1Var = tb1Var.d(zp2Var.c, "", zp2Var.e, false);
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            oo2 oo2Var = (oo2) it2.next();
            tb1Var = tb1Var.d(oo2Var.c, oo2Var.d, false, oo2Var.e);
        }
        ps g2 = tb1Var.g(g);
        qa5 qa5Var2 = qa5.a;
        String obj2 = k4b.N0(qa5.i(g2)).toString();
        if (k4b.j0(obj2) || !k4b.V(obj2, "<br", true)) {
            return obj2;
        }
        Pattern compile = Pattern.compile("(?i)(?:\\s*<br\\s*/?>\\s*)+");
        compile.getClass();
        String obj3 = k4b.N0(obj2).toString();
        obj3.getClass();
        k4b.w0(0);
        Matcher matcher = compile.matcher(obj3);
        if (!matcher.find()) {
            list3 = tl1.A(obj3.toString());
        } else {
            ArrayList arrayList3 = new ArrayList(10);
            int i4 = 0;
            do {
                arrayList3.add(obj3.subSequence(i4, matcher.start()).toString());
                i4 = matcher.end();
            } while (matcher.find());
            arrayList3.add(obj3.subSequence(i4, obj3.length()).toString());
            list3 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(tl1.s(list3, 10));
        for (String str4 : list3) {
            arrayList4.add(k4b.N0(str4).toString());
        }
        ArrayList arrayList5 = new ArrayList();
        int size = arrayList4.size();
        while (i < size) {
            Object obj4 = arrayList4.get(i);
            i++;
            if (!k4b.j0((String) obj4)) {
                arrayList5.add(obj4);
            }
        }
        if (arrayList5.isEmpty()) {
            return "";
        }
        if (arrayList5.size() == 1) {
            return "<p>" + sl1.c0(arrayList5) + "</p>";
        }
        return sl1.i0(arrayList5, "", null, null, new nj0(6), 30);
    }

    public static String o(String str) {
        Pattern compile = Pattern.compile("[\\\\/:*?\"<>|]");
        compile.getClass();
        String replaceAll = compile.matcher(str).replaceAll("_");
        replaceAll.getClass();
        return k4b.N0(replaceAll).toString();
    }

    public static String p(Map map, hk2 hk2Var) {
        String str;
        Object obj;
        String str2 = (String) map.get("raw");
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        String str4 = (String) hk2Var.C.get("engine_id");
        if (str4 == null) {
            str4 = "";
        }
        if (!k4b.j0(str4)) {
            String str5 = (String) map.get(str4);
            if (str5 == null) {
                str5 = "";
            }
            if (!k4b.j0(str5)) {
                return str5;
            }
        }
        Iterator it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (it.hasNext()) {
                obj = it.next();
                Map.Entry entry = (Map.Entry) obj;
                if (!c16.i(entry.getKey(), "raw") && !k4b.j0((CharSequence) entry.getValue())) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) obj;
        if (entry2 != null) {
            str = (String) entry2.getValue();
        }
        if (str != null) {
            str3 = str;
        }
        if (k4b.j0(str3)) {
            return str2;
        }
        return str3;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(2:3|(10:5|6|7|(4:(2:130|(1:(1:(1:(8:135|136|137|138|101|17|18|(3:49|50|(12:52|(1:54)(1:118)|(1:56)|57|58|59|60|61|62|(10:66|67|68|(1:70)(1:110)|71|72|(1:74)(1:109)|(1:76)|77|(4:79|(1:107)(1:83)|84|(2:86|87)(6:88|89|90|91|92|(6:94|95|96|97|98|(1:102)(5:100|101|17|18|(14:20|21|(2:23|(1:25))|26|27|(1:29)|30|31|32|33|34|35|(1:37)|38)(0)))))(4:108|91|92|(0)))|64|65)(2:119|120))(0))(2:142|143))(8:144|145|146|95|96|97|98|(0)(0)))(11:147|148|149|150|89|90|91|92|(0)|64|65))(12:154|155|156|67|68|(0)(0)|71|72|(0)(0)|(0)|77|(0)(0)))(4:10|11|12|13)|44|(1:46)|47)(3:159|(2:161|(2:163|(17:165|(1:167)|168|(2:171|169)|172|173|(1:175)(1:196)|176|177|(1:179)(1:193)|180|181|182|183|184|185|(1:188)(1:187))))|197)|14|15|16|17|18|(0)(0)))|198|6|7|(0)(0)|14|15|16|17|18|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x074c, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x074d, code lost:
        r2 = r47;
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0752, code lost:
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0753, code lost:
        r1 = r8;
        r2 = "qt";
        r3 = r13;
        r4 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04dd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x050d A[Catch: all -> 0x04d7, TryCatch #7 {all -> 0x04d7, blocks: (B:97:0x04ab, B:99:0x04b5, B:104:0x04e6, B:106:0x050d, B:110:0x0516, B:112:0x051c, B:116:0x056d, B:122:0x0591, B:118:0x0576), top: B:188:0x04ab }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0510  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x051c A[Catch: all -> 0x04d7, TryCatch #7 {all -> 0x04d7, blocks: (B:97:0x04ab, B:99:0x04b5, B:104:0x04e6, B:106:0x050d, B:110:0x0516, B:112:0x051c, B:116:0x056d, B:122:0x0591, B:118:0x0576), top: B:188:0x04ab }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x06b6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06f1  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0767  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x03e7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04b5 A[Catch: all -> 0x04d7, TryCatch #7 {all -> 0x04d7, blocks: (B:97:0x04ab, B:99:0x04b5, B:104:0x04e6, B:106:0x050d, B:110:0x0516, B:112:0x051c, B:116:0x056d, B:122:0x0591, B:118:0x0576), top: B:188:0x04ab }] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v66, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v69, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v87, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v90, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r13v30, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v0, types: [zo0] */
    /* JADX WARN: Type inference failed for: r1v27, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v49 */
    /* JADX WARN: Type inference failed for: r1v64, types: [hk2] */
    /* JADX WARN: Type inference failed for: r43v0, types: [zo0] */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.util.HashMap, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v47 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r5v47, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:135:0x06cd -> B:190:0x03e1). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.tj4 r44, java.lang.String r45, defpackage.w14 r46, defpackage.n42 r47) {
        /*
            Method dump skipped, instructions count: 1901
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo0.a(tj4, java.lang.String, w14, n42):java.lang.Object");
    }

    public void b() {
        HashMap hashMap = (HashMap) this.f;
        HashMap hashMap2 = (HashMap) this.e;
        Collection<dyb> values = hashMap2.values();
        values.getClass();
        for (dyb dybVar : values) {
            try {
                hl5.x(dybVar);
            } catch (Throwable unused) {
            }
        }
        hashMap2.clear();
        Collection<cq5> values2 = hashMap.values();
        values2.getClass();
        for (cq5 cq5Var : values2) {
            try {
                a82.w(cq5Var);
            } catch (Throwable unused2) {
            }
        }
        hashMap.clear();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:10)(2:26|27))(6:28|(1:30)|31|32|33|(1:35))|11|(1:13)(4:20|(1:22)|23|24)|14|(1:19)(2:16|17)))|38|6|7|(0)(0)|11|(0)(0)|14|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a1, code lost:
        r5 = new defpackage.gs9(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069 A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:11:0x0024, B:25:0x005d, B:28:0x0069, B:30:0x007c, B:31:0x008e, B:21:0x004e), top: B:39:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.String r6, int r7, defpackage.sm2 r8, defpackage.n42 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.wo0
            if (r0 == 0) goto L13
            r0 = r9
            wo0 r0 = (defpackage.wo0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            wo0 r0 = new wo0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            r2 = 0
            ls3 r3 = defpackage.ls3.a
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2b
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L28
            goto L5d
        L28:
            r5 = move-exception
            goto La1
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L32:
            defpackage.hre.r(r9)
            java.lang.Object r9 = r5.f
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r1 = r9.get(r6)
            if (r1 != 0) goto L4c
            java.lang.Object r5 = r5.d
            fq5 r5 = (defpackage.fq5) r5
            gq5 r5 = (defpackage.gq5) r5
            cq5 r1 = r5.a(r7, r6)
            r9.put(r6, r1)
        L4c:
            cq5 r1 = (defpackage.cq5) r1
            int r5 = r8.d     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r8.e     // Catch: java.lang.Throwable -> L28
            r0.c = r4     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = r1.u(r5, r6, r2, r0)     // Catch: java.lang.Throwable -> L28
            n82 r5 = defpackage.n82.a
            if (r9 != r5) goto L5d
            return r5
        L5d:
            eq5 r9 = (defpackage.eq5) r9     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r5 = r9.b     // Catch: java.lang.Throwable -> L28
            boolean r5 = r5.isEmpty()     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L69
            r5 = r3
            goto La7
        L69:
            java.util.ArrayList r5 = r9.b     // Catch: java.lang.Throwable -> L28
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L28
            r7 = 10
            int r7 = defpackage.tl1.s(r5, r7)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L28
            int r7 = r5.size()     // Catch: java.lang.Throwable -> L28
        L7a:
            if (r2 >= r7) goto L8e
            java.lang.Object r8 = r5.get(r2)     // Catch: java.lang.Throwable -> L28
            int r2 = r2 + 1
            hq5 r8 = (defpackage.hq5) r8     // Catch: java.lang.Throwable -> L28
            java.lang.String r8 = r8.a     // Catch: java.lang.Throwable -> L28
            i56 r8 = defpackage.l46.a(r8)     // Catch: java.lang.Throwable -> L28
            r6.add(r8)     // Catch: java.lang.Throwable -> L28
            goto L7a
        L8e:
            t36 r5 = new t36     // Catch: java.lang.Throwable -> L28
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = "raw"
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L28
            java.util.Map r5 = java.util.Collections.singletonMap(r6, r5)     // Catch: java.lang.Throwable -> L28
            r5.getClass()     // Catch: java.lang.Throwable -> L28
            goto La7
        La1:
            gs9 r6 = new gs9
            r6.<init>(r5)
            r5 = r6
        La7:
            boolean r6 = r5 instanceof defpackage.gs9
            if (r6 == 0) goto Lad
            goto Lae
        Lad:
            r3 = r5
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo0.g(java.lang.String, int, sm2, n42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|(2:3|(10:5|6|7|(1:(1:10)(2:27|28))(6:29|(1:31)|32|33|34|(1:36))|11|(1:13)|(3:18|19|(1:24)(2:21|22))|26|19|(0)(0)))|39|6|7|(0)(0)|11|(0)|(4:15|18|19|(0)(0))|26|19|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0078, code lost:
        r5 = new defpackage.gs9(r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: all -> 0x0028, TryCatch #0 {all -> 0x0028, blocks: (B:11:0x0024, B:25:0x005b, B:27:0x005f, B:29:0x0063, B:32:0x006a, B:21:0x004c), top: B:41:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(java.lang.String r6, int r7, defpackage.sm2 r8, defpackage.n42 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof defpackage.xo0
            if (r0 == 0) goto L13
            r0 = r9
            xo0 r0 = (defpackage.xo0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            xo0 r0 = new xo0
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.a
            int r1 = r0.c
            ls3 r2 = defpackage.ls3.a
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L28
            goto L5b
        L28:
            r5 = move-exception
            goto L78
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r4
        L30:
            defpackage.hre.r(r9)
            java.lang.Object r9 = r5.e
            java.util.HashMap r9 = (java.util.HashMap) r9
            java.lang.Object r1 = r9.get(r6)
            if (r1 != 0) goto L4a
            java.lang.Object r5 = r5.c
            fyb r5 = (defpackage.fyb) r5
            gyb r5 = (defpackage.gyb) r5
            dyb r1 = r5.a(r7, r6)
            r9.put(r6, r1)
        L4a:
            dyb r1 = (defpackage.dyb) r1
            int r5 = r8.d     // Catch: java.lang.Throwable -> L28
            java.lang.String r6 = r8.e     // Catch: java.lang.Throwable -> L28
            r0.c = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r9 = r1.J0(r5, r0, r6)     // Catch: java.lang.Throwable -> L28
            n82 r5 = defpackage.n82.a
            if (r9 != r5) goto L5b
            return r5
        L5b:
            eyb r9 = (defpackage.eyb) r9     // Catch: java.lang.Throwable -> L28
            if (r9 == 0) goto L61
            java.lang.String r4 = r9.b     // Catch: java.lang.Throwable -> L28
        L61:
            if (r4 == 0) goto L76
            boolean r5 = defpackage.k4b.j0(r4)     // Catch: java.lang.Throwable -> L28
            if (r5 == 0) goto L6a
            goto L76
        L6a:
            java.lang.String r5 = "raw"
            java.lang.String r6 = r9.b     // Catch: java.lang.Throwable -> L28
            java.util.Map r5 = java.util.Collections.singletonMap(r5, r6)     // Catch: java.lang.Throwable -> L28
            r5.getClass()     // Catch: java.lang.Throwable -> L28
            goto L7e
        L76:
            r5 = r2
            goto L7e
        L78:
            gs9 r6 = new gs9
            r6.<init>(r5)
            r5 = r6
        L7e:
            boolean r6 = r5 instanceof defpackage.gs9
            if (r6 == 0) goto L84
            goto L85
        L84:
            r2 = r5
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo0.h(java.lang.String, int, sm2, n42):java.lang.Object");
    }

    public Map j() {
        return o17.s(new yk8("name", (String) this.b), new yk8("nameCondition", null), new yk8("modifiers", (LinkedHashSet) this.c), new yk8("modifiersNot", (LinkedHashSet) this.d), new yk8("modifiersCondition", null), new yk8("isSynthetic", null), new yk8("isSyntheticNot", null), new yk8("annotations", (LinkedHashSet) this.e), new yk8("annotationsNot", (LinkedHashSet) this.f), new yk8("genericString", null));
    }

    public ii2 k() {
        return (ii2) this.a;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:1|(2:3|(18:5|6|7|(1:(4:10|11|12|13)(2:92|93))(2:94|(1:96)(4:97|(1:99)|(2:101|(6:103|(1:105)|106|(1:149)|110|(1:112)(1:(8:148|62|(2:63|(2:65|(1:81)(1:70))(2:83|84))|71|(1:73)|(1:75)|76|(1:78)(1:79))(4:116|(1:118)(1:147)|119|(1:121)(15:122|(1:124)|125|(1:127)|128|(1:130)|131|(1:133)|134|135|136|(1:138)|139|140|(1:142)(1:143))))))|150))|14|15|16|(1:18)|19|(2:21|(1:(11:24|(4:27|(1:33)(3:29|30|31)|32|25)|34|35|(4:38|(1:44)(3:40|41|42)|43|36)|45|46|(4:49|(1:55)(3:51|52|53)|54|47)|56|57|58)(1:60)))|61|62|(3:63|(0)(0)|81)|71|(0)|(0)|76|(0)(0)))|151|6|7|(0)(0)|14|15|16|(0)|19|(0)|61|62|(3:63|(0)(0)|81)|71|(0)|(0)|76|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x011b, code lost:
        r0 = th;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x024a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0234 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(java.util.Map r15, defpackage.hk2 r16, boolean r17, defpackage.zmc r18, boolean r19, defpackage.n42 r20) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo0.n(java.util.Map, hk2, boolean, zmc, boolean, n42):java.lang.Object");
    }

    public zo0() {
        this.c = new LinkedHashSet();
        this.d = new LinkedHashSet();
        this.e = new LinkedHashSet();
        this.f = new LinkedHashSet();
    }
}
