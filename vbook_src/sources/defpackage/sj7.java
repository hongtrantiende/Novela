package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sj7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class sj7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ dm5 c;
    public final /* synthetic */ ss8 d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ int f;

    public /* synthetic */ sj7(boolean z, dm5 dm5Var, ss8 ss8Var, xt4 xt4Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = dm5Var;
        this.d = ss8Var;
        this.e = xt4Var;
        this.f = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                oc2.k(this.b, this.c, this.d, this.e, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                oc2.m(this.b, this.c, this.d, this.e, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                oc2.l(this.b, this.c, this.d, this.e, (rv4) obj, p3);
                return pvcVar;
        }
    }
}
