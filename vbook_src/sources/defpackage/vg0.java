package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vg0  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class vg0 implements lu4 {
    public final /* synthetic */ int C;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ mu4 e;
    public final /* synthetic */ nq7 f;

    public /* synthetic */ vg0(int i, long j, long j2, mu4 mu4Var, nq7 nq7Var, int i2) {
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = mu4Var;
        this.f = nq7Var;
        this.C = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ctd.a(xoe.p(this.b | 1), this.C, this.c, this.d, this.e, (rv4) obj, this.f);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p = xoe.p(this.C | 1);
                nqe.m(this.b, p, this.c, this.d, this.e, (rv4) obj, this.f);
                return pvcVar;
        }
    }

    public /* synthetic */ vg0(nq7 nq7Var, long j, long j2, mu4 mu4Var, int i, int i2) {
        this.f = nq7Var;
        this.c = j;
        this.d = j2;
        this.e = mu4Var;
        this.b = i;
        this.C = i2;
    }
}
