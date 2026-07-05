package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iib  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class iib implements lu4 {
    public final /* synthetic */ rq9 C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rq9 d;
    public final /* synthetic */ rq9 e;
    public final /* synthetic */ rq9 f;

    public /* synthetic */ iib(String str, rq9 rq9Var, rq9 rq9Var2, boolean z, rq9 rq9Var3, rq9 rq9Var4) {
        this.b = str;
        this.d = rq9Var;
        this.e = rq9Var2;
        this.c = z;
        this.f = rq9Var3;
        this.C = rq9Var4;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        vy4 vy4Var = vy4.a;
        String str = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(1 & intValue, z)) {
                    iue.a(s9e.r(vy4Var), str, 360.0f, rv4Var, 0);
                    kwe.b(s9e.r(vy4Var), 1, 1, jce.E(-1102189276, new fib(this.d, this.e, this.c, this.f, this.C, 2), rv4Var), rv4Var, 3072, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    iue.a(s9e.r(vy4Var), str, 60.0f, rv4Var2, 0);
                    kwe.b(s9e.r(vy4Var), 1, 1, jce.E(-1278463119, new fib(this.c, this.d, this.e, this.f, this.C, 3), rv4Var2), rv4Var2, 3072, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ iib(String str, boolean z, rq9 rq9Var, rq9 rq9Var2, rq9 rq9Var3, rq9 rq9Var4) {
        this.b = str;
        this.c = z;
        this.d = rq9Var;
        this.e = rq9Var2;
        this.f = rq9Var3;
        this.C = rq9Var4;
    }
}
