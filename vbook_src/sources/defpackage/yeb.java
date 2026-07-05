package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yeb  reason: default package */
/* loaded from: classes3.dex */
public final class yeb implements AutoCloseable {
    public final m97 a;
    public final byte[] b;
    public long c = 0;

    public yeb(m97 m97Var) {
        this.a = m97Var;
        this.b = (byte[]) m97Var.b;
    }

    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = this.c;
        b50 b50Var = (b50) this.a.c;
        int i3 = 0;
        if (j >= 0) {
            int i4 = (int) j;
            if (0 <= j) {
                int i5 = b50Var.b;
                if (j < i5) {
                    i3 = Math.max(Math.min(i5, i2 + i4) - i4, 0);
                    que.l(i4, i, i3, (byte[]) b50Var.c, bArr);
                }
            }
            this.c += i3;
            return i3;
        }
        vs.m(hl5.k(j, "Invalid position "));
        return 0;
    }

    public final String toString() {
        return "SyncStream(" + this.a + ", " + this.c + ')';
    }

    public final void write(byte[] bArr, int i, int i2) {
        bArr.getClass();
        long j = this.c;
        if (j >= 0) {
            b50 b50Var = (b50) this.a.c;
            long j2 = i2;
            int max = Math.max(b50Var.b, (int) (j + j2));
            int i3 = b50Var.b;
            b50Var.c(max);
            b50Var.b = max;
            if (max > i3) {
                byte[] bArr2 = (byte[]) b50Var.c;
                bArr2.getClass();
                Arrays.fill(bArr2, i3, max, (byte) 0);
            }
            que.l(i, (int) j, i2, bArr, (byte[]) b50Var.c);
            this.c += j2;
            return;
        }
        vs.m(hl5.k(j, "Invalid position "));
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
