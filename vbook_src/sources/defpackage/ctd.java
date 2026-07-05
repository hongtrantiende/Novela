package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ctd  reason: default package */
/* loaded from: classes3.dex */
public abstract class ctd {
    public static final u95 a = new u95(0, null);
    public static final u95 b = new u95(1, null);
    public static final tu1 c = new tu1(new xu1(4), false, 1269214172);
    public static final String[] d = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", "error", "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] e = {"ad_impression"};
    public static final String[] f = {"ad_impression", "in_app_purchase"};
    public static final String[] g = {"ad_impression"};
    public static final String[] h = {"ad_impression", "in_app_purchase"};
    public static final String[] i = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] j = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};

    public static ikb A(float f2, float f3, int i2, int i3, int i4) {
        sv7 sv7Var = new sv7(1);
        sv7Var.b = nae.e;
        sv7Var.c = nae.e;
        sv7Var.d = nae.e;
        sv7Var.e = nae.e;
        ikb ikbVar = ikb.a;
        ikb ikbVar2 = ikb.c;
        ikb ikbVar3 = ikb.b;
        switch (i4) {
            case 0:
                if (f2 < i2 / 3.0f) {
                    return ikbVar;
                }
                if (f2 > (i2 * 2) / 3.0f) {
                    return ikbVar3;
                }
                return ikbVar2;
            case 1:
                float f4 = i3;
                sv7Var.d(i2 / 4.0f, f4 / 3.0f, (i2 * 3) / 4.0f, (i3 * 2) / 3.0f);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar2;
                }
                if (f3 < f4 / 2.0f) {
                    return ikbVar;
                }
                return ikbVar3;
            case 2:
                float f5 = i3;
                float f6 = f5 / 3.0f;
                float f7 = i2;
                float f8 = f7 / 3.0f;
                sv7Var.d(nae.e, f6, f8, f5);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar;
                }
                sv7Var.d(f8, (i3 * 2) / 3.0f, f7, f5);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar3;
                }
                sv7Var.d((i2 * 2) / 3.0f, f6, f7, f5);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar3;
                }
                return ikbVar2;
            case 3:
                float f9 = (i2 * 2) / 7.0f;
                float f10 = i3 / 3.0f;
                float f11 = (i2 * 5) / 7.0f;
                sv7Var.d(f9, f10, f11, (i3 * 2) / 3.0f);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar2;
                }
                if (f2 < f9) {
                    return ikbVar;
                }
                sv7Var.d(nae.e, nae.e, f11, f10);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar;
                }
                return ikbVar3;
            case 4:
                sv7Var.d((i2 * 2) / 7.0f, i3 / 3.0f, (i2 * 5) / 7.0f, (i3 * 2) / 3.0f);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar2;
                }
                return ikbVar3;
            case 5:
                float f12 = (i2 * 2) / 7.0f;
                float f13 = i3 / 3.0f;
                float f14 = (i2 * 5) / 7.0f;
                sv7Var.d(f12, f13, f14, (i3 * 2) / 3.0f);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar2;
                }
                sv7Var.d(f12, nae.e, f14, f13);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar;
                }
                return ikbVar3;
            case 6:
                float f15 = (i2 * 2) / 7.0f;
                float f16 = i3 / 3.0f;
                sv7Var.d(f15, f16, (i2 * 5) / 7.0f, (i3 * 2) / 3.0f);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar2;
                }
                sv7Var.d(nae.e, nae.e, f15, f16);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar;
                }
                return ikbVar3;
            case 7:
                float f17 = i3 / 3.0f;
                float f18 = (i2 * 5) / 7.0f;
                sv7Var.d((i2 * 2) / 7.0f, f17, f18, (i3 * 2) / 3.0f);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar2;
                }
                sv7Var.d(f18, nae.e, i2, f17);
                if (sv7Var.a(f2, f3)) {
                    return ikbVar;
                }
                return ikbVar3;
            default:
                return ikb.d;
        }
    }

    public static void B(int i2, int i3) {
        String p;
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        if (i2 >= 0) {
            if (i3 < 0) {
                vs.m(a82.j(i3, "negative size: "));
                return;
            }
            p = sxd.p("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            p = sxd.p("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(p);
    }

    public static void C(int i2, int i3, int i4) {
        String D;
        if (i2 >= 0 && i3 >= i2 && i3 <= i4) {
            return;
        }
        if (i2 >= 0 && i2 <= i4) {
            if (i3 >= 0 && i3 <= i4) {
                D = sxd.p("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                D = D(i3, i4, "end index");
            }
        } else {
            D = D(i2, i4, "start index");
        }
        throw new IndexOutOfBoundsException(D);
    }

    public static String D(int i2, int i3, String str) {
        if (i2 < 0) {
            return sxd.p("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return sxd.p("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        vs.m(a82.j(i3, "negative size: "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(int r18, int r19, long r20, long r22, defpackage.mu4 r24, defpackage.rv4 r25, defpackage.nq7 r26) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.a(int, int, long, long, mu4, rv4, nq7):void");
    }

    public static final void b(tu1 tu1Var, nq7 nq7Var, tu1 tu1Var2, rv4 rv4Var, int i2) {
        boolean z;
        tu1 tu1Var3;
        tu1 tu1Var4;
        kq7 kq7Var;
        rv4Var.g0(-1693825945);
        int i3 = i2 | 48;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = ci.e;
                rv4Var.o0(P);
            }
            b37 b37Var = (b37) P;
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            kq7 kq7Var2 = kq7.a;
            nq7 p = lye.p(rv4Var, kq7Var2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, b37Var);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            nq7 o = bze.o(kq7Var2, "anchor");
            b37 d2 = fu0.d(kh5.e, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, o);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d2);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            pu0 pu0Var = pu0.a;
            tu1Var4 = tu1Var2;
            tu1Var4.c(pu0Var, rv4Var, 54);
            rv4Var.q(true);
            nq7 o2 = bze.o(kq7Var2, "badge");
            b37 d3 = fu0.d(kh5.a, false);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, o2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d3);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            tu1Var3 = tu1Var;
            tu1Var3.c(pu0Var, rv4Var, 54);
            rv4Var.q(true);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            tu1Var3 = tu1Var;
            tu1Var4 = tu1Var2;
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(tu1Var3, kq7Var, tu1Var4, i2, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0190, code lost:
        if (r6 == r9) goto L96;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final float r35, final boolean r36, final boolean r37, final defpackage.nq7 r38, final defpackage.xt4 r39, final defpackage.xt4 r40, final defpackage.xt4 r41, defpackage.rv4 r42, final int r43) {
        /*
            Method dump skipped, instructions count: 759
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.c(float, boolean, boolean, nq7, xt4, xt4, xt4, rv4, int):void");
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [ly0, java.lang.Object] */
    public static qsa d(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        ?? obj = new Object();
        obj.n(bArr, length);
        return new qsa(obj);
    }

    public static final void e(String str, List list, int i2, boolean z, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i3) {
        int i4;
        boolean z2;
        boolean z3;
        kq7 kq7Var;
        aw7 aw7Var;
        int i5;
        int i6;
        boolean h2;
        int i7;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1036335162);
        if ((i3 & 6) == 0) {
            if (rv4Var2.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i4 = i8 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if ((i3 & 64) == 0) {
                h2 = rv4Var2.f(list);
            } else {
                h2 = rv4Var2.h(list);
            }
            if (h2) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i4 |= i7;
        }
        if ((i3 & 384) == 0) {
            if (rv4Var2.d(i2)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i4 |= i6;
        }
        int i9 = i4 | 27648;
        if ((196608 & i3) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i9 |= i5;
        }
        if ((74899 & i9) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i9 & 1, z2)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            kq7 kq7Var2 = kq7.a;
            nq7 m = lpe.m(kq7Var2, 1.0f);
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new nd7(aw7Var2, 24);
                rv4Var2.o0(P2);
            }
            nq7 a0 = q1d.t(1, (vt4) P2, rv4Var2, m, false).a0(kq7Var2);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, a0);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            int i10 = i9;
            nq7 p2 = lye.p(rv4Var2, kq7Var2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            tza tzaVar = j27.a;
            cvb.c(str, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, i10 & 14, 24960, 109564);
            xbe.i(rv4Var, pna.s(kq7Var2, 8.0f));
            cvb.c((String) list.get(i2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.k, rv4Var, 0, 0, 131070);
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var, 0), null, pna.n(kq7Var2, 24.0f), 0L, rv4Var, 432, 8);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                aw7Var = aw7Var2;
                P3 = new nd7(aw7Var, 25);
                rv4Var2.o0(P3);
            } else {
                aw7Var = aw7Var2;
            }
            iue.e(booleanValue, null, 0L, kq7Var2, nae.e, null, (vt4) P3, jce.E(115016844, new qm7(list, i2, xt4Var, aw7Var, 0), rv4Var2), rv4Var2, 14158848, 54);
            rv4Var2.q(true);
            kq7Var = kq7Var2;
            z3 = true;
        } else {
            rv4Var2.X();
            z3 = z;
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new eh1(str, list, i2, z3, kq7Var, xt4Var, i3);
        }
    }

    public static final void f(tkc tkcVar, nq7 nq7Var, lf4 lf4Var, xt4 xt4Var, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        xt4 xt4Var2;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        c3e c3eVar = tkcVar.a;
        rv4Var.g0(-1877370462);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(tkcVar)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(lf4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        int i8 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(tu1Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = kg.X;
                rv4Var.o0(P);
            }
            xt4 xt4Var3 = (xt4) P;
            Object P2 = rv4Var.P();
            Object obj2 = P2;
            if (P2 == obj) {
                ora oraVar = new ora();
                oraVar.add(c3eVar.z());
                rv4Var.o0(oraVar);
                obj2 = oraVar;
            }
            ora oraVar2 = (ora) obj2;
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                long[] jArr = tz9.a;
                P3 = new tv7();
                rv4Var.o0(P3);
            }
            tv7 tv7Var = (tv7) P3;
            hm8 hm8Var = tkcVar.d;
            if (c16.i(c3eVar.z(), hm8Var.getValue())) {
                rv4Var.e0(321145192);
                if (oraVar2.size() == 1 && c16.i(oraVar2.get(0), hm8Var.getValue())) {
                    rv4Var.e0(321469824);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(321279546);
                    if ((i8 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P4 = rv4Var.P();
                    if (z2 || P4 == obj) {
                        P4 = new jc(tkcVar, 15);
                        rv4Var.o0(P4);
                    }
                    xl1.Q(oraVar2, (xt4) P4);
                    tv7Var.a();
                    rv4Var.q(false);
                }
                rv4Var.q(false);
            } else {
                rv4Var.e0(321475776);
                rv4Var.q(false);
            }
            if (!tv7Var.b(hm8Var.getValue())) {
                rv4Var.e0(321536443);
                ListIterator listIterator = oraVar2.listIterator();
                int i9 = 0;
                while (true) {
                    y65 y65Var = (y65) listIterator;
                    if (y65Var.hasNext()) {
                        if (c16.i(xt4Var3.invoke(y65Var.next()), xt4Var3.invoke(hm8Var.getValue()))) {
                            break;
                        }
                        i9++;
                    } else {
                        i9 = -1;
                        break;
                    }
                }
                if (i9 == -1) {
                    oraVar2.add(hm8Var.getValue());
                } else {
                    oraVar2.set(i9, hm8Var.getValue());
                }
                tv7Var.a();
                int size = oraVar2.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Object obj3 = oraVar2.get(i10);
                    tv7Var.n(obj3, jce.E(-934471669, new ld2(tkcVar, lf4Var, obj3, tu1Var), rv4Var));
                }
                rv4Var.q(false);
            } else {
                rv4Var.e0(322279296);
                rv4Var.q(false);
            }
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            vt4 vt4Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.x(rv4Var, Integer.valueOf(hashCode), qw1.g);
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            rv4Var.e0(-1312707512);
            int size2 = oraVar2.size();
            for (int i11 = 0; i11 < size2; i11++) {
                Object obj4 = oraVar2.get(i11);
                rv4Var.b0(1171574969, xt4Var3.invoke(obj4));
                lu4 lu4Var = (lu4) tv7Var.g(obj4);
                if (lu4Var == null) {
                    rv4Var.e0(1959122128);
                } else {
                    rv4Var.e0(1171576145);
                    lu4Var.invoke(rv4Var, 0);
                }
                rv4Var.q(false);
                rv4Var.q(false);
            }
            rv4Var.q(false);
            rv4Var.q(true);
            xt4Var2 = xt4Var3;
        } else {
            rv4Var.X();
            xt4Var2 = xt4Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new md2(tkcVar, nq7Var, lf4Var, xt4Var2, tu1Var, i2);
        }
    }

    public static final void g(Boolean bool, nq7 nq7Var, lf4 lf4Var, String str, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        kq7 kq7Var;
        String str2;
        rv4Var.g0(-513216493);
        if (rv4Var.f(bool)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3 | 48;
        if (rv4Var.h(lf4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i6 = i5 | i4 | 3072;
        if ((i6 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            f(bze.t(bool, "Crossfade", rv4Var, (i6 & 14) | 48, 0), kq7Var2, lf4Var, null, tu1Var, rv4Var, i6 & 58352);
            kq7Var = kq7Var2;
            str2 = "Crossfade";
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
            str2 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kd2(bool, kq7Var, lf4Var, str2, tu1Var, i2);
        }
    }

    public static final void h(float f2, String str, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        String str2;
        boolean z2;
        boolean z3;
        boolean z4;
        lh9 lh9Var;
        boolean z5;
        boolean z6;
        boolean z7;
        float f3;
        boolean z8;
        boolean z9;
        float f4 = f2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-672716385);
        if (rv4Var2.c(f4)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var2.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var2.f(nq7Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i12 & 1, z)) {
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
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
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ar5 c2 = rp5.c((wk3) jk3.o0.getValue(), rv4Var2, 0);
            long j2 = r0f.y(rv4Var2).q;
            kq7 kq7Var = kq7.a;
            nq7 n = pna.n(kq7Var, 40.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            long b2 = zl1.b(0.2f, r0f.y(rv4Var2).a);
            ba5 ba5Var = lre.g;
            nk5.a(c2, null, zbe.y(nmd.v(k, b2, ba5Var), 8.0f), j2, rv4Var2, 48, 0);
            nq7 A = zbe.A(kq7Var, 12.0f, nae.e, 2);
            gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, A);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            ar5 c3 = rp5.c((wk3) rk3.i.getValue(), rv4Var2, 0);
            long j3 = r0f.y(rv4Var2).q;
            nq7 k2 = tte.k(pna.p(kq7Var, 48.0f, 36.0f), su9Var);
            int i13 = i12 & 14;
            if (i13 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i14 = i12 & 7168;
            if (i14 == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z10 = z2 | z3;
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (!z10 && P != lh9Var2) {
                z4 = false;
                lh9Var = lh9Var2;
            } else {
                z4 = false;
                lh9Var = lh9Var2;
                P = new hm7(f2, 0, xt4Var);
                rv4Var2.o0(P);
            }
            lh9 lh9Var3 = lh9Var;
            nk5.a(c3, null, zbe.y(nmd.v(st0.d(lbe.f(15, (vt4) P, k2, null, z4), 1.0f, zl1.b(0.3f, r0f.y(rv4Var2).a), su9Var), zl1.b(0.1f, r0f.y(rv4Var2).a), ba5Var), 8.0f), j3, rv4Var2, 48, 0);
            if (i13 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P2 = rv4Var2.P();
            if (z5 || P2 == lh9Var3) {
                P2 = rqe.h("%.1f", Float.valueOf(16.0f * f2));
                rv4Var2.o0(P2);
            }
            f4 = f2;
            cvb.c((String) P2, pna.t(kq7Var, 60.0f, 80.0f), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).j, rv4Var, 48, 0, 130040);
            ar5 c4 = rp5.c((wk3) rk3.j.getValue(), rv4Var, 0);
            long j4 = r0f.y(rv4Var).q;
            nq7 k3 = tte.k(pna.p(kq7Var, 44.0f, 36.0f), su9Var);
            if (i13 == 4) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i14 == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11 = z7 | z6;
            Object P3 = rv4Var.P();
            if (z11 || P3 == lh9Var3) {
                P3 = new hm7(f4, 1, xt4Var);
                rv4Var.o0(P3);
            }
            nk5.a(c4, null, zbe.y(nmd.v(st0.d(lbe.f(15, (vt4) P3, k3, null, false), 1.0f, zl1.b(0.3f, r0f.y(rv4Var).a), su9Var), zl1.b(0.1f, r0f.y(rv4Var).a), ba5Var), 8.0f), j4, rv4Var, 48, 0);
            s21.x(rv4Var, true, kq7Var, 6.0f, rv4Var);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            nq7 k4 = tte.k(pna.h(new we6(f3, true), 36.0f), su9Var);
            if ((i12 & 57344) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object P4 = rv4Var.P();
            if (z8 || P4 == lh9Var3) {
                P4 = new hi7(26, vt4Var);
                rv4Var.o0(P4);
            }
            nq7 A2 = zbe.A(nmd.v(st0.d(lbe.f(15, (vt4) P4, k4, null, false), 1.0f, zl1.b(0.3f, r0f.y(rv4Var).a), su9Var), zl1.b(0.1f, r0f.y(rv4Var).a), ba5Var), 8.0f, nae.e, 2);
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, A2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            if ((i12 & Token.ASSIGN_MOD) == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object P5 = rv4Var.P();
            if (!z9 && P5 != lh9Var3) {
                str2 = str;
            } else {
                str2 = str;
                P5 = k4b.J0(k4b.F0(str2, "/", str2), ".");
                rv4Var.o0(P5);
            }
            String str3 = (String) P5;
            rv4Var.e0(-1222659567);
            if (str3.length() == 0) {
                str3 = yqe.A((y3b) o3b.J.getValue(), rv4Var);
            }
            String str4 = str3;
            rv4Var.q(false);
            long q = zr1.q(18);
            eo4 q2 = nae.q(str2, rv4Var, (i12 >> 3) & 14);
            long j5 = r0f.y(rv4Var).q;
            float f5 = Float.MAX_VALUE;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f <= Float.MAX_VALUE) {
                f5 = 1.0f;
            }
            cvb.c(str4, l0e.u(new we6(f5, true)), j5, null, q, null, null, q2, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, null, rv4Var, 24576, 0, 260968);
            rv4Var2 = rv4Var;
            nk5.a(rp5.c((wk3) ok3.u.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 24.0f), r0f.y(rv4Var2).q, rv4Var2, 432, 0);
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            str2 = str;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vc3(f4, str2, nq7Var, xt4Var, vt4Var, i2);
        }
    }

    public static final void i(nq7 nq7Var, vt4 vt4Var, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1463316167);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.h(tu1Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            int i7 = i3 >> 3;
            aw7 D = yae.D(vt4Var, rv4Var2);
            nq7 y = zbe.y(nq7Var, 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
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
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            Object valueOf2 = Integer.valueOf((i7 & Token.ASSIGN_MOD) | 6);
            zn1 zn1Var = zn1.a;
            tu1Var.c(zn1Var, rv4Var2, valueOf2);
            lk0 lk0Var = kh5.K;
            kq7 kq7Var = kq7.a;
            nq7 a3 = zn1Var.a(kq7Var, lk0Var);
            boolean f2 = rv4Var2.f(D);
            Object P = rv4Var2.P();
            if (f2 || P == ax1.a) {
                P = new nd7(D, 26);
                rv4Var2.o0(P);
            }
            nq7 f3 = lbe.f(15, (vt4) P, a3, null, false);
            gv9 a4 = ev9.a(lz.b, kh5.G, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f3);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            String A = yqe.A((y3b) b3b.C.getValue(), rv4Var2);
            tza tzaVar = j27.a;
            cvb.c(A, null, ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            nk5.a(rp5.c((wk3) ok3.d0.getValue(), rv4Var2, 0), null, pna.n(kq7Var, 18.0f), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, 432, 0);
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new va(nq7Var, (Object) vt4Var, (hu4) tu1Var, i2, 20);
        }
    }

    public static final void j(fo3 fo3Var, lu4 lu4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        fo3Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(373473580);
        if (rv4Var.f(fo3Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var.h(lu4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            boolean booleanValue = ((Boolean) fo3Var.a.getValue()).booleanValue();
            nq7 x = mwe.x(kq7.a, 14);
            if ((i6 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new uf7(fo3Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(-221850280, new vf7(fo3Var, lu4Var), rv4Var), null, x, jce.E(-1400847115, new w34(fo3Var, 1), rv4Var), lye.b, null, 0L, 0L, nae.e, false, false, jce.E(-165590528, new w34(fo3Var, 2), rv4Var), rv4Var, 1769856, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vf7(fo3Var, lu4Var, i2);
        }
    }

    public static final void k(boolean z, nnb nnbVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, xt4 xt4Var6, xt4 xt4Var7, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var8, xt4 xt4Var9, xt4 xt4Var10, xt4 xt4Var11, xt4 xt4Var12, nu4 nu4Var, xt4 xt4Var13, rv4 rv4Var, int i2) {
        int i3;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        rv4 rv4Var2 = rv4Var;
        nnbVar.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        xt4Var5.getClass();
        xt4Var6.getClass();
        xt4Var7.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        xt4Var8.getClass();
        xt4Var9.getClass();
        xt4Var10.getClass();
        xt4Var11.getClass();
        xt4Var12.getClass();
        nu4Var.getClass();
        xt4Var13.getClass();
        rv4Var2.g0(627359452);
        if ((i2 & 6) == 0) {
            i3 = (rv4Var2.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            obj = nnbVar;
            i3 |= rv4Var2.f(obj) ? 32 : 16;
        } else {
            obj = nnbVar;
        }
        if ((i2 & 384) == 0) {
            obj2 = xt4Var;
            i3 |= rv4Var2.h(obj2) ? 256 : Token.CASE;
        } else {
            obj2 = xt4Var;
        }
        if ((i2 & 3072) == 0) {
            obj3 = xt4Var2;
            i3 |= rv4Var2.h(obj3) ? 2048 : 1024;
        } else {
            obj3 = xt4Var2;
        }
        if ((i2 & 24576) == 0) {
            obj4 = xt4Var3;
            i3 |= rv4Var2.h(obj4) ? 16384 : 8192;
        } else {
            obj4 = xt4Var3;
        }
        if ((i2 & 196608) == 0) {
            i3 |= rv4Var2.h(xt4Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= rv4Var2.h(xt4Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= rv4Var2.h(xt4Var6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= rv4Var2.h(xt4Var7) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= rv4Var2.h(vt4Var) ? 536870912 : 268435456;
        }
        if (rv4Var2.U(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((((rv4Var2.h(vt4Var2) ? (char) 4 : (char) 2) | (rv4Var2.h(xt4Var8) ? ' ' : (char) 16)) | (rv4Var2.h(xt4Var9) ? 256 : Token.CASE)) | (rv4Var2.h(xt4Var10) ? 2048 : 1024)) | (rv4Var2.h(xt4Var11) ? (char) 16384 : (char) 8192)) | (rv4Var2.h(xt4Var12) ? (char) 0 : (char) 0)) | (rv4Var2.h(nu4Var) ? (char) 0 : (char) 0)) | (rv4Var2.h(xt4Var13) ? (char) 0 : (char) 0)) & 4793491) == 4793490) ? false : true)) {
            if (ikd.a(rv4Var2)) {
                rv4Var2.e0(-2031425613);
                l(z, obj, obj2, obj3, obj4, xt4Var4, xt4Var5, xt4Var6, xt4Var7, vt4Var, vt4Var2, xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, nu4Var, xt4Var13, rv4Var2, i3 & 2147483646);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-2030448648);
                m(z, nnbVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, vt4Var, vt4Var2, xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, nu4Var, xt4Var13, rv4Var2, i3 & 2147483646);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bm7(z, nnbVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, vt4Var, vt4Var2, xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, nu4Var, xt4Var13, i2, 0);
        }
    }

    public static final void l(final boolean z, final nnb nnbVar, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, final xt4 xt4Var6, final xt4 xt4Var7, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var8, final xt4 xt4Var9, final xt4 xt4Var10, final xt4 xt4Var11, final xt4 xt4Var12, final nu4 nu4Var, final xt4 xt4Var13, rv4 rv4Var, int i2) {
        int i3;
        Object obj;
        Object obj2;
        Object obj3;
        rv4Var.g0(2062921380);
        if ((i2 & 6) == 0) {
            i3 = (rv4Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rv4Var.f(nnbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            obj = xt4Var;
            i3 |= rv4Var.h(obj) ? 256 : Token.CASE;
        } else {
            obj = xt4Var;
        }
        if ((i2 & 3072) == 0) {
            obj2 = xt4Var2;
            i3 |= rv4Var.h(obj2) ? 2048 : 1024;
        } else {
            obj2 = xt4Var2;
        }
        if ((i2 & 24576) == 0) {
            obj3 = xt4Var3;
            i3 |= rv4Var.h(obj3) ? 16384 : 8192;
        } else {
            obj3 = xt4Var3;
        }
        if ((i2 & 196608) == 0) {
            i3 |= rv4Var.h(xt4Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= rv4Var.h(xt4Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= rv4Var.h(xt4Var6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= rv4Var.h(xt4Var7) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= rv4Var.h(vt4Var) ? 536870912 : 268435456;
        }
        int i4 = i3;
        if (rv4Var.U(i4 & 1, ((i4 & 306783379) == 306783378 && (((((((((rv4Var.h(vt4Var2) ? (char) 4 : (char) 2) | (rv4Var.h(xt4Var8) ? ' ' : (char) 16)) | (rv4Var.h(xt4Var9) ? 256 : Token.CASE)) | (rv4Var.h(xt4Var10) ? 2048 : 1024)) | (rv4Var.h(xt4Var11) ? (char) 16384 : (char) 8192)) | (rv4Var.h(xt4Var12) ? (char) 0 : (char) 0)) | (rv4Var.h(nu4Var) ? (char) 0 : (char) 0)) | (rv4Var.h(xt4Var13) ? (char) 0 : (char) 0)) & 4793491) == 4793490) ? false : true)) {
            final xt4 xt4Var14 = obj2;
            final xt4 xt4Var15 = obj3;
            final xt4 xt4Var16 = obj;
            hc2.b(pna.c, null, jce.E(-1561721734, new mu4() { // from class: pm7
                @Override // defpackage.mu4
                public final Object c(Object obj4, Object obj5, Object obj6) {
                    boolean z2;
                    int i5;
                    su0 su0Var = (su0) obj4;
                    rv4 rv4Var2 = (rv4) obj5;
                    int intValue = ((Integer) obj6).intValue();
                    su0Var.getClass();
                    if ((intValue & 6) == 0) {
                        if (rv4Var2.f(su0Var)) {
                            i5 = 4;
                        } else {
                            i5 = 2;
                        }
                        intValue |= i5;
                    }
                    if ((intValue & 19) != 18) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z2)) {
                        nq7 h2 = pna.h(kq7.a, su0Var.c() * 0.6f);
                        long j2 = ((h27) rv4Var2.j(j27.a)).a.p;
                        Object P = rv4Var2.P();
                        if (P == ax1.a) {
                            P = new si7(19);
                            rv4Var2.o0(P);
                        }
                        final nnb nnbVar2 = nnbVar;
                        final xt4 xt4Var17 = xt4Var14;
                        final xt4 xt4Var18 = xt4Var15;
                        final xt4 xt4Var19 = xt4Var4;
                        final xt4 xt4Var20 = xt4Var5;
                        final xt4 xt4Var21 = xt4Var6;
                        final xt4 xt4Var22 = xt4Var7;
                        final vt4 vt4Var3 = vt4Var;
                        final vt4 vt4Var4 = vt4Var2;
                        final xt4 xt4Var23 = xt4Var8;
                        final xt4 xt4Var24 = xt4Var9;
                        final xt4 xt4Var25 = xt4Var10;
                        final xt4 xt4Var26 = xt4Var11;
                        final xt4 xt4Var27 = xt4Var12;
                        final nu4 nu4Var2 = nu4Var;
                        final xt4 xt4Var28 = xt4Var13;
                        nmd.d(z, xt4Var16, h2, false, (xt4) P, null, j2, 0L, nae.e, 0L, null, jce.E(-1568607786, new mu4() { // from class: um7
                            @Override // defpackage.mu4
                            public final Object c(Object obj7, Object obj8, Object obj9) {
                                boolean z3;
                                rv4 rv4Var3 = (rv4) obj8;
                                int intValue2 = ((Integer) obj9).intValue();
                                ((zn1) obj7).getClass();
                                if ((intValue2 & 17) != 16) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (rv4Var3.U(intValue2 & 1, z3)) {
                                    ctd.s(nnb.this, mwe.x(pna.c, 14), xt4Var17, xt4Var18, xt4Var19, xt4Var20, xt4Var21, xt4Var22, vt4Var3, vt4Var4, xt4Var23, xt4Var24, xt4Var25, xt4Var26, xt4Var27, nu4Var2, xt4Var28, rv4Var3, 0);
                                } else {
                                    rv4Var3.X();
                                }
                                return pvc.a;
                            }
                        }, rv4Var2), rv4Var2, 27648, 48, 1952);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bm7(z, nnbVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, vt4Var, vt4Var2, xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, nu4Var, xt4Var13, i2, 2);
        }
    }

    public static final void m(boolean z, final nnb nnbVar, xt4 xt4Var, xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, final xt4 xt4Var6, final xt4 xt4Var7, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var8, final xt4 xt4Var9, final xt4 xt4Var10, final xt4 xt4Var11, final xt4 xt4Var12, final nu4 nu4Var, final xt4 xt4Var13, rv4 rv4Var, int i2) {
        int i3;
        Object obj;
        rv4Var.g0(1563383787);
        if ((i2 & 6) == 0) {
            i3 = (rv4Var.g(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= rv4Var.f(nnbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= rv4Var.h(xt4Var) ? 256 : Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            obj = xt4Var2;
            i3 |= rv4Var.h(obj) ? 2048 : 1024;
        } else {
            obj = xt4Var2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= rv4Var.h(xt4Var3) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= rv4Var.h(xt4Var4) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= rv4Var.h(xt4Var5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i3 |= rv4Var.h(xt4Var6) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= rv4Var.h(xt4Var7) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i3 |= rv4Var.h(vt4Var) ? 536870912 : 268435456;
        }
        if (rv4Var.U(i3 & 1, ((i3 & 306783379) == 306783378 && (((((((((rv4Var.h(vt4Var2) ? (char) 4 : (char) 2) | (rv4Var.h(xt4Var8) ? ' ' : (char) 16)) | (rv4Var.h(xt4Var9) ? 256 : Token.CASE)) | (rv4Var.h(xt4Var10) ? 2048 : 1024)) | (rv4Var.h(xt4Var11) ? (char) 16384 : (char) 8192)) | (rv4Var.h(xt4Var12) ? (char) 0 : (char) 0)) | (rv4Var.h(nu4Var) ? (char) 0 : (char) 0)) | (rv4Var.h(xt4Var13) ? (char) 0 : (char) 0)) & 4793491) == 4793490) ? false : true)) {
            final xt4 xt4Var14 = obj;
            nmd.f(z, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(-1257851750, new lu4() { // from class: fm7
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    boolean z2;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z2)) {
                        ze4 ze4Var = pna.c;
                        nq7 x = mwe.x(zbe.A(ze4Var, 8.0f, nae.e, 2), 13);
                        xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, x);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(qw1.f, rv4Var2, a2);
                        jce.F(qw1.e, rv4Var2, l);
                        jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var2);
                        jce.F(qw1.d, rv4Var2, p);
                        cvb.c(yqe.A((y3b) b3b.b0.getValue(), rv4Var2), zbe.y(kq7.a, 12.0f), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 48, 0, 131068);
                        ctd.s(nnb.this, ze4Var, xt4Var14, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, vt4Var, vt4Var2, xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, nu4Var, xt4Var13, rv4Var2, 48);
                        rv4Var2.q(true);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, (i3 & 14) | 805309440 | ((i3 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bm7(z, nnbVar, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, xt4Var7, vt4Var, vt4Var2, xt4Var8, xt4Var9, xt4Var10, xt4Var11, xt4Var12, nu4Var, xt4Var13, i2, 1);
        }
    }

    public static final void n(int i2, int i3, int i4, int i5, nq7 nq7Var, nu4 nu4Var, rv4 rv4Var, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z;
        nq7 nq7Var2;
        rv4Var.g0(586218747);
        if (rv4Var.d(i2)) {
            i7 = 4;
        } else {
            i7 = 2;
        }
        int i12 = i6 | i7;
        if (rv4Var.d(i3)) {
            i8 = 32;
        } else {
            i8 = 16;
        }
        int i13 = i12 | i8;
        if (rv4Var.d(i4)) {
            i9 = 256;
        } else {
            i9 = Token.CASE;
        }
        int i14 = i13 | i9;
        if (rv4Var.d(i5)) {
            i10 = 2048;
        } else {
            i10 = 1024;
        }
        int i15 = i14 | i10;
        if (rv4Var.h(nu4Var)) {
            i11 = 131072;
        } else {
            i11 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i11;
        if ((74899 & i16) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i16 & 1, z)) {
            aw7 D = yae.D(nu4Var, rv4Var);
            aw7 D2 = yae.D(Integer.valueOf(i2), rv4Var);
            aw7 D3 = yae.D(Integer.valueOf(i3), rv4Var);
            aw7 D4 = yae.D(Integer.valueOf(i4), rv4Var);
            aw7 D5 = yae.D(Integer.valueOf(i5), rv4Var);
            boolean f2 = rv4Var.f(D);
            Object P = rv4Var.P();
            if (f2 || P == ax1.a) {
                P = new nd7(D, 23);
                rv4Var.o0(P);
            }
            nq7Var2 = nq7Var;
            i(nq7Var2, (vt4) P, jce.E(504099337, new km7(D, D3, D4, D5, i4, D2, i3, i5), rv4Var), rv4Var, 390);
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lm7(i2, i3, i4, i5, nq7Var2, nu4Var, i6);
        }
    }

    public static final void o(int i2, int i3, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i4;
        int i5;
        int i6;
        boolean z;
        boolean z2;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1951008997);
        if (rv4Var2.d(i2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i7 = i3 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i8 = i7 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i9 = i8 | i6;
        if ((i9 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ar5 c2 = rp5.c((wk3) rk3.g.getValue(), rv4Var2, 0);
            tza tzaVar = j27.a;
            long j2 = ((h27) rv4Var2.j(tzaVar)).a.q;
            kq7 kq7Var = kq7.a;
            nk5.a(c2, null, zbe.y(nmd.v(tte.k(pna.n(kq7Var, 40.0f), uu9.a), zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.a), lre.g), 8.0f), j2, rv4Var2, 48, 0);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            List m = cqe.m((q3b) nz.A.getValue(), rv4Var2);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            hz hzVar = new hz(8.0f, true, new vs(2));
            boolean h2 = rv4Var2.h(m);
            if ((i9 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = h2 | z2;
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var2.P();
            if (z5 || P == ax1.a) {
                P = new wj7(i2, 1, xt4Var, m);
                rv4Var2.o0(P);
            }
            ej6.a(f2, i2, null, null, hzVar, null, null, false, (xt4) P, rv4Var, ((i9 << 3) & Token.ASSIGN_MOD) | 196614, 476);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new p61(i2, nq7Var, xt4Var, i3, 6);
        }
    }

    public static final long p(float f2, float f3) {
        long floatToIntBits = (Float.floatToIntBits(f3) & 4294967295L) | (Float.floatToIntBits(f2) << 32);
        int i2 = mna.c;
        return floatToIntBits;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x01a4, code lost:
        if (r7 == r4) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void q(final float r41, final java.lang.String r42, final defpackage.mu4 r43, final float r44, final float r45, final float r46, final defpackage.nq7 r47, final defpackage.xt4 r48, defpackage.rv4 r49, final int r50) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.q(float, java.lang.String, mu4, float, float, float, nq7, xt4, rv4, int):void");
    }

    public static final void r(final float f2, final int i2, nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        rv4Var.g0(-1000092041);
        if (rv4Var.c(f2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i3;
        if (rv4Var.d(i2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i11 = i10 | i7;
        boolean z3 = true;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            if ((i11 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i11 & 57344) != 16384) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new mm7(0, xt4Var, xt4Var2);
                rv4Var.o0(P);
            }
            i(nq7Var, (vt4) P, jce.E(711923369, new mu4() { // from class: nm7
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z5;
                    boolean z6;
                    boolean z7;
                    float f3;
                    ba5 ba5Var = lre.g;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zn1) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z5)) {
                        String A = yqe.A((y3b) o3b.Q.getValue(), rv4Var2);
                        kq7 kq7Var = kq7.a;
                        nq7 f4 = pna.f(kq7Var, 1.0f);
                        sv1 sv1Var = new sv1(27);
                        xt4 xt4Var3 = xt4Var;
                        boolean f5 = rv4Var2.f(xt4Var3);
                        Object P2 = rv4Var2.P();
                        lh9 lh9Var = ax1.a;
                        if (f5 || P2 == lh9Var) {
                            P2 = new im(18, xt4Var3);
                            rv4Var2.o0(P2);
                        }
                        ctd.q(f2, A, sv1Var, nae.e, 5.0f, 0.1f, f4, (xt4) P2, rv4Var2, 1797120);
                        xbe.i(rv4Var2, pna.h(kq7Var, 8.0f));
                        mk0 mk0Var = kh5.G;
                        dz dzVar = lz.a;
                        gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, kq7Var);
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
                        jce.F(npVar2, rv4Var2, l);
                        Integer valueOf = Integer.valueOf(hashCode);
                        np npVar3 = qw1.g;
                        jce.F(npVar3, rv4Var2, valueOf);
                        kg kgVar = qw1.h;
                        jce.C(kgVar, rv4Var2);
                        np npVar4 = qw1.d;
                        jce.F(npVar4, rv4Var2, p);
                        String A2 = yqe.A((y3b) o3b.O.getValue(), rv4Var2);
                        tza tzaVar = j27.a;
                        cvb.c(A2, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var2, 0, 0, 130040);
                        Object P3 = rv4Var2.P();
                        wk3[] wk3VarArr = P3;
                        if (P3 == lh9Var) {
                            wk3[] wk3VarArr2 = {(wk3) jk3.f0.getValue(), (wk3) jk3.g0.getValue(), (wk3) jk3.d0.getValue(), (wk3) jk3.e0.getValue()};
                            rv4Var2.o0(wk3VarArr2);
                            wk3VarArr = wk3VarArr2;
                        }
                        wk3[] wk3VarArr3 = (wk3[]) wk3VarArr;
                        nq7 v = nmd.v(tte.k(kq7Var, ((h27) rv4Var2.j(tzaVar)).c.b), zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.a), ba5Var);
                        gv9 a3 = ev9.a(dzVar, kh5.F, rv4Var2, 0);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l2 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, v);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, a3);
                        jce.F(npVar2, rv4Var2, l2);
                        s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
                        jce.F(npVar4, rv4Var2, p2);
                        rv4Var2.e0(1760668621);
                        int length = wk3VarArr3.length;
                        int i12 = 0;
                        int i13 = 0;
                        while (i13 < length) {
                            wk3 wk3Var = wk3VarArr3[i13];
                            int i14 = i12 + 1;
                            if (i12 == i2) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            ar5 c2 = rp5.c(wk3Var, rv4Var2, 0);
                            tza tzaVar2 = j27.a;
                            long j2 = ((h27) rv4Var2.j(tzaVar2)).a.q;
                            int i15 = length;
                            nq7 p3 = pna.p(kq7Var, 48.0f, 32.0f);
                            xt4 xt4Var4 = xt4Var2;
                            boolean f6 = rv4Var2.f(xt4Var4) | rv4Var2.d(i12);
                            Object P4 = rv4Var2.P();
                            if (!f6 && P4 != lh9Var) {
                                z7 = z6;
                            } else {
                                z7 = z6;
                                P4 = new tp0(xt4Var4, i12, 12);
                                rv4Var2.o0(P4);
                            }
                            nq7 f7 = lbe.f(15, (vt4) P4, p3, null, false);
                            long j3 = ((h27) rv4Var2.j(tzaVar2)).a.a;
                            if (z7) {
                                f3 = 0.5f;
                            } else {
                                f3 = nae.e;
                            }
                            nk5.a(c2, null, zbe.y(nmd.v(f7, zl1.b(f3, j3), ba5Var), 4.0f), j2, rv4Var2, 48, 0);
                            i13++;
                            i12 = i14;
                            length = i15;
                        }
                        rv4Var2.q(false);
                        rv4Var2.q(true);
                        xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
                        rv4Var2.q(true);
                        xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 390);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new om7(f2, i2, nq7Var, xt4Var, xt4Var2, i3);
        }
    }

    public static final void s(final nnb nnbVar, final nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final xt4 xt4Var5, final xt4 xt4Var6, final vt4 vt4Var, final vt4 vt4Var2, final xt4 xt4Var7, final xt4 xt4Var8, final xt4 xt4Var9, final xt4 xt4Var10, final xt4 xt4Var11, final nu4 nu4Var, final xt4 xt4Var12, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        char c2;
        char c3;
        int i12;
        int i13;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        int i14;
        rv4 rv4Var2;
        int i15;
        rv4Var.g0(828734336);
        if (rv4Var.f(nnbVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i16 = i2 | i3;
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i16 |= i15;
        }
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i17 = i16 | i4;
        if (rv4Var.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i18 = i17 | i5;
        char c4 = 8192;
        if (rv4Var.h(xt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i19 = i18 | i6;
        char c5 = 0;
        if (rv4Var.h(xt4Var4)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i20 = i19 | i7;
        char c6 = 0;
        if (rv4Var.h(xt4Var5)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i21 = i20 | i8;
        if (rv4Var.h(xt4Var6)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i22 = i21 | i9;
        if (rv4Var.h(vt4Var)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i23 = i22 | i10;
        if (rv4Var.h(vt4Var2)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i24 = i23 | i11;
        if (rv4Var.h(xt4Var7)) {
            c2 = 4;
        } else {
            c2 = 2;
        }
        if (rv4Var.h(xt4Var8)) {
            c3 = ' ';
        } else {
            c3 = 16;
        }
        int i25 = c2 | c3;
        if (rv4Var.h(xt4Var9)) {
            i12 = 256;
        } else {
            i12 = Token.CASE;
        }
        int i26 = i25 | i12;
        if (rv4Var.h(xt4Var10)) {
            i13 = 2048;
        } else {
            i13 = 1024;
        }
        int i27 = i26 | i13;
        if (rv4Var.h(xt4Var11)) {
            c4 = 16384;
        }
        int i28 = i27 | c4;
        if (rv4Var.h(nu4Var)) {
            c5 = 0;
        }
        int i29 = i28 | c5;
        if (rv4Var.h(xt4Var12)) {
            c6 = 0;
        }
        int i30 = i29 | c6;
        boolean z17 = false;
        if ((i24 & 306783379) == 306783378 && (599187 & i30) == 599186) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i24 & 1, z)) {
            List list = nnbVar.b;
            List list2 = nnbVar.c;
            boolean f2 = rv4Var.f(list) | rv4Var.f(list2);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f2 || P == lh9Var) {
                P = sl1.n0(sl1.n0(tl1.A(new pn1("", "", "", "")), nnbVar.b), list2);
                rv4Var.o0(P);
            }
            final List list3 = (List) P;
            final boolean e2 = ((om3) rv4Var.j(nm3.a)).e();
            if ((i24 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z18 = z2;
            if ((i24 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z19 = z18 | z3;
            if ((i24 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z20 = z19 | z4;
            if ((i24 & 57344) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean g2 = z20 | z5 | rv4Var.g(e2) | rv4Var.h(list3);
            if ((i24 & 3670016) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z21 = z6 | g2;
            if ((1879048192 & i24) == 536870912) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z22 = z21 | z7;
            if ((i24 & 458752) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z23 = z22 | z8;
            if ((234881024 & i24) == 67108864) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z24 = z23 | z9;
            if ((29360128 & i24) == 8388608) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z25 = z24 | z10;
            if ((i30 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z26 = z25 | z11;
            if ((i30 & Token.ASSIGN_MOD) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z27 = z26 | z12;
            if ((i30 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z28 = z27 | z13;
            if ((i30 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z29 = z28 | z14;
            if ((i30 & 57344) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z30 = z29 | z15;
            if ((i30 & 458752) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z31 = z30 | z16;
            if ((i30 & 3670016) == 1048576) {
                z17 = true;
            }
            boolean z32 = z31 | z17;
            Object P2 = rv4Var.P();
            if (!z32 && P2 != lh9Var) {
                rv4Var2 = rv4Var;
                i14 = i24;
            } else {
                i14 = i24;
                xt4 xt4Var13 = new xt4() { // from class: wm7
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj) {
                        ri6 ri6Var = (ri6) obj;
                        ri6Var.getClass();
                        final nnb nnbVar2 = nnbVar;
                        final xt4 xt4Var14 = xt4Var;
                        final xt4 xt4Var15 = xt4Var2;
                        final xt4 xt4Var16 = xt4Var3;
                        ri6.y(ri6Var, null, new tu1(new mu4() { // from class: dm7
                            @Override // defpackage.mu4
                            public final Object c(Object obj2, Object obj3, Object obj4) {
                                int i31 = r5;
                                pvc pvcVar = pvc.a;
                                kq7 kq7Var = kq7.a;
                                boolean z33 = false;
                                nnb nnbVar3 = nnbVar2;
                                switch (i31) {
                                    case 0:
                                        rv4 rv4Var3 = (rv4) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        ((xg6) obj2).getClass();
                                        if ((intValue & 17) != 16) {
                                            z33 = true;
                                        }
                                        if (rv4Var3.U(intValue & 1, z33)) {
                                            ctd.t(nnbVar3.m, nnbVar3.k, nnbVar3.l, pna.f(kq7Var, 1.0f), xt4Var14, xt4Var15, xt4Var16, rv4Var3, 3072);
                                        } else {
                                            rv4Var3.X();
                                        }
                                        return pvcVar;
                                    default:
                                        rv4 rv4Var4 = (rv4) obj3;
                                        int intValue2 = ((Integer) obj4).intValue();
                                        ((xg6) obj2).getClass();
                                        if ((intValue2 & 17) != 16) {
                                            z33 = true;
                                        }
                                        if (rv4Var4.U(intValue2 & 1, z33)) {
                                            ctd.c(nnbVar3.q, nnbVar3.p, nnbVar3.s, zbe.z(pna.f(kq7Var, 1.0f), 12.0f, 8.0f), xt4Var14, xt4Var15, xt4Var16, rv4Var4, 0);
                                        } else {
                                            rv4Var4.X();
                                        }
                                        return pvcVar;
                                }
                            }
                        }, true, 537031381), 3);
                        if (!e2) {
                            ri6.y(ri6Var, null, new tu1(new g83(nnbVar2, list3, xt4Var5, vt4Var2), true, -633781072), 3);
                        }
                        ri6.y(ri6Var, null, new tu1(new ld1(26, nnbVar2, xt4Var4, vt4Var), true, -761908084), 3);
                        final xt4 xt4Var17 = xt4Var6;
                        ri6.y(ri6Var, null, new tu1(new mu4() { // from class: cm7
                            @Override // defpackage.mu4
                            public final Object c(Object obj2, Object obj3, Object obj4) {
                                boolean z33;
                                int i31 = r3;
                                pvc pvcVar = pvc.a;
                                kq7 kq7Var = kq7.a;
                                boolean z34 = false;
                                xt4 xt4Var18 = xt4Var17;
                                nnb nnbVar3 = nnbVar2;
                                xg6 xg6Var = (xg6) obj2;
                                rv4 rv4Var3 = (rv4) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                switch (i31) {
                                    case 0:
                                        xg6Var.getClass();
                                        if ((intValue & 17) != 16) {
                                            z33 = true;
                                        } else {
                                            z33 = false;
                                        }
                                        if (rv4Var3.U(intValue & 1, z33)) {
                                            ctd.o(nnbVar3.t, 0, xt4Var18, rv4Var3, zbe.z(pna.f(kq7Var, 1.0f), 12.0f, 8.0f));
                                        } else {
                                            rv4Var3.X();
                                        }
                                        return pvcVar;
                                    default:
                                        xg6Var.getClass();
                                        if ((intValue & 17) != 16) {
                                            z34 = true;
                                        }
                                        if (rv4Var3.U(intValue & 1, z34)) {
                                            ctd.v(nnbVar3.u, 48, xt4Var18, rv4Var3, pna.f(kq7Var, 1.0f));
                                        } else {
                                            rv4Var3.X();
                                        }
                                        return pvcVar;
                                }
                            }
                        }, true, -900693491), 3);
                        ri6.y(ri6Var, null, new tu1(new ld1(27, nnbVar2, xt4Var7, xt4Var8), true, -1039478898), 3);
                        final xt4 xt4Var18 = xt4Var9;
                        final xt4 xt4Var19 = xt4Var10;
                        final xt4 xt4Var20 = xt4Var11;
                        ri6.y(ri6Var, null, new tu1(new mu4() { // from class: dm7
                            @Override // defpackage.mu4
                            public final Object c(Object obj2, Object obj3, Object obj4) {
                                int i31 = r5;
                                pvc pvcVar = pvc.a;
                                kq7 kq7Var = kq7.a;
                                boolean z33 = false;
                                nnb nnbVar3 = nnbVar2;
                                switch (i31) {
                                    case 0:
                                        rv4 rv4Var3 = (rv4) obj3;
                                        int intValue = ((Integer) obj4).intValue();
                                        ((xg6) obj2).getClass();
                                        if ((intValue & 17) != 16) {
                                            z33 = true;
                                        }
                                        if (rv4Var3.U(intValue & 1, z33)) {
                                            ctd.t(nnbVar3.m, nnbVar3.k, nnbVar3.l, pna.f(kq7Var, 1.0f), xt4Var18, xt4Var19, xt4Var20, rv4Var3, 3072);
                                        } else {
                                            rv4Var3.X();
                                        }
                                        return pvcVar;
                                    default:
                                        rv4 rv4Var4 = (rv4) obj3;
                                        int intValue2 = ((Integer) obj4).intValue();
                                        ((xg6) obj2).getClass();
                                        if ((intValue2 & 17) != 16) {
                                            z33 = true;
                                        }
                                        if (rv4Var4.U(intValue2 & 1, z33)) {
                                            ctd.c(nnbVar3.q, nnbVar3.p, nnbVar3.s, zbe.z(pna.f(kq7Var, 1.0f), 12.0f, 8.0f), xt4Var18, xt4Var19, xt4Var20, rv4Var4, 0);
                                        } else {
                                            rv4Var4.X();
                                        }
                                        return pvcVar;
                                }
                            }
                        }, true, -1178264305), 3);
                        ri6.y(ri6Var, null, new tu1(new em7(0, nnbVar2, nu4Var), true, -1317049712), 3);
                        final xt4 xt4Var21 = xt4Var12;
                        ri6.y(ri6Var, null, new tu1(new mu4() { // from class: cm7
                            @Override // defpackage.mu4
                            public final Object c(Object obj2, Object obj3, Object obj4) {
                                boolean z33;
                                int i31 = r3;
                                pvc pvcVar = pvc.a;
                                kq7 kq7Var = kq7.a;
                                boolean z34 = false;
                                xt4 xt4Var182 = xt4Var21;
                                nnb nnbVar3 = nnbVar2;
                                xg6 xg6Var = (xg6) obj2;
                                rv4 rv4Var3 = (rv4) obj3;
                                int intValue = ((Integer) obj4).intValue();
                                switch (i31) {
                                    case 0:
                                        xg6Var.getClass();
                                        if ((intValue & 17) != 16) {
                                            z33 = true;
                                        } else {
                                            z33 = false;
                                        }
                                        if (rv4Var3.U(intValue & 1, z33)) {
                                            ctd.o(nnbVar3.t, 0, xt4Var182, rv4Var3, zbe.z(pna.f(kq7Var, 1.0f), 12.0f, 8.0f));
                                        } else {
                                            rv4Var3.X();
                                        }
                                        return pvcVar;
                                    default:
                                        xg6Var.getClass();
                                        if ((intValue & 17) != 16) {
                                            z34 = true;
                                        }
                                        if (rv4Var3.U(intValue & 1, z34)) {
                                            ctd.v(nnbVar3.u, 48, xt4Var182, rv4Var3, pna.f(kq7Var, 1.0f));
                                        } else {
                                            rv4Var3.X();
                                        }
                                        return pvcVar;
                                }
                            }
                        }, true, -1455835119), 3);
                        return pvc.a;
                    }
                };
                rv4Var2 = rv4Var;
                rv4Var2.o0(xt4Var13);
                P2 = xt4Var13;
            }
            jce.d(nq7Var, null, null, false, null, null, null, false, null, (xt4) P2, rv4Var2, (i14 >> 3) & 14, 510);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: xm7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(i2 | 1);
                    ctd.s(nnb.this, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, xt4Var6, vt4Var, vt4Var2, xt4Var7, xt4Var8, xt4Var9, xt4Var10, xt4Var11, nu4Var, xt4Var12, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void t(final float f2, final float f3, final float f4, nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        final nq7 nq7Var2;
        boolean z2;
        boolean z3;
        rv4Var.g0(-575732987);
        if (rv4Var.c(f2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i2 | i3;
        if (rv4Var.c(f3)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i10 = i9 | i4;
        if (rv4Var.c(f4)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        if (rv4Var.h(xt4Var3)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i14 = i13 | i8;
        boolean z4 = false;
        if ((599187 & i14) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i14 & 1, z)) {
            if ((57344 & i14) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((458752 & i14) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((i14 & 3670016) == 1048576) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new se0(24, xt4Var, xt4Var2, xt4Var3);
                rv4Var.o0(P);
            }
            nq7Var2 = nq7Var;
            i(nq7Var2, (vt4) P, jce.E(1260797495, new mu4() { // from class: im7
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z7;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zn1) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z7)) {
                        String A = yqe.A((y3b) x2b.K.getValue(), rv4Var2);
                        kq7 kq7Var = kq7.a;
                        nq7 f5 = pna.f(kq7Var, 1.0f);
                        sv1 sv1Var = new sv1(24);
                        xt4 xt4Var4 = xt4Var;
                        boolean f6 = rv4Var2.f(xt4Var4);
                        Object P2 = rv4Var2.P();
                        Object obj4 = ax1.a;
                        if (f6 || P2 == obj4) {
                            P2 = new im(15, xt4Var4);
                            rv4Var2.o0(P2);
                        }
                        ctd.q(f2, A, sv1Var, nae.e, 1.0f, 0.01f, f5, (xt4) P2, rv4Var2, 1797120);
                        String A2 = yqe.A((y3b) x2b.L.getValue(), rv4Var2);
                        nq7 f7 = pna.f(kq7Var, 1.0f);
                        sv1 sv1Var2 = new sv1(25);
                        xt4 xt4Var5 = xt4Var2;
                        boolean f8 = rv4Var2.f(xt4Var5);
                        Object P3 = rv4Var2.P();
                        if (f8 || P3 == obj4) {
                            P3 = new im(16, xt4Var5);
                            rv4Var2.o0(P3);
                        }
                        ctd.q(f3, A2, sv1Var2, 0.5f, 3.0f, 0.05f, f7, (xt4) P3, rv4Var2, 1797120);
                        String A3 = yqe.A((y3b) b3b.f.getValue(), rv4Var2);
                        nq7 f9 = pna.f(kq7Var, 1.0f);
                        sv1 sv1Var3 = new sv1(26);
                        xt4 xt4Var6 = xt4Var3;
                        boolean f10 = rv4Var2.f(xt4Var6);
                        Object P4 = rv4Var2.P();
                        if (f10 || P4 == obj4) {
                            P4 = new im(17, xt4Var6);
                            rv4Var2.o0(P4);
                        }
                        ctd.q(f4, A3, sv1Var3, nae.e, 3.0f, 0.05f, f9, (xt4) P4, rv4Var2, 1797120);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 390);
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(f2, f3, f4, nq7Var2, xt4Var, xt4Var2, xt4Var3, i2) { // from class: jm7
                public final /* synthetic */ xt4 C;
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ nq7 d;
                public final /* synthetic */ xt4 e;
                public final /* synthetic */ xt4 f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(3073);
                    ctd.t(this.a, this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void u(String str, List list, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        rv4 rv4Var2 = rv4Var;
        ba5 ba5Var = lre.g;
        rv4Var2.g0(1161018819);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var2.f(list)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var2.f(nq7Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i11 = i10 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i12 = i11 | i7;
        if ((i12 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i12 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            ar5 c2 = rp5.c((wk3) ok3.U.getValue(), rv4Var2, 0);
            tza tzaVar = j27.a;
            long j2 = ((h27) rv4Var2.j(tzaVar)).a.q;
            kq7 kq7Var = kq7.a;
            nk5.a(c2, null, zbe.y(nmd.v(tte.k(pna.n(kq7Var, 40.0f), uu9.a), zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.a), ba5Var), 8.0f), j2, rv4Var2, 48, 0);
            int i13 = i12 & 14;
            if (i13 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                Iterator it = list.iterator();
                int i14 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (c16.i(((pn1) it.next()).a, str)) {
                            break;
                        }
                        i14++;
                    } else {
                        i14 = -1;
                        break;
                    }
                }
                P = Integer.valueOf(i14);
                rv4Var2.o0(P);
            }
            int intValue = ((Number) P).intValue();
            nq7 e2 = rs8.e(1.0f, zbe.A(kq7Var, 12.0f, nae.e, 2), true);
            hz hzVar = new hz(8.0f, true, new vs(2));
            if ((i12 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (i13 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z7 = z4 | z3;
            if ((i12 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = z7 | z5;
            Object P2 = rv4Var2.P();
            if (z8 || P2 == lh9Var) {
                P2 = new k34(2, xt4Var, str, list);
                rv4Var2.o0(P2);
            }
            ej6.a(e2, intValue, null, null, hzVar, null, null, false, (xt4) P2, rv4Var, 196608, 476);
            rv4Var2 = rv4Var;
            ar5 c3 = rp5.c((wk3) jk3.q.getValue(), rv4Var2, 0);
            tza tzaVar2 = j27.a;
            long j3 = ((h27) rv4Var2.j(tzaVar2)).a.q;
            nq7 v = nmd.v(tte.k(pna.n(kq7Var, 40.0f), uu9.a), zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar2)).a.a), ba5Var);
            if ((i12 & 57344) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object P3 = rv4Var2.P();
            if (z6 || P3 == lh9Var) {
                P3 = new hi7(25, vt4Var);
                rv4Var2.o0(P3);
            }
            nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) P3, v, null, false), 8.0f), j3, rv4Var2, 48, 0);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new wp0(str, list, nq7Var, xt4Var, vt4Var, i2);
        }
    }

    public static final void v(int i2, int i3, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i4;
        int i5;
        boolean z;
        nq7 nq7Var2;
        rv4Var.g0(187451454);
        if (rv4Var.d(i2)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i6 = i4 | i3;
        if (rv4Var.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i7 = i6 | i5;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            nq7Var2 = nq7Var;
            nq7 y = zbe.y(nq7Var2, 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            e(yqe.A((y3b) z1b.o0.getValue(), rv4Var), tl1.B(yqe.A((y3b) v1b.j0.getValue(), rv4Var), yqe.A((y3b) b3b.a.getValue(), rv4Var), yqe.A((y3b) x2b.L0.getValue(), rv4Var)), i2, false, null, xt4Var, rv4Var, ((i7 << 6) & 896) | ((i7 << 9) & 458752));
            hl5.w(kq7.a, 12.0f, rv4Var, true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p61(i2, nq7Var2, xt4Var, i3, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r15v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v9 */
    public static final void w(final float f2, final float f3, final float f4, final float f5, final nq7 nq7Var, final xt4 xt4Var, final vt4 vt4Var, rv4 rv4Var, final int i2) {
        float f6;
        int i3;
        float f7;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i4;
        lh9 lh9Var;
        int i5;
        ?? r15;
        tza tzaVar;
        tm7 tm7Var;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        tza tzaVar2;
        int i6;
        String str;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1811668835);
        if ((i2 & 6) == 0) {
            f6 = f2;
            if (rv4Var2.c(f6)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i2;
        } else {
            f6 = f2;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.c(f3)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.c(f4)) {
                i11 = 256;
            } else {
                i11 = Token.CASE;
            }
            i3 |= i11;
        }
        if ((i2 & 3072) == 0) {
            f7 = f5;
            if (rv4Var2.c(f7)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        } else {
            f7 = f5;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i8 = 131072;
            } else {
                i8 = Parser.ARGC_LIMIT;
            }
            i3 |= i8;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((i3 & 599187) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            int i14 = i3 >> 12;
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int i15 = i3;
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            we6 we6Var = new we6(1.0f, true);
            kpa kpaVar = kpa.a;
            tza tzaVar3 = j27.a;
            int i16 = i15 & 14;
            dae.d(f6, xt4Var, we6Var, false, vt4Var, kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar3)).a.a), rv4Var, 1015), null, 0, null, null, new jk1(f3, f4), rv4Var, (i14 & Token.ASSIGN_MOD) | i16 | (57344 & (i15 >> 6)), 0, 968);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            nq7 n = pna.n(kq7Var, 24.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            int i17 = i15 & 458752;
            if (i17 == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i16 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z12 = z2 | z3;
            int i18 = i15 & 7168;
            if (i18 == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z13 = z12 | z4;
            if ((i15 & Token.ASSIGN_MOD) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z14 = z13 | z5;
            int i19 = 3670016 & i15;
            if (i19 == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z15 = z14 | z6;
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (!z15 && P != lh9Var2) {
                i4 = i16;
                i5 = i15;
                lh9Var = lh9Var2;
                tm7Var = P;
                r15 = 0;
                tzaVar = tzaVar3;
            } else {
                i4 = i16;
                lh9Var = lh9Var2;
                i5 = i15;
                r15 = 0;
                tzaVar = tzaVar3;
                tm7 tm7Var2 = new tm7(xt4Var, f2, f7, f3, vt4Var, 0);
                rv4Var2.o0(tm7Var2);
                tm7Var = tm7Var2;
            }
            tza tzaVar4 = tzaVar;
            lh9 lh9Var3 = lh9Var;
            nk5.a(rp5.c((wk3) ok3.f0.getValue(), rv4Var2, r15), null, lbe.f(15, (vt4) tm7Var, k, null, r15), ((h27) rv4Var2.j(tzaVar)).a.q, rv4Var2, 48, 0);
            xbe.i(rv4Var2, pna.s(kq7Var, 8.0f));
            nq7 k2 = tte.k(pna.n(kq7Var, 24.0f), su9Var);
            if (i17 == 131072) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i4 == 4) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z16 = z7 | z8;
            if (i18 == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z17 = z16 | z9;
            if ((i5 & 896) == 256) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z18 = z17 | z10;
            if (i19 == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z19 = z18 | z11;
            Object P2 = rv4Var2.P();
            if (!z19 && P2 != lh9Var3) {
                tzaVar2 = tzaVar4;
                i6 = 15;
                str = null;
            } else {
                tzaVar2 = tzaVar4;
                i6 = 15;
                str = null;
                tm7 tm7Var3 = new tm7(xt4Var, f2, f5, f4, vt4Var, 1);
                rv4Var2.o0(tm7Var3);
                P2 = tm7Var3;
            }
            nk5.a(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), null, lbe.f(i6, (vt4) P2, k2, str, false), ((h27) rv4Var2.j(tzaVar2)).a.q, rv4Var2, 48, 0);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: vm7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ctd.w(f2, f3, f4, f5, nq7Var, xt4Var, vt4Var, (rv4) obj, xoe.p(i2 | 1));
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.l7c r4, defpackage.ex0 r5, java.lang.Throwable r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.gk4
            if (r0 == 0) goto L13
            r0 = r7
            gk4 r0 = (defpackage.gk4) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            gk4 r0 = new gk4
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            java.lang.Throwable r6 = r0.a
            defpackage.hre.r(r7)     // Catch: java.lang.Throwable -> L27
            goto L40
        L27:
            r4 = move-exception
            goto L43
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L30:
            defpackage.hre.r(r7)
            r0.a = r6     // Catch: java.lang.Throwable -> L27
            r0.c = r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r5.c(r4, r6, r0)     // Catch: java.lang.Throwable -> L27
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L40
            return r5
        L40:
            pvc r4 = defpackage.pvc.a
            return r4
        L43:
            if (r6 == 0) goto L4a
            if (r6 == r4) goto L4a
            defpackage.pye.e(r4, r6)
        L4a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ctd.x(l7c, ex0, java.lang.Throwable, n42):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [vl9, java.lang.Object] */
    public static final Object y(xt4 xt4Var, n42 n42Var) {
        f61 f61Var = new f61(1, w92.t(n42Var));
        f61Var.u();
        ?? obj = new Object();
        f61Var.w(new h66(obj, 0));
        xt4Var.invoke(new i66(obj, f61Var, 0));
        return f61Var.s();
    }

    public static y39 z(bp9 bp9Var, List list, m82 m82Var, vt4 vt4Var) {
        list.getClass();
        ie4 ie4Var = new ie4(p40.F, new dw3(26), new on7(22, vt4Var));
        v82 v82Var = bp9Var;
        if (bp9Var == null) {
            v82Var = new u28(0);
        }
        return new y39(new y39(new gh2(ie4Var, tl1.A(new cv0(list, null, 25)), v82Var, m82Var)));
    }
}
