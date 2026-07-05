package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p84  reason: default package */
/* loaded from: classes3.dex */
public final class p84 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ v84 b;

    public /* synthetic */ p84(v84 v84Var, int i) {
        this.a = i;
        this.b = v84Var;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        v84 v84Var = this.b;
        switch (i) {
            case 0:
                v84 v84Var2 = this.b;
                hk1 a = jdd.a(v84Var2);
                sw2 sw2Var = ab3.a;
                v84Var2.f(a, ru2.c, new da(9, (m42) null, (Object) ((List) obj), (Object) v84Var2, false));
                return pvcVar;
            case 1:
                v84Var.E = (List) obj;
                return v84.k(v84Var, m42Var);
            default:
                Object[] objArr = (Object[]) obj;
                Object obj2 = objArr[0];
                Object obj3 = objArr[1];
                Object obj4 = objArr[2];
                boolean booleanValue = ((Boolean) objArr[3]).booleanValue();
                List list = (List) obj4;
                List list2 = (List) obj3;
                List list3 = (List) obj2;
                cza czaVar = v84Var.f;
                if (czaVar != null) {
                    while (true) {
                        Object value = czaVar.getValue();
                        List list4 = list3;
                        if (!czaVar.l(value, l84.a((l84) value, false, booleanValue, sl1.H0(list2), null, sl1.H0(list), null, sl1.H0(list3), null, null, null, null, null, 4009))) {
                            list3 = list4;
                        }
                    }
                }
                Object k = v84.k(v84Var, m42Var);
                if (k == n82.a) {
                    return k;
                }
                return pvcVar;
        }
    }
}
