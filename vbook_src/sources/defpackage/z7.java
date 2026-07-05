package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z7  reason: default package */
/* loaded from: classes3.dex */
public final class z7 implements nu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z7(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7 = this.a;
        lh9 lh9Var = ax1.a;
        kq7 kq7Var = kq7.a;
        pvc pvcVar = pvc.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        int i8 = 2;
        switch (i7) {
            case 0:
                xg6 xg6Var = (xg6) obj;
                int intValue = ((Number) obj2).intValue();
                rv4 rv4Var = (rv4) obj3;
                int intValue2 = ((Number) obj4).intValue();
                b8 b8Var = (b8) obj5;
                if ((intValue2 & 6) == 0) {
                    if (rv4Var.f(xg6Var)) {
                        i8 = 4;
                    }
                    i = intValue2 | i8;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    if (rv4Var.d(intValue)) {
                        i2 = 32;
                    } else {
                        i2 = 16;
                    }
                    i |= i2;
                }
                if ((i & Token.EXPR_VOID) != 146) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(i & 1, z)) {
                    bzc bzcVar = (bzc) ((List) obj6).get(intValue);
                    rv4Var.e0(1401141470);
                    nq7 f = pna.f(kq7Var, 1.0f);
                    tza tzaVar = j27.a;
                    nq7 v = nmd.v(tte.k(f, ((h27) rv4Var.j(tzaVar)).c.d), ((h27) rv4Var.j(tzaVar)).a.I, lre.g);
                    boolean f2 = rv4Var.f(b8Var) | rv4Var.h(bzcVar);
                    Object P = rv4Var.P();
                    if (f2 || P == lh9Var) {
                        P = new w7(0, b8Var, bzcVar);
                        rv4Var.o0(P);
                    }
                    zr1.c(bzcVar, zbe.z(lbe.f(15, (vt4) P, v, null, false), 14.0f, 12.0f), rv4Var, 8);
                    rv4Var.q(false);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            case 1:
                do9 do9Var = (do9) obj;
                ((Boolean) obj2).getClass();
                rv4 rv4Var2 = (rv4) obj3;
                int intValue3 = ((Number) obj4).intValue();
                s81 s81Var = (s81) obj6;
                aw7 aw7Var = (aw7) obj5;
                do9Var.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var2.f(do9Var)) {
                        i8 = 4;
                    }
                    intValue3 |= i8;
                }
                if ((intValue3 & Token.DO) != 130) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var2.U(intValue3 & 1, z2)) {
                    nq7 C = zbe.C(pna.f(kq7Var, 1.0f), nae.e, nae.e, nae.e, 12.0f, 7);
                    co9 co9Var = co9.b;
                    zx1 zx1Var = zx1.W;
                    C.getClass();
                    nq7 j = lye.j(C, new rq(do9Var, tn3.e, co9Var, zx1Var, 1));
                    boolean f3 = rv4Var2.f(aw7Var) | rv4Var2.f(s81Var);
                    Object P2 = rv4Var2.P();
                    if (f3 || P2 == lh9Var) {
                        P2 = new w7(3, s81Var, aw7Var);
                        rv4Var2.o0(P2);
                    }
                    bbe.d(s81Var, j, (vt4) P2, rv4Var2, 0);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 2:
                xg6 xg6Var2 = (xg6) obj;
                int intValue4 = ((Number) obj2).intValue();
                rv4 rv4Var3 = (rv4) obj3;
                int intValue5 = ((Number) obj4).intValue();
                su0 su0Var = (su0) obj5;
                if ((intValue5 & 6) == 0) {
                    if (rv4Var3.f(xg6Var2)) {
                        i8 = 4;
                    }
                    i3 = intValue5 | i8;
                } else {
                    i3 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    if (rv4Var3.d(intValue4)) {
                        i4 = 32;
                    } else {
                        i4 = 16;
                    }
                    i3 |= i4;
                }
                if ((i3 & Token.EXPR_VOID) != 146) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (rv4Var3.U(i3 & 1, z3)) {
                    wh8 wh8Var = (wh8) ((List) obj6).get(intValue4);
                    rv4Var3.e0(560574658);
                    fu0.a(pna.p(kq7Var, su0Var.d(), su0Var.c()), rv4Var3, 0);
                    rv4Var3.q(false);
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            default:
                xg6 xg6Var3 = (xg6) obj;
                int intValue6 = ((Number) obj2).intValue();
                rv4 rv4Var4 = (rv4) obj3;
                int intValue7 = ((Number) obj4).intValue();
                if ((intValue7 & 6) == 0) {
                    if (rv4Var4.f(xg6Var3)) {
                        i8 = 4;
                    }
                    i5 = intValue7 | i8;
                } else {
                    i5 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    if (rv4Var4.d(intValue6)) {
                        i6 = 32;
                    } else {
                        i6 = 16;
                    }
                    i5 |= i6;
                }
                if ((i5 & Token.EXPR_VOID) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var4.U(i5 & 1, z4)) {
                    rv4Var4.e0(2035559173);
                    rgc.c((k81) obj5, (xl0) ((List) obj6).get(intValue6), null, rv4Var4, 0);
                    rv4Var4.q(false);
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
        }
    }
}
