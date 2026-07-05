package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: or0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class or0 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cz7 b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ or0(cz7 cz7Var, aw7 aw7Var, int i) {
        this.a = i;
        this.b = cz7Var;
        this.c = aw7Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int i3 = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.c;
        switch (i3) {
            case 0:
                rh8 rh8Var = (rh8) obj2;
                rv4 rv4Var = (rv4) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var.getClass();
                if ((intValue & 48) == 0) {
                    if (rv4Var.f(rh8Var)) {
                        i = 32;
                    } else {
                        i = 16;
                    }
                    intValue |= i;
                }
                int i4 = intValue;
                if ((i4 & Token.TARGET) != 144) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i4 & 1, z)) {
                    bkd r = mwe.r(rh8Var, zbe.j(12.0f, nae.e, 12.0f, 16.0f, 2));
                    v9e.b(this.b, r, new bkd(r, zbe.j(nae.e, nae.e, 8.0f, nae.e, 11), 0), (String) aw7Var.getValue(), true, pna.c, rv4Var, 221184, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rh8 rh8Var2 = (rh8) obj2;
                rv4 rv4Var2 = (rv4) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((ou0) obj).getClass();
                rh8Var2.getClass();
                if ((intValue2 & 48) == 0) {
                    if (rv4Var2.f(rh8Var2)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    intValue2 |= i2;
                }
                int i5 = intValue2;
                if ((i5 & Token.TARGET) != 144) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(i5 & 1, z2)) {
                    bkd r2 = mwe.r(rh8Var2, zbe.j(12.0f, nae.e, 12.0f, 16.0f, 2));
                    fre.a(this.b, r2, new bkd(r2, zbe.j(nae.e, nae.e, 8.0f, nae.e, 11), 0), (String) aw7Var.getValue(), true, pna.c, rv4Var2, 221184, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
