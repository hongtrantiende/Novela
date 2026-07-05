package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qk  reason: default package */
/* loaded from: classes.dex */
public final class qk implements b37 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ qk(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        ArrayList arrayList;
        int i;
        int i2;
        yk8 yk8Var;
        int i3 = this.a;
        ls3 ls3Var = ls3.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                ((i29) obj).setParentLayoutDirection((tc6) obj2);
                return e37Var.q0(0, 0, ls3Var, kg.D);
            default:
                ArrayList arrayList2 = new ArrayList(list.size());
                int size = list.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj3 = list.get(i4);
                    if (!(((w27) obj3).S() instanceof gxb)) {
                        arrayList2.add(obj3);
                    }
                }
                List list2 = (List) ((vt4) obj2).invoke();
                if (list2 != null) {
                    ArrayList arrayList3 = new ArrayList(list2.size());
                    int size2 = list2.size();
                    int i5 = 0;
                    while (i5 < size2) {
                        rk9 rk9Var = (rk9) list2.get(i5);
                        if (rk9Var != null) {
                            float f = rk9Var.b;
                            float f2 = rk9Var.a;
                            i = size2;
                            i2 = i5;
                            mw8 M = ((w27) arrayList2.get(i5)).M(y02.b(0, (int) Math.floor(rk9Var.c - f2), 0, (int) Math.floor(rk9Var.d - f), 5));
                            int round = Math.round(f2);
                            yk8Var = new yk8(M, new py5((Math.round(f) & 4294967295L) | (round << 32)));
                        } else {
                            i = size2;
                            i2 = i5;
                            yk8Var = null;
                        }
                        if (yk8Var != null) {
                            arrayList3.add(yk8Var);
                        }
                        i5 = i2 + 1;
                        size2 = i;
                    }
                    arrayList = arrayList3;
                } else {
                    arrayList = null;
                }
                ArrayList arrayList4 = new ArrayList(list.size());
                int size3 = list.size();
                for (int i6 = 0; i6 < size3; i6++) {
                    Object obj4 = list.get(i6);
                    if (((w27) obj4).S() instanceof gxb) {
                        arrayList4.add(obj4);
                    }
                }
                return e37Var.q0(x02.i(j), x02.h(j), ls3Var, new cn9(27, arrayList, qye.h(arrayList4, (vt4) obj)));
        }
    }
}
