package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pv implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cgc b;

    public /* synthetic */ pv(cgc cgcVar, int i) {
        this.a = i;
        this.b = cgcVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        cgc cgcVar = this.b;
        switch (i) {
            case 0:
                cgcVar.a = -(((int) (((zy5) obj).a & 4294967295L)) - cgcVar.d.h());
                return pvcVar;
            default:
                cgcVar.b(((Number) ((wr) obj).e.getValue()).floatValue());
                return pvcVar;
        }
    }
}
