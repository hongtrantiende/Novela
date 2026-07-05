package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d1c  reason: default package */
/* loaded from: classes3.dex */
public final class d1c implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ d1c(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                c5d c5dVar = new c5d();
                dm8 dm8Var = (dm8) obj2;
                return mi3.h(d19Var, new zub(c5dVar, 1), new xw0((Object) c5dVar, (Object) ((t2c) obj3), (Object) dm8Var, (Object) ((dm8) obj), 20), new t71(dm8Var, 4), new f58(21, c5dVar, dm8Var), m42Var);
            case 1:
                if (((cyb) obj3).d() == p7a.a) {
                    h2a h2aVar = (h2a) obj;
                    Object p = k27.p(new lc9(d19Var, (rk9) obj2, new y82(h2aVar, 3), new y82(h2aVar, 4), new ik8(h2aVar, 2), null, 10), m42Var);
                    if (p == n82Var) {
                        return p;
                    }
                    return pvcVar;
                }
                return pvcVar;
            default:
                Object p2 = k27.p(new dv0(d19Var, (atd) obj3, (aw7) obj2, (aw7) obj, null, 5), m42Var);
                if (p2 == n82Var) {
                    return p2;
                }
                return pvcVar;
        }
    }
}
