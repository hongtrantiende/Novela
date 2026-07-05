package defpackage;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: i5a  reason: default package */
/* loaded from: classes.dex */
public final class i5a extends g5a {
    public final yx9 j;
    public final yx9 k;
    public final long l;

    public i5a(zg9 zg9Var, long j, long j2, long j3, long j4, long j5, List list, long j6, yx9 yx9Var, yx9 yx9Var2, long j7, long j8) {
        super(zg9Var, j, j2, j3, j5, list, j6, j7, j8);
        this.j = yx9Var;
        this.k = yx9Var2;
        this.l = j4;
    }

    @Override // defpackage.l5a
    public final zg9 a(tp9 tp9Var) {
        yx9 yx9Var = this.j;
        if (yx9Var != null) {
            vq4 vq4Var = tp9Var.a;
            return new zg9(0L, -1L, yx9Var.e(vq4Var.a, 0L, 0L, vq4Var.j));
        }
        return this.a;
    }

    @Override // defpackage.g5a
    public final long d(long j) {
        List list = this.f;
        if (list != null) {
            return list.size();
        }
        long j2 = this.l;
        if (j2 != -1) {
            return (j2 - this.d) + 1;
        }
        if (j == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j).multiply(BigInteger.valueOf(this.b));
        BigInteger multiply2 = BigInteger.valueOf(this.e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i = uk0.a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // defpackage.g5a
    public final zg9 h(rp9 rp9Var, long j) {
        long j2;
        List list = this.f;
        long j3 = this.d;
        if (list != null) {
            j2 = ((j5a) list.get((int) (j - j3))).a;
        } else {
            j2 = (j - j3) * this.e;
        }
        long j4 = j2;
        vq4 vq4Var = rp9Var.a;
        return new zg9(0L, -1L, this.k.e(vq4Var.a, j, j4, vq4Var.j));
    }
}
