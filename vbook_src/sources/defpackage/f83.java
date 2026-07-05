package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f83  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class f83 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya9 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ rh8 d;

    public /* synthetic */ f83(ya9 ya9Var, boolean z, rh8 rh8Var, int i) {
        this.a = i;
        this.b = ya9Var;
        this.c = z;
        this.d = rh8Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        boolean z = false;
        int i2 = 2;
        rh8 rh8Var = this.d;
        switch (i) {
            case 0:
                ou0 ou0Var = (ou0) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                ou0Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(ou0Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    na9.a.b(this.b, this.c, zbe.C(ou0Var.a(kq7Var, kh5.b), nae.e, rh8Var.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var, 12582912);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                ou0 ou0Var2 = (ou0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ou0Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(ou0Var2)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    na9.a.b(this.b, this.c, zbe.C(ou0Var2.a(kq7Var, kh5.b), nae.e, rh8Var.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var2, 12582912);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            default:
                ou0 ou0Var3 = (ou0) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ou0Var3.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var3.f(ou0Var3)) {
                        i2 = 4;
                    }
                    intValue3 |= i2;
                }
                if ((intValue3 & 19) != 18) {
                    z = true;
                }
                if (rv4Var3.U(intValue3 & 1, z)) {
                    na9.a.b(this.b, this.c, zbe.C(ou0Var3.a(kq7Var, kh5.b), nae.e, rh8Var.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var3, 12582912);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
        }
    }
}
