package defpackage;

import java.util.Comparator;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oo1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oo1 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oo1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        xt4[] xt4VarArr;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((Number) ((c8) obj3).invoke(obj, obj2)).intValue();
            case 1:
                for (xt4 xt4Var : (xt4[]) obj3) {
                    int j = hxe.j((Comparable) xt4Var.invoke(obj), (Comparable) xt4Var.invoke(obj2));
                    if (j != 0) {
                        return j;
                    }
                }
                return 0;
            case 2:
                return ((Number) ((pg2) obj3).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((j35) obj3).invoke(obj, obj2)).intValue();
            case 4:
                n47 n47Var = (n47) obj3;
                return n47Var.c(obj2) - n47Var.c(obj);
            case 5:
                return ((Number) ((el7) obj3).invoke(obj, obj2)).intValue();
            case 6:
                return ((Number) ((lu4) obj3).invoke(obj, obj2)).intValue();
            default:
                return ((Number) ((tsa) obj3).invoke(obj, obj2)).intValue();
        }
    }
}
