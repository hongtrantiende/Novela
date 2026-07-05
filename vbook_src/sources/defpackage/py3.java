package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: py3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class py3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pf9 b;

    public /* synthetic */ py3(pf9 pf9Var, int i) {
        this.a = i;
        this.b = pf9Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pf9 pf9Var = this.b;
        ph phVar = (ph) obj;
        phVar.getClass();
        switch (i) {
            case 0:
                ArrayList arrayList = new ArrayList();
                while (((Boolean) phVar.e().b).booleanValue()) {
                    arrayList.add(pf9Var.a.invoke(phVar));
                }
                return new tf9(arrayList);
            case 1:
                if (!((Boolean) phVar.e().b).booleanValue()) {
                    return new tf9(null);
                }
                Object invoke = pf9Var.a.invoke(phVar);
                if (!((Boolean) phVar.e().b).booleanValue()) {
                    return new tf9(invoke);
                }
                cy7.c(pf9Var, "ResultSet returned more than 1 row for ");
                return null;
            case 2:
                tf9 e = phVar.e();
                ArrayList arrayList2 = new ArrayList();
                pf9 pf9Var2 = this.b;
                if (((Boolean) e.b).booleanValue()) {
                    arrayList2.add(pf9Var2.a.invoke(phVar));
                    while (((Boolean) phVar.e().b).booleanValue()) {
                        arrayList2.add(pf9Var2.a.invoke(phVar));
                    }
                    return new tf9(arrayList2);
                }
                return new tf9(arrayList2);
            default:
                tf9 e2 = phVar.e();
                pf9 pf9Var3 = this.b;
                if (!((Boolean) e2.b).booleanValue()) {
                    return new tf9(null);
                }
                Object invoke2 = pf9Var3.a.invoke(phVar);
                if (!((Boolean) phVar.e().b).booleanValue()) {
                    return new tf9(invoke2);
                }
                cy7.c(pf9Var3, "ResultSet returned more than 1 row for ");
                return null;
        }
    }
}
