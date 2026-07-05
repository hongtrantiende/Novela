package defpackage;

import java.util.Collection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y83  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class y83 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h93 b;

    public /* synthetic */ y83(h93 h93Var, int i) {
        this.a = i;
        this.b = h93Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        h93 h93Var = this.b;
        switch (i) {
            case 0:
                w26 w26Var = h93Var.f0;
                if (w26Var != null) {
                    w26Var.cancel(null);
                }
                hk1 a = jdd.a(h93Var);
                sw2 sw2Var = ab3.a;
                h93Var.f0 = h93Var.f(a, ru2.c, new d93(h93Var, null, 3));
                return pvcVar;
            case 1:
                if (!h93Var.Z && h93Var.a0) {
                    hk1 a2 = jdd.a(h93Var);
                    sw2 sw2Var2 = ab3.a;
                    h93Var.f0 = h93Var.f(a2, ru2.c, new d93(h93Var, null, 1));
                }
                return pvcVar;
            default:
                Collection values = h93Var.b0.values();
                values.getClass();
                return sl1.i0(sl1.v0(values, 5), " ", null, null, new u83(1), 30);
        }
    }
}
