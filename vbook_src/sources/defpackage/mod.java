package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mod  reason: default package */
/* loaded from: classes.dex */
public abstract class mod {
    public static final gm9 a = new gm9("^-?\\d+\\.\\d+$");
    public static final gm9 b = new gm9("^([A-Z]+)(\\d+)$");

    public static final vf9 a(String str) {
        String str2;
        b27 b2 = gm9.b(b, str);
        if (b2 != null) {
            int i = 0;
            for (int i2 = 0; i2 < ((String) ((z17) b2.a()).get(1)).length(); i2++) {
                i = (i * 26) + (str2.charAt(i2) - '@');
            }
            Integer S = r4b.S((String) ((z17) b2.a()).get(2));
            if (S != null) {
                return new vf9(i - 1, S.intValue() - 1, 3);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
        if (r7 != null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032e  */
    /* JADX WARN: Type inference failed for: r7v46, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v65 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.cw b(java.lang.String r30, java.util.List r31) {
        /*
            Method dump skipped, instructions count: 1117
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mod.b(java.lang.String, java.util.List):cw");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ca  */
    /* JADX WARN: Type inference failed for: r6v1, types: [ks3] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j06 c(byte[] r36) {
        /*
            Method dump skipped, instructions count: 743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mod.c(byte[]):j06");
    }

    public static final String d(mce mceVar, String str) {
        ArrayList j = mceVar.j(str);
        if (!j.isEmpty()) {
            return k4b.N0(((n66) j.get(0)).f()).toString();
        }
        return null;
    }

    public static final double e(int i) {
        int i2;
        if (i < 0) {
            i2 = -i;
        } else {
            i2 = i;
        }
        double d = 1.0d;
        for (int i3 = 0; i3 < i2; i3++) {
            d *= 10.0d;
        }
        if (i < 0) {
            return 1.0d / d;
        }
        return d;
    }

    public static final ArrayList f(String str, ArrayList arrayList, ArrayList arrayList2, int i, int i2, int i3) {
        String str2;
        int i4;
        int i5;
        String str3;
        ArrayList arrayList3 = new ArrayList();
        if (str.length() > 0) {
            arrayList3.add(new zj5(ak5.c, str, null, 2, Integer.valueOf(i3 + 1), null, null, null, null, 4068));
        }
        if (i >= 0 && i2 >= 0 && !arrayList.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            HashSet hashSet = new HashSet();
            int size = arrayList2.size();
            int i6 = 0;
            while (i6 < size) {
                Object obj = arrayList2.get(i6);
                int i7 = i6 + 1;
                o97 o97Var = (o97) obj;
                int i8 = o97Var.c;
                int i9 = o97Var.d;
                int i10 = o97Var.b;
                int i11 = o97Var.a;
                int i12 = size;
                linkedHashMap.put(i10 + "," + i11, new xua((i8 - i11) + 1, (i9 - i10) + 1));
                if (i10 <= i9) {
                    int i13 = i10;
                    while (true) {
                        int i14 = o97Var.c;
                        if (i11 <= i14) {
                            int i15 = i11;
                            while (true) {
                                if (i13 != i10 || i15 != i11) {
                                    hashSet.add(i13 + "," + i15);
                                }
                                if (i15 == i14) {
                                    break;
                                }
                                i15++;
                            }
                        }
                        if (i13 != i9) {
                            i13++;
                        }
                    }
                }
                size = i12;
                i6 = i7;
            }
            int i16 = -1;
            int i17 = -1;
            if (i >= 0) {
                int i18 = 0;
                while (true) {
                    List list = (List) sl1.f0(i18, arrayList);
                    if (list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            } else if (!c16.i((String) it.next(), "")) {
                                if (i16 == -1) {
                                    i16 = i18;
                                }
                                i17 = i18;
                            }
                        }
                    }
                    if (i18 == i) {
                        break;
                    }
                    i18++;
                }
            }
            if (i16 != -1) {
                ArrayList arrayList4 = new ArrayList();
                if (i16 <= i17) {
                    while (true) {
                        ArrayList arrayList5 = new ArrayList();
                        if (i2 >= 0) {
                            int i19 = 0;
                            while (true) {
                                String str4 = i16 + "," + i19;
                                if (!hashSet.contains(str4)) {
                                    List list2 = (List) sl1.f0(i16, arrayList);
                                    if (list2 == null || (str3 = (String) sl1.f0(i19, list2)) == null) {
                                        str2 = "";
                                    } else {
                                        str2 = str3;
                                    }
                                    xua xuaVar = (xua) linkedHashMap.get(str4);
                                    if (xuaVar != null) {
                                        i4 = xuaVar.a;
                                    } else {
                                        i4 = 1;
                                    }
                                    if (xuaVar != null) {
                                        i5 = xuaVar.b;
                                    } else {
                                        i5 = 1;
                                    }
                                    arrayList5.add(new ka1(str2, i4, i5, null, null));
                                }
                                if (i19 == i2) {
                                    break;
                                }
                                i19++;
                            }
                        }
                        arrayList4.add(arrayList5);
                        if (i16 == i17) {
                            break;
                        }
                        i16++;
                    }
                }
                if (!arrayList4.isEmpty()) {
                    ck5 b2 = mjb.b(arrayList4);
                    if (b2.a > 0) {
                        arrayList3.add(new zj5(ak5.b, null, b2, null, Integer.valueOf(i3 + 1), null, null, null, null, 4074));
                    }
                }
            }
        }
        return arrayList3;
    }
}
