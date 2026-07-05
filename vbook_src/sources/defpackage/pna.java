package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pna */
/* loaded from: classes.dex */
public abstract class pna {
    public static final ze4 a;
    public static final ze4 b;
    public static final ze4 c;
    public static final pnd d;
    public static final pnd e;
    public static final pnd f;
    public static final pnd g;
    public static final pnd h;
    public static final pnd i;

    static {
        j73 j73Var = j73.b;
        a = new ze4(j73Var, 1.0f, "fillMaxWidth");
        j73 j73Var2 = j73.a;
        b = new ze4(j73Var2, 1.0f, "fillMaxHeight");
        j73 j73Var3 = j73.c;
        c = new ze4(j73Var3, 1.0f, "fillMaxSize");
        lk0 lk0Var = kh5.J;
        d = new pnd(j73Var, false, new m0c(lk0Var, 7), lk0Var, "wrapContentWidth");
        lk0 lk0Var2 = kh5.I;
        e = new pnd(j73Var, false, new m0c(lk0Var2, 7), lk0Var2, "wrapContentWidth");
        mk0 mk0Var = kh5.G;
        f = new pnd(j73Var2, false, new m0c(mk0Var, 8), mk0Var, "wrapContentHeight");
        mk0 mk0Var2 = kh5.F;
        g = new pnd(j73Var2, false, new m0c(mk0Var2, 8), mk0Var2, "wrapContentHeight");
        nk0 nk0Var = kh5.e;
        h = new pnd(j73Var3, false, new m0c(nk0Var, 9), nk0Var, "wrapContentSize");
        nk0 nk0Var2 = kh5.a;
        i = new pnd(j73Var3, false, new m0c(nk0Var2, 9), nk0Var2, "wrapContentSize");
    }

    public static final nq7 a(nq7 nq7Var, float f2, float f3) {
        return nq7Var.a0(new kxc(f2, f3));
    }

    public static /* synthetic */ nq7 b(nq7 nq7Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(nq7Var, f2, f3);
    }

    public static final nq7 c(nq7 nq7Var, float f2) {
        ze4 ze4Var;
        if (f2 == 1.0f) {
            ze4Var = b;
        } else {
            ze4Var = new ze4(j73.a, f2, "fillMaxHeight");
        }
        return nq7Var.a0(ze4Var);
    }

    public static nq7 e(nq7 nq7Var) {
        return nq7Var.a0(c);
    }

    public static final nq7 f(nq7 nq7Var, float f2) {
        ze4 ze4Var;
        if (f2 == 1.0f) {
            ze4Var = a;
        } else {
            ze4Var = new ze4(j73.b, f2, "fillMaxWidth");
        }
        return nq7Var.a0(ze4Var);
    }

    public static /* synthetic */ nq7 g(nq7 nq7Var) {
        return f(nq7Var, 1.0f);
    }

    public static final nq7 h(nq7 nq7Var, float f2) {
        return nq7Var.a0(new nna((float) nae.e, f2, (float) nae.e, f2, 5));
    }

    public static final nq7 i(nq7 nq7Var, float f2, float f3) {
        return nq7Var.a0(new nna((float) nae.e, f2, (float) nae.e, f3, 5));
    }

    public static /* synthetic */ nq7 j(nq7 nq7Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return i(nq7Var, f2, f3);
    }

    public static final nq7 k(nq7 nq7Var, float f2) {
        return nq7Var.a0(new nna(f2, f2, f2, f2, false));
    }

    public static final nq7 l(nq7 nq7Var, float f2, float f3) {
        return nq7Var.a0(new nna(f2, f3, f2, f3, false));
    }

    public static nq7 m(nq7 nq7Var, float f2, float f3, float f4, float f5, int i2) {
        float f6;
        float f7;
        float f8;
        if ((i2 & 2) != 0) {
            f6 = Float.NaN;
        } else {
            f6 = f3;
        }
        if ((i2 & 4) != 0) {
            f7 = Float.NaN;
        } else {
            f7 = f4;
        }
        if ((i2 & 8) != 0) {
            f8 = Float.NaN;
        } else {
            f8 = f5;
        }
        return nq7Var.a0(new nna(f2, f6, f7, f8, false));
    }

    public static final nq7 n(nq7 nq7Var, float f2) {
        return nq7Var.a0(new nna(f2, f2, f2, f2, true));
    }

    public static final nq7 o(long j, nq7 nq7Var) {
        return p(nq7Var, ug3.b(j), ug3.a(j));
    }

    public static final nq7 p(nq7 nq7Var, float f2, float f3) {
        return nq7Var.a0(new nna(f2, f3, f2, f3, true));
    }

    public static final nq7 q(nq7 nq7Var, float f2, float f3, float f4, float f5) {
        return nq7Var.a0(new nna(f2, f3, f4, f5, true));
    }

    public static /* synthetic */ nq7 r(nq7 nq7Var, float f2, float f3, float f4, int i2) {
        float f5 = Float.NaN;
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        if ((i2 & 8) == 0) {
            f5 = 200.0f;
        }
        return q(nq7Var, f2, f3, f4, f5);
    }

    public static final nq7 s(nq7 nq7Var, float f2) {
        return nq7Var.a0(new nna(f2, (float) nae.e, f2, (float) nae.e, 10));
    }

    public static final nq7 t(nq7 nq7Var, float f2, float f3) {
        return nq7Var.a0(new nna(f2, (float) nae.e, f3, (float) nae.e, 10));
    }

    public static /* synthetic */ nq7 u(nq7 nq7Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return t(nq7Var, f2, f3);
    }

    public static nq7 v(nq7 nq7Var) {
        pnd pndVar;
        mk0 mk0Var = kh5.G;
        if (c16.i(mk0Var, mk0Var)) {
            pndVar = f;
        } else if (c16.i(mk0Var, kh5.F)) {
            pndVar = g;
        } else {
            pndVar = new pnd(j73.a, false, new m0c(mk0Var, 8), mk0Var, "wrapContentHeight");
        }
        return nq7Var.a0(pndVar);
    }

    public static final nq7 w(nq7 nq7Var, nk0 nk0Var, boolean z) {
        pnd pndVar;
        if (nk0Var.equals(kh5.e) && !z) {
            pndVar = h;
        } else if (nk0Var.equals(kh5.a) && !z) {
            pndVar = i;
        } else {
            pndVar = new pnd(j73.c, z, new m0c(nk0Var, 9), nk0Var, "wrapContentSize");
        }
        return nq7Var.a0(pndVar);
    }

    public static nq7 x(nq7 nq7Var) {
        pnd pndVar;
        lk0 lk0Var = kh5.J;
        if (c16.i(lk0Var, lk0Var)) {
            pndVar = d;
        } else if (c16.i(lk0Var, kh5.I)) {
            pndVar = e;
        } else {
            pndVar = new pnd(j73.b, false, new m0c(lk0Var, 7), lk0Var, "wrapContentWidth");
        }
        return nq7Var.a0(pndVar);
    }
}
