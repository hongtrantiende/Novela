package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vv  reason: default package */
/* loaded from: classes.dex */
public abstract class vv {
    public static final ly1 a = new ly1(new i(11));
    public static final ly1 b = new ly1(new i(12));
    public static final rd2 c = new rd2(0.8f, nae.e, 0.8f, 0.15f);
    public static final float d = 28.0f;
    public static final float e = 4.0f;
    public static final float f = 12.0f;

    public static final void a(final tu1 tu1Var, nq7 nq7Var, final tu1 tu1Var2, final mu4 mu4Var, float f2, float f3, final ko6 ko6Var, final xfc xfcVar, final bgc bgcVar, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        final nq7 nq7Var2;
        final float f4;
        final float f5;
        float f6;
        float f7;
        nq7 nq7Var3;
        float f8;
        float f9;
        rv4Var.g0(-1406602045);
        int i7 = i | 48;
        if (rv4Var.h(tu1Var2)) {
            i2 = 256;
        } else {
            i2 = Token.CASE;
        }
        int i8 = i7 | i2;
        if (rv4Var.h(mu4Var)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i9 = i8 | i3 | 221184;
        if (rv4Var.f(ko6Var)) {
            i4 = 1048576;
        } else {
            i4 = 524288;
        }
        int i10 = i9 | i4;
        if (rv4Var.f(xfcVar)) {
            i5 = 8388608;
        } else {
            i5 = 4194304;
        }
        int i11 = i10 | i5;
        if (rv4Var.f(bgcVar)) {
            i6 = 67108864;
        } else {
            i6 = 33554432;
        }
        int i12 = i11 | i6;
        if ((38347923 & i12) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i12 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                nq7Var3 = nq7Var;
                f6 = f2;
                f7 = f3;
            } else {
                f6 = yfc.c;
                f7 = yfc.d;
                nq7Var3 = kq7.a;
            }
            rv4Var.r();
            oyb a2 = gtc.a(k27.a, rv4Var);
            oyb a3 = gtc.a(z87.a, rv4Var);
            oyb oybVar = oyb.d;
            if (!rg3.b(f6, Float.NaN) && !rg3.b(f6, Float.POSITIVE_INFINITY)) {
                f8 = f6;
            } else {
                f8 = yfc.c;
            }
            if (!rg3.b(f7, Float.NaN) && !rg3.b(f7, Float.POSITIVE_INFINITY)) {
                f9 = f7;
            } else {
                f9 = yfc.d;
            }
            int i13 = i12 >> 3;
            int i14 = (i13 & Token.ASSIGN_MOD) | 6 | (i13 & 896) | (458752 & i13) | (3670016 & i13) | (i13 & 29360128);
            nq7 nq7Var4 = nq7Var3;
            f(nq7Var4, tu1Var, a2, d, tu1Var, a3, oybVar, oybVar, tu1Var2, mu4Var, f8, f9, ko6Var, xfcVar, bgcVar, rv4Var, 920153142, i14);
            nq7Var2 = nq7Var4;
            f4 = f6;
            f5 = f7;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            f4 = f2;
            f5 = f3;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(nq7Var2, tu1Var2, mu4Var, f4, f5, ko6Var, xfcVar, bgcVar, i) { // from class: rv
                public final /* synthetic */ ko6 C;
                public final /* synthetic */ xfc D;
                public final /* synthetic */ bgc E;
                public final /* synthetic */ nq7 b;
                public final /* synthetic */ tu1 c;
                public final /* synthetic */ mu4 d;
                public final /* synthetic */ float e;
                public final /* synthetic */ float f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(7);
                    vv.a(tu1.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(final nq7 nq7Var, final tu1 tu1Var, final oyb oybVar, final oyb oybVar2, final lu4 lu4Var, final mu4 mu4Var, final float f2, final rh8 rh8Var, final qid qidVar, final xfc xfcVar, final bgc bgcVar, rv4 rv4Var, final int i, final int i2) {
        int i3;
        Object obj;
        Object obj2;
        Object obj3;
        int i4;
        Object obj4;
        boolean z;
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
        int i16;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(703932376);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i3 = i16 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            obj = tu1Var;
            if (rv4Var.h(obj)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i3 |= i15;
        } else {
            obj = tu1Var;
        }
        int i17 = 256;
        if ((i & 384) == 0) {
            obj2 = oybVar;
            if (rv4Var.f(obj2)) {
                i14 = 256;
            } else {
                i14 = Token.CASE;
            }
            i3 |= i14;
        } else {
            obj2 = oybVar;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(null)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i3 |= i13;
        }
        if ((i & 24576) == 0) {
            obj3 = oybVar2;
            if (rv4Var.f(obj3)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i3 |= i12;
        } else {
            obj3 = oybVar2;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(lk0Var)) {
                i11 = 131072;
            } else {
                i11 = Parser.ARGC_LIMIT;
            }
            i3 |= i11;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i3 |= i10;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(mu4Var)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i3 |= i9;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var.c(f2)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i3 |= i8;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var.f(rh8Var)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i3 |= i7;
        }
        if ((i2 & 6) == 0) {
            if (rv4Var.f(qidVar)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i4 = i2 | i6;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(xfcVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i4 |= i5;
        }
        if ((i2 & 384) == 0) {
            obj4 = bgcVar;
            if (!rv4Var.f(obj4)) {
                i17 = Token.CASE;
            }
            i4 |= i17;
        } else {
            obj4 = bgcVar;
        }
        int i18 = i4;
        int i19 = i3;
        if ((i3 & 306783379) == 306783378 && (i18 & Token.EXPR_VOID) == 146) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i19 & 1, z)) {
            ((ax2) rv4Var.j(a)).a(new qma(nq7Var, obj, obj2, obj3, lu4Var, mu4Var, f2, rh8Var, qidVar, xfcVar, obj4), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: sv
                @Override // defpackage.lu4
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    vv.b(nq7.this, tu1Var, oybVar, oybVar2, lu4Var, mu4Var, f2, rh8Var, qidVar, xfcVar, bgcVar, (rv4) obj5, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void c(nq7 nq7Var, tu1 tu1Var, tu1 tu1Var2, float f2, qid qidVar, xfc xfcVar, rv4 rv4Var, int i) {
        boolean z;
        nq7 nq7Var2;
        float f3;
        qid qidVar2;
        xfc xfcVar2;
        xfc b2;
        ko6 ko6Var;
        float f4;
        kq7 kq7Var;
        tu1 tu1Var3 = hv1.c;
        rv4Var.g0(1784421840);
        int i2 = i | 13197360;
        if ((4793491 & i2) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                kq7Var = nq7Var;
                f4 = f2;
                ko6Var = qidVar;
                b2 = xfcVar;
            } else {
                float f5 = yfc.b;
                ko6 ko6Var2 = new ko6(bue.n(rv4Var), 15 | 16);
                b2 = yfc.b(((h27) rv4Var.j(j27.a)).a);
                ko6Var = ko6Var2;
                f4 = f5;
                kq7Var = kq7.a;
            }
            rv4Var.r();
            d(tu1Var3, kq7Var, tu1Var, tu1Var2, f4, ko6Var, b2, null, yfc.a, rv4Var, 113274294, 0);
            nq7Var2 = kq7Var;
            f3 = f4;
            qidVar2 = ko6Var;
            xfcVar2 = b2;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            f3 = f2;
            qidVar2 = qidVar;
            xfcVar2 = xfcVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jd(nq7Var2, tu1Var, tu1Var2, f3, qidVar2, xfcVar2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.tu1 r19, defpackage.nq7 r20, final defpackage.lu4 r21, defpackage.mu4 r22, float r23, final defpackage.qid r24, final defpackage.xfc r25, defpackage.bgc r26, defpackage.rh8 r27, defpackage.rv4 r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv.d(tu1, nq7, lu4, mu4, float, qid, xfc, bgc, rh8, rv4, int, int):void");
    }

    public static final void e(final nq7 nq7Var, final yi4 yi4Var, final long j, final long j2, final long j3, long j4, final tu1 tu1Var, final oyb oybVar, final oyb oybVar2, final vt4 vt4Var, final jz jzVar, final int i, final boolean z, final lu4 lu4Var, tu1 tu1Var2, final float f2, final rh8 rh8Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        tu1 tu1Var3;
        lh9 lh9Var;
        nq7 nq7Var2;
        boolean z2;
        final long j5 = j4;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(239553141);
        int i5 = i2 | (rv4Var.f(nq7Var) ? 4 : 2) | (rv4Var.f(yi4Var) ? 32 : 16);
        boolean e2 = rv4Var.e(j);
        int i6 = Token.CASE;
        int i7 = i5 | (e2 ? 256 : 128) | (rv4Var.e(j2) ? 2048 : 1024) | (rv4Var.e(j3) ? 16384 : 8192);
        boolean e3 = rv4Var.e(j5);
        int i8 = Parser.ARGC_LIMIT;
        int i9 = i7 | (e3 ? 131072 : 65536) | (rv4Var.h(tu1Var) ? 1048576 : 524288) | (rv4Var.f(oybVar) ? 8388608 : 4194304) | (rv4Var.h(null) ? 67108864 : 33554432) | (rv4Var.f(oybVar2) ? 536870912 : 268435456);
        if ((i3 & 6) == 0) {
            i4 = i3 | (rv4Var.h(vt4Var) ? 4 : 2);
        } else {
            i4 = i3;
        }
        if (rv4Var.f(lk0Var)) {
            i6 = 256;
        }
        int i10 = i4 | i6;
        if ((i3 & 3072) == 0) {
            i10 |= rv4Var.d(i) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i10 |= rv4Var.g(z) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            if (rv4Var.h(lu4Var)) {
                i8 = 131072;
            }
            i10 |= i8;
        }
        int i11 = i10 | (rv4Var.c(f2) ? 8388608 : 4194304);
        if ((i3 & 100663296) == 0) {
            i11 |= rv4Var.f(rh8Var) ? 67108864 : 33554432;
        }
        int i12 = i11;
        if (rv4Var.U(i9 & 1, ((i9 & 306783379) == 306783378 && (38347923 & i12) == 38347922) ? false : true)) {
            boolean z3 = ((i9 & Token.ASSIGN_MOD) == 32) | ((i12 & 896) == 256) | ((i12 & 7168) == 2048) | ((29360128 & i12) == 8388608);
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (z3 || P == lh9Var2) {
                agc agcVar = new agc(yi4Var, jzVar, i, f2, rh8Var);
                rv4Var.o0(agcVar);
                P = agcVar;
            }
            agc agcVar2 = (agc) P;
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
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, agcVar2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 o = bze.o(kq7Var, "navigationIcon");
            float f3 = e;
            nq7 C = zbe.C(o, f3, nae.e, nae.e, nae.e, 14);
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, C);
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
            ly1 ly1Var = r12.a;
            pye.a(ly1Var.a(new zl1(j)), lu4Var, rv4Var, ((i12 >> 12) & Token.ASSIGN_MOD) | 8);
            rv4Var.q(true);
            rv4Var.e0(408520308);
            nq7 A = zbe.A(bze.o(kq7Var, "title"), f3, nae.e, 2);
            if (z) {
                rv4Var.e0(-402453739);
                Object P2 = rv4Var.P();
                lh9Var = lh9Var2;
                if (P2 == lh9Var) {
                    P2 = new y4(20);
                    rv4Var.o0(P2);
                }
                nq7Var2 = y7a.b(kq7Var, (xt4) P2);
                rv4Var.q(false);
            } else {
                lh9Var = lh9Var2;
                rv4Var.e0(-402451802);
                rv4Var.q(false);
                nq7Var2 = kq7Var;
            }
            nq7 a0 = A.a0(nq7Var2);
            boolean z4 = (i12 & 14) == 4;
            Object P3 = rv4Var.P();
            if (z4 || P3 == lh9Var) {
                z2 = false;
                P3 = new nv(0, vt4Var);
                rv4Var.o0(P3);
            } else {
                z2 = false;
            }
            nq7 k = axe.k(a0, (xt4) P3);
            b37 d3 = fu0.d(nk0Var, z2);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, k);
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
            cbe.f(j2, oybVar, tu1Var, rv4Var, ((i9 >> 9) & 14) | ((i9 >> 18) & Token.ASSIGN_MOD) | ((i9 >> 12) & 896));
            rv4Var.q(true);
            rv4Var.q(false);
            nq7 C2 = zbe.C(bze.o(kq7Var, "actionIcons"), nae.e, nae.e, f3, nae.e, 11);
            b37 d4 = fu0.d(nk0Var, false);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, C2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d4);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            j5 = j4;
            tu1Var3 = tu1Var2;
            pye.a(ly1Var.a(new zl1(j5)), tu1Var3, rv4Var, 56);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            tu1Var3 = tu1Var2;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final tu1 tu1Var4 = tu1Var3;
            u.d = new lu4(yi4Var, j, j2, j3, j5, tu1Var, oybVar, oybVar2, vt4Var, jzVar, i, z, lu4Var, tu1Var4, f2, rh8Var, i2, i3) { // from class: ov
                public final /* synthetic */ tu1 C;
                public final /* synthetic */ oyb D;
                public final /* synthetic */ oyb E;
                public final /* synthetic */ vt4 F;
                public final /* synthetic */ jz G;
                public final /* synthetic */ int H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ lu4 J;
                public final /* synthetic */ tu1 K;
                public final /* synthetic */ float L;
                public final /* synthetic */ rh8 M;
                public final /* synthetic */ int N;
                public final /* synthetic */ yi4 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                {
                    this.N = i3;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p5 = xoe.p(1);
                    int p6 = xoe.p(this.N);
                    vv.e(nq7.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, this.L, this.M, (rv4) obj, p5, p6);
                    return pvc.a;
                }
            };
        }
    }

    public static final void f(final nq7 nq7Var, final tu1 tu1Var, final oyb oybVar, final float f2, final tu1 tu1Var2, final oyb oybVar2, final oyb oybVar3, final oyb oybVar4, final tu1 tu1Var3, final mu4 mu4Var, final float f3, final float f4, final ko6 ko6Var, final xfc xfcVar, final bgc bgcVar, rv4 rv4Var, final int i, final int i2) {
        int i3;
        Object obj;
        float f5;
        Object obj2;
        Object obj3;
        int i4;
        Object obj4;
        float f6;
        boolean z;
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
        int i16;
        int i17;
        lk0 lk0Var = kh5.I;
        rv4Var.g0(1092180406);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i3 = i17 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(tu1Var)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i3 |= i16;
        }
        if ((i & 384) == 0) {
            obj = oybVar;
            if (rv4Var.f(obj)) {
                i15 = 256;
            } else {
                i15 = Token.CASE;
            }
            i3 |= i15;
        } else {
            obj = oybVar;
        }
        int i18 = 2048;
        if ((i & 3072) == 0) {
            f5 = f2;
            if (rv4Var.c(f5)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i3 |= i14;
        } else {
            f5 = f2;
        }
        int i19 = 8192;
        if ((i & 24576) == 0) {
            obj2 = tu1Var2;
            if (rv4Var.h(obj2)) {
                i13 = 16384;
            } else {
                i13 = 8192;
            }
            i3 |= i13;
        } else {
            obj2 = tu1Var2;
        }
        int i20 = i & 196608;
        int i21 = Parser.ARGC_LIMIT;
        if (i20 == 0) {
            if (rv4Var.f(oybVar2)) {
                i12 = 131072;
            } else {
                i12 = 65536;
            }
            i3 |= i12;
        }
        int i22 = 524288;
        if ((i & 1572864) == 0) {
            if (rv4Var.h(null)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        int i23 = 4194304;
        if ((i & 12582912) == 0) {
            if (rv4Var.f(oybVar3)) {
                i10 = 8388608;
            } else {
                i10 = 4194304;
            }
            i3 |= i10;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var.h(null)) {
                i9 = 67108864;
            } else {
                i9 = 33554432;
            }
            i3 |= i9;
        }
        if ((805306368 & i) == 0) {
            obj3 = oybVar4;
            if (rv4Var.f(obj3)) {
                i8 = 536870912;
            } else {
                i8 = 268435456;
            }
            i3 |= i8;
        } else {
            obj3 = oybVar4;
        }
        if ((i2 & 6) == 0) {
            if (rv4Var.f(lk0Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i4 = i2 | i7;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(tu1Var3)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i4 |= i6;
        }
        if ((i2 & 384) == 0) {
            obj4 = mu4Var;
            if (rv4Var.h(obj4)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i4 |= i5;
        } else {
            obj4 = mu4Var;
        }
        if ((i2 & 3072) == 0) {
            f6 = f3;
            if (!rv4Var.c(f6)) {
                i18 = 1024;
            }
            i4 |= i18;
        } else {
            f6 = f3;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.c(f4)) {
                i19 = 16384;
            }
            i4 |= i19;
        }
        if ((i2 & 196608) == 0) {
            if (rv4Var.f(ko6Var)) {
                i21 = 131072;
            }
            i4 |= i21;
        }
        if ((i2 & 1572864) == 0) {
            if (rv4Var.f(xfcVar)) {
                i22 = 1048576;
            }
            i4 |= i22;
        }
        if ((i2 & 12582912) == 0) {
            if (rv4Var.f(bgcVar)) {
                i23 = 8388608;
            }
            i4 |= i23;
        }
        int i24 = i4;
        if ((i3 & 306783379) == 306783378 && (i24 & 4793491) == 4793490) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i3 & 1, z)) {
            ((sy2) rv4Var.j(b)).a(new crc(nq7Var, tu1Var, obj, f5, obj2, oybVar2, oybVar3, obj3, tu1Var3, obj4, f6, f4, ko6Var, xfcVar, bgcVar), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: tv
                @Override // defpackage.lu4
                public final Object invoke(Object obj5, Object obj6) {
                    ((Integer) obj6).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    vv.f(nq7.this, tu1Var, oybVar, f2, tu1Var2, oybVar2, oybVar3, oybVar4, tu1Var3, mu4Var, f3, f4, ko6Var, xfcVar, bgcVar, (rv4) obj5, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x008f, code lost:
        if (defpackage.ote.m(r11, r12, false, r4, r6) == r9) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0094  */
    /* JADX WARN: Type inference failed for: r14v6, types: [wl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(defpackage.cgc r10, float r11, defpackage.pq2 r12, defpackage.xr r13, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv.g(cgc, float, pq2, xr, n42):java.lang.Object");
    }

    public static final cgc h(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = cgc.e;
        boolean c2 = rv4Var.c(-3.4028235E38f) | rv4Var.c(nae.e) | rv4Var.c(nae.e);
        Object P = rv4Var.P();
        if (c2 || P == ax1.a) {
            P = new i(10);
            rv4Var.o0(P);
        }
        return (cgc) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 0);
    }
}
