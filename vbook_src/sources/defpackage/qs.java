package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qs  reason: default package */
/* loaded from: classes.dex */
public abstract class qs {
    public static final ps a = new ps("");

    public static final List a(ps psVar, int i, int i2, y4 y4Var) {
        List list;
        boolean z;
        if (i == i2 || (list = psVar.a) == null) {
            return null;
        }
        int i3 = 0;
        if (i == 0 && i2 >= psVar.b.length()) {
            if (y4Var == null) {
                return list;
            }
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            while (i3 < size) {
                Object obj = list.get(i3);
                if (((Boolean) y4Var.invoke(((os) obj).a)).booleanValue()) {
                    arrayList.add(obj);
                }
                i3++;
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        while (i3 < size2) {
            os osVar = (os) list.get(i3);
            if (y4Var != null) {
                z = ((Boolean) y4Var.invoke(osVar.a)).booleanValue();
            } else {
                z = true;
            }
            if (z) {
                int i4 = osVar.b;
                int i5 = osVar.c;
                if (b(i, i2, i4, i5)) {
                    arrayList2.add(new os(dce.n(osVar.b, i, i2) - i, osVar.d, (ls) osVar.a, dce.n(i5, i, i2) - i));
                }
            }
            i3++;
        }
        return arrayList2;
    }

    public static final boolean b(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i == i2) {
            z = true;
        } else {
            z = false;
        }
        if (i3 == i4) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z6 = z | z2;
        if (i == i3) {
            z3 = true;
        } else {
            z3 = false;
        }
        boolean z7 = z6 & z3;
        if (i < i4) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i3 < i2) {
            z5 = true;
        }
        return (z4 & z5) | z7;
    }
}
