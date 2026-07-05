package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o95  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class o95 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o95(float f, xt4 xt4Var, nq7 nq7Var, int i) {
        this.b = f;
        this.c = xt4Var;
        this.d = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        float f = this.b;
        switch (i) {
            case 0:
                q95 q95Var = (q95) obj3;
                float floatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                if (k27.v((m82) obj4)) {
                    q95Var.g.setValue(Float.valueOf(floatValue / f));
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                jue.x(f, (xt4) obj4, (nq7) obj3, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ o95(m82 m82Var, q95 q95Var, float f) {
        this.c = m82Var;
        this.d = q95Var;
        this.b = f;
    }
}
