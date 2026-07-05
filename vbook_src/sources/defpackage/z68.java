package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z68  reason: default package */
/* loaded from: classes3.dex */
public final class z68 implements ym8 {
    public final List a;
    public final int b;
    public final boolean c;

    public z68(List list) {
        boolean z;
        int i;
        int i2;
        list.getClass();
        this.a = list;
        Iterator it = list.iterator();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = 1;
            if (!it.hasNext()) {
                break;
            }
            Integer num = ((w68) it.next()).a;
            if (num != null) {
                i5 = num.intValue();
            }
            i4 += i5;
        }
        this.b = i4;
        List<w68> list2 = this.a;
        if (list2 == null || !list2.isEmpty()) {
            for (w68 w68Var : list2) {
                if (w68Var.a == null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        this.c = z;
        List<w68> list3 = this.a;
        if (list3 == null || !list3.isEmpty()) {
            for (w68 w68Var2 : list3) {
                Integer num2 = w68Var2.a;
                if (num2 != null) {
                    i = num2.intValue();
                    continue;
                } else {
                    i = Integer.MAX_VALUE;
                    continue;
                }
                if (i <= 0) {
                    vs.m("Failed requirement.");
                    throw null;
                }
            }
        }
        List<w68> list4 = this.a;
        if (list4 != null && list4.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (w68 w68Var3 : list4) {
                if (w68Var3.a == null && (i2 = i2 + 1) < 0) {
                    tl1.L();
                    throw null;
                }
            }
        }
        if (i2 <= 1) {
            return;
        }
        List list5 = this.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list5) {
            if (((w68) obj).a == null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(tl1.s(arrayList, 10));
        int size = arrayList.size();
        while (i3 < size) {
            Object obj2 = arrayList.get(i3);
            i3++;
            arrayList2.add(((w68) obj2).b);
        }
        hfd.h(arrayList2, ". Parsing is undefined: for example, with variable-length month number and variable-length day of month, '111' can be parsed as Jan 11th or Nov 1st.", "At most one variable-length numeric field in a row is allowed, but got several: ");
        throw null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [xl9, java.lang.Object] */
    @Override // defpackage.ym8
    public final Object a(b72 b72Var, String str, int i) {
        int i2;
        int i3 = this.b;
        if (i + i3 > str.length()) {
            return new mm8(i, new u76(this, 19));
        }
        ?? obj = new Object();
        while (obj.a + i < str.length() && jqe.t(str.charAt(obj.a + i))) {
            obj.a++;
        }
        if (obj.a < i3) {
            return new mm8(i, new mm7(11, obj, this));
        }
        List list = this.a;
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            Integer num = ((w68) list.get(i4)).a;
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = (obj.a - i3) + 1;
            }
            int i5 = i2 + i;
            x68 a = ((w68) list.get(i4)).a(i, str, b72Var, i5);
            if (a != null) {
                return new mm8(i, new y68(str.subSequence(i, i5).toString(), this, i4, a));
            }
            i4++;
            i = i5;
        }
        return Integer.valueOf(i);
    }

    public final String b() {
        String str;
        List<w68> list = this.a;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (w68 w68Var : list) {
            StringBuilder sb = new StringBuilder();
            Integer num = w68Var.a;
            if (num == null) {
                str = "at least one digit";
            } else {
                str = num + " digits";
            }
            sb.append(str);
            sb.append(" for ");
            sb.append(w68Var.b);
            arrayList.add(sb.toString());
        }
        boolean z = this.c;
        int i = this.b;
        if (z) {
            return "a number with at least " + i + " digits: " + arrayList;
        }
        return "a number with exactly " + i + " digits: " + arrayList;
    }

    public final String toString() {
        return b();
    }
}
