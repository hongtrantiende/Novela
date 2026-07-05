package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nq  reason: default package */
/* loaded from: classes.dex */
public abstract class nq {
    public static final gxa a = tte.v(nae.e, nae.e, 7, null);
    public static final gxa b;

    static {
        rk9 rk9Var = qed.a;
        b = tte.v(nae.e, nae.e, 3, new rg3(0.4f));
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
        Float.floatToRawIntBits(1.0f);
    }

    public static final yya a(float f, lf4 lf4Var, String str, rv4 rv4Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            lf4Var = b;
        }
        lf4 lf4Var2 = lf4Var;
        if ((i2 & 4) != 0) {
            str = "DpAnimation";
        }
        int i3 = i << 6;
        return c(new rg3(f), fca.h, lf4Var2, null, str, rv4Var, (i & 14) | ((i << 3) & 896) | (57344 & i3) | (i3 & 458752), 8);
    }

    public static final yya b(float f, xr xrVar, String str, rv4 rv4Var, int i, int i2) {
        int i3 = i2 & 2;
        gxa gxaVar = a;
        if (i3 != 0) {
            xrVar = gxaVar;
        }
        if ((i2 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        if (xrVar == gxaVar) {
            rv4Var.e0(1144115775);
            boolean c = rv4Var.c(0.01f);
            Object P = rv4Var.P();
            if (c || P == ax1.a) {
                P = tte.v(nae.e, nae.e, 3, Float.valueOf(0.01f));
                rv4Var.o0(P);
            }
            xrVar = (gxa) P;
            rv4Var.q(false);
        } else {
            rv4Var.e0(1144225701);
            rv4Var.q(false);
        }
        return c(Float.valueOf(f), fca.f, xrVar, null, str2, rv4Var, (i & 14) | (57344 & (i << 3)), 0);
    }

    public static final yya c(Object obj, drc drcVar, xr xrVar, Float f, String str, rv4 rv4Var, int i, int i2) {
        Float f2;
        boolean z;
        xr xrVar2 = xrVar;
        if ((i2 & 8) != 0) {
            f2 = null;
        } else {
            f2 = f;
        }
        Object P = rv4Var.P();
        Object obj2 = ax1.a;
        if (P == obj2) {
            P = yae.z(null);
            rv4Var.o0(P);
        }
        aw7 aw7Var = (aw7) P;
        Object P2 = rv4Var.P();
        if (P2 == obj2) {
            P2 = new lq(obj, drcVar, f2);
            rv4Var.o0(P2);
        }
        lq lqVar = (lq) P2;
        Object D = yae.D(null, rv4Var);
        gxa gxaVar = xrVar2;
        if (f2 != null) {
            boolean z2 = xrVar2 instanceof gxa;
            gxaVar = xrVar2;
            if (z2) {
                gxa gxaVar2 = (gxa) xrVar2;
                gxaVar = xrVar2;
                if (!c16.i(gxaVar2.c, f2)) {
                    gxaVar = new gxa(gxaVar2.a, gxaVar2.b, f2);
                }
            }
        }
        Object D2 = yae.D(gxaVar, rv4Var);
        Object P3 = rv4Var.P();
        if (P3 == obj2) {
            P3 = xpe.a(-1, 6, null);
            rv4Var.o0(P3);
        }
        Object obj3 = (ta1) P3;
        boolean h = rv4Var.h(obj3);
        if ((((i & 14) ^ 6) > 4 && rv4Var.h(obj)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = h | z;
        Object P4 = rv4Var.P();
        if (z3 || P4 == obj2) {
            P4 = new t7(7, obj3, obj);
            rv4Var.o0(P4);
        }
        yte.k((vt4) P4, rv4Var);
        boolean h2 = rv4Var.h(obj3) | rv4Var.h(lqVar) | rv4Var.f(D2) | rv4Var.f(D);
        Object P5 = rv4Var.P();
        if (h2 || P5 == obj2) {
            Object daVar = new da(obj3, lqVar, D2, D, (m42) null, 2);
            rv4Var.o0(daVar);
            P5 = daVar;
        }
        yte.g((lu4) P5, rv4Var, obj3);
        yya yyaVar = (yya) aw7Var.getValue();
        if (yyaVar == null) {
            return lqVar.c;
        }
        return yyaVar;
    }
}
