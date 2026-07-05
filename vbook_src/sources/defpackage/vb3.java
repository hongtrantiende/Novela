package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vb3  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vb3 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;

    public /* synthetic */ vb3(long j, float f, int i, nq7 nq7Var, int i2, int i3) {
        this.a = 3;
        this.d = j;
        this.c = f;
        this.e = i;
        this.b = nq7Var;
        this.f = i3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.e;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(i2 | 1);
                vqe.m(this.c, p, this.f, this.d, (rv4) obj, this.b);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(i2 | 1);
                vqe.q(this.c, p2, this.f, this.d, (rv4) obj, this.b);
                return pvcVar;
            case 2:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(i2 | 1);
                ts6.a(this.c, p3, this.f, this.d, (rv4) obj, this.b);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p4 = xoe.p(3121);
                tl1.l(this.d, this.c, this.e, this.b, (rv4) obj, p4, this.f);
                return pvcVar;
        }
    }

    public /* synthetic */ vb3(long j, float f, nq7 nq7Var, int i, int i2) {
        this.a = 2;
        this.d = j;
        this.c = f;
        this.b = nq7Var;
        this.e = i;
        this.f = i2;
    }

    public /* synthetic */ vb3(nq7 nq7Var, float f, long j, int i, int i2, int i3) {
        this.a = i3;
        this.b = nq7Var;
        this.c = f;
        this.d = j;
        this.e = i;
        this.f = i2;
    }
}
