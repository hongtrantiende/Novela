package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ze1  reason: default package */
/* loaded from: classes3.dex */
public final class ze1 implements PointerInputEventHandler {
    public final /* synthetic */ int a;
    public final /* synthetic */ aw7 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ze1(m82 m82Var, aw7 aw7Var, yu7 yu7Var, aw7 aw7Var2) {
        this.a = 2;
        this.c = m82Var;
        this.b = aw7Var;
        this.d = yu7Var;
        this.e = aw7Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(d19 d19Var, m42 m42Var) {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                final ps psVar = (ps) obj3;
                final vt4 vt4Var = (vt4) obj2;
                final vt4 vt4Var2 = (vt4) obj;
                final aw7 aw7Var = this.b;
                return ukb.e(d19Var, null, null, null, new xt4() { // from class: ye1
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj4) {
                        int i2 = r5;
                        pvc pvcVar = pvc.a;
                        vt4 vt4Var3 = vt4Var2;
                        vt4 vt4Var4 = vt4Var;
                        ps psVar2 = psVar;
                        aw7 aw7Var2 = aw7Var;
                        y78 y78Var = (y78) obj4;
                        switch (i2) {
                            case 0:
                                fvb fvbVar = (fvb) aw7Var2.getValue();
                                if (fvbVar != null) {
                                    int g = fvbVar.b.g(y78Var.a);
                                    os osVar = (os) sl1.e0(psVar2.d(g, g + 1));
                                    if (osVar != null) {
                                        Object obj5 = osVar.a;
                                        if (c16.i(obj5, "login")) {
                                            vt4Var4.invoke();
                                        } else if (c16.i(obj5, "register")) {
                                            vt4Var3.invoke();
                                        }
                                    }
                                }
                                return pvcVar;
                            default:
                                fvb fvbVar2 = (fvb) aw7Var2.getValue();
                                if (fvbVar2 != null) {
                                    int g2 = fvbVar2.b.g(y78Var.a);
                                    os osVar2 = (os) sl1.e0(psVar2.d(g2, g2 + 1));
                                    if (osVar2 != null) {
                                        String str = (String) osVar2.a;
                                        if (c16.i(str, "login")) {
                                            vt4Var4.invoke();
                                        } else if (c16.i(str, "register")) {
                                            vt4Var3.invoke();
                                        }
                                    }
                                }
                                return pvcVar;
                        }
                    }
                }, m42Var, 7);
            case 1:
                final ps psVar2 = (ps) obj3;
                final vt4 vt4Var3 = (vt4) obj2;
                final vt4 vt4Var4 = (vt4) obj;
                final aw7 aw7Var2 = this.b;
                return ukb.e(d19Var, null, null, null, new xt4() { // from class: ye1
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj4) {
                        int i2 = r5;
                        pvc pvcVar = pvc.a;
                        vt4 vt4Var32 = vt4Var4;
                        vt4 vt4Var42 = vt4Var3;
                        ps psVar22 = psVar2;
                        aw7 aw7Var22 = aw7Var2;
                        y78 y78Var = (y78) obj4;
                        switch (i2) {
                            case 0:
                                fvb fvbVar = (fvb) aw7Var22.getValue();
                                if (fvbVar != null) {
                                    int g = fvbVar.b.g(y78Var.a);
                                    os osVar = (os) sl1.e0(psVar22.d(g, g + 1));
                                    if (osVar != null) {
                                        Object obj5 = osVar.a;
                                        if (c16.i(obj5, "login")) {
                                            vt4Var42.invoke();
                                        } else if (c16.i(obj5, "register")) {
                                            vt4Var32.invoke();
                                        }
                                    }
                                }
                                return pvcVar;
                            default:
                                fvb fvbVar2 = (fvb) aw7Var22.getValue();
                                if (fvbVar2 != null) {
                                    int g2 = fvbVar2.b.g(y78Var.a);
                                    os osVar2 = (os) sl1.e0(psVar22.d(g2, g2 + 1));
                                    if (osVar2 != null) {
                                        String str = (String) osVar2.a;
                                        if (c16.i(str, "login")) {
                                            vt4Var42.invoke();
                                        } else if (c16.i(str, "register")) {
                                            vt4Var32.invoke();
                                        }
                                    }
                                }
                                return pvcVar;
                        }
                    }
                }, m42Var, 7);
            default:
                wsb wsbVar = new wsb((m82) obj3, this.b, (yu7) obj2, null);
                wmb wmbVar = new wmb((aw7) obj, 22);
                ij3 ij3Var = ukb.a;
                Object p = k27.p(new lc9(d19Var, wsbVar, wmbVar, new j59(d19Var), (m42) null, 8), m42Var);
                pvc pvcVar = pvc.a;
                n82 n82Var = n82.a;
                if (p != n82Var) {
                    p = pvcVar;
                }
                if (p == n82Var) {
                    return p;
                }
                return pvcVar;
        }
    }

    public /* synthetic */ ze1(aw7 aw7Var, ps psVar, vt4 vt4Var, vt4 vt4Var2, int i) {
        this.a = i;
        this.b = aw7Var;
        this.c = psVar;
        this.d = vt4Var;
        this.e = vt4Var2;
    }
}
