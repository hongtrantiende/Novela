package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi  reason: default package */
/* loaded from: classes3.dex */
public final class vi implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vi(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Object h = yae.h(d19Var, new ui((wi) obj, null, 0), m42Var);
                if (h == n82Var) {
                    return h;
                }
                return pvcVar;
            case 1:
                ja0 ja0Var = (ja0) obj;
                if (ja0Var.b.j().p == ff8.a) {
                    return mi3.i(d19Var, new ca0(ja0Var, 0), new z90(ja0Var, 4), new z90(ja0Var, 5), new da0(ja0Var, 0), m42Var);
                }
                ca0 ca0Var = new ca0(ja0Var, 1);
                z90 z90Var = new z90(ja0Var, 6);
                z90 z90Var2 = new z90(ja0Var, 7);
                da0 da0Var = new da0(ja0Var, 1);
                float f = mi3.a;
                Object h2 = yae.h(d19Var, new ei3(ca0Var, da0Var, z90Var, z90Var2, (m42) null, 1), m42Var);
                if (h2 == n82Var) {
                    return h2;
                }
                return pvcVar;
            case 2:
                ef2 ef2Var = (ef2) obj;
                ft0 ft0Var = new ft0(ef2Var, 3);
                ft0 ft0Var2 = new ft0(ef2Var, 4);
                return yae.h(d19Var, new oab(ft0Var, new ah7(19, ef2Var, d19Var), new ct0(ef2Var, 4), ft0Var2, null), m42Var);
            case 3:
                oz5 oz5Var = (oz5) obj;
                h01 h01Var = new h01(oz5Var, 2);
                h01 h01Var2 = new h01(oz5Var, 3);
                return yae.h(d19Var, new oab(h01Var, new sj(oz5Var, 22), new t42(oz5Var, 28), h01Var2, null), m42Var);
            case 4:
                Object p = k27.p(new c95(d19Var, (rj8) obj, (m42) null, 13), m42Var);
                if (p == n82Var) {
                    return p;
                }
                return pvcVar;
            case 5:
                return yae.h(d19Var, new ui((np6) obj, null, 1), m42Var);
            case 6:
                Object H1 = ((hab) d19Var).H1(new d((aw7) obj, null, 4), m42Var);
                if (H1 == n82Var) {
                    return H1;
                }
                return pvcVar;
            case 7:
                Object h3 = yae.h(d19Var, new bkc(false, new zd1((ro3) obj, 6), null), m42Var);
                if (h3 == n82Var) {
                    return h3;
                }
                return pvcVar;
            case 8:
                return yae.h(d19Var, new ui((lu4) obj, null, 2), m42Var);
            case 9:
                k7a k7aVar = (k7a) obj;
                Object j = jye.j(d19Var, k7aVar.R, k7aVar.Q, m42Var);
                if (j == n82Var) {
                    return j;
                }
                return pvcVar;
            case 10:
                return ukb.e(d19Var, null, null, null, new ux9((vi1) obj, 19), m42Var, 7);
            case 11:
                Object h4 = yae.h(d19Var, new gm0((d6b) obj, null, 5), m42Var);
                if (h4 == n82Var) {
                    return h4;
                }
                return pvcVar;
            case 12:
                Object h5 = yae.h(d19Var, new rc(2, null, new mp6(1, (sob) obj, sob.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0, 29)), m42Var);
                if (h5 != n82Var) {
                    h5 = pvcVar;
                }
                if (h5 == n82Var) {
                    return h5;
                }
                return pvcVar;
            case 13:
                Object p2 = k27.p(new ol((trb) obj, d19Var, (m42) null, 23), m42Var);
                if (p2 == n82Var) {
                    return p2;
                }
                return pvcVar;
            default:
                gtb gtbVar = (gtb) obj;
                Object j2 = jye.j(d19Var, gtbVar.A, gtbVar.z, m42Var);
                if (j2 == n82Var) {
                    return j2;
                }
                return pvcVar;
        }
    }
}
