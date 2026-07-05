package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vc  reason: default package */
/* loaded from: classes.dex */
public final class vc implements r94 {
    public static final int[] q = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final int[] r = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    public static final byte[] s;
    public static final byte[] t;
    public final n73 b;
    public boolean c;
    public long d;
    public int e;
    public int f;
    public int h;
    public long i;
    public t94 j;
    public fjc k;
    public fjc l;
    public m4a m;
    public boolean n;
    public long o;
    public boolean p;
    public final byte[] a = new byte[1];
    public int g = -1;

    static {
        String str = a2d.a;
        Charset charset = StandardCharsets.UTF_8;
        s = "#!AMR\n".getBytes(charset);
        t = "#!AMR-WB\n".getBytes(charset);
    }

    public vc() {
        n73 n73Var = new n73();
        this.b = n73Var;
        this.l = n73Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0131  */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r18, defpackage.fr2 r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vc.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        return h(s94Var);
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        long d;
        this.d = 0L;
        this.e = 0;
        this.f = 0;
        this.o = j2;
        m4a m4aVar = this.m;
        if (m4aVar instanceof yt5) {
            yt5 yt5Var = (yt5) m4aVar;
            tx6 tx6Var = yt5Var.b;
            if (tx6Var.b == 0) {
                d = -9223372036854775807L;
            } else {
                d = tx6Var.d(a2d.c(yt5Var.a, j));
            }
            this.i = d;
            if (Math.abs(this.o - d) < 20000) {
                return;
            }
            this.n = true;
            this.l = this.b;
        } else if (j != 0 && (m4aVar instanceof d02)) {
            d02 d02Var = (d02) m4aVar;
            this.i = (Math.max(0L, j - d02Var.b) * 8000000) / d02Var.e;
        } else {
            this.i = 0L;
        }
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.j = t94Var;
        fjc s2 = t94Var.s(0, 1);
        this.k = s2;
        this.l = s2;
        t94Var.m();
    }

    public final int g(s94 s94Var) {
        String str;
        boolean z;
        s94Var.p();
        byte[] bArr = this.a;
        s94Var.x(bArr, 0, 1);
        byte b = bArr[0];
        if ((b & 131) <= 0) {
            int i = (b >> 3) & 15;
            if (i >= 0 && i <= 15 && (((z = this.c) && (i < 10 || i > 13)) || (!z && (i < 12 || i > 14)))) {
                if (z) {
                    return r[i];
                }
                return q[i];
            }
            StringBuilder sb = new StringBuilder("Illegal AMR ");
            if (this.c) {
                str = "WB";
            } else {
                str = "NB";
            }
            sb.append(str);
            sb.append(" frame type ");
            sb.append(i);
            throw xm8.a(null, sb.toString());
        }
        throw xm8.a(null, "Invalid padding bits for frame header " + ((int) b));
    }

    public final boolean h(s94 s94Var) {
        s94Var.p();
        byte[] bArr = s;
        byte[] bArr2 = new byte[bArr.length];
        s94Var.x(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.c = false;
            s94Var.q(bArr.length);
            return true;
        }
        s94Var.p();
        byte[] bArr3 = t;
        byte[] bArr4 = new byte[bArr3.length];
        s94Var.x(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.c = true;
        s94Var.q(bArr3.length);
        return true;
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
