package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b43  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class b43 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ya9 b;
    public final /* synthetic */ v43 c;
    public final /* synthetic */ rh8 d;

    public /* synthetic */ b43(ya9 ya9Var, v43 v43Var, rh8 rh8Var, int i) {
        this.a = i;
        this.b = ya9Var;
        this.c = v43Var;
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
        v43 v43Var = this.c;
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
                    na9.a.b(this.b, v43Var.a, zbe.C(ou0Var.a(kq7Var, kh5.b), nae.e, rh8Var.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var, 12582912);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
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
                    na9.a.b(this.b, v43Var.a, zbe.C(ou0Var2.a(kq7Var, kh5.b), nae.e, rh8Var.d(), nae.e, nae.e, 13), 0L, 0L, nae.e, rv4Var2, 12582912);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
