package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hj4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hj4 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ lu4 e;
    public final /* synthetic */ nq7 f;

    public /* synthetic */ hj4(int i, sk8 sk8Var, long j, long j2, lu4 lu4Var, xt4 xt4Var, xt4 xt4Var2, nq7 nq7Var, int i2) {
        this.b = i;
        this.C = sk8Var;
        this.c = j;
        this.d = j2;
        this.e = lu4Var;
        this.D = xt4Var;
        this.E = xt4Var2;
        this.f = nq7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(this.b | 1);
                oc2.h((vt4) obj5, this.f, (wea) obj4, this.c, this.d, (dj4) obj3, this.e, (rv4) obj, p);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1);
                eze.a(this.b, (sk8) obj5, this.c, this.d, this.e, (xt4) obj4, (xt4) obj3, this.f, (rv4) obj, p2);
                return pvcVar;
        }
    }

    public /* synthetic */ hj4(vt4 vt4Var, nq7 nq7Var, wea weaVar, long j, long j2, dj4 dj4Var, lu4 lu4Var, int i) {
        this.C = vt4Var;
        this.f = nq7Var;
        this.D = weaVar;
        this.c = j;
        this.d = j2;
        this.E = dj4Var;
        this.e = lu4Var;
        this.b = i;
    }
}
