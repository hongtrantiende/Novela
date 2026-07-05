package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class j0 implements vt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t0 b;

    public /* synthetic */ j0(t0 t0Var, int i) {
        this.a = i;
        this.b = t0Var;
    }

    @Override // defpackage.vt4
    public final Object invoke() {
        f03 f03Var;
        int i = this.a;
        t0 t0Var = this.b;
        switch (i) {
            case 0:
                iu5 iu5Var = (iu5) nye.q(t0Var, fu5.a);
                if (iu5Var == null) {
                    ov5.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + iu5Var);
                }
                iu5 iu5Var2 = t0Var.U;
                t0Var.U = iu5Var;
                if (iu5Var2 != null && !c16.i(iu5Var, iu5Var2) && ((f03Var = t0Var.X) != null || !t0Var.e0)) {
                    if (f03Var != null) {
                        t0Var.I1(f03Var);
                    }
                    t0Var.X = null;
                    t0Var.S1();
                }
                return pvc.a;
            default:
                t0Var.W1();
                return Boolean.TRUE;
        }
    }
}
