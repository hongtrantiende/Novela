package defpackage;

import java.nio.ByteOrder;
import java.util.Collections;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bi4  reason: default package */
/* loaded from: classes.dex */
public final class bi4 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final s6f k;
    public final tb7 l;

    public bi4(byte[] bArr, int i) {
        ea1 ea1Var = new ea1(bArr, bArr.length);
        ea1Var.m(i * 8);
        this.a = ea1Var.g(16);
        this.b = ea1Var.g(16);
        this.c = ea1Var.g(24);
        this.d = ea1Var.g(24);
        int g = ea1Var.g(20);
        this.e = g;
        this.f = d(g);
        this.g = ea1Var.g(3) + 1;
        int g2 = ea1Var.g(5) + 1;
        this.h = g2;
        this.i = a(g2);
        this.j = ea1Var.i(36);
        this.k = null;
        this.l = null;
    }

    public static int a(int i) {
        if (i != 8) {
            if (i != 12) {
                if (i != 16) {
                    if (i != 20) {
                        if (i != 24) {
                            if (i != 32) {
                                return -1;
                            }
                            return 7;
                        }
                        return 6;
                    }
                    return 5;
                }
                return 4;
            }
            return 2;
        }
        return 1;
    }

    public static int d(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final vq4 c(byte[] bArr, tb7 tb7Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        tb7 tb7Var2 = this.l;
        if (tb7Var2 != null) {
            tb7Var = tb7Var2.b(tb7Var);
        }
        uq4 uq4Var = new uq4();
        uq4Var.n = lc7.p("audio/flac");
        uq4Var.o = i;
        uq4Var.F = this.g;
        uq4Var.G = this.e;
        String str = a2d.a;
        uq4Var.H = a2d.C(this.h, ByteOrder.LITTLE_ENDIAN);
        uq4Var.q = Collections.singletonList(bArr);
        uq4Var.k = tb7Var;
        return new vq4(uq4Var);
    }

    public bi4(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, s6f s6fVar, tb7 tb7Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = d(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = s6fVar;
        this.l = tb7Var;
    }
}
