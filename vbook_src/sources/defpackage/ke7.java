package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ke7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ke7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ xt4 c;

    public /* synthetic */ ke7(int i, xt4 xt4Var, String str) {
        this.a = i;
        this.b = str;
        this.c = xt4Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        boolean z2 = false;
        xt4 xt4Var = this.c;
        String str = this.b;
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
                    nq2.d(0, xt4Var, rv4Var, zbe.x(zbe.C(pna.c, nae.e, 24.0f, nae.e, nae.e, 13), mwe.f(13, rv4Var, false)), str);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    tc4.d(48, xt4Var, rv4Var2, zbe.C(pna.f(kq7Var, 1.0f), nae.e, 24.0f, nae.e, nae.e, 13), str);
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
                    nq7 f = pna.f(kq7Var, 1.0f);
                    boolean f2 = rv4Var3.f(xt4Var);
                    Object P = rv4Var3.P();
                    if (f2 || P == ax1.a) {
                        P = new hg7(19, xt4Var);
                        rv4Var3.o0(P);
                    }
                    jsc.l(48, (vt4) P, rv4Var3, f, str);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
