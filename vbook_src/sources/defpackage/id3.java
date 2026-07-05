package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: id3  reason: default package */
/* loaded from: classes.dex */
public abstract class id3 {
    public static final gm9 a = new gm9("^[^:]+:");
    public static final List b = tl1.B("w", "r", "m", "a", "mc", "wp", "o", "v");
    public static final gm9 c = new gm9("^(?:heading|Heading)\\s*(\\d+)$", 0);
    public static final zj5 d = new zj5(ak5.f, null, null, null, null, null, null, null, null, 4094);
    public static final gm9 e = new gm9("[ \\t]{2,}");
    public static final HashMap f = o17.q(new yk8("png", "image/png"), new yk8("jpg", "image/jpeg"), new yk8("jpeg", "image/jpeg"), new yk8("gif", "image/gif"), new yk8("bmp", "image/bmp"), new yk8("wmf", "image/wmf"), new yk8("emf", "image/emf"));

    public static final void a(ArrayList arrayList, n66 n66Var) {
        ArrayList b2 = n66Var.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            n66 n66Var2 = (n66) b2.get(i);
            if (n66Var2.a.getNodeType() == 1) {
                String j = j(n66Var2);
                if (!j.equals("oMath") && !j.equals("oMathPara")) {
                    a(arrayList, n66Var2);
                } else {
                    arrayList.add(n66Var2);
                }
            }
        }
    }

    public static final void b(vl9 vl9Var, vl9 vl9Var2, vl9 vl9Var3, n66 n66Var) {
        boolean z;
        ArrayList h = h(n66Var, "br");
        boolean z2 = false;
        if (!h.isEmpty()) {
            int size = h.size();
            int i = 0;
            while (i < size) {
                Object obj = h.get(i);
                i++;
                if (c16.i(g((n66) obj, "type"), "page")) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        ArrayList h2 = h(n66Var, "t");
        if (!h2.isEmpty()) {
            int size2 = h2.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = h2.get(i2);
                i2++;
                if (((n66) obj2).f().length() > 0) {
                    z2 = true;
                    break;
                }
            }
        }
        if (z) {
            if (vl9Var.a) {
                vl9Var2.a = true;
            } else {
                vl9Var3.a = true;
            }
        }
        if (z2) {
            vl9Var.a = true;
        }
    }

    public static final rv9 c(n66 n66Var) {
        boolean z;
        String i0 = sl1.i0(h(n66Var, "t"), "", null, null, new u83(6), 30);
        ArrayList h = h(n66Var, "rPr");
        boolean z2 = false;
        if (!h.isEmpty()) {
            z = !h((n66) h.get(0), "i").isEmpty();
            z2 = !h((n66) h.get(0), "b").isEmpty();
        } else {
            z = false;
        }
        return new rv9(i0, z2, z);
    }

    public static final ArrayList d(n66 n66Var, String str) {
        ArrayList arrayList = new ArrayList();
        f(str, arrayList, n66Var);
        return arrayList;
    }

    public static final List e(mce mceVar, String str) {
        n66 i = mceVar.i();
        if (i == null) {
            return ks3.a;
        }
        ArrayList arrayList = new ArrayList();
        if (j(i).equals(str)) {
            arrayList.add(i);
        }
        arrayList.addAll(d(i, str));
        return arrayList;
    }

    public static final void f(String str, ArrayList arrayList, n66 n66Var) {
        ArrayList b2 = n66Var.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            n66 n66Var2 = (n66) b2.get(i);
            if (n66Var2.a.getNodeType() == 1) {
                if (j(n66Var2).equals(str)) {
                    arrayList.add(n66Var2);
                }
                f(str, arrayList, n66Var2);
            }
        }
    }

    public static final String g(n66 n66Var, String str) {
        String a2 = n66Var.a(str);
        if (a2 != null) {
            return a2;
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            String a3 = n66Var.a(((String) it.next()) + ":" + str);
            if (a3 != null) {
                return a3;
            }
        }
        return null;
    }

    public static final ArrayList h(n66 n66Var, String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList b2 = n66Var.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            n66 n66Var2 = (n66) b2.get(i);
            if (n66Var2.a.getNodeType() == 1 && j(n66Var2).equals(str)) {
                arrayList.add(n66Var2);
            }
        }
        return arrayList;
    }

    public static final List i(n66 n66Var, HashMap hashMap) {
        if (hashMap.isEmpty()) {
            return ks3.a;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList d2 = d(n66Var, "drawing");
        int size = d2.size();
        int i = 0;
        while (i < size) {
            Object obj = d2.get(i);
            i++;
            ArrayList d3 = d((n66) obj, "blip");
            int size2 = d3.size();
            int i2 = 0;
            while (i2 < size2) {
                Object obj2 = d3.get(i2);
                i2++;
                String g = g((n66) obj2, "embed");
                if (g != null) {
                    if (g.length() <= 0) {
                        g = null;
                    }
                    if (g != null) {
                        p94 p94Var = (p94) hashMap.get(g);
                        if (p94Var != null) {
                            String str = p94Var.a;
                            arrayList.add(new zj5(ak5.e, str, null, null, null, null, null, null, new bn5(p94Var.c, str, p94Var.b), 2044));
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static final String j(n66 n66Var) {
        String d2 = n66Var.d();
        if (d2 != null && d2.length() != 0) {
            return d2;
        }
        String e2 = n66Var.e();
        if (e2 == null) {
            e2 = "";
        }
        return a.i(e2, "");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0540  */
    /* JADX WARN: Type inference failed for: r12v10, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v31, types: [vl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v9, types: [vl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j06 k(byte[] r45) {
        /*
            Method dump skipped, instructions count: 1704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id3.k(byte[]):j06");
    }

    public static final String l(mce mceVar, String str) {
        ArrayList j = mceVar.j(str);
        if (!j.isEmpty()) {
            return k4b.N0(((n66) j.get(0)).f()).toString();
        }
        return null;
    }

    public static final LinkedHashMap m(String str) {
        mce q = aye.q(l2d.f(str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (n66 n66Var : e(q, "footnote")) {
            String g = g(n66Var, "id");
            if (g != null && g.length() != 0 && !g.equals("0") && !g.equals("-1")) {
                ArrayList arrayList = new ArrayList();
                ArrayList d2 = d(n66Var, "p");
                int size = d2.size();
                int i = 0;
                while (i < size) {
                    Object obj = d2.get(i);
                    i++;
                    ArrayList d3 = d((n66) obj, "r");
                    int size2 = d3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        Object obj2 = d3.get(i2);
                        i2++;
                        ArrayList h = h((n66) obj2, "t");
                        int size3 = h.size();
                        int i3 = 0;
                        while (i3 < size3) {
                            Object obj3 = h.get(i3);
                            i3++;
                            arrayList.add(((n66) obj3).f());
                        }
                    }
                }
                linkedHashMap.put(g, k4b.N0(sl1.i0(arrayList, "", null, null, null, 62)).toString());
            }
        }
        return linkedHashMap;
    }

    public static final LinkedHashMap n(String str) {
        String g;
        int i;
        String g2;
        mce q = aye.q(l2d.f(str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (n66 n66Var : e(q, "abstractNum")) {
            String g3 = g(n66Var, "abstractNumId");
            if (g3 != null && g3.length() != 0) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                ArrayList h = h(n66Var, "lvl");
                int size = h.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = h.get(i2);
                    i2++;
                    n66 n66Var2 = (n66) obj;
                    String g4 = g(n66Var2, "ilvl");
                    if (g4 == null) {
                        g4 = "0";
                    }
                    Integer R = r4b.R(10, g4);
                    if (R != null) {
                        i = R.intValue();
                    } else {
                        i = 0;
                    }
                    ArrayList h2 = h(n66Var2, "numFmt");
                    String str2 = "bullet";
                    if (!h2.isEmpty() && (g2 = g((n66) h2.get(0), "val")) != null) {
                        str2 = g2;
                    }
                    linkedHashMap2.put(Integer.valueOf(i), new c78(str2));
                }
                linkedHashMap.put(g3, linkedHashMap2);
            }
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (n66 n66Var3 : e(q, "num")) {
            String g5 = g(n66Var3, "numId");
            if (g5 != null && g5.length() != 0) {
                ArrayList h3 = h(n66Var3, "abstractNumId");
                if (!h3.isEmpty() && (g = g((n66) h3.get(0), "val")) != null && linkedHashMap.containsKey(g)) {
                    Object obj2 = linkedHashMap.get(g);
                    obj2.getClass();
                    linkedHashMap3.put(g5, obj2);
                }
            }
        }
        return linkedHashMap3;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0230 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.zj5 o(defpackage.n66 r47, java.util.LinkedHashMap r48, java.util.LinkedHashMap r49, java.util.LinkedHashMap r50, java.util.LinkedHashMap r51) {
        /*
            Method dump skipped, instructions count: 836
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.id3.o(n66, java.util.LinkedHashMap, java.util.LinkedHashMap, java.util.LinkedHashMap, java.util.LinkedHashMap):zj5");
    }

    public static final LinkedHashMap p(String str) {
        Integer num;
        b27 b2;
        Integer S;
        String g;
        String g2;
        mce q = aye.q(l2d.f(str));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (n66 n66Var : e(q, "style")) {
            String g3 = g(n66Var, "styleId");
            if (g3 != null && g3.length() != 0) {
                ArrayList h = h(n66Var, "name");
                String str2 = "";
                if (!h.isEmpty() && (g2 = g((n66) h.get(0), "val")) != null) {
                    str2 = g2;
                }
                ArrayList h2 = h(n66Var, "basedOn");
                if (!h2.isEmpty()) {
                    g((n66) h2.get(0), "val");
                }
                ArrayList h3 = h(n66Var, "pPr");
                if (!h3.isEmpty()) {
                    ArrayList h4 = h((n66) h3.get(0), "outlineLvl");
                    if (!h4.isEmpty() && (g = g((n66) h4.get(0), "val")) != null) {
                        num = r4b.R(10, g);
                        if (num == null && (b2 = gm9.b(c, str2)) != null && (S = r4b.S((String) ((z17) b2.a()).get(1))) != null) {
                            num = Integer.valueOf(S.intValue() - 1);
                        }
                        linkedHashMap.put(g3, new r5b(num, str2));
                    }
                }
                num = null;
                if (num == null) {
                    num = Integer.valueOf(S.intValue() - 1);
                }
                linkedHashMap.put(g3, new r5b(num, str2));
            }
        }
        return linkedHashMap;
    }
}
