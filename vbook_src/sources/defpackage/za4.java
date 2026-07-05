package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: za4  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class za4 implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ za4(kj6 kj6Var, vt4 vt4Var, vt4 vt4Var2, boolean z, vt4 vt4Var3, vt4 vt4Var4, float f, xt4 xt4Var, int i) {
        this.e = kj6Var;
        this.f = vt4Var;
        this.C = vt4Var2;
        this.b = z;
        this.D = vt4Var3;
        this.E = vt4Var4;
        this.c = f;
        this.d = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.E;
        Object obj4 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (i) {
            case 0:
                bya byaVar = (bya) obj7;
                nk6 nk6Var = (nk6) obj6;
                rh8 rh8Var = (rh8) obj5;
                fz fzVar = (fz) obj4;
                li4 li4Var = (li4) obj3;
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    hma.k(byaVar, pna.c, nk6Var, rh8Var, this.c, fzVar, li4Var, this.b, null, this.d, rv4Var, 48);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                hxe.a((kj6) obj7, (vt4) obj6, (vt4) obj5, this.b, (vt4) obj4, (vt4) obj3, this.c, this.d, (rv4) obj, xoe.p(433));
                return pvcVar;
        }
    }

    public /* synthetic */ za4(bya byaVar, nk6 nk6Var, rh8 rh8Var, float f, fz fzVar, li4 li4Var, boolean z, xt4 xt4Var) {
        this.e = byaVar;
        this.f = nk6Var;
        this.C = rh8Var;
        this.c = f;
        this.D = fzVar;
        this.E = li4Var;
        this.b = z;
        this.d = xt4Var;
    }
}
