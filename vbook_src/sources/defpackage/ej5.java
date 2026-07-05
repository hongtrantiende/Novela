package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ej5  reason: default package */
/* loaded from: classes.dex */
public abstract class ej5 {
    public static final gm9 a = new gm9("^[^:]+:");

    public static final void a(n66 n66Var, ArrayList arrayList, int i) {
        if (i <= 20) {
            ArrayList b = n66Var.b();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                n66 n66Var2 = (n66) b.get(i2);
                if (n66Var2.a.getNodeType() == 1) {
                    String e = e(n66Var2);
                    if (e.equals("P")) {
                        String c = c(n66Var2);
                        if (c.length() > 0) {
                            arrayList.add(c);
                        }
                    } else if (e.equals("TABLE")) {
                        arrayList.add("[중첩 테이블]");
                    } else {
                        a(n66Var2, arrayList, 1 + i);
                    }
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final void b(n66 n66Var, ArrayList arrayList, int i) {
        if (i <= 200) {
            ArrayList b = n66Var.b();
            int size = b.size();
            for (int i2 = 0; i2 < size; i2++) {
                n66 n66Var2 = (n66) b.get(i2);
                if (n66Var2.a.getNodeType() == 1) {
                    String e = e(n66Var2);
                    switch (e.hashCode()) {
                        case -483554816:
                            if (e.equals("SHAPEOBJECT")) {
                                break;
                            }
                            b(n66Var2, arrayList, 1 + i);
                            break;
                        case 2067286:
                            if (e.equals("CHAR")) {
                                String g = g(n66Var2);
                                if (g.length() > 0) {
                                    arrayList.add(g);
                                    break;
                                } else {
                                    break;
                                }
                            }
                            b(n66Var2, arrayList, 1 + i);
                            break;
                        case 71681879:
                            if (e.equals("AUTONUM")) {
                                break;
                            }
                            b(n66Var2, arrayList, 1 + i);
                            break;
                        case 79578030:
                            if (e.equals("TABLE")) {
                                break;
                            }
                            b(n66Var2, arrayList, 1 + i);
                            break;
                        case 140241118:
                            if (e.equals("PICTURE")) {
                                break;
                            }
                            b(n66Var2, arrayList, 1 + i);
                            break;
                        default:
                            b(n66Var2, arrayList, 1 + i);
                            break;
                    }
                }
            }
        }
    }

    public static final String c(n66 n66Var) {
        ArrayList arrayList = new ArrayList();
        b(n66Var, arrayList, 0);
        return k4b.N0(sl1.i0(arrayList, "", null, null, null, 62)).toString();
    }

    public static final n66 d(n66 n66Var, String str) {
        ArrayList b = n66Var.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            n66 n66Var2 = (n66) b.get(i);
            if (n66Var2.a.getNodeType() == 1 && e(n66Var2).equals(str)) {
                return n66Var2;
            }
        }
        return null;
    }

    public static final String e(n66 n66Var) {
        String e = n66Var.e();
        if (e == null && (e = n66Var.d()) == null) {
            e = "";
        }
        return a.i(e, "");
    }

    public static final j06 f(byte[] bArr) {
        yc3 yc3Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i;
        n66 d;
        n66 d2;
        Integer num;
        int max;
        String str;
        bArr.getClass();
        if (bArr.length <= 52428800) {
            String n = s21.n("^\\uFEFF", r4b.F(bArr), "");
            Pattern compile = Pattern.compile("&nbsp;");
            compile.getClass();
            String replaceAll = compile.matcher(n).replaceAll("&#160;");
            replaceAll.getClass();
            String f = l2d.f(replaceAll);
            ArrayList arrayList3 = new ArrayList();
            n66 i2 = aye.q(f).i();
            if (i2 == null) {
                return new j06("", new ArrayList(), null, null, arrayList3, null, 492);
            }
            yc3 yc3Var2 = new yc3(null, null, null, null, null, null, null, null, null, 511);
            n66 d3 = d(i2, "DOCSUMMARY");
            if (d3 != null) {
                n66 d4 = d(d3, "TITLE");
                n66 d5 = d(d3, "AUTHOR");
                n66 d6 = d(d3, "DATE");
                if (d4 != null) {
                    yc3Var2 = yc3.a(yc3Var2, k4b.N0(g(d4)).toString(), null, null, null, null, null, null, 510);
                }
                yc3 yc3Var3 = yc3Var2;
                if (d5 != null) {
                    yc3Var3 = yc3.a(yc3Var3, null, k4b.N0(g(d5)).toString(), null, null, null, null, null, 509);
                }
                yc3Var2 = yc3Var3;
                if (d6 != null) {
                    String obj = k4b.N0(g(d6)).toString();
                    if (obj.length() > 0) {
                        str = obj;
                    } else {
                        str = null;
                    }
                    yc3Var2 = yc3.a(yc3Var2, null, null, str, null, null, null, null, 503);
                }
            }
            yc3 yc3Var4 = yc3Var2;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            n66 d7 = d(i2, "HEAD");
            int i3 = 0;
            if (d7 != null && (d = d(d7, "MAPPINGTABLE")) != null && (d2 = d(d, "PARASHAPELIST")) != null) {
                ArrayList b = d2.b();
                int size = b.size();
                for (int i4 = 0; i4 < size; i4++) {
                    n66 n66Var = (n66) b.get(i4);
                    if (n66Var.a.getNodeType() == 1 && e(n66Var).equals("PARASHAPE")) {
                        String a2 = n66Var.a("Id");
                        if (a2 == null) {
                            a2 = "";
                        }
                        String a3 = n66Var.a("HeadingType");
                        if (a3 == null) {
                            a3 = "None";
                        }
                        String a4 = n66Var.a("Level");
                        if (a4 == null) {
                            a4 = "0";
                        }
                        Integer R = r4b.R(10, a4);
                        if (a3.equals("Outline")) {
                            if (R == null) {
                                max = 0;
                            } else {
                                max = Math.max(0, R.intValue());
                            }
                            num = Integer.valueOf(Math.min(max + 1, 6));
                        } else {
                            num = null;
                        }
                        linkedHashMap.put(a2, new kl8(num));
                    }
                }
            }
            n66 d8 = d(i2, "BODY");
            if (d8 == null) {
                return new j06("", new ArrayList(), yc3Var4, null, arrayList3, null, 488);
            }
            ArrayList arrayList4 = new ArrayList();
            ArrayList b2 = d8.b();
            int size2 = b2.size();
            int i5 = 0;
            for (int i6 = 0; i6 < size2; i6++) {
                n66 n66Var2 = (n66) b2.get(i6);
                if (n66Var2.a.getNodeType() == 1 && e(n66Var2).equals("SECTION")) {
                    int i7 = i5 + 1;
                    ArrayList arrayList5 = arrayList3;
                    h(n66Var2, arrayList4, linkedHashMap, i7, arrayList5, 0);
                    arrayList3 = arrayList5;
                    i5 = i7;
                }
            }
            ArrayList arrayList6 = new ArrayList();
            int size3 = arrayList4.size();
            int i8 = 0;
            while (i8 < size3) {
                Object obj2 = arrayList4.get(i8);
                i8++;
                zj5 zj5Var = (zj5) obj2;
                if (zj5Var.a == ak5.c && zj5Var.b != null) {
                    arrayList6.add(obj2);
                }
            }
            ArrayList arrayList7 = new ArrayList(tl1.s(arrayList6, 10));
            int size4 = arrayList6.size();
            while (i3 < size4) {
                Object obj3 = arrayList6.get(i3);
                i3++;
                zj5 zj5Var2 = (zj5) obj3;
                Integer num2 = zj5Var2.d;
                if (num2 != null) {
                    i = num2.intValue();
                } else {
                    i = 1;
                }
                String str2 = zj5Var2.b;
                str2.getClass();
                arrayList7.add(new wf8(i, zj5Var2.e, str2));
            }
            String a5 = mjb.a(arrayList4);
            if (yc3Var4.a == null && yc3Var4.b == null && yc3Var4.c == null && yc3Var4.d == null && yc3Var4.e == null && yc3Var4.f == null && yc3Var4.g == null && yc3Var4.h == null && yc3Var4.i == null) {
                yc3Var = null;
            } else {
                yc3Var = yc3Var4;
            }
            if (!arrayList7.isEmpty()) {
                arrayList = arrayList7;
            } else {
                arrayList = null;
            }
            if (!arrayList3.isEmpty()) {
                arrayList2 = arrayList3;
            } else {
                arrayList2 = null;
            }
            return new j06(a5, arrayList4, yc3Var, arrayList, arrayList2, null, 480);
        }
        throw new RuntimeException("HWPML file size exceeded (" + (((long) (((bArr.length / 1024.0d) / 1024.0d) * 10.0d)) / 10.0d) + "MB > 50MB)");
    }

    public static final String g(n66 n66Var) {
        ArrayList b = n66Var.b();
        ArrayList arrayList = new ArrayList();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            n66 n66Var2 = (n66) b.get(i);
            if (n66Var2.a.getNodeType() == 3) {
                arrayList.add(n66Var2.f());
            } else if (n66Var2.a.getNodeType() == 1) {
                arrayList.add(g(n66Var2));
            }
        }
        return sl1.i0(arrayList, "", null, null, null, 62);
    }

    public static final void h(n66 n66Var, ArrayList arrayList, LinkedHashMap linkedHashMap, int i, ArrayList arrayList2, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Integer num;
        ArrayList arrayList3 = arrayList;
        if (i2 <= 200) {
            ArrayList b = n66Var.b();
            int size = b.size();
            int i12 = 0;
            while (i12 < size) {
                n66 n66Var2 = (n66) b.get(i12);
                short s = 1;
                if (n66Var2.a.getNodeType() == 1) {
                    String e = e(n66Var2);
                    if (!e.equals("HEADER") && !e.equals("FOOTER")) {
                        if (e.equals("P")) {
                            String a2 = n66Var2.a("ParaShape");
                            if (a2 == null) {
                                a2 = "";
                            }
                            kl8 kl8Var = (kl8) linkedHashMap.get(a2);
                            String c = c(n66Var2);
                            if (c.length() != 0) {
                                if (kl8Var != null) {
                                    num = kl8Var.a;
                                } else {
                                    num = null;
                                }
                                if (num != null) {
                                    arrayList3.add(new zj5(ak5.c, c, null, kl8Var.a, Integer.valueOf(i), null, null, null, null, 4068));
                                } else {
                                    arrayList3.add(new zj5(ak5.a, c, null, null, Integer.valueOf(i), null, null, null, null, 4076));
                                }
                            }
                        } else if (e.equals("TABLE")) {
                            ArrayList arrayList4 = new ArrayList();
                            String a3 = n66Var2.a("RowCount");
                            if (a3 == null) {
                                a3 = "0";
                            }
                            Integer R = r4b.R(10, a3);
                            String a4 = n66Var2.a("ColCount");
                            if (a4 == null) {
                                a4 = "0";
                            }
                            Integer R2 = r4b.R(10, a4);
                            if (R != null && R2 != null && R.intValue() != 0 && R2.intValue() != 0) {
                                if (R.intValue() <= 5000 && R2.intValue() <= 500) {
                                    ArrayList b2 = n66Var2.b();
                                    int size2 = b2.size();
                                    int i13 = 0;
                                    while (i13 < size2) {
                                        n66 n66Var3 = (n66) b2.get(i13);
                                        if (n66Var3.a.getNodeType() == s && e(n66Var3).equals("ROW")) {
                                            ArrayList b3 = n66Var3.b();
                                            int size3 = b3.size();
                                            int i14 = 0;
                                            while (i14 < size3) {
                                                ArrayList arrayList5 = b2;
                                                n66 n66Var4 = (n66) b3.get(i14);
                                                ArrayList arrayList6 = b3;
                                                if (n66Var4.a.getNodeType() == 1 && e(n66Var4).equals("CELL")) {
                                                    String a5 = n66Var4.a("ColAddr");
                                                    if (a5 == null) {
                                                        a5 = "0";
                                                    }
                                                    Integer R3 = r4b.R(10, a5);
                                                    String a6 = n66Var4.a("RowAddr");
                                                    if (a6 == null) {
                                                        a6 = "0";
                                                    }
                                                    Integer R4 = r4b.R(10, a6);
                                                    String a7 = n66Var4.a("ColSpan");
                                                    if (a7 == null) {
                                                        a7 = "1";
                                                    }
                                                    Integer R5 = r4b.R(10, a7);
                                                    if (R5 != null) {
                                                        i8 = R5.intValue();
                                                    } else {
                                                        i8 = 1;
                                                    }
                                                    String a8 = n66Var4.a("RowSpan");
                                                    if (a8 == null) {
                                                        a8 = "1";
                                                    }
                                                    int i15 = i8;
                                                    Integer R6 = r4b.R(10, a8);
                                                    if (R6 != null) {
                                                        i9 = R6.intValue();
                                                    } else {
                                                        i9 = 1;
                                                    }
                                                    if (i15 != 0) {
                                                        i10 = i15;
                                                    } else {
                                                        i10 = 1;
                                                    }
                                                    int i16 = i9;
                                                    int min = Math.min(Math.max(1, i10), 500);
                                                    if (i16 != 0) {
                                                        i11 = i16;
                                                    } else {
                                                        i11 = 1;
                                                    }
                                                    int min2 = Math.min(Math.max(1, i11), 5000);
                                                    ArrayList arrayList7 = new ArrayList();
                                                    int i17 = 0;
                                                    a(n66Var4, arrayList7, 0);
                                                    ArrayList arrayList8 = new ArrayList();
                                                    int size4 = arrayList7.size();
                                                    while (i17 < size4) {
                                                        int i18 = size4;
                                                        Object obj = arrayList7.get(i17);
                                                        i17++;
                                                        if (((String) obj).length() > 0) {
                                                            arrayList8.add(obj);
                                                        }
                                                        size4 = i18;
                                                    }
                                                    arrayList4.add(new ka1(k4b.N0(sl1.i0(arrayList8, "\n", null, null, null, 62)).toString(), min, min2, R3, R4));
                                                }
                                                i14++;
                                                b2 = arrayList5;
                                                b3 = arrayList6;
                                            }
                                        }
                                        i13++;
                                        b2 = b2;
                                        s = 1;
                                    }
                                    if (!arrayList4.isEmpty()) {
                                        int intValue = R.intValue();
                                        ka1[][] ka1VarArr = new ka1[intValue];
                                        for (int i19 = 0; i19 < intValue; i19++) {
                                            ka1VarArr[i19] = new ka1[R2.intValue()];
                                        }
                                        int size5 = arrayList4.size();
                                        int i20 = 0;
                                        while (i20 < size5) {
                                            Object obj2 = arrayList4.get(i20);
                                            i20++;
                                            ka1 ka1Var = (ka1) obj2;
                                            Integer num2 = ka1Var.e;
                                            if (num2 != null) {
                                                i3 = num2.intValue();
                                            } else {
                                                i3 = 0;
                                            }
                                            Integer num3 = ka1Var.d;
                                            if (num3 != null) {
                                                i4 = num3.intValue();
                                            } else {
                                                i4 = 0;
                                            }
                                            if (i3 < R.intValue() && i4 < R2.intValue()) {
                                                ka1VarArr[i3][i4] = ka1Var;
                                                int i21 = ka1Var.c;
                                                int i22 = 0;
                                                while (i22 < i21) {
                                                    ArrayList arrayList9 = arrayList4;
                                                    int i23 = ka1Var.b;
                                                    ka1[][] ka1VarArr2 = ka1VarArr;
                                                    int i24 = 0;
                                                    while (i24 < i23) {
                                                        if (i22 != 0 || i24 != 0) {
                                                            i5 = i23;
                                                            int i25 = i3 + i22;
                                                            i6 = i24;
                                                            if (i25 < R.intValue() && (i7 = i4 + i6) < R2.intValue()) {
                                                                ka1VarArr2[i25][i7] = new ka1("", 1, 1, null, null);
                                                            }
                                                        } else {
                                                            i5 = i23;
                                                            i6 = i24;
                                                        }
                                                        i24 = i6 + 1;
                                                        i23 = i5;
                                                    }
                                                    i22++;
                                                    arrayList4 = arrayList9;
                                                    ka1VarArr = ka1VarArr2;
                                                }
                                            }
                                        }
                                        ka1[][] ka1VarArr3 = ka1VarArr;
                                        ArrayList arrayList10 = new ArrayList(intValue);
                                        for (int i26 = 0; i26 < intValue; i26++) {
                                            ka1[] ka1VarArr4 = ka1VarArr3[i26];
                                            ArrayList arrayList11 = new ArrayList(ka1VarArr4.length);
                                            for (ka1 ka1Var2 : ka1VarArr4) {
                                                if (ka1Var2 == null) {
                                                    ka1Var2 = new ka1("", 1, 1, null, null);
                                                }
                                                arrayList11.add(ka1Var2);
                                            }
                                            arrayList10.add(arrayList11);
                                        }
                                        arrayList3.add(new zj5(ak5.b, null, mjb.b(arrayList10), null, Integer.valueOf(i), null, null, null, null, 4074));
                                    }
                                } else {
                                    arrayList2.add(new sm8("table size exceeded (" + R + "x" + R2 + ") — skipped", gfd.c, null));
                                }
                            }
                        } else {
                            int hashCode = e.hashCode();
                            if (hashCode == -1606743355 ? e.equals("SECTION") : !(hashCode == 1954026622 ? !e.equals("PARALIST") : !(hashCode == 1993442949 && e.equals("COLDEF")))) {
                                h(n66Var2, arrayList3, linkedHashMap, i, arrayList2, i2 + 1);
                            } else {
                                h(n66Var2, arrayList, linkedHashMap, i, arrayList2, i2 + 1);
                            }
                        }
                    }
                }
                i12++;
                arrayList3 = arrayList;
            }
        }
    }
}
