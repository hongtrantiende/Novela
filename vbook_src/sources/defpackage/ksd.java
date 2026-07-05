package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ksd  reason: default package */
/* loaded from: classes.dex */
public final class ksd implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ lsd b;

    public /* synthetic */ ksd(lsd lsdVar, int i) {
        this.a = i;
        this.b = lsdVar;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        n82 n82Var = n82.a;
        lsd lsdVar = this.b;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                Object h = yae.h(d19Var, new x29(new fsd(lsdVar, 0), new j25(lsdVar, 3), new gsd(lsdVar, 0), null), m42Var);
                if (h != n82Var) {
                    h = pvcVar;
                }
                if (h == n82Var) {
                    return h;
                }
                return pvcVar;
            default:
                gsd gsdVar = new gsd(lsdVar, 1);
                gsd gsdVar2 = new gsd(lsdVar, 2);
                Object p = k27.p(new xr0(d19Var, new fsd(lsdVar, 1), new gsd(lsdVar, 3), gsdVar, gsdVar2, new gsd(lsdVar, 4), (m42) null, 15), m42Var);
                if (p != n82Var) {
                    p = pvcVar;
                }
                if (p == n82Var) {
                    return p;
                }
                return pvcVar;
        }
    }
}
