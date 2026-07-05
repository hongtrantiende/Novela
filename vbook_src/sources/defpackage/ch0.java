package defpackage;

import android.webkit.MimeTypeMap;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ch0  reason: default package */
/* loaded from: classes.dex */
public abstract class ch0 {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, Token.ASSIGN_MOD, Token.CASE, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    public static final int[] f = {69, 87, Token.ASSIGN_LOGICAL_AND, Token.DOT, Token.VOID, Token.DEBUGGER, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};
    public static final tu1 g = new tu1(new mv1(3), false, -863625956);
    public static final qm1 h = qm1.E;
    public static final float i = 38.0f;
    public static final qm1 j = qm1.c;
    public static final qm1 k = qm1.F;
    public static final float l = 48.0f;
    public static final afa m = afa.c;
    public static final float n = 48.0f;

    public static final void a(final boolean z, final float f2, final nq7 nq7Var, rv4 rv4Var, final int i2) {
        int i3;
        boolean z2;
        wk3 wk3Var;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(601517055);
        if ((i2 & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.c(f2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        if ((i3 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            if (z) {
                wk3Var = (wk3) ok3.x.getValue();
            } else {
                wk3Var = (wk3) ok3.w.getValue();
            }
            nk5.a(rp5.c(wk3Var, rv4Var, 0), null, pna.n(nq7Var, 20.0f), zl1.b(dce.m(f2, nae.e, 1.0f), zl1.e), rv4Var, 48, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: y8d
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(i2 | 1);
                    ch0.a(z, f2, nq7Var, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(List list, boolean z, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        nk0 nk0Var;
        rv4Var.g0(579861798);
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i4 = i3 | i2;
        if ((i4 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            kq7 kq7Var = kq7.a;
            nq7 p = pna.p(kq7Var, 56.0f, 32.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, p);
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
            if (z) {
                nk0Var = kh5.f;
            } else {
                nk0Var = kh5.d;
            }
            pu0 pu0Var = pu0.a;
            int i5 = (i4 >> 3) & 14;
            a(z, 1.0f, pu0Var.a(kq7Var, nk0Var), rv4Var, i5 | 48);
            rv4Var.e0(-610009545);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                long longValue = ((Number) it.next()).longValue();
                rv4Var.b0(-1563846516, Long.valueOf(longValue));
                boolean e2 = rv4Var.e(longValue);
                Object P = rv4Var.P();
                if (e2 || P == ax1.a) {
                    P = new rl7(xt4Var, longValue, 3);
                    rv4Var.o0(P);
                }
                h(i5, (vt4) P, rv4Var, pu0Var.a(kq7Var, kh5.e), z);
                rv4Var.q(false);
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qd1(i2, 7, list, xt4Var, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:247:0x04a7, code lost:
        if (r5 > (r9 + 5000)) goto L366;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:283:0x05c5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0614 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x063d  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x0658 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06fa  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x070f  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x071e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:328:0x075a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x07a1  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x07ad A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:347:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x07cb  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x07d3  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x07e7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:365:0x0808  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x080b  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0829  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x084b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:383:0x0880  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x0894 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:390:0x090a  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0946  */
    /* JADX WARN: Type inference failed for: r2v66, types: [nq7] */
    /* JADX WARN: Type inference failed for: r3v41, types: [nq7] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final defpackage.jub r66, final defpackage.xt4 r67, final defpackage.nq7 r68, final defpackage.oyb r69, final defpackage.ted r70, final defpackage.xt4 r71, final defpackage.yu7 r72, final defpackage.esa r73, final boolean r74, final int r75, final int r76, final defpackage.as5 r77, final defpackage.q86 r78, final boolean r79, final boolean r80, final defpackage.mu4 r81, defpackage.rv4 r82, final int r83, final int r84) {
        /*
            Method dump skipped, instructions count: 2505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch0.c(jub, xt4, nq7, oyb, ted, xt4, yu7, esa, boolean, int, int, as5, q86, boolean, boolean, mu4, rv4, int, int):void");
    }

    public static final void d(nq7 nq7Var, gtb gtbVar, tu1 tu1Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        rv4Var.g0(2036174316);
        if (rv4Var.f(nq7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var.h(gtbVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, true);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
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
            jce.F(qw1.d, rv4Var, p);
            q0f.b(gtbVar, tu1Var, rv4Var, (i6 >> 3) & Token.ELSE);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ax(nq7Var, gtbVar, tu1Var, i2, 13);
        }
    }

    public static final void e(dx4 dx4Var, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        dx4 dx4Var2;
        nq7 nq7Var2;
        boolean z2;
        ora oraVar;
        lu4 bybVar;
        lh9 lh9Var;
        Integer num;
        int i5;
        boolean z3;
        boolean z4;
        hm8 hm8Var = dx4Var.h;
        rv4Var.g0(1327405584);
        if (rv4Var.f(dx4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (rv4Var.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if ((i7 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = new ora();
                rv4Var.o0(P);
            }
            ora oraVar2 = (ora) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var2) {
                P2 = new fm8(0L);
                rv4Var.o0(P2);
            }
            fm8 fm8Var = (fm8) P2;
            Object P3 = rv4Var.P();
            if (P3 == lh9Var2) {
                P3 = tc4.a(1.0f, 0.01f);
                rv4Var.o0(P3);
            }
            lq lqVar = (lq) P3;
            Integer valueOf = Integer.valueOf(dx4Var.o.h());
            int i8 = i7 & 14;
            if (i8 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean h2 = z2 | rv4Var.h(lqVar);
            Object P4 = rv4Var.P();
            if (h2 || P4 == lh9Var2) {
                oraVar = oraVar2;
                lh9Var = lh9Var2;
                num = valueOf;
                i5 = i8;
                bybVar = new byb(dx4Var, oraVar, fm8Var, lqVar, null, 17);
                rv4Var.o0(bybVar);
            } else {
                lh9Var = lh9Var2;
                i5 = i8;
                oraVar = oraVar2;
                bybVar = P4;
                num = valueOf;
            }
            yte.g(bybVar, rv4Var, num);
            Boolean bool = (Boolean) hm8Var.getValue();
            bool.booleanValue();
            if (i5 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P5 = rv4Var.P();
            if (z3 || P5 == lh9Var) {
                P5 = new b9d(dx4Var, oraVar, null, 0);
                rv4Var.o0(P5);
            }
            yte.g((lu4) P5, rv4Var, bool);
            if (((cf3) dx4Var.f.getValue()) == cf3.c) {
                z4 = true;
            } else {
                z4 = false;
            }
            dx4Var2 = dx4Var;
            nq7Var2 = nq7Var;
            rte.c(((Boolean) hm8Var.getValue()).booleanValue(), nq7Var2, zt3.g(tte.x(90, 0, null, 6), 2), zt3.i(tte.x(140, 0, null, 6), 2), null, jce.E(-431937992, new xsa(7, oraVar, dx4Var, lqVar, z4), rv4Var), rv4Var, (i7 & Token.ASSIGN_MOD) | 200064, 16);
        } else {
            dx4Var2 = dx4Var;
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z8d(dx4Var2, nq7Var2, i2, 1);
        }
    }

    public static final void f(dx4 dx4Var, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        nq7 nq7Var2;
        lu4 bybVar;
        lq lqVar;
        lq lqVar2;
        rv4Var.g0(-215455679);
        if (rv4Var.f(dx4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2 | 48;
        boolean z2 = true;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = tc4.a(nae.e, 0.01f);
                rv4Var.o0(P);
            }
            lq lqVar3 = (lq) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = tc4.a(nae.e, 0.01f);
                rv4Var.o0(P2);
            }
            lq lqVar4 = (lq) P2;
            Integer valueOf = Integer.valueOf(dx4Var.l.h());
            if ((i4 & 14) != 4) {
                z2 = false;
            }
            boolean h2 = rv4Var.h(lqVar3) | z2 | rv4Var.h(lqVar4);
            Object P3 = rv4Var.P();
            if (!h2 && P3 != lh9Var) {
                bybVar = P3;
                lqVar = lqVar3;
                lqVar2 = lqVar4;
            } else {
                lqVar = lqVar3;
                lqVar2 = lqVar4;
                bybVar = new byb(dx4Var, lqVar, lqVar2, (m42) null, 18);
                rv4Var.o0(bybVar);
            }
            yte.g(bybVar, rv4Var, valueOf);
            boolean booleanValue = ((Boolean) dx4Var.k.getValue()).booleanValue();
            eu3 g2 = zt3.g(tte.x(40, 0, null, 6), 2);
            lz3 i5 = zt3.i(tte.x(120, 0, null, 6), 2);
            tu1 E = jce.E(-531062679, new ld1(3, dx4Var, lqVar, lqVar2), rv4Var);
            nq7Var2 = kq7.a;
            rte.c(booleanValue, nq7Var2, g2, i5, null, E, rv4Var, 200112, 16);
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z8d(dx4Var, nq7Var2, i2, 0);
        }
    }

    public static final void g(dx4 dx4Var, nq7 nq7Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        rv4Var.g0(102245497);
        if (rv4Var.f(dx4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var.f(nq7Var)) {
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
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rte.c(((Boolean) dx4Var.c.getValue()).booleanValue(), nq7Var2, zt3.g(null, 3), zt3.i(null, 3), null, jce.E(-918578527, new pl7(dx4Var, 20), rv4Var), rv4Var2, (i6 & Token.ASSIGN_MOD) | 200064, 16);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new z8d(dx4Var, nq7Var2, i2, 2);
        }
    }

    public static final void h(int i2, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i3;
        boolean z2;
        float f2;
        float floatValue;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(874456746);
        if ((i2 & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        boolean z3 = false;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = tc4.a(nae.e, 0.01f);
                rv4Var.o0(P);
            }
            lq lqVar = (lq) P;
            boolean h2 = rv4Var.h(lqVar);
            if ((i3 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            }
            boolean z4 = h2 | z3;
            Object P2 = rv4Var.P();
            if (z4 || P2 == obj) {
                P2 = new q4c(lqVar, vt4Var, null, 21);
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, pvc.a);
            if (z) {
                f2 = 24.0f;
            } else {
                f2 = -24.0f;
            }
            float floatValue2 = ((Number) lqVar.e()).floatValue() * f2;
            if (((Number) lqVar.e()).floatValue() < 0.45f) {
                floatValue = ((Number) lqVar.e()).floatValue() / 0.45f;
            } else {
                floatValue = 1.0f - ((((Number) lqVar.e()).floatValue() - 0.45f) / 0.55f);
            }
            float m2 = dce.m(floatValue, nae.e, 1.0f);
            boolean c2 = rv4Var.c(floatValue2) | rv4Var.c(floatValue);
            Object P3 = rv4Var.P();
            if (c2 || P3 == obj) {
                P3 = new id(floatValue2, floatValue, 2);
                rv4Var.o0(P3);
            }
            a(z, m2, axe.k(nq7Var, (xt4) P3), rv4Var, i3 & 14);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new am(z, vt4Var, nq7Var, i2);
        }
    }

    public static final void i(gtb gtbVar, boolean z, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        gvb d2;
        boolean z3;
        rv4Var.g0(626339208);
        if (rv4Var.h(gtbVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i3 | i2;
        if (rv4Var.g(z)) {
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
            if (z) {
                rv4Var.e0(1530097388);
                ol6 ol6Var = gtbVar.d;
                fvb fvbVar = null;
                if (ol6Var != null && (d2 = ol6Var.d()) != null) {
                    fvb fvbVar2 = d2.a;
                    ol6 ol6Var2 = gtbVar.d;
                    if (ol6Var2 != null) {
                        z3 = ol6Var2.p;
                    } else {
                        z3 = true;
                    }
                    if (!z3) {
                        fvbVar = fvbVar2;
                    }
                }
                if (fvbVar == null) {
                    rv4Var.e0(1530097387);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(1530097388);
                    if (!fxb.d(gtbVar.n().b)) {
                        rv4Var.e0(2109807302);
                        int w = gtbVar.b.w((int) (gtbVar.n().b >> 32));
                        int w2 = gtbVar.b.w((int) (gtbVar.n().b & 4294967295L));
                        oq9 a2 = fvbVar.a(w);
                        oq9 a3 = fvbVar.a(Math.max(w2 - 1, 0));
                        ol6 ol6Var3 = gtbVar.d;
                        if (ol6Var3 != null && ((Boolean) ol6Var3.m.getValue()).booleanValue()) {
                            rv4Var.e0(2110225306);
                            nxe.m(true, a2, gtbVar, rv4Var, ((i6 << 6) & 896) | 6);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(2110490542);
                            rv4Var.q(false);
                        }
                        ol6 ol6Var4 = gtbVar.d;
                        if (ol6Var4 != null && ((Boolean) ol6Var4.n.getValue()).booleanValue()) {
                            rv4Var.e0(2110574459);
                            nxe.m(false, a3, gtbVar, rv4Var, ((i6 << 6) & 896) | 6);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(2110838734);
                            rv4Var.q(false);
                        }
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(2110860558);
                        rv4Var.q(false);
                    }
                    ol6 ol6Var5 = gtbVar.d;
                    if (ol6Var5 != null) {
                        hm8 hm8Var = ol6Var5.l;
                        if (!c16.i(gtbVar.u.a.b, gtbVar.n().a.b)) {
                            hm8Var.setValue(Boolean.FALSE);
                        }
                        if (ol6Var5.b()) {
                            if (((Boolean) hm8Var.getValue()).booleanValue()) {
                                gtbVar.r();
                            } else {
                                gtbVar.o();
                            }
                        }
                    }
                    rv4Var.q(false);
                }
                rv4Var.q(false);
            } else {
                rv4Var.e0(1989076778);
                rv4Var.q(false);
                gtbVar.o();
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new g72(gtbVar, z, i2);
        }
    }

    public static final void j(gtb gtbVar, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        ps m2;
        gvb gvbVar;
        rv4Var.g0(-1436003720);
        if (rv4Var.h(gtbVar)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i3 | i2;
        if ((i4 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            ol6 ol6Var = gtbVar.d;
            if (ol6Var != null && ((Boolean) ol6Var.o.getValue()).booleanValue() && (m2 = gtbVar.m()) != null && m2.b.length() > 0) {
                rv4Var.e0(-2112351432);
                boolean f2 = rv4Var.f(gtbVar);
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (f2 || P == lh9Var) {
                    P = new ctb(gtbVar);
                    rv4Var.o0(P);
                }
                npb npbVar = (npb) P;
                r13 r13Var = (r13) rv4Var.j(dy1.h);
                j88 j88Var = gtbVar.b;
                long j2 = gtbVar.n().b;
                int i5 = fxb.c;
                int w = j88Var.w((int) (j2 >> 32));
                ol6 ol6Var2 = gtbVar.d;
                if (ol6Var2 != null) {
                    gvbVar = ol6Var2.d();
                } else {
                    gvbVar = null;
                }
                gvbVar.getClass();
                fvb fvbVar = gvbVar.a;
                rk9 c2 = fvbVar.c(dce.n(w, 0, fvbVar.a.a.b.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits((r13Var.L0(2.0f) / 2.0f) + c2.a) << 32) | (4294967295L & Float.floatToRawIntBits(c2.d));
                boolean e2 = rv4Var.e(floatToRawIntBits);
                Object P2 = rv4Var.P();
                if (e2 || P2 == lh9Var) {
                    P2 = new o72(floatToRawIntBits);
                    rv4Var.o0(P2);
                }
                l88 l88Var = (l88) P2;
                boolean h2 = rv4Var.h(npbVar) | rv4Var.h(gtbVar);
                Object P3 = rv4Var.P();
                if (h2 || P3 == lh9Var) {
                    P3 = new w42(1, npbVar, gtbVar);
                    rv4Var.o0(P3);
                }
                nq7 b2 = dab.b(kq7.a, npbVar, (PointerInputEventHandler) P3);
                boolean e3 = rv4Var.e(floatToRawIntBits);
                Object P4 = rv4Var.P();
                if (e3 || P4 == lh9Var) {
                    P4 = new th(floatToRawIntBits, 7);
                    rv4Var.o0(P4);
                }
                vh.a(l88Var, y7a.c(b2, false, (xt4) P4), 0L, rv4Var, 0, 4);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-2111042550);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sj(gtbVar, i2, 5);
        }
    }

    public static final void k(boolean z, amc amcVar, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        amcVar.getClass();
        vt4Var.getClass();
        rv4Var.g0(-1069997233);
        if ((i2 & 6) == 0) {
            if (rv4Var.g(z)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(amcVar)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new txb(5);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.s((xt4) P));
            lz3 i8 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new txb(6);
                rv4Var.o0(P2);
            }
            rte.c(z, nq7Var, a2, i8.a(zt3.w((xt4) P2)), null, jce.E(277089143, new em7(14, amcVar, vt4Var), rv4Var), rv4Var, (i3 & 14) | 200064 | ((i3 >> 3) & Token.ASSIGN_MOD), 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ta(z, amcVar, nq7Var, vt4Var, i2);
        }
    }

    public static final void l(final dx4 dx4Var, final int i2, final int i3, final boolean z, final boolean z2, final vt4 vt4Var, final xt4 xt4Var, final xt4 xt4Var2, final xt4 xt4Var3, final xt4 xt4Var4, final vt4 vt4Var2, final vt4 vt4Var3, rv4 rv4Var, final int i4, final int i5) {
        int i6;
        int i7;
        boolean z3;
        int i8;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        int i9;
        aw7 aw7Var;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        vt4Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        xt4Var4.getClass();
        rv4Var.g0(2078762371);
        if ((i4 & 6) == 0) {
            if (rv4Var.f(dx4Var)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i6 = i21 | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            if (rv4Var.d(i2)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i6 |= i20;
        }
        if ((i4 & 384) == 0) {
            i7 = i3;
            if (rv4Var.d(i7)) {
                i19 = 256;
            } else {
                i19 = Token.CASE;
            }
            i6 |= i19;
        } else {
            i7 = i3;
        }
        if ((i4 & 3072) == 0) {
            if (rv4Var.g(z)) {
                i18 = 2048;
            } else {
                i18 = 1024;
            }
            i6 |= i18;
        }
        if ((i4 & 24576) == 0) {
            z3 = z2;
            if (rv4Var.g(z3)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i6 |= i17;
        } else {
            z3 = z2;
        }
        if ((i4 & 196608) == 0) {
            if (rv4Var.h(vt4Var)) {
                i16 = 131072;
            } else {
                i16 = Parser.ARGC_LIMIT;
            }
            i6 |= i16;
        }
        if ((i4 & 1572864) == 0) {
            if (rv4Var.h(xt4Var)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i6 |= i15;
        }
        if ((i4 & 12582912) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i6 |= i14;
        }
        if ((i4 & 100663296) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i6 |= i13;
        }
        if ((i4 & 805306368) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i12 = 536870912;
            } else {
                i12 = 268435456;
            }
            i6 |= i12;
        }
        if ((i5 & 6) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i8 = i5 | i11;
        } else {
            i8 = i5;
        }
        if ((i5 & 48) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i8 |= i10;
        }
        int i22 = i8;
        boolean z18 = true;
        if ((i6 & 306783379) == 306783378 && (i22 & 19) == 18) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (rv4Var.U(i6 & 1, z4)) {
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.z(0);
                rv4Var.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                P2 = yae.z(0);
                rv4Var.o0(P2);
            }
            aw7 aw7Var3 = (aw7) P2;
            Object P3 = rv4Var.P();
            if (P3 == obj) {
                P3 = yte.s(rv4Var);
                rv4Var.o0(P3);
            }
            m82 m82Var = (m82) P3;
            Object P4 = rv4Var.P();
            if (P4 == obj) {
                P4 = yae.z(null);
                rv4Var.o0(P4);
            }
            aw7 aw7Var4 = (aw7) P4;
            ze4 ze4Var = pna.c;
            Object P5 = rv4Var.P();
            if (P5 == obj) {
                P5 = new ghc(aw7Var2, aw7Var3, 5);
                rv4Var.o0(P5);
            }
            nq7 l2 = pbe.l(ze4Var, (xt4) P5);
            Boolean valueOf = Boolean.valueOf(z);
            Boolean valueOf2 = Boolean.valueOf(z3);
            int i23 = i6 & 7168;
            if (i23 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((i6 & 57344) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z19 = z5 | z6;
            if ((i6 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z20 = z19 | z7;
            if ((i6 & Token.ASSIGN_MOD) == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z21 = z20 | z8;
            int i24 = i6 & 14;
            if (i24 == 4) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z22 = z21 | z9;
            int i25 = i6;
            if ((i6 & 29360128) == 8388608) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z23 = z22 | z10;
            if ((i25 & 3670016) == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h2 = z23 | z11 | rv4Var.h(m82Var);
            if ((i25 & 458752) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z24 = h2 | z12;
            Object P6 = rv4Var.P();
            if (!z24 && P6 != obj) {
                aw7Var = aw7Var2;
                i9 = 2048;
            } else {
                i9 = 2048;
                Object d9dVar = new d9d(z, z3, i7, i2, dx4Var, xt4Var2, xt4Var, m82Var, aw7Var2, aw7Var3, aw7Var4, vt4Var);
                aw7Var = aw7Var2;
                rv4Var.o0(d9dVar);
                P6 = d9dVar;
            }
            nq7 c2 = dab.c(l2, valueOf, valueOf2, (PointerInputEventHandler) P6);
            Boolean valueOf3 = Boolean.valueOf(z);
            if (i23 == i9) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i24 == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z25 = z13 | z14;
            if ((i22 & 14) == 4) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z26 = z25 | z15;
            if ((i22 & Token.ASSIGN_MOD) == 32) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z27 = z26 | z16;
            if ((i25 & 234881024) == 67108864) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z28 = z27 | z17;
            if ((i25 & 1879048192) != 536870912) {
                z18 = false;
            }
            boolean z29 = z28 | z18;
            Object P7 = rv4Var.P();
            if (z29 || P7 == obj) {
                Object f9dVar = new f9d(z, dx4Var, vt4Var2, vt4Var3, aw7Var, xt4Var3, xt4Var4, aw7Var3);
                rv4Var.o0(f9dVar);
                P7 = f9dVar;
            }
            fu0.a(dab.b(c2, valueOf3, (PointerInputEventHandler) P7), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: a9d
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int p = xoe.p(i4 | 1);
                    int p2 = xoe.p(i5);
                    ch0.l(dx4.this, i2, i3, z, z2, vt4Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, vt4Var2, vt4Var3, (rv4) obj2, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void m(ol6 ol6Var) {
        wub wubVar = ol6Var.e;
        if (wubVar != null) {
            ol6Var.v.invoke(jub.a((jub) ol6Var.d.a, null, 0L, 3));
            tub tubVar = wubVar.a;
            AtomicReference atomicReference = tubVar.b;
            while (true) {
                if (atomicReference.compareAndSet(wubVar, null)) {
                    tubVar.a.c();
                    break;
                } else if (atomicReference.get() != wubVar) {
                    break;
                }
            }
        }
        ol6Var.e = null;
    }

    public static final xl2 n(zab zabVar, String str) {
        zabVar.getClass();
        str.getClass();
        return new xl2(zabVar.a, str, zabVar.b, zabVar.c, zabVar.d, zabVar.e, zabVar.f, zabVar.g, zabVar.h, zabVar.i, zabVar.j);
    }

    public static int o(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 >= 0 && i2 < 3 && i3 >= 0 && i4 < 19) {
            int i5 = b[i2];
            if (i5 == 44100) {
                return ((i3 % 2) + f[i4]) * 2;
            }
            int i6 = e[i4];
            if (i5 == 32000) {
                return i6 * 6;
            }
            return i6 * 4;
        }
        return -1;
    }

    public static String p(ArrayList arrayList) {
        int size = arrayList.size();
        boolean z = false;
        String str = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            String str2 = ((gjc) obj).a.g.o;
            if (lc7.o(str2)) {
                return "video/mp4";
            }
            if (lc7.k(str2)) {
                z = true;
            } else if (lc7.m(str2)) {
                if (Objects.equals(str2, "image/heic")) {
                    str = "image/heif";
                } else if (Objects.equals(str2, "image/avif")) {
                    str = "image/avif";
                }
            }
        }
        if (z) {
            return "audio/mp4";
        }
        if (str != null) {
            return str;
        }
        return "application/mp4";
    }

    public static String[] q(Set set) {
        String[] strArr;
        List A;
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        if (set != null) {
            Set<String> set2 = set;
            ArrayList arrayList = new ArrayList(tl1.s(set2, 10));
            for (String str : set2) {
                if (c16.i(str, "csv")) {
                    A = tl1.B("text/csv", "application/csv", "application/x-csv", "text/comma-separated-values", "text/x-comma-separated-values", "text/x-csv");
                } else {
                    A = tl1.A(singleton.getMimeTypeFromExtension(str));
                }
                arrayList.add(A);
            }
            ArrayList v = tl1.v(arrayList);
            ArrayList arrayList2 = new ArrayList();
            int size = v.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = v.get(i2);
                i2++;
                String str2 = (String) obj;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = null;
            }
            if (arrayList2 != null && (strArr = (String[]) arrayList2.toArray(new String[0])) != null) {
                return strArr;
            }
        }
        return new String[]{"*/*"};
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
        if (r15 < 0.5f) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x005b, code lost:
        if (r15 < 0.5f) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.lea r(defpackage.lea r13, defpackage.lea r14, float r15) {
        /*
            lea r0 = new lea
            float r1 = r13.a
            float r2 = r14.a
            float r1 = defpackage.b23.o(r1, r2, r15)
            float r2 = r13.b
            float r3 = r14.b
            float r2 = defpackage.b23.o(r2, r3, r15)
            long r3 = r13.c
            long r5 = r14.c
            float r7 = defpackage.tg3.a(r3)
            float r8 = defpackage.tg3.a(r5)
            float r7 = defpackage.b23.o(r7, r8, r15)
            float r3 = defpackage.tg3.b(r3)
            float r4 = defpackage.tg3.b(r5)
            float r3 = defpackage.b23.o(r3, r4, r15)
            int r4 = java.lang.Float.floatToRawIntBits(r7)
            long r4 = (long) r4
            int r3 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r3
            r3 = 32
            long r3 = r4 << r3
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r6 & r8
            long r3 = r3 | r5
            long r5 = r13.e
            long r7 = r14.e
            long r5 = defpackage.sve.q(r15, r5, r7)
            hy0 r7 = r13.f
            hy0 r8 = r14.f
            boolean r9 = defpackage.c16.i(r7, r8)
            r10 = 0
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r9 == 0) goto L5e
            int r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r9 >= 0) goto L82
            goto L85
        L5e:
            boolean r9 = r7 instanceof defpackage.m06
            if (r9 == 0) goto L6a
            r9 = r7
            m06 r9 = (defpackage.m06) r9
            java.lang.Object r9 = r9.b(r8, r15)
            goto L6b
        L6a:
            r9 = r10
        L6b:
            if (r9 != 0) goto L7b
            boolean r12 = r8 instanceof defpackage.m06
            if (r12 == 0) goto L7b
            r9 = r8
            m06 r9 = (defpackage.m06) r9
            r12 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 - r15
            java.lang.Object r9 = r9.b(r7, r12)
        L7b:
            if (r9 != 0) goto L84
            int r9 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r9 >= 0) goto L82
            goto L85
        L82:
            r7 = r8
            goto L85
        L84:
            r7 = r9
        L85:
            boolean r8 = r7 instanceof defpackage.hy0
            if (r8 == 0) goto L8c
            r10 = r7
            hy0 r10 = (defpackage.hy0) r10
        L8c:
            r7 = r10
            float r8 = r13.g
            float r9 = r14.g
            float r8 = defpackage.b23.o(r8, r9, r15)
            int r15 = (r15 > r11 ? 1 : (r15 == r11 ? 0 : -1))
            if (r15 >= 0) goto L9a
            goto L9b
        L9a:
            r13 = r14
        L9b:
            int r9 = r13.d
            r0.<init>(r1, r2, r3, r5, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ch0.r(lea, lea, float):lea");
    }

    public static final void s(ol6 ol6Var, jub jubVar, j88 j88Var) {
        xt4 xt4Var;
        zqa f2 = pae.f();
        if (f2 != null) {
            xt4Var = f2.e();
        } else {
            xt4Var = null;
        }
        xt4 xt4Var2 = xt4Var;
        zqa h2 = pae.h(f2);
        try {
            gvb d2 = ol6Var.d();
            if (d2 == null) {
                return;
            }
            wub wubVar = ol6Var.e;
            if (wubVar == null) {
                return;
            }
            sc6 c2 = ol6Var.c();
            if (c2 == null) {
                return;
            }
            xwe.j(jubVar, ol6Var.a, d2.a, c2, wubVar, ol6Var.b(), j88Var);
        } finally {
            pae.n(f2, h2, xt4Var2);
        }
    }

    public static final double t(double d2, double d3) {
        return Math.copySign(Math.pow(Math.abs(d2), d3), d2);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [zl9, java.lang.Object] */
    public static final void u(tub tubVar, ol6 ol6Var, jub jubVar, as5 as5Var, j88 j88Var) {
        s6f s6fVar = ol6Var.d;
        h72 h72Var = ol6Var.v;
        h72 h72Var2 = ol6Var.w;
        ?? obj = new Object();
        r6a r6aVar = new r6a(10, s6fVar, h72Var, obj);
        fy8 fy8Var = tubVar.a;
        fy8Var.f(jubVar, as5Var, r6aVar, h72Var2);
        wub wubVar = new wub(tubVar, fy8Var);
        tubVar.b.set(wubVar);
        obj.a = wubVar;
        ol6Var.e = wubVar;
        s(ol6Var, jubVar, j88Var);
    }

    public static boolean v(String str) {
        if (str != null && !str.isEmpty()) {
            return false;
        }
        return true;
    }

    public static void w(String str, k1e k1eVar, a2e a2eVar, l1e l1eVar, bm1 bm1Var) {
        try {
            am8.s(k1eVar);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = k1eVar.zza().getBytes(Charset.defaultCharset());
            httpURLConnection.setFixedLengthStreamingMode(bytes.length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            bm1Var.b0(httpURLConnection);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
            try {
                bufferedOutputStream.write(bytes, 0, bytes.length);
                bufferedOutputStream.close();
                x(httpURLConnection, a2eVar, l1eVar);
            } catch (Throwable th) {
                try {
                    bufferedOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (SocketTimeoutException unused) {
            a2eVar.mo0zza("TIMEOUT");
        } catch (IOException e2) {
            e = e2;
            a2eVar.mo0zza(e.getMessage());
        } catch (NullPointerException e3) {
            e = e3;
            a2eVar.mo0zza(e.getMessage());
        } catch (UnknownHostException unused2) {
            a2eVar.mo0zza("<<Network Error>>");
        } catch (JSONException e4) {
            e = e4;
            a2eVar.mo0zza(e.getMessage());
        }
    }

    public static void x(HttpURLConnection httpURLConnection, a2e a2eVar, l1e l1eVar) {
        boolean z;
        InputStream errorStream;
        try {
            try {
                int responseCode = httpURLConnection.getResponseCode();
                boolean z2 = false;
                if (responseCode >= 200 && responseCode < 300) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    errorStream = httpURLConnection.getInputStream();
                } else {
                    errorStream = httpURLConnection.getErrorStream();
                }
                StringBuilder sb = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(errorStream, StandardCharsets.UTF_8));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb.append(readLine);
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                bufferedReader.close();
                String sb2 = sb.toString();
                if (responseCode >= 200 && responseCode < 300) {
                    z2 = true;
                }
                if (!z2) {
                    a2eVar.mo0zza(eh.E(sb2));
                } else {
                    a2eVar.k(eh.F(sb2, l1eVar));
                }
                httpURLConnection.disconnect();
            } catch (Throwable th3) {
                httpURLConnection.disconnect();
                throw th3;
            }
        } catch (dzd e2) {
            e = e2;
            a2eVar.mo0zza(e.getMessage());
            httpURLConnection.disconnect();
        } catch (SocketTimeoutException unused) {
            a2eVar.mo0zza("TIMEOUT");
            httpURLConnection.disconnect();
        } catch (IOException e3) {
            e = e3;
            a2eVar.mo0zza(e.getMessage());
            httpURLConnection.disconnect();
        }
    }
}
