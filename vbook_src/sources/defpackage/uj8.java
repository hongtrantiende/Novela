package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uj8  reason: default package */
/* loaded from: classes.dex */
public abstract class uj8 {
    public static final tj8 a;
    public static final ij8 b;

    static {
        tj8 tj8Var = new tj8(0);
        a = tj8Var;
        b = new ij8(0, 0, 0, ff8.b, 0, 0, 0, ox9.I, new sg6(3), k27.a(gs3.a), tj8Var, y02.b(0, 0, 0, 0, 15));
    }

    public static final long a(ij8 ij8Var, int i) {
        long i2;
        int i3 = ij8Var.c;
        long j = (((i * (ij8Var.b + i3)) + (-ij8Var.f)) + ij8Var.d) - i3;
        if (ij8Var.e == ff8.b) {
            i2 = ij8Var.i() >> 32;
        } else {
            i2 = ij8Var.i() & 4294967295L;
        }
        int i4 = (int) i2;
        long n = j - (i4 - dce.n(ij8Var.n.a(i - 1, i), 0, i4));
        if (n < 0) {
            return 0L;
        }
        return n;
    }

    public static final iw2 b(int i, vt4 vt4Var, rv4 rv4Var, int i2, int i3) {
        boolean z;
        boolean z2 = true;
        if ((i3 & 1) != 0) {
            i = 0;
        }
        Object[] objArr = new Object[0];
        yy9 yy9Var = iw2.H;
        if ((((i2 & 14) ^ 6) > 4 && rv4Var.d(i)) || (i2 & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        boolean c = z | rv4Var.c(nae.e);
        if ((((i2 & 896) ^ 384) <= 256 || !rv4Var.f(vt4Var)) && (i2 & 384) != 256) {
            z2 = false;
        }
        boolean z3 = c | z2;
        Object P = rv4Var.P();
        if (z3 || P == ax1.a) {
            P = new t93(i, vt4Var, 4);
            rv4Var.o0(P);
        }
        iw2 iw2Var = (iw2) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 0);
        iw2Var.G.setValue(vt4Var);
        return iw2Var;
    }
}
