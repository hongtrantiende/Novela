package defpackage;

import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kvb  reason: default package */
/* loaded from: classes.dex */
public final class kvb {
    public final hm8 a = yae.z(null);
    public ps b;
    public final ora c;

    public kvb(ps psVar) {
        clb clbVar = new clb(21);
        psVar.getClass();
        ns nsVar = new ns(psVar);
        ArrayList arrayList = nsVar.c;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            List list = (List) clbVar.invoke(((ms) arrayList.get(i)).a(Integer.MIN_VALUE));
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                os osVar = (os) list.get(i2);
                Object obj = osVar.a;
                arrayList3.add(new ms(osVar.b, osVar.d, obj, osVar.c));
            }
            xl1.P(arrayList2, arrayList3);
        }
        arrayList.clear();
        arrayList.addAll(arrayList2);
        this.b = nsVar.k();
        this.c = new ora();
    }

    public static os c(os osVar, fvb fvbVar) {
        it7 it7Var = fvbVar.b;
        int c = it7Var.c(it7Var.f - 1, false);
        if (osVar.b >= c) {
            return null;
        }
        return os.a(osVar, null, 0, Math.min(osVar.c, c), 11);
    }

    public final void a(int i, rv4 rv4Var) {
        int i2;
        boolean z;
        char c;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        uva uvaVar;
        uva uvaVar2;
        uva uvaVar3;
        rv4Var.g0(1154651354);
        char c2 = 2;
        if (rv4Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z7 = false;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            xo xoVar = (xo) rv4Var.j(dy1.s);
            ps psVar = this.b;
            List a = psVar.a(psVar.b.length());
            int size = a.size();
            int i4 = 0;
            while (i4 < size) {
                os osVar = (os) a.get(i4);
                int i5 = osVar.b;
                Object obj = osVar.a;
                if (i5 != osVar.c) {
                    rv4Var.e0(725478935);
                    Object P = rv4Var.P();
                    Object obj2 = ax1.a;
                    if (P == obj2) {
                        P = s21.g(rv4Var);
                    }
                    yu7 yu7Var = (yu7) P;
                    c = c2;
                    nq7 k = axe.k(kq7.a, new cn9(26, this, osVar));
                    Object P2 = rv4Var.P();
                    if (P2 == obj2) {
                        z3 = true;
                        P2 = new clb(22);
                        rv4Var.o0(P2);
                    } else {
                        z3 = true;
                    }
                    nq7 g = p17.g(y7a.c(k, z7, (xt4) P2).a0(new gxb(new iu1(14, this, osVar))), yu7Var);
                    w09.a.getClass();
                    nq7 v = yf2.v(g, xpe.e);
                    boolean h = rv4Var.h(this) | rv4Var.f(osVar) | rv4Var.h(xoVar);
                    Object P3 = rv4Var.P();
                    if (h || P3 == obj2) {
                        P3 = new a0b(this, osVar, xoVar);
                        rv4Var.o0(P3);
                    }
                    uva uvaVar4 = null;
                    fu0.a(lbe.g(v, yu7Var, null, (vt4) P3, 508), rv4Var, 0);
                    fp6 fp6Var = (fp6) obj;
                    lvb b = fp6Var.b();
                    if (b == null || (b.a == null && b.b == null && b.c == null && b.d == null)) {
                        z2 = false;
                        rv4Var.e0(728331710);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(726303039);
                        Object P4 = rv4Var.P();
                        if (P4 == obj2) {
                            P4 = new vp6(yu7Var);
                            rv4Var.o0(P4);
                        }
                        vp6 vp6Var = (vp6) P4;
                        Object P5 = rv4Var.P();
                        if (P5 == obj2) {
                            P5 = new ov9(vp6Var, (m42) null, 17);
                            rv4Var.o0(P5);
                        }
                        yte.g((lu4) P5, rv4Var, pvc.a);
                        em8 em8Var = vp6Var.b;
                        em8 em8Var2 = vp6Var.b;
                        if ((em8Var.h() & 2) != 0) {
                            z4 = z3;
                        } else {
                            z4 = false;
                        }
                        Boolean valueOf = Boolean.valueOf(z4);
                        if ((em8Var2.h() & 1) != 0) {
                            z5 = z3;
                        } else {
                            z5 = false;
                        }
                        Boolean valueOf2 = Boolean.valueOf(z5);
                        if ((em8Var2.h() & 4) != 0) {
                            z6 = z3;
                        } else {
                            z6 = false;
                        }
                        Boolean valueOf3 = Boolean.valueOf(z6);
                        lvb b2 = fp6Var.b();
                        if (b2 != null) {
                            uvaVar = b2.a;
                        } else {
                            uvaVar = null;
                        }
                        lvb b3 = fp6Var.b();
                        if (b3 != null) {
                            uvaVar2 = b3.b;
                        } else {
                            uvaVar2 = null;
                        }
                        lvb b4 = fp6Var.b();
                        if (b4 != null) {
                            uvaVar3 = b4.c;
                        } else {
                            uvaVar3 = null;
                        }
                        lvb b5 = fp6Var.b();
                        if (b5 != null) {
                            uvaVar4 = b5.d;
                        }
                        Object[] objArr = {valueOf, valueOf2, valueOf3, uvaVar, uvaVar2, uvaVar3, uvaVar4};
                        boolean h2 = rv4Var.h(this) | rv4Var.f(osVar);
                        Object P6 = rv4Var.P();
                        if (h2 || P6 == obj2) {
                            P6 = new cn9(this, osVar, vp6Var);
                            rv4Var.o0(P6);
                        }
                        b(objArr, (xt4) P6, rv4Var, (i3 << 6) & 896);
                        z2 = false;
                        rv4Var.q(false);
                    }
                    rv4Var.q(z2);
                } else {
                    c = c2;
                    z2 = z7;
                    rv4Var.e0(728345598);
                    rv4Var.q(z2);
                }
                i4++;
                z7 = z2;
                c2 = c;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new el7(this, i, 29);
        }
    }

    public final void b(Object[] objArr, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(-2083052099);
        if ((i & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(this)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        rv4Var.b0(-358306546, Integer.valueOf(objArr.length));
        boolean z2 = false;
        if (rv4Var.d(objArr.length)) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i7 = i2 | i3;
        for (Object obj : objArr) {
            if (rv4Var.h(obj)) {
                i4 = 4;
            } else {
                i4 = 0;
            }
            i7 |= i4;
        }
        rv4Var.q(false);
        if ((i7 & 14) == 0) {
            i7 |= 2;
        }
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            l25 l25Var = new l25(2);
            ArrayList arrayList = l25Var.a;
            arrayList.add(xt4Var);
            l25Var.f(objArr);
            Object[] array = arrayList.toArray(new Object[arrayList.size()]);
            boolean h = rv4Var.h(this);
            if ((i7 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            }
            boolean z3 = h | z2;
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                P = new jj0(this, xt4Var, 1);
                rv4Var.o0(P);
            }
            yte.e(array, (xt4) P, rv4Var);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va(this, objArr, xt4Var, i, 28);
        }
    }
}
