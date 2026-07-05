package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hw2  reason: default package */
/* loaded from: classes.dex */
public final class hw2 implements u08 {
    public final rj8 a;
    public final ff8 b;

    public hw2(rj8 rj8Var, ff8 ff8Var) {
        this.a = rj8Var;
        this.b = ff8Var;
    }

    @Override // defpackage.u08
    public final long i1(long j, long j2, int i) {
        long j3;
        if (i == 2) {
            if (this.b == ff8.b) {
                j3 = j2 >> 32;
            } else {
                j3 = 4294967295L & j2;
            }
            if (Float.intBitsToFloat((int) j3) != nae.e) {
                throw new CancellationException("Scroll cancelled");
            }
            return 0L;
        }
        return 0L;
    }

    @Override // defpackage.u08
    public final Object l1(long j, long j2, m42 m42Var) {
        long a;
        if (this.b == ff8.a) {
            a = z4d.a(j2, nae.e, nae.e, 2);
        } else {
            a = z4d.a(j2, nae.e, nae.e, 1);
        }
        return new z4d(a);
    }

    @Override // defpackage.u08
    public final long u0(int i, long j) {
        long j2;
        long j3;
        float intBitsToFloat;
        if (i == 1) {
            rj8 rj8Var = this.a;
            if (Math.abs(rj8Var.l()) > 1.0E-6d) {
                ff8 ff8Var = this.b;
                ff8 ff8Var2 = ff8.b;
                if (ff8Var == ff8Var2) {
                    j2 = j >> 32;
                } else {
                    j2 = j & 4294967295L;
                }
                if (Math.abs(Float.intBitsToFloat((int) j2)) > nae.e) {
                    ij8 m = rj8Var.m();
                    float l = rj8Var.l() * rj8Var.o();
                    float f = ((m.b + m.c) * (-Math.signum(rj8Var.l()))) + l;
                    if (rj8Var.l() > nae.e) {
                        l = f;
                        f = l;
                    }
                    if (ff8Var == ff8Var2) {
                        j3 = j >> 32;
                    } else {
                        j3 = j & 4294967295L;
                    }
                    float f2 = -rj8Var.k.d(-dce.m(Float.intBitsToFloat((int) j3), l, f));
                    if (ff8Var == ff8Var2) {
                        intBitsToFloat = f2;
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    }
                    if (ff8Var != ff8.a) {
                        f2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    }
                    return y78.a(intBitsToFloat, f2);
                }
                return 0L;
            }
            return 0L;
        }
        return 0L;
    }
}
