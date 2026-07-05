package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zrb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class zrb implements lu4 {
    public final /* synthetic */ boolean C;
    public final /* synthetic */ tkc D;
    public final /* synthetic */ oyb E;
    public final /* synthetic */ oyb F;
    public final /* synthetic */ mu4 G;
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ yya b;
    public final /* synthetic */ hrb c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ zrb(yya yyaVar, hrb hrbVar, boolean z, boolean z2, boolean z3, boolean z4, tkc tkcVar, oyb oybVar, oyb oybVar2, mu4 mu4Var, int i) {
        this.b = yyaVar;
        this.c = hrbVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.C = z4;
        this.D = tkcVar;
        this.E = oybVar;
        this.F = oybVar2;
        this.G = mu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dxe.b(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    dxe.b(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ zrb(skc skcVar, hrb hrbVar, boolean z, boolean z2, boolean z3, boolean z4, tkc tkcVar, oyb oybVar, oyb oybVar2, mu4 mu4Var) {
        this.b = skcVar;
        this.c = hrbVar;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.C = z4;
        this.D = tkcVar;
        this.E = oybVar;
        this.F = oybVar2;
        this.G = mu4Var;
    }
}
