package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jhc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jhc implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ w43 c;

    public /* synthetic */ jhc(boolean z, w43 w43Var, int i) {
        this.a = i;
        this.b = z;
        this.c = w43Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = 16.0f;
        boolean z2 = false;
        w43 w43Var = this.c;
        boolean z3 = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    if (z3) {
                        f = 12.0f;
                    }
                    rgc.f(null, f, jce.E(1432595889, new jhc(z3, w43Var, 1), rv4Var), jce.E(1643815568, new m0c(w43Var, 2), rv4Var), rv4Var, 3456);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    if (z3) {
                        rv4Var2.e0(-625811884);
                        xbe.i(rv4Var2, pna.h(kq7.a, 16.0f));
                        rgc.s(w43Var.b, null, rv4Var2, 0);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(-625568751);
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
