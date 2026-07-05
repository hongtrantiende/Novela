package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zn3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class zn3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;

    public /* synthetic */ zn3(aw7 aw7Var, int i) {
        this.a = i;
        this.b = aw7Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.b;
        switch (i) {
            case 0:
                String str = (String) obj;
                str.getClass();
                aw7Var.setValue(str);
                return pvcVar;
            case 1:
                String str2 = (String) obj;
                str2.getClass();
                aw7Var.setValue(str2);
                return pvcVar;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                aw7Var.setValue(bool);
                return pvcVar;
            case 3:
                String str3 = (String) obj;
                str3.getClass();
                aw7Var.setValue(str3);
                return pvcVar;
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                aw7Var.setValue(bool2);
                return pvcVar;
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                aw7Var.setValue(bool3);
                return pvcVar;
            case 6:
                aw7Var.setValue((f76) obj);
                return pvcVar;
            case 7:
                String str4 = (String) obj;
                str4.getClass();
                aw7Var.setValue(str4);
                return pvcVar;
            case 8:
                String str5 = (String) obj;
                str5.getClass();
                aw7Var.setValue(str5);
                return pvcVar;
            case 9:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                aw7Var.setValue(bool4);
                return pvcVar;
            case 10:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                aw7Var.setValue(bool5);
                return pvcVar;
            case 11:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                aw7Var.setValue(bool6);
                return pvcVar;
            case 12:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                aw7Var.setValue(bool7);
                return pvcVar;
            case 13:
                String str6 = (String) obj;
                str6.getClass();
                aw7Var.setValue(str6);
                return pvcVar;
            case 14:
                String str7 = (String) obj;
                str7.getClass();
                aw7Var.setValue(str7);
                return pvcVar;
            case 15:
                String str8 = (String) obj;
                str8.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str8.length();
                while (i2 < length) {
                    char charAt = str8.charAt(i2);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                    i2++;
                }
                aw7Var.setValue(sb.toString());
                return pvcVar;
            case 16:
                String str9 = (String) obj;
                str9.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str9.length();
                while (i2 < length2) {
                    char charAt2 = str9.charAt(i2);
                    if (Character.isDigit(charAt2)) {
                        sb2.append(charAt2);
                    }
                    i2++;
                }
                aw7Var.setValue(sb2.toString());
                return pvcVar;
            case 17:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                aw7Var.setValue(bool8);
                return pvcVar;
            case 18:
                ((Boolean) obj).getClass();
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 19:
                String str10 = (String) obj;
                str10.getClass();
                aw7Var.setValue(str10);
                return pvcVar;
            case 20:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                aw7Var.setValue(bool9);
                return pvcVar;
            case 21:
                Boolean bool10 = (Boolean) obj;
                bool10.booleanValue();
                aw7Var.setValue(bool10);
                return pvcVar;
            case 22:
                jub jubVar = (jub) obj;
                jubVar.getClass();
                aw7Var.setValue(jubVar);
                return pvcVar;
            case 23:
                Boolean bool11 = (Boolean) obj;
                bool11.booleanValue();
                aw7Var.setValue(bool11);
                return pvcVar;
            case 24:
                aw7Var.setValue((f76) obj);
                return pvcVar;
            case 25:
                String str11 = (String) obj;
                str11.getClass();
                aw7Var.setValue(str11);
                return pvcVar;
            case 26:
                String str12 = (String) obj;
                str12.getClass();
                aw7Var.setValue(str12);
                return pvcVar;
            case 27:
                bx8 bx8Var = (bx8) obj;
                if (bx8Var != null) {
                    ((xt4) aw7Var.getValue()).invoke(new hh8(bx8Var, 1));
                } else {
                    ((xt4) aw7Var.getValue()).invoke(null);
                }
                return pvcVar;
            case 28:
                List<bx8> list = (List) obj;
                if (list != null) {
                    xt4 xt4Var = (xt4) aw7Var.getValue();
                    ArrayList arrayList = new ArrayList(tl1.s(list, 10));
                    for (bx8 bx8Var2 : list) {
                        arrayList.add(new hh8(bx8Var2, 1));
                    }
                    xt4Var.invoke(arrayList);
                } else {
                    ((xt4) aw7Var.getValue()).invoke(ks3.a);
                }
                return pvcVar;
            default:
                Float f = (Float) obj;
                f.getClass();
                aw7Var.setValue(f);
                return pvcVar;
        }
    }
}
