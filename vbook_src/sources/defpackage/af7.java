package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: af7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class af7 implements lu4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ m13 b;
    public final /* synthetic */ lu4 c;

    public /* synthetic */ af7(m13 m13Var, lu4 lu4Var) {
        this.b = m13Var;
        this.c = lu4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        lu4 lu4Var = this.c;
        m13 m13Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    boolean z2 = !k4b.j0((String) m13Var.b.getValue());
                    boolean f = rv4Var.f(lu4Var) | rv4Var.f(m13Var);
                    Object P = rv4Var.P();
                    if (f || P == ax1.a) {
                        P = new mf6(14, lu4Var, m13Var);
                        rv4Var.o0(P);
                    }
                    nmd.j((vt4) P, null, z2, null, null, null, jce.E(-284522330, new qo4(m13Var, 24), rv4Var), rv4Var, 805306368, 506);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                o28.i(m13Var, lu4Var, (rv4) obj, xoe.p(1));
                return pvcVar;
        }
    }

    public /* synthetic */ af7(m13 m13Var, lu4 lu4Var, int i) {
        this.b = m13Var;
        this.c = lu4Var;
    }
}
