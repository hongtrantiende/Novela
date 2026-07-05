package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ep7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ep7 implements lu4 {
    public final /* synthetic */ hu4 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ nq7 e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ep7(boolean z, boolean z2, long j, xr xrVar, nq7 nq7Var, vt4 vt4Var, int i) {
        this.a = 2;
        this.b = z;
        this.d = z2;
        this.c = j;
        this.f = xrVar;
        this.e = nq7Var;
        this.C = vt4Var;
        this.D = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.D;
        hu4 hu4Var = this.C;
        Object obj3 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                fpe.i(this.b, this.c, this.d, this.e, (xt4) obj3, (lu4) hu4Var, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                fpe.j(this.b, this.c, this.d, this.e, (xt4) obj3, (lu4) hu4Var, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                owe.p(this.b, this.d, this.c, (xr) obj3, this.e, (vt4) hu4Var, (rv4) obj, p3);
                return pvcVar;
        }
    }

    public /* synthetic */ ep7(boolean z, long j, boolean z2, nq7 nq7Var, xt4 xt4Var, lu4 lu4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = j;
        this.d = z2;
        this.e = nq7Var;
        this.f = xt4Var;
        this.C = lu4Var;
        this.D = i;
    }
}
