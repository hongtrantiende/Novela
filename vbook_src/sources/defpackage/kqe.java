package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.text.Spanned;
import com.vbook.android.R;
import java.text.BreakIterator;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kqe  reason: default package */
/* loaded from: classes.dex */
public abstract class kqe {
    public static final tu1 a = new tu1(new bv1(0), false, 636288403);
    public static final tu1 b = new tu1(new bv1(1), false, -1357803046);
    public static final kn4 c = new kn4(21);
    public static final byte[] d = {48, 49, 53, 0};
    public static final byte[] e = {48, 49, 48, 0};
    public static final byte[] f = {48, 48, 57, 0};
    public static final byte[] g = {48, 48, 53, 0};
    public static final byte[] h = {48, 48, 49, 0};
    public static final byte[] i = {48, 48, 49, 0};
    public static final byte[] j = {48, 48, 50, 0};

    public static void A(sgf sgfVar) {
        if (!B(sgfVar) && ((ref) sgfVar).a != null) {
            Trace.endSection();
            A(((ref) sgfVar).a);
            return;
        }
        Trace.endSection();
        Trace.endSection();
    }

    public static boolean B(sgf sgfVar) {
        if (((ref) sgfVar).e != Thread.currentThread()) {
            return true;
        }
        return false;
    }

