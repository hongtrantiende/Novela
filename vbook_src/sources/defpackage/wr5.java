package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wr5  reason: default package */
/* loaded from: classes.dex */
public abstract class wr5 {
    public static final gm9 a;
    public static final gm9 b;

    static {
        Pattern.compile("(?:^|/)BIN([0-9A-Fa-f]{4,8})(?:\\.[^./\\\\]*)?$").getClass();
        a = new gm9("!\\[image\\]\\(hwp5bin:(\\d+)\\)");
        b = new gm9("^BIN([0-9A-Fa-f]{4,8})(?:\\.|$)");
    }

    public static final void a(ArrayList arrayList, Map map, Map map2) {
        int size = arrayList.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            zj5 zj5Var = (zj5) arrayList.get(i);
            bs5 bs5Var = (bs5) map.get(zj5Var);
            if (bs5Var != null) {
                zj5Var = zj5.a(zj5Var, bs5Var.a, bs5Var.b, null, null, null, null, null, null, bs5Var.c, 2044);
            }
            zj5 zj5Var2 = zj5Var;
            ck5 ck5Var = zj5Var2.c;
            if (ck5Var != null) {
                List<List> list = ck5Var.c;
                int i2 = 10;
                ArrayList arrayList2 = new ArrayList(tl1.s(list, 10));
                boolean z2 = z;
                for (List<bk5> list2 : list) {
                    ArrayList arrayList3 = new ArrayList(tl1.s(list2, i2));
                    for (bk5 bk5Var : list2) {
                        String str = bk5Var.a;
                        if (k4b.V(str, "hwp5bin:", z)) {
                            String h = a.h(str, new fo4(map2, 11));
                            if (!c16.i(h, str)) {
                                bk5Var = bk5.a(bk5Var, h, null, 30);
                                z2 = true;
                            }
                        }
                        List list3 = bk5Var.d;
                        if (list3 != null) {
                            ArrayList arrayList4 = new ArrayList(list3);
                            a(arrayList4, map, map2);
                            if (!arrayList4.equals(list3)) {
                                bk5Var = bk5.a(bk5Var, null, arrayList4, 23);
                                z2 = true;
                                arrayList3.add(bk5Var);
                                z = false;
                            }
                        }
                        arrayList3.add(bk5Var);
                        z = false;
                    }
                    arrayList2.add(arrayList3);
                    z = false;
                    i2 = 10;
                }
                if (z2) {
                    ck5Var = ck5.a(ck5Var, arrayList2, null, 27);
                }
                ck5 ck5Var2 = ck5Var;
                if (ck5Var2 != zj5Var2.c) {
                    zj5Var2 = zj5.a(zj5Var2, null, null, ck5Var2, null, null, null, null, null, null, 4091);
                }
            }
            List list4 = zj5Var2.h;
            if (list4 != null) {
                ArrayList arrayList5 = new ArrayList(list4);
                a(arrayList5, map, map2);
                zj5Var2 = zj5.a(zj5Var2, null, null, null, null, null, arrayList5, null, null, null, 3839);
            }
            arrayList.set(i, zj5Var2);
            i++;
            z = false;
        }
    }

    public static final void b(List list, ArrayList arrayList) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zj5 zj5Var = (zj5) it.next();
            if (zj5Var.a == ak5.e) {
                arrayList.add(zj5Var);
            }
            ck5 ck5Var = zj5Var.c;
            if (ck5Var != null) {
                for (List<bk5> list2 : ck5Var.c) {
                    for (bk5 bk5Var : list2) {
                        List list3 = bk5Var.d;
                        if (list3 != null) {
                            b(list3, arrayList);
                        }
                    }
                }
            }
            List list4 = zj5Var.h;
            if (list4 != null) {
                b(list4, arrayList);
            }
        }
    }

    public static final String c(byte[] bArr) {
        if (bArr.length >= 4) {
            int i = bArr[0] & 255;
            if (i == 137 && (bArr[1] & 255) == 80 && (bArr[2] & 255) == 78 && (bArr[3] & 255) == 71) {
                return "image/png";
            }
            if (i == 255 && (bArr[1] & 255) == 216 && (bArr[2] & 255) == 255) {
                return "image/jpeg";
            }
            if (i == 71 && (bArr[1] & 255) == 73 && (bArr[2] & 255) == 70) {
                return "image/gif";
            }
            if (i == 66 && (bArr[1] & 255) == 77) {
                return "image/bmp";
            }
            if (i == 215 && (bArr[1] & 255) == 205 && (bArr[2] & 255) == 198 && (bArr[3] & 255) == 154) {
                return "image/wmf";
            }
            if (i == 1 && (bArr[1] & 255) == 0 && (bArr[2] & 255) == 0 && (bArr[3] & 255) == 0) {
                return "image/emf";
            }
            return null;
        }
        return null;
    }
}
