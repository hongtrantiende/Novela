package defpackage;

import java.nio.ByteOrder;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xh4  reason: default package */
/* loaded from: classes.dex */
public final class xh4 implements bl0 {
    public final bi4 a;
    public final int b;
    public final fr2 c = new Object();

    /* JADX WARN: Type inference failed for: r1v1, types: [fr2, java.lang.Object] */
    public xh4(bi4 bi4Var, int i) {
        this.a = bi4Var;
        this.b = i;
    }

    @Override // defpackage.bl0
    public final al0 a(s94 s94Var, long j) {
        long position = s94Var.getPosition();
        long b = b(s94Var);
        long h = s94Var.h();
        s94Var.i(Math.max(6, this.a.c));
        long b2 = b(s94Var);
        long h2 = s94Var.h();
        if (b <= j && b2 > j) {
            return new al0(-9223372036854775807L, h, 0);
        }
        if (b2 <= j) {
            return new al0(b2, h2, -2);
        }
        return new al0(b, position, -1);
    }

    public final long b(s94 s94Var) {
        fr2 fr2Var;
        bi4 bi4Var;
        int n;
        while (true) {
            int i = (s94Var.h() > (s94Var.getLength() - 6) ? 1 : (s94Var.h() == (s94Var.getLength() - 6) ? 0 : -1));
            fr2Var = this.c;
            bi4Var = this.a;
            if (i >= 0) {
                break;
            }
            long h = s94Var.h();
            km8 km8Var = new km8(17);
            int i2 = 0;
            boolean t = false;
            s94Var.x(km8Var.a, 0, 2);
            char g = km8Var.g(0, ByteOrder.BIG_ENDIAN);
            int i3 = this.b;
            if (g != i3) {
                s94Var.p();
                s94Var.i((int) (h - s94Var.getPosition()));
            } else {
                byte[] bArr = km8Var.a;
                while (i2 < 15 && (n = s94Var.n(bArr, 2 + i2, 15 - i2)) != -1) {
                    i2 += n;
                }
                km8Var.L(i2 + 2);
                s94Var.p();
                s94Var.i((int) (h - s94Var.getPosition()));
                t = z87.t(km8Var, bi4Var, i3, fr2Var);
            }
            if (t) {
                break;
            }
            s94Var.i(1);
        }
        if (s94Var.h() >= s94Var.getLength() - 6) {
            s94Var.i((int) (s94Var.getLength() - s94Var.h()));
            return bi4Var.j;
        }
        return fr2Var.a;
    }
}
