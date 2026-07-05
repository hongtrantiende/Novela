package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n6a  reason: default package */
/* loaded from: classes.dex */
public final class n6a implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ npb b;

    public /* synthetic */ n6a(npb npbVar, int i) {
        this.a = i;
        this.b = npbVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        npb npbVar = this.b;
        switch (i) {
            case 0:
                Object k = uwe.k(d19Var, npbVar, m42Var);
                if (k == n82Var) {
                    return k;
                }
                return pvcVar;
            default:
                Object k2 = uwe.k(d19Var, npbVar, m42Var);
                if (k2 == n82Var) {
                    return k2;
                }
                return pvcVar;
        }
    }
}
