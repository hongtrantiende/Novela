package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k68  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class k68 implements lu4 {
    public final /* synthetic */ aw7 C;
    public final /* synthetic */ yya D;
    public final /* synthetic */ yya E;
    public final /* synthetic */ aw7 F;
    public final /* synthetic */ yya G;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ nq7 b;
    public final /* synthetic */ j68 c;
    public final /* synthetic */ ix5 d;
    public final /* synthetic */ cz7 e;
    public final /* synthetic */ rh8 f;

    public /* synthetic */ k68(nq7 nq7Var, j68 j68Var, ix5 ix5Var, cz7 cz7Var, rh8 rh8Var, aw7 aw7Var, yya yyaVar, yya yyaVar2, aw7 aw7Var2, yya yyaVar3) {
        this.b = nq7Var;
        this.c = j68Var;
        this.d = ix5Var;
        this.e = cz7Var;
        this.f = rh8Var;
        this.C = aw7Var;
        this.D = yyaVar;
        this.E = yyaVar2;
        this.F = aw7Var2;
        this.G = yyaVar3;
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
                    j68 j68Var = this.c;
                    do5.f(j68Var.h1, jce.E(-825283490, new k68(this.b, j68Var, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G), rv4Var), rv4Var, 48);
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
                    hc2.b(this.b, null, jce.E(-557722572, new l68(this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, 0), rv4Var2), rv4Var2, 3072, 6);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ k68(j68 j68Var, nq7 nq7Var, ix5 ix5Var, cz7 cz7Var, rh8 rh8Var, aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5) {
        this.c = j68Var;
        this.b = nq7Var;
        this.d = ix5Var;
        this.e = cz7Var;
        this.f = rh8Var;
        this.C = aw7Var;
        this.D = aw7Var2;
        this.E = aw7Var3;
        this.F = aw7Var4;
        this.G = aw7Var5;
    }
}
