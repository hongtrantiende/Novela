package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gv1  reason: default package */
/* loaded from: classes.dex */
public final class gv1 implements mu4 {
    public static final gv1 b = new gv1(0);
    public static final gv1 c = new gv1(1);
    public static final gv1 d = new gv1(2);
    public static final gv1 e = new gv1(3);
    public final /* synthetic */ int a;

    public /* synthetic */ gv1(int i) {
        this.a = i;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.a;
        pvc pvcVar = pvc.a;
        switch (i2) {
            case 0:
                zc2 zc2Var = (zc2) obj;
                rv4 rv4Var = (rv4) obj2;
                int intValue = ((Number) obj3).intValue();
                zc2Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var.f(zc2Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) == 18 && rv4Var.E()) {
                    rv4Var.X();
                } else {
                    xm5.b(zc2Var, rv4Var, intValue & 14);
                }
                return pvcVar;
            case 1:
                return null;
            case 2:
                ak3 ak3Var = (ak3) obj;
                long j = ((y78) obj2).a;
                long j2 = ((zl1) obj3).a;
                kpa kpaVar = kpa.a;
                ak3.D0(ak3Var, j2, ak3Var.L0(kpa.c) / 2.0f, j, nae.e, null, 120);
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj2;
                ((Number) obj3).intValue();
                ((nq7) obj).getClass();
                rv4Var2.e0(1945386942);
                nq7 k = tte.k(kq7.a, v72.d(((h27) rv4Var2.j(j27.a)).c.d, new sg3(nae.e), new sg3(nae.e), null, null, 12));
                rv4Var2.q(false);
                return k;
        }
    }
}
