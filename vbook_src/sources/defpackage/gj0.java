package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gj0  reason: default package */
/* loaded from: classes.dex */
public final class gj0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ ytb b;

    public /* synthetic */ gj0(ytb ytbVar, int i) {
        this.a = i;
        this.b = ytbVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        n82 n82Var = n82.a;
        ytb ytbVar = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                Object p = k27.p(new ol(ytbVar, d19Var, (m42) null, 24), m42Var);
                if (p != n82Var) {
                    p = pvcVar;
                }
                if (p == n82Var) {
                    return p;
                }
                return pvcVar;
            case 1:
                Object p2 = k27.p(new wtb(ytbVar, d19Var, true, null), m42Var);
                if (p2 != n82Var) {
                    p2 = pvcVar;
                }
                if (p2 == n82Var) {
                    return p2;
                }
                return pvcVar;
            default:
                Object p3 = k27.p(new wtb(ytbVar, d19Var, false, null), m42Var);
                if (p3 != n82Var) {
                    p3 = pvcVar;
                }
                if (p3 == n82Var) {
                    return p3;
                }
                return pvcVar;
        }
    }
}
