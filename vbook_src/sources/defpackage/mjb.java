package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mjb  reason: default package */
/* loaded from: classes.dex */
public abstract class mjb {
    public static final gm9 a = new gm9("(?:모서리가 둥근 |둥근 )?(?:사각형|직사각형|정사각형|원|타원|삼각형|이등변 삼각형|직각 삼각형|선|직선|곡선|화살표|굵은 화살표|이중 화살표|오각형|육각형|팔각형|별|[4-8]점별|십자|십자형|구름|구름형|마름모|도넛|평행사변형|사다리꼴|부채꼴|호|반원|물결|번개|하트|빗금|블록 화살표|수식|표|그림|개체|그리기\\s?개체|묶음\\s?개체|글상자|수식\\s?개체|OLE\\s?개체)\\s?입니다\\.?");
    public static final gm9 b = new gm9("[\\uAC00-\\uD7AF\\u3131-\\u318E]");
    public static final gm9 c = new gm9("^\\d+\\.\\s");
    public static final gm9 d = new gm9("^\\d+\\.\\s");
    public static final gm9 e = new gm9("^\\[별표\\s*\\d+");
    public static final gm9 f = new gm9("관련\\)?$");
    public static final gm9 g = new gm9("^\\([^)]*조[^)]*관련\\)$");
    public static final gm9 h = new gm9("^[가-힣]\\.\\s");
    public static final gm9 i = new gm9("(^|[^\\\\])\\$(?=\\S)(?:\\\\.|[^$\\n])+?\\S\\$");

