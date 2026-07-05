package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fx4  reason: default package */
/* loaded from: classes3.dex */
public final class fx4 implements PointerInputEventHandler {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ zl9 b;
    public final /* synthetic */ zg4 c;

    public fx4(zg4 zg4Var, zl9 zl9Var) {
        this.c = zg4Var;
        this.b = zl9Var;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                Object p = k27.p(new l(d19Var, this.c, this.b, (m42) null, 26), m42Var);
                if (p == n82Var) {
                    return p;
                }
                return pvcVar;
            default:
                Object h = yae.h(d19Var, new d(this.b, this.c, null, 2), m42Var);
                if (h == n82Var) {
                    return h;
                }
                return pvcVar;
        }
    }

    public fx4(zl9 zl9Var, zg4 zg4Var) {
        this.b = zl9Var;
        this.c = zg4Var;
    }
}
