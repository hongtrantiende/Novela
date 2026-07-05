package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ygb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ygb implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vhb b;

    public /* synthetic */ ygb(vhb vhbVar, int i) {
        this.a = i;
        this.b = vhbVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vhb vhbVar = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    hk1 a = jdd.a(vhbVar);
                    sw2 sw2Var = ab3.a;
                    vhbVar.f(a, ru2.c, new koa(vhbVar, list, null, 11));
                }
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                hk1 a2 = jdd.a(vhbVar);
                sw2 sw2Var2 = ab3.a;
                vhbVar.f(a2, ru2.c, new uhb(vhbVar, str, null, 1));
                return pvcVar;
            case 2:
                List list2 = (List) obj;
                list2.getClass();
                hk1 a3 = jdd.a(vhbVar);
                sw2 sw2Var3 = ab3.a;
                vhbVar.f(a3, ru2.c, new iz7(vhbVar, list2, null, 11));
                return pvcVar;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                hk1 a4 = jdd.a(vhbVar);
                sw2 sw2Var4 = ab3.a;
                vhbVar.f(a4, ru2.c, new thb(vhbVar, booleanValue, null, 1));
                return pvcVar;
            case 4:
                doa doaVar = (doa) obj;
                doaVar.getClass();
                String str2 = doaVar.a;
                str2.getClass();
                hk1 a5 = jdd.a(vhbVar);
                sw2 sw2Var5 = ab3.a;
                vhbVar.f(a5, ru2.c, new uhb(vhbVar, str2, null, 2));
                return pvcVar;
            case 5:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                hk1 a6 = jdd.a(vhbVar);
                sw2 sw2Var6 = ab3.a;
                vhbVar.f(a6, ru2.c, new thb(vhbVar, booleanValue2, null, 4));
                return pvcVar;
            case 6:
                int intValue = ((Integer) obj).intValue();
                hk1 a7 = jdd.a(vhbVar);
                sw2 sw2Var7 = ab3.a;
                vhbVar.f(a7, ru2.c, new shb(vhbVar, intValue, (m42) null));
                return pvcVar;
            case 7:
                hk1 a8 = jdd.a(vhbVar);
                sw2 sw2Var8 = ab3.a;
                vhbVar.f(a8, ru2.c, new thb(vhbVar, !((Boolean) obj).booleanValue(), null, 0));
                return pvcVar;
            case 8:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                hk1 a9 = jdd.a(vhbVar);
                sw2 sw2Var9 = ab3.a;
                vhbVar.f(a9, ru2.c, new thb(vhbVar, booleanValue3, null, 2));
                return pvcVar;
            default:
                hk1 a10 = jdd.a(vhbVar);
                sw2 sw2Var10 = ab3.a;
                vhbVar.f(a10, ru2.c, new thb(vhbVar, !((Boolean) obj).booleanValue(), null, 3));
                return pvcVar;
        }
    }
}
