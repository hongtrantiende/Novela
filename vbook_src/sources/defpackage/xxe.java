package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import com.vbook.android.R;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xxe  reason: default package */
/* loaded from: classes.dex */
public abstract class xxe {
    public static final tu1 a = new tu1(new iv1(23), false, 1356237545);
    public static final tu1 b = new tu1(new jv1(14), false, 2127518317);
    public static final tu1 c = new tu1(new jv1(15), false, -1974049759);
    public static final String[] d = {"base", "basefont", "bgsound", "command", "link"};
    public static final String[] e = {"noframes", "style"};
    public static final String[] f = {"body", "br", "html"};
    public static final String[] g = {"body", "br", "html"};
    public static final String[] h = {"body", "br", "head", "html"};
    public static final String[] i = {"basefont", "bgsound", "link", "meta", "noframes", "style"};
    public static final String[] j = {"base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] k = {"address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul"};
    public static final String[] l = {"h1", "h2", "h3", "h4", "h5", "h6"};
    public static final String[] m = {"address", "div", "p"};
    public static final String[] n = {"dd", "dt"};
    public static final String[] o = {"applet", "marquee", "object"};
    public static final String[] p = {"param", "source", "track"};
    public static final String[] q = {"caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] r = {"address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul"};
    public static final String[] s = {"body", "dd", "dt", "html", "li", "optgroup", "option", "p", "rb", "rp", "rt", "rtc", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] t = {"a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u"};
    public static final String[] u = {"tbody", "tfoot", "thead"};
    public static final String[] v = {"td", "th", "tr"};
    public static final String[] w = {"script", "style", "template"};
    public static final String[] x = {"td", "th"};
    public static final String[] y = {"body", "caption", "col", "colgroup", "html"};
    public static final String[] z = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] A = {"caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] B = {"body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] C = {"table", "tbody", "tfoot", "thead", "tr"};
    public static final String[] D = {"caption", "col", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] E = {"body", "caption", "col", "colgroup", "html", "td", "th", "tr"};
    public static final String[] F = {"caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr"};
    public static final String[] G = {"body", "caption", "col", "colgroup", "html", "td", "th"};
    public static final String[] H = {"input", "keygen", "textarea"};
    public static final String[] I = {"caption", "table", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] J = {"tbody", "tfoot", "thead"};
    public static final String[] K = {"head", "noscript"};
    public static final String[] L = {"body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr"};
    public static final String[] M = {"base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "template", "title"};
    public static final String[] N = {"caption", "colgroup", "tbody", "tfoot", "thead"};
    public static final String[] O = {"b", "big", "blockquote", "body", "br", "center", "code", "dd", "div", "dl", "dt", "em", "embed", "h1", "h2", "h3", "h4", "h5", "h6", "head", "hr", "i", "img", "li", "listing", "menu", "meta", "nobr", "ol", "p", "pre", "ruby", "s", "small", "span", "strike", "strong", "sub", "sup", "table", "tt", "u", "ul", "var"};

    public static final void a(boolean z2, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z3;
        Object obj;
        zz7 zz7Var;
        yz7 yz7Var;
        ub8 ub8Var;
        boolean z4;
        Object obj2;
        Object obj3;
        Object obj4;
        int i4;
        int i5;
        rv4Var.g0(-361453782);
        if ((i2 & 6) == 0) {
            if (rv4Var.g(z2)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i3 = i5 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        boolean z5 = true;
        if ((i3 & 19) != 18) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i3 & 1, z3)) {
            Object obj5 = (zz7) rv4Var.j(ru6.a);
            tb8 tb8Var = null;
            if (obj5 == null) {
                rv4Var.e0(535274673);
                Object obj6 = (ub8) rv4Var.j(tu6.a);
                if (obj6 == null) {
                    rv4Var.e0(1208426157);
                    View view = (View) rv4Var.j(gh.f);
                    view.getClass();
                    while (true) {
                        if (view != null) {
                            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                            if (tag instanceof ub8) {
                                obj4 = (ub8) tag;
                            } else {
                                obj4 = null;
                            }
                            if (obj4 != null) {
                                obj2 = obj4;
                                break;
                            }
                            ViewParent q2 = gue.q(view);
                            if (q2 instanceof View) {
                                view = (View) q2;
                            } else {
                                view = null;
                            }
                        } else {
                            obj2 = null;
                            break;
                        }
                    }
                } else {
                    rv4Var.e0(1208423708);
                    obj2 = obj6;
                }
                rv4Var.q(false);
                if (obj2 == null) {
                    rv4Var.e0(1208428160);
                    Object obj7 = (Context) rv4Var.j(gh.b);
                    while (true) {
                        if (obj7 instanceof ContextWrapper) {
                            if (obj7 instanceof ub8) {
                                break;
                            }
                            obj7 = ((ContextWrapper) obj7).getBaseContext();
                        } else {
                            obj7 = null;
                            break;
                        }
                    }
                    obj3 = (ub8) obj7;
                } else {
                    rv4Var.e0(1208423789);
                    obj3 = obj2;
                }
                rv4Var.q(false);
                obj = obj3;
            } else {
                rv4Var.e0(535271790);
                obj = obj5;
            }
            rv4Var.q(false);
            if (obj != null) {
                boolean f2 = rv4Var.f(obj);
                Object P = rv4Var.P();
                Object obj8 = ax1.a;
                if (f2 || P == obj8) {
                    if (obj instanceof zz7) {
                        zz7Var = (zz7) obj;
                    } else {
                        zz7Var = null;
                    }
                    if (zz7Var != null) {
                        yz7Var = zz7Var.getNavigationEventDispatcher();
                    } else {
                        yz7Var = null;
                    }
                    if (obj instanceof ub8) {
                        ub8Var = (ub8) obj;
                    } else {
                        ub8Var = null;
                    }
                    if (ub8Var != null) {
                        tb8Var = ub8Var.b();
                    }
                    P = new jf0(yz7Var, tb8Var);
                    rv4Var.o0(P);
                }
                Object obj9 = (jf0) P;
                long j2 = rv4Var.T;
                boolean f3 = rv4Var.f(obj9) | rv4Var.e(j2);
                Object P2 = rv4Var.P();
                Object obj10 = P2;
                if (f3 || P2 == obj8) {
                    xv1 xv1Var = new xv1(new kf0(obj, j2));
                    xv1Var.c = new cd1(15);
                    rv4Var.o0(xv1Var);
                    obj10 = xv1Var;
                }
                Object obj11 = (xv1) obj10;
                rv4Var.e0(-585307852);
                boolean h2 = rv4Var.h(obj11);
                if ((i3 & Token.ASSIGN_MOD) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z6 = h2 | z4;
                Object P3 = rv4Var.P();
                if (z6 || P3 == obj8) {
                    P3 = new t7(9, obj11, vt4Var);
                    rv4Var.o0(P3);
                }
                yte.k((vt4) P3, rv4Var);
                int i6 = i3;
                Boolean valueOf = Boolean.valueOf(z2);
                boolean h3 = rv4Var.h(obj11);
                int i7 = i6 & 14;
                if (i7 != 4) {
                    z5 = false;
                }
                boolean z7 = h3 | z5;
                Object P4 = rv4Var.P();
                if (z7 || P4 == obj8) {
                    P4 = new nf0(obj11, z2, 0);
                    rv4Var.o0(P4);
                }
                tte.c(valueOf, obj11, null, (xt4) P4, rv4Var, i7);
                boolean h4 = rv4Var.h(obj9) | rv4Var.h(obj11);
                Object P5 = rv4Var.P();
                if (h4 || P5 == obj8) {
                    P5 = new k0(7, obj9, obj11);
                    rv4Var.o0(P5);
                }
                yte.c(obj9, obj11, (xt4) P5, rv4Var);
                rv4Var.q(false);
            } else {
                vs.k("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new pf0(z2, vt4Var, i2, 0);
        }
    }

    public static final void b(nq7 nq7Var, rv4 rv4Var, int i2) {
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-390810090);
        if ((i2 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p2);
            ar5 c2 = rp5.c((wk3) ok3.O.getValue(), rv4Var2, 0);
            tza tzaVar = j27.a;
            long b2 = zl1.b(0.5f, ((h27) rv4Var2.j(tzaVar)).a.q);
            kq7 kq7Var = kq7.a;
            nk5.a(c2, null, pna.n(kq7Var, 80.0f), b2, rv4Var2, 432, 0);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            cvb.c(yqe.A((y3b) o2b.h0.getValue(), rv4Var2), null, zl1.b(0.5f, ((h27) rv4Var2.j(tzaVar)).a.q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new oa(nq7Var, i2, 29);
        }
    }

    public static final void c(pmb pmbVar, nq7 nq7Var, vt4 vt4Var, final vt4 vt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4Var.g0(774058503);
        if (rv4Var.f(pmbVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(vt4Var2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            final qe r2 = q1d.r(rv4Var);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            final m82 m82Var = (m82) P;
            tza tzaVar = j27.a;
            q1d.a(nmd.v(st0.d(tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.b), 1.0f, rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f), ((h27) rv4Var.j(tzaVar)).c.b), rm1.g(((h27) rv4Var.j(tzaVar)).a, 3.0f), lre.g), r2, null, 44.0f, jce.E(1906327477, new ou4() { // from class: qmb
                @Override // defpackage.ou4
                public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    boolean z3;
                    ((Float) obj3).getClass();
                    rv4 rv4Var2 = (rv4) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    ((hv9) obj).getClass();
                    ((qe) obj2).getClass();
                    if ((intValue & 1025) != 1024) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        ar5 c2 = rp5.c((wk3) jk3.H.getValue(), rv4Var2, 0);
                        long j2 = zl1.e;
                        nq7 v2 = nmd.v(kq7.a, zl1.f, lre.g);
                        m82 m82Var2 = m82.this;
                        boolean h2 = rv4Var2.h(m82Var2);
                        qe qeVar = r2;
                        vt4 vt4Var3 = vt4Var2;
                        boolean f2 = h2 | rv4Var2.f(qeVar) | rv4Var2.f(vt4Var3);
                        Object P2 = rv4Var2.P();
                        if (f2 || P2 == ax1.a) {
                            P2 = new tmb(m82Var2, vt4Var3, qeVar, 0);
                            rv4Var2.o0(P2);
                        }
                        nk5.a(c2, null, pna.c(zbe.y(pna.s(lbe.f(15, (vt4) P2, v2, null, false), 44.0f), 12.0f), 1.0f), j2, rv4Var2, 3120, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), jce.E(-364733867, new rmb(vt4Var, pmbVar, 0), rv4Var), rv4Var, 14352384);
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new rj7(pmbVar, nq7Var, vt4Var, vt4Var2, i2, 10);
        }
    }

    public static final void d(boolean z2, int i2, jub jubVar, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        float f2;
        rv4Var.g0(2103901879);
        if (rv4Var.g(z2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i3 | i4;
        if (rv4Var.d(i2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (rv4Var.f(jubVar)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i10 = i9 | i6;
        if (rv4Var.h(xt4Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i11 = i10 | i7;
        boolean z4 = false;
        if ((74899 & i11) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i11 & 1, z3)) {
            if (z2) {
                f2 = 180.0f;
            } else {
                f2 = nae.e;
            }
            yya b2 = nq.b(f2, null, null, rv4Var, 0, 30);
            String B2 = yqe.B((y3b) b3b.K.getValue(), new Object[]{Integer.valueOf(i2)}, rv4Var);
            long g2 = rm1.g(((h27) rv4Var.j(j27.a)).a, 6.0f);
            tu1 E2 = jce.E(679192915, new qd1(xt4Var2, z2, b2), rv4Var);
            if ((57344 & i11) == 16384) {
                z4 = true;
            }
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new im(29, xt4Var);
                rv4Var.o0(P);
            }
            m(jubVar, B2, 0L, g2, E2, null, nq7Var, null, (xt4) P, null, rv4Var, ((i11 >> 6) & 14) | 1597440, 676);
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new a83(z2, i2, jubVar, nq7Var, xt4Var, xt4Var2, i3);
        }
    }

    public static final void e(int i2, int i3, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i4;
        boolean z2;
        boolean z3;
        rv4Var.g0(2037250264);
        if (rv4Var.d(i2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i5 = i3 | i4;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            gv9 a2 = ev9.a(new hz(8.0f, true, new vs(2)), kh5.F, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            vt4 vt4Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l2);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p2);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            Object obj2 = P;
            if (P == obj) {
                y3b[] y3bVarArr = {(y3b) v1b.f0.getValue(), (y3b) v1b.y0.getValue(), (y3b) x2b.t0.getValue()};
                rv4Var.o0(y3bVarArr);
                obj2 = y3bVarArr;
            }
            y3b[] y3bVarArr2 = (y3b[]) obj2;
            rv4Var.e0(1608735302);
            int length = y3bVarArr2.length;
            int i6 = 0;
            int i7 = 0;
            while (i7 < length) {
                y3b y3bVar = y3bVarArr2[i7];
                int i8 = i6 + 1;
                if (i6 == i2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String A2 = yqe.A(y3bVar, rv4Var);
                boolean d2 = rv4Var.d(i6);
                Object P2 = rv4Var.P();
                if (d2 || P2 == obj) {
                    P2 = new tp0(xt4Var, i6, 15);
                    rv4Var.o0(P2);
                }
                ese.m(0, (vt4) P2, rv4Var, null, null, null, A2, z3);
                i7++;
                i6 = i8;
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new p61(i2, nq7Var, xt4Var, i3, 10);
        }
    }

    public static final void f(String str, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        rv4Var.g0(-1674651703);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i6 & 1, z2)) {
            cvb.c(str, nq7Var, 0L, null, 0L, null, dq4.D, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(j27.a)).b.j, rv4Var, (i6 & 14) | 1572864 | (i6 & Token.ASSIGN_MOD), 0, 129980);
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new o7(str, nq7Var, i2, 13);
        }
    }

    public static final void g(boolean z2, int i2, int i3, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i4) {
        int i5;
        boolean z3;
        boolean z4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        vt4Var.getClass();
        rv4Var.g0(664991470);
        if ((i4 & 6) == 0) {
            if (rv4Var.g(z2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i5 = i10 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (rv4Var.d(i2)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i5 |= i9;
        }
        if ((i4 & 384) == 0) {
            if (rv4Var.d(i3)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i5 |= i8;
        }
        if ((i4 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i5 |= i7;
        }
        if ((i4 & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i5 |= i6;
        }
        if ((i5 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i5 & 1, z3)) {
            if (z2 && i3 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new y4(7);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.s((xt4) P));
            lz3 i11 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new y4(7);
                rv4Var.o0(P2);
            }
            rte.c(z4, nq7Var, a2, i11.a(zt3.w((xt4) P2)), null, jce.E(-2123185722, new uq5(vt4Var, i2, i3, 0), rv4Var), rv4Var, ((i5 >> 6) & Token.ASSIGN_MOD) | 200064, 16);
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new nq5(z2, i2, i3, nq7Var, vt4Var, i4, 0);
        }
    }

    public static final void h(final boolean z2, final String str, final String str2, final int i2, final int i3, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final vt4 vt4Var7, rv4 rv4Var, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z3;
        int i14;
        int i15;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        str2.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        vt4Var7.getClass();
        rv4Var2.g0(-952609504);
        int i16 = 4;
        if ((i4 & 6) == 0) {
            if (rv4Var2.g(z2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i4 | i15;
        } else {
            i5 = i4;
        }
        int i17 = 16;
        if (rv4Var2.f(str)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i18 = i5 | i6;
        boolean f2 = rv4Var2.f(str2);
        int i19 = Token.CASE;
        if (f2) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i20 = i18 | i7;
        if (rv4Var2.d(i2)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i21 = i20 | i8;
        if (rv4Var2.d(i3)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        int i22 = i21 | i9;
        if (rv4Var2.h(vt4Var)) {
            i10 = 1048576;
        } else {
            i10 = 524288;
        }
        int i23 = i22 | i10;
        if (rv4Var2.h(vt4Var2)) {
            i11 = 8388608;
        } else {
            i11 = 4194304;
        }
        int i24 = i23 | i11;
        if (rv4Var2.h(vt4Var3)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i25 = i24 | i12;
        if (rv4Var2.h(vt4Var4)) {
            i13 = 536870912;
        } else {
            i13 = 268435456;
        }
        int i26 = i25 | i13;
        if (!rv4Var2.h(vt4Var5)) {
            i16 = 2;
        }
        if (rv4Var2.h(vt4Var6)) {
            i17 = 32;
        }
        int i27 = i16 | i17;
        if (rv4Var2.h(vt4Var7)) {
            i19 = 256;
        }
        int i28 = i27 | i19;
        if ((i26 & 306783379) == 306783378 && (i28 & Token.EXPR_VOID) == 146) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var2.U(i26 & 1, z3)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p2);
            kq7 kq7Var = kq7.a;
            nq7 f3 = pna.f(kq7Var, 1.0f);
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                i14 = i28;
                P = new oi5(13);
                rv4Var2.o0(P);
            } else {
                i14 = i28;
            }
            eu3 a3 = g2.a(zt3.t((xt4) P));
            lz3 i29 = zt3.i(null, 3);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new oi5(14);
                rv4Var2.o0(P2);
            }
            rte.e(z2, f3, a3, i29.a(zt3.x((xt4) P2)), null, jce.E(-407154158, new sq5(vt4Var6, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, str, str2, 0), rv4Var2), rv4Var2, 1600902 | ((i26 << 3) & Token.ASSIGN_MOD), 16);
            rv4Var2 = rv4Var2;
            nq7 f4 = pna.f(kq7Var, 1.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f4);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            int i30 = i26 >> 6;
            g(z2, i2, i3, pu0.a.a(kq7Var, kh5.c), vt4Var7, rv4Var2, (i26 & 14) | (i30 & Token.ASSIGN_MOD) | (i30 & 896) | (57344 & (i14 << 6)));
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new lu4() { // from class: tq5
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p4 = xoe.p(i4 | 1);
                    xxe.h(z2, str, str2, i2, i3, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, vt4Var7, (rv4) obj, p4);
                    return pvc.a;
                }
            };
        }
    }

    public static final void i(final boolean z2, final String str, final String str2, final int i2, final int i3, final int i4, final nq7 nq7Var, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final xt4 xt4Var, final vt4 vt4Var7, rv4 rv4Var, final int i5, final int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Object obj;
        Object obj2;
        boolean z3;
        np npVar;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        str2.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        vt4Var4.getClass();
        vt4Var5.getClass();
        vt4Var6.getClass();
        xt4Var.getClass();
        vt4Var7.getClass();
        rv4Var2.g0(1932830610);
        if ((i5 & 6) == 0) {
            if (rv4Var2.g(z2)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i7 = i5 | i20;
        } else {
            i7 = i5;
        }
        if (rv4Var2.f(str)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i21 = i7 | i8;
        if (rv4Var2.f(str2)) {
            i9 = 256;
        } else {
            i9 = Token.CASE;
        }
        int i22 = i21 | i9;
        int i23 = 2048;
        if (rv4Var2.d(i2)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i24 = i22 | i10;
        int i25 = 8192;
        if (rv4Var2.d(i3)) {
            i11 = 16384;
        } else {
            i11 = 8192;
        }
        int i26 = i24 | i11;
        if (rv4Var2.d(i4)) {
            i12 = 131072;
        } else {
            i12 = Parser.ARGC_LIMIT;
        }
        int i27 = i26 | i12;
        if ((i5 & 12582912) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i19 = 8388608;
            } else {
                i19 = 4194304;
            }
            i27 |= i19;
        }
        if (rv4Var2.h(vt4Var2)) {
            i13 = 67108864;
        } else {
            i13 = 33554432;
        }
        int i28 = i27 | i13;
        if ((i5 & 805306368) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i28 |= i18;
        }
        int i29 = i28;
        if ((i6 & 6) == 0) {
            if (rv4Var2.h(vt4Var4)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i14 = i6 | i17;
        } else {
            i14 = i6;
        }
        if ((i6 & 48) == 0) {
            if (rv4Var2.h(vt4Var5)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i6 & 384) == 0) {
            obj = vt4Var6;
            if (rv4Var2.h(obj)) {
                i15 = 256;
            } else {
                i15 = Token.CASE;
            }
            i14 |= i15;
        } else {
            obj = vt4Var6;
        }
        if ((i6 & 3072) == 0) {
            obj2 = xt4Var;
            if (!rv4Var2.h(obj2)) {
                i23 = 1024;
            }
            i14 |= i23;
        } else {
            obj2 = xt4Var;
        }
        if ((i6 & 24576) == 0) {
            if (rv4Var2.h(vt4Var7)) {
                i25 = 16384;
            }
            i14 |= i25;
        }
        int i30 = i14;
        if ((i29 & 306783379) == 306783378 && (i30 & 9363) == 9362) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (rv4Var2.U(i29 & 1, z3)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar2 = qw1.f;
            jce.F(npVar2, rv4Var2, a2);
            np npVar3 = qw1.e;
            jce.F(npVar3, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar4 = qw1.g;
            jce.F(npVar4, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar5 = qw1.d;
            jce.F(npVar5, rv4Var2, p2);
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                npVar = npVar2;
                P = new oi5(11);
                rv4Var2.o0(P);
            } else {
                npVar = npVar2;
            }
            eu3 a3 = g2.a(zt3.t((xt4) P));
            lz3 i31 = zt3.i(null, 3);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new oi5(12);
                rv4Var2.o0(P2);
            }
            np npVar6 = npVar;
            rte.e(z2, f2, a3, i31.a(zt3.x((xt4) P2)), null, jce.E(1983452420, new qq5(vt4Var, vt4Var2, vt4Var3, i4, obj2, vt4Var4, vt4Var5, obj, str, str2), rv4Var2), rv4Var2, 1600902 | ((i29 << 3) & Token.ASSIGN_MOD), 16);
            rv4Var2 = rv4Var2;
            nq7 f3 = pna.f(kq7Var, 1.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar6, rv4Var2, d2);
            jce.F(npVar3, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar4, rv4Var2, kgVar);
            jce.F(npVar5, rv4Var2, p3);
            nq7 a4 = pu0.a.a(mwe.u(kq7Var, false, 4), kh5.c);
            int i32 = i29 >> 6;
            aze.j(z2, i2, i3, a4, vt4Var7, rv4Var2, (i29 & 14) | (i32 & Token.ASSIGN_MOD) | (i32 & 896) | (i30 & 57344));
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new lu4() { // from class: rq5
                @Override // defpackage.lu4
                public final Object invoke(Object obj3, Object obj4) {
                    ((Integer) obj4).getClass();
                    int p4 = xoe.p(i5 | 1);
                    int p5 = xoe.p(i6);
                    xxe.i(z2, str, str2, i2, i3, i4, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, vt4Var5, vt4Var6, xt4Var, vt4Var7, (rv4) obj3, p4, p5);
                    return pvc.a;
                }
            };
        }
    }

    public static final void j(int i2, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z2;
        kq7 kq7Var;
        rv4Var.g0(1467896239);
        if (rv4Var.h(vt4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4 | 384;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i6 & 1, z2)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            kq7 kq7Var2 = kq7.a;
            nq7 p2 = lye.p(rv4Var, kq7Var2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l2);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p2);
            ar5 c2 = rp5.c((wk3) ok3.M.getValue(), rv4Var, 0);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new ea4(aw7Var, 19);
                rv4Var.o0(P2);
            }
            pc2.a(c2, null, (vt4) P2, rv4Var, 384, 2);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            nk0 nk0Var = kh5.c;
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new ea4(aw7Var, 20);
                rv4Var.o0(P3);
            }
            iue.e(booleanValue, nk0Var, 0L, null, nae.e, null, (vt4) P3, jce.E(-1415787735, new oq5(vt4Var, vt4Var2, aw7Var, 0), rv4Var), rv4Var, 14155824, 60);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new pq5(vt4Var, vt4Var2, kq7Var, i2, 0);
        }
    }

    public static final void k(final pmb pmbVar, nq7 nq7Var, vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        rv4Var.g0(1917066639);
        if (rv4Var.f(pmbVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var2)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var.h(vt4Var3)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yte.s(rv4Var);
                rv4Var.o0(P);
            }
            final m82 m82Var = (m82) P;
            final qe r2 = q1d.r(rv4Var);
            tza tzaVar = j27.a;
            q1d.a(nmd.v(st0.d(tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.b), 1.0f, rm1.g(((h27) rv4Var.j(tzaVar)).a, 6.0f), ((h27) rv4Var.j(tzaVar)).c.b), rm1.g(((h27) rv4Var.j(tzaVar)).a, 3.0f), lre.g), r2, null, 88.0f, jce.E(159363261, new ou4() { // from class: smb
                @Override // defpackage.ou4
                public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    boolean z3;
                    String str = pmb.this.g;
                    ((Float) obj3).getClass();
                    rv4 rv4Var2 = (rv4) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    ((hv9) obj).getClass();
                    ((qe) obj2).getClass();
                    if ((intValue & 1025) != 1024) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        ar5 c2 = rp5.c((wk3) jk3.P.getValue(), rv4Var2, 0);
                        long j2 = zl1.b;
                        boolean f2 = rv4Var2.f(str);
                        Object P2 = rv4Var2.P();
                        lh9 lh9Var = ax1.a;
                        if (f2 || P2 == lh9Var) {
                            zl1 zl1Var = new zl1(kve.v(str));
                            rv4Var2.o0(zl1Var);
                            P2 = zl1Var;
                        }
                        long j3 = ((zl1) P2).a;
                        ba5 ba5Var = lre.g;
                        kq7 kq7Var = kq7.a;
                        nq7 v2 = nmd.v(kq7Var, j3, ba5Var);
                        m82 m82Var2 = m82Var;
                        boolean h2 = rv4Var2.h(m82Var2);
                        qe qeVar = r2;
                        boolean f3 = h2 | rv4Var2.f(qeVar);
                        vt4 vt4Var4 = vt4Var2;
                        boolean f4 = f3 | rv4Var2.f(vt4Var4);
                        Object P3 = rv4Var2.P();
                        if (f4 || P3 == lh9Var) {
                            P3 = new tmb(m82Var2, vt4Var4, qeVar, 1);
                            rv4Var2.o0(P3);
                        }
                        nk5.a(c2, null, pna.c(zbe.y(pna.s(lbe.f(15, (vt4) P3, v2, null, false), 44.0f), 12.0f), 1.0f), j2, rv4Var2, 3120, 0);
                        ar5 c3 = rp5.c((wk3) jk3.H.getValue(), rv4Var2, 0);
                        long j4 = zl1.e;
                        nq7 v3 = nmd.v(kq7Var, zl1.f, ba5Var);
                        vt4 vt4Var5 = vt4Var3;
                        boolean h3 = rv4Var2.h(m82Var2) | rv4Var2.f(qeVar) | rv4Var2.f(vt4Var5);
                        Object P4 = rv4Var2.P();
                        if (h3 || P4 == lh9Var) {
                            P4 = new tmb(m82Var2, vt4Var5, qeVar, 2);
                            rv4Var2.o0(P4);
                        }
                        nk5.a(c3, null, pna.c(zbe.y(pna.s(lbe.f(15, (vt4) P4, v3, null, false), 44.0f), 12.0f), 1.0f), j4, rv4Var2, 3120, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), jce.E(22778717, new rmb(vt4Var, pmbVar, 1), rv4Var), rv4Var, 14352384);
        } else {
            rv4Var.X();
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new wp0(pmbVar, nq7Var, vt4Var, vt4Var2, vt4Var3, i2, 26);
        }
    }

    public static final void l(String str, long j2, long j3, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        long j4;
        long j5;
        long j6;
        long b2;
        int i5;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        vt4Var.getClass();
        rv4Var2.g0(-1852347756);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3 | Token.LABEL;
        if (rv4Var2.h(vt4Var)) {
            i4 = 16384;
        } else {
            i4 = 8192;
        }
        int i7 = i6 | i4;
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i7 & 1, z2)) {
            rv4Var2.Z();
            if ((i2 & 1) != 0 && !rv4Var2.B()) {
                rv4Var2.X();
                i5 = i7 & (-1009);
                j6 = j2;
                b2 = j3;
            } else {
                j6 = ((zl1) rv4Var2.j(r12.a)).a;
                b2 = zl1.b(0.3f, ((h27) rv4Var2.j(j27.a)).a.h);
                i5 = i7 & (-1009);
            }
            rv4Var2.r();
            nq7 v2 = nmd.v(tte.k(pna.h(nq7Var, 44.0f), uu9.a(24.0f)), b2, lre.g);
            if ((57344 & i5) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            if (z3 || P == ax1.a) {
                P = new on7(25, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 f2 = lbe.f(15, (vt4) P, v2, null, false);
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            long j7 = j6;
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p2);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
            long j8 = b2;
            int i8 = i5;
            nk5.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0), null, zbe.y(tte.k(pna.n(kq7Var, 44.0f), uu9.a), 12.0f), 0L, rv4Var2, 48, 8);
            we6 we6Var = new we6(1.0f, true);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            j4 = j7;
            cvb.c(str, pu0.a.a(kq7Var, kh5.C), zl1.b(0.6f, j4), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, rv4Var, i8 & 14, 24960, 241656);
            rv4Var2 = rv4Var;
            s21.x(rv4Var2, true, kq7Var, 12.0f, rv4Var2);
            rv4Var2.q(true);
            j5 = j8;
        } else {
            rv4Var2.X();
            j4 = j2;
            j5 = j3;
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            u2.d = new rb(str, j4, j5, nq7Var, vt4Var, i2, 3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:186:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m(final defpackage.jub r49, final java.lang.String r50, long r51, long r53, defpackage.lu4 r55, defpackage.zm4 r56, final defpackage.nq7 r57, defpackage.lu4 r58, defpackage.xt4 r59, defpackage.vt4 r60, defpackage.rv4 r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 1175
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxe.m(jub, java.lang.String, long, long, lu4, zm4, nq7, lu4, xt4, vt4, rv4, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01aa, code lost:
        if (r6 == r5) goto L88;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(java.util.List r22, defpackage.rh8 r23, defpackage.nq7 r24, defpackage.xt4 r25, defpackage.xt4 r26, defpackage.xt4 r27, defpackage.rv4 r28, int r29) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxe.n(java.util.List, rh8, nq7, xt4, xt4, xt4, rv4, int):void");
    }

    public static final List o(fxb fxbVar, gw7 gw7Var) {
        if (gw7Var != null && gw7Var.c != 0) {
            return sl1.C0(gw7Var.f());
        }
        if (fxbVar != null) {
            long j2 = fxbVar.a;
            if (!fxb.d(j2)) {
                return tl1.A(new os(new uva(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, gpb.c, null, 61439), fxb.g(j2), fxb.f(j2)));
            }
        }
        return ks3.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0092 -> B:27:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List p(defpackage.eqa r5, java.lang.Integer r6, int r7, java.lang.Integer r8) {
        /*
            boolean r0 = r5.w
            if (r0 != 0) goto L9d
            int r0 = r5.p()
            if (r0 == 0) goto L9d
            fj9 r0 = new fj9
            r0.<init>(r5)
            if (r8 == 0) goto L16
            int r8 = r8.intValue()
            goto L20
        L16:
            int r8 = r5.v
            if (r8 >= 0) goto L20
            int[] r8 = r5.b
            int r8 = r5.G(r7, r8)
        L20:
            if (r6 != 0) goto L44
            int r6 = r5.i
            int[] r1 = r5.b
            int r2 = r5.r(r7)
            int r1 = r5.P(r2, r1)
            int r6 = r6 - r1
            wu7 r1 = r5.s
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.b(r7)
            kv7 r1 = (defpackage.kv7) r1
            if (r1 == 0) goto L3e
            int r1 = r1.b
            goto L3f
        L3e:
            r1 = 0
        L3f:
            int r6 = r6 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L44:
            int r1 = r5.r(r7)
            int r1 = r1 * 5
            int[] r2 = r5.b
            int r3 = r2.length
            if (r1 >= r3) goto L54
            int r1 = r5.s(r7)
            goto L61
        L54:
            if (r8 < 0) goto L5b
            int r7 = r5.G(r8, r2)
            goto L5c
        L5b:
            r7 = r8
        L5c:
            int r1 = r5.s(r8)
            goto L92
        L61:
            if (r7 < 0) goto L98
            int r2 = r5.r(r7)
            int[] r3 = r5.b
            int r2 = r2 * 5
            int r2 = r2 + 1
            r2 = r3[r2]
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r3
            if (r2 == 0) goto L79
            java.lang.Object r2 = r5.t(r7)
            goto L7b
        L79:
            lh9 r2 = defpackage.ax1.a
        L7b:
            uv4 r3 = r5.Q(r7)
            r0.E(r1, r2, r3, r6)
            lv4 r6 = r5.b(r7)
            if (r8 < 0) goto L96
            int[] r7 = r5.b
            int r7 = r5.G(r8, r7)
            int r1 = r5.s(r8)
        L92:
            r4 = r8
            r8 = r7
            r7 = r4
            goto L61
        L96:
            r7 = r8
            goto L61
        L98:
            java.lang.Object r5 = r0.a
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            return r5
        L9d:
            ks3 r5 = defpackage.ks3.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xxe.p(eqa, java.lang.Integer, int, java.lang.Integer):java.util.List");
    }

    public static final long q(rj8 rj8Var) {
        return k27.B(rj8Var.l() * rj8Var.p()) + (rj8Var.k() * rj8Var.p());
    }

    public static final String r(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length / 2);
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i3 < bArr.length) {
                sb.append((char) (((bArr[i3] & 255) << 8) | (bArr[i2] & 255)));
                i2 += 2;
            } else {
                return sb.toString();
            }
        }
    }

    public static final Integer s(aqa aqaVar, px1 px1Var, int i2, int i3) {
        Integer s2;
        wv4 wv4Var;
        Object obj;
        int[] iArr = aqaVar.b;
        while (true) {
            ov4 ov4Var = null;
            if (i2 >= i3) {
                return null;
            }
            int i4 = iArr[(i2 * 5) + 3] + i2;
            if (aqaVar.j(i2) && aqaVar.i(i2) == 206 && c16.i(aqaVar.p(i2, iArr), ex1.e)) {
                Object h2 = aqaVar.h(i2, 0);
                if (h2 instanceof wv4) {
                    wv4Var = (wv4) h2;
                } else {
                    wv4Var = null;
                }
                if (wv4Var != null) {
                    obj = wv4Var.a;
                } else {
                    obj = null;
                }
                if (obj instanceof ov4) {
                    ov4Var = (ov4) obj;
                }
                if (ov4Var != null && ov4Var.a == px1Var) {
                    return Integer.valueOf(i2);
                }
            }
            if (aqaVar.d(i2) && (s2 = s(aqaVar, px1Var, i2 + 1, i4)) != null) {
                return Integer.valueOf(s2.intValue());
            }
            i2 = i4;
        }
    }

    public static int t(Context context, int i2) {
        int i3;
        TypedValue typedValue = new TypedValue();
        Integer num = null;
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            typedValue = null;
        }
        if (typedValue != null) {
            int i4 = typedValue.resourceId;
            if (i4 != 0) {
                i3 = context.getColor(i4);
            } else {
                i3 = typedValue.data;
            }
            num = Integer.valueOf(i3);
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final hub u(frb frbVar) {
        pyb pybVar = frbVar.d;
        if (pybVar != null) {
            return new hub(new pyb(pybVar, false), frbVar.c.length());
        }
        return null;
    }

    public static final boolean v(char c2) {
        if (c2 != '\t' && c2 != '\n' && c2 != '\r' && c2 != ' ') {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [fj9, c3e] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList w(aqa aqaVar, int i2, Integer num) {
        Object obj;
        ?? fj9Var = new fj9(aqaVar);
        int q2 = aqaVar.q(i2);
        lv4 a2 = aqaVar.a(i2);
        while (i2 >= 0) {
            if (aqaVar.k(i2)) {
                obj = aqaVar.p(i2, aqaVar.b);
            } else {
                obj = ax1.a;
            }
            fj9Var.E(aqaVar.i(i2), obj, aqaVar.a.h(i2), num);
            if (q2 >= 0) {
                lv4 lv4Var = a2;
                a2 = aqaVar.a(q2);
                i2 = q2;
                q2 = aqaVar.q(q2);
                num = lv4Var;
            } else {
                i2 = q2;
                num = a2;
            }
        }
        return (ArrayList) fj9Var.a;
    }
}
