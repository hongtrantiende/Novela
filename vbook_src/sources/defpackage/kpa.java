package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kpa  reason: default package */
/* loaded from: classes.dex */
public final class kpa {
    public static final kpa a = new Object();
    public static final float b;
    public static final float c;
    public static final yj d;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kpa] */
    static {
        float f = uue.r;
        b = f;
        c = f;
        d = dk.a();
    }

    public static gpa c(rv4 rv4Var) {
        return f(((h27) rv4Var.j(j27.a)).a);
    }

    public static gpa d(long j, long j2, long j3, rv4 rv4Var, int i) {
        long j4;
        long j5;
        long j6;
        long j7;
        long j8;
        long j9;
        long j10;
        long j11;
        long j12;
        if ((i & 1) != 0) {
            j4 = zl1.i;
        } else {
            j4 = j;
        }
        if ((i & 2) != 0) {
            j5 = zl1.i;
        } else {
            j5 = j2;
        }
        long j13 = zl1.i;
        gpa f = f(((h27) rv4Var.j(j27.a)).a);
        if (j4 == 16) {
            j4 = f.a;
        }
        long j14 = j4;
        if (j5 == 16) {
            j5 = f.b;
        }
        long j15 = j5;
        if (j13 != 16) {
            j6 = j13;
        } else {
            j6 = f.c;
        }
        if (j3 != 16) {
            j7 = j3;
        } else {
            j7 = f.d;
        }
        if (j13 != 16) {
            j8 = j13;
        } else {
            j8 = f.e;
        }
        if (j13 != 16) {
            j9 = j13;
        } else {
            j9 = f.f;
        }
        if (j13 != 16) {
            j10 = j13;
        } else {
            j10 = f.g;
        }
        if (j13 != 16) {
            j11 = j13;
        } else {
            j11 = f.h;
        }
        if (j13 != 16) {
            j12 = j13;
        } else {
            j12 = f.i;
        }
        if (j13 == 16) {
            j13 = f.j;
        }
        return new gpa(j14, j15, j6, j7, j8, j9, j10, j11, j12, j13);
    }

    public static void e(ak3 ak3Var, ff8 ff8Var, long j, long j2, long j3, float f, float f2) {
        ou9 d2;
        long floatToRawIntBits = (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f) & 4294967295L);
        long floatToRawIntBits2 = (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
        if (ff8Var == ff8.a) {
            float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            d2 = vte.d(npe.n(j, (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32)), floatToRawIntBits, floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2);
        } else {
            float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
            float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
            d2 = vte.d(npe.n(j, (Float.floatToRawIntBits(intBitsToFloat4) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32)), floatToRawIntBits, floatToRawIntBits2, floatToRawIntBits2, floatToRawIntBits);
        }
        yj yjVar = d;
        yj.d(yjVar, d2);
        ak3.t1(ak3Var, yjVar, j3, nae.e, null, 60);
        yjVar.m();
    }

    public static gpa f(pm1 pm1Var) {
        gpa gpaVar = pm1Var.h0;
        if (gpaVar == null) {
            long d2 = rm1.d(pm1Var, uue.m);
            qm1 qm1Var = uue.f;
            long d3 = rm1.d(pm1Var, qm1Var);
            qm1 qm1Var2 = uue.p;
            long d4 = rm1.d(pm1Var, qm1Var2);
            long d5 = rm1.d(pm1Var, qm1Var2);
            long d6 = rm1.d(pm1Var, qm1Var);
            long l = sve.l(zl1.b(uue.j, rm1.d(pm1Var, uue.i)), pm1Var.p);
            qm1 qm1Var3 = uue.g;
            long d7 = rm1.d(pm1Var, qm1Var3);
            float f = uue.h;
            long b2 = zl1.b(f, d7);
            qm1 qm1Var4 = uue.k;
            long d8 = rm1.d(pm1Var, qm1Var4);
            float f2 = uue.l;
            gpa gpaVar2 = new gpa(d2, d3, d4, d5, d6, l, b2, zl1.b(f2, d8), zl1.b(f2, rm1.d(pm1Var, qm1Var4)), zl1.b(f, rm1.d(pm1Var, qm1Var3)));
            pm1Var.h0 = gpaVar2;
            return gpaVar2;
        }
        return gpaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:121:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.wpa r19, defpackage.nq7 r20, boolean r21, defpackage.gpa r22, defpackage.lu4 r23, defpackage.mu4 r24, float r25, float r26, defpackage.rv4 r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kpa.a(wpa, nq7, boolean, gpa, lu4, mu4, float, float, rv4, int, int):void");
    }

    public final void b(final wpa wpaVar, nq7 nq7Var, boolean z, gpa gpaVar, final lu4 lu4Var, final mu4 mu4Var, final float f, final float f2, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        rv4 rv4Var2;
        long j;
        long j2;
        nq7 h;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        nq7 nq7Var2;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        rv4Var.g0(133396521);
        if ((i & 6) == 0) {
            if (rv4Var.h(wpaVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.c(Float.NaN)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i13 = 256;
            } else {
                i13 = Token.CASE;
            }
            i3 |= i13;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.g(z)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(gpaVar)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i10 = 131072;
            } else {
                i10 = Parser.ARGC_LIMIT;
            }
            i3 |= i10;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(mu4Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.c(f)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var.c(f2)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var.g(false)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i3 |= i6;
        }
        if ((i2 & 6) == 0) {
            if (rv4Var.g(false)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i4 = i2 | i5;
        } else {
            i4 = i2;
        }
        if ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i3 & 1, z2)) {
            final long a2 = gpaVar.a(z, false);
            final long a3 = gpaVar.a(z, true);
            if (z) {
                j = gpaVar.e;
            } else {
                j = gpaVar.j;
            }
            if (z) {
                j2 = gpaVar.c;
            } else {
                j2 = gpaVar.h;
            }
            vt9 vt9Var = ((wt9) rv4Var.j(jt9.a)).a;
            int i16 = i3;
            if (wpaVar.n == ff8.a) {
                h = pna.c(pna.s(nq7Var, vpa.a), 1.0f);
            } else {
                h = pna.h(pna.f(nq7Var, 1.0f), vpa.a);
            }
            int i17 = i16 & Token.ASSIGN_MOD;
            if (i17 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean h2 = z3 | rv4Var.h(wpaVar);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (h2 || P == lh9Var) {
                P = new pl7(wpaVar, 12);
                rv4Var.o0(P);
            }
            nq7 a0 = h.a0(sze.f(kq7.a, (mu4) P));
            if (i17 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean h3 = z4 | rv4Var.h(wpaVar);
            if ((i4 & 14) == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean e = h3 | z5 | rv4Var.e(a2) | rv4Var.e(a3) | rv4Var.e(j) | rv4Var.e(j2);
            if ((i16 & 29360128) == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean c2 = e | z6 | rv4Var.c(nae.e);
            if ((i16 & 234881024) == 67108864) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11 = c2 | z7;
            if ((i16 & 458752) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z12 = z11 | z8;
            if ((i16 & 3670016) == 1048576) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z13 = z12 | z9;
            if ((i16 & 1879048192) == 536870912) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z14 = z13 | z10;
            Object P2 = rv4Var.P();
            if (!z14 && P2 != lh9Var) {
                nq7Var2 = a0;
                rv4Var2 = rv4Var;
            } else {
                nq7Var2 = a0;
                final long j3 = j2;
                rv4Var2 = rv4Var;
                final long j4 = j;
                xt4 xt4Var = new xt4() { // from class: jpa
                    /* JADX WARN: Removed duplicated region for block: B:109:0x0261  */
                    @Override // defpackage.xt4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r30) {
                        /*
                            Method dump skipped, instructions count: 993
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.jpa.invoke(java.lang.Object):java.lang.Object");
                    }
                };
                rv4Var2.o0(xt4Var);
                P2 = xt4Var;
            }
            bce.a(nq7Var2, (xt4) P2, rv4Var2, 0);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ipa(this, wpaVar, nq7Var, z, gpaVar, lu4Var, mu4Var, f, f2, i, i2, 1);
        }
    }
}
