package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f43  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class f43 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ tra b;

    public /* synthetic */ f43(tra traVar, int i) {
        this.a = i;
        this.b = traVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        tra traVar = this.b;
        Integer num = (Integer) obj;
        num.intValue();
        switch (i) {
            case 0:
                if (traVar.contains(num)) {
                    traVar.remove(num);
                } else {
                    traVar.add(num);
                }
                return pvcVar;
            default:
                if (traVar.contains(num)) {
                    traVar.remove(num);
                } else {
                    traVar.add(num);
                }
                return pvcVar;
        }
    }
}
