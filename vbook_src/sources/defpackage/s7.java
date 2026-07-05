package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s7  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s7 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;

    public /* synthetic */ s7(aw7 aw7Var, int i) {
        this.a = i;
        this.b = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        ps psVar;
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                jub jubVar = (jub) obj;
                jubVar.getClass();
                aw7Var.setValue(jubVar);
                return pvcVar;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                aw7Var.setValue(bool);
                return pvcVar;
            case 2:
                aw7Var.setValue((sc6) obj);
                return pvcVar;
            case 3:
                Float f = (Float) obj;
                f.getClass();
                aw7Var.setValue(f);
                return pvcVar;
            case 4:
                do6 do6Var = (do6) obj;
                do6Var.getClass();
                aw7Var.setValue(Boolean.TRUE);
                return new rf0(do6Var, aw7Var, 1);
            case 5:
                aw7Var.setValue((sc6) obj);
                return pvcVar;
            case 6:
                ylb ylbVar = (ylb) obj;
                if (ylbVar.c) {
                    psVar = ylbVar.b;
                } else {
                    psVar = ylbVar.a;
                }
                aw7Var.setValue(psVar);
                return pvcVar;
            case 7:
                List list = (List) obj;
                if (aw7Var != null) {
                    aw7Var.setValue(list);
                }
                return pvcVar;
            case 8:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                aw7Var.setValue(bool2);
                return pvcVar;
            case 9:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                aw7Var.setValue(bool3);
                return pvcVar;
            case 10:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                aw7Var.setValue(bool4);
                return pvcVar;
            case 11:
                if (!((Boolean) obj).booleanValue()) {
                    aw7Var.setValue(null);
                }
                return pvcVar;
            case 12:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                aw7Var.setValue(bool5);
                return pvcVar;
            case 13:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                aw7Var.setValue(bool6);
                return pvcVar;
            case 14:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                aw7Var.setValue(bool7);
                return pvcVar;
            case 15:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                aw7Var.setValue(bool8);
                return pvcVar;
            case 16:
                if (!((Boolean) obj).booleanValue()) {
                    aw7Var.setValue(null);
                }
                return pvcVar;
            case 17:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                aw7Var.setValue(bool9);
                return pvcVar;
            case 18:
                String str = (String) obj;
                str.getClass();
                aw7Var.setValue(str);
                return pvcVar;
            case 19:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                aw7Var.setValue(bool10);
                return pvcVar;
            case 20:
                jub jubVar2 = (jub) obj;
                jubVar2.getClass();
                aw7Var.setValue(jubVar2);
                return pvcVar;
            case 21:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                aw7Var.setValue(bool11);
                return pvcVar;
            case 22:
                Boolean bool12 = (Boolean) obj;
                bool12.booleanValue();
                aw7Var.setValue(bool12);
                return pvcVar;
            case 23:
                bzc bzcVar = (bzc) obj;
                bzcVar.getClass();
                aw7Var.setValue(bzcVar);
                return pvcVar;
            case 24:
                hbe.H(aw7Var, ((Boolean) obj).booleanValue());
                return pvcVar;
            case 25:
                aw7Var.setValue((f76) obj);
                return pvcVar;
            case 26:
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
            case 27:
                List list2 = (List) obj;
                list2.getClass();
                aw7Var.setValue(sl1.C0(sl1.G0(sl1.n0((List) aw7Var.getValue(), list2))));
                return pvcVar;
            case 28:
                fvb fvbVar = (fvb) obj;
                fvbVar.getClass();
                aw7Var.setValue(fvbVar);
                return pvcVar;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    aw7Var.setValue(null);
                }
                return pvcVar;
        }
    }
}
