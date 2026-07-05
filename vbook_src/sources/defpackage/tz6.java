package defpackage;

import com.google.mlkit.nl.languageid.IdentifiedLanguage;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tz6  reason: default package */
/* loaded from: classes.dex */
public final class tz6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ f61 b;

    public /* synthetic */ tz6(f61 f61Var, int i) {
        this.a = i;
        this.b = f61Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        cl5 cl5Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        f61 f61Var = this.b;
        switch (i) {
            case 0:
                List<IdentifiedLanguage> list = (List) obj;
                list.getClass();
                ArrayList arrayList = new ArrayList();
                for (IdentifiedLanguage identifiedLanguage : list) {
                    if (!c16.i(identifiedLanguage.a, "und")) {
                        String str = identifiedLanguage.a;
                        str.getClass();
                        cl5Var = new cl5(str, identifiedLanguage.b);
                    } else {
                        cl5Var = null;
                    }
                    if (cl5Var != null) {
                        arrayList.add(cl5Var);
                    }
                }
                f61Var.resumeWith(arrayList);
                return pvcVar;
            default:
                Throwable th = (Throwable) obj;
                f61Var.resumeWith(pvcVar);
                return pvcVar;
        }
    }
}
