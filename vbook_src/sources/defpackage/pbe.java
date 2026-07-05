package defpackage;

import java.io.EOFException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pbe  reason: default package */
/* loaded from: classes3.dex */
public abstract class pbe {
    public static final Object[] a = new Object[0];
    public static final tu1 b = new tu1(new rv1(21), false, -41619232);
    public static final tu1 c = new tu1(new rv1(22), false, 1644249723);
    public static final tu1 d = new tu1(new rv1(23), false, -162181404);
    public static final tu1 e = new tu1(new rv1(24), false, 1132237443);

    public static final void a(boolean z, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        rv4 rv4Var2;
        xt4Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        vt4Var3.getClass();
        rv4Var.g0(-2060846576);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(1877395482);
                nmd.d(z, xt4Var, null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(-1705850439, new y33(vt4Var, vt4Var2, vt4Var3, 3), rv4Var), rv4Var, (i11 & 14) | 3072 | (i11 & Token.ASSIGN_MOD), 48, 2036);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var;
                rv4Var2.e0(1877930759);
                xb.d(z, xt4Var, null, null, mwe.u(kq7.a, false, 14), null, null, null, 0L, 0L, nae.e, false, false, jce.E(1199867544, new vg7(5, vt4Var, vt4Var2, vt4Var3), rv4Var2), rv4Var2, i11 & Token.ELSE, 8172);
                rv4Var2.q(false);
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new b62(z, xt4Var, vt4Var, vt4Var2, vt4Var3, i);
        }
    }

    public static final void b(nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        int i6;
        rv4Var.g0(971025177);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i | i6;
        } else {
            i2 = i;
        }
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i2 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            nq7 z2 = zbe.z(nq7Var, 16.0f, 12.0f);
            xn1 a2 = wn1.a(new hz(8.0f, true, new vs(2)), kh5.I, rv4Var, 6);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z2);
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
            kq7 kq7Var = kq7.a;
            c(rp5.c((wk3) jk3.a.getValue(), rv4Var, 0), yqe.A((y3b) x2b.c.getValue(), rv4Var), yqe.A((y3b) x2b.d.getValue(), rv4Var), pna.f(kq7Var, 1.0f), vt4Var, rv4Var, ((i9 << 9) & 57344) | 3072);
            c(rp5.c((wk3) ok3.F.getValue(), rv4Var, 0), yqe.A((y3b) x2b.e.getValue(), rv4Var), yqe.A((y3b) x2b.f.getValue(), rv4Var), pna.f(kq7Var, 1.0f), vt4Var2, rv4Var, ((i9 << 6) & 57344) | 3072);
            c(rp5.c((wk3) rk3.n.getValue(), rv4Var, 0), yqe.A((y3b) x2b.a.getValue(), rv4Var), yqe.A((y3b) x2b.b.getValue(), rv4Var), pna.f(kq7Var, 1.0f), vt4Var3, rv4Var, ((i9 << 3) & 57344) | 3072);
            hl5.w(kq7Var, 4.0f, rv4Var, true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(nq7Var, vt4Var, vt4Var2, vt4Var3, i);
        }
    }

    public static final void c(ar5 ar5Var, String str, String str2, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(123119862);
        if ((i & 6) == 0) {
            if (rv4Var2.f(ar5Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(str)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(str2)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            nq7 y = zbe.y(lbe.f(15, vt4Var, nmd.v(tte.k(nq7Var, r0f.z(rv4Var2).c), rm1.g(r0f.y(rv4Var2), 3.0f), lre.g), null, false), 16.0f);
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
            int i8 = i2;
            nk5.a(ar5Var, null, pna.n(kq7Var, 24.0f), r0f.y(rv4Var2).q, rv4Var2, (i2 & 14) | 432, 0);
            we6 d2 = rs8.d(kq7Var, 16.0f, rv4Var2, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, d2);
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
            cvb.c(str, null, r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oyb.a(r0f.A(rv4Var2).j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, (i8 >> 3) & 14, 0, 131066);
            cvb.c(str2, null, zl1.b(0.68f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 3, false, 0, 0, null, r0f.A(rv4Var).k, rv4Var, (i8 >> 6) & 14, 384, 126970);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ud1(ar5Var, str, str2, nq7Var, vt4Var, i);
        }
    }

    public static final int d(ry6 ry6Var, ec ecVar) {
        long d1;
        ry6 P0 = ry6Var.P0();
        if (P0 == null) {
            lv5.c("Child of " + ry6Var + " cannot be null when calculating alignment line");
        }
        if (ry6Var.V0().g().containsKey(ecVar)) {
            Integer num = (Integer) ry6Var.V0().g().get(ecVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int o0 = P0.o0(ecVar);
            if (o0 != Integer.MIN_VALUE) {
                boolean z = ry6Var.J;
                boolean z2 = ry6Var.K;
                P0.J = true;
                ry6Var.K = true;
                ry6Var.m1();
                P0.J = z;
                ry6Var.K = z2;
                if (ecVar instanceof n95) {
                    d1 = P0.d1() & 4294967295L;
                } else {
                    d1 = P0.d1() >> 32;
                }
                return o0 + ((int) d1);
            }
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.pf9 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.qf9
            if (r0 == 0) goto L13
            r0 = r5
            qf9 r0 = (defpackage.qf9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qf9 r0 = new qf9
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.b
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            pf9 r4 = r0.a
            defpackage.hre.r(r5)
            goto L46
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r5)
            r0.a = r4
            r0.c = r2
            py3 r5 = new py3
            r0 = 3
            r5.<init>(r4, r0)
            tf9 r5 = r4.b(r5)
            java.lang.Object r5 = r5.b
            n82 r0 = defpackage.n82.a
            if (r5 != r0) goto L46
            return r0
        L46:
            if (r5 == 0) goto L49
            return r5
        L49:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResultSet returned null for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pbe.e(pf9, n42):java.lang.Object");
    }

    public static final byte f(char c2) {
        if (c2 < '~') {
            return dc1.b[c2];
        }
        return (byte) 0;
    }

    public static final boolean g(rq2 rq2Var, rq2 rq2Var2) {
        rq2Var.getClass();
        if (rq2Var.a == rq2Var2.a) {
            uy5 uy5Var = rq2Var.b;
            uy5 uy5Var2 = rq2Var2.b;
            if (uy5Var2.a >= uy5Var.a && uy5Var2.b >= uy5Var.b && uy5Var2.c <= uy5Var.c && uy5Var2.d <= uy5Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final rq2 h(long j, long j2, float[] fArr) {
        int i;
        fArr.getClass();
        int i2 = (int) (j >> 32);
        if (i2 > 0 && (i = (int) (j & 4294967295L)) > 0) {
            uy5 b2 = pc2.b(0L, j2);
            float[] b3 = m27.b(fArr);
            uy5 i3 = i(j, b3, b2, true);
            if (!i3.f()) {
                long c2 = i(j, b3, b2, false).c();
                return new rq2((int) dce.m(((float) Math.rint(((float) ((((int) (c2 >> 32)) * ((int) (c2 & 4294967295L))) / (i2 * i))) / 2.0f)) * 2.0f, 1.0f, 32.0f), i3);
            }
            return null;
        }
        return null;
    }

    public static final uy5 i(long j, float[] fArr, uy5 uy5Var, boolean z) {
        rk9 d2 = l27.d(fArr, npe.n(0L, eg0.A(j)));
        if (z) {
            d2.getClass();
            d2 = new rk9(((float) Math.floor(d2.a / 128.0f)) * 128.0f, ((float) Math.floor(d2.b / 128.0f)) * 128.0f, ((float) Math.ceil(d2.c / 128.0f)) * 128.0f, ((float) Math.ceil(d2.d / 128.0f)) * 128.0f);
        }
        d2.getClass();
        return new uy5(Math.max((int) Math.floor(d2.a), uy5Var.a), Math.max((int) Math.floor(d2.b), uy5Var.b), Math.min((int) Math.ceil(d2.c), uy5Var.c), Math.min((int) Math.ceil(d2.d), uy5Var.d));
    }

    public static final f61 j(m42 m42Var) {
        if (!(m42Var instanceof ta3)) {
            return new f61(1, m42Var);
        }
        f61 k = ((ta3) m42Var).k();
        if (k != null) {
            if (!k.C()) {
                k = null;
            }
            if (k != null) {
                return k;
            }
        }
        return new f61(2, m42Var);
    }

    public static long k(psa psaVar, byte b2, long j, int i) {
        long j2;
        long j3;
        StringBuilder o;
        String str;
        d5a d5aVar;
        long j4;
        long j5;
        long j6;
        if ((i & 4) != 0) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        psaVar.getClass();
        long j7 = 0;
        int i2 = (0L > j2 ? 1 : (0L == j2 ? 0 : -1));
        if (i2 <= 0) {
            if (i2 == 0) {
                return -1L;
            }
            long j8 = 0;
            while (j8 < j2 && psaVar.request(1 + j8)) {
                ly0 b3 = psaVar.b();
                long min = Math.min(j2, psaVar.b().c);
                b3.getClass();
                long min2 = Math.min(min, b3.c);
                tc4.m(b3.c, j8, min2);
                if (j8 == min2 || (d5aVar = b3.a) == null) {
                    j5 = j7;
                    j4 = -1;
                    j6 = -1;
                } else {
                    j4 = -1;
                    long j9 = b3.c;
                    String str2 = "Check failed.";
                    j5 = j7;
                    if (j9 - j8 < j8) {
                        d5a d5aVar2 = b3.b;
                        while (d5aVar2 != null && j9 > j8) {
                            j9 -= d5aVar2.c - d5aVar2.b;
                            if (j9 <= j8) {
                                break;
                            }
                            d5aVar2 = d5aVar2.g;
                        }
                        if (j9 != -1) {
                            while (min2 > j9) {
                                d5aVar2.getClass();
                                String str3 = str2;
                                int p = zxe.p(d5aVar2, b2, Math.max((int) (j8 - j9), 0), Math.min(d5aVar2.b(), (int) (min2 - j9)));
                                if (p != -1) {
                                    j6 = j9 + p;
                                } else {
                                    j9 += d5aVar2.b();
                                    d5aVar2 = d5aVar2.f;
                                    if (d5aVar2 != null && j9 < min2) {
                                        str2 = str3;
                                    }
                                }
                            }
                            vs.k(str2);
                            return j5;
                        }
                        j6 = -1;
                    } else {
                        long j10 = j5;
                        while (d5aVar != null) {
                            long j11 = (d5aVar.c - d5aVar.b) + j10;
                            if (j11 > j8) {
                                break;
                            }
                            d5aVar = d5aVar.f;
                            j10 = j11;
                        }
                        if (j10 != -1) {
                            while (min2 > j10) {
                                d5aVar.getClass();
                                int p2 = zxe.p(d5aVar, b2, Math.max((int) (j8 - j10), 0), Math.min(d5aVar.b(), (int) (min2 - j10)));
                                if (p2 != -1) {
                                    j6 = p2 + j10;
                                } else {
                                    j10 += d5aVar.b();
                                    d5aVar = d5aVar.f;
                                    if (d5aVar != null) {
                                        if (j10 >= min2) {
                                        }
                                    }
                                }
                            }
                            vs.k("Check failed.");
                            return j5;
                        }
                        j6 = -1;
                    }
                }
                if (j6 != j4) {
                    return j6;
                }
                j8 = psaVar.b().c;
                j7 = j5;
            }
            return -1L;
        }
        if (j2 < 0) {
            j3 = 0;
            o = rs8.o(0L, "startIndex (", ") and endIndex (");
            str = ") should be non negative";
        } else {
            j3 = 0;
            o = rs8.o(0L, "startIndex (", ") is not within the range [0..endIndex(");
            str = "))";
        }
        p1a.k(hl5.q(o, j2, str));
        return j3;
    }

    public static final nq7 l(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new bc8(xt4Var));
    }

    public static final byte[] m(psa psaVar, int i) {
        psaVar.getClass();
        long j = i;
        if (j >= 0) {
            return n(psaVar, i);
        }
        p1a.k(nk2.t(j, "byteCount (", ") < 0"));
        return null;
    }

    public static final byte[] n(psa psaVar, int i) {
        if (i == -1) {
            for (long j = 2147483647L; psaVar.b().c < 2147483647L && psaVar.request(j); j *= 2) {
            }
            if (psaVar.b().c < 2147483647L) {
                i = (int) psaVar.b().c;
            } else {
                throw new IllegalStateException(("Can't create an array of size " + psaVar.b().c).toString());
            }
        } else {
            psaVar.w(i);
        }
        byte[] bArr = new byte[i];
        ly0 b2 = psaVar.b();
        b2.getClass();
        long j2 = i;
        tc4.m(j2, 0L, j2);
        int i2 = 0;
        while (i2 < i) {
            int q = b2.q(bArr, i2, i);
            if (q != -1) {
                i2 += q;
            } else {
                throw new EOFException(hl5.i(i, q, "Source exhausted before reading ", " bytes. Only ", " bytes were read."));
            }
        }
        return bArr;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ly0, java.lang.Object, zma, psa] */
    public static final dk1 o(ws4 ws4Var) {
        byte[] bArr = ws4Var.b;
        if (bArr.length < 2) {
            return null;
        }
        ?? obj = new Object();
        l0e.A(obj, bArr);
        return new dk1(obj.readShort(), fre.o(obj, null, 3));
    }

    public static final Object[] p(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArr2[i] = it.next();
            if (i2 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i2);
            }
            i = i2;
        }
    }

    public static final Object[] q(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
        } else {
            Iterator it = collection.iterator();
            if (!it.hasNext()) {
                if (objArr.length > 0) {
                    objArr[0] = null;
                }
            } else {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i2 = i + 1;
                    objArr2[i] = it.next();
                    if (i2 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i3);
                    } else if (!it.hasNext()) {
                        if (objArr2 == objArr) {
                            objArr[i2] = null;
                            return objArr;
                        }
                        return Arrays.copyOf(objArr2, i2);
                    }
                    i = i2;
                }
            }
        }
        return objArr;
    }

    public static final int r(String str) {
        ntc s = s(16, str);
        if (s != null) {
            return s.a;
        }
        r4b.K(str);
        throw null;
    }

    public static final ntc s(int i, String str) {
        int i2;
        nqe.u(i);
        int length = str.length();
        if (length != 0) {
            int i3 = 0;
            char charAt = str.charAt(0);
            if (charAt < '0') {
                i2 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i2 = 0;
            }
            int i4 = 119304647;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    int i5 = i3 ^ Integer.MIN_VALUE;
                    if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                        if (i4 == 119304647) {
                            i4 = (int) (4294967295L / (i & 4294967295L));
                            if (Integer.compare(i5, i4 ^ Integer.MIN_VALUE) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i6 = i3 * i;
                    int i7 = digit + i6;
                    if (Integer.compare(i7 ^ Integer.MIN_VALUE, i6 ^ Integer.MIN_VALUE) < 0) {
                        return null;
                    }
                    i2++;
                    i3 = i7;
                } else {
                    return null;
                }
            }
            return new ntc(i3);
        }
        return null;
    }

    public static final stc t(String str) {
        str.getClass();
        int i = 10;
        nqe.u(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (charAt < '0') {
                i2 = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            }
            long j = 0;
            long j2 = 512409557603043100L;
            while (i2 < length) {
                int digit = Character.digit((int) str.charAt(i2), i);
                if (digit >= 0) {
                    long j3 = j ^ Long.MIN_VALUE;
                    int i3 = length;
                    if (Long.compare(j3, j2 ^ Long.MIN_VALUE) > 0) {
                        if (j2 == 512409557603043100L && Long.compare(j3, -7378697629483820647L) <= 0) {
                            j2 = 1844674407370955161L;
                        } else {
                            return null;
                        }
                    }
                    long j4 = j * 10;
                    long j5 = (digit & 4294967295L) + j4;
                    if (Long.compare(j5 ^ Long.MIN_VALUE, j4 ^ Long.MIN_VALUE) < 0) {
                        return null;
                    }
                    i2++;
                    j = j5;
                    length = i3;
                    i = 10;
                } else {
                    return null;
                }
            }
            return new stc(j);
        }
        return null;
    }

    public static final String u(byte b2) {
        if (b2 == 1) {
            return "quotation mark '\"'";
        }
        if (b2 == 2) {
            return "string escape sequence '\\'";
        }
        if (b2 == 4) {
            return "comma ','";
        }
        if (b2 == 5) {
            return "colon ':'";
        }
        if (b2 == 6) {
            return "start of the object '{'";
        }
        if (b2 == 7) {
            return "end of the object '}'";
        }
        if (b2 == 8) {
            return "start of the array '['";
        }
        if (b2 == 9) {
            return "end of the array ']'";
        }
        if (b2 == 10) {
            return "end of the input";
        }
        if (b2 == Byte.MAX_VALUE) {
            return "invalid token";
        }
        return "valid token";
    }

    public static void v(int i, int i2) {
        String L;
        if (i >= 0 && i < i2) {
            return;
        }
        if (i >= 0) {
            if (i2 < 0) {
                vs.m(a82.j(i2, "negative size: "));
                return;
            }
            L = zbe.L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        } else {
            L = zbe.L("%s (%s) must not be negative", "index", Integer.valueOf(i));
        }
        throw new IndexOutOfBoundsException(L);
    }

    public static void w(int i, int i2, int i3) {
        String x;
        if (i >= 0 && i2 >= i && i2 <= i3) {
            return;
        }
        if (i >= 0 && i <= i3) {
            if (i2 >= 0 && i2 <= i3) {
                x = zbe.L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            } else {
                x = x(i2, i3, "end index");
            }
        } else {
            x = x(i, i3, "start index");
        }
        throw new IndexOutOfBoundsException(x);
    }

    public static String x(int i, int i2, String str) {
        if (i < 0) {
            return zbe.L("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zbe.L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        vs.m(a82.j(i2, "negative size: "));
        return null;
    }
}
