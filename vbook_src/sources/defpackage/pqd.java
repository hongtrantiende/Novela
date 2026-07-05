package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pqd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pqd implements lu4 {
    public final /* synthetic */ rh8 C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ yya E;
    public final /* synthetic */ yya F;
    public final /* synthetic */ aw7 G;
    public final /* synthetic */ yya H;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ nqd c;
    public final /* synthetic */ ix5 d;
    public final /* synthetic */ cz7 e;
    public final /* synthetic */ String f;

    public /* synthetic */ pqd(nq7 nq7Var, nqd nqdVar, ix5 ix5Var, cz7 cz7Var, String str, rh8 rh8Var, aw7 aw7Var, yya yyaVar, yya yyaVar2, aw7 aw7Var2, yya yyaVar3) {
        this.b = nq7Var;
        this.c = nqdVar;
        this.d = ix5Var;
        this.e = cz7Var;
        this.f = str;
        this.C = rh8Var;
        this.D = aw7Var;
        this.E = yyaVar;
        this.F = yyaVar2;
        this.G = aw7Var2;
        this.H = yyaVar3;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nqd nqdVar = this.c;
                    do5.f(nqdVar.c1, jce.E(-1258353956, new pqd(this.b, nqdVar, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H), rv4Var), rv4Var, 48);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    hc2.b(this.b, null, jce.E(1217363122, new d52(this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, 8), rv4Var2), rv4Var2, 3072, 6);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ pqd(nqd nqdVar, nq7 nq7Var, ix5 ix5Var, cz7 cz7Var, String str, rh8 rh8Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5) {
        this.c = nqdVar;
        this.b = nq7Var;
        this.d = ix5Var;
        this.e = cz7Var;
        this.f = str;
        this.C = rh8Var;
        this.D = aw7Var;
        this.E = aw7Var2;
        this.F = aw7Var3;
        this.G = aw7Var4;
        this.H = aw7Var5;
    }
}
