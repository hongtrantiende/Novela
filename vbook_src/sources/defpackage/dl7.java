package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dl7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class dl7 implements pu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ dl7(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = this.a;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                gia giaVar = (gia) obj7;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                boolean booleanValue2 = ((Boolean) obj4).booleanValue();
                boolean booleanValue3 = ((Boolean) obj5).booleanValue();
                hk1 a = jdd.a(giaVar);
                sw2 sw2Var = ab3.a;
                giaVar.f(a, ru2.c, new x43(giaVar, booleanValue2, (List) obj6, booleanValue3, intValue, intValue2, booleanValue, null, 2));
                return pvc.a;
            default:
                f7a f7aVar = (f7a) obj7;
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                sc6 sc6Var = (sc6) obj2;
                long d = f7aVar.d(sc6Var, ((y78) obj3).a);
                long d2 = f7aVar.d(sc6Var, ((y78) obj4).a);
                f7aVar.n(booleanValue4);
                return Boolean.valueOf(f7aVar.s(d, d2, ((Boolean) obj5).booleanValue(), (h6a) obj6));
        }
    }
}
