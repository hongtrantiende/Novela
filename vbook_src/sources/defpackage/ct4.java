package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ct4  reason: default package */
/* loaded from: classes3.dex */
public final class ct4 extends jr4 {
    public static final e31 c;
    public final my0 b;

    static {
        e31 e31Var = e31.d;
        c = p40.m("0021F904");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [my0, java.lang.Object] */
    public ct4(bz0 bz0Var) {
        super(bz0Var);
        this.b = new Object();
    }

    public final boolean o(long j) {
        my0 my0Var = this.b;
        long j2 = my0Var.b;
        if (j2 >= j) {
            return true;
        }
        long j3 = j - j2;
        if (super.read(my0Var, j3) == j3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jr4, defpackage.osa
    public final long read(my0 my0Var, long j) {
        int i;
        long j2;
        long j3;
        o(j);
        my0 my0Var2 = this.b;
        long j4 = 0;
        if (my0Var2.b == 0) {
            if (j == 0) {
                return 0L;
            }
            return -1L;
        }
        long j5 = 0;
        while (true) {
            long j6 = -1;
            while (true) {
                e31 e31Var = c;
                j6 = this.b.V(e31Var.a[0], j6 + 1, Long.MAX_VALUE);
                i = (j6 > (-1L) ? 1 : (j6 == (-1L) ? 0 : -1));
                if (i != 0) {
                    j2 = j4;
                    if (o(e31Var.a.length) && my0Var2.j0(e31Var.e(), j6, e31Var)) {
                        break;
                    }
                    j4 = j2;
                } else {
                    j2 = j4;
                    break;
                }
            }
            if (i == 0) {
                break;
            }
            long read = my0Var2.read(my0Var, j6 + 4);
            if (read < j2) {
                read = j2;
            }
            j5 += read;
            if (o(5L) && my0Var2.S(4L) == 0 && (((my0Var2.S(2L) & 255) << 8) | (my0Var2.S(1L) & 255)) < 2) {
                my0Var.k1(my0Var2.S(j2));
                my0Var.k1(10);
                my0Var.k1(0);
                my0Var2.skip(3L);
            }
            j4 = 0;
        }
        if (j5 < j) {
            long read2 = my0Var2.read(my0Var, j - j5);
            j3 = 0;
            if (read2 < 0) {
                read2 = 0;
            }
            j5 += read2;
        } else {
            j3 = 0;
        }
        if (j5 == j3) {
            return -1L;
        }
        return j5;
    }
}
