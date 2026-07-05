package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x34  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class x34 implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ nq7 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public /* synthetic */ x34(String str, nq7 nq7Var, long j, long j2, int i, int i2, int i3) {
        this.a = i3;
        this.b = str;
        this.c = nq7Var;
        this.d = j;
        this.e = j2;
        this.f = i;
        this.C = i2;
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
                oue.n(this.b, this.c, this.d, this.e, (rv4) obj, p, this.C);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                sue.d(this.b, this.c, this.d, this.e, (rv4) obj, p2, this.C);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                bbe.j(this.b, this.c, this.d, this.e, (rv4) obj, p3, this.C);
                return pvcVar;
        }
    }
}
