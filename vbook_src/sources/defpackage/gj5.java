package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gj5  reason: default package */
/* loaded from: classes.dex */
public abstract class gj5 {
    public static final gm9 a = new gm9("^[^:]+:");
    public static final gm9 b = new gm9("\\^(10|[1-9])");
    public static final gm9 c = new gm9("^s", 0);
    public static final gm9 d = new gm9("^\\d+$");
    public static final gm9 e = new gm9("\\s+");
    public static final gm9 f = new gm9("^제\\d+[조장절편]");
    public static final gm9 g = new gm9("^그림입니다");
    public static final gm9 h = new gm9("^(?:모서리가 둥근 |둥근 )?[^\\n]{1,20}입니다\\.?$");
    public static final gm9 i = new gm9("^https?://(?=https?://)", 0);
    public static final gm9 j = new gm9("[ \\t]+");
    public static final gm9 k = new gm9("^그림입니다\\.?\\s*원본\\s*그림의\\s*(이름|크기)");
    public static final gm9 l = new gm9("그림입니다\\.?\\s*원본\\s*그림의\\s*(이름|크기)[^\\n]*(\\n[^\\n]*원본\\s*그림의\\s*(이름|크기)[^\\n]*)*");
    public static final gm9 m = new gm9("(?:모서리가 둥근 |둥근 )?(?:사각형|직사각형|정사각형|원|타원|삼각형|선|직선|곡선|화살표|오각형|육각형|팔각형|별|십자|구름|마름모|도넛|평행사변형|사다리꼴|개체|그리기\\s?개체|묶음\\s?개체|글상자|표|그림|OLE\\s?개체)\\s?입니다\\.?");

