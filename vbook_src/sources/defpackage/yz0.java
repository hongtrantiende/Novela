package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz0  reason: default package */
/* loaded from: classes3.dex */
public final class yz0 implements tj4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ora b;

    public /* synthetic */ yz0(ora oraVar, int i) {
        this.a = i;
        this.b = oraVar;
    }

    @Override // defpackage.tj4
    public final Object b(Object obj, m42 m42Var) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        ora oraVar = this.b;
        switch (i) {
            case 0:
                ez5 ez5Var = (ez5) obj;
                if (ez5Var instanceof ga5) {
                    oraVar.add(ez5Var);
                } else if (ez5Var instanceof ha5) {
                    oraVar.remove(((ha5) ez5Var).a);
                } else if (ez5Var instanceof jm4) {
                    oraVar.add(ez5Var);
                } else if (ez5Var instanceof km4) {
                    oraVar.remove(((km4) ez5Var).a);
                } else if (ez5Var instanceof l59) {
                    oraVar.add(ez5Var);
                } else if (ez5Var instanceof m59) {
                    oraVar.remove(((m59) ez5Var).a);
                } else if (ez5Var instanceof k59) {
                    oraVar.remove(((k59) ez5Var).a);
                }
                return pvcVar;
            default:
                ez5 ez5Var2 = (ez5) obj;
                if (ez5Var2 instanceof l59) {
                    oraVar.add(ez5Var2);
                } else if (ez5Var2 instanceof m59) {
                    oraVar.remove(((m59) ez5Var2).a);
                } else if (ez5Var2 instanceof k59) {
                    oraVar.remove(((k59) ez5Var2).a);
                } else if (ez5Var2 instanceof yi3) {
                    oraVar.add(ez5Var2);
                } else if (ez5Var2 instanceof zi3) {
                    oraVar.remove(((zi3) ez5Var2).a);
                } else if (ez5Var2 instanceof xi3) {
                    oraVar.remove(((xi3) ez5Var2).a);
                }
                return pvcVar;
        }
    }
}
