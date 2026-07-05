package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hx6  reason: default package */
/* loaded from: classes3.dex */
public abstract class hx6 {
    public static final h40 a;
    public static final h40 b;
    public static final ij1 c;

    static {
        nsc nscVar;
        gi1 a2 = cm9.a(xe5.class);
        nsc nscVar2 = null;
        try {
            nscVar = cm9.d(xe5.class);
        } catch (Throwable unused) {
            nscVar = null;
        }
        a = new h40("CallLogger", new isc(a2, nscVar));
        gi1 a3 = cm9.a(pvc.class);
        try {
            nscVar2 = cm9.d(pvc.class);
        } catch (Throwable unused2) {
        }
        b = new h40("DisableLogging", new isc(a3, nscVar2));
        c = new ij1("Logging", xw6.a, new vb6(29));
    }

    public static final boolean a(ew6 ew6Var) {
        if (ew6Var != ew6.BODY && ew6Var != ew6.ALL) {
            return false;
        }
        return true;
    }

    public static final boolean b(ew6 ew6Var) {
        if (ew6Var == ew6.HEADERS) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.hj1 r11, defpackage.hq7 r12, defpackage.rf8 r13, defpackage.pg5 r14, defpackage.r45 r15, java.util.List r16, defpackage.n42 r17) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx6.c(hj1, hq7, rf8, pg5, r45, java.util.List, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.hq7 r8, defpackage.rf8 r9, java.lang.Long r10, defpackage.n45 r11, defpackage.pg5 r12, java.util.List r13, defpackage.s11 r14, defpackage.n42 r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx6.d(hq7, rf8, java.lang.Long, n45, pg5, java.util.List, s11, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.hq7 r8, defpackage.oh5 r9, defpackage.s11 r10, java.util.List r11, defpackage.n42 r12) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx6.e(hq7, oh5, s11, java.util.List, n42):java.lang.Object");
    }

    public static final Object f(nw6 nw6Var, ew6 ew6Var, List list, gh5 gh5Var, yw6 yw6Var) {
        Charset charset;
        Object obj = gh5Var.d;
        obj.getClass();
        rf8 rf8Var = (rf8) obj;
        xe5 xe5Var = new xe5(nw6Var);
        gh5Var.f.f(a, xe5Var);
        StringBuilder sb = new StringBuilder();
        if (ew6Var.a) {
            StringBuilder sb2 = new StringBuilder("REQUEST: ");
            xtc xtcVar = gh5Var.a;
            xtcVar.getClass();
            xtc xtcVar2 = new xtc();
            obe.B(xtcVar2, xtcVar);
            sb2.append(xtcVar2.b());
            sb.append(sb2.toString());
            sb.append('\n');
            sb.append("METHOD: " + gh5Var.b);
            sb.append('\n');
        }
        if (ew6Var.b) {
            sb.append("COMMON HEADERS\n");
            owe.J(sb, gh5Var.c.a(), list);
            sb.append("CONTENT HEADERS");
            sb.append('\n');
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    Long a2 = rf8Var.a();
                    if (a2 != null) {
                        owe.I(sb, "Content-Length", String.valueOf(a2.longValue()));
                    }
                    e32 b2 = rf8Var.b();
                    if (b2 != null) {
                        owe.I(sb, "Content-Type", b2.toString());
                    }
                    owe.J(sb, rf8Var.c().a(), list);
                } else {
                    throw rs8.f(it2);
                }
            } else {
                throw rs8.f(it);
            }
        }
        String sb3 = sb.toString();
        if (sb3.length() > 0) {
            xe5Var.c(sb3);
        }
        if (sb3.length() == 0 || !ew6Var.c) {
            xe5Var.a();
            return null;
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append("BODY Content-Type: " + rf8Var.b());
        sb4.append('\n');
        e32 b3 = rf8Var.b();
        if (b3 == null || (charset = h32.a(b3)) == null) {
            charset = ed1.a;
        }
        Charset charset2 = charset;
        i11 i11Var = new i11(false);
        sw2 sw2Var = ab3.a;
        sz6 sz6Var = new sz6();
        sw2Var.getClass();
        z87.v(jz4.a, nq2.C(sw2Var, sz6Var), null, new r9(i11Var, charset2, sb4, xe5Var, (m42) null, 21), 2);
        return jue.K(rf8Var, i11Var, yw6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:112:0x0294, code lost:
        if (r2 == r7) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x02b0, code lost:
        if (r2 == r7) goto L90;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Type inference failed for: r10v0, types: [o45, c3e, h4b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(java.util.List r23, defpackage.ew6 r24, defpackage.hj1 r25, defpackage.hq7 r26, defpackage.gh5 r27, java.util.ArrayList r28, defpackage.n42 r29) {
        /*
            Method dump skipped, instructions count: 714
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx6.g(java.util.List, ew6, hj1, hq7, gh5, java.util.ArrayList, n42):java.lang.Object");
    }

    public static final void h(ew6 ew6Var, StringBuilder sb, fh5 fh5Var, Throwable th) {
        if (!ew6Var.a) {
            return;
        }
        sb.append("RESPONSE " + fh5Var.getUrl() + " failed with exception: " + th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object i(java.util.List r22, defpackage.ew6 r23, defpackage.hq7 r24, defpackage.oh5 r25, java.util.ArrayList r26, defpackage.n42 r27) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hx6.i(java.util.List, ew6, hq7, oh5, java.util.ArrayList, n42):java.lang.Object");
    }
}
