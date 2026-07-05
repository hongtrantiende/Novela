package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f2f  reason: default package */
/* loaded from: classes.dex */
public final class f2f {
    public static final f2f b;
    public final ws5 a;

    static {
        int i = ws5.f;
        b = new f2f(um9.D);
    }

    public f2f(ws5 ws5Var) {
        this.a = ws5Var;
    }

    public static f2f a(dcc dccVar) {
        String str;
        long j;
        e2f e2fVar;
        int M = dccVar.M();
        if (M >= 0) {
            int i = ws5.f;
            vs5 vs5Var = new vs5();
            long j2 = 0;
            for (int i2 = 0; i2 < M; i2++) {
                long N = dccVar.N();
                int i3 = (int) N;
                long j3 = N >>> 3;
                if (j3 == 0) {
                    j = 0;
                    str = dccVar.C();
                } else {
                    long j4 = j3 + j2;
                    if (j4 <= 2305843009213693951L) {
                        str = null;
                        j = j4;
                    } else {
                        hfd.s("Flag name larger than max size");
                        return null;
                    }
                }
                int i4 = i3 & 7;
                if (i4 != 0 && i4 != 1) {
                    if (i4 != 2) {
                        if (i4 != 3) {
                            if (i4 != 4) {
                                if (i4 == 5) {
                                    e2fVar = new e2f(j, str, i4, 0L, dccVar.F());
                                } else {
                                    hfd.s(nk2.s(i4, "Unrecognized flag type ", new StringBuilder(String.valueOf(i4).length() + 23)));
                                    return null;
                                }
                            } else {
                                e2fVar = new e2f(j, str, i4, 0L, dccVar.C());
                            }
                        } else {
                            e2fVar = new e2f(j, str, i4, Double.doubleToRawLongBits(dccVar.u()), null);
                        }
                    } else {
                        e2fVar = new e2f(j, str, i4, dccVar.N(), null);
                    }
                } else {
                    e2fVar = new e2f(j, str, i4, 0L, null);
                }
                long j5 = e2fVar.a;
                if (j5 != 0) {
                    j2 = j5;
                }
                vs5Var.b(e2fVar);
            }
            return new f2f(vs5Var.h());
        }
        hfd.s("Negative number of flags");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof f2f) {
            return this.a.equals(((f2f) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        ws5 ws5Var = this.a;
        ws5Var.getClass();
        return hif.p(ws5Var);
    }
}
