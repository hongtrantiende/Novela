package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g95  reason: default package */
/* loaded from: classes3.dex */
public final class g95 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j95 b;

    public /* synthetic */ g95(j95 j95Var, int i) {
        this.a = i;
        this.b = j95Var;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        Object value;
        Object value2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        j95 j95Var = this.b;
        switch (i) {
            case 0:
                long longValue = ((Number) obj).longValue();
                cza czaVar = j95Var.f;
                if (czaVar != null) {
                    do {
                        value = czaVar.getValue();
                    } while (!czaVar.l(value, f95.a((f95) value, 0, (int) longValue, null, 13)));
                    return pvcVar;
                }
                return pvcVar;
            default:
                oia oiaVar = (oia) obj;
                cza czaVar2 = j95Var.f;
                if (czaVar2 != null) {
                    do {
                        value2 = czaVar2.getValue();
                    } while (!czaVar2.l(value2, f95.a((f95) value2, oiaVar.a, 0, null, 14)));
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
