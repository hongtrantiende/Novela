package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w33  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class w33 implements pu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ fdd c;

    public /* synthetic */ w33(fdd fddVar, aw7 aw7Var, int i) {
        this.a = i;
        this.c = fddVar;
        this.b = aw7Var;
    }

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.b;
        fdd fddVar = this.c;
        switch (i) {
            case 0:
                i53 i53Var = (i53) fddVar;
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                hk1 a = jdd.a(i53Var);
                sw2 sw2Var = ab3.a;
                i53Var.f(a, ru2.c, new x43(i53Var, ((Boolean) obj4).booleanValue(), ((Boolean) obj5).booleanValue(), (List) obj6, intValue, intValue2, booleanValue, null));
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 1:
                ur5 ur5Var = (ur5) fddVar;
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                boolean booleanValue3 = ((Boolean) obj4).booleanValue();
                boolean booleanValue4 = ((Boolean) obj5).booleanValue();
                aw7Var.setValue(Boolean.FALSE);
                ur5Var.getClass();
                hk1 a2 = jdd.a(ur5Var);
                sw2 sw2Var2 = ab3.a;
                ur5Var.f(a2, ru2.c, new x43(ur5Var, booleanValue3, (List) obj6, booleanValue4, intValue3, intValue4, booleanValue2, null, 1));
                return pvcVar;
            case 2:
                y5c y5cVar = (y5c) fddVar;
                int intValue5 = ((Integer) obj).intValue();
                int intValue6 = ((Integer) obj2).intValue();
                boolean booleanValue5 = ((Boolean) obj3).booleanValue();
                boolean booleanValue6 = ((Boolean) obj4).booleanValue();
                boolean booleanValue7 = ((Boolean) obj5).booleanValue();
                aw7Var.setValue(Boolean.FALSE);
                y5cVar.getClass();
                hk1 a3 = jdd.a(y5cVar);
                sw2 sw2Var3 = ab3.a;
                y5cVar.f(a3, ru2.c, new x43(y5cVar, booleanValue6, (List) obj6, booleanValue7, intValue5, intValue6, booleanValue5, null, 3));
                return pvcVar;
            default:
                ubd ubdVar = (ubd) fddVar;
                int intValue7 = ((Integer) obj).intValue();
                int intValue8 = ((Integer) obj2).intValue();
                boolean booleanValue8 = ((Boolean) obj3).booleanValue();
                boolean booleanValue9 = ((Boolean) obj4).booleanValue();
                boolean booleanValue10 = ((Boolean) obj5).booleanValue();
                aw7Var.setValue(Boolean.FALSE);
                hk1 a4 = jdd.a(ubdVar);
                sw2 sw2Var4 = ab3.a;
                ubdVar.f(a4, ru2.c, new x43(ubdVar, booleanValue9, (List) obj6, booleanValue10, intValue7, intValue8, booleanValue8, null, 4));
                return pvcVar;
        }
    }
}
