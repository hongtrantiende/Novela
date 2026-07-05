package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cpa  reason: default package */
/* loaded from: classes3.dex */
public final class cpa extends w20 {
    public final w20 a;
    public final long b;
    public final long c;
    public final long d;

    public cpa(w20 w20Var, long j, long j2) {
        w20Var.getClass();
        this.a = w20Var;
        this.b = j;
        this.c = j2;
        this.d = j2 - j;
    }

    @Override // defpackage.y00
    public final Object a(n42 n42Var) {
        return pvc.a;
    }

    @Override // defpackage.w20, defpackage.e10
    public final Object e(n42 n42Var) {
        return new Long(this.d);
    }

    @Override // defpackage.w20
    public final Object i(long j, byte[] bArr, int i, int i2, m42 m42Var) {
        yk8 k = k(i2, j);
        return this.a.i(((Number) k.a).longValue(), bArr, i, ((Number) k.b).intValue(), m42Var);
    }

    @Override // defpackage.w20
    public final Object j(long j, byte[] bArr, int i, int i2, m42 m42Var) {
        yk8 k = k(i2, j);
        Object j2 = this.a.j(((Number) k.a).longValue(), bArr, i, ((Number) k.b).intValue(), m42Var);
        if (j2 == n82.a) {
            return j2;
        }
        return pvc.a;
    }

    public final yk8 k(int i, long j) {
        if (j >= 0) {
            long j2 = this.b;
            long o = dce.o(j2 + j, j2, this.c);
            return new yk8(Long.valueOf(o), Integer.valueOf((int) (dce.o(o + i, this.b, this.c) - o)));
        }
        vs.m("Invalid position");
        return null;
    }

    public final String toString() {
        return "SliceAsyncStreamBase(" + this.a + ", " + this.b + ", " + this.c + ')';
    }
}
