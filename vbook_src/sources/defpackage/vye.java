package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vye  reason: default package */
/* loaded from: classes.dex */
public abstract class vye {
    public static final tu1 a = new tu1(new kv1(11), false, -531080502);
    public static final tu1 b = new tu1(new kv1(12), false, 117146955);
    public static final tu1 c = new tu1(new lv1(12), false, -407403269);
    public static final tu1 d = new tu1(new kv1(13), false, -872621269);
    public static final tu1 e = new tu1(new lv1(13), false, -1918224689);
    public static final tu1 f = new tu1(new lv1(14), false, 2122186118);
    public static final p5 g = new p5("android.widget.extra.CHECKED");
    public static Boolean h;

    /* JADX WARN: Code restructure failed: missing block: B:67:0x01a1, code lost:
        if (r2 == r0) goto L70;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.rh8 r30, defpackage.wb6 r31, defpackage.nq7 r32, defpackage.xt4 r33, defpackage.rv4 r34, int r35) {
        /*
            Method dump skipped, instructions count: 597
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vye.a(rh8, wb6, nq7, xt4, rv4, int):void");
    }

    public static final void b(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(278819647);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                xb6 xb6Var = (xb6) ((fdd) voe.z(cm9.a(xb6.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                rv4Var2 = rv4Var;
                fxe.h(yqe.A((y3b) x2b.I.getValue(), rv4Var), null, false, jce.E(2106212027, new h64(cz7Var, 10), rv4Var), null, null, jce.E(-73927094, new u32(3, xb6Var, jsc.z(xb6Var.d, rv4Var)), rv4Var), rv4Var2, 1575936, 54);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new h64(cz7Var, i, 11);
        }
    }

    public static void c(Parcel parcel, List list) {
        if (list == null) {
            parcel.writeInt(-1);
            return;
        }
        int size = list.size();
        parcel.writeInt(size);
        for (int i = 0; i < size; i++) {
            parcel.writeTypedObject((Parcelable) list.get(i), 1);
        }
    }

    public static final float d(long j, long j2) {
        return Math.min(Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L)));
    }

    public static final akc e(long j, long j2, y22 y22Var, ok0 ok0Var, boolean z) {
        y22Var.getClass();
        ok0Var.getClass();
        if (!eh.q(j) && !eh.q(j2)) {
            return (akc) ((mfb) new li0(j, j2, y22Var, ok0Var, !z).n).getValue();
        }
        akc akcVar = akc.f;
        return akc.f;
    }

    public static final sk9 f(long j, long j2, y22 y22Var, ok0 ok0Var, boolean z) {
        y22Var.getClass();
        ok0Var.getClass();
        if (!eh.q(j) && !eh.q(j2)) {
            return (sk9) ((mfb) new li0(j, j2, y22Var, ok0Var, !z).m).getValue();
        }
        return sk9.e;
    }

    public static final long g(long j, long j2) {
        long D = eh.D(j2);
        long b2 = mue.b(mna.b(D) / 2.0f, mna.a(D) / 2.0f);
        float b3 = z78.b(b2);
        int i = az5.c;
        return ekc.a(b3 / ((int) (j >> 32)), z78.c(b2) / ((int) (j & 4294967295L)));
    }

    public static final sk9 h(long j, long j2, y22 y22Var, ok0 ok0Var, boolean z, float f2, long j3) {
        y22Var.getClass();
        ok0Var.getClass();
        if (!eh.q(j) && !eh.q(j2)) {
            long b2 = mue.b(z78.b(j3) * (-1.0f), z78.c(j3) * (-1.0f));
            long D = eh.D(j);
            float b3 = z78.b(b2);
            float c2 = z78.c(b2);
            float b4 = z78.b(b2);
            float c3 = z78.c(b2);
            float f3 = b3 / f2;
            float f4 = c2 / f2;
            float b5 = (mna.b(D) + b4) / f2;
            float a2 = (mna.a(D) + c3) / f2;
            long y = eh.y(0, j2);
            sk9 f5 = f(j, y, y22Var, ok0Var, z);
            f5.getClass();
            float f6 = f5.a;
            if (b5 > f6) {
                float f7 = f5.c;
                if (f7 > f3) {
                    float f8 = f5.b;
                    if (a2 > f8) {
                        float f9 = f5.d;
                        if (f9 > f4) {
                            sk9 s = fpe.s(new sk9(f3 - f6, f4 - f8, b5 - f6, a2 - f8), ctd.p(f7 - f6, f9 - f8));
                            long e2 = y22Var.e(eh.D(y), eh.D(j));
                            sk9 sk9Var = new sk9(s.a / lz9.b(e2), s.b / lz9.c(e2), s.c / lz9.b(e2), s.d / lz9.c(e2));
                            eh.D(j2);
                            return fpe.s(sk9Var, eh.D(j2));
                        }
                    }
                }
            }
        }
        return sk9.e;
    }

    public static final long i(float f2, long j, float f3, long j2, long j3) {
        long e2 = z78.e(z78.f(-1.0f, z78.a(f2, j)), z78.a(f2, j2));
        double cos = Math.cos(0.0d);
        double sin = Math.sin(0.0d);
        double sin2 = Math.sin(0.0d);
        long f4 = z78.f(-1.0f, z78.f(f3, z78.d(mue.b((float) ((cos * z78.b(e2)) - (sin * z78.c(e2))), (float) ((Math.cos(0.0d) * z78.c(e2)) + (sin2 * z78.b(e2)))), z78.e(z78.a(f3, j2), z78.a(f2, j3)))));
        if (z78.b(f4) == -0.0f || z78.c(f4) == -0.0f) {
            return mue.b(yz1.i(z78.b(f4)), yz1.i(z78.c(f4)));
        }
        return f4;
    }

    public static final sk9 j(long j, long j2, y22 y22Var, ok0 ok0Var, boolean z, float f2, m12 m12Var) {
        jk1 jk1Var;
        jk1 jk1Var2;
        float f3;
        float f4;
        y22Var.getClass();
        ok0Var.getClass();
        if (!eh.q(j) && !eh.q(j2)) {
            ok0 A = ipe.A(ok0Var, Boolean.valueOf(z));
            sk9 f5 = f(j, eh.y(0, j2), y22Var, A, false);
            int i = az5.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (4294967295L & j);
            f5.getClass();
            float f6 = f5.a * f2;
            float f7 = f5.b * f2;
            float f8 = f5.c * f2;
            float f9 = f5.d * f2;
            float f10 = f8 - f6;
            float f11 = f9 - f7;
            int A2 = k27.A(f10);
            float f12 = nae.e;
            if (A2 >= i2) {
                float f13 = (f8 - i2) * (-1.0f);
                float f14 = f6 * (-1.0f);
                if (f13 > f14) {
                    f13 = f14;
                }
                jk1Var = new jk1(f13, f14);
            } else if (ipe.v(A)) {
                jk1Var = new jk1(nae.e, nae.e);
            } else if (ipe.t(A)) {
                float f15 = (f8 - i2) * (-1.0f);
                jk1Var = new jk1(f15, f15);
            } else {
                float f16 = (f6 - ((i2 - f10) / 2.0f)) * (-1.0f);
                jk1Var = new jk1(f16, f16);
            }
            if (k27.A(f11) >= i3) {
                float f17 = (f9 - i3) * (-1.0f);
                float f18 = f7 * (-1.0f);
                if (f17 > f18) {
                    f17 = f18;
                }
                jk1Var2 = new jk1(f17, f18);
            } else if (ipe.w(A)) {
                jk1Var2 = new jk1(nae.e, nae.e);
            } else if (ipe.s(A)) {
                float f19 = (f9 - i3) * (-1.0f);
                jk1Var2 = new jk1(f19, f19);
            } else {
                float f20 = (f7 - ((i3 - f11) / 2.0f)) * (-1.0f);
                jk1Var2 = new jk1(f20, f20);
            }
            float i4 = yz1.i(jk1Var.a);
            float i5 = yz1.i(jk1Var2.a);
            float i6 = yz1.i(jk1Var.b);
            float i7 = yz1.i(jk1Var2.b);
            float f21 = i2 - f10;
            if (f21 < nae.e) {
                f21 = 0.0f;
            }
            float f22 = f21 / 2.0f;
            float f23 = i3 - f11;
            if (f23 < nae.e) {
                f23 = 0.0f;
            }
            float f24 = f23 / 2.0f;
            float f25 = nae.e - f22;
            int i8 = (f25 > nae.e ? 1 : (f25 == nae.e ? 0 : -1));
            if (i8 < 0) {
                f3 = 0.0f;
            } else {
                f3 = f25;
            }
            float f26 = nae.e - f24;
            int i9 = (f26 > nae.e ? 1 : (f26 == nae.e ? 0 : -1));
            if (i9 < 0) {
                f4 = 0.0f;
            } else {
                f4 = f26;
            }
            if (i8 < 0) {
                f25 = 0.0f;
            }
            if (i9 >= 0) {
                f12 = f26;
            }
            return new sk9(yz1.i(i4 - f3), yz1.i(i5 - f4), yz1.i(i6 + f25), yz1.i(i7 + f12));
        }
        return sk9.e;
    }

    public static final long k(long j, long j2, y22 y22Var, ok0 ok0Var, boolean z, int i, float f2, long j3, long j4) {
        long j5;
        y22Var.getClass();
        ok0Var.getClass();
        if (!eh.q(j) && !eh.q(j2)) {
            int i2 = i % 90;
            if (i2 == 0) {
                if (!eh.q(j) && !eh.q(j2)) {
                    if (i2 == 0) {
                        long y = eh.y(i, j2);
                        long s = mue.s(mue.p(j4, eh.D(j2), i), y22Var.e(eh.D(y), eh.D(j)));
                        sk9 f3 = f(j, y, y22Var, ok0Var, z);
                        j5 = z78.e(s, mue.b(f3.a, f3.b));
                    } else {
                        vs.m("rotation must be multiple of 90");
                        return 0L;
                    }
                } else {
                    j5 = z78.b;
                }
                if (eh.q(j)) {
                    return z78.b;
                }
                return z78.e(z78.f(f2, j5), j3);
            }
            vs.m("rotation must be multiple of 90");
            return 0L;
        }
        return z78.b;
    }

    public static final float l(float f2, float f3, float f4, float f5, float f6) {
        return (((((((((f3 - f4) * 3.0f) + f5) - f2) * f6) + (((f4 - (2.0f * f3)) + f2) * 3.0f)) * f6) + ((f3 - f2) * 3.0f)) * f6) + f2;
    }

    public static final float m(float f2, float f3, float f4, float f5) {
        float f6;
        float f7;
        float f8;
        float f9;
        double d2 = f2;
        double d3 = ((d2 - (f3 * 2.0d)) + f4) * 3.0d;
        double d4 = (f3 - f2) * 3.0d;
        double d5 = ((f3 - f4) * 3.0d) + (-f2) + f5;
        int i = (Math.abs(d5 - 0.0d) > 1.0E-7d ? 1 : (Math.abs(d5 - 0.0d) == 1.0E-7d ? 0 : -1));
        float f10 = 1.0f;
        float f11 = nae.e;
        if (i < 0) {
            if (Math.abs(d3 - 0.0d) < 1.0E-7d) {
                if (Math.abs(d4 - 0.0d) < 1.0E-7d) {
                    return Float.NaN;
                }
                float f12 = (float) ((-d2) / d4);
                if (f12 >= nae.e) {
                    f11 = f12;
                }
                if (f11 <= 1.0f) {
                    f10 = f11;
                }
                if (Math.abs(f10 - f12) > 1.05E-6f) {
                    return Float.NaN;
                }
                return f10;
            }
            double sqrt = Math.sqrt((d4 * d4) - ((4.0d * d3) * d2));
            double d6 = d3 * 2.0d;
            float f13 = (float) ((sqrt - d4) / d6);
            if (f13 < nae.e) {
                f9 = 0.0f;
            } else {
                f9 = f13;
            }
            if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            if (Math.abs(f9 - f13) > 1.05E-6f) {
                f9 = Float.NaN;
            }
            if (!Float.isNaN(f9)) {
                return f9;
            }
            float f14 = (float) (((-d4) - sqrt) / d6);
            if (f14 >= nae.e) {
                f11 = f14;
            }
            if (f11 <= 1.0f) {
                f10 = f11;
            }
            if (Math.abs(f10 - f14) > 1.05E-6f) {
                return Float.NaN;
            }
            return f10;
        }
        double d7 = d3 / d5;
        double d8 = d4 / d5;
        double d9 = d2 / d5;
        double b2 = nk2.b(d7, d7, d8 * 3.0d, 9.0d);
        double d10 = ((d9 * 27.0d) + ((((d7 * 2.0d) * d7) * d7) - ((d7 * 9.0d) * d8))) / 54.0d;
        double d11 = b2 * b2 * b2;
        double d12 = (d10 * d10) + d11;
        double d13 = d7 / 3.0d;
        int i2 = (d12 > 0.0d ? 1 : (d12 == 0.0d ? 0 : -1));
        if (i2 < 0) {
            double sqrt2 = Math.sqrt(-d11);
            double d14 = (-d10) / sqrt2;
            if (d14 < -1.0d) {
                d14 = -1.0d;
            }
            if (d14 > 1.0d) {
                d14 = 1.0d;
            }
            double acos = Math.acos(d14);
            double j = b23.j((float) sqrt2) * 2.0f;
            float cos = (float) ((Math.cos(acos / 3.0d) * j) - d13);
            if (cos < nae.e) {
                f7 = 0.0f;
            } else {
                f7 = cos;
            }
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            if (Math.abs(f7 - cos) > 1.05E-6f) {
                f7 = Float.NaN;
            }
            if (!Float.isNaN(f7)) {
                return f7;
            }
            float cos2 = (float) ((Math.cos((6.283185307179586d + acos) / 3.0d) * j) - d13);
            if (cos2 < nae.e) {
                f8 = 0.0f;
            } else {
                f8 = cos2;
            }
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            if (Math.abs(f8 - cos2) > 1.05E-6f) {
                f8 = Float.NaN;
            }
            if (!Float.isNaN(f8)) {
                return f8;
            }
            float cos3 = (float) ((Math.cos((acos + 12.566370614359172d) / 3.0d) * j) - d13);
            if (cos3 >= nae.e) {
                f11 = cos3;
            }
            if (f11 <= 1.0f) {
                f10 = f11;
            }
            if (Math.abs(f10 - cos3) > 1.05E-6f) {
                return Float.NaN;
            }
            return f10;
        } else if (i2 == 0) {
            float f15 = -b23.j((float) d10);
            float f16 = (float) d13;
            float f17 = (2.0f * f15) - f16;
            if (f17 < nae.e) {
                f6 = 0.0f;
            } else {
                f6 = f17;
            }
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            if (Math.abs(f6 - f17) > 1.05E-6f) {
                f6 = Float.NaN;
            }
            if (!Float.isNaN(f6)) {
                return f6;
            }
            float f18 = (-f15) - f16;
            if (f18 >= nae.e) {
                f11 = f18;
            }
            if (f11 <= 1.0f) {
                f10 = f11;
            }
            if (Math.abs(f10 - f18) > 1.05E-6f) {
                return Float.NaN;
            }
            return f10;
        } else {
            double sqrt3 = Math.sqrt(d12);
            float j2 = (float) ((b23.j((float) ((-d10) + sqrt3)) - b23.j((float) (d10 + sqrt3))) - d13);
            if (j2 >= nae.e) {
                f11 = j2;
            }
            if (f11 <= 1.0f) {
                f10 = f11;
            }
            if (Math.abs(f10 - j2) > 1.05E-6f) {
                return Float.NaN;
            }
            return f10;
        }
    }

    public static final int n(float f2, float f3, float f4, float[] fArr) {
        double d2 = f2;
        double d3 = f3;
        double d4 = f4;
        double d5 = d3 * 2.0d;
        double d6 = (d2 - d5) + d4;
        if (d6 == 0.0d) {
            if (d3 == d4) {
                return 0;
            }
            return t((float) ((d5 - d4) / (d5 - (d4 * 2.0d))), fArr, 0);
        }
        double d7 = -Math.sqrt((d3 * d3) - (d4 * d2));
        double d8 = (-d2) + d3;
        int t = t((float) ((-(d7 + d8)) / d6), fArr, 0);
        int t2 = t((float) ((d7 - d8) / d6), fArr, t) + t;
        if (t2 > 1) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            if (f5 > f6) {
                fArr[0] = f6;
                fArr[1] = f5;
                return t2;
            } else if (f5 == f6) {
                return t2 - 1;
            } else {
                return t2;
            }
        }
        return t2;
    }

    public static final float o(lo8 lo8Var) {
        float[] fArr = lo8Var.b;
        int ordinal = lo8Var.a.ordinal();
        char c2 = 2;
        if (ordinal != 1) {
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    c2 = 0;
                } else {
                    c2 = 6;
                }
            } else {
                c2 = 4;
            }
        }
        return fArr[c2];
    }

    public static final void p(rv4 rv4Var, lu4 lu4Var) {
        lu4Var.getClass();
        jsc.u(2, lu4Var);
        lu4Var.invoke(rv4Var, 1);
    }

    public static final Object q(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final nq7 r(rv4 rv4Var, nq7 nq7Var) {
        tza tzaVar = j27.a;
        return zbe.z(nmd.v(tte.k(nq7Var, ((h27) rv4Var.j(tzaVar)).c.d), rm1.g(((h27) rv4Var.j(tzaVar)).a, 1.0f), lre.g), 16.0f, 16.0f);
    }

    public static String s(int i) {
        if (i == 1) {
            return "Clip";
        }
        if (i == 2) {
            return "Ellipsis";
        }
        if (i == 5) {
            return "MiddleEllipsis";
        }
        if (i == 3) {
            return "Visible";
        }
        if (i == 4) {
            return "StartEllipsis";
        }
        return "Invalid";
    }

    public static final int t(float f2, float[] fArr, int i) {
        float f3 = nae.e;
        if (f2 >= nae.e) {
            f3 = f2;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (Math.abs(f3 - f2) > 1.05E-6f) {
            f3 = Float.NaN;
        }
        fArr[i] = f3;
        return !Float.isNaN(f3) ? 1 : 0;
    }
}
