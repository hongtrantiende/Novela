package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nj4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nj4 implements lu4 {
    public final /* synthetic */ hu4 C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nj4(vt4 vt4Var, boolean z, boolean z2, tu1 tu1Var, int i, int i2) {
        this.f = vt4Var;
        this.b = z;
        this.c = z2;
        this.C = tu1Var;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        hu4 hu4Var = this.C;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                qj4.c((vt4) obj3, this.b, this.c, (tu1) hu4Var, (rv4) obj, p, this.e);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                tte.g(this.b, this.c, (nq7) obj3, (xt4) hu4Var, (rv4) obj, p2, this.e);
                return pvcVar;
        }
    }

    public /* synthetic */ nj4(boolean z, boolean z2, nq7 nq7Var, xt4 xt4Var, int i, int i2) {
        this.b = z;
        this.c = z2;
        this.f = nq7Var;
        this.C = xt4Var;
        this.d = i;
        this.e = i2;
    }
}
