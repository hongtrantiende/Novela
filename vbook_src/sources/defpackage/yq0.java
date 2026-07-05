package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yq0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yq0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ nq7 c;

    public /* synthetic */ yq0(float f, nq7 nq7Var, int i, int i2) {
        this.a = i2;
        this.b = f;
        this.c = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        nq7 nq7Var = this.c;
        float f = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                v9e.a(f, nq7Var, rv4Var, xoe.p(1));
                return pvcVar;
            default:
                jsc.b(f, nq7Var, rv4Var, xoe.p(1));
                return pvcVar;
        }
    }
}
