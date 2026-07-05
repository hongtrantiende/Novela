package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w42  reason: default package */
/* loaded from: classes.dex */
public final class w42 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w42(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Object p = k27.p(new l(d19Var, (a52) obj2, (xt4) obj, (m42) null, 15), m42Var);
                if (p == n82Var) {
                    return p;
                }
                return pvcVar;
            case 1:
                Object p2 = k27.p(new ca(d19Var, (npb) obj2, (gtb) obj, null, 3), m42Var);
                if (p2 == n82Var) {
                    return p2;
                }
                return pvcVar;
            case 2:
                Object h = yae.h(d19Var, new d((f7a) obj2, (j6a) obj, null, 6), m42Var);
                if (h == n82Var) {
                    return h;
                }
                return pvcVar;
            default:
                Object p3 = k27.p(new jk8(d19Var, (yu7) obj2, (wpa) obj, null, 23), m42Var);
                if (p3 == n82Var) {
                    return p3;
                }
                return pvcVar;
        }
    }
}
