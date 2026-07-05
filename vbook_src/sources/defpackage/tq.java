package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tq  reason: default package */
/* loaded from: classes.dex */
public final class tq extends fb6 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ tkc b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ nq7 d;
    public final /* synthetic */ tu1 e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(tkc tkcVar, xt4 xt4Var, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, lu4 lu4Var, tu1 tu1Var, int i) {
        super(2);
        this.b = tkcVar;
        this.c = xt4Var;
        this.d = nq7Var;
        this.C = eu3Var;
        this.D = lz3Var;
        this.E = lu4Var;
        this.e = tu1Var;
        this.f = i;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.f;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int p = xoe.p(i2 | 1);
                tkc tkcVar = this.b;
                nq7 nq7Var = this.d;
                xt4 xt4Var = this.c;
                b16.d(tkcVar, nq7Var, xt4Var, (dc) obj3, (xt4) obj5, (xt4) obj4, this.e, (rv4) obj, p);
                return pvcVar;
            default:
                ((Number) obj2).intValue();
                int p2 = xoe.p(i2 | 1);
                tkc tkcVar2 = this.b;
                xt4 xt4Var2 = this.c;
                nq7 nq7Var2 = this.d;
                rte.a(tkcVar2, xt4Var2, nq7Var2, (eu3) obj5, (lz3) obj4, (lu4) obj3, this.e, (rv4) obj, p2);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq(tkc tkcVar, nq7 nq7Var, xt4 xt4Var, dc dcVar, xt4 xt4Var2, xt4 xt4Var3, tu1 tu1Var, int i) {
        super(2);
        this.b = tkcVar;
        this.d = nq7Var;
        this.c = xt4Var;
        this.E = dcVar;
        this.C = xt4Var2;
        this.D = xt4Var3;
        this.e = tu1Var;
        this.f = i;
    }
}
