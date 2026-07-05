package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w0a  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class w0a implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ w0a(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        boolean z2 = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    cvb.c(this.b, l0e.u(pna.f(kq7Var, 1.0f)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, rv4Var, 48, 24576, 245756);
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
                    cvb.c(this.b, l0e.u(pna.f(kq7Var, 1.0f)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, rv4Var2, 48, 24576, 245756);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z2)) {
                    cvb.c(this.b, l0e.u(pna.f(kq7Var, 1.0f)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, null, rv4Var3, 48, 24576, 245756);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var4.U(intValue4 & 1, z)) {
                    nq7 f = pna.f(kq7Var, 1.0f);
                    b37 d = fu0.d(kh5.a, false);
                    int hashCode = Long.hashCode(rv4Var4.T);
                    xt8 l = rv4Var4.l();
                    nq7 p = lye.p(rv4Var4, f);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var4.i0();
                    if (rv4Var4.S) {
                        rv4Var4.k(zx1Var);
                    } else {
                        rv4Var4.r0();
                    }
                    jce.F(qw1.f, rv4Var4, d);
                    jce.F(qw1.e, rv4Var4, l);
                    jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var4);
                    jce.F(qw1.d, rv4Var4, p);
                    qa5 qa5Var = qa5.a;
                    cvb.d(qa5.d(yqe.B((y3b) o2b.E.getValue(), new Object[]{this.b}, rv4Var4)), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((h27) rv4Var4.j(j27.a)).b.j, rv4Var4, 0, 0, 262142);
                    rs8.u(rv4Var4, true, kq7Var, 12.0f, rv4Var4);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
