package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gsd  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gsd implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lsd b;

    public /* synthetic */ gsd(lsd lsdVar, int i) {
        this.a = i;
        this.b = lsdVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        lsd lsdVar = this.b;
        switch (i) {
            case 0:
                z87.v(lsdVar.v1(), null, null, new pz2(lsdVar, (z4d) obj, null), 3);
                return pvcVar;
            case 1:
                lsdVar.S = (y78) obj;
                return pvcVar;
            case 2:
                y78 y78Var = (y78) obj;
                if (lsdVar.M.d(8) && !lsdVar.T && !lsdVar.Q) {
                    lsdVar.R = true;
                    z87.v(lsdVar.v1(), null, null, new dsd(lsdVar, y78Var, null, 1), 3);
                }
                return pvcVar;
            case 3:
                y78 y78Var2 = (y78) obj;
                xt4 xt4Var = lsdVar.O;
                if (xt4Var != null) {
                    xt4Var.invoke(y78Var2);
                    lsdVar.Q = true;
                }
                return pvcVar;
            default:
                y78 y78Var3 = (y78) obj;
                xt4 xt4Var2 = lsdVar.P;
                if (xt4Var2 != null) {
                    xt4Var2.invoke(y78Var3);
                }
                return pvcVar;
        }
    }
}
