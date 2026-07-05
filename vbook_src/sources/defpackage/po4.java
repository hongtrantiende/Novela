package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: po4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class po4 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ uo4 b;

    public /* synthetic */ po4(uo4 uo4Var, int i) {
        this.a = i;
        this.b = uo4Var;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        uo4 uo4Var = this.b;
        switch (i) {
            case 0:
                List list = (List) obj;
                list.getClass();
                if (!list.isEmpty()) {
                    fdd.g(uo4Var, jdd.a(uo4Var), new r9(list, uo4Var, null, 13));
                }
                return pvcVar;
            case 1:
                String str = (String) obj;
                str.getClass();
                hk1 a = jdd.a(uo4Var);
                sw2 sw2Var = ab3.a;
                uo4Var.f(a, ru2.c, new uw2(uo4Var, str, (m42) null, 29));
                return pvcVar;
            default:
                String str2 = (String) obj;
                str2.getClass();
                hk1 a2 = jdd.a(uo4Var);
                sw2 sw2Var2 = ab3.a;
                uo4Var.f(a2, ru2.c, new d53((fdd) uo4Var, (Object) str2, (m42) null, 22));
                return pvcVar;
        }
    }
}
