package defpackage;

import android.content.Context;
import java.io.File;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u0c  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class u0c implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;

    public /* synthetic */ u0c(int i, xt4 xt4Var) {
        this.a = i;
        this.b = xt4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                xt4Var.invoke(Float.valueOf(((Integer) obj).intValue() / 100.0f));
                return pvcVar;
            case 1:
                xt4Var.invoke(Float.valueOf(((Integer) obj).intValue() / 100.0f));
                return pvcVar;
            case 2:
                String str = (String) obj;
                str.getClass();
                xt4Var.invoke(str);
                return pvcVar;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                xt4Var.invoke(str2);
                return pvcVar;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                xt4Var.invoke(str3);
                return pvcVar;
            case 5:
                f76 f76Var = (f76) obj;
                if (f76Var != null) {
                    xt4Var.invoke(f76Var);
                }
                return pvcVar;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                xt4Var.invoke(bool);
                return pvcVar;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                xt4Var.invoke(bool2);
                return pvcVar;
            case 8:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                xt4Var.invoke(bool3);
                return pvcVar;
            case 9:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                xt4Var.invoke(bool4);
                return pvcVar;
            case 10:
                Integer num = (Integer) obj;
                num.intValue();
                xt4Var.invoke(num);
                return pvcVar;
            case 11:
                c6c c6cVar = (c6c) obj;
                c6cVar.getClass();
                xt4Var.invoke(c6cVar);
                return pvcVar;
            case 12:
                Integer num2 = (Integer) obj;
                num2.intValue();
                xt4Var.invoke(num2);
                return pvcVar;
            case 13:
                Float f = (Float) obj;
                f.floatValue();
                xt4Var.invoke(f);
                return pvcVar;
            case 14:
                List list = (List) obj;
                list.getClass();
                xt4Var.invoke(list);
                return pvcVar;
            default:
                Context context = (Context) obj;
                context.getClass();
                File file = (File) xt4Var.invoke(context);
                file.getClass();
                String absolutePath = file.getAbsolutePath();
                absolutePath.getClass();
                return new yh(d6d.b(absolutePath)).k();
        }
    }
}