    public static final void A(mce mceVar, Map map) {
        for (String str : tl1.B("hh:style", "style", "hp:style")) {
            ArrayList j2 = mceVar.j(str);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n66 n66Var = (n66) j2.get(i2);
                String a2 = n66Var.a("id");
                String str2 = "";
                if (a2 == null) {
                    a2 = "";
                }
                if (a2.length() == 0 && (a2 = n66Var.a("IDRef")) == null) {
                    a2 = "";
                }
                if (a2.length() == 0) {
                    a2 = String.valueOf(i2);
                }
                String a3 = n66Var.a("name");
                if (a3 != null) {
                    str2 = a3;
                }
                if (str2.length() == 0) {
                    n66Var.a("engName");
                }
                n66Var.a("charPrIDRef");
                n66Var.a("paraPrIDRef");
                map.put(a2, new fn8(4));
            }
        }
    }

    public static final ck5 B(sf2 sf2Var, ck5 ck5Var, fr2 fr2Var, ArrayList arrayList, int[] iArr, ArrayList arrayList2, int i2) {
        ck5 B;
        boolean z;
        String str;
        if (i2 > 200) {
            return ck5Var;
        }
        List<List> list = ck5Var.c;
        int i3 = 10;
        ArrayList arrayList3 = new ArrayList(tl1.s(list, 10));
        boolean z2 = false;
        for (List<bk5> list2 : list) {
            ArrayList arrayList4 = new ArrayList(tl1.s(list2, i3));
            for (bk5 bk5Var : list2) {
                List list3 = bk5Var.d;
                if (list3 != null && !list3.isEmpty()) {
                    String str2 = bk5Var.a;
                    ArrayList arrayList5 = new ArrayList(list3);
                    int size = arrayList5.size();
                    boolean z3 = false;
                    for (int i4 = 0; i4 < size; i4++) {
                        zj5 zj5Var = (zj5) arrayList5.get(i4);
                        ak5 ak5Var = zj5Var.a;
                        ck5 ck5Var2 = zj5Var.c;
                        if (ak5Var == ak5.e && zj5Var.b != null) {
                            zg4 D = D(sf2Var, zj5Var, fr2Var, arrayList, iArr, arrayList2);
                            arrayList5.set(i4, (zj5) D.b);
                            String str3 = (String) D.c;
                            if (str3 != null && (str = (String) D.d) != null) {
                                z = false;
                                str2 = r4b.N(str2, false, str3, str);
                            } else {
                                z = false;
                            }
                        } else {
                            if (ak5Var == ak5.b && ck5Var2 != null && (B = B(sf2Var, ck5Var2, fr2Var, arrayList, iArr, arrayList2, i2 + 1)) != ck5Var2) {
                                arrayList5.set(i4, zj5.a(zj5Var, null, null, B, null, null, null, null, null, null, 4091));
                            }
                        }
                        z3 = true;
                    }
                    if (z3) {
                        bk5Var = bk5.a(bk5Var, str2, arrayList5, 22);
                        z2 = true;
                    }
                }
                arrayList4.add(bk5Var);
            }
            arrayList3.add(arrayList4);
            i3 = 10;
        }
        if (!z2) {
            return ck5Var;
        }
        return ck5.a(ck5Var, arrayList3, null, 27);
    }

    public static final String C(sf2 sf2Var, String str) {
        Object obj;
        str.getClass();
        if (sf2Var.a.containsKey(str)) {
            return str;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        Iterator it = sf2Var.c().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                String lowerCase2 = ((String) obj).toLowerCase(Locale.ROOT);
                lowerCase2.getClass();
                if (lowerCase2.equals(lowerCase)) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (String) obj;
    }

    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final zg4 D(sf2 sf2Var, zj5 zj5Var, fr2 fr2Var, ArrayList arrayList, int[] iArr, ArrayList arrayList2) {
        String str;
        LinkedHashMap linkedHashMap;
        Object obj;
        byte[] bArr;
        String str2;
        fr2 fr2Var2 = fr2Var;
        LinkedHashMap linkedHashMap2 = sf2Var.a;
        String str3 = zj5Var.b;
        str3.getClass();
        List<String> B = tl1.B("BinData/".concat(str3), "Contents/BinData/".concat(str3), str3);
        ?? r15 = 0;
        Object obj2 = null;
        if (!k4b.V(str3, ".", false)) {
            for (String str4 : tl1.B("BinData/".concat(str3), "Contents/BinData/".concat(str3))) {
                Pattern compile = Pattern.compile("[.*+?^${}()|\\[\\]\\\\]");
                compile.getClass();
                str4.getClass();
                String replaceAll = compile.matcher(str4).replaceAll("\\\\$0");
                replaceAll.getClass();
                Pattern compile2 = Pattern.compile("^" + replaceAll + "\\.[a-zA-Z0-9]+$");
                compile2.getClass();
                List c2 = sf2Var.c();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : c2) {
                    String str5 = (String) obj3;
                    str5.getClass();
                    if (compile2.matcher(str5).matches()) {
                        arrayList3.add(obj3);
                    }
                }
                if (!arrayList3.isEmpty()) {
                    str = (String) arrayList3.get(0);
                    break;
                }
            }
        }
        str = null;
        if (str != null) {
            B = sl1.n0(tl1.A(str), B);
        }
        boolean z = false;
        for (String str6 : B) {
            if (!l2d.c(str6) && linkedHashMap2.containsKey(str6)) {
                try {
                    try {
                        bArr = (byte[]) linkedHashMap2.get(str6);
                    } catch (t96 e2) {
                        throw e2;
                    }
                } catch (Throwable unused) {
                }
                if (bArr != null) {
                    long length = fr2Var2.a + bArr.length;
                    fr2Var2.a = length;
                    if (length <= 104857600) {
                        String str7 = "png";
                        if (k4b.V(str6, ".", r15) && (str2 = (String) sl1.k0(k4b.z0(str6, new String[]{"."}))) != null) {
                            str7 = str2;
                        }
                        String n = n(str7);
                        int i2 = iArr[r15] + 1;
                        iArr[r15] = i2;
                        String str8 = "image_" + k4b.r0(3, String.valueOf(i2)) + "." + q(n);
                        arrayList.add(new p94(str8, n, bArr));
                        linkedHashMap = linkedHashMap2;
                        obj = obj2;
                        try {
                            try {
                                return new zg4(6, zj5.a(zj5Var, null, str8, null, null, null, null, null, null, new bn5(n, str3, bArr), 2045), "![image](" + str3 + ")", "![image](" + str8 + ")");
                            } catch (Throwable unused2) {
                                z = true;
                            }
                        } catch (Throwable unused3) {
                            continue;
                        }
                    } else {
                        linkedHashMap = linkedHashMap2;
                        obj = obj2;
                        throw new Exception("ZIP uncompressed size exceeded (decompression bomb suspected)");
                        break;
                    }
                    continue;
                    fr2Var2 = fr2Var;
                    obj2 = obj;
                    linkedHashMap2 = linkedHashMap;
                    r15 = 0;
                }
            }
            linkedHashMap = linkedHashMap2;
            obj = obj2;
            fr2Var2 = fr2Var;
            obj2 = obj;
            linkedHashMap2 = linkedHashMap;
            r15 = 0;
        }
        Object obj4 = obj2;
        if (!z) {
            arrayList2.add(new sm8("Image file not found: ".concat(str3), gfd.a, zj5Var.e));
            return new zg4(6, zj5.a(zj5Var, ak5.a, hl5.n("[이미지: ", str3, "]"), null, null, null, null, null, null, null, 4092), hl5.n("![image](", str3, ")"), hl5.n("[이미지: ", str3, "]"));
        }
        return new zg4(6, zj5Var, obj4, obj4);
    }

    /* JADX WARN: Type inference failed for: r3v6, types: [zl9, java.lang.Object] */
    public static final eb5 E(n66 n66Var, bm1 bm1Var) {
        String a2;
        jl8 jl8Var;
        Integer num;
        bm1 bm1Var2 = (bm1) bm1Var.b;
        LinkedHashMap linkedHashMap = (LinkedHashMap) ((yx9) bm1Var.d).b;
        String str = null;
        if (bm1Var2 != null && (a2 = n66Var.a("paraPrIDRef")) != null && a2.length() != 0 && (jl8Var = (jl8) ((LinkedHashMap) bm1Var2.f).get(a2)) != null) {
            int i2 = jl8Var.c;
            String str2 = jl8Var.b;
            String str3 = jl8Var.a;
            if (c16.i(str3, "BULLET")) {
                String str4 = (String) ((LinkedHashMap) bm1Var2.e).get(str2);
                if (str4 != null) {
                    return new eb5(2, (Integer) null, str4);
                }
            } else {
                if (c16.i(str3, "OUTLINE") && (str2 = (String) bm1Var.e) == null) {
                    str2 = "1";
                }
                int i3 = 1;
                int i4 = i2 + 1;
                int min = Math.min(i4, 10);
                if (c16.i(str3, "OUTLINE")) {
                    num = Integer.valueOf(Math.min(i4, 6));
                } else {
                    num = null;
                }
                b78 b78Var = (b78) ((LinkedHashMap) bm1Var2.d).get(str2);
                if (b78Var == null) {
                    if (num != null) {
                        return new eb5(1, num, (String) null);
                    }
                } else {
                    ?? obj = new Object();
                    Object obj2 = linkedHashMap.get(str2);
                    obj.a = obj2;
                    if (obj2 == null) {
                        int[] iArr = new int[11];
                        obj.a = iArr;
                        linkedHashMap.put(str2, iArr);
                    }
                    il8 il8Var = (il8) b78Var.a.get(Integer.valueOf(min));
                    int[] iArr2 = (int[]) obj.a;
                    int i5 = iArr2[min];
                    if (i5 == 0) {
                        if (il8Var != null) {
                            i3 = il8Var.c;
                        }
                    } else {
                        i3 = 1 + i5;
                    }
                    iArr2[min] = i3;
                    for (int i6 = min + 1; i6 < 11; i6++) {
                        ((int[]) obj.a)[i6] = 0;
                    }
                    if (il8Var != null) {
                        str = k4b.N0(il8Var.b).toString();
                    }
                    if (str == null || str.length() == 0) {
                        str = hl5.l("^", ".", min);
                    }
                    return new eb5(23, b.h(str, new j34(10, b78Var, obj)), num);
                }
            }
        }
        return null;
    }

    public static final String F(int i2) {
        if (i2 > 0 && i2 < 4000) {
            String str = "";
            for (yk8 yk8Var : tl1.B(new yk8(1000, "M"), new yk8(900, "CM"), new yk8(500, "D"), new yk8(400, "CD"), new yk8(100, "C"), new yk8(90, "XC"), new yk8(50, "L"), new yk8(40, "XL"), new yk8(10, "X"), new yk8(9, "IX"), new yk8(5, "V"), new yk8(4, "IV"), new yk8(1, "I"))) {
                int intValue = ((Number) yk8Var.a).intValue();
                String str2 = (String) yk8Var.b;
                while (i2 >= intValue) {
                    str = nk2.u(str, str2);
                    i2 -= intValue;
                }
            }
            return str;
        }
        return String.valueOf(i2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        if (r2.equals("connectLine") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
        r4 = r10;
        r10 = r11;
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0066, code lost:
        if (r2.equals("curve") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006f, code lost:
        if (r2.equals("rect") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0078, code lost:
        if (r2.equals("line") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
        if (r2.equals("ctrl") == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b8, code lost:
        if (r2.equals("run") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
        if (r2.equals("pic") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d0, code lost:
        if (r2.equals("arc") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00dc, code lost:
        if (r2.equals("r") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e8, code lost:
        if (r2.equals("polygon") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f4, code lost:
        if (r2.equals("container") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0100, code lost:
        if (r2.equals("drawingObject") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x014e, code lost:
        if (r2.equals("ellipse") == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0152, code lost:
        r3 = r9;
        G(r3, r4, r10, r6, r3, r14 + 1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void G(defpackage.zl9 r9, java.util.ArrayList r10, java.util.ArrayList r11, defpackage.bm1 r12, defpackage.n66 r13, int r14) {
        /*
            Method dump skipped, instructions count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.G(zl9, java.util.ArrayList, java.util.ArrayList, bm1, n66, int):void");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0368, code lost:
        if (r1.equals("drawingObject") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r1.equals("memogroup") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (r1.equals("memo") == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b6, code lost:
        if (i(r0).length() <= 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b8, code lost:
        ((java.util.ArrayList) r4.f).add(new defpackage.sm8("Memo text excluded from body: memogroup", defpackage.gfd.f, r12));
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x036e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0381  */
    /* JADX WARN: Type inference failed for: r0v10, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v31, types: [java.lang.Object, la1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(defpackage.n66 r44, java.util.ArrayList r45, defpackage.ujb r46, java.util.ArrayList r47, defpackage.bm1 r48, int r49) {
        /*
            Method dump skipped, instructions count: 1148
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.H(n66, java.util.ArrayList, ujb, java.util.ArrayList, bm1, int):void");
    }

    public static final void a(ArrayList arrayList, yx9 yx9Var) {
        eb5 eb5Var = (eb5) yx9Var.c;
        ArrayList arrayList2 = (ArrayList) eb5Var.b;
        ArrayList arrayList3 = (ArrayList) eb5Var.c;
        boolean isEmpty = arrayList2.isEmpty();
        ak5 ak5Var = ak5.a;
        int i2 = 0;
        char c2 = '\n';
        if (!isEmpty) {
            ArrayList arrayList4 = new ArrayList(tl1.s(arrayList2, 10));
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                arrayList4.add(new zj5(ak5Var, (String) arrayList2.get(i3), null, null, 1, null, null, null, null, 4076));
                i3++;
                size = size;
                c2 = '\n';
            }
            arrayList.addAll(0, arrayList4);
        }
        if (!arrayList3.isEmpty()) {
            ArrayList arrayList5 = new ArrayList(tl1.s(arrayList3, 10));
            int size2 = arrayList3.size();
            while (i2 < size2) {
                Object obj = arrayList3.get(i2);
                i2++;
                arrayList5.add(new zj5(ak5Var, (String) obj, null, null, null, null, null, null, null, 4092));
            }
            arrayList.addAll(arrayList5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
        if (r4.equals("para") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
        if (r4.equals("p") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
        r3 = (java.lang.String) g(r3, (defpackage.bm1) r9.b, r9).b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        if (r3.length() <= 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
        r0.add(r3);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String b(defpackage.n66 r8, defpackage.bm1 r9, int r10) {
        /*
            r0 = 10
            if (r10 <= r0) goto L7
            java.lang.String r8 = ""
            return r8
        L7:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r8 = r8.b()
            int r1 = r8.size()
            r2 = 0
        L15:
            if (r2 >= r1) goto L7e
            java.lang.Object r3 = r8.get(r2)
            n66 r3 = (defpackage.n66) r3
            org.w3c.dom.Node r4 = r3.a
            short r4 = r4.getNodeType()
            r5 = 1
            if (r4 != r5) goto L7b
            java.lang.String r4 = o(r3)
            int r6 = r4.hashCode()
            r7 = 112(0x70, float:1.57E-43)
            if (r6 == r7) goto L4f
            r7 = 114622(0x1bfbe, float:1.6062E-40)
            if (r6 == r7) goto L46
            r7 = 3433440(0x3463e0, float:4.811274E-39)
            if (r6 == r7) goto L3d
            goto L57
        L3d:
            java.lang.String r6 = "para"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L66
            goto L57
        L46:
            java.lang.String r6 = "tbl"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L7b
            goto L57
        L4f:
            java.lang.String r6 = "p"
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L66
        L57:
            int r5 = r5 + r10
            java.lang.String r3 = b(r3, r9, r5)
            int r4 = r3.length()
            if (r4 <= 0) goto L7b
            r0.add(r3)
            goto L7b
        L66:
            java.lang.Object r4 = r9.b
            bm1 r4 = (defpackage.bm1) r4
            oaa r3 = g(r3, r4, r9)
            java.lang.Object r3 = r3.b
            java.lang.String r3 = (java.lang.String) r3
            int r4 = r3.length()
            if (r4 <= 0) goto L7b
            r0.add(r3)
        L7b:
            int r2 = r2 + 1
            goto L15
        L7e:
            r4 = 0
            r5 = 62
            java.lang.String r1 = "\n"
            r2 = 0
            r3 = 0
            java.lang.String r8 = defpackage.sl1.i0(r0, r1, r2, r3, r4, r5)
            java.lang.CharSequence r8 = defpackage.k4b.N0(r8)
            java.lang.String r8 = r8.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.b(n66, bm1, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x020c  */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ujb c(defpackage.ujb r28, java.util.ArrayList r29, java.util.ArrayList r30, defpackage.bm1 r31) {
        /*
            Method dump skipped, instructions count: 819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.c(ujb, java.util.ArrayList, java.util.ArrayList, bm1):ujb");
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Type inference failed for: r0v9, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.n66 r28, java.util.ArrayList r29, defpackage.bm1 r30) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.d(n66, java.util.ArrayList, bm1):void");
    }

    public static final String e(n66 n66Var) {
        n66 j2;
        String e2;
        String a2 = n66Var.a("type");
        if (a2 == null) {
            a2 = "";
        }
        String upperCase = a2.toUpperCase(Locale.ROOT);
        upperCase.getClass();
        if (upperCase.equals("HYPERLINK") && (j2 = j(n66Var, "parameters")) != null) {
            ArrayList b2 = j2.b();
            int size = b2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n66 n66Var2 = (n66) b2.get(i2);
                if (n66Var2.a.getNodeType() == 1 && o(n66Var2).equals("stringParam") && c16.i(n66Var2.a("name"), "Path")) {
                    String obj = k4b.N0(n66Var2.f()).toString();
                    if (obj.length() != 0 && (e2 = l2d.e(i.i(obj, ""))) != null) {
                        return e2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0077 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String f(defpackage.n66 r9) {
        /*
            java.util.ArrayList r0 = r9.b()
            int r1 = r0.size()
            r2 = 0
        L9:
            java.lang.String r3 = "binaryItemIDRef"
            java.lang.String r4 = ""
            if (r2 >= r1) goto L7a
            java.lang.Object r5 = r0.get(r2)
            n66 r5 = (defpackage.n66) r5
            org.w3c.dom.Node r6 = r5.a
            short r6 = r6.getNodeType()
            r7 = 1
            if (r6 != r7) goto L77
            java.lang.String r6 = o(r5)
            int r7 = r6.hashCode()
            r8 = 104387(0x197c3, float:1.46277E-40)
            if (r7 == r8) goto L48
            r8 = 1916409267(0x723a15b3, float:3.6857885E30)
            if (r7 == r8) goto L3f
            r8 = 1916849223(0x7240cc47, float:3.818757E30)
            if (r7 == r8) goto L36
            goto L70
        L36:
            java.lang.String r7 = "imgRect"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L51
            goto L70
        L3f:
            java.lang.String r7 = "imgClip"
            boolean r6 = r6.equals(r7)
            if (r6 == 0) goto L70
            goto L51
        L48:
            java.lang.String r7 = "img"
            boolean r6 = r6.equals(r7)
            if (r6 != 0) goto L51
            goto L70
        L51:
            java.lang.String r3 = r5.a(r3)
            if (r3 != 0) goto L58
            r3 = r4
        L58:
            int r6 = r3.length()
            if (r6 != 0) goto L69
            java.lang.String r3 = "href"
            java.lang.String r3 = r5.a(r3)
            if (r3 != 0) goto L67
            goto L68
        L67:
            r4 = r3
        L68:
            r3 = r4
        L69:
            int r4 = r3.length()
            if (r4 <= 0) goto L70
            return r3
        L70:
            java.lang.String r3 = f(r5)
            if (r3 == 0) goto L77
            return r3
        L77:
            int r2 = r2 + 1
            goto L9
        L7a:
            java.lang.String r9 = r9.a(r3)
            if (r9 != 0) goto L81
            goto L82
        L81:
            r4 = r9
        L82:
            int r9 = r4.length()
            if (r9 <= 0) goto L89
            return r4
        L89:
            r9 = 0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.f(n66):java.lang.String");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v0, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [zl9, java.lang.Object] */
    public static final oaa g(n66 n66Var, bm1 bm1Var, bm1 bm1Var2) {
        Object obj;
        fj5 fj5Var;
        Boolean bool;
        ?? obj2 = new Object();
        obj2.a = "";
        ?? obj3 = new Object();
        ?? obj4 = new Object();
        ?? obj5 = new Object();
        h(bm1Var2, obj2, obj3, obj4, obj5, n66Var);
        int f0 = k4b.f0((CharSequence) obj2.a, (char) 31, 0, 6);
        if (f0 >= 0) {
            obj2.a = ((String) obj2.a).substring(0, f0);
        }
        String obj6 = k4b.N0(j.i((CharSequence) obj2.a, " ")).toString();
        if (k.a(obj6)) {
            obj6 = "";
        }
        String obj7 = k4b.N0(m.i(k4b.N0(l.i(obj6, "")).toString(), "")).toString();
        tv5 tv5Var = null;
        if (bm1Var != null && (obj = obj5.a) != null && (fj5Var = (fj5) ((LinkedHashMap) bm1Var.b).get(obj)) != null) {
            Double d2 = fj5Var.a;
            if (d2 == null) {
                d2 = null;
            }
            Boolean bool2 = fj5Var.b;
            Boolean bool3 = Boolean.TRUE;
            if (c16.i(bool2, bool3)) {
                bool = bool3;
            } else {
                bool = null;
            }
            if (!c16.i(fj5Var.c, bool3)) {
                bool3 = null;
            }
            String str = fj5Var.d;
            if (str == null) {
                str = null;
            }
            tv5 tv5Var2 = new tv5(bool, bool3, d2, str);
            if (d2 != null || bool != null || bool3 != null) {
                tv5Var = tv5Var2;
            }
        }
        return new oaa(obj7, (String) obj3.a, (String) obj4.a, tv5Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0250, code lost:
        if (r3.equals("bookmark") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0281, code lost:
        if (r3.equals("pageNumCtrl") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x028a, code lost:
        if (r3.equals("pageHiding") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x02b4, code lost:
        if (r3.equals("colPr") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02bb, code lost:
        if (r3.equals("insertBegin") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x02d7, code lost:
        if (r3.equals("insertEnd") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02e1, code lost:
        if (r3.equals("autoNum") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02eb, code lost:
        if (r3.equals("pageNum") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02f5, code lost:
        if (r3.equals("indexmark") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02fd, code lost:
        if (r3.equals("fieldEnd") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0307, code lost:
        if (r3.equals("newNum") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0325, code lost:
        if (r3.equals("header") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0329, code lost:
        r32 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0335, code lost:
        if (r3.equals("footer") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0339, code lost:
        r2 = b(r2, r27, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0341, code lost:
        if (r2.length() <= 0) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0343, code lost:
        r3 = r3.equals("header");
        r14 = (defpackage.eb5) r8.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x034b, code lost:
        if (r3 == false) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x034d, code lost:
        r3 = (java.util.ArrayList) r14.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0352, code lost:
        r3 = (java.util.ArrayList) r14.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x035a, code lost:
        if (r3.contains(r2) != false) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x035c, code lost:
        r3.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x035f, code lost:
        r3 = r22;
        r14 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0371, code lost:
        if (r3.equals(r14) == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x03dc, code lost:
        if (r3.equals("tbl") == false) goto L205;
     */
    /* JADX WARN: Code restructure failed: missing block: B:216:0x044e, code lost:
        if (r3.equals("pic") == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x0465, code lost:
        if (r3.equals("fn") == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x0468, code lost:
        r24 = r5;
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x047a, code lost:
        if (r3.equals("en") == false) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
        if (r3.equals("boolParam") == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:269:0x0562, code lost:
        if (r3.equals("fwSpace") == false) goto L254;
     */
    /* JADX WARN: Code restructure failed: missing block: B:295:0x0604, code lost:
        if (r3.equals(r23) == false) goto L254;
     */
    /* JADX WARN: Removed duplicated region for block: B:188:0x037d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(defpackage.bm1 r27, defpackage.zl9 r28, defpackage.zl9 r29, defpackage.zl9 r30, defpackage.zl9 r31, defpackage.n66 r32) {
        /*
            Method dump skipped, instructions count: 1858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.h(bm1, zl9, zl9, zl9, zl9, n66):void");
    }

    public static final String i(n66 n66Var) {
        ArrayList b2 = n66Var.b();
        int size = b2.size();
        String str = "";
        for (int i2 = 0; i2 < size; i2++) {
            n66 n66Var2 = (n66) b2.get(i2);
            if (n66Var2.a.getNodeType() == 3) {
                str = str.concat(n66Var2.f());
            } else if (n66Var2.a.getNodeType() == 1) {
                str = nk2.u(str, i(n66Var2));
            }
        }
        return k4b.N0(str).toString();
    }

    public static final n66 j(n66 n66Var, String str) {
        ArrayList b2 = n66Var.b();
        int size = b2.size();
        for (int i2 = 0; i2 < size; i2++) {
            n66 n66Var2 = (n66) b2.get(i2);
            if (n66Var2.a.getNodeType() == 1 && o(n66Var2).equals(str)) {
                return n66Var2;
            }
        }
        return null;
    }

    public static final n66 k(n66 n66Var, int i2) {
        if (i2 <= 5) {
            ArrayList b2 = n66Var.b();
            int size = b2.size();
            for (int i3 = 0; i3 < size; i3++) {
                n66 n66Var2 = (n66) b2.get(i3);
                if (n66Var2.a.getNodeType() == 1) {
                    if (o(n66Var2).equals("drawText")) {
                        return n66Var2;
                    }
                    n66 k2 = k(n66Var2, 1 + i2);
                    if (k2 != null) {
                        return k2;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static final String l(int i2) {
        if (i2 <= 65535) {
            return String.valueOf((char) i2);
        }
        int i3 = i2 - Parser.ARGC_LIMIT;
        return new String(new char[]{(char) ((i3 >> 10) + 55296), (char) ((i3 & 1023) + 56320)});
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(defpackage.n66 r28, java.util.ArrayList r29, defpackage.bm1 r30) {
        /*
            r0 = r28
            r1 = r29
            r2 = r30
            java.lang.Object r3 = r2.c
            r9 = r3
            java.lang.Integer r9 = (java.lang.Integer) r9
            java.lang.String r6 = f(r0)
            r3 = 0
            n66 r15 = k(r0, r3)
            if (r6 == 0) goto L72
            zj5 r16 = new zj5
            r13 = 0
            r14 = 4076(0xfec, float:5.712E-42)
            ak5 r5 = defpackage.ak5.e
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4 = r16
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r27 = r6
            java.lang.String r4 = "shapeComment"
            n66 r4 = j(r0, r4)
            r5 = 0
            if (r4 != 0) goto L35
        L32:
            r24 = r5
            goto L54
        L35:
            java.lang.String r4 = i(r4)
            int r6 = r4.length()
            if (r6 != 0) goto L40
            goto L32
        L40:
            gm9 r6 = defpackage.gj5.g
            boolean r6 = r6.a(r4)
            if (r6 == 0) goto L49
            goto L32
        L49:
            gm9 r6 = defpackage.gj5.h
            boolean r6 = r6.a(r4)
            if (r6 == 0) goto L52
            goto L32
        L52:
            r24 = r4
        L54:
            if (r24 == 0) goto L6c
            r25 = 0
            r26 = 3071(0xbff, float:4.303E-42)
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            zj5 r16 = defpackage.zj5.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L6c:
            r4 = r16
            r1.add(r4)
            goto L74
        L72:
            r27 = r6
        L74:
            if (r15 == 0) goto L79
            d(r15, r1, r2)
        L79:
            java.lang.String r4 = "caption"
            n66 r4 = j(r0, r4)
            if (r4 == 0) goto L9d
            java.lang.String r6 = b(r4, r2, r3)
            int r3 = r6.length()
            if (r3 <= 0) goto L9d
            zj5 r4 = new zj5
            r13 = 0
            r14 = 4076(0xfec, float:5.712E-42)
            ak5 r5 = defpackage.ak5.a
            r7 = 0
            r8 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1.add(r4)
        L9d:
            if (r27 != 0) goto Lb9
            if (r15 != 0) goto Lb9
            java.lang.String r0 = o(r0)
            java.lang.Object r1 = r2.f
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.lang.String r2 = "Skipped element: "
            java.lang.String r0 = r2.concat(r0)
            sm8 r2 = new sm8
            gfd r3 = defpackage.gfd.a
            r2.<init>(r0, r3, r9)
            r1.add(r2)
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.m(n66, java.util.ArrayList, bm1):void");
    }

    public static final String n(String str) {
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        switch (lowerCase.hashCode()) {
            case 97669:
                if (!lowerCase.equals("bmp")) {
                    return "application/octet-stream";
                }
                return "image/bmp";
            case 100542:
                if (lowerCase.equals("emf")) {
                    return "image/emf";
                }
                return "application/octet-stream";
            case 102340:
                if (lowerCase.equals("gif")) {
                    return "image/gif";
                }
                return "application/octet-stream";
            case 105441:
                if (lowerCase.equals("jpg")) {
                    return "image/jpeg";
                }
                return "application/octet-stream";
            case 111145:
                if (lowerCase.equals("png")) {
                    return "image/png";
                }
                return "application/octet-stream";
            case 114276:
                if (lowerCase.equals("svg")) {
                    return "image/svg+xml";
                }
                return "application/octet-stream";
            case 114833:
                if (lowerCase.equals("tif")) {
                    return "image/tiff";
                }
                return "application/octet-stream";
            case 117840:
                if (lowerCase.equals("wmf")) {
                    return "image/wmf";
                }
                return "application/octet-stream";
            case 3268712:
                if (lowerCase.equals("jpeg")) {
                    return "image/jpeg";
                }
                return "application/octet-stream";
            case 3559925:
                if (lowerCase.equals("tiff")) {
                    return "image/tiff";
                }
                return "application/octet-stream";
            default:
                return "application/octet-stream";
        }
    }

    public static final String o(n66 n66Var) {
        String e2 = n66Var.e();
        if (e2 == null && (e2 = n66Var.d()) == null) {
            e2 = "";
        }
        return a.i(e2, "");
    }

    public static final void p(la1 la1Var, ArrayList arrayList) {
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zj5 zj5Var = (zj5) obj;
            ak5 ak5Var = zj5Var.a;
            String str = zj5Var.b;
            String str2 = "";
            if ((ak5Var == ak5.a || ak5Var == ak5.c) && str != null) {
                String str3 = la1Var.a;
                if (str3.length() > 0) {
                    str2 = "\n";
                }
                la1Var.a = eub.o(str3, str2, str);
                if (la1Var.f == null) {
                    la1Var.f = new ArrayList();
                }
                ArrayList arrayList2 = la1Var.f;
                arrayList2.getClass();
                arrayList2.add(zj5Var);
            } else {
                ak5 ak5Var2 = ak5.e;
                if (ak5Var == ak5Var2 || ak5Var == ak5.b) {
                    if (ak5Var == ak5Var2 && str != null) {
                        String str4 = la1Var.a;
                        if (str4.length() > 0) {
                            str2 = "\n";
                        }
                        la1Var.a = str4 + str2 + "![image](" + str + ")";
                    }
                    if (la1Var.f == null) {
                        la1Var.f = new ArrayList();
                    }
                    ArrayList arrayList3 = la1Var.f;
                    arrayList3.getClass();
                    arrayList3.add(zj5Var);
                    la1Var.g = true;
                }
            }
        }
    }

    public static final String q(String str) {
        if (k4b.V(str, "jpeg", false)) {
            return "jpg";
        }
        if (k4b.V(str, "png", false)) {
            return "png";
        }
        if (k4b.V(str, "gif", false)) {
            return "gif";
        }
        if (k4b.V(str, "bmp", false)) {
            return "bmp";
        }
        if (k4b.V(str, "tiff", false)) {
            return "tif";
        }
        if (k4b.V(str, "wmf", false)) {
            return "wmf";
        }
        if (k4b.V(str, "emf", false)) {
            return "emf";
        }
        if (k4b.V(str, "svg", false)) {
            return "svg";
        }
        return "bin";
    }

    public static final void r(mce mceVar, Map map) {
        for (String str : tl1.B("hh:bullet", "bullet")) {
            ArrayList j2 = mceVar.j(str);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n66 n66Var = (n66) j2.get(i2);
                String a2 = n66Var.a("id");
                String str2 = "";
                if (a2 == null) {
                    a2 = "";
                }
                String a3 = n66Var.a("char");
                if (a3 != null) {
                    str2 = a3;
                }
                if (a2.length() > 0 && str2.length() > 0) {
                    map.put(a2, str2);
                }
            }
            if (map.size() > 0) {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [fj5, java.lang.Object] */
    public static final void s(mce mceVar, Map map) {
        Integer R;
        for (String str : tl1.B("hh:charPr", "charPr", "hp:charPr")) {
            ArrayList j2 = mceVar.j(str);
            int size = j2.size();
            for (int i2 = 0; i2 < size; i2++) {
                n66 n66Var = (n66) j2.get(i2);
                String a2 = n66Var.a("id");
                if (a2 == null) {
                    a2 = "";
                }
                if (a2.length() == 0 && (a2 = n66Var.a("IDRef")) == null) {
                    a2 = "";
                }
                if (a2.length() != 0) {
                    ?? obj = new Object();
                    String a3 = n66Var.a("height");
                    if (a3 != null && a3.length() != 0 && (R = r4b.R(10, a3)) != null && R.intValue() > 0) {
                        obj.a = Double.valueOf(R.intValue() / 100.0d);
                    }
                    String a4 = n66Var.a("bold");
                    if (c16.i(a4, "true") || c16.i(a4, "1")) {
                        obj.b = Boolean.TRUE;
                    }
                    String a5 = n66Var.a("italic");
                    if (c16.i(a5, "true") || c16.i(a5, "1")) {
                        obj.c = Boolean.TRUE;
                    }
                    List c2 = n66Var.c("*");
                    int size2 = c2.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= size2) {
                            break;
                        }
                        n66 n66Var2 = (n66) c2.get(i3);
                        String e2 = n66Var2.e();
                        if (e2 == null) {
                            e2 = "";
                        }
                        String i4 = a.i(e2, "");
                        if (i4.equals("fontface") || i4.equals("fontRef")) {
                            String a6 = n66Var2.a("face");
                            if (a6 == null) {
                                a6 = "";
                            }
                            if (a6.length() == 0) {
                                String a7 = n66Var2.a("FontFace");
                                if (a7 == null) {
                                    a6 = "";
                                } else {
                                    a6 = a7;
                                }
                            }
                            if (a6.length() > 0) {
                                obj.d = a6;
                                break;
                            }
                        }
                        i3++;
                    }
                    map.put(a2, obj);
                }
            }
        }
    }

    public static final yc3 t(String str, yc3 yc3Var) {
        List<String> list;
        mce q = aye.q(l2d.f(str));
        if (q.i() == null) {
            return yc3Var;
        }
        String str2 = yc3Var.a;
        if (str2 == null) {
            str2 = u(q, tl1.B("dc:title", "title"));
        }
        String str3 = yc3Var.b;
        if (str3 == null) {
            str3 = u(q, tl1.B("dc:creator", "creator", "cp:lastModifiedBy"));
        }
        String str4 = yc3Var.h;
        if (str4 == null) {
            str4 = u(q, tl1.B("dc:description", "description", "dc:subject", "subject"));
        }
        String str5 = str4;
        String str6 = yc3Var.d;
        if (str6 == null) {
            str6 = u(q, tl1.B("dcterms:created", "meta:creation-date"));
        }
        String str7 = yc3Var.e;
        if (str7 == null) {
            str7 = u(q, tl1.B("dcterms:modified", "meta:date"));
        }
        yc3 a2 = yc3.a(yc3Var, str2, str3, str6, str7, null, str5, null, 356);
        String u = u(q, tl1.B("dc:keyword", "cp:keywords", "meta:keyword"));
        if (u != null && a2.i == null) {
            Pattern compile = Pattern.compile("[,;]");
            compile.getClass();
            int i2 = 0;
            k4b.w0(0);
            Matcher matcher = compile.matcher(u);
            if (!matcher.find()) {
                list = tl1.A(u.toString());
            } else {
                ArrayList arrayList = new ArrayList(10);
                int i3 = 0;
                do {
                    arrayList.add(u.subSequence(i3, matcher.start()).toString());
                    i3 = matcher.end();
                } while (matcher.find());
                arrayList.add(u.subSequence(i3, u.length()).toString());
                list = arrayList;
            }
            ArrayList arrayList2 = new ArrayList(tl1.s(list, 10));
            for (String str8 : list) {
                arrayList2.add(k4b.N0(str8).toString());
            }
            ArrayList arrayList3 = new ArrayList();
            int size = arrayList2.size();
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                if (((String) obj).length() > 0) {
                    arrayList3.add(obj);
                }
            }
            return yc3.a(a2, null, null, null, null, null, null, arrayList3, 255);
        }
        return a2;
    }

    public static final String u(mce mceVar, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ArrayList j2 = mceVar.j((String) it.next());
            if (!j2.isEmpty()) {
                String obj = k4b.N0(((n66) j2.get(0)).f()).toString();
                if (obj.length() > 0) {
                    return obj;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0230, code lost:
        if (r2 == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
        throw new java.lang.Exception("ZIP uncompressed size exceeded (decompression bomb suspected)");
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x050b  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:383:0x014d A[EDGE_INSN: B:383:0x014d->B:63:0x014d ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016a  */
    /* JADX WARN: Type inference failed for: r15v3, types: [fr2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j06 v(byte[] r39) {
        /*
            Method dump skipped, instructions count: 1828
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gj5.v(byte[]):j06");
    }

    public static final void w(mce mceVar, Map map) {
        LinkedHashMap linkedHashMap;
        Iterator it;
        Iterator it2;
        int i2;
        Iterator it3 = tl1.B("hh:numbering", "numbering").iterator();
        while (it3.hasNext()) {
            ArrayList j2 = mceVar.j((String) it3.next());
            int size = j2.size();
            int i3 = 0;
            while (i3 < size) {
                n66 n66Var = (n66) j2.get(i3);
                String a2 = n66Var.a("id");
                if (a2 == null) {
                    a2 = "";
                }
                if (a2.length() == 0) {
                    it = it3;
                } else {
                    b78 b78Var = new b78();
                    ArrayList b2 = n66Var.b();
                    int size2 = b2.size();
                    int i4 = 0;
                    while (true) {
                        linkedHashMap = b78Var.a;
                        if (i4 >= size2) {
                            break;
                        }
                        n66 n66Var2 = (n66) b2.get(i4);
                        if (n66Var2.a.getNodeType() == 1 && o(n66Var2).equals("paraHead")) {
                            String a3 = n66Var2.a("level");
                            if (a3 == null) {
                                a3 = "";
                            }
                            Integer R = r4b.R(10, a3);
                            if (R != null && R.intValue() >= 1 && R.intValue() <= 10) {
                                String a4 = n66Var2.a("start");
                                if (a4 == null) {
                                    a4 = "1";
                                }
                                Integer R2 = r4b.R(10, a4);
                                it2 = it3;
                                String a5 = n66Var2.a("numFormat");
                                a5 = (a5 == null || a5.length() == 0) ? "DIGIT" : "DIGIT";
                                String f2 = n66Var2.f();
                                if (R2 != null) {
                                    i2 = R2.intValue();
                                } else {
                                    i2 = 1;
                                }
                                linkedHashMap.put(R, new il8(a5, f2, i2));
                                i4++;
                                it3 = it2;
                            }
                        }
                        it2 = it3;
                        i4++;
                        it3 = it2;
                    }
                    it = it3;
                    if (linkedHashMap.size() > 0) {
                        map.put(a2, b78Var);
                        i3++;
                        it3 = it;
                    }
                }
                i3++;
                it3 = it;
            }
            Iterator it4 = it3;
            if (map.size() <= 0) {
                it3 = it4;
            } else {
                return;
            }
        }
    }

    public static final void x(mce mceVar, Map map) {
        n66 j2;
        int max;
        for (String str : tl1.B("hh:paraPr", "paraPr")) {
            ArrayList j3 = mceVar.j(str);
            int size = j3.size();
            for (int i2 = 0; i2 < size; i2++) {
                n66 n66Var = (n66) j3.get(i2);
                String a2 = n66Var.a("id");
                if (a2 == null) {
                    a2 = "";
                }
                if (a2.length() != 0 && (j2 = j(n66Var, "heading")) != null) {
                    String a3 = j2.a("type");
                    a3 = (a3 == null || a3.length() == 0) ? "NONE" : "NONE";
                    if (a3.equals("NUMBER") || a3.equals("BULLET") || a3.equals("OUTLINE")) {
                        String a4 = j2.a("level");
                        String str2 = "0";
                        if (a4 == null) {
                            a4 = "0";
                        }
                        Integer R = r4b.R(10, a4);
                        String a5 = j2.a("idRef");
                        if (a5 != null && a5.length() != 0) {
                            str2 = a5;
                        }
                        if (R == null) {
                            max = 0;
                        } else {
                            max = Math.max(0, Math.min(R.intValue(), 9));
                        }
                        map.put(a2, new jl8(a3, str2, max));
                    }
                }
            }
            if (map.size() > 0) {
                return;
            }
        }
    }

    public static final boolean y(String str) {
        if (!c.a(str)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (!k4b.V(lowerCase, "section", false)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final List z(String str, bm1 bm1Var, ArrayList arrayList, Integer num, yx9 yx9Var) {
        mce q = aye.q(l2d.f(str));
        n66 i2 = q.i();
        if (i2 == null) {
            return ks3.a;
        }
        bm1 bm1Var2 = new bm1(bm1Var, arrayList, num, yx9Var);
        ((yy3) yx9Var.d).a = 0;
        Iterator it = tl1.B("hp:secPr", "secPr").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ArrayList j2 = q.j((String) it.next());
            if (!j2.isEmpty()) {
                String a2 = ((n66) j2.get(0)).a("outlineShapeIDRef");
                if (a2 != null && a2.length() != 0) {
                    bm1Var2.e = a2;
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        H(i2, arrayList2, null, new ArrayList(), bm1Var2, 0);
        return arrayList2;
    }
}
