package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xx0  reason: default package */
/* loaded from: classes3.dex */
public final class xx0 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ fy0 b;

    public /* synthetic */ xx0(fy0 fy0Var, int i) {
        this.a = i;
        this.b = fy0Var;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        fy0 fy0Var = this.b;
        switch (i) {
            case 0:
                fy0Var.C.m((List) obj);
                return pvcVar;
            case 1:
                List list = (List) obj;
                cza czaVar = fy0Var.D;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, lx0.a((lx0) value, false, false, false, list, null, 47)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                List list2 = (List) obj;
                cza czaVar2 = fy0Var.D;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, lx0.a((lx0) value2, false, false, false, null, list2, 31)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
