package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lhc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class lhc implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w43 b;
    public final /* synthetic */ shc c;

    public /* synthetic */ lhc(w43 w43Var, shc shcVar, int i) {
        this.a = i;
        this.b = w43Var;
        this.c = shcVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = false;
        w43 w43Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    rgc.e(null, 16.0f, jce.E(-859047092, new lhc(w43Var, this.c, 1), rv4Var), rv4Var, 432, 1);
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
                    boolean z2 = w43Var.i;
                    int i2 = w43Var.h;
                    shc shcVar = this.c;
                    boolean f = rv4Var2.f(shcVar);
                    Object P = rv4Var2.P();
                    if (f || P == ax1.a) {
                        vja vjaVar = new vja(0, shcVar, shc.class, "toggleLikeTopic", "toggleLikeTopic()V", 0, 18);
                        rv4Var2.o0(vjaVar);
                        P = vjaVar;
                    }
                    oc2.a(z2, i2, (vt4) ((i76) P), null, false, null, rv4Var2, 196608);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
