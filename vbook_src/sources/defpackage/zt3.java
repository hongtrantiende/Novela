package defpackage;

import java.util.LinkedHashMap;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zt3 */
/* loaded from: classes.dex */
public abstract class zt3 {
    public static final drc a = new drc(vt3.b, vt3.c);
    public static final gxa b = tte.v(nae.e, 400.0f, 5, null);
    public static final gxa c = tte.v(nae.e, 400.0f, 5, null);
    public static final gxa d;
    public static final gxa e;

    static {
        rk9 rk9Var = qed.a;
        d = tte.v(nae.e, 400.0f, 1, new py5(4294967297L));
        e = tte.v(nae.e, 400.0f, 1, new zy5(4294967297L));
    }

    public static final void a(tkc tkcVar, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4Var.g0(-1186853286);
        if (rv4Var.f(tkcVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            hm8 hm8Var = tkcVar.e;
            hm8 hm8Var2 = tkcVar.d;
            if (hm8Var.getValue() != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (c16.i(tkcVar.a.z(), hm8Var2.getValue()) && !z2) {
                vt4Var.invoke();
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            boolean[] zArr = P;
            if (P == lh9Var) {
                boolean[] zArr2 = {z2};
                rv4Var.o0(zArr2);
                zArr = zArr2;
            }
            boolean[] zArr3 = (boolean[]) zArr;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new Object[1];
                rv4Var.o0(P2);
            }
            Object[] objArr = (Object[]) P2;
            if (!c16.i(objArr[0], hm8Var2.getValue())) {
                if (!z2 && !zArr3[0]) {
                    vt4Var.invoke();
                }
                objArr[0] = hm8Var2.getValue();
            }
            zArr3[0] = z2;
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jh(i, 1, vt4Var, tkcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:219:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x033e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:308:0x036e A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.nq7 b(defpackage.tkc r19, defpackage.eu3 r20, defpackage.lz3 r21, defpackage.vt4 r22, defpackage.sga r23, java.lang.String r24, defpackage.rv4 r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 919
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zt3.b(tkc, eu3, lz3, vt4, sga, java.lang.String, rv4, int, int):nq7");
    }

    public static eu3 c() {
        nk0 nk0Var;
        rk9 rk9Var = qed.a;
        gxa v = tte.v(nae.e, 400.0f, 1, new zy5(4294967297L));
        lk0 lk0Var = kh5.K;
        if (lk0Var.equals(kh5.I)) {
            nk0Var = kh5.d;
        } else if (lk0Var.equals(lk0Var)) {
            nk0Var = kh5.f;
        } else {
            nk0Var = kh5.e;
        }
        return d(nk0Var, new co9(1, 11), v);
    }

    public static final eu3 d(nk0 nk0Var, xt4 xt4Var, gxa gxaVar) {
        return new eu3(new ukc((qa4) null, (dpa) null, new qa1(nk0Var, xt4Var, gxaVar), (iz9) null, (v4d) null, (LinkedHashMap) null, (int) Token.EXPORT));
    }

    public static eu3 e(int i) {
        nk0 nk0Var;
        mk0 mk0Var = kh5.H;
        rk9 rk9Var = qed.a;
        gxa v = tte.v(nae.e, 400.0f, 1, new zy5(4294967297L));
        if (c16.i(mk0Var, kh5.F)) {
            nk0Var = kh5.b;
        } else if (c16.i(mk0Var, mk0Var)) {
            nk0Var = kh5.D;
        } else {
            nk0Var = kh5.e;
        }
        return d(nk0Var, new co9(1, 12), v);
    }

    public static final eu3 f(float f, lf4 lf4Var) {
        return new eu3(new ukc(new qa4(f, lf4Var), (dpa) null, (qa1) null, (iz9) null, (v4d) null, (LinkedHashMap) null, (int) Token.ELSE));
    }

    public static /* synthetic */ eu3 g(lf4 lf4Var, int i) {
        if ((i & 1) != 0) {
            lf4Var = tte.v(nae.e, 400.0f, 5, null);
        }
        return f(nae.e, lf4Var);
    }

    public static final lz3 h(float f, lf4 lf4Var) {
        return new lz3(new ukc(new qa4(f, lf4Var), (dpa) null, (qa1) null, (iz9) null, (v4d) null, (LinkedHashMap) null, (int) Token.ELSE));
    }

    public static /* synthetic */ lz3 i(lf4 lf4Var, int i) {
        if ((i & 1) != 0) {
            lf4Var = tte.v(nae.e, 400.0f, 5, null);
        }
        return h(nae.e, lf4Var);
    }

    public static final eu3 j(float f, long j, lf4 lf4Var) {
        return new eu3(new ukc((qa4) null, (dpa) null, (qa1) null, new iz9(f, j, lf4Var), (v4d) null, (LinkedHashMap) null, (int) Token.INC));
    }

    public static eu3 k(arc arcVar, float f, long j, int i) {
        lf4 lf4Var = arcVar;
        if ((i & 1) != 0) {
            lf4Var = tte.v(nae.e, 400.0f, 5, null);
        }
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = ckc.b;
        }
        return j(f, j, lf4Var);
    }

    public static final lz3 l(float f, long j, lf4 lf4Var) {
        return new lz3(new ukc((qa4) null, (dpa) null, (qa1) null, new iz9(f, j, lf4Var), (v4d) null, (LinkedHashMap) null, (int) Token.INC));
    }

    public static lz3 m(float f, long j, int i) {
        gxa v = tte.v(nae.e, 400.0f, 5, null);
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            j = ckc.b;
        }
        return l(f, j, v);
    }

    public static lz3 n() {
        nk0 nk0Var;
        rk9 rk9Var = qed.a;
        gxa v = tte.v(nae.e, 400.0f, 1, new zy5(4294967297L));
        lk0 lk0Var = kh5.K;
        if (lk0Var.equals(kh5.I)) {
            nk0Var = kh5.d;
        } else if (lk0Var.equals(lk0Var)) {
            nk0Var = kh5.f;
        } else {
            nk0Var = kh5.e;
        }
        return o(nk0Var, new co9(1, 13), v);
    }

    public static final lz3 o(nk0 nk0Var, xt4 xt4Var, gxa gxaVar) {
        return new lz3(new ukc((qa4) null, (dpa) null, new qa1(nk0Var, xt4Var, gxaVar), (iz9) null, (v4d) null, (LinkedHashMap) null, (int) Token.EXPORT));
    }

    public static lz3 p(int i) {
        nk0 nk0Var;
        mk0 mk0Var = kh5.H;
        rk9 rk9Var = qed.a;
        gxa v = tte.v(nae.e, 400.0f, 1, new zy5(4294967297L));
        if (c16.i(mk0Var, kh5.F)) {
            nk0Var = kh5.b;
        } else if (c16.i(mk0Var, mk0Var)) {
            nk0Var = kh5.D;
        } else {
            nk0Var = kh5.e;
        }
        return o(nk0Var, new co9(1, 14), v);
    }

    public static final eu3 q(lf4 lf4Var, xt4 xt4Var) {
        return new eu3(new ukc((qa4) null, new dpa(lf4Var, xt4Var), (qa1) null, (iz9) null, (v4d) null, (LinkedHashMap) null, (int) Token.IF));
    }

    public static final eu3 r(lf4 lf4Var, xt4 xt4Var) {
        return q(lf4Var, new t41(1, xt4Var));
    }

    public static /* synthetic */ eu3 s(xt4 xt4Var) {
        rk9 rk9Var = qed.a;
        return r(tte.v(nae.e, 400.0f, 1, new py5(4294967297L)), xt4Var);
    }

    public static eu3 t(xt4 xt4Var) {
        rk9 rk9Var = qed.a;
        return q(tte.v(nae.e, 400.0f, 1, new py5(4294967297L)), new t41(2, xt4Var));
    }

    public static final lz3 u(lf4 lf4Var, xt4 xt4Var) {
        return new lz3(new ukc((qa4) null, new dpa(lf4Var, xt4Var), (qa1) null, (iz9) null, (v4d) null, (LinkedHashMap) null, (int) Token.IF));
    }

    public static final lz3 v(lf4 lf4Var, xt4 xt4Var) {
        return u(lf4Var, new t41(3, xt4Var));
    }

    public static /* synthetic */ lz3 w(xt4 xt4Var) {
        rk9 rk9Var = qed.a;
        return v(tte.v(nae.e, 400.0f, 1, new py5(4294967297L)), xt4Var);
    }

    public static lz3 x(xt4 xt4Var) {
        rk9 rk9Var = qed.a;
        return u(tte.v(nae.e, 400.0f, 1, new py5(4294967297L)), new t41(4, xt4Var));
    }

    public static final eu3 y(tkc tkcVar, eu3 eu3Var, rv4 rv4Var, int i) {
        boolean z;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(tkcVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        if (z || P == ax1.a) {
            P = yae.z(eu3Var);
            rv4Var.o0(P);
        }
        aw7 aw7Var = (aw7) P;
        c3e c3eVar = tkcVar.a;
        hm8 hm8Var = tkcVar.d;
        if (c3eVar.z() == hm8Var.getValue() && tkcVar.a.z() == st3.b) {
            if (tkcVar.g()) {
                aw7Var.setValue(eu3Var);
            } else {
                aw7Var.setValue(eu3.b);
            }
        } else if (hm8Var.getValue() != st3.c) {
            aw7Var.setValue(((eu3) aw7Var.getValue()).a(eu3Var));
        }
        return (eu3) aw7Var.getValue();
    }

    public static final lz3 z(tkc tkcVar, lz3 lz3Var, rv4 rv4Var, int i) {
        boolean z;
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(tkcVar)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        if (z || P == ax1.a) {
            P = yae.z(lz3Var);
            rv4Var.o0(P);
        }
        aw7 aw7Var = (aw7) P;
        c3e c3eVar = tkcVar.a;
        hm8 hm8Var = tkcVar.d;
        Object z2 = c3eVar.z();
        Object value = hm8Var.getValue();
        st3 st3Var = st3.b;
        if (z2 == value && tkcVar.a.z() == st3Var) {
            if (tkcVar.g()) {
                aw7Var.setValue(lz3Var);
            } else {
                aw7Var.setValue(lz3.b);
            }
        } else if (hm8Var.getValue() != st3Var) {
            aw7Var.setValue(((lz3) aw7Var.getValue()).a(lz3Var));
        }
        return (lz3) aw7Var.getValue();
    }
}
