package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oj4  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class oj4 implements lu4 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    public /* synthetic */ oj4(vt4 vt4Var, boolean z, boolean z2, tu1 tu1Var, int i) {
        this.d = vt4Var;
        this.b = z;
        this.c = z2;
        this.f = tu1Var;
        this.e = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.e;
        Object obj3 = this.f;
        Object obj4 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                qj4.a((vt4) obj4, this.b, this.c, (tu1) obj3, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                eh.g((String) obj3, this.b, this.c, (vt4) obj4, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                zbe.k(this.b, (nq7) obj4, this.c, (rg9) obj3, (rv4) obj, p3);
                return pvcVar;
        }
    }

    public /* synthetic */ oj4(String str, boolean z, boolean z2, vt4 vt4Var, int i) {
        this.f = str;
        this.b = z;
        this.c = z2;
        this.d = vt4Var;
        this.e = i;
    }

    public /* synthetic */ oj4(boolean z, nq7 nq7Var, boolean z2, rg9 rg9Var, int i) {
        this.b = z;
        this.d = nq7Var;
        this.c = z2;
        this.f = rg9Var;
        this.e = i;
    }
}
