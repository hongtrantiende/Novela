package defpackage;

import java.util.Collection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j93  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class j93 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ br6 b;

    public /* synthetic */ j93(br6 br6Var, int i) {
        this.a = i;
        this.b = br6Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        br6 br6Var = this.b;
        switch (i) {
            case 0:
                br6Var.E();
                return pvcVar;
            case 1:
                if (!br6Var.Z && br6Var.a0) {
                    hk1 a = jdd.a(br6Var);
                    sw2 sw2Var = ab3.a;
                    br6Var.f(a, ru2.c, new yq6(br6Var, null, 1));
                }
                return pvcVar;
            case 2:
                br6Var.E();
                return pvcVar;
            case 3:
                if (!br6Var.Z && br6Var.a0) {
                    hk1 a2 = jdd.a(br6Var);
                    sw2 sw2Var2 = ab3.a;
                    br6Var.f(a2, ru2.c, new yq6(br6Var, null, 1));
                }
                return pvcVar;
            default:
                Collection values = br6Var.b0.values();
                values.getClass();
                return sl1.i0(sl1.v0(values, 5), " ", null, null, new vb6(22), 30);
        }
    }
}
