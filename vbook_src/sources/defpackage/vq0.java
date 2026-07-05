package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vq0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq0 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rh8 b;
    public final /* synthetic */ bkd c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ int e;

    public /* synthetic */ vq0(rh8 rh8Var, bkd bkdVar, nq7 nq7Var, int i, int i2) {
        this.a = i2;
        this.b = rh8Var;
        this.c = bkdVar;
        this.d = nq7Var;
        this.e = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        nq7 nq7Var = this.d;
        bkd bkdVar = this.c;
        rh8 rh8Var = this.b;
        rv4 rv4Var = (rv4) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                v9e.f(rh8Var, bkdVar, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
            default:
                fre.g(rh8Var, bkdVar, nq7Var, rv4Var, xoe.p(i2 | 1));
                return pvcVar;
        }
    }
}
