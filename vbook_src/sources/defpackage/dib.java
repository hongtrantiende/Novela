package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dib  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class dib implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int a;
    public final /* synthetic */ xy4 b;
    public final /* synthetic */ nm1 c;
    public final /* synthetic */ nm1 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;

    public /* synthetic */ dib(xy4 xy4Var, nm1 nm1Var, nm1 nm1Var2, float f, float f2, int i, int i2, int i3) {
        this.a = i3;
        this.b = xy4Var;
        this.c = nm1Var;
        this.d = nm1Var2;
        this.e = f;
        this.f = f2;
        this.C = i;
        this.D = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.C;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                iue.v(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p, this.D);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                iue.z(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p2, this.D);
                return pvcVar;
        }
    }
}
