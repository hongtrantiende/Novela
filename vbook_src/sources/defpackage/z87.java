package defpackage;

import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: z87 */
/* loaded from: classes3.dex */
public abstract class z87 {
    public static final ftc a = ftc.e;
    public static final tu1 b = new tu1(new nv1(13), false, 2037336741);
    public static final mb4 c = new mb4("is_user_verifying_platform_authenticator_available_for_credential", 1);
    public static final mb4 d = new mb4("is_user_verifying_platform_authenticator_available", 1);
    public static eha e;

    public static int A(int i, km8 km8Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return km8Var.z() + 1;
            case 7:
                return km8Var.G() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static Object B(lu4 lu4Var) {
        return C(gs3.a, lu4Var);
    }

    public static final Object C(d82 d82Var, lu4 lu4Var) {
        lx3 lx3Var;
        d82 q;
        long g1;
        ft1 ft1Var;
        c82 c82Var = abf.d;
        o42 o42Var = (o42) d82Var.get(c82Var);
        gs3 gs3Var = gs3.a;
        if (o42Var == null) {
            lx3Var = c7c.a();
            q = tc4.q(gs3Var, d82Var.plus(lx3Var), true);
            sw2 sw2Var = ab3.a;
            if (q != sw2Var && q.get(c82Var) == null) {
                q = q.plus(sw2Var);
            }
        } else {
            lx3Var = (lx3) c7c.a.get();
            q = tc4.q(gs3Var, d82Var, true);
            sw2 sw2Var2 = ab3.a;
            if (q != sw2Var2 && q.get(c82Var) == null) {
                q = q.plus(sw2Var2);
            }
        }
        jn0 jn0Var = new jn0(q, Thread.currentThread(), lx3Var);
        jn0Var.r0(p82.a, jn0Var, lu4Var);
        lx3 lx3Var2 = jn0Var.C;
        if (lx3Var2 != null) {
            int i = lx3.f;
            lx3Var2.V0(false);
        }
        while (true) {
            if (lx3Var2 != null) {
                try {
                    g1 = lx3Var2.g1();
                } catch (Throwable th) {
                    if (lx3Var2 != null) {
                        int i2 = lx3.f;
                        lx3Var2.y0(false);
                    }
                    throw th;
                }
            } else {
                g1 = Long.MAX_VALUE;
            }
            if (jn0Var.N()) {
                break;
            }
            LockSupport.parkNanos(jn0Var, g1);
            if (Thread.interrupted()) {
                jn0Var.s(new InterruptedException());
            }
        }
        if (lx3Var2 != null) {
            int i3 = lx3.f;
            lx3Var2.y0(false);
        }
        Object a2 = m36.a(jn0Var.I());
        if (a2 instanceof ft1) {
            ft1Var = (ft1) a2;
        } else {
            ft1Var = null;
        }
        if (ft1Var == null) {
            return a2;
        }
        throw ft1Var.a;
    }

    public static final Object E(d82 d82Var, lu4 lu4Var, m42 m42Var) {
        d82 q;
        d82 context = m42Var.getContext();
        if (!((Boolean) d82Var.fold(Boolean.FALSE, new tv1(26))).booleanValue()) {
            q = context.plus(d82Var);
        } else {
            q = tc4.q(context, d82Var, false);
        }
        k27.q(q);
        if (q == context) {
            r0a r0aVar = new r0a(m42Var, q);
            return zbe.J(r0aVar, true, r0aVar, lu4Var);
        }
        abf abfVar = abf.d;
        if (c16.i(q.get(abfVar), context.get(abfVar))) {
            gvc gvcVar = new gvc(m42Var, q);
            d82 d82Var2 = gvcVar.e;
            Object c2 = a7c.c(d82Var2, null);
            try {
                return zbe.J(gvcVar, true, gvcVar, lu4Var);
            } finally {
                a7c.a(d82Var2, c2);
            }
        }
        r0a r0aVar2 = new r0a(m42Var, q);
        try {
            ua3.a(w92.t(w92.q(r0aVar2, r0aVar2, lu4Var)), pvc.a);
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = va3.C;
            do {
                int i = atomicIntegerFieldUpdater.get(r0aVar2);
                if (i != 0) {
                    if (i == 2) {
                        Object a2 = m36.a(r0aVar2.I());
                        if (a2 instanceof ft1) {
                            throw ((ft1) a2).a;
                        }
                        return a2;
                    }
                    vs.k("Already suspended");
                    return null;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(r0aVar2, 0, 1));
            return n82.a;
        } catch (Throwable th) {
            ube.w(r0aVar2, th);
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(defpackage.p1a r4, defpackage.z38 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.kac
            if (r0 == 0) goto L13
            r0 = r6
            kac r0 = (defpackage.kac) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            kac r0 = new kac
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            z38 r5 = r0.a
            defpackage.hre.r(r6)     // Catch: defpackage.fac -> L28
            return r6
        L28:
            r4 = move-exception
            goto L46
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L30:
            defpackage.hre.r(r6)
            r0.a = r5     // Catch: defpackage.fac -> L28
            r0.c = r3     // Catch: defpackage.fac -> L28
            qkb r6 = new qkb     // Catch: defpackage.fac -> L28
            r6.<init>(r5, r4, r2)     // Catch: defpackage.fac -> L28
            java.lang.Object r4 = defpackage.k27.p(r6, r0)     // Catch: defpackage.fac -> L28
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L45
            return r5
        L45:
            return r4
        L46:
            int r6 = r4.b
            int r5 = r5.hashCode()
            if (r6 != r5) goto L4f
            return r2
        L4f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.F(p1a, z38, n42):java.lang.Object");
    }

    public static int G(String str) {
        int length = str.length();
        int i = 0;
        while (i < length && str.charAt(i) < 128) {
            i++;
        }
        int i2 = length;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (charAt < 2048) {
                i2 += (127 - charAt) >>> 31;
                i++;
            } else {
                try {
                    int length2 = str.length();
                    int i3 = 0;
                    while (i < length2) {
                        char charAt2 = str.charAt(i);
                        if (charAt2 < 2048) {
                            i3 += (127 - charAt2) >>> 31;
                        } else {
                            i3 += 2;
                            if (55296 <= charAt2 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i) >= 65536) {
                                    i++;
                                } else {
                                    throw new Exception("Unpaired surrogate at index " + i + " of " + length2);
                                }
                            }
                        }
                        i++;
                    }
                    i2 += i3;
                } catch (c9e unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i2 >= length) {
            return i2;
        }
        vs.m(hl5.k(i2 + 4294967296L, "UTF-8 length does not fit in int: "));
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x001f, code lost:
        return r13 + r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int H(java.lang.String r11, byte[] r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.H(java.lang.String, byte[], int, int):int");
    }

    public static String I(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return "";
        }
        if ((i | i2 | ((bArr.length - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (i < i3) {
                byte b2 = bArr[i];
                if (b2 < 0) {
                    break;
                }
                i++;
                cArr[i4] = (char) b2;
                i4++;
            }
            while (i < i3) {
                int i5 = i + 1;
                byte b3 = bArr[i];
                if (b3 >= 0) {
                    int i6 = i4 + 1;
                    cArr[i4] = (char) b3;
                    while (i5 < i3) {
                        byte b4 = bArr[i5];
                        if (b4 < 0) {
                            break;
                        }
                        i5++;
                        cArr[i6] = (char) b4;
                        i6++;
                    }
                    i4 = i6;
                    i = i5;
                } else if (b3 < -32) {
                    if (i5 < i3) {
                        i += 2;
                        byte b5 = bArr[i5];
                        int i7 = i4 + 1;
                        if (b3 >= -62 && !o28.y(b5)) {
                            cArr[i4] = (char) ((b5 & 63) | ((b3 & 31) << 6));
                            i4 = i7;
                        } else {
                            throw w7e.c();
                        }
                    } else {
                        throw w7e.c();
                    }
                } else if (b3 < -16) {
                    if (i5 < i3 - 1) {
                        int i8 = i + 2;
                        byte b6 = bArr[i5];
                        i += 3;
                        byte b7 = bArr[i8];
                        int i9 = i4 + 1;
                        if (!o28.y(b6) && ((b3 != -32 || b6 >= -96) && ((b3 != -19 || b6 < -96) && !o28.y(b7)))) {
                            cArr[i4] = (char) (((b6 & 63) << 6) | ((b3 & 15) << 12) | (b7 & 63));
                            i4 = i9;
                        } else {
                            throw w7e.c();
                        }
                    } else {
                        throw w7e.c();
                    }
                } else if (i5 < i3 - 2) {
                    byte b8 = bArr[i5];
                    int i10 = i + 3;
                    byte b9 = bArr[i + 2];
                    i += 4;
                    byte b10 = bArr[i10];
                    int i11 = i4 + 1;
                    if (!o28.y(b8)) {
                        if ((((b8 + 112) + (b3 << 28)) >> 30) == 0 && !o28.y(b9) && !o28.y(b10)) {
                            int i12 = ((b8 & 63) << 12) | ((b3 & 7) << 18) | ((b9 & 63) << 6) | (b10 & 63);
                            cArr[i4] = (char) ((i12 >>> 10) + 55232);
                            cArr[i11] = (char) ((i12 & 1023) + 56320);
                            i4 += 2;
                        }
                    }
                    throw w7e.c();
                } else {
                    throw w7e.c();
                }
            }
            return new String(cArr, 0, i4);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static boolean J(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i < i2) {
            while (i < i2) {
                int i3 = i + 1;
                byte b2 = bArr[i];
                if (b2 < 0) {
                    if (b2 < -32) {
                        if (i3 < i2 && b2 >= -62) {
                            i += 2;
                            if (bArr[i3] > -65) {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (b2 < -16) {
                        if (i3 < i2 - 1) {
                            int i4 = i + 2;
                            byte b3 = bArr[i3];
                            if (b3 <= -65) {
                                if (b2 != -32 || b3 >= -96) {
                                    if (b2 != -19 || b3 < -96) {
                                        i += 3;
                                        if (bArr[i4] > -65) {
                                            return false;
                                        }
                                    } else {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else if (i3 < i2 - 2) {
                        int i5 = i + 2;
                        byte b4 = bArr[i3];
                        if (b4 <= -65) {
                            if ((((b4 + 112) + (b2 << 28)) >> 30) == 0) {
                                int i6 = i + 3;
                                if (bArr[i5] <= -65) {
                                    i += 4;
                                    if (bArr[i6] > -65) {
                                        return false;
                                    }
                                } else {
                                    return false;
                                }
                            } else {
                                return false;
                            }
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    i = i3;
                }
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:192:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r30, final defpackage.xt4 r31, defpackage.eu3 r32, defpackage.lz3 r33, defpackage.dc r34, long r35, boolean r37, boolean r38, defpackage.nq7 r39, final defpackage.tu1 r40, defpackage.rv4 r41, final int r42, final int r43) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z87.a(boolean, xt4, eu3, lz3, dc, long, boolean, boolean, nq7, tu1, rv4, int, int):void");
    }

    public static final void b(float f, boolean z, xt4 xt4Var, xt4 xt4Var2, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        boolean z3;
        boolean z4;
        lh9 lh9Var;
        boolean z5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1425938801);
        if (rv4Var2.c(f)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(xt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i9 & 1, z2)) {
            tza tzaVar = j27.a;
            nq7 z6 = zbe.z(c16.g(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g), null, 3), 12.0f, 4.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z6);
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
            kq7 kq7Var = kq7.a;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z3;
            if ((i9 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (!z8 && P != lh9Var2) {
                lh9Var = lh9Var2;
            } else {
                lh9Var = lh9Var2;
                P = new up0(6, xt4Var, z);
                rv4Var2.o0(P);
            }
            nq7 t = q1d.t(1, (vt4) P, rv4Var2, f2, false);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
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
            cvb.c(yqe.A((y3b) b3b.e0.getValue(), rv4Var2), new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 0, 0, 131068);
            tte.g(z, false, null, xt4Var, rv4Var, ((i9 >> 3) & 14) | ((i9 << 3) & 7168), 6);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            if (!z) {
                rv4Var2.e0(1514345969);
                jk1 jk1Var = new jk1(0.1f, 1.0f);
                kpa kpaVar = kpa.a;
                lh9 lh9Var3 = lh9Var;
                gpa d2 = kpa.d(0L, 0L, zl1.b(0.2f, ((h27) rv4Var2.j(tzaVar)).a.a), rv4Var2, 1015);
                nq7 f3 = pna.f(kq7Var, 1.0f);
                if ((i9 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object P2 = rv4Var2.P();
                if (z5 || P2 == lh9Var3) {
                    P2 = new im(12, xt4Var2);
                    rv4Var2.o0(P2);
                }
                dae.d(f, (xt4) P2, f3, false, null, d2, null, 0, null, null, jk1Var, rv4Var, (i9 & 14) | 384, 0, 984);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1514746055);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ch7(f, z, xt4Var, xt4Var2, nq7Var, i, 0);
        }
    }

    public static final void c(dm5 dm5Var, ur5 ur5Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
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
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-440883576);
        if (rv4Var2.f(dm5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(ur5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            nq7 A = zbe.A(nq7Var, 12.0f, nae.e, 2);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
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
            float f = dm5Var.j;
            boolean z13 = dm5Var.i;
            int i8 = i7 & Token.ASSIGN_MOD;
            if (i8 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new gm5(ur5Var, 15);
                rv4Var2.o0(P);
            }
            xt4 xt4Var = (xt4) P;
            if (i8 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var2.P();
            if (z3 || P2 == lh9Var) {
                P2 = new gm5(ur5Var, 6);
                rv4Var2.o0(P2);
            }
            kq7 kq7Var = kq7.a;
            b(f, z13, xt4Var, (xt4) P2, pna.f(kq7Var, 1.0f), rv4Var2, 24576);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i9 = dm5Var.d;
            if (i8 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P3 = rv4Var2.P();
            if (z4 || P3 == lh9Var) {
                P3 = new gm5(ur5Var, 7);
                rv4Var2.o0(P3);
            }
            e(i9, 384, (xt4) P3, rv4Var2, pna.f(kq7Var, 1.0f));
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i10 = dm5Var.a;
            int i11 = dm5Var.b;
            nq7 f2 = pna.f(kq7Var, 1.0f);
            if (i8 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P4 = rv4Var2.P();
            if (z5 || P4 == lh9Var) {
                P4 = new gm5(ur5Var, 8);
                rv4Var2.o0(P4);
            }
            xt4 xt4Var2 = (xt4) P4;
            if (i8 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object P5 = rv4Var2.P();
            if (z6 || P5 == lh9Var) {
                P5 = new gm5(ur5Var, 9);
                rv4Var2.o0(P5);
            }
            l(i10, i11, 384, xt4Var2, (xt4) P5, rv4Var2, f2);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i12 = dm5Var.e;
            if (i8 == 32) {
                z7 = true;
            } else {
                z7 = false;
            }
            Object P6 = rv4Var2.P();
            if (z7 || P6 == lh9Var) {
                P6 = new gm5(ur5Var, 10);
                rv4Var2.o0(P6);
            }
            k(i12, 384, (xt4) P6, rv4Var2, pna.f(kq7Var, 1.0f));
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            boolean z14 = dm5Var.q;
            boolean z15 = dm5Var.r;
            boolean z16 = dm5Var.g;
            boolean z17 = dm5Var.h;
            boolean z18 = dm5Var.s;
            boolean z19 = dm5Var.f;
            nq7 f3 = pna.f(kq7Var, 1.0f);
            if (i8 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object P7 = rv4Var2.P();
            if (z8 || P7 == lh9Var) {
                P7 = new gm5(ur5Var, 11);
                rv4Var2.o0(P7);
            }
            xt4 xt4Var3 = (xt4) P7;
            if (i8 == 32) {
                z9 = true;
            } else {
                z9 = false;
            }
            Object P8 = rv4Var2.P();
            if (z9 || P8 == lh9Var) {
                P8 = new gm5(ur5Var, 12);
                rv4Var2.o0(P8);
            }
            xt4 xt4Var4 = (xt4) P8;
            if (i8 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object P9 = rv4Var2.P();
            if (z10 || P9 == lh9Var) {
                P9 = new gm5(ur5Var, 13);
                rv4Var2.o0(P9);
            }
            xt4 xt4Var5 = (xt4) P9;
            if (i8 == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object P10 = rv4Var2.P();
            if (z11 || P10 == lh9Var) {
                P10 = new gm5(ur5Var, 14);
                rv4Var2.o0(P10);
            }
            xt4 xt4Var6 = (xt4) P10;
            if (i8 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object P11 = rv4Var2.P();
            if (z12 || P11 == lh9Var) {
                P11 = new gm5(ur5Var, 16);
                rv4Var2.o0(P11);
            }
            j(z14, z15, z19, z18, z16, z17, f3, xt4Var3, xt4Var4, xt4Var5, xt4Var6, (xt4) P11, rv4Var2, 1572864);
            rv4Var2 = rv4Var2;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vg7(dm5Var, ur5Var, nq7Var, i, 1);
        }
    }

    public static final void d(int i, rv4 rv4Var) {
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1186146878);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i & 1, z)) {
            nq7 y = zbe.y(pna.f(kq7.a, 1.0f), 12.0f);
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) b3b.b0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new j35(i, 16);
        }
    }

    public static final void e(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1743189379);
        if (rv4Var2.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var2.h(xt4Var)) {
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
        if (rv4Var2.U(i6 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 k = tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c);
            long g = rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(nmd.v(k, g, ba5Var), 12.0f);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) b3b.f0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            m(i, ((i6 << 3) & 896) | (i6 & 14), xt4Var, rv4Var2, nmd.v(tte.k(pna.f(kq7Var, 1.0f), ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), ba5Var), cqe.m((q3b) nz.f.getValue(), rv4Var2));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new p61(i, xt4Var, nq7Var, i2, 1);
        }
    }

    public static final void f(l13 l13Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        l13Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-182498860);
        if (rv4Var.f(l13Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = false;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            boolean booleanValue = ((Boolean) l13Var.a.getValue()).booleanValue();
            if ((i5 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new fo4(l13Var, 27);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(1365196800, new we7(vt4Var, l13Var), rv4Var), null, null, jce.E(968225565, new sj(l13Var, 27), rv4Var), p17.c, null, 0L, 0L, nae.e, false, false, p17.d, rv4Var, 1769856, 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new we7(l13Var, vt4Var, i);
        }
    }

    public static final void g(boolean z, dm5 dm5Var, ur5 ur5Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        dm5Var.getClass();
        ur5Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(1150360329);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(dm5Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(ur5Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(840697789);
                i(z, dm5Var, ur5Var, xt4Var, rv4Var, i2 & 8190);
                rv4Var.q(false);
            } else {
                rv4Var.e0(840890268);
                h(z, dm5Var, ur5Var, xt4Var, rv4Var, i2 & 8190);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zg7(z, dm5Var, ur5Var, xt4Var, i, 0);
        }
    }

    public static final void h(boolean z, dm5 dm5Var, ur5 ur5Var, xt4 xt4Var, rv4 rv4Var, int i) {
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(896090008);
        if ((i & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(dm5Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(ur5Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i2 & 1, z3)) {
            nmd.f(z2, xt4Var, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(221235529, new ah7(0, dm5Var, ur5Var), rv4Var), rv4Var, (i2 & 14) | 805309440 | ((i2 >> 6) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zg7(z, dm5Var, ur5Var, xt4Var, i, 1);
        }
    }

    public static final void i(boolean z, dm5 dm5Var, ur5 ur5Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(-1904202010);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(dm5Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(ur5Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            hc2.b(pna.c, null, jce.E(356151376, new xsa(2, xt4Var, dm5Var, ur5Var, z), rv4Var), rv4Var, 3078, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new zg7(z, dm5Var, ur5Var, xt4Var, i, 2);
        }
    }

    public static final void j(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z7;
        boolean z8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1534752555);
        int i10 = 2;
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        int i12 = 16;
        if (rv4Var2.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i13 = i11 | i3;
        if (rv4Var2.g(z3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i14 = i13 | i4;
        if (rv4Var2.g(z5)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i15 = i14 | i5;
        if (rv4Var2.g(z6)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i6;
        if (rv4Var2.h(xt4Var)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i17 = i16 | i7;
        if (rv4Var2.h(xt4Var2)) {
            i8 = 67108864;
        } else {
            i8 = 33554432;
        }
        int i18 = i17 | i8;
        if (rv4Var2.h(xt4Var3)) {
            i9 = 536870912;
        } else {
            i9 = 268435456;
        }
        int i19 = i18 | i9;
        if (rv4Var2.h(xt4Var4)) {
            i10 = 4;
        }
        if (rv4Var2.h(xt4Var5)) {
            i12 = 32;
        }
        int i20 = i10 | i12;
        if ((306782355 & i19) == 306782354 && (i20 & 19) == 18) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (rv4Var2.U(i19 & 1, z7)) {
            tza tzaVar = j27.a;
            nq7 y = zbe.y(nmd.v(tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f), lre.g), 12.0f);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) b3b.d.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i21 = i19 >> 12;
            p((i21 & 7168) | (i19 & 14) | 384, xt4Var, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) f3b.V.getValue(), rv4Var2), z);
            WeakHashMap weakHashMap = yjd.w;
            rp rpVar = h88.n(rv4Var2).b;
            boolean f = rv4Var2.f((r13) rv4Var2.j(dy1.h)) | rv4Var2.f(rpVar) | rv4Var2.d(((tc6) rv4Var2.j(dy1.n)).ordinal());
            Object P = rv4Var2.P();
            if (f || P == ax1.a) {
                if (rpVar.e().b <= 0 && rpVar.e().d <= 0 && rpVar.e().a <= 0 && rpVar.e().c <= 0) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                P = Boolean.valueOf(z8);
                rv4Var2.o0(P);
            }
            if (((Boolean) P).booleanValue()) {
                rv4Var2.e0(1754925794);
                p(((i19 >> 18) & 7168) | ((i19 >> 6) & 14) | 384, xt4Var3, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) f3b.u0.getValue(), rv4Var2), z3);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1755191991);
                rv4Var2.q(false);
            }
            int i22 = i19 >> 15;
            p((i22 & 7168) | ((i19 >> 3) & 14) | 384, xt4Var2, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) f3b.v0.getValue(), rv4Var2), z2);
            p((i21 & 14) | 384 | ((i20 << 9) & 7168), xt4Var4, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) f3b.h0.getValue(), rv4Var2), z5);
            if (z5) {
                rv4Var2.e0(1755749185);
                nid f2 = gwe.f(rv4Var2);
                if (rg3.a(f2.a, f2.b) > 0) {
                    rv4Var2.e0(1755867078);
                    p((i22 & 14) | 384 | ((i20 << 6) & 7168), xt4Var5, rv4Var2, pna.f(kq7Var, 1.0f), yqe.A((y3b) f3b.f0.getValue(), rv4Var2), z6);
                    rv4Var2.q(false);
                } else {
                    rv4Var2.e0(1756160183);
                    rv4Var2.q(false);
                }
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1756170103);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(z, z2, z3, z4, z5, z6, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, i) { // from class: dh7
                public final /* synthetic */ nq7 C;
                public final /* synthetic */ xt4 D;
                public final /* synthetic */ xt4 E;
                public final /* synthetic */ xt4 F;
                public final /* synthetic */ xt4 G;
                public final /* synthetic */ xt4 H;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(1572865);
                    z87.j(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void k(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1387227662);
        if (rv4Var2.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i5 = i2 | i3;
        if (rv4Var2.h(xt4Var)) {
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
        if (rv4Var2.U(i6 & 1, z)) {
            tza tzaVar = j27.a;
            nq7 k = tte.k(nq7Var, ((h27) rv4Var2.j(tzaVar)).c.c);
            long g = rm1.g(((h27) rv4Var2.j(tzaVar)).a, 3.0f);
            ba5 ba5Var = lre.g;
            nq7 y = zbe.y(nmd.v(k, g, ba5Var), 12.0f);
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
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) f3b.q0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            m(i, ((i6 << 3) & 896) | (i6 & 14), xt4Var, rv4Var2, nmd.v(tte.k(pna.f(kq7Var, 1.0f), ((h27) rv4Var2.j(tzaVar)).c.c), rm1.g(((h27) rv4Var2.j(tzaVar)).a, 6.0f), ba5Var), cqe.m((q3b) nz.p.getValue(), rv4Var2));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new p61(i, xt4Var, nq7Var, i2, 2);
        }
    }

    public static final void l(int i, int i2, int i3, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, nq7 nq7Var) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1455987053);
        if (rv4Var2.d(i)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i3 | i4;
        if (rv4Var2.d(i2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (rv4Var2.h(xt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if (rv4Var2.h(xt4Var2)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i11 = i10 | i7;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i11 & 1, z)) {
            nq7 k = tte.k(nq7Var, r0f.z(rv4Var2).c);
            long g = rm1.g(r0f.y(rv4Var2), 3.0f);
            ba5 ba5Var = lre.g;
            nq7 g2 = c16.g(zbe.y(nmd.v(k, g, ba5Var), 12.0f), null, 3);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, g2);
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
            cvb.c(yqe.A((y3b) f3b.r0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 0, 0, 131070);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            int i12 = i11 >> 3;
            m(i, (i12 & 896) | (i11 & 14), xt4Var, rv4Var2, a82.g(rv4Var2, 6.0f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c), ba5Var), cqe.m((q3b) nz.r.getValue(), rv4Var2));
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            m(i2, ((i11 >> 6) & 896) | (i12 & 14), xt4Var2, rv4Var2, a82.g(rv4Var2, 4.0f, tte.k(pna.f(kq7Var, 1.0f), r0f.z(rv4Var2).c), ba5Var), cqe.m((q3b) nz.q.getValue(), rv4Var2));
            hl5.w(kq7Var, 12.0f, rv4Var2, true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new bh7(i, i2, nq7Var, xt4Var, xt4Var2, i3);
        }
    }

    public static final void m(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, List list) {
        int i3;
        boolean z;
        rv4 rv4Var2;
        nq7 nq7Var2;
        int i4;
        int i5;
        boolean h;
        int i6;
        int i7;
        rv4Var.g0(-682717599);
        if ((i2 & 6) == 0) {
            if (rv4Var.d(i)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var2 = rv4Var;
            nq7Var2 = nq7Var;
            hc2.b(nq7Var2, null, jce.E(536835895, new fh7(i, 0, xt4Var, list), rv4Var), rv4Var2, ((i3 >> 9) & 14) | 3072, 6);
        } else {
            rv4Var2 = rv4Var;
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new gh7(i, list, xt4Var, nq7Var2, i2, 0);
        }
    }

    public static final void n(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, rh8 rh8Var, bkd bkdVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        pb2 pb2Var;
        pb2 pb2Var2;
        Object obj;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        cz7Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(1533798968);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(rh8Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(bkdVar)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                wja wjaVar = (wja) ((fdd) voe.z(cm9.a(wja.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                sdd sddVar = (sdd) rv4Var.j(idd.b);
                if (sddVar == null) {
                    rv4Var.e0(1368428688);
                    sddVar = kv6.a(rv4Var);
                } else {
                    rv4Var.e0(1368426673);
                }
                rv4Var.q(false);
                if (sddVar != null) {
                    if (sddVar instanceof y35) {
                        pb2Var2 = ((y35) sddVar).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    aw7 z9 = jsc.z(((d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var2, o96.a(rv4Var), null))).f, rv4Var);
                    aw7 z10 = jsc.z(wjaVar.e, rv4Var);
                    Object[] objArr = new Object[0];
                    Object P = rv4Var.P();
                    Object obj2 = ax1.a;
                    if (P == obj2) {
                        P = new mia(8);
                        rv4Var.o0(P);
                    }
                    aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                    Object[] objArr2 = new Object[0];
                    Object P2 = rv4Var.P();
                    if (P2 == obj2) {
                        P2 = new mia(9);
                        rv4Var.o0(P2);
                    }
                    aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                    uja ujaVar = (uja) z10.getValue();
                    boolean z11 = ((y0d) z9.getValue()).i;
                    boolean f = rv4Var.f(wjaVar);
                    Object P3 = rv4Var.P();
                    if (!f && P3 != obj2) {
                        obj = obj2;
                    } else {
                        obj = obj2;
                        Object vjaVar = new vja(0, wjaVar, wja.class, "loadMore", "loadMore()V", 0, 0);
                        rv4Var.o0(vjaVar);
                        P3 = vjaVar;
                    }
                    i76 i76Var = (i76) P3;
                    int i10 = i9 & 14;
                    if (i10 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P4 = rv4Var.P();
                    if (z2 || P4 == obj) {
                        P4 = new ar0(cz7Var, 27);
                        rv4Var.o0(P4);
                    }
                    xt4 xt4Var = (xt4) P4;
                    boolean f2 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
                    Object P5 = rv4Var.P();
                    if (f2 || P5 == obj) {
                        P5 = new pr0(aw7Var2, aw7Var, 28);
                        rv4Var.o0(P5);
                    }
                    Object obj3 = obj;
                    tl1.k(ujaVar, z11, rh8Var, bkdVar, nq7Var, xt4Var, (xt4) P5, vt4Var, (vt4) i76Var, rv4Var, (i9 & 8064) | 24576 | ((i9 << 9) & 29360128));
                    String str = (String) aw7Var2.getValue();
                    boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                    boolean f3 = rv4Var.f(aw7Var);
                    Object P6 = rv4Var.P();
                    if (f3 || P6 == obj3) {
                        P6 = new jia(aw7Var, 6);
                        rv4Var.o0(P6);
                    }
                    xt4 xt4Var2 = (xt4) P6;
                    boolean f4 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z12 = f4 | z3;
                    Object P7 = rv4Var.P();
                    if (z12 || P7 == obj3) {
                        P7 = new if3(cz7Var, aw7Var, 8);
                        rv4Var.o0(P7);
                    }
                    lu4 lu4Var = (lu4) P7;
                    boolean f5 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z13 = f5 | z4;
                    Object P8 = rv4Var.P();
                    if (z13 || P8 == obj3) {
                        P8 = new hja(cz7Var, aw7Var, 8);
                        rv4Var.o0(P8);
                    }
                    xt4 xt4Var3 = (xt4) P8;
                    boolean f6 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z14 = f6 | z5;
                    Object P9 = rv4Var.P();
                    if (z14 || P9 == obj3) {
                        P9 = new hja(cz7Var, aw7Var, 9);
                        rv4Var.o0(P9);
                    }
                    xt4 xt4Var4 = (xt4) P9;
                    boolean f7 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z15 = f7 | z6;
                    Object P10 = rv4Var.P();
                    if (z15 || P10 == obj3) {
                        P10 = new hja(cz7Var, aw7Var, 6);
                        rv4Var.o0(P10);
                    }
                    xt4 xt4Var5 = (xt4) P10;
                    boolean f8 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z16 = f8 | z7;
                    Object P11 = rv4Var.P();
                    if (z16 || P11 == obj3) {
                        P11 = new hja(cz7Var, aw7Var, 7);
                        rv4Var.o0(P11);
                    }
                    xt4 xt4Var6 = (xt4) P11;
                    if (i10 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Object P12 = rv4Var.P();
                    if (z8 || P12 == obj3) {
                        P12 = new ar0(cz7Var, 26);
                        rv4Var.o0(P12);
                    }
                    ube.e(booleanValue, str, xt4Var2, lu4Var, xt4Var3, xt4Var4, xt4Var5, xt4Var6, (xt4) P12, rv4Var, 0);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nf3(cz7Var, nq7Var, rh8Var, bkdVar, vt4Var, i, 8);
        }
    }

    public static final void o(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    public static final void p(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str, boolean z) {
        int i2;
        boolean z2;
        nq7 nq7Var2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1166652859);
        if ((i & 6) == 0) {
            if (rv4Var2.g(z)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(str)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i2 & 1, z2)) {
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var2.P();
            if (z5 || P == ax1.a) {
                P = new up0(7, xt4Var, z);
                rv4Var2.o0(P);
            }
            nq7Var2 = nq7Var;
            nq7 t = q1d.t(1, (vt4) P, rv4Var2, nq7Var2, false);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, t);
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
            cvb.c(str, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, (i2 >> 3) & 14, 0, 131068);
            rv4Var2 = rv4Var;
            tte.g(z, false, null, xt4Var, rv4Var2, i2 & 7182, 6);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new eh7(z, str, nq7Var2, xt4Var, i, 0);
        }
    }

    public static final void q(u36 u36Var, String str) {
        u36Var.getClass();
        i56 a2 = l46.a(str);
        a2.getClass();
        u36Var.a.add(a2);
    }

    public static final void r(u36 u36Var, xt4 xt4Var) {
        u36Var.getClass();
        e56 e56Var = new e56();
        xt4Var.invoke(e56Var);
        u36Var.a.add(e56Var.a());
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [hz2, b1] */
    public static hz2 s(m82 m82Var, d82 d82Var, lu4 lu4Var, int i) {
        if ((i & 1) != 0) {
            d82Var = gs3.a;
        }
        ?? b1Var = new b1(tc4.s(m82Var, d82Var), true);
        b1Var.r0(p82.a, b1Var, lu4Var);
        return b1Var;
    }

    public static boolean t(km8 km8Var, bi4 bi4Var, int i, fr2 fr2Var) {
        boolean z;
        boolean z2;
        boolean z3;
        long B = km8Var.B();
        long j = B >>> 16;
        if (j != i) {
            return false;
        }
        if ((j & 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = (int) ((B >> 12) & 15);
        int i3 = (int) ((B >> 8) & 15);
        int i4 = (int) ((B >> 4) & 15);
        int i5 = (int) ((B >> 1) & 7);
        if ((B & 1) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i4 <= 7) {
            if (i4 != bi4Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || bi4Var.g != 2) {
            return false;
        }
        if ((i5 != 0 && i5 != bi4Var.i) || z2) {
            return false;
        }
        try {
            long H = km8Var.H();
            if (!z) {
                H *= bi4Var.b;
            }
            long j2 = bi4Var.j;
            if (j2 != 0 && H > j2) {
                return false;
            }
            fr2Var.a = H;
            int A = A(i2, km8Var);
            long j3 = bi4Var.j;
            if (j3 != 0 && H + A < j3) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (A == -1) {
                return false;
            }
            if ((!z3 && A < bi4Var.a) || A > bi4Var.b) {
                return false;
            }
            int i6 = bi4Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != bi4Var.f) {
                        return false;
                    }
                } else if (i3 == 12) {
                    if (km8Var.z() * 1000 != i6) {
                        return false;
                    }
                } else if (i3 > 14) {
                    return false;
                } else {
                    int G = km8Var.G();
                    if (i3 == 14) {
                        G *= 10;
                    }
                    if (G != i6) {
                        return false;
                    }
                }
            }
            int z4 = km8Var.z();
            int i7 = km8Var.b;
            byte[] bArr = km8Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = km8Var.b; i10 < i8; i10++) {
                i9 = a2d.l[i9 ^ (bArr[i10] & 255)];
            }
            String str = a2d.a;
            if (z4 != i9) {
                return false;
            }
            if (km8Var.a() != 0) {
                int j4 = km8Var.j();
                if ((j4 & Token.CASE) != 0) {
                    return false;
                }
                int i11 = (j4 & Token.ELSE) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    st0.l("FlacFrameReader", "Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [iya, b1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final iya u(m82 m82Var, d82 d82Var, p82 p82Var, lu4 lu4Var) {
        ok6 ok6Var;
        d82 s = tc4.s(m82Var, d82Var);
        p82Var.getClass();
        if (p82Var == p82.b) {
            ok6Var = new ok6(s, lu4Var);
        } else {
            ok6Var = new b1(s, true);
        }
        ok6Var.r0(p82Var, ok6Var, lu4Var);
        return ok6Var;
    }

    public static /* synthetic */ iya v(m82 m82Var, d82 d82Var, p82 p82Var, lu4 lu4Var, int i) {
        if ((i & 1) != 0) {
            d82Var = gs3.a;
        }
        if ((i & 2) != 0) {
            p82Var = p82.a;
        }
        return u(m82Var, d82Var, p82Var, lu4Var);
    }

    public static final void w() {
        try {
            if (e == null) {
                eha ehaVar = (eha) ((ve2) ((xg4) qf4.d().b(xg4.class))).o.get();
                ehaVar.getClass();
                e = ehaVar;
            }
            eha ehaVar2 = e;
            if (ehaVar2 != null) {
                if (ehaVar2.i) {
                    if (ehaVar2 != null) {
                        ehaVar2.b();
                        return;
                    } else {
                        c16.w("sharedSessionRepository");
                        throw null;
                    }
                }
                return;
            }
            c16.w("sharedSessionRepository");
            throw null;
        } catch (Exception unused) {
        }
    }

    public static final void x(e56 e56Var, String str, Number number) {
        e56Var.getClass();
        hv5 hv5Var = l46.a;
        e56Var.b(new w46(number, false), str);
    }

    public static final void y(e56 e56Var, String str, String str2) {
        e56Var.getClass();
        e56Var.b(l46.a(str2), str);
    }

    public static final void z(e56 e56Var, String str, xt4 xt4Var) {
        e56Var.getClass();
        e56 e56Var2 = new e56();
        xt4Var.invoke(e56Var2);
        e56Var.b(e56Var2.a(), str);
    }
}
