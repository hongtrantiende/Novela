package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ hu4 e;

    public /* synthetic */ mb(long j, nq7 nq7Var, xt4 xt4Var, int i, int i2) {
        this.b = j;
        this.d = nq7Var;
        this.e = xt4Var;
        this.c = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        hu4 hu4Var = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(this.c | 1);
                xb.e(this.b, (oyb) obj3, (tu1) hu4Var, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1);
                obe.f(this.b, (nq7) obj3, (xt4) hu4Var, (rv4) obj, p2, this.c);
                return pvcVar;
        }
    }

    public /* synthetic */ mb(long j, oyb oybVar, tu1 tu1Var, int i) {
        this.b = j;
        this.d = oybVar;
        this.e = tu1Var;
        this.c = i;
    }
}
