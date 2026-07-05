package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l4b  reason: default package */
/* loaded from: classes3.dex */
public abstract class l4b extends hre {
    public static String x(String str, String str2) {
        return g9a.d0(new ki4(3, new c00(str, 3), new a23(str2, 13)), "\n");
    }

    public static String y(String str) {
        Comparable comparable;
        int i;
        String str2;
        List p0 = k4b.p0(str);
        ArrayList arrayList = new ArrayList();
        for (Object obj : p0) {
            if (!k4b.j0((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            String str3 = (String) obj2;
            int length = str3.length();
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    if (!nqe.y(str3.charAt(i4))) {
                        break;
                    }
                    i4++;
                } else {
                    i4 = -1;
                    break;
                }
            }
            if (i4 == -1) {
                i4 = str3.length();
            }
            arrayList2.add(Integer.valueOf(i4));
        }
        Iterator it = arrayList2.iterator();
        if (!it.hasNext()) {
            comparable = null;
        } else {
            comparable = (Comparable) it.next();
            while (it.hasNext()) {
                Comparable comparable2 = (Comparable) it.next();
                if (comparable.compareTo(comparable2) > 0) {
                    comparable = comparable2;
                }
            }
        }
        Integer num = (Integer) comparable;
        if (num != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        int length2 = str.length();
        p0.size();
        int size2 = p0.size() - 1;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : p0) {
            int i5 = i2 + 1;
            if (i2 >= 0) {
                String str4 = (String) obj3;
                if ((i2 == 0 || i2 == size2) && k4b.j0(str4)) {
                    str2 = null;
                } else {
                    str2 = k4b.X(i, str4);
                }
                if (str2 != null) {
                    arrayList3.add(str2);
                }
                i2 = i5;
            } else {
                tl1.M();
                throw null;
            }
        }
        StringBuilder sb = new StringBuilder(length2);
        sl1.h0(arrayList3, sb, "\n", null, Token.IMPORT);
        return sb.toString();
    }

    public static String z(String str) {
        String substring;
        if (!k4b.j0("|")) {
            List p0 = k4b.p0(str);
            int length = str.length();
            p0.size();
            int size = p0.size() - 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            for (Object obj : p0) {
                int i2 = i + 1;
                if (i >= 0) {
                    String str2 = (String) obj;
                    if ((i == 0 || i == size) && k4b.j0(str2)) {
                        str2 = null;
                    } else {
                        int length2 = str2.length();
                        int i3 = 0;
                        while (true) {
                            if (i3 < length2) {
                                if (!nqe.y(str2.charAt(i3))) {
                                    break;
                                }
                                i3++;
                            } else {
                                i3 = -1;
                                break;
                            }
                        }
                        if (i3 == -1 || !r4b.P(i3, str2, "|", false)) {
                            substring = null;
                        } else {
                            substring = str2.substring("|".length() + i3);
                        }
                        if (substring != null) {
                            str2 = substring;
                        }
                    }
                    if (str2 != null) {
                        arrayList.add(str2);
                    }
                    i = i2;
                } else {
                    tl1.M();
                    throw null;
                }
            }
            StringBuilder sb = new StringBuilder(length);
            sl1.h0(arrayList, sb, "\n", null, Token.IMPORT);
            return sb.toString();
        }
        vs.m("marginPrefix must be non-blank string.");
        return null;
    }
}