    /* JADX WARN: Removed duplicated region for block: B:264:0x0552  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String a(java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 1615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mjb.a(java.util.ArrayList):java.lang.String");
    }

    public static final ck5 b(ArrayList arrayList) {
        List<List> list;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (arrayList.size() > 10000) {
            list = arrayList.subList(0, 10000);
        } else {
            list = arrayList;
        }
        int size = list.size();
        boolean isEmpty = list.isEmpty();
        ks3 ks3Var = ks3.a;
        int i8 = Context.VERSION_ES6;
        if (!isEmpty) {
            for (List<ka1> list2 : list) {
                if (list2 == null || !list2.isEmpty()) {
                    for (ka1 ka1Var : list2) {
                        if (ka1Var.d != null && ka1Var.e != null) {
                            int i9 = 0;
                            for (List<ka1> list3 : list) {
                                for (ka1 ka1Var2 : list3) {
                                    Integer num = ka1Var2.d;
                                    if (num != null) {
                                        i7 = num.intValue();
                                    } else {
                                        i7 = 0;
                                    }
                                    int i10 = ka1Var2.b + i7;
                                    if (i10 > i9) {
                                        i9 = i10;
                                    }
                                }
                            }
                            if (i9 <= 200) {
                                i8 = i9;
                            }
                            if (i8 == 0) {
                                return new ck5(0, 0, ks3Var, false, null);
                            }
                            bk5[][] bk5VarArr = new bk5[size];
                            for (int i11 = 0; i11 < size; i11++) {
                                bk5[] bk5VarArr2 = new bk5[i8];
                                for (int i12 = 0; i12 < i8; i12++) {
                                    bk5VarArr2[i12] = new bk5("", 1, 1, null, null);
                                }
                                bk5VarArr[i11] = bk5VarArr2;
                            }
                            for (List<ka1> list4 : list) {
                                for (ka1 ka1Var3 : list4) {
                                    Integer num2 = ka1Var3.e;
                                    int i13 = ka1Var3.c;
                                    int i14 = ka1Var3.b;
                                    if (num2 != null) {
                                        i3 = num2.intValue();
                                    } else {
                                        i3 = 0;
                                    }
                                    Integer num3 = ka1Var3.d;
                                    if (num3 != null) {
                                        i4 = num3.intValue();
                                    } else {
                                        i4 = 0;
                                    }
                                    if (i3 < size && i4 < i8 && i3 >= 0 && i4 >= 0) {
                                        bk5VarArr[i3][i4] = new bk5(k4b.N0(ka1Var3.a).toString(), i14, i13);
                                        for (int i15 = 0; i15 < i13; i15++) {
                                            for (int i16 = 0; i16 < i14; i16++) {
                                                if ((i15 != 0 || i16 != 0) && (i5 = i3 + i15) < size && (i6 = i4 + i16) < i8) {
                                                    bk5VarArr[i5][i6] = new bk5("", 1, 1, null, null);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            return g(bk5VarArr, size, i8);
                        }
                    }
                    continue;
                }
            }
        }
        HashSet[] hashSetArr = new HashSet[size];
        for (int i17 = 0; i17 < size; i17++) {
            hashSetArr[i17] = new HashSet();
        }
        int i18 = 0;
        for (int i19 = 0; i19 < size; i19++) {
            int i20 = 0;
            for (ka1 ka1Var4 : (List) list.get(i19)) {
                while (i20 < 200 && hashSetArr[i19].contains(Integer.valueOf(i20))) {
                    i20++;
                }
                if (i20 < 200) {
                    int i21 = i19;
                    while (true) {
                        int i22 = ka1Var4.c;
                        i2 = ka1Var4.b;
                        if (i21 >= Math.min(i22 + i19, size)) {
                            break;
                        }
                        for (int i23 = i20; i23 < Math.min(i20 + i2, (int) Context.VERSION_ES6); i23++) {
                            hashSetArr[i21].add(Integer.valueOf(i23));
                        }
                        i21++;
                    }
                    i20 += i2;
                    if (i20 > i18) {
                        i18 = i20;
                    }
                }
            }
        }
        if (i18 == 0) {
            return new ck5(0, 0, ks3Var, false, null);
        }
        bk5[][] bk5VarArr3 = new bk5[size];
        for (int i24 = 0; i24 < size; i24++) {
            bk5[] bk5VarArr4 = new bk5[i18];
            for (int i25 = 0; i25 < i18; i25++) {
                bk5VarArr4[i25] = new bk5("", 1, 1, null, null);
            }
            bk5VarArr3[i24] = bk5VarArr4;
        }
        boolean[][] zArr = new boolean[size];
        for (int i26 = 0; i26 < size; i26++) {
            zArr[i26] = new boolean[i18];
        }
        for (int i27 = 0; i27 < size; i27++) {
            int i28 = 0;
            for (int i29 = 0; i28 < i18 && i29 < ((List) list.get(i27)).size(); i29++) {
                while (i28 < i18 && zArr[i27][i28]) {
                    i28++;
                }
                if (i28 < i18) {
                    ka1 ka1Var5 = (ka1) ((List) list.get(i27)).get(i29);
                    bk5[] bk5VarArr5 = bk5VarArr3[i27];
                    String str = ka1Var5.a;
                    int i30 = ka1Var5.c;
                    int i31 = ka1Var5.b;
                    bk5VarArr5[i28] = new bk5(k4b.N0(str).toString(), i31, i30);
                    for (int i32 = i27; i32 < Math.min(i27 + i30, size); i32++) {
                        for (int i33 = i28; i33 < Math.min(i28 + i31, i18); i33++) {
                            zArr[i32][i33] = true;
                        }
                    }
                    i28 += i31;
                }
            }
        }
        return g(bk5VarArr3, size, i18);
    }

    public static final String c(ArrayList arrayList) {
        List z0 = k4b.z0(sl1.i0(arrayList, "\n", null, null, new dva(17), 30), new String[]{"\n"});
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : z0) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return sl1.i0(arrayList2, "\n", null, null, null, 62);
    }

    public static final String d(String str) {
        return r4b.N(r4b.N(r4b.N(r4b.N(r4b.N(str, false, "&", "&amp;"), false, "<", "&lt;"), false, ">", "&gt;"), false, "\"", "&quot;"), false, "'", "&#39;");
    }

    public static final String e(String str) {
        int i2;
        String b2 = s99.b(str);
        StringBuilder sb = new StringBuilder();
        int i3 = 0;
        int i4 = 0;
        while (i4 < b2.length()) {
            char charAt = b2.charAt(i4);
            if (Character.isHighSurrogate(charAt) && (i2 = i4 + 1) < b2.length() && Character.isLowSurrogate(b2.charAt(i2))) {
                int charAt2 = (b2.charAt(i2) - 56320) + ((charAt - 55296) << 10) + Parser.ARGC_LIMIT;
                if (983040 > charAt2 || charAt2 >= 1048574) {
                    sb.append(charAt);
                    sb.append(b2.charAt(i2));
                }
                i4 += 2;
            } else {
                sb.append(charAt);
                i4++;
            }
        }
        String i5 = a.i(sb.toString(), "");
        Pattern compile = Pattern.compile("  +");
        compile.getClass();
        String replaceAll = compile.matcher(i5).replaceAll(" ");
        replaceAll.getClass();
        String obj = k4b.N0(replaceAll).toString();
        if (obj.length() <= 30 && k4b.V(obj, " ", false)) {
            List<String> z0 = k4b.z0(obj, new String[]{" "});
            if (!z0.isEmpty()) {
                for (String str2 : z0) {
                    if (str2.length() == 1 && b.a(str2) && (i3 = i3 + 1) < 0) {
                        tl1.L();
                        throw null;
                    }
                }
            }
            if (z0.size() >= 3 && i3 / z0.size() >= 0.7d) {
                return sl1.i0(z0, "", null, null, null, 62);
            }
            return obj;
        }
        return obj;
    }

    public static final String f(ck5 ck5Var) {
        int i2;
        List list;
        List list2;
        bk5 bk5Var;
        String N;
        String str;
        String str2;
        String str3;
        int i3;
        int i4;
        int i5;
        List list3 = ck5Var.c;
        int i6 = ck5Var.a;
        int i7 = ck5Var.b;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add("<table><tbody>");
        int i8 = 0;
        while (i8 < i6) {
            ArrayList arrayList2 = new ArrayList();
            int i9 = 0;
            while (i9 < i7) {
                if (!hashSet.contains(i8 + "," + i9) && (list2 = (List) sl1.f0(i8, list3)) != null && (bk5Var = (bk5) sl1.f0(i9, list2)) != null) {
                    int i10 = bk5Var.b;
                    int i11 = bk5Var.c;
                    for (int i12 = 0; i12 < i11; i12++) {
                        int i13 = 0;
                        while (i13 < i10) {
                            if ((i12 == 0 && i13 == 0) || (i3 = i8 + i12) >= i6 || (i4 = i9 + i13) >= i7) {
                                i5 = i7;
                            } else {
                                i5 = i7;
                                hashSet.add(i3 + "," + i4);
                            }
                            i13++;
                            i7 = i5;
                        }
                    }
                    i2 = i7;
                    List list4 = bk5Var.d;
                    String str4 = "";
                    if (list4 == null || list4.isEmpty()) {
                        list = list3;
                        N = r4b.N(e(bk5Var.a), false, "\n", "<br>");
                    } else {
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it = list4.iterator();
                        while (it.hasNext()) {
                            zj5 zj5Var = (zj5) it.next();
                            ak5 ak5Var = zj5Var.a;
                            Iterator it2 = it;
                            String str5 = zj5Var.b;
                            ck5 ck5Var2 = zj5Var.c;
                            List list5 = list3;
                            if (ak5Var == ak5.b && ck5Var2 != null) {
                                String str6 = ck5Var2.e;
                                if (str6 == null) {
                                    str2 = "";
                                } else {
                                    str2 = e(str6);
                                }
                                if (str2.length() <= 0) {
                                    str3 = "";
                                } else {
                                    str3 = str2.concat("<br>");
                                }
                                str = str3.concat(f(ck5Var2));
                            } else if (ak5Var == ak5.e && str5 != null) {
                                str = hl5.n("<img src=\"", str5, "\" alt=\"image\">");
                            } else {
                                if (str5 == null) {
                                    str5 = "";
                                }
                                String e2 = e(str5);
                                if (e2.length() > 0) {
                                    str = r4b.N(e2, false, "\n", "<br>");
                                } else {
                                    str = null;
                                }
                            }
                            if (str != null) {
                                arrayList3.add(str);
                            }
                            it = it2;
                            list3 = list5;
                        }
                        list = list3;
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = arrayList3.get(i14);
                            i14++;
                            if (((String) obj).length() > 0) {
                                arrayList4.add(obj);
                            }
                        }
                        N = sl1.i0(arrayList4, "<br>", null, null, null, 62);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    if (i10 > 1) {
                        arrayList5.add("colspan=\"" + i10 + "\"");
                    }
                    if (i11 > 1) {
                        arrayList5.add("rowspan=\"" + i11 + "\"");
                    }
                    if (!arrayList5.isEmpty()) {
                        str4 = " ".concat(sl1.i0(arrayList5, " ", null, null, null, 62));
                    }
                    arrayList2.add(hl5.o("<td", str4, ">", N, "</td>"));
                } else {
                    i2 = i7;
                    list = list3;
                }
                i9++;
                i7 = i2;
                list3 = list;
            }
            int i15 = i7;
            List list6 = list3;
            if (!arrayList2.isEmpty()) {
                String i0 = sl1.i0(arrayList2, "", null, null, null, 62);
                arrayList.add("<tr>" + i0 + "</tr>");
            }
            i8++;
            i7 = i15;
            list3 = list6;
        }
        arrayList.add("</tbody></table>");
        return sl1.i0(arrayList, "\n", null, null, null, 62);
    }

    public static final ck5 g(bk5[][] bk5VarArr, int i2, int i3) {
        boolean z;
        boolean z2;
        String str;
        String str2;
        int i4 = i3;
        loop0: while (i4 > 0) {
            for (bk5[] bk5VarArr2 : bk5VarArr) {
                bk5 bk5Var = (bk5) b00.q0(i4 - 1, bk5VarArr2);
                if (bk5Var != null && (str2 = bk5Var.a) != null) {
                    str = k4b.N0(str2).toString();
                } else {
                    str = null;
                }
                if (str != null && str.length() != 0) {
                    break loop0;
                }
            }
            i4--;
        }
        if (i4 < i3 && i4 > 0) {
            ArrayList arrayList = new ArrayList(bk5VarArr.length);
            for (bk5[] bk5VarArr3 : bk5VarArr) {
                arrayList.add(b00.D0(bk5VarArr3).subList(0, i4));
            }
            if (i2 > 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            return new ck5(i2, i4, arrayList, z2, null);
        }
        ArrayList arrayList2 = new ArrayList(bk5VarArr.length);
        for (bk5[] bk5VarArr4 : bk5VarArr) {
            arrayList2.add(b00.D0(bk5VarArr4));
        }
        if (i2 > 1) {
            z = true;
        } else {
            z = false;
        }
        return new ck5(i2, i3, arrayList2, z, null);
    }
}
