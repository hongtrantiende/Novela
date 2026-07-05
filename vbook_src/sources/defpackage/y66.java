package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y66  reason: default package */
/* loaded from: classes.dex */
public final class y66 extends ad7 {
    public static final byte[] o = r4b.H("pagebreak");
    public ArrayList m;
    public LinkedHashMap n;

    public static final xgb i(uw7 uw7Var) {
        ArrayList arrayList;
        Integer num = uw7Var.b;
        num.getClass();
        String m = s21.m("filepos:", k4b.r0(10, String.valueOf(num.intValue())));
        String str = uw7Var.d;
        ArrayList arrayList2 = uw7Var.j;
        if (arrayList2 != null) {
            arrayList = new ArrayList(tl1.s(arrayList2, 10));
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                arrayList.add(i((uw7) obj));
            }
        } else {
            arrayList = null;
        }
        return new xgb(str, m, arrayList);
    }

    public static final void j(y66 y66Var, xgb xgbVar) {
        int g = y66Var.g(xgbVar.b);
        if (g != -1) {
            LinkedHashMap linkedHashMap = y66Var.n;
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
                        j(y66Var, xgbVar2);
                    }
                    return;
                }
                return;
            }
            c16.w("sectionIdMap");
            throw null;
        }
    }

    public final int g(String str) {
        Integer R = r4b.R(10, k4b.D0(str, "filepos:", str));
        if (R != null) {
            int intValue = R.intValue();
            ArrayList arrayList = this.m;
            if (arrayList != null) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    if (((z66) obj).c > intValue) {
                        return i;
                    }
                    i++;
                }
                return -1;
            }
            c16.w("sections");
            throw null;
        }
        return -1;
    }

    public final String h(z66 z66Var) {
        z66Var.getClass();
        zc7 zc7Var = new zc7(this);
        zc7Var.d(z66Var.b);
        int i = z66Var.d;
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = zc7Var.c();
        }
        return this.h.a(bArr);
    }
}
