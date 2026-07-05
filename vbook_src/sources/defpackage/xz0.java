package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xz0  reason: default package */
/* loaded from: classes.dex */
public abstract class xz0 {
    public static final th8 a;
    public static final th8 b;
    public static final float c;

    static {
        float f = nye.f;
        float f2 = nye.g;
        a = new th8(f, 8.0f, f2, 8.0f);
        zbe.i(16.0f, 8.0f, f2, 8.0f);
        b = new th8(12.0f, 8.0f, 12.0f, 8.0f);
        zbe.i(12.0f, 8.0f, 16.0f, 8.0f);
        c = 58.0f;
    }

    public static wz0 a(long j, long j2, long j3, long j4, rv4 rv4Var, int i) {
        long j5;
        long j6;
        if ((i & 4) != 0) {
            j5 = zl1.i;
        } else {
            j5 = j3;
        }
        if ((i & 8) != 0) {
            j6 = zl1.i;
        } else {
            j6 = j4;
        }
        return b(((h27) rv4Var.j(j27.a)).a).a(j, j2, j5, j6);
    }

    public static wz0 b(pm1 pm1Var) {
        wz0 wz0Var = pm1Var.W;
        if (wz0Var == null) {
            wz0 wz0Var2 = new wz0(rm1.d(pm1Var, xve.b), rm1.d(pm1Var, xve.h), zl1.b(xve.d, rm1.d(pm1Var, xve.c)), zl1.b(xve.f, rm1.d(pm1Var, xve.e)));
            pm1Var.W = wz0Var2;
            return wz0Var2;
        }
        return wz0Var;
    }

    public static wz0 c(pm1 pm1Var) {
        wz0 wz0Var = pm1Var.Z;
        if (wz0Var == null) {
            long j = zl1.h;
            wz0 wz0Var2 = new wz0(j, rm1.d(pm1Var, qm1.E), j, zl1.b(zxe.f, rm1.d(pm1Var, zxe.e)));
            pm1Var.Z = wz0Var2;
            return wz0Var2;
        }
        return wz0Var;
    }
}
