package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: khc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class khc implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e33 b;

    public /* synthetic */ khc(e33 e33Var, int i) {
        this.a = i;
        this.b = e33Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        e33 e33Var = this.b;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    rgc.f(null, 10.0f, jce.E(-1723537599, new khc(e33Var, 1), rv4Var), jce.E(303274754, new khc(e33Var, 2), rv4Var), rv4Var, 3504);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    f33 f33Var = e33Var.e;
                    if (f33Var != null) {
                        rv4Var2.e0(425583551);
                        xbe.i(rv4Var2, pna.h(kq7.a, 12.0f));
                        rgc.g(f33Var, null, rv4Var2, 8);
                        rv4Var2.q(false);
                    } else {
                        rv4Var2.e0(425831489);
                        rv4Var2.q(false);
                    }
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z2)) {
                    bzc bzcVar = e33Var.c;
                    rgc.a(bzcVar, e33Var.i, false, null, bzcVar.c, rv4Var3, 392);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
