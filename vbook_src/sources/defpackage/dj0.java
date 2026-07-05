package defpackage;

import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dj0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dj0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dj0(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        xv7 i;
        Object value;
        wb9 wb9Var;
        LinkedHashSet linkedHashSet;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        Object obj = this.c;
        boolean z = this.b;
        switch (i2) {
            case 0:
                xv7 xv7Var = (xv7) obj;
                if (z) {
                    xv7Var.f(pvcVar);
                }
                return pvcVar;
            case 1:
                oj ojVar = (oj) obj;
                if (z && (i = ojVar.i()) != null) {
                    ((pga) i).f(pvcVar);
                }
                return pvcVar;
            case 2:
                i53 i53Var = (i53) obj;
                if (!z) {
                    hk1 a = jdd.a(i53Var);
                    sw2 sw2Var = ab3.a;
                    i53Var.f(a, ru2.c, new d53((fdd) i53Var, (Object) null, (m42) null, 1));
                }
                return pvcVar;
            case 3:
                zb9 zb9Var = (zb9) obj;
                if (z) {
                    zb9Var.l();
                } else {
                    cza czaVar = zb9Var.e;
                    if (czaVar != null) {
                        do {
                            value = czaVar.getValue();
                            wb9Var = (wb9) value;
                            List<ac9> list = wb9Var.a;
                            linkedHashSet = new LinkedHashSet();
                            for (ac9 ac9Var : list) {
                                linkedHashSet.add(ac9Var.a);
                            }
                        } while (!czaVar.l(value, wb9.a(wb9Var, null, null, null, 0, false, false, false, false, linkedHashSet, true, 255)));
                    }
                }
                return pvcVar;
            default:
                aw7 aw7Var = (aw7) obj;
                if (z) {
                    aw7Var.setValue(Boolean.TRUE);
                }
                return pvcVar;
        }
    }
}
