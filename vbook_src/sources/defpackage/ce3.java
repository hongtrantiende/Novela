package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ce3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ce3 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ie3 b;

    public /* synthetic */ ce3(ie3 ie3Var, int i) {
        this.a = i;
        this.b = ie3Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ie3 ie3Var = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                hk1 a = jdd.a(ie3Var);
                sw2 sw2Var = ab3.a;
                ie3Var.f(a, ru2.c, new d53((Object) ie3Var, (Object) list, (m42) null, 4));
                return pvcVar;
            default:
                f76 f76Var = (f76) obj;
                if (f76Var != null) {
                    hk1 a2 = jdd.a(ie3Var);
                    sw2 sw2Var2 = ab3.a;
                    ie3Var.f(a2, ru2.c, new uw2(ie3Var, f76Var, (m42) null, 6));
                }
                return pvcVar;
        }
    }
}
