package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g97  reason: default package */
/* loaded from: classes3.dex */
public final class g97 extends w20 {
    public b50 a;

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        return pvc.a;
    }

    @Override // defpackage.w20, defpackage.e10
    public final Object e(n42 n42Var) {
        return new Long(this.a.b);
    }

    @Override // defpackage.w20
    public final Object i(long j, byte[] bArr, int i, int i2, m42 m42Var) {
        b50 b50Var = this.a;
        if (j >= 0) {
            if (0 <= j) {
                long j2 = b50Var.b;
                if (j < j2) {
                    int max = Math.max((int) (Math.min(j2, i2 + j) - j), 0);
                    que.l((int) j, i, max, (byte[]) b50Var.c, bArr);
                    return new Integer(max);
                }
            }
            return new Integer(0);
        }
        vs.m(hl5.k(j, "Invalid position "));
        return null;
    }

    @Override // defpackage.w20
    public final Object j(long j, byte[] bArr, int i, int i2, m42 m42Var) {
        if (j >= 0) {
            b50 b50Var = this.a;
            int max = Math.max(b50Var.b, (int) (i2 + j));
            int i3 = b50Var.b;
            b50Var.c(max);
            b50Var.b = max;
            if (max > i3) {
                byte[] bArr2 = (byte[]) b50Var.c;
                bArr2.getClass();
                Arrays.fill(bArr2, i3, max, (byte) 0);
            }
            que.l(i, (int) j, i2, bArr, (byte[]) b50Var.c);
            return pvc.a;
        }
        vs.m(hl5.k(j, "Invalid position "));
        return null;
    }

    public final String toString() {
        return hl5.p(new StringBuilder("MemoryAsyncStreamBase("), this.a.b, ')');
    }
}
