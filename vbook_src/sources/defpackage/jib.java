package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jib  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jib implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ xy4 b;
    public final /* synthetic */ rq9 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ jib(xy4 xy4Var, rq9 rq9Var, String str, boolean z, int i, int i2) {
        this.a = i2;
        this.b = xy4Var;
        this.c = rq9Var;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(385);
                iue.q(this.b, this.c, this.d, this.e, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(385);
                iue.D(this.b, this.c, this.d, this.e, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(385);
                iue.r(this.b, this.c, this.d, this.e, (rv4) obj, p3);
                return pvcVar;
        }
    }
}
