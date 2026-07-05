package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u7d  reason: default package */
/* loaded from: classes3.dex */
public final class u7d implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7d b;

    public /* synthetic */ u7d(t7d t7dVar, int i) {
        this.a = i;
        this.b = t7dVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        t7d t7dVar = this.b;
        switch (i) {
            case 0:
                long longValue = ((Number) obj).longValue();
                if (!((Boolean) t7dVar.g.getValue()).booleanValue()) {
                    t7dVar.b.i(longValue);
                }
                return pvcVar;
            case 1:
                t7dVar.c.i(((Number) obj).longValue());
                return pvcVar;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                t7dVar.d.setValue(bool);
                return pvcVar;
            case 3:
                Boolean bool2 = (Boolean) obj;
                bool2.getClass();
                t7dVar.e.setValue(bool2);
                return pvcVar;
            default:
                Boolean bool3 = (Boolean) obj;
                bool3.getClass();
                t7dVar.f.setValue(bool3);
                return pvcVar;
        }
    }
}
