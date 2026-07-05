package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pq  reason: default package */
/* loaded from: classes.dex */
public final class pq extends fb6 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ tu1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(fw7 fw7Var, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, String str, tu1 tu1Var, int i) {
        super(2);
        this.e = fw7Var;
        this.b = nq7Var;
        this.f = eu3Var;
        this.C = lz3Var;
        this.D = str;
        this.c = tu1Var;
        this.d = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.f;
        Object obj6 = this.e;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int p = xoe.p(i2 | 1);
                nq7 nq7Var = this.b;
                b16.b((tkc) obj6, nq7Var, (xt4) obj5, (dc) obj3, (xt4) obj4, this.c, (rv4) obj, p);
                return pvcVar;
            case 1:
                ((Number) obj2).intValue();
                int p2 = xoe.p(i2 | 1);
                nq7 nq7Var2 = this.b;
                rte.b((fw7) obj6, nq7Var2, (eu3) obj5, (lz3) obj4, (String) obj3, this.c, (rv4) obj, p2);
                return pvcVar;
            default:
                ((Number) obj2).intValue();
                int p3 = xoe.p(i2 | 1);
                nq7 nq7Var3 = this.b;
                rte.f((tkc) obj6, (xt4) obj5, nq7Var3, (eu3) obj4, (lz3) obj3, this.c, (rv4) obj, p3);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(tkc tkcVar, xt4 xt4Var, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, tu1 tu1Var, int i) {
        super(2);
        this.e = tkcVar;
        this.f = xt4Var;
        this.b = nq7Var;
        this.C = eu3Var;
        this.D = lz3Var;
        this.c = tu1Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(tkc tkcVar, nq7 nq7Var, xt4 xt4Var, dc dcVar, xt4 xt4Var2, tu1 tu1Var, int i) {
        super(2);
        this.e = tkcVar;
        this.b = nq7Var;
        this.f = xt4Var;
        this.D = dcVar;
        this.C = xt4Var2;
        this.c = tu1Var;
        this.d = i;
    }
}
