package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n43  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class n43 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ n43(int i, int i2, rh8 rh8Var, nq7 nq7Var, int i3) {
        this.a = 3;
        this.b = i;
        this.c = i2;
        this.e = rh8Var;
        this.f = nq7Var;
        this.d = i3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        pvc pvcVar = pvc.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                int i3 = this.b;
                int i4 = this.d;
                nqe.k(i3, p, i4, rv4Var, (nq7) obj3, (String) obj4);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                ej6.c((kj6) obj4, this.b, (vt4) obj3, (rv4) obj, p2, this.d);
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                ej6.b((qg6) obj4, this.b, (vt4) obj3, (rv4) obj, p3, this.d);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p4 = xoe.p(this.d | 1);
                jue.u(this.b, this.c, (rh8) obj4, (nq7) obj3, (rv4) obj, p4);
                return pvcVar;
        }
    }

    public /* synthetic */ n43(Object obj, int i, Object obj2, int i2, int i3, int i4) {
        this.a = i4;
        this.e = obj;
        this.b = i;
        this.f = obj2;
        this.c = i2;
        this.d = i3;
    }
}
