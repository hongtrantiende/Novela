package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g0c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class g0c implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;

    public /* synthetic */ g0c(aw7 aw7Var, int i) {
        this.a = i;
        this.b = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        float f;
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                aw7Var.setValue(bool);
                return pvcVar;
            case 1:
                aw7Var.setValue(new zy5(((zy5) obj).a));
                return pvcVar;
            case 2:
                t15 t15Var = (t15) obj;
                t15Var.getClass();
                if (((Boolean) aw7Var.getValue()).booleanValue()) {
                    f = 0.6f;
                } else {
                    f = 1.0f;
                }
                t15Var.q(f);
                return pvcVar;
            case 3:
                float floatValue = ((Number) ((lq) obj).e()).floatValue();
                tza tzaVar = e1c.a;
                aw7Var.setValue(Float.valueOf(floatValue));
                return pvcVar;
            case 4:
                float floatValue2 = ((Number) ((lq) obj).e()).floatValue();
                tza tzaVar2 = e1c.a;
                aw7Var.setValue(Float.valueOf(floatValue2));
                return pvcVar;
            case 5:
                float floatValue3 = ((Number) ((lq) obj).e()).floatValue();
                tza tzaVar3 = e1c.a;
                aw7Var.setValue(Float.valueOf(floatValue3));
                return pvcVar;
            case 6:
                ((r13) obj).getClass();
                return new y78(((y78) aw7Var.getValue()).a);
            case 7:
                r13 r13Var = (r13) obj;
                r13Var.getClass();
                float intBitsToFloat = Float.intBitsToFloat((int) (((y78) aw7Var.getValue()).a >> 32));
                return new y78((Float.floatToRawIntBits(Float.intBitsToFloat((int) (((y78) aw7Var.getValue()).a & 4294967295L)) - r13Var.L0(80.0f)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32));
            case 8:
                aw7Var.setValue((f76) obj);
                return pvcVar;
            case 9:
                jub jubVar = (jub) obj;
                jubVar.getClass();
                aw7Var.setValue(jubVar);
                return pvcVar;
            case 10:
                if (!((Boolean) obj).booleanValue()) {
                    aw7Var.setValue(null);
                }
                return pvcVar;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                aw7Var.setValue(bool2);
                return pvcVar;
            case 12:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                aw7Var.setValue(bool3);
                return pvcVar;
            case 13:
                aw7Var.setValue((f76) obj);
                return pvcVar;
            case 14:
                if (!((Boolean) obj).booleanValue()) {
                    aw7Var.setValue(null);
                }
                return pvcVar;
            case 15:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                aw7Var.setValue(bool4);
                return pvcVar;
            case 16:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                aw7Var.setValue(bool5);
                return pvcVar;
            case 17:
                List list = (List) obj;
                list.getClass();
                aw7Var.setValue(sl1.n0((List) aw7Var.getValue(), list));
                return pvcVar;
            case 18:
                f76 f76Var = (f76) obj;
                f76Var.getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) aw7Var.getValue()) {
                    if (!c16.i((f76) obj2, f76Var)) {
                        arrayList.add(obj2);
                    }
                }
                aw7Var.setValue(arrayList);
                return pvcVar;
            case 19:
                fvb fvbVar = (fvb) obj;
                fvbVar.getClass();
                aw7Var.setValue(fvbVar);
                return pvcVar;
            case 20:
                String str = (String) obj;
                str.getClass();
                aw7Var.setValue(str);
                return pvcVar;
            case 21:
                String str2 = (String) obj;
                str2.getClass();
                aw7Var.setValue(str2);
                return pvcVar;
            case 22:
                String str3 = (String) obj;
                str3.getClass();
                aw7Var.setValue(str3);
                return pvcVar;
            case 23:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                aw7Var.setValue(bool6);
                return pvcVar;
            case 24:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                aw7Var.setValue(bool7);
                return pvcVar;
            case 25:
                aw7Var.setValue((f76) obj);
                return pvcVar;
            case 26:
                String str4 = (String) obj;
                str4.getClass();
                aw7Var.setValue(str4);
                return pvcVar;
            case 27:
                String str5 = (String) obj;
                str5.getClass();
                aw7Var.setValue(str5);
                return pvcVar;
            case 28:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                aw7Var.setValue(bool8);
                return pvcVar;
            default:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                aw7Var.setValue(bool9);
                return pvcVar;
        }
    }
}
