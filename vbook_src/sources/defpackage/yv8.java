package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yv8  reason: default package */
/* loaded from: classes3.dex */
public final class yv8 implements tu8 {
    public static final gm9 F = new gm9("\\s+");
    public static final Map G;
    public static final LinkedHashMap H;
    public static final Map I;
    public static final Map J;
    public static final Map K;
    public static final r07 L;
    public final int C;
    public final int D;
    public final wv8 E;
    public final Map a;
    public final Map b;
    public final String c;
    public final int d;
    public final int e;
    public final int f;

    static {
        Map s = o17.s(new yk8("ngh", "ŋ"), new yk8("ng", "ŋ"), new yk8("nh", "ɲ"), new yk8("gh", "ɣ"), new yk8("ch", "c"), new yk8("th", "tʰ"), new yk8("tr", "c"), new yk8("ph", "f"), new yk8("kh", "x"), new yk8("đ", "d"), new yk8("b", "b"), new yk8("c", "k"), new yk8("d", "z"), new yk8("g", "ɣ"), new yk8("h", "h"), new yk8("k", "k"), new yk8("l", "l"), new yk8("m", "m"), new yk8("n", "n"), new yk8("p", "p"), new yk8("q", "k"), new yk8("r", "z"), new yk8("s", "s"), new yk8("t", "t"), new yk8("v", "v"), new yk8("x", "s"));
        G = s;
        H = o17.u(s, o17.s(new yk8("d", "j"), new yk8("r", "r"), new yk8("s", "ʂ"), new yk8("tr", "ʈ")));
        I = o17.s(new yk8("ươ", "ɯə"), new yk8("uô", "uə"), new yk8("iê", "iə"), new yk8("yê", "iə"), new yk8("ưa", "ɯə"), new yk8("ua", "uə"), new yk8("ia", "iə"), new yk8("ya", "iə"), new yk8("a", "a"), new yk8("ă", "ɐ"), new yk8("â", "ɤ̆"), new yk8("e", "ɛ"), new yk8("ê", "e"), new yk8("i", "i"), new yk8("o", "ɔ"), new yk8("ô", "o"), new yk8("ơ", "ɤ"), new yk8("u", "u"), new yk8("ư", "ɯ"), new yk8("y", "i"));
        J = o17.s(new yk8("ng", "ŋ"), new yk8("nh", "ɲ"), new yk8("ch", "c"), new yk8("c", "k"), new yk8("m", "m"), new yk8("n", "n"), new yk8("p", "p"), new yk8("t", "t"), new yk8("i", "j"), new yk8("y", "j"), new yk8("u", "w"), new yk8("o", "w"));
        K = o17.s(new yk8((char) 224, "T2"), new yk8((char) 225, "T3"), new yk8((char) 7843, "T4"), new yk8((char) 227, "T5"), new yk8((char) 7841, "T6"), new yk8((char) 7857, "T2"), new yk8((char) 7855, "T3"), new yk8((char) 7859, "T4"), new yk8((char) 7861, "T5"), new yk8((char) 7863, "T6"), new yk8((char) 7847, "T2"), new yk8((char) 7845, "T3"), new yk8((char) 7849, "T4"), new yk8((char) 7851, "T5"), new yk8((char) 7853, "T6"), new yk8((char) 232, "T2"), new yk8((char) 233, "T3"), new yk8((char) 7867, "T4"), new yk8((char) 7869, "T5"), new yk8((char) 7865, "T6"), new yk8((char) 7873, "T2"), new yk8((char) 7871, "T3"), new yk8((char) 7875, "T4"), new yk8((char) 7877, "T5"), new yk8((char) 7879, "T6"), new yk8((char) 236, "T2"), new yk8((char) 237, "T3"), new yk8((char) 7881, "T4"), new yk8((char) 297, "T5"), new yk8((char) 7883, "T6"), new yk8((char) 242, "T2"), new yk8((char) 243, "T3"), new yk8((char) 7887, "T4"), new yk8((char) 245, "T5"), new yk8((char) 7885, "T6"), new yk8((char) 7891, "T2"), new yk8((char) 7889, "T3"), new yk8((char) 7893, "T4"), new yk8((char) 7895, "T5"), new yk8((char) 7897, "T6"), new yk8((char) 7901, "T2"), new yk8((char) 7899, "T3"), new yk8((char) 7903, "T4"), new yk8((char) 7905, "T5"), new yk8((char) 7907, "T6"), new yk8((char) 249, "T2"), new yk8((char) 250, "T3"), new yk8((char) 7911, "T4"), new yk8((char) 361, "T5"), new yk8((char) 7909, "T6"), new yk8((char) 7915, "T2"), new yk8((char) 7913, "T3"), new yk8((char) 7917, "T4"), new yk8((char) 7919, "T5"), new yk8((char) 7921, "T6"), new yk8((char) 7923, "T2"), new yk8((char) 253, "T3"), new yk8((char) 7927, "T4"), new yk8((char) 7929, "T5"), new yk8((char) 7925, "T6"));
        r07 r07Var = new r07();
        for (int i = 0; i < 5; i++) {
            r07Var.put(Character.valueOf("àáảãạ".charAt(i)), 'a');
        }
        for (int i2 = 0; i2 < 5; i2++) {
            r07Var.put(Character.valueOf("ằắẳẵặ".charAt(i2)), (char) 259);
        }
        for (int i3 = 0; i3 < 5; i3++) {
            r07Var.put(Character.valueOf("ầấẩẫậ".charAt(i3)), (char) 226);
        }
        for (int i4 = 0; i4 < 5; i4++) {
            r07Var.put(Character.valueOf("èéẻẽẹ".charAt(i4)), 'e');
        }
        for (int i5 = 0; i5 < 5; i5++) {
            r07Var.put(Character.valueOf("ềếểễệ".charAt(i5)), (char) 234);
        }
        for (int i6 = 0; i6 < 5; i6++) {
            r07Var.put(Character.valueOf("ìíỉĩị".charAt(i6)), 'i');
        }
        for (int i7 = 0; i7 < 5; i7++) {
            r07Var.put(Character.valueOf("òóỏõọ".charAt(i7)), 'o');
        }
        for (int i8 = 0; i8 < 5; i8++) {
            r07Var.put(Character.valueOf("ồốổỗộ".charAt(i8)), (char) 244);
        }
        for (int i9 = 0; i9 < 5; i9++) {
            r07Var.put(Character.valueOf("ờớởỡợ".charAt(i9)), (char) 417);
        }
        for (int i10 = 0; i10 < 5; i10++) {
            r07Var.put(Character.valueOf("ùúủũụ".charAt(i10)), 'u');
        }
        for (int i11 = 0; i11 < 5; i11++) {
            r07Var.put(Character.valueOf("ừứửữự".charAt(i11)), (char) 432);
        }
        for (int i12 = 0; i12 < 5; i12++) {
            r07Var.put(Character.valueOf("ỳýỷỹỵ".charAt(i12)), 'y');
        }
        L = r07Var.b();
    }

