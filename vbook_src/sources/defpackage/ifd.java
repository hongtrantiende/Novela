package defpackage;

import java.math.RoundingMode;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ifd  reason: default package */
/* loaded from: classes.dex */
public final class ifd implements jfd {
    public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
    public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, Token.ASSIGN_URSH, Token.AND, 130, Token.BLOCK, Token.DOTDOT, Token.WITHEXPR, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};
    public final t94 a;
    public final fjc b;
    public final lm8 c;
    public final int d;
    public final byte[] e;
    public final km8 f;
    public final int g;
    public final vq4 h;
    public int i;
    public long j;
    public int k;
    public long l;

    public ifd(t94 t94Var, fjc fjcVar, lm8 lm8Var) {
        this.a = t94Var;
        this.b = fjcVar;
        this.c = lm8Var;
        int i = lm8Var.b;
        int max = Math.max(1, i / 10);
        this.g = max;
        km8 km8Var = new km8(lm8Var.e);
        km8Var.s();
        int s = km8Var.s();
        this.d = s;
        int i2 = lm8Var.a;
        int i3 = lm8Var.c;
        int i4 = (((i3 - (i2 * 4)) * 8) / (lm8Var.d * i2)) + 1;
        if (s == i4) {
            int g = a2d.g(max, s);
            this.e = new byte[g * i3];
            this.f = new km8(s * 2 * i2 * g);
            int i5 = ((i3 * i) * 8) / s;
            uq4 uq4Var = new uq4();
            uq4Var.n = lc7.p("audio/raw");
            uq4Var.h = i5;
            uq4Var.i = i5;
            uq4Var.o = max * 2 * i2;
            uq4Var.F = i2;
            uq4Var.G = i;
            uq4Var.H = 2;
            this.h = new vq4(uq4Var);
            return;
        }
        throw xm8.a(null, "Expected frames per block: " + i4 + "; got: " + s);
    }

    @Override // defpackage.jfd
    public final void a(long j) {
        this.i = 0;
        this.j = j;
        this.k = 0;
        this.l = 0L;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:43:0x0045->B:14:0x0045 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please submit an issue!!! */
    @Override // defpackage.jfd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.s94 r25, long r26) {
        /*
            Method dump skipped, instructions count: 327
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifd.b(s94, long):boolean");
    }

    @Override // defpackage.jfd
    public final void c(int i, long j) {
        mfd mfdVar = new mfd(this.c, this.d, i, j);
        this.a.v(mfdVar);
        vq4 vq4Var = this.h;
        fjc fjcVar = this.b;
        fjcVar.g(vq4Var);
        fjcVar.d(mfdVar.e);
    }

    public final void d(int i) {
        long j = this.j;
        long j2 = this.l;
        lm8 lm8Var = this.c;
        long j3 = lm8Var.b;
        String str = a2d.a;
        long Y = j + a2d.Y(j2, 1000000L, j3, RoundingMode.DOWN);
        int i2 = i * 2 * lm8Var.a;
        this.b.a(Y, 1, i2, this.k - i2, null);
        this.l += i;
        this.k -= i2;
    }
}
