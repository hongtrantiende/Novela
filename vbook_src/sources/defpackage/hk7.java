package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hk7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hk7 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ atd b;

    public /* synthetic */ hk7(atd atdVar, int i) {
        this.a = i;
        this.b = atdVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = nae.e;
        atd atdVar = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(dce.m(Math.abs(1.0f - ((Number) atdVar.f.getValue()).floatValue()), nae.e, 1.0f));
            case 1:
                w26 w26Var = atdVar.p;
                if (w26Var != null) {
                    w26Var.cancel(null);
                }
                atdVar.q.setValue(Boolean.TRUE);
                return pvcVar;
            case 2:
                atdVar.q.setValue(Boolean.FALSE);
                return pvcVar;
            case 3:
                Boolean bool = (Boolean) atdVar.q.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                if (((int) (atdVar.j() & 4294967295L)) != 0) {
                    f = Math.abs(atdVar.e()) / ((int) (atdVar.j() & 4294967295L));
                }
                return Float.valueOf(f);
            default:
                if (Float.intBitsToFloat((int) (atdVar.i() & 4294967295L)) != nae.e) {
                    f = atdVar.e();
                }
                return Float.valueOf(f);
        }
    }
}
