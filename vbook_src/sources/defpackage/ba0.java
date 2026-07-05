package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ba0  reason: default package */
/* loaded from: classes3.dex */
public final class ba0 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ vt4 b;

    public /* synthetic */ ba0(int i, vt4 vt4Var) {
        this.a = i;
        this.b = vt4Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        switch (this.a) {
            case 0:
                return ukb.e(d19Var, null, null, null, new nv(1, this.b), m42Var, 7);
            case 1:
                return ukb.e(d19Var, null, null, null, new nv(2, this.b), m42Var, 7);
            case 2:
                return ukb.e(d19Var, null, null, null, new nv(3, this.b), m42Var, 7);
            case 3:
                return ukb.e(d19Var, null, null, null, new nv(4, this.b), m42Var, 7);
            default:
                return ukb.e(d19Var, null, null, null, new nv(12, this.b), m42Var, 7);
        }
    }
}
