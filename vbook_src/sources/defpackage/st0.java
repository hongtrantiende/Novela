package defpackage;

import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.net.UnknownHostException;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: st0  reason: default package */
/* loaded from: classes.dex */
public abstract class st0 {
    public static final int[] a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    public static final tu1 b = new tu1(new mv1(4), false, 879270352);
    public static final tu1 c = new tu1(new mv1(5), false, 1111974531);
    public static final Object d = new Object();

    public static final void a(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        tu1 tu1Var2;
        int i3;
        int i4;
        rv4Var.g0(790527681);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                hm8 hm8Var = new hm8(null, r0f.J);
                rv4Var.o0(hm8Var);
                P = hm8Var;
            }
            aw7 aw7Var = (aw7) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new ao7(aw7Var, 14);
                rv4Var.o0(P2);
            }
            vt4 vt4Var = (vt4) P2;
            m29 m29Var = xx2.a;
            vi0 f = pye.f(kqe.b, rv4Var, 6);
            nq7Var2 = nq7Var;
            tu1Var2 = tu1Var;
            pye.b(new i99[]{yob.b.a(ese.u(vt4Var, rv4Var, 2)), yob.a.a(f)}, jce.E(1070596993, new wp0(nq7Var2, aw7Var, tu1Var2, f, vt4Var), rv4Var), rv4Var, 56);
        } else {
            nq7Var2 = nq7Var;
            tu1Var2 = tu1Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dn(nq7Var2, tu1Var2, i, 5);
        }
    }

    public static final void b(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        rv4Var.g0(155925518);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if (rv4Var.j(yob.a) != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (rv4Var.j(yob.b) != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                rv4Var.e0(-1977187922);
                b37 d2 = fu0.d(kh5.a, true);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
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
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                tu1Var.invoke(rv4Var, Integer.valueOf((i2 >> 3) & 14));
                rv4Var.q(true);
                rv4Var.q(false);
            } else if (z2) {
                rv4Var.e0(-1976997706);
                ese.j(nq7Var, tu1Var, rv4Var, i2 & Token.ELSE);
                rv4Var.q(false);
            } else if (z3) {
                rv4Var.e0(-1976846922);
                xx2.d(nq7Var, tu1Var, rv4Var, i2 & Token.ELSE);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1976716505);
                a(nq7Var, tu1Var, rv4Var, i2 & Token.ELSE);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dn(nq7Var, tu1Var, i, 4);
        }
    }

    public static String c(String str, Throwable th) {
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (d) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                replace = "UnknownHostException (no network)";
                            } else {
                                th2 = th2.getCause();
                            }
                        } finally {
                        }
                    } else {
                        replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            return str + "\n  " + replace.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    public static final nq7 d(nq7 nq7Var, float f, long j, wea weaVar) {
        return nq7Var.a0(new us0(f, new esa(j), weaVar));
    }

    public static Object e(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(st0.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static final int f(int i, int i2, int i3) {
        int i4 = (i3 - i2) + 1;
        int i5 = (i - i2) % i4;
        if (i5 == 0) {
            i5 = 0;
        }
        if (i5 < 0) {
            i5 += i4;
        }
        return i5 + i2;
    }

    public static void g(String str, String str2) {
        synchronized (d) {
            Log.d(str, c(str2, null));
        }
    }

    public static void h(String str, String str2) {
        synchronized (d) {
            Log.e(str, c(str2, null));
        }
    }

    public static void i(String str, String str2, Throwable th) {
        synchronized (d) {
            Log.e(str, c(str2, th));
        }
    }

    public static nc7 j(nc7 nc7Var, tc6 tc6Var, oyb oybVar, r13 r13Var, do4 do4Var) {
        if (nc7Var != null && tc6Var == nc7Var.a && uaf.z(oybVar, tc6Var).equals(nc7Var.b) && r13Var.f() == nc7Var.c.a && do4Var == nc7Var.d) {
            return nc7Var;
        }
        nc7 nc7Var2 = nc7.h;
        if (nc7Var2 != null && tc6Var == nc7Var2.a && uaf.z(oybVar, tc6Var).equals(nc7Var2.b) && r13Var.f() == nc7Var2.c.a && do4Var == nc7Var2.d) {
            return nc7Var2;
        }
        nc7 nc7Var3 = new nc7(tc6Var, uaf.z(oybVar, tc6Var), new u13(r13Var.f(), r13Var.G0()), do4Var);
        nc7.h = nc7Var3;
        return nc7Var3;
    }

    public static void k(int i, km8 km8Var) {
        km8Var.J(7);
        byte[] bArr = km8Var.a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    public static void l(String str, String str2) {
        synchronized (d) {
            Log.i(str, c(str2, null));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0081, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0088, code lost:
        if (r9 != 11) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
        if (r9 != 8) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.c4 m(defpackage.ea1 r9) {
        /*
            r0 = 16
            int r1 = r9.g(r0)
            int r0 = r9.g(r0)
            r2 = 65535(0xffff, float:9.1834E-41)
            r3 = 4
            if (r0 != r2) goto L18
            r0 = 24
            int r0 = r9.g(r0)
            r2 = 7
            goto L19
        L18:
            r2 = r3
        L19:
            int r0 = r0 + r2
            r2 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r2) goto L21
            int r0 = r0 + 2
        L21:
            r1 = 2
            int r2 = r9.g(r1)
            r4 = 3
            if (r2 != r4) goto L32
        L29:
            r9.g(r1)
            boolean r2 = r9.f()
            if (r2 != 0) goto L29
        L32:
            r2 = 10
            int r2 = r9.g(r2)
            boolean r5 = r9.f()
            if (r5 == 0) goto L47
            int r5 = r9.g(r4)
            if (r5 <= 0) goto L47
            r9.o(r1)
        L47:
            boolean r5 = r9.f()
            r6 = 44100(0xac44, float:6.1797E-41)
            r7 = 48000(0xbb80, float:6.7262E-41)
            if (r5 == 0) goto L55
            r5 = r7
            goto L56
        L55:
            r5 = r6
        L56:
            int r9 = r9.g(r3)
            int[] r8 = defpackage.st0.a
            if (r5 != r6) goto L65
            r6 = 13
            if (r9 != r6) goto L65
            r9 = r8[r9]
            goto L93
        L65:
            if (r5 != r7) goto L92
            r6 = 14
            if (r9 >= r6) goto L92
            r6 = r8[r9]
            int r2 = r2 % 5
            r7 = 8
            r8 = 1
            if (r2 == r8) goto L8b
            r8 = 11
            if (r2 == r1) goto L86
            if (r2 == r4) goto L8b
            if (r2 == r3) goto L7d
            goto L90
        L7d:
            if (r9 == r4) goto L83
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
        L83:
            int r9 = r6 + 1
            goto L93
        L86:
            if (r9 == r7) goto L83
            if (r9 != r8) goto L90
            goto L83
        L8b:
            if (r9 == r4) goto L83
            if (r9 != r7) goto L90
            goto L83
        L90:
            r9 = r6
            goto L93
        L92:
            r9 = 0
        L93:
            c4 r1 = new c4
            r1.<init>(r5, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.st0.m(ea1):c4");
    }

    public static void n(ea1 ea1Var, b4 b4Var) {
        int g = ea1Var.g(5);
        ea1Var.o(2);
        if (ea1Var.f()) {
            ea1Var.o(5);
        }
        if (g >= 7 && g <= 10) {
            ea1Var.n();
        }
        if (ea1Var.f()) {
            int g2 = ea1Var.g(3);
            if (b4Var.b == -1 && g >= 0 && g <= 15 && (g2 == 0 || g2 == 1)) {
                b4Var.b = g;
            }
            if (ea1Var.f()) {
                u(ea1Var);
            }
        }
    }

    public static void o(ea1 ea1Var, b4 b4Var) {
        ea1Var.o(2);
        boolean f = ea1Var.f();
        int g = ea1Var.g(8);
        for (int i = 0; i < g; i++) {
            ea1Var.o(2);
            if (ea1Var.f()) {
                ea1Var.o(5);
            }
            if (f) {
                ea1Var.o(24);
            } else {
                if (ea1Var.f()) {
                    if (!ea1Var.f()) {
                        ea1Var.o(4);
                    }
                    b4Var.c = ea1Var.g(6) + 1;
                }
                ea1Var.o(4);
            }
        }
        if (ea1Var.f()) {
            ea1Var.o(3);
            if (ea1Var.f()) {
                u(ea1Var);
            }
        }
    }

    public static final void p(s26 s26Var, grb grbVar, grb grbVar2, kw5 kw5Var, boolean z) {
        gw7 gw7Var = (gw7) kw5Var.b;
        int i = gw7Var.c;
        if (i > 1) {
            s26Var.K(new d4c(0, grbVar.d.toString(), grbVar2.d.toString(), grbVar.e, grbVar2.e, 0L, false, 32));
        } else if (i == 1) {
            ra1 ra1Var = (ra1) gw7Var.a[0];
            long a2 = sze.a(ra1Var.c, ra1Var.d);
            ra1 ra1Var2 = (ra1) ((gw7) kw5Var.b).a[0];
            long a3 = sze.a(ra1Var2.a, ra1Var2.b);
            if (!fxb.d(a2) || !fxb.d(a3)) {
                s26Var.K(new d4c(fxb.g(a2), sze.l(a2, grbVar), sze.l(a3, grbVar2), grbVar.e, grbVar2.e, 0L, z, 32));
            }
        }
    }

    public static final fv8 q(vd4 vd4Var, jd4 jd4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        xt4Var.getClass();
        zr1.d(0, rv4Var);
        aw7 D = yae.D(vd4Var, rv4Var);
        aw7 D2 = yae.D(jd4Var, rv4Var);
        aw7 D3 = yae.D(xt4Var, rv4Var);
        Object[] objArr = new Object[0];
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (P == obj) {
            P = new k24(8);
            rv4Var.o0(P);
        }
        aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
        Object[] objArr2 = new Object[0];
        Object P2 = rv4Var.P();
        if (P2 == obj) {
            P2 = new k24(9);
            rv4Var.o0(P2);
        }
        aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
        Object[] objArr3 = new Object[0];
        Object P3 = rv4Var.P();
        if (P3 == obj) {
            P3 = new k24(10);
            rv4Var.o0(P3);
        }
        aw7 aw7Var3 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 48);
        b6 b6Var = new b6(2);
        boolean f = rv4Var.f(aw7Var3) | rv4Var.f(aw7Var) | rv4Var.f(aw7Var2) | rv4Var.f(D3);
        Object P4 = rv4Var.P();
        if (f || P4 == obj) {
            Object bd4Var = new bd4(aw7Var3, aw7Var, aw7Var2, D3, 0);
            rv4Var.o0(bd4Var);
            P4 = bd4Var;
        }
        i07 n = xoe.n(b6Var, (xt4) P4, rv4Var);
        b6 b6Var2 = new b6(7);
        boolean f2 = rv4Var.f(aw7Var3) | rv4Var.f(aw7Var) | rv4Var.f(aw7Var2) | rv4Var.f(D3);
        Object P5 = rv4Var.P();
        if (f2 || P5 == obj) {
            Object bd4Var2 = new bd4(aw7Var3, aw7Var, aw7Var2, D3, 1);
            rv4Var.o0(bd4Var2);
            P5 = bd4Var2;
        }
        i07 n2 = xoe.n(b6Var2, (xt4) P5, rv4Var);
        b6 b6Var3 = new b6(0);
        boolean f3 = rv4Var.f(aw7Var3) | rv4Var.f(aw7Var) | rv4Var.f(aw7Var2) | rv4Var.f(D3);
        Object P6 = rv4Var.P();
        if (f3 || P6 == obj) {
            Object bd4Var3 = new bd4(aw7Var3, aw7Var, aw7Var2, D3, 2);
            rv4Var.o0(bd4Var3);
            P6 = bd4Var3;
        }
        i07 n3 = xoe.n(b6Var3, (xt4) P6, rv4Var);
        b6 b6Var4 = new b6(1);
        boolean f4 = rv4Var.f(aw7Var3) | rv4Var.f(aw7Var) | rv4Var.f(aw7Var2) | rv4Var.f(D3);
        Object P7 = rv4Var.P();
        if (f4 || P7 == obj) {
            Object bd4Var4 = new bd4(aw7Var3, aw7Var, aw7Var2, D3, 3);
            rv4Var.o0(bd4Var4);
            P7 = bd4Var4;
        }
        i07 n4 = xoe.n(b6Var4, (xt4) P7, rv4Var);
        boolean f5 = rv4Var.f(n) | rv4Var.f(n2) | rv4Var.f(n3) | rv4Var.f(n4);
        Object P8 = rv4Var.P();
        if (f5 || P8 == obj) {
            Object fv8Var = new fv8(new cd4(D2, aw7Var, aw7Var2, D, aw7Var3, n, n3, D3, n2, n4));
            rv4Var.o0(fv8Var);
            P8 = fv8Var;
        }
        return (fv8) P8;
    }

    public static Object r(vt4 vt4Var, n42 n42Var) {
        return z87.E(gs3.a, new db(vt4Var, null, 25), n42Var);
    }

    public static nq7 s(nq7 nq7Var, float f, wea weaVar, int i) {
        boolean z;
        if ((i & 2) != 0) {
            weaVar = lre.g;
        }
        wea weaVar2 = weaVar;
        if (rg3.a(f, nae.e) > 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        long j = u15.a;
        if (rg3.a(f, nae.e) <= 0 && !z2) {
            return nq7Var;
        }
        return nq7Var.a0(new pea(f, weaVar2, z2, j, j));
    }

    public static final long t(float f, long j) {
        return (Float.floatToRawIntBits(Math.max((float) nae.e, Float.intBitsToFloat((int) (j >> 32)) - f)) << 32) | (Float.floatToRawIntBits(Math.max((float) nae.e, Float.intBitsToFloat((int) (j & 4294967295L)) - f)) & 4294967295L);
    }

    public static void u(ea1 ea1Var) {
        int g = ea1Var.g(6);
        if (g >= 2 && g <= 42) {
            ea1Var.o(g * 8);
            return;
        }
        throw xm8.c(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(g)));
    }

    public static final nq7 v(boolean z) {
        return new ned(z);
    }

    public static void w(String str, String str2) {
        synchronized (d) {
            Log.w(str, c(str2, null));
        }
    }

    public static void x(String str, String str2, Throwable th) {
        synchronized (d) {
            Log.w(str, c(str2, th));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [wf2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [wf2, java.lang.Object] */
    public static wf2 y(ru8 ru8Var) {
        if (!TextUtils.isEmpty(ru8Var.e)) {
            String str = ru8Var.c;
            String str2 = ru8Var.e;
            boolean z = ru8Var.d;
            ?? obj = new Object();
            am8.p(str);
            obj.b = str;
            am8.p(str2);
            obj.e = str2;
            obj.a = z;
            return obj;
        }
        String str3 = ru8Var.a;
        String str4 = ru8Var.b;
        boolean z2 = ru8Var.d;
        ?? obj2 = new Object();
        am8.p(str3);
        obj2.c = str3;
        am8.p(str4);
        obj2.d = str4;
        obj2.a = z2;
        return obj2;
    }
}
