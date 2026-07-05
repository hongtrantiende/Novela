package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yw2  reason: default package */
/* loaded from: classes.dex */
public final class yw2 implements PointerInputEventHandler {
    public static final yw2 b = new yw2(0);
    public static final yw2 c = new yw2(1);
    public static final yw2 d = new yw2(2);
    public static final yw2 e = new yw2(3);
    public final /* synthetic */ int a;

    public /* synthetic */ yw2(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
            case 1:
                return pvcVar;
            case 2:
                return ukb.e(d19Var, null, null, null, new vb6(13), m42Var, 7);
            default:
                return pvcVar;
        }
    }
}
