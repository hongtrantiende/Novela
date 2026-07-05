package defpackage;

import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cvb  reason: default package */
/* loaded from: classes.dex */
public abstract class cvb {
    public static final ly1 a = new ly1(new ekb(23));

    public static final void a(oyb oybVar, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        rv4Var.g0(15327438);
        if (rv4Var.f(oybVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.h(tu1Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            ly1 ly1Var = a;
            pye.a(ly1Var.a(((oyb) rv4Var.j(ly1Var)).e(oybVar)), tu1Var, rv4Var, (i5 & Token.ASSIGN_MOD) | 8);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new f58(oybVar, tu1Var, i, 19);
        }
    }

    public static final void b(final String str, nq7 nq7Var, final long j, long j2, long j3, long j4, int i, boolean z, int i2, int i3, oyb oybVar, rv4 rv4Var, final int i4) {
        int i5;
        int i6;
        boolean z2;
        final nq7 nq7Var2;
        final long j5;
        final long j6;
        final long j7;
        final int i7;
        final boolean z3;
        final int i8;
        final int i9;
        final oyb oybVar2;
        nq7 nq7Var3;
        oyb oybVar3;
        int i10;
        boolean z4;
        int i11;
        long j8;
        long j9;
        int i12;
        long j10;
        rv4Var.g0(-2055108902);
        if (rv4Var.f(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5 | 48;
        if (rv4Var.e(j)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i14 = i13 | i6 | 920349696;
        if ((306783379 & i14) == 306783378) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i14 & 1, z2)) {
            rv4Var.Z();
            if ((i4 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                nq7Var3 = nq7Var;
                j8 = j2;
                j10 = j3;
                j9 = j4;
                i10 = i;
                z4 = z;
                i12 = i2;
                i11 = i3;
                oybVar3 = oybVar;
            } else {
                long j11 = e4c.c;
                nq7Var3 = kq7.a;
                oybVar3 = (oyb) rv4Var.j(a);
                i10 = 1;
                z4 = true;
                i11 = 1;
                j8 = j11;
                j9 = j8;
                i12 = Integer.MAX_VALUE;
                j10 = j9;
            }
            rv4Var.r();
            int i15 = (i14 & 896) | (i14 & 14) | 3120 | 920346624;
            nq7 nq7Var4 = nq7Var3;
            c(str, nq7Var4, j, null, j8, null, null, null, j10, null, null, j9, i10, z4, i12, i11, null, oybVar3, rv4Var, i15, 1797558, 0);
            nq7Var2 = nq7Var4;
            j5 = j8;
            j6 = j10;
            j7 = j9;
            i7 = i10;
            z3 = z4;
            i8 = i12;
            i9 = i11;
            oybVar2 = oybVar3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            j5 = j2;
            j6 = j3;
            j7 = j4;
            i7 = i;
            z3 = z;
            i8 = i2;
            i9 = i3;
            oybVar2 = oybVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(str, nq7Var2, j, j5, j6, j7, i7, z3, i8, i9, oybVar2, i4) { // from class: avb
                public final /* synthetic */ int C;
                public final /* synthetic */ boolean D;
                public final /* synthetic */ int E;
                public final /* synthetic */ int F;
                public final /* synthetic */ oyb G;
                public final /* synthetic */ String a;
                public final /* synthetic */ nq7 b;
                public final /* synthetic */ long c;
                public final /* synthetic */ long d;
                public final /* synthetic */ long e;
                public final /* synthetic */ long f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    cvb.b(this.a, this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:270:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d  */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r56v1, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final java.lang.String r44, defpackage.nq7 r45, long r46, defpackage.qa0 r48, long r49, defpackage.wp4 r51, defpackage.dq4 r52, defpackage.eo4 r53, long r54, defpackage.gpb r56, defpackage.tlb r57, long r58, int r60, boolean r61, int r62, int r63, defpackage.xt4 r64, defpackage.oyb r65, defpackage.rv4 r66, final int r67, final int r68, final int r69) {
        /*
            Method dump skipped, instructions count: 1020
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvb.c(java.lang.String, nq7, long, qa0, long, wp4, dq4, eo4, long, gpb, tlb, long, int, boolean, int, int, xt4, oyb, rv4, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0129  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final defpackage.ps r50, defpackage.nq7 r51, long r52, long r54, long r56, defpackage.tlb r58, long r59, int r61, boolean r62, int r63, int r64, java.util.Map r65, defpackage.xt4 r66, final defpackage.oyb r67, defpackage.rv4 r68, final int r69, final int r70, final int r71) {
        /*
            Method dump skipped, instructions count: 881
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cvb.d(ps, nq7, long, long, long, tlb, long, int, boolean, int, int, java.util.Map, xt4, oyb, rv4, int, int, int):void");
    }
}
