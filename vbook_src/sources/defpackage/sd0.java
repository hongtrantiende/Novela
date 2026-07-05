package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sd0  reason: default package */
/* loaded from: classes3.dex */
public final class sd0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sd0(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((sk1) obj).c(((ht1) obj3).c);
                ud0 ud0Var = (ud0) obj2;
                ud0Var.d.getClass();
                ud0Var.e = new u9c(yq7.a());
                ud0Var.c.setValue(Boolean.FALSE);
                ud0Var.a.setValue(ks3.a);
                ud0Var.b.i(0);
                return pvcVar;
            case 1:
                aw7 aw7Var = (aw7) obj3;
                kd3 kd3Var = (kd3) obj2;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : (List) aw7Var.getValue()) {
                    if (!c16.i(((kd3) obj4).a, kd3Var.a)) {
                        arrayList.add(obj4);
                    }
                }
                aw7Var.setValue(arrayList);
                ((xt4) obj).invoke((List) aw7Var.getValue());
                return pvcVar;
            case 2:
                aw7 aw7Var2 = (aw7) obj3;
                mvb mvbVar = (mvb) obj2;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj5 : (List) aw7Var2.getValue()) {
                    if (!c16.i(((mvb) obj5).a, mvbVar.a)) {
                        arrayList2.add(obj5);
                    }
                }
                aw7Var2.setValue(arrayList2);
                ((xt4) obj).invoke((List) aw7Var2.getValue());
                return pvcVar;
            case 3:
                ((xt4) obj).invoke((String) obj3);
                ((vt4) obj2).invoke();
                return pvcVar;
            case 4:
                j48 j48Var = (j48) obj;
                if (!j48Var.d) {
                    t58 t58Var = (t58) obj3;
                    String str = j48Var.a;
                    str.getClass();
                    hk1 a = jdd.a(t58Var);
                    sw2 sw2Var = ab3.a;
                    t58Var.f(a, ru2.c, new z38(t58Var, str, null, 1));
                }
                u48 u48Var = j48Var.c;
                if (u48Var instanceof s48) {
                    jce.A((cz7) obj2, ((s48) u48Var).a);
                }
                return pvcVar;
            case 5:
                aw7 aw7Var3 = (aw7) obj3;
                gc9 gc9Var = (gc9) obj2;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj6 : (List) aw7Var3.getValue()) {
                    if (!c16.i(((gc9) obj6).a, gc9Var.a)) {
                        arrayList3.add(obj6);
                    }
                }
                aw7Var3.setValue(arrayList3);
                ((xt4) obj).invoke((List) aw7Var3.getValue());
                return pvcVar;
            default:
                aw7 aw7Var4 = (aw7) obj3;
                orc orcVar = (orc) obj2;
                ArrayList arrayList4 = new ArrayList();
                for (Object obj7 : (List) aw7Var4.getValue()) {
                    if (!c16.i(((orc) obj7).a, orcVar.a)) {
                        arrayList4.add(obj7);
                    }
                }
                aw7Var4.setValue(arrayList4);
                ((xt4) obj).invoke((List) aw7Var4.getValue());
                return pvcVar;
        }
    }
}
