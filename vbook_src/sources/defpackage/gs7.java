package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gs7  reason: default package */
/* loaded from: classes.dex */
public final class gs7 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ is7 b;

    public /* synthetic */ gs7(is7 is7Var, int i) {
        this.a = i;
        this.b = is7Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        is7 is7Var = this.b;
        switch (i) {
            case 0:
                Object H1 = ((hab) d19Var).H1(new fs7(is7Var, null, 0), m42Var);
                if (H1 == n82Var) {
                    return H1;
                }
                return pvcVar;
            default:
                Object H12 = ((hab) d19Var).H1(new fs7(is7Var, null, 1), m42Var);
                if (H12 == n82Var) {
                    return H12;
                }
                return pvcVar;
        }
    }
}
