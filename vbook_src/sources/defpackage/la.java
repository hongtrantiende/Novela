package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: la  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class la implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;

    public /* synthetic */ la(int i, List list) {
        this.a = i;
        this.b = list;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        int i = this.a;
        int i2 = 2;
        pvc pvcVar = pvc.a;
        kq7 kq7Var = kq7.a;
        boolean z3 = false;
        List<String> list = this.b;
        switch (i) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                xg6Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(xg6Var)) {
                        i2 = 4;
                    }
                    intValue |= i2;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    w92.l(yqe.A((y3b) v1b.X.getValue(), rv4Var), list.size(), xg6.a(xg6Var, pna.f(kq7Var, 1.0f)), rv4Var, 0);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                xg6 xg6Var2 = (xg6) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                xg6Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var2.f(xg6Var2)) {
                        i2 = 4;
                    }
                    intValue2 |= i2;
                }
                if ((intValue2 & 19) != 18) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue2 & 1, z2)) {
                    w92.l(yqe.A((y3b) v1b.E.getValue(), rv4Var2), list.size(), xg6.a(xg6Var2, pna.f(kq7Var, 1.0f)), rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                rv4 rv4Var3 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((yf6) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var3.U(intValue3 & 1, z3)) {
                    o28.b(((sl5) sl1.c0(list)).d, zbe.A(pna.f(kq7Var, 1.0f), nae.e, 4.0f, 1), rv4Var3, 48);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var4 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((wl4) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                }
                if (rv4Var4.U(intValue4 & 1, z3)) {
                    for (String str : list) {
                        tza tzaVar = j27.a;
                        v72 v72Var = ((h27) rv4Var4.j(tzaVar)).c.a;
                        cvb.c(str, zbe.z(nmd.v(tte.k(kq7Var, v72Var), zl1.b(0.5f, ((h27) rv4Var4.j(tzaVar)).a.r), lre.g), 8.0f, 3.0f), ((h27) rv4Var4.j(tzaVar)).a.s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var4.j(tzaVar)).b.k, rv4Var4, 0, 0, 131064);
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
