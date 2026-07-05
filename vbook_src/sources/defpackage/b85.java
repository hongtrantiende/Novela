package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b85  reason: default package */
/* loaded from: classes.dex */
public final class b85 {
    public final a85 a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public b85(a85 a85Var, String str, Uri uri, int i) {
        this.a = a85Var;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static qs5 a(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            s75 s75Var = (s75) list.get(i);
            Uri uri = s75Var.a;
            try {
                d(s75Var.a, null, i, arrayList, new a85(s75Var.b, s75Var.d, s75Var.c), hashMap, hashMap2);
            } catch (xm8 unused) {
            }
        }
        return qs5.l(arrayList);
    }

    public static qs5 b(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            t75 t75Var = (t75) list.get(i);
            d(t75Var.a, t75Var.g, i, arrayList, new a85(t75Var.b, t75Var.h, null), hashMap, hashMap2);
        }
        return qs5.l(arrayList);
    }

    public static void d(Uri uri, String str, int i, ArrayList arrayList, a85 a85Var, HashMap hashMap, HashMap hashMap2) {
        int i2;
        String str2;
        Integer num = (Integer) hashMap.get(a85Var);
        boolean z = false;
        int i3 = 1;
        if (num == null) {
            hashMap2.put(a85Var, 0);
            if (str == null) {
                hashMap2.put(a85Var, 1);
                str = ".";
            }
            b85 b85Var = new b85(a85Var, str, uri, i);
            hashMap.put(a85Var, Integer.valueOf(arrayList.size()));
            arrayList.add(b85Var);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) hashMap2.get(a85Var);
            num2.getClass();
            int intValue = num2.intValue() + 1;
            if (intValue <= 1) {
                if (intValue >= 0) {
                    z = true;
                }
                wq9.p(intValue, "invalid count: %s", z);
                if (intValue != 0) {
                    str2 = ".";
                } else {
                    str2 = "";
                }
            } else {
                long j = intValue;
                int i4 = (int) j;
                if (i4 == j) {
                    char[] cArr = new char[i4];
                    ".".getChars(0, 1, cArr, 0);
                    while (true) {
                        i2 = i4 - i3;
                        if (i3 >= i2) {
                            break;
                        }
                        System.arraycopy(cArr, 0, cArr, i3, i3);
                        i3 <<= 1;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i2);
                    str2 = new String(cArr);
                } else {
                    throw new ArrayIndexOutOfBoundsException(hl5.k(j, "Required array size too large: "));
                }
            }
            hashMap2.put(a85Var, Integer.valueOf(intValue));
            str = str2;
        }
        b85 b85Var2 = (b85) arrayList.get(num.intValue());
        Uri uri2 = (Uri) b85Var2.b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw xm8.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }
        b85Var2.b.put(str, uri);
        if (i != -1) {
            b85Var2.c.add(Integer.valueOf(i));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
