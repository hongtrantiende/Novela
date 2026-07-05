package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b37  reason: default package */
/* loaded from: classes.dex */
public interface b37 {
    default int a(u06 u06Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new qu2((w27) list.get(i2), v06.b, z06.a, 0));
        }
        return e(new i16(u06Var, u06Var.getLayoutDirection()), arrayList, y02.b(0, 0, 0, i, 7)).e();
    }

    c37 e(e37 e37Var, List list, long j);

    default int f(u06 u06Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new qu2((w27) list.get(i2), v06.a, z06.a, 0));
        }
        return e(new i16(u06Var, u06Var.getLayoutDirection()), arrayList, y02.b(0, 0, 0, i, 7)).e();
    }

    default int g(u06 u06Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new qu2((w27) list.get(i2), v06.b, z06.b, 0));
        }
        return e(new i16(u06Var, u06Var.getLayoutDirection()), arrayList, y02.b(0, i, 0, 0, 13)).d();
    }

    default int i(u06 u06Var, List list, int i) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(new qu2((w27) list.get(i2), v06.a, z06.b, 0));
        }
        return e(new i16(u06Var, u06Var.getLayoutDirection()), arrayList, y02.b(0, i, 0, 0, 13)).d();
    }
}
