package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hj0  reason: default package */
/* loaded from: classes.dex */
public abstract class hj0 {
    public static final long a = ote.a(40.0f, 40.0f);
    public static final /* synthetic */ int b = 0;

    public static final void a(dub dubVar, nq7 nq7Var, boolean z, boolean z2, og0 og0Var, oyb oybVar, t86 t86Var, pg0 pg0Var, osb osbVar, lu4 lu4Var, hy0 hy0Var, dmb dmbVar, k2a k2aVar, rv4 rv4Var, int i, int i2) {
        Object obj;
        int i3;
        Object obj2;
        boolean z3;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        boolean z4;
        boolean z5;
        osb osbVar2;
        k2a k2aVar2;
        nsb nsbVar;
        int i4;
        k2a u;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        rv4Var.g0(469439921);
        if ((i & 6) == 0) {
            obj = dubVar;
            if (rv4Var.f(obj)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i;
        } else {
            obj = dubVar;
            i3 = i;
        }
        int i14 = 16;
        if ((i & 48) == 0) {
            obj2 = nq7Var;
            if (rv4Var.f(obj2)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        } else {
            obj2 = nq7Var;
        }
        int i15 = i3 | 384;
        if ((i & 3072) == 0) {
            z3 = z2;
            if (rv4Var.g(z3)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i15 |= i11;
        } else {
            z3 = z2;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(og0Var)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i15 |= i10;
        }
        if ((196608 & i) == 0) {
            obj3 = oybVar;
            if (rv4Var.f(obj3)) {
                i9 = 131072;
            } else {
                i9 = Parser.ARGC_LIMIT;
            }
            i15 |= i9;
        } else {
            obj3 = oybVar;
        }
        if ((1572864 & i) == 0) {
            obj4 = t86Var;
            if (rv4Var.f(obj4)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i15 |= i8;
        } else {
            obj4 = t86Var;
        }
        if ((12582912 & i) == 0) {
            obj5 = pg0Var;
            if (rv4Var.f(obj5)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i15 |= i7;
        } else {
            obj5 = pg0Var;
        }
        int i16 = i15 | 100663296;
        if ((805306368 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i16 |= i6;
        }
        int i17 = i2 | 6;
        if ((i2 & 48) == 0) {
            obj6 = hy0Var;
            if (rv4Var.f(obj6)) {
                i14 = 32;
            }
            i17 |= i14;
        } else {
            obj6 = hy0Var;
        }
        if ((i2 & 384) == 0) {
            obj7 = dmbVar;
            if (rv4Var.f(obj7)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i17 |= i5;
        } else {
            obj7 = dmbVar;
        }
        int i18 = i17 | 3072;
        if ((i2 & 24576) == 0) {
            i18 = i17 | 11264;
        }
        boolean z6 = true;
        if ((306783379 & i16) == 306783378 && (i18 & 9363) == 9362) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (rv4Var.U(i16 & 1, z4)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i4 = i18 & (-57345);
                z6 = z;
                nsbVar = osbVar;
                u = k2aVar;
            } else {
                osb.s.getClass();
                nsbVar = tn3.K;
                i4 = i18 & (-57345);
                u = rte.u(rv4Var);
            }
            rv4Var.r();
            int i19 = i4 << 3;
            int i20 = (i19 & 57344) | (i4 & 14) | 384 | (i4 & Token.ASSIGN_MOD) | (i19 & 7168);
            dmb dmbVar2 = obj7;
            boolean z7 = z6;
            d(obj, obj2, z7, z3, og0Var, obj3, obj4, obj5, nsbVar, lu4Var, obj6, dmbVar2, u, rv4Var, i16 & 2147483646, i20);
            z5 = z7;
            osbVar2 = nsbVar;
            k2aVar2 = u;
        } else {
            rv4Var.X();
            z5 = z;
            osbVar2 = osbVar;
            k2aVar2 = k2aVar;
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new wi0(dubVar, nq7Var, z5, z2, og0Var, oybVar, t86Var, pg0Var, osbVar2, lu4Var, hy0Var, dmbVar, k2aVar2, i, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.jub r32, defpackage.xt4 r33, defpackage.nq7 r34, boolean r35, boolean r36, defpackage.oyb r37, defpackage.t86 r38, defpackage.q86 r39, boolean r40, int r41, int r42, defpackage.ted r43, defpackage.xt4 r44, defpackage.yu7 r45, defpackage.esa r46, defpackage.mu4 r47, defpackage.rv4 r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 845
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj0.b(jub, xt4, nq7, boolean, boolean, oyb, t86, q86, boolean, int, int, ted, xt4, yu7, esa, mu4, rv4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x031f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(java.lang.String r32, defpackage.xt4 r33, defpackage.nq7 r34, boolean r35, boolean r36, defpackage.oyb r37, defpackage.t86 r38, defpackage.q86 r39, boolean r40, int r41, int r42, defpackage.ted r43, defpackage.xt4 r44, defpackage.yu7 r45, defpackage.esa r46, defpackage.mu4 r47, defpackage.rv4 r48, int r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj0.c(java.lang.String, xt4, nq7, boolean, boolean, oyb, t86, q86, boolean, int, int, ted, xt4, yu7, esa, mu4, rv4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:242:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x043d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(defpackage.dub r36, defpackage.nq7 r37, boolean r38, boolean r39, defpackage.og0 r40, defpackage.oyb r41, defpackage.t86 r42, defpackage.pg0 r43, defpackage.osb r44, defpackage.lu4 r45, defpackage.hy0 r46, defpackage.dmb r47, defpackage.k2a r48, defpackage.rv4 r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj0.d(dub, nq7, boolean, boolean, og0, oyb, t86, pg0, osb, lu4, hy0, dmb, k2a, rv4, int, int):void");
    }

    public static final void e(ytb ytbVar, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        rv4Var.g0(1991581797);
        if (rv4Var.h(ytbVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            boolean f = rv4Var.f(ytbVar);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                P = yae.q(new yi0(ytbVar, 2));
                rv4Var.o0(P);
            }
            if (((Boolean) ((yya) P).getValue()).booleanValue()) {
                rv4Var.e0(535437134);
                boolean h = rv4Var.h(ytbVar);
                Object P2 = rv4Var.P();
                if (h || P2 == lh9Var) {
                    P2 = new fj0(ytbVar, 0);
                    rv4Var.o0(P2);
                }
                l88 l88Var = (l88) P2;
                boolean h2 = rv4Var.h(ytbVar);
                Object P3 = rv4Var.P();
                if (h2 || P3 == lh9Var) {
                    P3 = new gj0(ytbVar, 0);
                    rv4Var.o0(P3);
                }
                rv4Var2 = rv4Var;
                vh.a(l88Var, dab.b(kq7.a, ytbVar, (PointerInputEventHandler) P3), a, rv4Var2, 384, 0);
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var;
                rv4Var2.e0(535820573);
                rv4Var2.q(false);
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new zi0(ytbVar, i, 1);
        }
    }

    public static final void f(ytb ytbVar, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        lh9 lh9Var;
        kq7 kq7Var;
        rv4Var.g0(2025287684);
        if (rv4Var.h(ytbVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            boolean f = rv4Var.f(ytbVar);
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (f || P == lh9Var2) {
                P = yae.q(new yi0(ytbVar, 0));
                rv4Var.o0(P);
            }
            xrb xrbVar = (xrb) ((yya) P).getValue();
            boolean z2 = xrbVar.a;
            kq7 kq7Var2 = kq7.a;
            if (z2) {
                rv4Var.e0(-354609545);
                boolean h = rv4Var.h(ytbVar);
                Object P2 = rv4Var.P();
                if (h || P2 == lh9Var2) {
                    P2 = new fj0(ytbVar, 1);
                    rv4Var.o0(P2);
                }
                l88 l88Var = (l88) P2;
                oq9 oq9Var = xrbVar.d;
                boolean z3 = xrbVar.e;
                boolean h2 = rv4Var.h(ytbVar);
                Object P3 = rv4Var.P();
                if (h2 || P3 == lh9Var2) {
                    P3 = new gj0(ytbVar, 1);
                    rv4Var.o0(P3);
                }
                kq7Var = kq7Var2;
                lh9Var = lh9Var2;
                qre.n(l88Var, true, oq9Var, z3, a, xrbVar.c, dab.b(kq7Var2, ytbVar, (PointerInputEventHandler) P3), rv4Var, 24624, 0);
                rv4Var.q(false);
            } else {
                lh9Var = lh9Var2;
                kq7Var = kq7Var2;
                rv4Var.e0(-353981826);
                rv4Var.q(false);
            }
            boolean f2 = rv4Var.f(ytbVar);
            Object P4 = rv4Var.P();
            if (f2 || P4 == lh9Var) {
                P4 = yae.q(new yi0(ytbVar, 1));
                rv4Var.o0(P4);
            }
            xrb xrbVar2 = (xrb) ((yya) P4).getValue();
            if (xrbVar2.a) {
                rv4Var.e0(-353488678);
                boolean h3 = rv4Var.h(ytbVar);
                Object P5 = rv4Var.P();
                if (h3 || P5 == lh9Var) {
                    P5 = new fj0(ytbVar, 2);
                    rv4Var.o0(P5);
                }
                l88 l88Var2 = (l88) P5;
                oq9 oq9Var2 = xrbVar2.d;
                boolean z4 = xrbVar2.e;
                boolean h4 = rv4Var.h(ytbVar);
                Object P6 = rv4Var.P();
                if (h4 || P6 == lh9Var) {
                    P6 = new gj0(ytbVar, 2);
                    rv4Var.o0(P6);
                }
                qre.n(l88Var2, false, oq9Var2, z4, a, xrbVar2.c, dab.b(kq7Var, ytbVar, (PointerInputEventHandler) P6), rv4Var, 24624, 0);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-352863842);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zi0(ytbVar, i, 0);
        }
    }
}
