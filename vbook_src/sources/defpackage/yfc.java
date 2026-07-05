package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yfc  reason: default package */
/* loaded from: classes.dex */
public abstract class yfc {
    public static final th8 a = new th8(nae.e, nae.e, nae.e, nae.e);
    public static final float b = 64.0f;
    public static final float c = 64.0f;
    public static final float d = 152.0f;

    public static oz3 a(rv4 rv4Var) {
        cgc h = vv.h(rv4Var);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (P == obj) {
            P = new a1c(10);
            rv4Var.o0(P);
        }
        vt4 vt4Var = (vt4) P;
        lf4 y = kqe.y(ur7.c, rv4Var);
        pq2 a2 = axa.a(rv4Var);
        boolean f = rv4Var.f(h) | rv4Var.f(vt4Var) | rv4Var.f(y) | rv4Var.f(a2);
        Object P2 = rv4Var.P();
        if (f || P2 == obj) {
            P2 = new oz3(h, y, a2, vt4Var);
            rv4Var.o0(P2);
        }
        return (oz3) P2;
    }

    public static xfc b(pm1 pm1Var) {
        xfc xfcVar = pm1Var.b0;
        if (xfcVar == null) {
            xfc xfcVar2 = new xfc(rm1.d(pm1Var, o28.a), rm1.d(pm1Var, o28.c), rm1.d(pm1Var, o28.b), rm1.d(pm1Var, o28.e), rm1.d(pm1Var, o28.f), rm1.d(pm1Var, o28.d));
            pm1Var.b0 = xfcVar2;
            return xfcVar2;
        }
        return xfcVar;
    }

    public static ov8 c(rv4 rv4Var) {
        cgc h = vv.h(rv4Var);
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (P == obj) {
            P = new a1c(10);
            rv4Var.o0(P);
        }
        vt4 vt4Var = (vt4) P;
        boolean f = rv4Var.f(h) | rv4Var.f(vt4Var);
        Object P2 = rv4Var.P();
        if (f || P2 == obj) {
            P2 = new ov8(h, vt4Var);
            rv4Var.o0(P2);
        }
        return (ov8) P2;
    }

    public static xfc d(long j, long j2, rv4 rv4Var, int i) {
        long j3;
        long j4;
        long j5;
        long j6;
        long j7;
        if ((i & 2) != 0) {
            j3 = zl1.i;
        } else {
            j3 = j2;
        }
        long j8 = zl1.i;
        xfc b2 = b(((h27) rv4Var.j(j27.a)).a);
        if (j != 16) {
            j4 = j;
        } else {
            j4 = b2.a;
        }
        if (j3 == 16) {
            j3 = b2.b;
        }
        long j9 = j3;
        if (j8 != 16) {
            j5 = j8;
        } else {
            j5 = b2.c;
        }
        if (j8 != 16) {
            j6 = j8;
        } else {
            j6 = b2.d;
        }
        if (j8 != 16) {
            j7 = j8;
        } else {
            j7 = b2.e;
        }
        if (j8 == 16) {
            j8 = b2.f;
        }
        return new xfc(j4, j9, j5, j6, j7, j8);
    }
}
