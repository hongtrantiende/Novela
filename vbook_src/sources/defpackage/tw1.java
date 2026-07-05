package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tw1  reason: default package */
/* loaded from: classes.dex */
public final class tw1 extends fb6 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ vw1 b;
    public final /* synthetic */ rg c;
    public final /* synthetic */ lu4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw1(rg rgVar, vw1 vw1Var, lu4 lu4Var) {
        super(2);
        this.c = rgVar;
        this.b = vw1Var;
        this.d = lu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.d;
        rg rgVar = this.c;
        vw1 vw1Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    rv4Var.e0(866651995);
                    dy1.a(rgVar, vw1Var.l, lu4Var, rv4Var, 0);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Number) obj2).intValue();
                vw1Var.a(rgVar, lu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tw1(vw1 vw1Var, rg rgVar, lu4 lu4Var, int i) {
        super(2);
        this.b = vw1Var;
        this.c = rgVar;
        this.d = lu4Var;
    }
}
