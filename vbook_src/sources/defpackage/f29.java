package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f29  reason: default package */
/* loaded from: classes.dex */
public final class f29 implements lu4 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ int b;
    public final /* synthetic */ tu1 c;

    public f29(boolean z, int i, tu1 tu1Var) {
        this.a = z;
        this.b = i;
        this.c = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        rv4 rv4Var = (rv4) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
            rv4Var.X();
        } else {
            boolean z = this.a;
            Object obj3 = ax1.a;
            final tu1 tu1Var = this.c;
            final int i = this.b;
            if (z) {
                rv4Var.e0(-1414255090);
                rv4Var.e0(-1633490746);
                boolean d = rv4Var.d(i) | rv4Var.f(tu1Var);
                Object P = rv4Var.P();
                if (d || P == obj3) {
                    P = new xt4() { // from class: d29
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj4) {
                            int i2 = r2;
                            pvc pvcVar = pvc.a;
                            tu1 tu1Var2 = tu1Var;
                            int i3 = i;
                            ri6 ri6Var = (ri6) obj4;
                            switch (i2) {
                                case 0:
                                    ri6Var.getClass();
                                    ri6.A(ri6Var, i3, null, new tu1(new e29(tu1Var2, 0), true, -1471992585), 6);
                                    return pvcVar;
                                default:
                                    ri6Var.getClass();
                                    ri6.A(ri6Var, i3, null, new tu1(new e29(tu1Var2, 1), true, -1539536650), 6);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P);
                }
                rv4Var.q(false);
                jce.d(null, null, null, false, null, null, null, false, null, (xt4) P, rv4Var, 0, 511);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1414252341);
                rv4Var.e0(-1633490746);
                boolean d2 = rv4Var.d(i) | rv4Var.f(tu1Var);
                Object P2 = rv4Var.P();
                if (d2 || P2 == obj3) {
                    P2 = new xt4() { // from class: d29
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj4) {
                            int i2 = r2;
                            pvc pvcVar = pvc.a;
                            tu1 tu1Var2 = tu1Var;
                            int i3 = i;
                            ri6 ri6Var = (ri6) obj4;
                            switch (i2) {
                                case 0:
                                    ri6Var.getClass();
                                    ri6.A(ri6Var, i3, null, new tu1(new e29(tu1Var2, 0), true, -1471992585), 6);
                                    return pvcVar;
                                default:
                                    ri6Var.getClass();
                                    ri6.A(ri6Var, i3, null, new tu1(new e29(tu1Var2, 1), true, -1539536650), 6);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var.o0(P2);
                }
                rv4Var.q(false);
                jce.e(null, null, null, false, null, null, null, false, null, (xt4) P2, rv4Var, 0, 511);
                rv4Var.q(false);
            }
        }
        return pvc.a;
    }
}
