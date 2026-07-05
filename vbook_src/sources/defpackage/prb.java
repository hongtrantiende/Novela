package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: prb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class prb implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ trb b;

    public /* synthetic */ prb(trb trbVar, int i) {
        this.a = i;
        this.b = trbVar;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        int i = this.a;
        x2c x2cVar = x2c.c;
        pvc pvcVar = pvc.a;
        trb trbVar = this.b;
        switch (i) {
            case 0:
                z87.v(trbVar.v1(), null, null, new rrb(trbVar, null, 1), 3);
                return Boolean.TRUE;
            case 1:
                trbVar.a0 = (oid) nye.q(trbVar, dy1.u);
                trbVar.O.h = trbVar.M1();
                if (trbVar.M1() && trbVar.b0 == null) {
                    trbVar.b0 = z87.v(trbVar.v1(), null, null, new rrb(trbVar, null, 4), 3);
                } else if (!trbVar.M1()) {
                    iya iyaVar = trbVar.b0;
                    if (iyaVar != null) {
                        iyaVar.cancel(null);
                    }
                    trbVar.b0 = null;
                }
                return pvcVar;
            case 2:
                voe.r(trbVar);
                return pvcVar;
            case 3:
                voe.r(trbVar);
                return pvcVar;
            case 4:
                ck9.a(trbVar);
                return null;
            case 5:
                ck9.a(trbVar);
                return nrb.a;
            case 6:
                z87.v(trbVar.v1(), null, null, new rrb(trbVar, null, 2), 3);
                return Boolean.TRUE;
            case 7:
                return trbVar.M.a.d().d.toString();
            case 8:
                if (!trbVar.M1()) {
                    mn4 mn4Var = trbVar.W;
                    if (mn4Var.J) {
                        mn4Var.R.O1(7);
                    }
                } else if (!trbVar.Q) {
                    ((w03) trbVar.O1()).b();
                }
                return Boolean.TRUE;
            case 9:
                if (!trbVar.M1()) {
                    mn4 mn4Var2 = trbVar.W;
                    if (mn4Var2.J) {
                        mn4Var2.R.O1(7);
                    }
                }
                trbVar.O.w(x2cVar);
                return Boolean.TRUE;
            case 10:
                z87.v(trbVar.v1(), null, null, new rrb(trbVar, null, 0), 3);
                return Boolean.TRUE;
            case 11:
                if (trbVar.e0 != null) {
                    ((w03) trbVar.O1()).b();
                } else {
                    trbVar.P1(true);
                }
                return pvcVar;
            default:
                trbVar.O.w(x2cVar);
                return pvcVar;
        }
    }
}
