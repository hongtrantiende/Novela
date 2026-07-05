package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dy1  reason: default package */
/* loaded from: classes.dex */
public abstract class dy1 {
    public static final tza a = new f99(fh.M);
    public static final tza b = new f99(fh.O);
    public static final tza c = new f99(fh.Q);
    public static final tza d = new f99(fh.P);
    public static final tza e = new f99(fh.S);
    public static final tza f = new f99(fh.R);
    public static final tza g = new f99(zx1.b);
    public static final tza h = new f99(fh.W);
    public static final tza i = new f99(fh.X);
    public static final tza j = new f99(fh.Z);
    public static final tza k = new f99(fh.Y);
    public static final tza l = new f99(zx1.c);
    public static final tza m = new f99(zx1.d);
    public static final tza n = new f99(zx1.e);
    public static final tza o = new f99(zx1.C);
    public static final tza p;
    public static final tza q;
    public static final tza r;
    public static final tza s;
    public static final tza t;
    public static final tza u;
    public static final tza v;
    public static final tza w;
    public static final ly1 x;
    public static final tza y;

    /* JADX WARN: Type inference failed for: r1v0, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v1, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v10, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v11, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v12, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v13, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v14, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v16, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v17, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v18, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v19, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v2, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v20, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v21, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v22, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v23, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v25, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v3, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v4, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v5, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v6, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v7, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v8, types: [f99, tza] */
    /* JADX WARN: Type inference failed for: r1v9, types: [f99, tza] */
    static {
        ipe.y(new cd1(19));
        p = new f99(zx1.I);
        q = new f99(zx1.F);
        r = new f99(zx1.J);
        s = new f99(zx1.K);
        t = new f99(zx1.L);
        u = new f99(zx1.M);
        v = new f99(zx1.G);
        w = new f99(zx1.f);
        x = new ly1(zx1.D);
        y = new f99(fh.V);
    }

    public static final void a(wg8 wg8Var, xo xoVar, lu4 lu4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        boolean z3;
        int i6;
        boolean z4;
        boolean z5;
        boolean z6;
        rv4Var.g0(1925803616);
        if (rv4Var.f(wg8Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.f(xoVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(lu4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if ((i9 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            rg rgVar = (rg) wg8Var;
            i99 a2 = a.a(rgVar.getAccessibilityManager());
            i99 a3 = b.a(rgVar.m13getAutofill());
            i99 a4 = d.a(rgVar.getAutofillManager());
            i99 a5 = c.a(rgVar.getAutofillTree());
            i99 a6 = e.a(rgVar.getClipboardManager());
            i99 a7 = f.a(rgVar.getClipboard());
            i99 a8 = h.a(rgVar.getDensity());
            i99 a9 = i.a(rgVar.getFocusOwner());
            i99 a10 = j.a(rgVar.getFontLoader());
            a10.g = false;
            i99 a11 = k.a(rgVar.getFontFamilyResolver());
            a11.g = false;
            i99 a12 = l.a(rgVar.getHapticFeedBack());
            int i10 = i9 & 14;
            if (i10 != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new lg(rgVar, 3);
                rv4Var.o0(P);
            }
            i99 c2 = m.c((xt4) P);
            i99 a13 = n.a(rgVar.getLayoutDirection());
            if (i10 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            Object P2 = rv4Var.P();
            if (!z3 && P2 != lh9Var) {
                i6 = 4;
            } else {
                i6 = 4;
                P2 = new lg(rgVar, 4);
                rv4Var.o0(P2);
            }
            i99 c3 = p.c((xt4) P2);
            if (i10 != i6) {
                z4 = false;
            } else {
                z4 = true;
            }
            Object P3 = rv4Var.P();
            if (z4 || P3 == lh9Var) {
                P3 = new lg(rgVar, 5);
                rv4Var.o0(P3);
            }
            i99 c4 = q.c((xt4) P3);
            if (i10 != 4) {
                z5 = false;
            } else {
                z5 = true;
            }
            Object P4 = rv4Var.P();
            if (z5 || P4 == lh9Var) {
                P4 = new lg(rgVar, 6);
                rv4Var.o0(P4);
            }
            i99 c5 = r.c((xt4) P4);
            i99 a14 = s.a(xoVar);
            i99 a15 = t.a(rgVar.getViewConfiguration());
            i99 a16 = u.a(rgVar.getWindowInfo());
            if (i10 != 4) {
                z6 = false;
            } else {
                z6 = true;
            }
            Object P5 = rv4Var.P();
            if (z6 || P5 == lh9Var) {
                P5 = new lg(rgVar, 7);
                rv4Var.o0(P5);
            }
            pye.b(new i99[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, c2, a13, c3, c4, c5, a14, a15, a16, w.c((xt4) P5), g.a(rgVar.getGraphicsContext()), vu6.a.a(rgVar.getRetainedValuesStore()), o.a(rgVar.getLocaleList())}, lu4Var, rv4Var, ((i9 >> 3) & Token.ASSIGN_MOD) | 8);
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new ai(wg8Var, xoVar, lu4Var, i2, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }

    public static final tza c() {
        return h;
    }
}
