package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.view.KeyEvent;
import java.security.GeneralSecurityException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lbe  reason: default package */
/* loaded from: classes.dex */
public abstract class lbe {
    public static final tu1 a = new tu1(new sv1(3), false, -1738833250);
    public static final tu1 b = new tu1(new sv1(4), false, 1998149983);
    public static final tu1 c = new tu1(new rv1(20), false, 2100397327);

    public static final void a(p59 p59Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2;
        p59Var.getClass();
        rv4Var.g0(-574747462);
        if (rv4Var.f(p59Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = true;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if (((Boolean) p59Var.a.getValue()).booleanValue()) {
                rv4Var.e0(1733300784);
                Object[] objArr = new Object[0];
                if ((i3 & 14) != 4) {
                    z2 = false;
                }
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (z2 || P == lh9Var) {
                    P = new ek7(p59Var, 0);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 0);
                boolean f = rv4Var.f(aw7Var);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new cd2(aw7Var, null, 2);
                    rv4Var.o0(P2);
                }
                yte.g((lu4) P2, rv4Var, pvc.a);
                boolean f2 = rv4Var.f(aw7Var);
                Object P3 = rv4Var.P();
                if (f2 || P3 == lh9Var) {
                    P3 = new nd7(aw7Var, 18);
                    rv4Var.o0(P3);
                }
                rv4Var2 = rv4Var;
                qj4.c((vt4) P3, false, false, jce.E(1419426323, new t81(3, p59Var, aw7Var), rv4Var), rv4Var2, 3072, 6);
                rv4Var2.q(false);
            } else {
                rv4Var2 = rv4Var;
                rv4Var2.e0(1740827336);
                rv4Var2.q(false);
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new r93(p59Var, i);
        }
    }

    public static nq7 e(nq7 nq7Var, yu7 yu7Var, iu5 iu5Var, boolean z, xt9 xt9Var, vt4 vt4Var, int i) {
        nq7 j;
        if ((i & 4) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            xt9Var = null;
        }
        xt9 xt9Var2 = xt9Var;
        if (iu5Var != null) {
            j = new wi1(yu7Var, iu5Var, false, z2, null, xt9Var2, vt4Var);
        } else if (iu5Var == null) {
            j = new wi1(yu7Var, null, false, z2, null, xt9Var2, vt4Var);
        } else {
            kq7 kq7Var = kq7.a;
            if (yu7Var != null) {
                j = fu5.a(kq7Var, yu7Var, iu5Var).a0(new wi1(yu7Var, null, false, z2, null, xt9Var2, vt4Var));
            } else {
                j = lye.j(kq7Var, new yi1(iu5Var, z2, xt9Var2, vt4Var));
            }
        }
        return nq7Var.a0(j);
    }

    public static nq7 f(int i, vt4 vt4Var, nq7 nq7Var, String str, boolean z) {
        if ((i & 1) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            str = null;
        }
        return nq7Var.a0(new wi1(null, null, true, z2, str, null, vt4Var));
    }

    public static nq7 g(nq7 nq7Var, yu7 yu7Var, vt4 vt4Var, vt4 vt4Var2, int i) {
        if ((i & 64) != 0) {
            vt4Var = null;
        }
        return nq7Var.a0(new eo1(vt4Var2, vt4Var, null, yu7Var, false, true));
    }

    public static nq7 h(nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2) {
        return nq7Var.a0(new eo1(vt4Var2, vt4Var, null, null, true, true));
    }

    public static ztc i(String str) {
        char lowerCase;
        int length = str.length();
        int i = 0;
        while (true) {
            if (i < length) {
                char charAt = str.charAt(i);
                if ('A' <= charAt && charAt < '[') {
                    lowerCase = (char) (charAt + ' ');
                } else if (charAt >= 0 && charAt < 128) {
                    lowerCase = charAt;
                } else {
                    lowerCase = Character.toLowerCase(charAt);
                }
                if (lowerCase != charAt) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i != -1) {
            StringBuilder sb = new StringBuilder(str.length());
            sb.append((CharSequence) str, 0, i);
            int length2 = str.length() - 1;
            if (i <= length2) {
                while (true) {
                    char charAt2 = str.charAt(i);
                    if ('A' <= charAt2 && charAt2 < '[') {
                        charAt2 = (char) (charAt2 + ' ');
                    } else if (charAt2 < 0 || charAt2 >= 128) {
                        charAt2 = Character.toLowerCase(charAt2);
                    }
                    sb.append(charAt2);
                    if (i == length2) {
                        break;
                    }
                    i++;
                }
            }
            str = sb.toString();
        }
        ztc ztcVar = (ztc) ztc.e.get(str);
        if (ztcVar == null) {
            return new ztc(str, 0);
        }
        return ztcVar;
    }

    public static u51 j(int i) {
        float f;
        float pow;
        bt4 bt4Var = bt4.k;
        float l = vae.l((i >> 16) & 255);
        float l2 = vae.l((i >> 8) & 255);
        float l3 = vae.l(i & 255);
        double[][] dArr = vae.d;
        double d = l;
        double[] dArr2 = dArr[0];
        double d2 = l2;
        double d3 = l3;
        double d4 = (dArr2[2] * d3) + (dArr2[1] * d2) + (dArr2[0] * d);
        double[] dArr3 = dArr[1];
        double d5 = (dArr3[2] * d3) + (dArr3[1] * d2) + (dArr3[0] * d);
        double[] dArr4 = dArr[2];
        float[] fArr = {(float) d4, (float) d5, (float) ((d3 * dArr4[2]) + (d2 * dArr4[1]) + (d * dArr4[0]))};
        float[][] fArr2 = vae.a;
        float f2 = fArr[0];
        float[] fArr3 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr3[1] * f3;
        float f5 = fArr[2];
        float f6 = (fArr3[2] * f5) + f4 + (fArr3[0] * f2);
        float[] fArr4 = fArr2[1];
        float f7 = fArr4[1] * f3;
        float f8 = fArr4[2] * f5;
        float[] fArr5 = fArr2[2];
        float f9 = (f5 * fArr5[2]) + (f3 * fArr5[1]) + (f2 * fArr5[0]);
        float[] fArr6 = bt4Var.g;
        float f10 = bt4Var.e;
        float f11 = bt4Var.b;
        float f12 = fArr6[0] * f6;
        float f13 = fArr6[1] * (f8 + f7 + (fArr4[0] * f2));
        float f14 = fArr6[2] * f9;
        float f15 = bt4Var.h;
        float pow2 = (float) Math.pow((Math.abs(f12) * f15) / 100.0f, 0.41999998688697815d);
        float pow3 = (float) Math.pow((Math.abs(f13) * f15) / 100.0f, 0.41999998688697815d);
        float pow4 = (float) Math.pow((Math.abs(f14) * f15) / 100.0f, 0.41999998688697815d);
        float signum = ((Math.signum(f12) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum2 = ((Math.signum(f13) * 400.0f) * pow3) / (pow3 + 27.13f);
        float signum3 = ((Math.signum(f14) * 400.0f) * pow4) / (pow4 + 27.13f);
        float f16 = ((((-12.0f) * signum2) + (signum * 11.0f)) + signum3) / 11.0f;
        float f17 = ((signum + signum2) - (signum3 * 2.0f)) / 9.0f;
        float f18 = signum2 * 20.0f;
        float f19 = ((21.0f * signum3) + ((signum * 20.0f) + f18)) / 20.0f;
        float f20 = (((signum * 40.0f) + f18) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f17, f16)) * 180.0f) / 3.1415927f;
        if (atan2 < nae.e) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f21 = atan2;
        float f22 = (f21 * 3.1415927f) / 180.0f;
        float pow5 = ((float) Math.pow((f20 * bt4Var.c) / f11, bt4Var.j * f10)) * 100.0f;
        if (f21 < 20.14d) {
            f = 360.0f + f21;
        } else {
            f = f21;
        }
        float pow6 = ((float) Math.pow(((((((((float) Math.cos(((f * 3.1415927f) / 180.0f) + 2.0f)) + 3.8f) * 0.25f) * 3846.1538f) * bt4Var.f) * bt4Var.d) * ((float) Math.sqrt((f17 * f17) + (f16 * f16)))) / (f19 + 0.305f), 0.8999999761581421d)) * ((float) Math.pow(1.64f - ((float) Math.pow(0.28999999165534973d, bt4Var.a)), 0.7300000190734863d)) * ((float) Math.sqrt(pow5 / 100.0f));
        Math.sqrt((pow * f10) / (f11 + 4.0f));
        float f23 = (1.7f * pow5) / ((0.007f * pow5) + 1.0f);
        float log = ((float) Math.log((bt4Var.i * pow6 * 0.0228f) + 1.0f)) * 43.85965f;
        double d6 = f22;
        return new u51(f21, pow6, pow5, f23, log * ((float) Math.cos(d6)), log * ((float) Math.sin(d6)));
    }

    public static u51 k(float f, float f2, float f3) {
        bt4 bt4Var = bt4.k;
        Math.sqrt(((f2 / ((float) Math.sqrt(f / 100.0d))) * bt4Var.e) / (bt4Var.b + 4.0f));
        float f4 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((bt4Var.i * f2 * 0.0228d) + 1.0d)) * 43.85965f;
        double d = (3.1415927f * f3) / 180.0f;
        return new u51(f3, f2, f, f4, log * ((float) Math.cos(d)), log * ((float) Math.sin(d)));
    }

    public static final int n(Layout layout, int i, boolean z) {
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i || lineEnd == i) {
            if (lineStart == i) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final boolean o(KeyEvent keyEvent) {
        long i = gae.i(keyEvent);
        int i2 = e86.V;
        if (!e86.a(i, e86.i) && !e86.a(i, e86.x) && !e86.a(i, e86.K) && !e86.a(i, e86.w)) {
            return false;
        }
        return true;
    }

    public static final nq7 p(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new m88(xt4Var, new im(23, xt4Var)));
    }

    public static nq7 q(nq7 nq7Var, float f) {
        return nq7Var.a0(new a88(f, new hd(2, f)));
    }

    public static final p59 t(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 G = oue.G(new mx8(5), new rg8(17));
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new rh7(10);
            rv4Var.o0(P);
        }
        return (p59) zpe.m(objArr, G, (vt4) P, rv4Var, 384);
    }

    public static int u(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(16973825, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final af9 v(cp2 cp2Var) {
        cp2Var.getClass();
        return new af9(cp2Var.a, cp2Var.b, cp2Var.c, cp2Var.d, cp2Var.e, cp2Var.f);
    }

    public static void w() {
        try {
            if (!lve.a()) {
                return;
            }
            throw new GeneralSecurityException("Cannot use non-FIPS-compliant AeadConfigurationV1 in FIPS mode");
        } catch (GeneralSecurityException e) {
            p1a.n(e);
        }
    }

    public abstract boolean b(x1 x1Var, l1 l1Var, l1 l1Var2);

    public abstract boolean c(x1 x1Var, Object obj, Object obj2);

    public abstract boolean d(x1 x1Var, w1 w1Var, w1 w1Var2);

    public abstract l1 l(x1 x1Var);

    public abstract w1 m(x1 x1Var);

    public abstract void r(w1 w1Var, w1 w1Var2);

    public abstract void s(w1 w1Var, Thread thread);
}
