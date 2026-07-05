package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xb  reason: default package */
/* loaded from: classes3.dex */
public abstract class xb {
    public static final th8 a = new th8(12.0f, 12.0f, 12.0f, 12.0f);
    public static final th8 b;
    public static final float c;
    public static final float d;

    static {
        zbe.j(nae.e, nae.e, nae.e, 16.0f, 7);
        b = zbe.j(12.0f, nae.e, 12.0f, 12.0f, 2);
        zbe.j(nae.e, nae.e, nae.e, 24.0f, 7);
        c = 8.0f;
        d = 12.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:241:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(final boolean r47, final defpackage.xt4 r48, defpackage.lu4 r49, defpackage.nq7 r50, defpackage.nq7 r51, defpackage.lu4 r52, final defpackage.lu4 r53, defpackage.wea r54, long r55, long r57, float r59, defpackage.eu3 r60, defpackage.lz3 r61, defpackage.dc r62, boolean r63, boolean r64, final defpackage.tu1 r65, defpackage.rv4 r66, final int r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb.a(boolean, xt4, lu4, nq7, nq7, lu4, lu4, wea, long, long, float, eu3, lz3, dc, boolean, boolean, tu1, rv4, int, int, int):void");
    }

    public static final void b(final tu1 tu1Var, final nq7 nq7Var, final lu4 lu4Var, final tu1 tu1Var2, final wea weaVar, final long j, final float f, final long j2, final long j3, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        weaVar.getClass();
        rv4Var.g0(-1732646527);
        if (rv4Var.f(nq7Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i10 = i | i2;
        if (rv4Var.h(lu4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i11 = i10 | i3;
        if (rv4Var.h(tu1Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i12 = i11 | i4;
        if (rv4Var.f(weaVar)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i13 = i12 | i5;
        if (rv4Var.e(j)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i6;
        if (rv4Var.c(f)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i15 = i14 | i7;
        if (rv4Var.e(j2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i16 = i15 | i8;
        if (rv4Var.e(j3)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i17 = i16 | i9;
        if ((38347923 & i17) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i17 & 1, z)) {
            int i18 = i17 >> 9;
            v9b.a(nq7Var, weaVar, j, 0L, f, nae.e, null, jce.E(1432077404, new rb(lu4Var, tu1Var2, j3, j2, tu1Var), rv4Var), rv4Var, ((i17 >> 3) & 14) | 12582912 | (i18 & Token.ASSIGN_MOD) | (i18 & 896) | ((i17 >> 6) & 57344), Token.ASSIGN_LOGICAL_AND);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(nq7Var, lu4Var, tu1Var2, weaVar, j, f, j2, j3, i) { // from class: sb
                public final /* synthetic */ float C;
                public final /* synthetic */ long D;
                public final /* synthetic */ long E;
                public final /* synthetic */ nq7 b;
                public final /* synthetic */ lu4 c;
                public final /* synthetic */ tu1 d;
                public final /* synthetic */ wea e;
                public final /* synthetic */ long f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(7);
                    xb.b(tu1.this, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    public static final void c(final float f, final float f2, final tu1 tu1Var, rv4 rv4Var, final int i) {
        boolean z;
        rv4Var.g0(-864266297);
        if ((i & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = new wb(f, f2);
                rv4Var.o0(P);
            }
            b37 b37Var = (b37) P;
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, kq7.a);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, b37Var);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var.invoke(rv4Var, 6);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(f, f2, tu1Var, i) { // from class: ub
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ tu1 c;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(439);
                    xb.c(this.a, this.b, this.c, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final boolean r27, final defpackage.xt4 r28, defpackage.lu4 r29, defpackage.nq7 r30, defpackage.nq7 r31, defpackage.lu4 r32, defpackage.lu4 r33, defpackage.wea r34, long r35, long r37, float r39, boolean r40, boolean r41, final defpackage.tu1 r42, defpackage.rv4 r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xb.d(boolean, xt4, lu4, nq7, nq7, lu4, lu4, wea, long, long, float, boolean, boolean, tu1, rv4, int, int):void");
    }

    public static final void e(long j, oyb oybVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        int i4;
        oybVar.getClass();
        rv4Var.g0(-978489465);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.f(oybVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i & 384) == 0) {
            if (rv4Var.h(tu1Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i6 |= i4;
        }
        if ((i6 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            ly1 ly1Var = cvb.a;
            pye.b(new i99[]{r12.a.a(new zl1(j)), ly1Var.a(((oyb) rv4Var.j(ly1Var)).e(oybVar))}, tu1Var, rv4Var, (i6 >> 3) & Token.ASSIGN_MOD);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new mb(j, oybVar, tu1Var, i);
        }
    }
}
