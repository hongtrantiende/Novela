package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qh7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh7 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ tu1 d;
    public final /* synthetic */ tu1 e;

    public /* synthetic */ qh7(boolean z, xt4 xt4Var, tu1 tu1Var, tu1 tu1Var2, int i) {
        this.a = i;
        this.b = z;
        this.c = xt4Var;
        this.d = tu1Var;
        this.e = tu1Var2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        boolean z = false;
        int i2 = 2;
        tu1 tu1Var = this.e;
        tu1 tu1Var2 = this.d;
        switch (i) {
            case 0:
                su0 su0Var = (su0) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(su0Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nmd.d(this.b, this.c, pna.h(kq7Var, (su0Var.c() * 8.0f) / 9.0f), true, null, null, ((h27) rv4Var.j(j27.a)).a.p, 0L, nae.e, 0L, jce.E(-1391965631, new x0a(tu1Var2, 10), rv4Var), jce.E(2124134834, new z0a(tu1Var, 3), rv4Var), rv4Var, 3072, 54, 944);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                su0 su0Var2 = (su0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(su0Var2)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    nmd.d(this.b, this.c, pna.h(kq7Var, (su0Var2.c() * 8.0f) / 9.0f), true, null, null, ((h27) rv4Var2.j(j27.a)).a.p, 0L, nae.e, 0L, jce.E(379303614, new x0a(tu1Var2, 11), rv4Var2), jce.E(-136655761, new z0a(tu1Var, 4), rv4Var2), rv4Var2, 3072, 54, 944);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                su0 su0Var3 = (su0) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                su0Var3.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var3.f(su0Var3)) {
                        i2 = 4;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) != 18) {
                    z = true;
                }
                if (rv4Var3.U(intValue3 & 1, z)) {
                    nmd.d(this.b, this.c, pna.h(kq7Var, (su0Var3.c() * 8.0f) / 9.0f), true, null, null, ((h27) rv4Var3.j(j27.a)).a.p, 0L, nae.e, 0L, jce.E(-535515498, new x0a(tu1Var2, 12), rv4Var3), jce.E(-1702230585, new z0a(tu1Var, 5), rv4Var3), rv4Var3, 3072, 54, 944);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
