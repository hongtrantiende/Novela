package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sc  reason: default package */
/* loaded from: classes.dex */
public final class sc implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt4 b;

    public /* synthetic */ sc(int i, xt4 xt4Var) {
        this.a = i;
        this.b = xt4Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        xt4 xt4Var = this.b;
        switch (i) {
            case 0:
                return yae.h(d19Var, new rc(0, null, xt4Var), m42Var);
            case 1:
                return yae.h(d19Var, new rc(1, null, xt4Var), m42Var);
            default:
                Object H1 = ((hab) d19Var).H1(new rc(3, null, xt4Var), m42Var);
                if (H1 != n82.a) {
                    return pvc.a;
                }
                return H1;
        }
    }
}
