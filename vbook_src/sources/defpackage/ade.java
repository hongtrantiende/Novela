package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.StrictMode;
import androidx.glance.appwidget.action.InvisibleActionTrampolineActivity;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ade  reason: default package */
/* loaded from: classes.dex */
public abstract class ade {
    public static final tu1 a = new tu1(new tx0(1), false, 767680591);
    public static final tu1 b = new tu1(new sv1(14), false, 809834045);
    public static final tu1 c = new tu1(new tv1(15), false, 624365883);

    public static lyc A(String str) {
        String str2;
        int i;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str8;
        String str9;
        String str10 = hn8.b;
        if (!c16.i(str10, "/")) {
            str2 = r4b.N(str, false, str10, "/");
        } else {
            str2 = str;
        }
        boolean z = true;
        int i8 = 0;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (i8 < str2.length()) {
            char charAt = str2.charAt(i8);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i11 == -1 && i9 == -1) {
                            i11 = i8 + 1;
                        }
                    } else if (z && i11 == -1 && i9 == -1) {
                        int i14 = i8 + 2;
                        if (i14 < str.length() && str.charAt(i8 + 1) == '/' && str.charAt(i14) == '/') {
                            i12 = i8 + 3;
                            z = false;
                            i13 = i8;
                            i8 = i14;
                        } else if (str2.equals(str)) {
                            i10 = i8 + 1;
                            i13 = i8;
                            i8 = i10;
                            i12 = i8;
                        }
                    }
                } else if (i10 == -1 && i11 == -1 && i9 == -1) {
                    if (i12 == -1) {
                        i10 = 0;
                    } else {
                        i10 = i8;
                    }
                    z = false;
                }
            } else if (i9 == -1) {
                i9 = i8 + 1;
            }
            i8++;
        }
        int i15 = Integer.MAX_VALUE;
        if (i9 == -1) {
            i = Integer.MAX_VALUE;
        } else {
            i = i9 - 1;
        }
        int min = Math.min(i, str2.length());
        if (i11 == -1) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = i11 - 1;
        }
        int min2 = Math.min(i2, min);
        String str11 = null;
        if (i12 != -1) {
            str4 = str2.substring(0, i13);
            if (i10 != -1) {
                i15 = i10;
            }
            str3 = str2.substring(i12, Math.min(i15, min2));
        } else {
            str3 = null;
            str4 = null;
        }
        if (i10 != -1) {
            str5 = str2.substring(i10, min2);
        } else {
            str5 = null;
        }
        if (i11 != -1) {
            str6 = str2.substring(i11, min);
        } else {
            str6 = null;
        }
        if (i9 != -1) {
            str7 = str2.substring(i9, str2.length());
        } else {
            str7 = null;
        }
        if (str4 != null) {
            i3 = str4.length();
        } else {
            i3 = 0;
        }
        if (str3 != null) {
            i4 = str3.length();
        } else {
            i4 = 0;
        }
        if (str5 != null) {
            i5 = str5.length();
        } else {
            i5 = 0;
        }
        if (str6 != null) {
            i6 = str6.length();
        } else {
            i6 = 0;
        }
        if (str7 != null) {
            i7 = str7.length();
        } else {
            i7 = 0;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(i3, Math.max(i4, Math.max(i5, Math.max(i6, i7)))) - 2)];
        String str12 = str6;
        if (str4 != null) {
            str8 = w(str4, bArr);
        } else {
            str8 = null;
        }
        if (str3 != null) {
            str9 = w(str3, bArr);
        } else {
            str9 = null;
        }
        if (str5 != null) {
            str11 = w(str5, bArr);
        }
        String str13 = str11;
        if (str12 != null) {
            w(str12, bArr);
        }
        if (str7 != null) {
            w(str7, bArr);
        }
        return new lyc(str2, str10, str8, str9, str13);
    }

    public static final Bundle B() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", "564805706021-qvm63dnp6q45s6aivklciksc6s96f7g3.apps.googleusercontent.com");
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", null);
        bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE", "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL");
        return bundle;
    }

    public static BigInteger C(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    public static byte[] D(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        vs.m("n must not be negative");
        return null;
    }

    public static byte[] E(BigInteger bigInteger, int i) {
        if (bigInteger.signum() != -1) {
            byte[] byteArray = bigInteger.toByteArray();
            if (byteArray.length == i) {
                return byteArray;
            }
            int i2 = i + 1;
            if (byteArray.length <= i2) {
                if (byteArray.length == i2) {
                    if (byteArray[0] == 0) {
                        return Arrays.copyOfRange(byteArray, 1, byteArray.length);
                    }
                    hfd.j("integer too large");
                    return null;
                }
                byte[] bArr = new byte[i];
                System.arraycopy(byteArray, 0, bArr, i - byteArray.length, byteArray.length);
                return bArr;
            }
            hfd.j("integer too large");
            return null;
        }
        vs.m("integer must be nonnegative");
        return null;
    }

    public static final void a(final m71 m71Var, final lu4 lu4Var, final rh8 rh8Var, final nq7 nq7Var, final float f, final sqa sqaVar, final boolean z, final tu1 tu1Var, rv4 rv4Var, final int i) {
        int i2;
        Object obj;
        boolean z2;
        boolean z3;
        rv4 rv4Var2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        rv4Var.g0(-2077912500);
        if ((i & 6) == 0) {
            if (rv4Var.h(m71Var)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.d(1)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(lu4Var)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(rh8Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.d(2)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.c(f)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            obj = sqaVar;
            if (rv4Var.f(obj)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        } else {
            obj = sqaVar;
        }
        if ((100663296 & i) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        } else {
            z2 = z;
        }
        if ((805306368 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i2 |= i3;
        }
        if ((306783379 & i2) != 306783378) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i2 & 1, z3)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            rv4Var.e0(-143525276);
            tza tzaVar = dy1.n;
            float o = zbe.o(rh8Var, (tc6) rv4Var.j(tzaVar));
            rv4Var.q(false);
            tza tzaVar2 = dy1.h;
            float L0 = ((r13) rv4Var.j(tzaVar2)).L0(o);
            rv4Var.e0(-1907957079);
            float n = zbe.n(rh8Var, (tc6) rv4Var.j(tzaVar));
            rv4Var.q(false);
            float L02 = ((r13) rv4Var.j(tzaVar2)).L0(n);
            if ((i2 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z4 || P == lh9Var) {
                P = new j71(lu4Var, L0, L02);
                rv4Var.o0(P);
            }
            j71 j71Var = (j71) P;
            uwd uwdVar = new uwd(j71Var, 25);
            rv4Var.e0(273336201);
            l71 l71Var = m71Var.a;
            th8 j = zbe.j(nae.e, rh8Var.d(), nae.e, rh8Var.a(), 5);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new nj0(27);
                rv4Var.o0(P2);
            }
            kxe.c(l71Var, y7a.c(nq7Var, false, (xt4) P2), j, j71Var, 2, f, null, obj, z2, null, null, uwdVar, null, jce.E(-1817116752, new cs1(25, m71Var, j71Var, tu1Var), rv4Var), rv4Var, (57344 & i2) | ((i2 >> 3) & 458752) | (29360128 & i2) | (i2 & 234881024), 24576, 11840);
            rv4Var2 = rv4Var;
            rv4Var2.q(false);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: b71
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ade.a(m71.this, lu4Var, rh8Var, nq7Var, f, sqaVar, z, tu1Var, (rv4) obj2, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1231425678);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            kq7 kq7Var2 = kq7.a;
            nq7 p = lye.p(rv4Var2, kq7Var2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, d);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            long g = rm1.g(r0f.y(rv4Var2), 4.0f);
            nk0 nk0Var = kh5.e;
            pu0 pu0Var = pu0.a;
            vqe.m(nae.e, 0, 2, g, rv4Var2, pu0Var.a(kq7Var2, nk0Var));
            cvb.c(str, zbe.z(st0.d(nmd.v(tte.k(zbe.C(pu0Var.a(kq7Var2, kh5.d), 12.0f, nae.e, nae.e, nae.e, 14), r0f.z(rv4Var).b), rm1.g(r0f.y(rv4Var), 1.0f), lre.g), 1.0f, rm1.g(r0f.y(rv4Var), 4.0f), r0f.z(rv4Var).b), 8.0f, 4.0f), r0f.y(rv4Var).a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).i, rv4Var, i3 & 14, 0, 131064);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o7(str, kq7Var, i, 11);
        }
    }

    public static final void c(final m71 m71Var, final nq7 nq7Var, final float f, final float f2, final sqa sqaVar, boolean z, float f3, float f4, rh8 rh8Var, final tu1 tu1Var, rv4 rv4Var, final int i) {
        int i2;
        final float f5;
        boolean z2;
        final boolean z3;
        final float f6;
        final float f7;
        final rh8 rh8Var2;
        final float f8;
        th8 th8Var;
        final float f9;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        float f10;
        float f11;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(1493031269);
        if ((i & 6) == 0) {
            if (rv4Var.h(m71Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            f5 = f;
            if (rv4Var.c(f5)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        } else {
            f5 = f;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.c(f2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(sqaVar)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        int i9 = i2 | 115015680;
        if ((805306368 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 536870912;
            } else {
                i3 = 268435456;
            }
            i9 |= i3;
        }
        int i10 = i9;
        if ((306783379 & i10) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                z4 = z;
                f8 = f3;
                th8Var = rh8Var;
                f9 = f4;
            } else {
                f8 = 40.0f;
                th8Var = new th8(nae.e, nae.e, nae.e, nae.e);
                f9 = 56.0f;
                z4 = true;
            }
            rv4Var.r();
            final r13 r13Var = (r13) rv4Var.j(dy1.h);
            boolean f12 = rv4Var.f(r13Var);
            if ((i10 & 896) == 256) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean h = f12 | z5 | rv4Var.h(m71Var);
            if ((i10 & 3670016) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z8 = z6 | h;
            if ((i10 & 29360128) == 8388608) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z9 = z8 | z7;
            Object P = rv4Var.P();
            if (!z9 && P != ax1.a) {
                f10 = f8;
                f11 = f9;
            } else {
                Object obj = new lu4() { // from class: z61
                    /* JADX WARN: Removed duplicated region for block: B:47:0x013e  */
                    /* JADX WARN: Removed duplicated region for block: B:66:0x01b2  */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x01e4 A[EDGE_INSN: B:83:0x01e4->B:71:0x01e4 ?: BREAK  , SYNTHETIC] */
                    @Override // defpackage.lu4
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final java.lang.Object invoke(java.lang.Object r33, java.lang.Object r34) {
                        /*
                            Method dump skipped, instructions count: 526
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.z61.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                    }
                };
                f10 = f8;
                f11 = f9;
                rv4Var.o0(obj);
                P = obj;
            }
            int i11 = i10 << 9;
            int i12 = (i10 & 14) | 24624 | ((i10 >> 15) & 7168) | ((i10 << 12) & 458752) | (i11 & 3670016) | (i11 & 29360128) | (i11 & 234881024) | (1879048192 & i10);
            z3 = z4;
            rh8 rh8Var3 = th8Var;
            a(m71Var, (lu4) P, rh8Var3, nq7Var, f2, sqaVar, z3, tu1Var, rv4Var, i12);
            rh8Var2 = rh8Var3;
            f6 = f10;
            f7 = f11;
        } else {
            rv4Var.X();
            z3 = z;
            f6 = f3;
            f7 = f4;
            rh8Var2 = rh8Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: a71
                @Override // defpackage.lu4
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    ade.c(m71.this, nq7Var, f, f2, sqaVar, z3, f6, f7, rh8Var2, tu1Var, (rv4) obj2, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void d(g25 g25Var, nq7 nq7Var, qg6 qg6Var, th8 th8Var, fz fzVar, jz jzVar, li4 li4Var, boolean z, wi wiVar, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        wt2 wt2Var;
        wi wiVar2;
        int i5;
        boolean z3;
        boolean z4;
        jz jzVar2;
        rv4Var.g0(635941664);
        if (rv4Var.f(g25Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(qg6Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i7 = i6 | i3 | 373317632;
        if (rv4Var.h(xt4Var)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        boolean z5 = true;
        if ((306783379 & i7) == 306783378 && (i4 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            rv4Var.Z();
            int i8 = i & 1;
            Object obj = ax1.a;
            if (i8 != 0 && !rv4Var.B()) {
                rv4Var.X();
                i5 = i7 & (-1908408321);
                wt2Var = li4Var;
                z4 = true;
                z3 = false;
                z5 = z;
                wiVar2 = wiVar;
            } else {
                pq2 a2 = axa.a(rv4Var);
                boolean f = rv4Var.f(a2);
                Object P = rv4Var.P();
                if (f || P == obj) {
                    P = new wt2(a2);
                    rv4Var.o0(P);
                }
                i5 = i7 & (-1908408321);
                z3 = false;
                wiVar2 = sg8.b(rv4Var);
                wt2Var = (wt2) P;
                z4 = true;
            }
            rv4Var.r();
            int i9 = (i5 & 14) | 48;
            if ((((i9 & 14) ^ 6) > 4 && rv4Var.f(g25Var)) || (i9 & 6) == 4) {
                z3 = z4;
            }
            Object P2 = rv4Var.P();
            if (!z3 && P2 != obj) {
                jzVar2 = jzVar;
            } else {
                jzVar2 = jzVar;
                P2 = new p25(new sj(23, g25Var, jzVar2));
                rv4Var.o0(P2);
            }
            voe.a(nq7Var, qg6Var, (p25) P2, th8Var, false, wt2Var, z5, wiVar2, jzVar2, fzVar, xt4Var, rv4Var, ((i5 >> 3) & Token.ASSIGN_MOD) | 818113542, 6 | ((i4 << 3) & Token.ASSIGN_MOD));
        } else {
            rv4Var.X();
            wt2Var = li4Var;
            z5 = z;
            wiVar2 = wiVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new od1(g25Var, nq7Var, qg6Var, th8Var, fzVar, jzVar, wt2Var, z5, wiVar2, xt4Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0109  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void e(defpackage.h25 r27, defpackage.nq7 r28, defpackage.qg6 r29, defpackage.rh8 r30, defpackage.jz r31, defpackage.fz r32, defpackage.li4 r33, boolean r34, defpackage.wi r35, defpackage.xt4 r36, defpackage.rv4 r37, int r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 652
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.e(h25, nq7, qg6, rh8, jz, fz, li4, boolean, wi, xt4, rv4, int, int, int):void");
    }

    public static final void f(boolean z, exb exbVar, xt4 xt4Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        exbVar.getClass();
        xt4Var.getClass();
        nu4Var.getClass();
        rv4Var.g0(-354357533);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(exbVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if ((i & 3072) == 0) {
            if (rv4Var.h(nu4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(364611963);
                g(z, exbVar, xt4Var, nu4Var, rv4Var, i8 & 8190);
                rv4Var.q(false);
            } else {
                rv4Var.e0(364812316);
                h(z, exbVar, xt4Var, nu4Var, rv4Var, i8 & 8190);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new un7(z, exbVar, xt4Var, nu4Var, i, 0);
        }
    }

    public static final void g(boolean z, exb exbVar, xt4 xt4Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        rv4Var.g0(-272570002);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(exbVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if ((i & 3072) == 0) {
            if (rv4Var.h(nu4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            nk0 nk0Var = kh5.D;
            nq7 y = zbe.y(mwe.x(pna.f(kq7.a, 1.0f), 15), 24.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new si7(28);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i9 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(29);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i9.a(zt3.x((xt4) P2)), nk0Var, b2, false, false, y, jce.E(1317560784, new wn7(exbVar, nu4Var, xt4Var, 1), rv4Var), rv4Var, (i8 & 14) | 805531008 | ((i8 >> 3) & Token.ASSIGN_MOD), 192);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new un7(z, exbVar, xt4Var, nu4Var, i, 2);
        }
    }

    public static final void h(boolean z, exb exbVar, xt4 xt4Var, nu4 nu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        rv4Var.g0(-618578415);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(exbVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if ((i & 3072) == 0) {
            if (rv4Var.h(nu4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            nk0 nk0Var = kh5.e;
            nq7 y = zbe.y(mwe.x(pna.u(kq7.a, nae.e, 600.0f, 1), 15), 24.0f);
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new si7(26);
                rv4Var.o0(P);
            }
            eu3 a2 = g.a(zt3.t((xt4) P));
            lz3 i9 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(27);
                rv4Var.o0(P2);
            }
            z87.a(z, xt4Var, a2, i9.a(zt3.x((xt4) P2)), nk0Var, b2, false, false, y, jce.E(-13094545, new wn7(exbVar, nu4Var, xt4Var, 0), rv4Var), rv4Var, (i8 & 14) | 805531008 | ((i8 >> 3) & Token.ASSIGN_MOD), 192);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new un7(z, exbVar, xt4Var, nu4Var, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(defpackage.nq7 r35, boolean r36, float r37, boolean r38, defpackage.rv4 r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.i(nq7, boolean, float, boolean, rv4, int, int):void");
    }

    public static final void j(List list, boolean z, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        Object obj;
        int i5;
        int i6;
        boolean z2;
        boolean z3;
        xt4 xt4Var2;
        boolean z4;
        xt4 xt4Var3;
        rv4Var.g0(1840723705);
        if (rv4Var.f(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i7 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i7 |= i4;
        }
        int i9 = i2 & 8;
        if (i9 != 0) {
            i6 = i7 | 3072;
            obj = xt4Var;
        } else {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i6 = i7 | i5;
        }
        if ((i6 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i6 & 1, z2)) {
            if (i8 != 0) {
                z4 = false;
            } else {
                z4 = z;
            }
            if (i9 != 0) {
                Object P = rv4Var.P();
                if (P == ax1.a) {
                    P = new si7(25);
                    rv4Var.o0(P);
                }
                xt4Var3 = (xt4) P;
            } else {
                xt4Var3 = obj;
            }
            s9e.f(nq7Var, new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(1061108446, new a1a(list, z4, xt4Var3, 3), rv4Var), rv4Var, 1573302);
            z3 = z4;
            xt4Var2 = xt4Var3;
        } else {
            rv4Var.X();
            z3 = z;
            xt4Var2 = obj;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x24(list, z3, nq7Var, xt4Var2, i, i2, 1);
        }
    }

    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    public static final void k(String str, List list, nq7 nq7Var, final nu4 nu4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        final String str2;
        final nu4 nu4Var2;
        boolean z2;
        ArrayList arrayList;
        kq7 kq7Var;
        nq7 nq7Var2;
        final ?? r11;
        float f;
        int i7;
        int i8;
        int i9;
        final int i10;
        int i11;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i12;
        int i13;
        boolean z9;
        boolean z10;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(674910144);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i14 = i | i2;
        if (rv4Var2.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i15 = i14 | i3;
        if (rv4Var2.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i16 = i15 | i4;
        if (rv4Var2.h(nu4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i17 = i16 | i5;
        if (rv4Var2.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i18 = i17 | i6;
        if ((i18 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i18 & 1, z)) {
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var2 = kq7.a;
            nq7 f2 = pna.f(kq7Var2, 1.0f);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, f2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            cvb.c(yqe.A((y3b) x2b.T.getValue(), rv4Var2), new we6(1.0f, true), r0f.y(rv4Var2).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).h, rv4Var, 0, 0, 131064);
            ar5 c2 = rp5.c((wk3) jk3.w.getValue(), rv4Var, 0);
            long j = r0f.y(rv4Var).q;
            nq7 k = tte.k(pna.n(kq7Var2, 28.0f), uu9.a);
            if ((i18 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new on7(3, vt4Var);
                rv4Var.o0(P);
            }
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 4.0f), j, rv4Var, 48, 0);
            rs8.u(rv4Var, true, kq7Var2, 8.0f, rv4Var);
            nq7 d = st0.d(tte.k(kq7Var2, r0f.z(rv4Var).b), 1.0f, rm1.g(r0f.y(rv4Var), 4.0f), r0f.z(rv4Var).b);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var, 0);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, d);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            int i19 = i18 & 14;
            cvb.c(str, zbe.y(kq7Var2, 12.0f), r0f.y(rv4Var).q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).h, rv4Var, i19 | 48, 0, 131064);
            str2 = str;
            rv4Var2 = rv4Var;
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : list) {
                    if (((r3c) obj).b == 3) {
                        arrayList2.add(obj);
                    }
                }
                rv4Var2.o0(arrayList2);
                arrayList = arrayList2;
            } else {
                arrayList = P2;
            }
            List list2 = (List) arrayList;
            if (!list2.isEmpty()) {
                rv4Var2.e0(-1259579445);
                nq7Var2 = null;
                r11 = 0;
                b(yqe.A((y3b) b3b.l.getValue(), rv4Var2), null, rv4Var2, 0);
                kq7Var = kq7Var2;
                f = 12.0f;
                j(list2, false, zbe.y(kq7Var, 12.0f), null, rv4Var2, 384, 10);
                rv4Var2.q(false);
            } else {
                kq7Var = kq7Var2;
                nq7Var2 = null;
                r11 = 0;
                f = 12.0f;
                rv4Var2.e0(-1259330546);
                rv4Var2.q(false);
            }
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : list) {
                    r3c r3cVar = (r3c) obj2;
                    if (r3cVar.b == 2 && r3cVar.c) {
                        arrayList3.add(obj2);
                    }
                }
                P3 = yae.z(arrayList3);
                rv4Var2.o0(P3);
            }
            final aw7 aw7Var = (aw7) P3;
            if (!((List) aw7Var.getValue()).isEmpty()) {
                rv4Var2.e0(-1259078516);
                b(yqe.A((y3b) b3b.n.getValue(), rv4Var2), nq7Var2, rv4Var2, r11);
                List list3 = (List) aw7Var.getValue();
                nq7 y = zbe.y(kq7Var, f);
                i7 = i18;
                if ((i7 & 7168) == 2048) {
                    z9 = true;
                } else {
                    z9 = r11;
                }
                if (i19 == 4) {
                    z10 = true;
                } else {
                    z10 = r11;
                }
                boolean z11 = z9 | z10;
                Object P4 = rv4Var2.P();
                if (z11 || P4 == lh9Var) {
                    P4 = new xt4() { // from class: vn7
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj3) {
                            int i20 = r11;
                            pvc pvcVar = pvc.a;
                            aw7 aw7Var2 = aw7Var;
                            String str3 = str2;
                            nu4 nu4Var3 = nu4Var;
                            String str4 = (String) obj3;
                            switch (i20) {
                                case 0:
                                    str4.getClass();
                                    ArrayList arrayList4 = new ArrayList();
                                    for (Object obj4 : (List) aw7Var2.getValue()) {
                                        if (!c16.i(((r3c) obj4).a, str4)) {
                                            arrayList4.add(obj4);
                                        }
                                    }
                                    aw7Var2.setValue(arrayList4);
                                    Boolean bool = Boolean.TRUE;
                                    List<r3c> list4 = (List) aw7Var2.getValue();
                                    ArrayList arrayList5 = new ArrayList(tl1.s(list4, 10));
                                    for (r3c r3cVar2 : list4) {
                                        arrayList5.add(r3cVar2.a);
                                    }
                                    nu4Var3.h(str3, bool, bool, arrayList5);
                                    return pvcVar;
                                case 1:
                                    str4.getClass();
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj5 : (List) aw7Var2.getValue()) {
                                        if (!c16.i(((r3c) obj5).a, str4)) {
                                            arrayList6.add(obj5);
                                        }
                                    }
                                    aw7Var2.setValue(arrayList6);
                                    Boolean bool2 = Boolean.FALSE;
                                    Boolean bool3 = Boolean.TRUE;
                                    List<r3c> list5 = (List) aw7Var2.getValue();
                                    ArrayList arrayList7 = new ArrayList(tl1.s(list5, 10));
                                    for (r3c r3cVar3 : list5) {
                                        arrayList7.add(r3cVar3.a);
                                    }
                                    nu4Var3.h(str3, bool2, bool3, arrayList7);
                                    return pvcVar;
                                case 2:
                                    str4.getClass();
                                    ArrayList arrayList8 = new ArrayList();
                                    for (Object obj6 : (List) aw7Var2.getValue()) {
                                        if (!c16.i(((r3c) obj6).a, str4)) {
                                            arrayList8.add(obj6);
                                        }
                                    }
                                    aw7Var2.setValue(arrayList8);
                                    Boolean bool4 = Boolean.TRUE;
                                    Boolean bool5 = Boolean.FALSE;
                                    List<r3c> list6 = (List) aw7Var2.getValue();
                                    ArrayList arrayList9 = new ArrayList(tl1.s(list6, 10));
                                    for (r3c r3cVar4 : list6) {
                                        arrayList9.add(r3cVar4.a);
                                    }
                                    nu4Var3.h(str3, bool4, bool5, arrayList9);
                                    return pvcVar;
                                default:
                                    str4.getClass();
                                    ArrayList arrayList10 = new ArrayList();
                                    for (Object obj7 : (List) aw7Var2.getValue()) {
                                        if (!c16.i(((r3c) obj7).a, str4)) {
                                            arrayList10.add(obj7);
                                        }
                                    }
                                    aw7Var2.setValue(arrayList10);
                                    Boolean bool6 = Boolean.FALSE;
                                    List<r3c> list7 = (List) aw7Var2.getValue();
                                    ArrayList arrayList11 = new ArrayList(tl1.s(list7, 10));
                                    for (r3c r3cVar5 : list7) {
                                        arrayList11.add(r3cVar5.a);
                                    }
                                    nu4Var3.h(str3, bool6, bool6, arrayList11);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var2.o0(P4);
                }
                nu4Var2 = nu4Var;
                i8 = i19;
                i9 = 2048;
                j(list3, true, y, (xt4) P4, rv4Var2, 432, 0);
                rv4Var2.q(r11);
            } else {
                nu4Var2 = nu4Var;
                i7 = i18;
                i8 = i19;
                i9 = 2048;
                rv4Var2.e0(-1258430802);
                rv4Var2.q(r11);
            }
            Object P5 = rv4Var2.P();
            if (P5 == lh9Var) {
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list) {
                    r3c r3cVar2 = (r3c) obj3;
                    if (r3cVar2.b == 1 && r3cVar2.c) {
                        arrayList4.add(obj3);
                    }
                }
                i10 = 1;
                P5 = yae.z(arrayList4);
                rv4Var2.o0(P5);
            } else {
                i10 = 1;
            }
            final aw7 aw7Var2 = (aw7) P5;
            if (!((List) aw7Var2.getValue()).isEmpty()) {
                rv4Var2.e0(-1258177067);
                b(yqe.A((y3b) b3b.p.getValue(), rv4Var2), nq7Var2, rv4Var2, r11);
                List list4 = (List) aw7Var2.getValue();
                nq7 y2 = zbe.y(kq7Var, f);
                if ((i7 & 7168) == i9) {
                    i12 = i10;
                } else {
                    i12 = r11;
                }
                int i20 = i8;
                if (i20 == 4) {
                    i13 = i10;
                } else {
                    i13 = r11;
                }
                int i21 = i12 | i13;
                Object P6 = rv4Var2.P();
                if (i21 != 0 || P6 == lh9Var) {
                    P6 = new xt4() { // from class: vn7
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj32) {
                            int i202 = i10;
                            pvc pvcVar = pvc.a;
                            aw7 aw7Var22 = aw7Var2;
                            String str3 = str2;
                            nu4 nu4Var3 = nu4Var2;
                            String str4 = (String) obj32;
                            switch (i202) {
                                case 0:
                                    str4.getClass();
                                    ArrayList arrayList42 = new ArrayList();
                                    for (Object obj4 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj4).a, str4)) {
                                            arrayList42.add(obj4);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList42);
                                    Boolean bool = Boolean.TRUE;
                                    List<r3c> list42 = (List) aw7Var22.getValue();
                                    ArrayList arrayList5 = new ArrayList(tl1.s(list42, 10));
                                    for (r3c r3cVar22 : list42) {
                                        arrayList5.add(r3cVar22.a);
                                    }
                                    nu4Var3.h(str3, bool, bool, arrayList5);
                                    return pvcVar;
                                case 1:
                                    str4.getClass();
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj5 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj5).a, str4)) {
                                            arrayList6.add(obj5);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList6);
                                    Boolean bool2 = Boolean.FALSE;
                                    Boolean bool3 = Boolean.TRUE;
                                    List<r3c> list5 = (List) aw7Var22.getValue();
                                    ArrayList arrayList7 = new ArrayList(tl1.s(list5, 10));
                                    for (r3c r3cVar3 : list5) {
                                        arrayList7.add(r3cVar3.a);
                                    }
                                    nu4Var3.h(str3, bool2, bool3, arrayList7);
                                    return pvcVar;
                                case 2:
                                    str4.getClass();
                                    ArrayList arrayList8 = new ArrayList();
                                    for (Object obj6 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj6).a, str4)) {
                                            arrayList8.add(obj6);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList8);
                                    Boolean bool4 = Boolean.TRUE;
                                    Boolean bool5 = Boolean.FALSE;
                                    List<r3c> list6 = (List) aw7Var22.getValue();
                                    ArrayList arrayList9 = new ArrayList(tl1.s(list6, 10));
                                    for (r3c r3cVar4 : list6) {
                                        arrayList9.add(r3cVar4.a);
                                    }
                                    nu4Var3.h(str3, bool4, bool5, arrayList9);
                                    return pvcVar;
                                default:
                                    str4.getClass();
                                    ArrayList arrayList10 = new ArrayList();
                                    for (Object obj7 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj7).a, str4)) {
                                            arrayList10.add(obj7);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList10);
                                    Boolean bool6 = Boolean.FALSE;
                                    List<r3c> list7 = (List) aw7Var22.getValue();
                                    ArrayList arrayList11 = new ArrayList(tl1.s(list7, 10));
                                    for (r3c r3cVar5 : list7) {
                                        arrayList11.add(r3cVar5.a);
                                    }
                                    nu4Var3.h(str3, bool6, bool6, arrayList11);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var2.o0(P6);
                }
                i11 = i20;
                j(list4, true, y2, (xt4) P6, rv4Var2, 432, 0);
                rv4Var2.q(r11);
            } else {
                i11 = i8;
                rv4Var2.e0(-1257538002);
                rv4Var2.q(r11);
            }
            Object P7 = rv4Var2.P();
            if (P7 == lh9Var) {
                ArrayList arrayList5 = new ArrayList();
                for (Object obj4 : list) {
                    r3c r3cVar3 = (r3c) obj4;
                    if (r3cVar3.b == 2 && !r3cVar3.c) {
                        arrayList5.add(obj4);
                    }
                }
                P7 = yae.z(arrayList5);
                rv4Var2.o0(P7);
            }
            final aw7 aw7Var3 = (aw7) P7;
            if (!((List) aw7Var3.getValue()).isEmpty()) {
                rv4Var2.e0(-1257273572);
                b(yqe.A((y3b) b3b.m.getValue(), rv4Var2), nq7Var2, rv4Var2, r11);
                List list5 = (List) aw7Var3.getValue();
                nq7 y3 = zbe.y(kq7Var, f);
                if ((i7 & 7168) == 2048) {
                    z7 = true;
                } else {
                    z7 = r11;
                }
                if (i11 == 4) {
                    z8 = true;
                } else {
                    z8 = r11;
                }
                boolean z12 = z7 | z8;
                Object P8 = rv4Var2.P();
                if (z12 || P8 == lh9Var) {
                    P8 = new xt4() { // from class: vn7
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj32) {
                            int i202 = i10;
                            pvc pvcVar = pvc.a;
                            aw7 aw7Var22 = aw7Var3;
                            String str3 = str2;
                            nu4 nu4Var3 = nu4Var2;
                            String str4 = (String) obj32;
                            switch (i202) {
                                case 0:
                                    str4.getClass();
                                    ArrayList arrayList42 = new ArrayList();
                                    for (Object obj42 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj42).a, str4)) {
                                            arrayList42.add(obj42);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList42);
                                    Boolean bool = Boolean.TRUE;
                                    List<r3c> list42 = (List) aw7Var22.getValue();
                                    ArrayList arrayList52 = new ArrayList(tl1.s(list42, 10));
                                    for (r3c r3cVar22 : list42) {
                                        arrayList52.add(r3cVar22.a);
                                    }
                                    nu4Var3.h(str3, bool, bool, arrayList52);
                                    return pvcVar;
                                case 1:
                                    str4.getClass();
                                    ArrayList arrayList6 = new ArrayList();
                                    for (Object obj5 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj5).a, str4)) {
                                            arrayList6.add(obj5);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList6);
                                    Boolean bool2 = Boolean.FALSE;
                                    Boolean bool3 = Boolean.TRUE;
                                    List<r3c> list52 = (List) aw7Var22.getValue();
                                    ArrayList arrayList7 = new ArrayList(tl1.s(list52, 10));
                                    for (r3c r3cVar32 : list52) {
                                        arrayList7.add(r3cVar32.a);
                                    }
                                    nu4Var3.h(str3, bool2, bool3, arrayList7);
                                    return pvcVar;
                                case 2:
                                    str4.getClass();
                                    ArrayList arrayList8 = new ArrayList();
                                    for (Object obj6 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj6).a, str4)) {
                                            arrayList8.add(obj6);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList8);
                                    Boolean bool4 = Boolean.TRUE;
                                    Boolean bool5 = Boolean.FALSE;
                                    List<r3c> list6 = (List) aw7Var22.getValue();
                                    ArrayList arrayList9 = new ArrayList(tl1.s(list6, 10));
                                    for (r3c r3cVar4 : list6) {
                                        arrayList9.add(r3cVar4.a);
                                    }
                                    nu4Var3.h(str3, bool4, bool5, arrayList9);
                                    return pvcVar;
                                default:
                                    str4.getClass();
                                    ArrayList arrayList10 = new ArrayList();
                                    for (Object obj7 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj7).a, str4)) {
                                            arrayList10.add(obj7);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList10);
                                    Boolean bool6 = Boolean.FALSE;
                                    List<r3c> list7 = (List) aw7Var22.getValue();
                                    ArrayList arrayList11 = new ArrayList(tl1.s(list7, 10));
                                    for (r3c r3cVar5 : list7) {
                                        arrayList11.add(r3cVar5.a);
                                    }
                                    nu4Var3.h(str3, bool6, bool6, arrayList11);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var2.o0(P8);
                }
                j(list5, true, y3, (xt4) P8, rv4Var2, 432, 0);
                rv4Var2.q(r11);
            } else {
                rv4Var2.e0(-1256610482);
                rv4Var2.q(r11);
            }
            Object P9 = rv4Var2.P();
            if (P9 == lh9Var) {
                ArrayList arrayList6 = new ArrayList();
                for (Object obj5 : list) {
                    r3c r3cVar4 = (r3c) obj5;
                    if (r3cVar4.b == 1 && !r3cVar4.c) {
                        arrayList6.add(obj5);
                    }
                }
                z3 = true;
                P9 = yae.z(arrayList6);
                rv4Var2.o0(P9);
            } else {
                z3 = true;
            }
            final aw7 aw7Var4 = (aw7) P9;
            if (!((List) aw7Var4.getValue()).isEmpty()) {
                rv4Var2.e0(-1256344347);
                b(yqe.A((y3b) b3b.o.getValue(), rv4Var2), nq7Var2, rv4Var2, r11);
                List list6 = (List) aw7Var4.getValue();
                nq7 y4 = zbe.y(kq7Var, f);
                if ((i7 & 7168) == 2048) {
                    z5 = z3;
                } else {
                    z5 = r11;
                }
                if (i11 == 4) {
                    z6 = z3;
                } else {
                    z6 = r11;
                }
                boolean z13 = z6 | z5;
                Object P10 = rv4Var2.P();
                if (z13 || P10 == lh9Var) {
                    P10 = new xt4() { // from class: vn7
                        @Override // defpackage.xt4
                        public final Object invoke(Object obj32) {
                            int i202 = i10;
                            pvc pvcVar = pvc.a;
                            aw7 aw7Var22 = aw7Var4;
                            String str3 = str2;
                            nu4 nu4Var3 = nu4Var2;
                            String str4 = (String) obj32;
                            switch (i202) {
                                case 0:
                                    str4.getClass();
                                    ArrayList arrayList42 = new ArrayList();
                                    for (Object obj42 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj42).a, str4)) {
                                            arrayList42.add(obj42);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList42);
                                    Boolean bool = Boolean.TRUE;
                                    List<r3c> list42 = (List) aw7Var22.getValue();
                                    ArrayList arrayList52 = new ArrayList(tl1.s(list42, 10));
                                    for (r3c r3cVar22 : list42) {
                                        arrayList52.add(r3cVar22.a);
                                    }
                                    nu4Var3.h(str3, bool, bool, arrayList52);
                                    return pvcVar;
                                case 1:
                                    str4.getClass();
                                    ArrayList arrayList62 = new ArrayList();
                                    for (Object obj52 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj52).a, str4)) {
                                            arrayList62.add(obj52);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList62);
                                    Boolean bool2 = Boolean.FALSE;
                                    Boolean bool3 = Boolean.TRUE;
                                    List<r3c> list52 = (List) aw7Var22.getValue();
                                    ArrayList arrayList7 = new ArrayList(tl1.s(list52, 10));
                                    for (r3c r3cVar32 : list52) {
                                        arrayList7.add(r3cVar32.a);
                                    }
                                    nu4Var3.h(str3, bool2, bool3, arrayList7);
                                    return pvcVar;
                                case 2:
                                    str4.getClass();
                                    ArrayList arrayList8 = new ArrayList();
                                    for (Object obj6 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj6).a, str4)) {
                                            arrayList8.add(obj6);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList8);
                                    Boolean bool4 = Boolean.TRUE;
                                    Boolean bool5 = Boolean.FALSE;
                                    List<r3c> list62 = (List) aw7Var22.getValue();
                                    ArrayList arrayList9 = new ArrayList(tl1.s(list62, 10));
                                    for (r3c r3cVar42 : list62) {
                                        arrayList9.add(r3cVar42.a);
                                    }
                                    nu4Var3.h(str3, bool4, bool5, arrayList9);
                                    return pvcVar;
                                default:
                                    str4.getClass();
                                    ArrayList arrayList10 = new ArrayList();
                                    for (Object obj7 : (List) aw7Var22.getValue()) {
                                        if (!c16.i(((r3c) obj7).a, str4)) {
                                            arrayList10.add(obj7);
                                        }
                                    }
                                    aw7Var22.setValue(arrayList10);
                                    Boolean bool6 = Boolean.FALSE;
                                    List<r3c> list7 = (List) aw7Var22.getValue();
                                    ArrayList arrayList11 = new ArrayList(tl1.s(list7, 10));
                                    for (r3c r3cVar5 : list7) {
                                        arrayList11.add(r3cVar5.a);
                                    }
                                    nu4Var3.h(str3, bool6, bool6, arrayList11);
                                    return pvcVar;
                            }
                        }
                    };
                    rv4Var2.o0(P10);
                }
                z4 = z3;
                j(list6, true, y4, (xt4) P10, rv4Var2, 432, 0);
                rv4Var2.q(r11);
            } else {
                z4 = z3;
                rv4Var2.e0(-1255689906);
                rv4Var2.q(r11);
            }
            rv4Var2.q(z4);
            rv4Var2.q(z4);
        } else {
            str2 = str;
            nu4Var2 = nu4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new wp0(str2, list, nq7Var, nu4Var2, vt4Var, i);
        }
    }

    public static lyc l(String str) {
        String str2 = hn8.b;
        StringBuilder sb = new StringBuilder();
        sb.append("file");
        sb.append(':');
        if (str != null) {
            sb.append(str);
        }
        return new lyc(sb.toString(), str2, "file", null, str);
    }

    public static final ArrayList m(int i, int i2, int i3) {
        int i4;
        int i5 = i - ((i2 - 1) * i3);
        int i6 = i5 / i2;
        int i7 = i5 % i2;
        ArrayList arrayList = new ArrayList(i2);
        for (int i8 = 0; i8 < i2; i8++) {
            if (i8 < i7) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            arrayList.add(Integer.valueOf(i4 + i6));
        }
        return arrayList;
    }

    public static Intent n(Intent intent, smc smcVar, int i) {
        Intent intent2 = new Intent(smcVar.a, InvisibleActionTrampolineActivity.class);
        intent2.setData(p(smcVar, i, 2, ""));
        intent2.putExtra("ACTION_TYPE", "BROADCAST");
        intent2.putExtra("ACTION_INTENT", intent);
        return intent2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void o(defpackage.n42 r4) {
        /*
            boolean r0 = r4 instanceof defpackage.d03
            if (r0 == 0) goto L13
            r0 = r4
            d03 r0 = (defpackage.d03) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            d03 r0 = new d03
            r0.<init>(r4)
        L18:
            java.lang.Object r4 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2b
            if (r1 == r2) goto L27
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return
        L27:
            defpackage.hre.r(r4)
            goto L45
        L2b:
            defpackage.hre.r(r4)
            r0.b = r2
            f61 r4 = new f61
            m42 r0 = defpackage.w92.t(r0)
            r4.<init>(r2, r0)
            r4.u()
            java.lang.Object r4 = r4.s()
            n82 r0 = defpackage.n82.a
            if (r4 != r0) goto L45
            return
        L45:
            defpackage.ls2.c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.o(n42):void");
    }

    public static final Uri p(smc smcVar, int i, int i2, String str) {
        String str2;
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("glance-action");
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 == 5) {
                            str2 = "CALLBACK";
                        } else {
                            throw null;
                        }
                    } else {
                        str2 = "FOREGROUND_SERVICE";
                    }
                } else {
                    str2 = "SERVICE";
                }
            } else {
                str2 = "BROADCAST";
            }
        } else {
            str2 = "ACTIVITY";
        }
        builder.path(str2);
        builder.appendQueryParameter("appWidgetId", String.valueOf(smcVar.b));
        builder.appendQueryParameter("viewId", String.valueOf(i));
        builder.appendQueryParameter("viewSize", ug3.c(smcVar.j));
        builder.appendQueryParameter("extraData", str);
        if (smcVar.f) {
            builder.appendQueryParameter("lazyCollection", String.valueOf(smcVar.k));
            builder.appendQueryParameter("lazeViewItem", String.valueOf(-1));
        }
        return builder.build();
    }

    public static final Object q(long j, m42 m42Var) {
        if (j > 0) {
            f61 f61Var = new f61(1, w92.t(m42Var));
            f61Var.u();
            if (j < Long.MAX_VALUE) {
                s(f61Var.e).q(j, f61Var);
            }
            Object s = f61Var.s();
            if (s == n82.a) {
                return s;
            }
        }
        return pvc.a;
    }

    public static final Object r(long j, m42 m42Var) {
        Object q = q(z(j), m42Var);
        if (q == n82.a) {
            return q;
        }
        return pvc.a;
    }

    public static final c03 s(d82 d82Var) {
        c03 c03Var;
        b82 b82Var = d82Var.get(abf.d);
        if (b82Var instanceof c03) {
            c03Var = (c03) b82Var;
        } else {
            c03Var = null;
        }
        if (c03Var == null) {
            return st2.a;
        }
        return c03Var;
    }

    public static final String t(lyc lycVar) {
        List u = u(lycVar);
        String str = lycVar.b;
        if (u.isEmpty()) {
            return null;
        }
        String str2 = lycVar.e;
        str2.getClass();
        if (!r4b.Q(str2, str, false)) {
            str = "";
        }
        return sl1.i0(u, lycVar.b, str, null, null, 60);
    }

    public static final List u(lyc lycVar) {
        String str = lycVar.e;
        if (str == null) {
            return ks3.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int f0 = k4b.f0(str, '/', i2, 4);
            if (f0 == -1) {
                f0 = str.length();
            }
            String substring = str.substring(i2, f0);
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
            i = f0;
        }
        return arrayList;
    }

    public static final void v(Activity activity, Intent intent) {
        StrictMode.VmPolicy build;
        Parcelable parcelableExtra = intent.getParcelableExtra("ACTION_INTENT");
        if (parcelableExtra != null) {
            Intent intent2 = (Intent) parcelableExtra;
            if (intent.hasExtra("android.widget.extra.CHECKED")) {
                intent2.putExtra("android.widget.extra.CHECKED", intent.getBooleanExtra("android.widget.extra.CHECKED", false));
            }
            String stringExtra = intent.getStringExtra("ACTION_TYPE");
            if (stringExtra != null) {
                s5 s5Var = new s5(stringExtra, activity, intent2, intent.getBundleExtra("ACTIVITY_OPTIONS"), 0);
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                if (Build.VERSION.SDK_INT >= 31) {
                    build = q1b.a.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build();
                } else {
                    build = new StrictMode.VmPolicy.Builder().build();
                }
                StrictMode.setVmPolicy(build);
                s5Var.invoke();
                StrictMode.setVmPolicy(vmPolicy);
                activity.finish();
                return;
            }
            vs.m("List adapter activity trampoline invoked without trampoline type");
            return;
        }
        vs.m("List adapter activity trampoline invoked without specifying target intent.");
    }

    public static final String w(String str, byte[] bArr) {
        int length = str.length();
        int max = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= max) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return r4b.G(0, bArr, i2, 5);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String substring = str.substring(i + 1, i3);
                    nqe.u(16);
                    bArr[i2] = (byte) Integer.parseInt(substring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Type inference failed for: r4v4, types: [byte[], java.io.Serializable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.io.Serializable x(defpackage.oh5 r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.hj9
            if (r0 == 0) goto L13
            r0 = r5
            hj9 r0 = (defpackage.hj9) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            hj9 r0 = new hj9
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.a
            int r1 = r0.b
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r5)
            goto L3e
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r5)
            s11 r4 = r4.b()
            r0.b = r2
            java.lang.Object r5 = defpackage.v9e.J(r4, r0)
            n82 r4 = defpackage.n82.a
            if (r5 != r4) goto L3e
            return r4
        L3e:
            psa r5 = (defpackage.psa) r5
            r5.getClass()
            r4 = -1
            byte[] r4 = defpackage.pbe.n(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.x(oh5, n42):java.io.Serializable");
    }

    public static final pq2 y(r13 r13Var) {
        return new pq2(new g99(r13Var));
    }

    public static final long z(long j) {
        boolean z;
        hq7 hq7Var = wl3.b;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return wl3.e(wl3.h(j, jue.P(999999L, am3.NANOSECONDS)));
        }
        if (!z) {
            return 0L;
        }
        xk5.o();
        return 0L;
    }
}
