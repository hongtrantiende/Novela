package defpackage;

import android.view.KeyEvent;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sg0  reason: default package */
/* loaded from: classes3.dex */
public final class sg0 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sg0(Object obj, aw7 aw7Var, Object obj2, int i) {
        this.a = i;
        this.c = obj;
        this.b = aw7Var;
        this.d = obj2;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.c;
        Object obj3 = this.d;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((g86) obj).a;
                dub dubVar = (dub) obj2;
                keyEvent.getClass();
                if (gae.j(keyEvent) == 2 && e86.a(rae.a(keyEvent.getKeyCode()), e86.y)) {
                    long j = dubVar.d().e;
                    int i2 = fxb.c;
                    int i3 = (int) (j >> 32);
                    boolean d = fxb.d(dubVar.d().e);
                    if (!((Boolean) aw7Var.getValue()).booleanValue() && i3 == 0 && d) {
                        ((vt4) ((aw7) obj3).getValue()).invoke();
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 1:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                List<m32> list = (List) aw7Var.getValue();
                m32 m32Var = (m32) obj3;
                ArrayList arrayList = new ArrayList(tl1.s(list, 10));
                for (m32 m32Var2 : list) {
                    if (c16.i(m32Var2.a, m32Var.a)) {
                        String str = m32Var2.a;
                        String str2 = m32Var2.b;
                        ly lyVar = m32Var2.c;
                        str.getClass();
                        str2.getClass();
                        m32Var2 = new m32(str, str2, lyVar, booleanValue);
                    }
                    arrayList.add(m32Var2);
                }
                aw7Var.setValue(arrayList);
                ((xt4) obj2).invoke((List) aw7Var.getValue());
                return pvcVar;
            case 2:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                List<kd3> list2 = (List) aw7Var.getValue();
                kd3 kd3Var = (kd3) obj3;
                ArrayList arrayList2 = new ArrayList(tl1.s(list2, 10));
                for (kd3 kd3Var2 : list2) {
                    if (c16.i(kd3Var2.a, kd3Var.a)) {
                        kd3Var2 = kd3.a(kd3Var2, null, null, booleanValue2, 7);
                    }
                    arrayList2.add(kd3Var2);
                }
                aw7Var.setValue(arrayList2);
                ((xt4) obj2).invoke((List) aw7Var.getValue());
                return pvcVar;
            default:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                List<orc> list3 = (List) aw7Var.getValue();
                orc orcVar = (orc) obj3;
                ArrayList arrayList3 = new ArrayList(tl1.s(list3, 10));
                for (orc orcVar2 : list3) {
                    if (c16.i(orcVar2.a, orcVar.a)) {
                        orcVar2 = orc.a(orcVar2, booleanValue3, null, null, null, 29);
                    }
                    arrayList3.add(orcVar2);
                }
                aw7Var.setValue(arrayList3);
                ((xt4) obj2).invoke((List) aw7Var.getValue());
                return pvcVar;
        }
    }
}
