package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bq1  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class bq1 implements lu4 {
    public final /* synthetic */ long C;
    public final /* synthetic */ String D;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ nq7 e;
    public final /* synthetic */ long f;

    public /* synthetic */ bq1(String str, nq7 nq7Var, long j, long j2, lu4 lu4Var, int i, int i2) {
        this.a = 2;
        this.D = str;
        this.e = nq7Var;
        this.f = j;
        this.C = j2;
        this.d = lu4Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int p = xoe.p(1);
                bce.b(this.b, this.c, (cz7) obj3, this.e, this.f, this.C, this.D, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                int p2 = xoe.p(1);
                bce.b(this.b, this.c, (cz7) obj3, this.e, this.f, this.C, this.D, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                int p3 = xoe.p(this.b | 1);
                nqe.f(this.D, this.e, this.f, this.C, (lu4) obj3, (rv4) obj, p3, this.c);
                return pvcVar;
        }
    }

    public /* synthetic */ bq1(int i, int i2, cz7 cz7Var, nq7 nq7Var, long j, long j2, String str, int i3, int i4) {
        this.a = i4;
        this.b = i;
        this.c = i2;
        this.d = cz7Var;
        this.e = nq7Var;
        this.f = j;
        this.C = j2;
        this.D = str;
    }
}