    public static void C(sgf sgfVar) {
        String str = ((ref) sgfVar).d;
        AtomicReference atomicReference = kff.a;
        if (str.length() > 127) {
            str = str.substring(0, Token.SWITCH);
        }
        Trace.beginSection(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.nq7 r14, defpackage.kj6 r15, defpackage.rh8 r16, defpackage.jz r17, defpackage.lk0 r18, defpackage.li4 r19, boolean r20, defpackage.xt4 r21, defpackage.rv4 r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.a(nq7, kj6, rh8, jz, lk0, li4, boolean, xt4, rv4, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(defpackage.nq7 r15, defpackage.kj6 r16, defpackage.rh8 r17, defpackage.fz r18, defpackage.mk0 r19, defpackage.li4 r20, boolean r21, defpackage.xt4 r22, defpackage.rv4 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.b(nq7, kj6, rh8, fz, mk0, li4, boolean, xt4, rv4, int, int):void");
    }

    public static final void c(f25 f25Var, nq7 nq7Var, qg6 qg6Var, rh8 rh8Var, jz jzVar, fz fzVar, li4 li4Var, boolean z, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        li4 li4Var2;
        boolean z3;
        int i7;
        wt2 wt2Var;
        boolean z4;
        xt4Var.getClass();
        rv4Var.g0(734721529);
        if (rv4Var.f(f25Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.f(qg6Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(rh8Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5 | 104882176;
        if (rv4Var.h(xt4Var)) {
            i6 = 536870912;
        } else {
            i6 = 268435456;
        }
        int i11 = i10 | i6;
        if ((306783379 & i11) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i7 = i11 & (-29360129);
                wt2Var = li4Var;
                z4 = z;
            } else {
                pq2 a2 = axa.a(rv4Var);
                boolean f2 = rv4Var.f(a2);
                Object P = rv4Var.P();
                if (f2 || P == ax1.a) {
                    P = new wt2(a2);
                    rv4Var.o0(P);
                }
                i7 = i11 & (-29360129);
                wt2Var = (wt2) P;
                z4 = true;
            }
            rv4Var.r();
            ade.e(f25Var, nq7Var, qg6Var, rh8Var, jzVar, fzVar, wt2Var, z4, null, xt4Var, rv4Var, i7 & 268435454, (i7 >> 27) & 14, 512);
            li4Var2 = wt2Var;
            z3 = z4;
        } else {
            rv4Var.X();
            li4Var2 = li4Var;
            z3 = z;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sd1(f25Var, nq7Var, qg6Var, rh8Var, jzVar, fzVar, li4Var2, z3, xt4Var, i2);
        }
    }

    public static final boolean d(b8a b8aVar) {
        u7a k = b8aVar.k();
        return !k.a.c(h8a.j);
    }

    public static final boolean e(b8a b8aVar, Resources resources) {
        boolean z;
        Object g2 = b8aVar.d.a.g(h8a.a);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        if (list != null) {
            str = (String) sl1.e0(list);
        }
        if (str == null && p(b8aVar) == null && o(b8aVar, resources) == null && !n(b8aVar)) {
            z = false;
        } else {
            z = true;
        }
        if (!bue.o(b8aVar) && (b8aVar.d.c || (b8aVar.q() && z))) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r11 == r7) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.kj6 r9, int r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.f(kj6, int, n42):java.lang.Object");
    }

    public static final void g(gh5 gh5Var, String str) {
        gh5Var.getClass();
        str.getClass();
        t(gh5Var, "Authorization", "Bearer ".concat(str));
    }

    public static final int h(CharSequence charSequence, int i2) {
        int i3;
        charSequence.getClass();
        if (i2 >= 0 && i2 < charSequence.length()) {
            char charAt = charSequence.charAt(i2);
            if (Character.isHighSurrogate(charAt) && (i3 = i2 + 1) < charSequence.length()) {
                char charAt2 = charSequence.charAt(i3);
                if (Character.isLowSurrogate(charAt2)) {
                    return ((charAt << '\n') + charAt2) - 56613888;
                }
            }
            return charAt;
        }
        xk5.r();
        return 0;
    }

    public static nq7 i(do9 do9Var, nq7 nq7Var, vt4 vt4Var, int i2) {
        vt3 vt3Var = vt3.a0;
        if ((i2 & 8) != 0) {
            vt4Var = zx1.V;
        }
        vt4 vt4Var2 = vt4Var;
        j55 j55Var = j55.e;
        do9Var.getClass();
        nq7Var.getClass();
        vt4Var2.getClass();
        return lye.j(nq7Var, new rq(do9Var, j55Var, vt3Var, vt4Var2, 1));
    }

    public static final int j(int i2, String str) {
        String str2;
        int i3;
        cq3 m = m();
        Integer num = null;
        if (m != null) {
            boolean z = true;
            if (m.c() != 1) {
                z = false;
            }
            if (z) {
                jsc.w(str, "charSequence cannot be null");
                ij1 ij1Var = (ij1) m.e.b;
                ij1Var.getClass();
                if (i2 < 0 || i2 >= str.length()) {
                    str2 = str;
                    i3 = -1;
                } else {
                    if (str instanceof Spanned) {
                        Spanned spanned = (Spanned) str;
                        ysc[] yscVarArr = (ysc[]) spanned.getSpans(i2, i2 + 1, ysc.class);
                        if (yscVarArr.length > 0) {
                            i3 = spanned.getSpanEnd(yscVarArr[0]);
                            str2 = str;
                        }
                    }
                    str2 = str;
                    i3 = ((br3) ij1Var.R(str2, Math.max(0, i2 - 16), Math.min(str.length(), i2 + 16), Integer.MAX_VALUE, true, new br3(i2))).c;
                }
                Integer valueOf = Integer.valueOf(i3);
                if (i3 != -1) {
                    num = valueOf;
                }
            } else {
                vs.k("Not initialized yet");
                return 0;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i2);
    }

    public static final int k(int i2, String str) {
        cq3 m = m();
        Integer num = null;
        if (m != null) {
            Integer valueOf = Integer.valueOf(m.b(str, Math.max(0, i2 - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i2);
    }

    public static i45 l(i45 i45Var) {
        boolean z;
        boolean z2;
        i45Var.getClass();
        double rint = Math.rint(i45Var.b);
        boolean z3 = true;
        if (90.0d <= rint && rint <= 111.0d) {
            z = true;
        } else {
            z = false;
        }
        if (Math.rint(i45Var.c) > 16.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Math.rint(i45Var.d) >= 65.0d) {
            z3 = false;
        }
        if (z && z2 && z3) {
            return rqe.i(i45Var.b, i45Var.c, 70.0d);
        }
        return i45Var;
    }

    public static final cq3 m() {
        if (cq3.d()) {
            cq3 a2 = cq3.a();
            if (a2.c() == 1) {
                return a2;
            }
            return null;
        }
        return null;
    }

    public static final boolean n(b8a b8aVar) {
        boolean z;
        Object g2 = b8aVar.d.a.g(h8a.L);
        Boolean bool = null;
        if (g2 == null) {
            g2 = null;
        }
        rbc rbcVar = (rbc) g2;
        tv7 tv7Var = b8aVar.d.a;
        Object g3 = tv7Var.g(h8a.z);
        if (g3 == null) {
            g3 = null;
        }
        xt9 xt9Var = (xt9) g3;
        if (rbcVar != null) {
            z = true;
        } else {
            z = false;
        }
        Object g4 = tv7Var.g(h8a.K);
        if (g4 != null) {
            bool = g4;
        }
        if (bool != null && (xt9Var == null || xt9Var.a != 4)) {
            return true;
        }
        return z;
    }

    public static final String o(b8a b8aVar, Resources resources) {
        float f2;
        int n;
        u7a u7aVar = b8aVar.d;
        u7a u7aVar2 = b8aVar.d;
        Object g2 = u7aVar.a.g(h8a.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        tv7 tv7Var = u7aVar2.a;
        Object g3 = tv7Var.g(h8a.L);
        if (g3 == null) {
            g3 = null;
        }
        rbc rbcVar = (rbc) g3;
        Object g4 = tv7Var.g(h8a.z);
        if (g4 == null) {
            g4 = null;
        }
        xt9 xt9Var = (xt9) g4;
        String str2 = g2;
        if (rbcVar != null) {
            int ordinal = rbcVar.ordinal();
            str2 = g2;
            str2 = g2;
            str2 = g2;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        if (g2 == null) {
                            str2 = resources.getString(R.string.indeterminate);
                        }
                    } else {
                        xk5.o();
                        return null;
                    }
                } else if (xt9Var != null) {
                    str2 = g2;
                    str2 = g2;
                    if (xt9Var.a == 2 && g2 == null) {
                        str2 = resources.getString(R.string.state_off);
                    }
                }
            } else if (xt9Var != null) {
                str2 = g2;
                str2 = g2;
                if (xt9Var.a == 2 && g2 == null) {
                    str2 = resources.getString(R.string.state_on);
                }
            }
        }
        Object g5 = tv7Var.g(h8a.K);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((xt9Var == null || xt9Var.a != 4) && str2 == null) {
                if (booleanValue) {
                    str2 = resources.getString(R.string.selected);
                } else {
                    str2 = resources.getString(R.string.not_selected);
                }
            }
        }
        Object g6 = tv7Var.g(h8a.c);
        if (g6 == null) {
            g6 = null;
        }
        g79 g79Var = (g79) g6;
        String str3 = str2;
        if (g79Var != null) {
            str3 = str2;
            str3 = str2;
            if (g79Var != g79.d) {
                if (str2 == null) {
                    jk1 jk1Var = g79Var.b;
                    float f3 = jk1Var.b;
                    float f4 = jk1Var.a;
                    if (f3 - f4 == nae.e) {
                        f2 = 0.0f;
                    } else {
                        f2 = (g79Var.a - f4) / (jk1Var.b - f4);
                    }
                    if (f2 < nae.e) {
                        f2 = 0.0f;
                    }
                    if (f2 > 1.0f) {
                        f2 = 1.0f;
                    }
                    if (f2 == nae.e) {
                        n = 0;
                    } else if (f2 == 1.0f) {
                        n = 100;
                    } else {
                        n = dce.n(Math.round(f2 * 100.0f), 1, 99);
                    }
                    str3 = resources.getString(R.string.template_percent, Integer.valueOf(n));
                }
            } else if (str2 == null) {
                str3 = resources.getString(R.string.in_progress);
            }
        }
        k8a k8aVar = h8a.G;
        String str4 = str3;
        if (tv7Var.c(k8aVar)) {
            tv7 tv7Var2 = new b8a(b8aVar.a, true, b8aVar.c, u7aVar2).k().a;
            Object g7 = tv7Var2.g(h8a.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = tv7Var2.g(h8a.C);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = tv7Var2.g(k8aVar);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            str4 = str;
        }
        return str4;
    }

    public static final ps p(b8a b8aVar) {
        Object g2 = b8aVar.d.a.g(h8a.G);
        ps psVar = null;
        if (g2 == null) {
            g2 = null;
        }
        ps psVar2 = (ps) g2;
        Object g3 = b8aVar.d.a.g(h8a.C);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        if (list != null) {
            psVar = (ps) sl1.e0(list);
        }
        if (psVar2 == null) {
            return psVar;
        }
        return psVar2;
    }

    public static final boolean q(kj6 kj6Var, boolean z) {
        kj6Var.getClass();
        if (!z) {
            if (kj6Var.h() >= kj6Var.j().n - 1) {
                return false;
            }
        } else {
            gj6 gj6Var = (gj6) sl1.k0(kj6Var.j().k);
            if (gj6Var != null) {
                if (gj6Var.a >= kj6Var.j().n - 1 && gj6Var.p + gj6Var.q <= kj6Var.j().m) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public static final boolean r(kj6 kj6Var, boolean z) {
        kj6Var.getClass();
        if (!z) {
            if (kj6Var.h() <= 0) {
                return false;
            }
            return true;
        }
        gj6 gj6Var = (gj6) sl1.e0(kj6Var.j().k);
        if (gj6Var != null) {
            if (gj6Var.a <= 0 && gj6Var.p >= kj6Var.j().l) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static final z35 s(byte[] bArr, l4 l4Var) {
        l4Var.getClass();
        e45 e45Var = (e45) ((vt4) l4Var.c).invoke();
        e45Var.g(bArr, bArr.length);
        return e45Var.e();
    }

    public static final void t(gh5 gh5Var, String str, Object obj) {
        gh5Var.getClass();
        str.getClass();
        if (obj != null) {
            gh5Var.c.h(str, obj.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object u(defpackage.kj6 r8, boolean r9, boolean r10, defpackage.n42 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.zi6
            if (r0 == 0) goto L13
            r0 = r11
            zi6 r0 = (defpackage.zi6) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            zi6 r0 = new zi6
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L43
            if (r1 == r7) goto L3f
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L37
            if (r1 != r4) goto L31
            defpackage.hre.r(r11)
            return r11
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L37:
            defpackage.hre.r(r11)
            return r11
        L3b:
            defpackage.hre.r(r11)
            return r3
        L3f:
            defpackage.hre.r(r11)
            return r3
        L43:
            defpackage.hre.r(r11)
            n82 r11 = defpackage.n82.a
            if (r10 == 0) goto L8e
            fj6 r10 = r8.j()
            ff8 r10 = r10.p
            int r10 = r10.ordinal()
            if (r10 == 0) goto L6a
            if (r10 != r7) goto L66
            fj6 r10 = r8.j()
            long r1 = r10.i()
            r10 = 32
            long r1 = r1 >> r10
        L63:
            int r10 = (int) r1
            float r10 = (float) r10
            goto L79
        L66:
            defpackage.xk5.o()
            return r2
        L6a:
            fj6 r10 = r8.j()
            long r1 = r10.i()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            goto L63
        L79:
            if (r9 == 0) goto L84
            r0.b = r7
            java.lang.Object r8 = defpackage.jxe.l(r8, r10, r0)
            if (r8 != r11) goto L8d
            goto Lad
        L84:
            r0.b = r6
            java.lang.Object r8 = defpackage.jxe.p(r8, r10, r0)
            if (r8 != r11) goto L8d
            goto Lad
        L8d:
            return r3
        L8e:
            r10 = 0
            if (r9 == 0) goto La0
            int r9 = r8.h()
            int r9 = r9 + r7
            r0.b = r5
            java.lang.Object r8 = r8.f(r9, r10, r0)
            if (r8 != r11) goto L9f
            goto Lad
        L9f:
            return r8
        La0:
            int r9 = r8.h()
            int r9 = r9 + r7
            r0.b = r4
            java.lang.Object r8 = r8.l(r9, r10, r0)
            if (r8 != r11) goto Lae
        Lad:
            return r11
        Lae:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.u(kj6, boolean, boolean, n42):java.lang.Object");
    }

    public static final void v(gh5 gh5Var, String str, Object obj) {
        gh5Var.getClass();
        if (obj != null) {
            gh5Var.a.j.h(str, obj.toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object w(defpackage.kj6 r8, boolean r9, boolean r10, defpackage.n42 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.aj6
            if (r0 == 0) goto L13
            r0 = r11
            aj6 r0 = (defpackage.aj6) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            aj6 r0 = new aj6
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 4
            r5 = 3
            r6 = 2
            r7 = 1
            if (r1 == 0) goto L43
            if (r1 == r7) goto L3f
            if (r1 == r6) goto L3b
            if (r1 == r5) goto L37
            if (r1 != r4) goto L31
            defpackage.hre.r(r11)
            return r11
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L37:
            defpackage.hre.r(r11)
            return r11
        L3b:
            defpackage.hre.r(r11)
            return r3
        L3f:
            defpackage.hre.r(r11)
            return r3
        L43:
            defpackage.hre.r(r11)
            n82 r11 = defpackage.n82.a
            if (r10 == 0) goto L8f
            fj6 r10 = r8.j()
            ff8 r10 = r10.p
            int r10 = r10.ordinal()
            if (r10 == 0) goto L6b
            if (r10 != r7) goto L67
            fj6 r10 = r8.j()
            long r1 = r10.i()
            r10 = 32
            long r1 = r1 >> r10
        L63:
            int r10 = (int) r1
            float r10 = (float) r10
            float r10 = -r10
            goto L7a
        L67:
            defpackage.xk5.o()
            return r2
        L6b:
            fj6 r10 = r8.j()
            long r1 = r10.i()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r4
            goto L63
        L7a:
            if (r9 == 0) goto L85
            r0.b = r7
            java.lang.Object r8 = defpackage.jxe.l(r8, r10, r0)
            if (r8 != r11) goto L8e
            goto Lae
        L85:
            r0.b = r6
            java.lang.Object r8 = defpackage.jxe.p(r8, r10, r0)
            if (r8 != r11) goto L8e
            goto Lae
        L8e:
            return r3
        L8f:
            r10 = 0
            if (r9 == 0) goto La1
            int r9 = r8.h()
            int r9 = r9 - r7
            r0.b = r5
            java.lang.Object r8 = r8.f(r9, r10, r0)
            if (r8 != r11) goto La0
            goto Lae
        La0:
            return r8
        La1:
            int r9 = r8.h()
            int r9 = r9 - r7
            r0.b = r4
            java.lang.Object r8 = r8.l(r9, r10, r0)
            if (r8 != r11) goto Laf
        Lae:
            return r11
        Laf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.w(kj6, boolean, boolean, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x008d, code lost:
        if (r11 == r7) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ac A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object x(defpackage.kj6 r9, int r10, defpackage.n42 r11) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.x(kj6, int, n42):java.lang.Object");
    }

    public static final lf4 y(ur7 ur7Var, rv4 rv4Var) {
        tr7 tr7Var = ((h27) rv4Var.j(j27.a)).d;
        int ordinal = ur7Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            if (ordinal == 5) {
                                return tr7Var.a();
                            }
                            xk5.o();
                            return null;
                        }
                        return tr7Var.b();
                    }
                    return tr7Var.d();
                }
                return tr7Var.e();
            }
            return tr7Var.c();
        }
        return tr7Var.f();
    }

    public static void z(sgf sgfVar) {
        if (!B(sgfVar) && ((ref) sgfVar).a != null) {
            z(((ref) sgfVar).a);
            C(sgfVar);
            return;
        }
        Trace.beginSection(((ref) sgfVar).c);
        C(sgfVar);
    }
}
