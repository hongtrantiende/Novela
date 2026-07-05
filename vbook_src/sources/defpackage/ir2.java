package defpackage;

import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ir2  reason: default package */
/* loaded from: classes3.dex */
public final class ir2 implements hb3 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ir2(vt4 vt4Var, aw7 aw7Var, aw7 aw7Var2, m82 m82Var) {
        this.c = vt4Var;
        this.b = aw7Var;
        this.d = aw7Var2;
        this.e = m82Var;
    }

    @Override // defpackage.hb3
    public final void a() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                boolean remove = ((Set) obj).remove(obj2);
                if (!((Set) obj3).contains(obj2) && remove) {
                    List list = (List) aw7Var.getValue();
                    if (list instanceof RandomAccess) {
                        int size = list.size() - 1;
                        if (size < 0) {
                            return;
                        }
                        while (true) {
                            int i2 = size - 1;
                            ((kz7) list.get(size)).a.invoke(obj2);
                            if (i2 >= 0) {
                                size = i2;
                            } else {
                                return;
                            }
                        }
                    } else {
                        for (kz7 kz7Var : sl1.p0(list)) {
                            kz7Var.a.invoke(obj2);
                        }
                        return;
                    }
                } else {
                    return;
                }
                break;
            default:
                if (((Boolean) aw7Var.getValue()).booleanValue()) {
                    yi3 yi3Var = (yi3) ((aw7) obj3).getValue();
                    if (yi3Var != null) {
                        z87.v((m82) obj2, null, null, new jj3(yi3Var, null, 0), 3);
                    }
                    if (((Boolean) aw7Var.getValue()).booleanValue()) {
                        ((vt4) obj).invoke();
                    }
                    aw7Var.setValue(Boolean.FALSE);
                    return;
                }
                return;
        }
    }

    public ir2(Set set, Object obj, Set set2, aw7 aw7Var) {
        this.c = set;
        this.e = obj;
        this.d = set2;
        this.b = aw7Var;
    }
}
