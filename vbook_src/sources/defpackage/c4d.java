package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c4d  reason: default package */
/* loaded from: classes.dex */
public final class c4d {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};
    public final byte[] a;
    public int b;
    public int c;

    public c4d(int i) {
        switch (i) {
            case 1:
                this.a = new byte[32768];
                this.b = 32767;
                return;
            default:
                this.a = new byte[8];
                return;
        }
    }

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public void b(int i) {
        int i2 = this.c;
        this.a[i2] = (byte) i;
        this.c = this.b & (i2 + 1);
    }

    public long c(s94 s94Var, boolean z, boolean z2, int i) {
        int i2;
        int i3 = this.b;
        byte[] bArr = this.a;
        if (i3 == 0) {
            if (!s94Var.a(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 < 8) {
                    if ((d[i5] & i4) != 0) {
                        i2 = i5 + 1;
                        break;
                    }
                    i5++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.c = i2;
            if (i2 != -1) {
                this.b = 1;
            } else {
                vs.k("No valid varint length mask found");
                return 0L;
            }
        }
        int i6 = this.c;
        if (i6 > i) {
            this.b = 0;
            return -2L;
        }
        if (i6 != 1) {
            s94Var.readFully(bArr, 1, i6 - 1);
        }
        this.b = 0;
        return a(bArr, this.c, z2);
    }
}
