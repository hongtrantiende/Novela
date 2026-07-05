package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a76  reason: default package */
/* loaded from: classes.dex */
public final class a76 extends ad7 {
    public static final gm9 t = new gm9("kindle:pos:fid:(\\w+):off:(\\w+)");
    public static final gm9 u = new gm9("kindle:(flow|embed):(\\w+)(?:\\?mime=(\\w+/[-+.\\w]+))?");
    public int[] m;
    public int[] n;
    public ArrayList o;
    public ArrayList p;
    public b76 q;
    public ArrayList r;
    public LinkedHashMap s;

    public static String i(int i, int i2) {
        nqe.u(32);
        String num = Integer.toString(i, 32);
        num.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = num.toUpperCase(locale);
        upperCase.getClass();
        String r0 = k4b.r0(4, upperCase);
        nqe.u(32);
        String num2 = Integer.toString(i2, 32);
        num2.getClass();
        String upperCase2 = num2.toUpperCase(locale);
        upperCase2.getClass();
        return eub.p("kindle:pos:fid:", r0, ":off:", k4b.r0(10, upperCase2));
    }

    public static c76 j(String str) {
        b27 b = gm9.b(t, str);
        if (b == null) {
            return null;
        }
        nqe.u(32);
        int parseInt = Integer.parseInt((String) ((z17) b.a()).get(1), 32);
        nqe.u(32);
        return new c76(parseInt, Integer.parseInt((String) ((z17) b.a()).get(2), 32));
    }

    public static final xgb k(a76 a76Var, uw7 uw7Var) {
        ArrayList arrayList;
        List list = uw7Var.f;
        list.getClass();
        int i = 0;
        String i2 = i(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
        String str = uw7Var.d;
        ArrayList arrayList2 = uw7Var.j;
        if (arrayList2 != null) {
            arrayList = new ArrayList(tl1.s(arrayList2, 10));
            int size = arrayList2.size();
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList.add(k(a76Var, (uw7) obj));
            }
        } else {
            arrayList = null;
        }
        return new xgb(str, i2, arrayList);
    }

    public static final void l(a76 a76Var, xgb xgbVar) {
        int g;
        c76 j = j(xgbVar.b);
        if (j == null) {
            g = -1;
        } else {
            g = a76Var.g(j.a);
        }
        if (g != -1) {
            LinkedHashMap linkedHashMap = a76Var.s;
            if (linkedHashMap != null) {
                Integer valueOf = Integer.valueOf(g);
                Object obj = linkedHashMap.get(valueOf);
                if (obj == null) {
                    obj = new ArrayList();
                    linkedHashMap.put(valueOf, obj);
                }
                ((ArrayList) obj).add(xgbVar);
                List<xgb> list = xgbVar.c;
                if (list != null) {
                    for (xgb xgbVar2 : list) {
                        l(a76Var, xgbVar2);
                    }
                    return;
                }
                return;
            }
            c16.w("sectionIdMap");
            throw null;
        }
    }

    public final int g(int i) {
        ArrayList arrayList = this.r;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                List<qr4> list = ((e76) obj).c;
                if (!list.isEmpty()) {
                    for (qr4 qr4Var : list) {
                        if (qr4Var.c == i) {
                            return i2;
                        }
                    }
                    continue;
                }
                i2++;
            }
            return -1;
        }
        c16.w("sections");
        throw null;
    }

    public final String h(e76 e76Var) {
        e76Var.getClass();
        yna ynaVar = e76Var.b;
        List<qr4> list = e76Var.c;
        int i = e76Var.e;
        int i2 = ynaVar.d;
        zc7 zc7Var = new zc7(this);
        zc7Var.d(i2);
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = zc7Var.c();
        }
        byte[] bArr2 = new byte[i];
        int i4 = ynaVar.e;
        b00.U(0, 0, i4, bArr, bArr2);
        int i5 = i - i4;
        for (qr4 qr4Var : list) {
            int i6 = qr4Var.a;
            int i7 = qr4Var.e;
            int i8 = i6 - i2;
            int i9 = qr4Var.d + i4;
            b00.U(i8 + i7, i8, i - i5, bArr2, bArr2);
            b00.U(i8, i9, i9 + i7, bArr, bArr2);
            i5 -= i7;
        }
        return this.h.a(bArr2);
    }
}
