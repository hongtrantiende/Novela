package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ak7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ak7 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ak7(int i, int i2, vt4 vt4Var, String str, boolean z) {
        this.e = str;
        this.c = i;
        this.b = z;
        this.f = vt4Var;
        this.d = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int p = xoe.p(this.d | 1);
                jsc.j((String) obj4, this.c, this.b, (vt4) obj3, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1);
                bce.d(this.b, this.c, this.d, (xt4) obj4, (xt4) obj3, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(this.c | 1);
                jsc.q((String) obj4, this.b, (nq7) obj3, (rv4) obj, p3, this.d);
                return pvcVar;
        }
    }

    public /* synthetic */ ak7(String str, boolean z, nq7 nq7Var, int i, int i2) {
        this.e = str;
        this.b = z;
        this.f = nq7Var;
        this.c = i;
        this.d = i2;
    }

    public /* synthetic */ ak7(boolean z, int i, int i2, xt4 xt4Var, xt4 xt4Var2, int i3) {
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = xt4Var;
        this.f = xt4Var2;
    }
}