    public yv8(Map map, xv8 xv8Var) {
        Map map2;
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        this.a = map;
        xv8 xv8Var2 = xv8.b;
        if (xv8Var == xv8Var2) {
            map2 = H;
        } else {
            map2 = G;
        }
        this.b = map2;
        if (xv8Var == xv8Var2) {
            str = "j";
        } else {
            str = "z";
        }
        this.c = str;
        Integer num = (Integer) map.get("^");
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        this.d = i;
        Integer num2 = (Integer) map.get("$");
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = 2;
        }
        this.e = i2;
        Integer num3 = (Integer) map.get("#");
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = 3;
        }
        this.f = i3;
        Integer num4 = (Integer) map.get("sil");
        if (num4 != null) {
            i4 = num4.intValue();
        } else {
            i4 = 51;
        }
        this.C = i4;
        Integer num5 = (Integer) map.get("sp");
        if (num5 != null) {
            i5 = num5.intValue();
        } else {
            i5 = 52;
        }
        this.D = i5;
        this.E = wv8.a;
    }

    public final int[] a(String str, boolean z) {
        int i;
        ArrayList C = tl1.C(Integer.valueOf(this.d));
        int i2 = this.f;
        int i3 = this.C;
        if (z) {
            C.add(Integer.valueOf(i3));
            C.add(Integer.valueOf(i2));
        }
        Iterator it = k4b.z0(str, new String[]{"|"}).iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = this.D;
            if (!hasNext) {
                break;
            }
            String str2 = (String) it.next();
            if (str2.length() != 0) {
                String obj = k4b.N0(str2).toString();
                if (obj.length() == 1 && k4b.W(".,!?;:\"-", obj.charAt(0))) {
                    char charAt = obj.charAt(0);
                    if (k4b.W(".!?", charAt)) {
                        C.add(Integer.valueOf(i3));
                        C.add(Integer.valueOf(i2));
                    } else if (k4b.W(",;:", charAt)) {
                        C.add(Integer.valueOf(i));
                        C.add(Integer.valueOf(i2));
                    }
                } else {
                    for (String str3 : k4b.y0(obj, new char[]{' '}, 0, 6)) {
                        Integer num = (Integer) this.a.get(str3);
                        if (num != null) {
                            C.add(num);
                            C.add(Integer.valueOf(i2));
                        }
                    }
                }
            }
        }
        if (z) {
            if (C.size() >= 2 && ((Number) nk2.n(1, C)).intValue() == i2 && (((Number) nk2.n(2, C)).intValue() == i || ((Number) nk2.n(2, C)).intValue() == i3)) {
                C.remove(C.size() - 1);
                C.set(C.size() - 1, Integer.valueOf(i3));
            } else {
                C.add(Integer.valueOf(i3));
            }
        }
        C.add(Integer.valueOf(this.e));
        return sl1.B0(C);
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0254, code lost:
        if (r5 == false) goto L151;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0244  */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    @Override // defpackage.tu8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int[] b(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 1268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yv8.b(java.lang.String):int[]");
    }
}
