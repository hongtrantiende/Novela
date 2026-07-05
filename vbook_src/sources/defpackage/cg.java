package defpackage;

import android.os.Build;
import android.view.SoundEffectConstants;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cg  reason: default package */
/* loaded from: classes.dex */
public final class cg implements lu4 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cg(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int contantForFocusDirection;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                int i2 = ((em4) obj).a;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Integer c = lm4.c(i2);
                if (c != null) {
                    int intValue = c.intValue();
                    if (Build.VERSION.SDK_INT >= 31) {
                        contantForFocusDirection = vu.a.a(intValue, booleanValue);
                    } else {
                        contantForFocusDirection = SoundEffectConstants.getContantForFocusDirection(intValue);
                    }
                    ((rg) obj3).playSoundEffect(contantForFocusDirection);
                }
                return pvcVar;
            default:
                rv4 rv4Var = (rv4) obj;
                tu1 tu1Var = (tu1) obj3;
                if ((((Number) obj2).intValue() & 3) == 2 && rv4Var.E()) {
                    rv4Var.X();
                } else {
                    boolean booleanValue2 = ((Boolean) rv4Var.j(i62.a)).booleanValue();
                    kq7 kq7Var = kq7.a;
                    if (booleanValue2) {
                        rv4Var.e0(-373733426);
                        nq7 C = rte.C(kq7Var, rte.u(rv4Var), 14);
                        xn1 a = wn1.a(new hz(8.0f, false, new vs(3)), kh5.I, rv4Var, 6);
                        int e = p17.e(rv4Var);
                        xt8 l = rv4Var.l();
                        nq7 p = lye.p(rv4Var, C);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var.i0();
                        if (rv4Var.S) {
                            rv4Var.k(zx1Var);
                        } else {
                            rv4Var.r0();
                        }
                        jce.F(qw1.f, rv4Var, a);
                        jce.F(qw1.e, rv4Var, l);
                        np npVar = qw1.g;
                        if (rv4Var.S || !c16.i(rv4Var.P(), Integer.valueOf(e))) {
                            rv4Var.o0(Integer.valueOf(e));
                            rv4Var.b(Integer.valueOf(e), npVar);
                        }
                        jce.F(qw1.d, rv4Var, p);
                        tu1Var.invoke(rv4Var, 0);
                        rv4Var.q(true);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-373726479);
                        nq7 q = rte.q(kq7Var, rte.u(rv4Var), 14);
                        gv9 a2 = ev9.a(new hz(8.0f, true, new q6(kh5.J, 1)), kh5.F, rv4Var, 6);
                        int e2 = p17.e(rv4Var);
                        xt8 l2 = rv4Var.l();
                        nq7 p2 = lye.p(rv4Var, q);
                        rw1.k.getClass();
                        zx1 zx1Var2 = qw1.b;
                        rv4Var.i0();
                        if (rv4Var.S) {
                            rv4Var.k(zx1Var2);
                        } else {
                            rv4Var.r0();
                        }
                        jce.F(qw1.f, rv4Var, a2);
                        jce.F(qw1.e, rv4Var, l2);
                        np npVar2 = qw1.g;
                        if (rv4Var.S || !c16.i(rv4Var.P(), Integer.valueOf(e2))) {
                            rv4Var.o0(Integer.valueOf(e2));
                            rv4Var.b(Integer.valueOf(e2), npVar2);
                        }
                        jce.F(qw1.d, rv4Var, p2);
                        tu1Var.invoke(rv4Var, 0);
                        rv4Var.q(true);
                        rv4Var.q(false);
                    }
                }
                return pvcVar;
        }
    }
}
