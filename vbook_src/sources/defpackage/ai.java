package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ai  reason: default package */
/* loaded from: classes.dex */
public final class ai extends fb6 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ lu4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(vw1 vw1Var, rnd rndVar, lu4 lu4Var) {
        super(2);
        this.a = 2;
        this.b = vw1Var;
        this.c = rndVar;
        this.d = lu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                vqe.a((vt4) obj4, (x53) obj3, (tu1) lu4Var, (rv4) obj, xoe.p(385));
                return pvcVar;
            case 1:
                ((Number) obj2).intValue();
                dy1.a((wg8) obj4, (xo) obj3, lu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
            default:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Number) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    ((vw1) obj4).a(((rnd) obj3).a, lu4Var, rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai(Object obj, Object obj2, lu4 lu4Var, int i, int i2) {
        super(2);
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = lu4Var;
    }
}
