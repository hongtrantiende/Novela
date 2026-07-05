package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j25  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j25 implements ou4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j25(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj6 = this.b;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj).intValue();
                int[] iArr = (int[]) obj2;
                r13 r13Var = (r13) obj4;
                int[] iArr2 = (int[]) obj5;
                iArr.getClass();
                ((tc6) obj3).getClass();
                r13Var.getClass();
                iArr2.getClass();
                ((jz) obj6).k(r13Var, intValue, iArr, iArr2);
                return pvcVar;
            case 1:
                int intValue2 = ((Integer) obj).intValue();
                int[] iArr3 = (int[]) obj2;
                tc6 tc6Var = (tc6) obj3;
                r13 r13Var2 = (r13) obj4;
                int[] iArr4 = (int[]) obj5;
                iArr3.getClass();
                tc6Var.getClass();
                r13Var2.getClass();
                iArr4.getClass();
                ((gz) obj6).f(r13Var2, intValue2, iArr3, tc6Var, iArr4);
                return pvcVar;
            case 2:
                web webVar = (web) obj6;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                boolean booleanValue3 = ((Boolean) obj3).booleanValue();
                boolean booleanValue4 = ((Boolean) obj4).booleanValue();
                boolean booleanValue5 = ((Boolean) obj5).booleanValue();
                hk1 a = jdd.a(webVar);
                sw2 sw2Var = ab3.a;
                webVar.f(a, ru2.c, new teb(webVar, booleanValue, booleanValue2, booleanValue3, booleanValue4, booleanValue5, null));
                return pvcVar;
            default:
                lsd lsdVar = (lsd) obj6;
                float floatValue = ((Float) obj3).floatValue();
                float floatValue2 = ((Float) obj4).floatValue();
                int intValue3 = ((Integer) obj5).intValue();
                z87.v(lsdVar.v1(), null, null, new isd(lsdVar, intValue3, (y78) obj2, floatValue, (y78) obj, floatValue2, null), 3);
                return pvcVar;
        }
    }
}
