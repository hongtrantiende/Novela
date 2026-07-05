package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j7d  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class j7d implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t7d b;

    public /* synthetic */ j7d(t7d t7dVar, int i) {
        this.a = i;
        this.b = t7dVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        t7d t7dVar = this.b;
        switch (i) {
            case 0:
                t7dVar.g.setValue(Boolean.TRUE);
                return pvcVar;
            case 1:
                t7dVar.g.setValue(Boolean.FALSE);
                return pvcVar;
            default:
                t7dVar.a.setValue(Boolean.valueOf(!t7dVar.b()));
                if (t7dVar.b()) {
                    t7d.e(t7dVar);
                }
                return pvcVar;
        }
    }
}
