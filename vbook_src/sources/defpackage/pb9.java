package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pb9  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb9 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb9 b;

    public /* synthetic */ pb9(zb9 zb9Var, int i) {
        this.a = i;
        this.b = zb9Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        Object value;
        int i = this.a;
        pvc pvcVar = pvc.a;
        zb9 zb9Var = this.b;
        switch (i) {
            case 0:
                cza czaVar = zb9Var.e;
                Set set = ((wb9) czaVar.getValue()).i;
                if (!set.isEmpty()) {
                    List list = zb9Var.C;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (!set.contains(((ac9) obj).a)) {
                            arrayList.add(obj);
                        }
                    }
                    zb9Var.C = arrayList;
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                        } while (!czaVar.l(value, wb9.a((wb9) value, null, null, null, zb9Var.C.size(), false, false, false, true, rs3.a, false, Token.INC)));
                        zb9Var.k();
                    } else {
                        zb9Var.k();
                    }
                }
                return pvcVar;
            case 1:
                if (!((wb9) zb9Var.e.getValue()).g) {
                    hk1 a = jdd.a(zb9Var);
                    sw2 sw2Var = ab3.a;
                    zb9Var.f(a, ru2.c, new z38(zb9Var, null, 8));
                }
                return pvcVar;
            case 2:
                hk1 a2 = jdd.a(zb9Var);
                sw2 sw2Var2 = ab3.a;
                zb9Var.f(a2, ru2.c, new xb9(zb9Var, null, 2));
                return pvcVar;
            default:
                zb9Var.l();
                return pvcVar;
        }
    }
}
