package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hr2  reason: default package */
/* loaded from: classes3.dex */
public final class hr2 implements hb3 {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Set b;
    public final /* synthetic */ Set c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;

    public hr2(Object obj, Set set, Set set2, aw7 aw7Var, aw7 aw7Var2) {
        this.a = obj;
        this.b = set;
        this.c = set2;
        this.d = aw7Var;
        this.e = aw7Var2;
    }

    @Override // defpackage.hb3
    public final void a() {
        ArrayList arrayList;
        List<jz7> list = (List) this.d.getValue();
        boolean z = false;
        if (list instanceof RandomAccess) {
            arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((jz7) list.get(i)).b);
            }
        } else {
            arrayList = new ArrayList(tl1.s(list, 10));
            for (jz7 jz7Var : list) {
                arrayList.add(jz7Var.b);
            }
        }
        Object obj = this.a;
        if (!arrayList.contains(obj)) {
            z = this.b.remove(obj);
        }
        if (z && !this.c.contains(obj)) {
            List list2 = (List) this.e.getValue();
            if (list2 instanceof RandomAccess) {
                int size2 = list2.size() - 1;
                if (size2 < 0) {
                    return;
                }
                while (true) {
                    int i2 = size2 - 1;
                    ((kz7) list2.get(size2)).a.invoke(obj);
                    if (i2 >= 0) {
                        size2 = i2;
                    } else {
                        return;
                    }
                }
            } else {
                for (kz7 kz7Var : sl1.p0(list2)) {
                    kz7Var.a.invoke(obj);
                }
            }
        }
    }
}
