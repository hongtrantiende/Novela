package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nae  reason: default package */
/* loaded from: classes.dex */
public abstract class nae {
    public static ClassLoader a = null;
    public static Thread b = null;
    public static final tu1 c = new tu1(new xu1(20), false, 1944891995);
    public static final tu1 d = new tu1(new pv1(10), false, -1389015791);
    public static final float e = 24.0f;
    public static final Object f = new Object();
    public static Thread g = null;
    public static volatile Handler h = null;
    public static final int i = 9;
    public static final int j = 10;
    public static final int k = 12;
    public static jf8 l;

    public static final void a(int i2, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i3;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-321228736);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i4 = i2 | i3;
        if ((i4 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i4 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
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
            jce.F(qw1.e, rv4Var2, l2);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            rv4Var2.e0(1481611500);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, 24576, 0, 130030);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, 100663296, 252);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, vt4Var, nq7Var, i2, 0);
        }
    }

    public static final void b(int i2, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1728259700);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i6 = i5 | i4;
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
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
            jce.F(npVar2, rv4Var2, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.g;
            kq7 kq7Var = kq7.a;
            cvb.c(str, zbe.y(kq7Var, 24.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i6 & 14) | 48, 0, 130044);
            eg0.f(pna.n(kq7Var, 48.0f), ((zl1) rv4Var.j(r12.a)).a, null, rv4Var, 6, 4);
            rv4Var.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i6 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new pa(19, vt4Var);
                rv4Var.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i2, 1);
        }
    }

    public static final void c(int i2, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i3;
        cz7 cz7Var2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        int i4;
        int i5;
        int i6;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-962176442);
        if ((i2 & 6) == 0) {
            if (rv4Var.f(str)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i3 = i6 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        boolean z2 = true;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new op0(str, 3);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(w91.class);
                w91 w91Var = (w91) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f2 = rv4Var.f(w91Var);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new u0(w91Var, 10);
                    rv4Var.o0(P2);
                }
                tte.d(w91Var, null, (xt4) P2, rv4Var, 0);
                aw7 z3 = jsc.z(w91Var.j0, rv4Var);
                aw7 z4 = jsc.z(w91Var.X, rv4Var);
                dxe.l(((dm5) z4.getValue()).e, ((dm5) z4.getValue()).q, ((dm5) z4.getValue()).i, ((dm5) z4.getValue()).j, rv4Var, 0);
                rv4Var2 = rv4Var;
                p17.a((dm5) z4.getValue(), jce.E(1173418498, new i31(nq7Var, cz7Var2, w91Var, z3, 0), rv4Var2), rv4Var2, 48);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new j31(str, cz7Var, nq7Var, i2, 0);
        }
    }

    public static final void d(String str, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z;
        str.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(-1927456882);
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i2 | i3;
        if (rv4Var.h(xt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i6 = i5 | i4;
        if ((i6 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            xb.a(true, xt4Var, null, null, null, null, jce.E(-531528293, new jd1(str, 15), rv4Var), null, 0L, 0L, e, null, null, null, true, true, jce.E(417773874, new sv4(18, xt4Var2, xt4Var), rv4Var), rv4Var, 1572918, 1794048, 16316);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vg7((Object) str, xt4Var, (Object) xt4Var2, i2, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Type inference failed for: r5v0, types: [wl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.i2a r9, float r10, defpackage.es r11, defpackage.pq2 r12, defpackage.xt4 r13, defpackage.n42 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.uqa
            if (r0 == 0) goto L13
            r0 = r14
            uqa r0 = (defpackage.uqa) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            uqa r0 = new uqa
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.d
            int r1 = r0.e
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            float r10 = r0.a
            wl9 r9 = r0.c
            es r11 = r0.b
            defpackage.hre.r(r14)
            goto L69
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L32:
            defpackage.hre.r(r14)
            wl9 r5 = new wl9
            r5.<init>()
            java.lang.Object r14 = r11.a()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4b
            r14 = r2
            goto L4c
        L4b:
            r14 = 0
        L4c:
            r14 = r14 ^ r2
            tqa r3 = new tqa
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.b = r11
            r0.c = r5
            r0.a = r4
            r0.e = r2
            java.lang.Object r9 = defpackage.ote.m(r11, r12, r14, r3, r0)
            n82 r10 = defpackage.n82.a
            if (r9 != r10) goto L67
            return r10
        L67:
            r10 = r4
            r9 = r5
        L69:
            ur r12 = new ur
            float r9 = r9.a
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nae.e(i2a, float, es, pq2, xt4, n42):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Type inference failed for: r12v0, types: [wl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(defpackage.i2a r16, float r17, float r18, defpackage.es r19, defpackage.xr r20, defpackage.xt4 r21, defpackage.n42 r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.vqa
            if (r2 == 0) goto L18
            r2 = r1
            vqa r2 = (defpackage.vqa) r2
            int r3 = r2.f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            vqa r2 = new vqa
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.e
            int r2 = r8.f
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            float r0 = r8.b
            float r2 = r8.a
            wl9 r3 = r8.d
            es r4 = r8.c
            defpackage.hre.r(r1)
            r1 = r0
            r0 = r2
            goto L8f
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r0)
            r0 = 0
            return r0
        L3d:
            defpackage.hre.r(r1)
            wl9 r12 = new wl9
            r12.<init>()
            java.lang.Object r1 = r19.a()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L64
            r2 = r3
            goto L65
        L64:
            r2 = 0
        L65:
            r6 = r2 ^ 1
            tqa r10 = new tqa
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.c = r2
            r8.d = r12
            r8.a = r0
            r8.b = r1
            r8.f = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = defpackage.ote.n(r3, r4, r5, r6, r7, r8)
            n82 r3 = defpackage.n82.a
            if (r2 != r3) goto L8c
            return r3
        L8c:
            r4 = r19
            r3 = r12
        L8f:
            java.lang.Object r2 = r4.a()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = l(r2, r1)
            ur r2 = new ur
            float r3 = r3.a
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            es r0 = defpackage.yte.r(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nae.f(i2a, float, float, es, xr, xt4, n42):java.lang.Object");
    }

    public static final Object[] g(Object[] objArr, int i2, Object obj, Object obj2) {
        Object[] objArr2 = new Object[objArr.length + 2];
        b00.a0(0, i2, 6, objArr, objArr2);
        b00.W(i2 + 2, i2, objArr.length, objArr, objArr2);
        objArr2[i2] = obj;
        objArr2[i2 + 1] = obj2;
        return objArr2;
    }

    public static final Object[] h(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 2];
        b00.a0(0, i2, 6, objArr, objArr2);
        b00.W(i2, i2 + 2, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final Object[] i(int i2, Object[] objArr) {
        Object[] objArr2 = new Object[objArr.length - 1];
        b00.a0(0, i2, 6, objArr, objArr2);
        b00.W(i2, i2 + 1, objArr.length, objArr, objArr2);
        return objArr2;
    }

    public static final void j(lob lobVar, Context context, boolean z, CharSequence charSequence, long j2) {
        if (!fxb.d(j2) && charSequence.length() != 0) {
            PackageManager packageManager = context.getPackageManager();
            List list = (List) cqe.d.invoke(context);
            if (!list.isEmpty()) {
                lobVar.a();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ResolveInfo resolveInfo = (ResolveInfo) list.get(i2);
                    lobVar.a.a(new uob(new t69(i2), resolveInfo.loadLabel(packageManager).toString(), 0, new dk6(context, resolveInfo, z, charSequence, j2)));
                }
                lobVar.a();
            }
        }
    }

    public static final void k(wr wrVar, i2a i2aVar, xt4 xt4Var, float f2) {
        float f3;
        try {
            f3 = i2aVar.a(f2);
        } catch (CancellationException unused) {
            wrVar.a();
            f3 = e;
        }
        xt4Var.invoke(Float.valueOf(f3));
        if (Math.abs(f2 - f3) > 0.5f) {
            wrVar.a();
        }
    }

    public static final float l(float f2, float f3) {
        if (f3 == e) {
            return e;
        }
        if (f3 <= e ? f2 < f3 : f2 > f3) {
            return f3;
        }
        return f2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (((int) r0.b().c) >= 1048576) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(defpackage.f31 r2, defpackage.n42 r3) {
        /*
            r2.getClass()
            java.lang.Throwable r0 = r2.b()
            if (r0 != 0) goto L2d
            boolean r0 = r2.j()
            if (r0 != 0) goto L21
            zma r0 = r2.f()
            r0.getClass()
            ly0 r0 = r0.b()
            long r0 = r0.c
            int r0 = (int) r0
            r1 = 1048576(0x100000, float:1.469368E-39)
            if (r0 < r1) goto L2a
        L21:
            java.lang.Object r2 = r2.c(r3)
            n82 r3 = defpackage.n82.a
            if (r2 != r3) goto L2a
            return r2
        L2a:
            pvc r2 = defpackage.pvc.a
            return r2
        L2d:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nae.m(f31, n42):java.lang.Object");
    }

    public static final eo4 n(String str) {
        boolean Q;
        gs3 gs3Var;
        str.getClass();
        try {
            Q = r4b.Q(str, "font/", false);
            gs3Var = gs3.a;
        } catch (Exception unused) {
        }
        if (Q) {
            byte[] bArr = (byte[]) z87.C(gs3Var, new mv0(2, null, str));
            dq4 dq4Var = dq4.e;
            bArr.getClass();
            dq4Var.getClass();
            List asList = Arrays.asList(new rf(str, bArr, dq4Var));
            asList.getClass();
            return new no4(asList);
        }
        if (!k4b.j0(str)) {
            hn8 f2 = hn8.f(k73.a().a(), str);
            if (pe4.a.j0(f2)) {
                byte[] bArr2 = (byte[]) z87.C(gs3Var, new rg0(f2, null, 9));
                String t = f2.a.t();
                dq4 dq4Var2 = dq4.e;
                bArr2.getClass();
                dq4Var2.getClass();
                List asList2 = Arrays.asList(new rf(t, bArr2, dq4Var2));
                asList2.getClass();
                return new no4(asList2);
            }
        }
        return eo4.a;
    }

    public static final int o(int i2, int i3) {
        return (i2 >> i3) & 31;
    }

    public static final boolean p(rv4 rv4Var) {
        if ((((Configuration) rv4Var.j(gh.a)).uiMode & 48) == 32) {
            return true;
        }
        return false;
    }

    public static final eo4 q(String str, rv4 rv4Var, int i2) {
        boolean z;
        str.getClass();
        if ((((i2 & 14) ^ 6) > 4 && rv4Var.f(str)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        Object P = rv4Var.P();
        if (z || P == ax1.a) {
            P = n(str);
            rv4Var.o0(P);
        }
        return (eo4) P;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b0, code lost:
        if (r2 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.lang.ClassLoader r() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nae.r():java.lang.ClassLoader");
    }

    public static boolean s(Thread thread) {
        if (g == null) {
            g = Looper.getMainLooper().getThread();
        }
        if (thread == g) {
            return true;
        }
        return false;
    }

    public static Handler t() {
        if (h == null) {
            synchronized (f) {
                try {
                    if (h == null) {
                        h = new Handler(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        return h;
    }
}
