package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mk5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mk5 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ mk5(ar5 ar5Var, nq7 nq7Var, long j, vt4 vt4Var, int i, int i2) {
        this.a = 2;
        this.C = ar5Var;
        this.c = nq7Var;
        this.d = j;
        this.b = vt4Var;
        this.e = i;
        this.f = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        Object obj3 = this.b;
        Object obj4 = this.C;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                nk5.a((ar5) obj4, (String) obj3, this.c, this.d, (rv4) obj, p, this.f);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                nk5.b((vk8) obj4, (String) obj3, this.c, this.d, (rv4) obj, p2, this.f);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                kwe.d((ar5) obj4, this.c, this.d, (vt4) obj3, (rv4) obj, p3, this.f);
                return pvcVar;
        }
    }

    public /* synthetic */ mk5(Object obj, String str, nq7 nq7Var, long j, int i, int i2, int i3) {
        this.a = i3;
        this.C = obj;
        this.b = str;
        this.c = nq7Var;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
