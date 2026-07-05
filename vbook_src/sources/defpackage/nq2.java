package defpackage;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.WeakHashMap;
import org.json.JSONObject;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nq2  reason: default package */
/* loaded from: classes3.dex */
public abstract class nq2 {
    public static final tu1 a = new tu1(new mv1(16), false, -781142669);
    public static final tu1 b = new tu1(new mv1(17), false, -2069077114);
    public static final tu1 c = new tu1(new mv1(18), false, -1178002492);

    public static int A(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
            if (lastPathSegment.endsWith(".ac4")) {
                return 1;
            }
            if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                if (lastPathSegment.endsWith(".amr")) {
                    return 3;
                }
                if (lastPathSegment.endsWith(".flac")) {
                    return 4;
                }
                if (lastPathSegment.endsWith(".flv")) {
                    return 5;
                }
                if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                    if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                        if (lastPathSegment.endsWith(".mp3")) {
                            return 7;
                        }
                        if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                            if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                    if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                        if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                            if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                    if (lastPathSegment.endsWith(".avi")) {
                                                        return 16;
                                                    }
                                                    if (lastPathSegment.endsWith(".png")) {
                                                        return 17;
                                                    }
                                                    if (lastPathSegment.endsWith(".webp")) {
                                                        return 18;
                                                    }
                                                    if (!lastPathSegment.endsWith(".bmp") && !lastPathSegment.endsWith(".dib")) {
                                                        if (!lastPathSegment.endsWith(".heic") && !lastPathSegment.endsWith(".heif")) {
                                                            if (!lastPathSegment.endsWith(".avif")) {
                                                                return -1;
                                                            }
                                                            return 21;
                                                        }
                                                        return 20;
                                                    }
                                                    return 19;
                                                }
                                                return 14;
                                            }
                                            return 13;
                                        }
                                        return 12;
                                    }
                                    return 11;
                                }
                                return 10;
                            }
                            return 9;
                        }
                        return 8;
                    }
                    return 6;
                }
                return 15;
            }
            return 2;
        }
        return 0;
    }

    public static d82 B(b82 b82Var, c82 c82Var) {
        c82Var.getClass();
        if (c16.i(b82Var.getKey(), c82Var)) {
            return gs3.a;
        }
        return b82Var;
    }

    public static d82 C(b82 b82Var, d82 d82Var) {
        d82Var.getClass();
        if (d82Var == gs3.a) {
            return b82Var;
        }
        return (d82) d82Var.fold(b82Var, new tv1(25));
    }

    public static final String D(m42 m42Var) {
        Object gs9Var;
        if (m42Var instanceof ta3) {
            return ((ta3) m42Var).toString();
        }
        try {
            gs9Var = m42Var + '@' + y(m42Var);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (hs9.a(gs9Var) != null) {
            gs9Var = m42Var.getClass().getName() + '@' + y(m42Var);
        }
        return (String) gs9Var;
    }

    public static final void E(r09 r09Var, long j, xt4 xt4Var, boolean z) {
        MotionEvent a2 = r09Var.a();
        if (a2 != null) {
            int action = a2.getAction();
            if (z) {
                a2.setAction(3);
            }
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            a2.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            xt4Var.invoke(a2);
            a2.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            a2.setAction(action);
            return;
        }
        vs.m("The PointerEvent receiver cannot have a null MotionEvent.");
    }

    public static final void F(rv4 rv4Var, nq7 nq7Var, int i, r13 r13Var, un6 un6Var, ty9 ty9Var, tc6 tc6Var, xt8 xt8Var) {
        rw1.k.getClass();
        jce.F(qw1.e, rv4Var, xt8Var);
        jce.F(np.C, rv4Var, nq7Var);
        jce.F(np.D, rv4Var, r13Var);
        jce.F(np.E, rv4Var, un6Var);
        jce.F(np.F, rv4Var, ty9Var);
        jce.F(np.G, rv4Var, tc6Var);
        jce.F(qw1.g, rv4Var, Integer.valueOf(i));
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Exception, dzd] */
    public static dzd G(Exception exc, String str, String str2) {
        String message = exc.getMessage();
        StringBuilder y = nk2.y("Failed to parse ", str, " for string [", str2, "] with exception: ");
        y.append(message);
        Log.e(str, y.toString());
        return new Exception(hl5.o("Failed to parse ", str, " for string [", str2, "]"), exc);
    }

    public static void H(JSONObject jSONObject, String str, String str2) {
        jSONObject.put(str, str2);
        jSONObject.put("recaptchaVersion", "RECAPTCHA_ENTERPRISE");
        jSONObject.put("clientType", "CLIENT_TYPE_ANDROID");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.xt4 r18, defpackage.nq7 r19, defpackage.xt4 r20, defpackage.xt4 r21, defpackage.xt4 r22, defpackage.rv4 r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nq2.a(xt4, nq7, xt4, xt4, xt4, rv4, int, int):void");
    }

    public static final void b(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-910578932);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            nq7 y = zbe.y(nq7Var, 24.0f);
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) o2b.k0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 0, 0, 130046);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            nq7Var2 = nq7Var;
            z1d.f(rp5.c((wk3) jk3.E.getValue(), rv4Var2, 0), yqe.A((y3b) v1b.f.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i5 << 21) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var2, vt4Var, i, 8);
        }
    }

    public static final void c(int i, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        Object gs9Var;
        rv4Var.g0(1319969574);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i4 | i6;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                int length = str.length();
                P = yae.z(new jub(upperCase, sze.a(length, length), 4));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            boolean f = rv4Var.f(((jub) aw7Var.getValue()).a.b);
            Object P2 = rv4Var.P();
            if (f || P2 == lh9Var) {
                try {
                    gs9Var = new zl1(kve.v(((jub) aw7Var.getValue()).a.b));
                } catch (Throwable th) {
                    gs9Var = new gs9(th);
                }
                P2 = Boolean.valueOf(gs9Var instanceof gs9);
                rv4Var.o0(P2);
            }
            boolean booleanValue = ((Boolean) P2).booleanValue();
            xb.d(z, xt4Var, jce.E(7218002, new me7(booleanValue, xt4Var2, aw7Var, 0), rv4Var), null, mwe.x(kq7.a, 14), jce.E(-1446248465, new id1(xt4Var, 12, (byte) 0), rv4Var), fxe.c, null, 0L, 0L, nae.e, false, false, jce.E(540786682, new ne7(booleanValue, aw7Var, 0), rv4Var), rv4Var, (i7 & 14) | 1769904, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i24(z, str, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void d(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        float f;
        boolean z4;
        Object obj2;
        float f2;
        aw7 aw7Var;
        Object obj3;
        rv4Var.g0(-200283908);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            aw7 D = yae.D(xt4Var, rv4Var);
            if ((i7 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj4 = ax1.a;
            Object obj5 = P;
            if (z2 || P == obj4) {
                Object z5 = yae.z(ese.t(kve.v(str)));
                rv4Var.o0(z5);
                obj5 = z5;
            }
            aw7 aw7Var2 = (aw7) obj5;
            boolean f3 = rv4Var.f((na5) aw7Var2.getValue());
            Object P2 = rv4Var.P();
            Object obj6 = P2;
            if (f3 || P2 == obj4) {
                Object z6 = yae.z(new zl1(hse.o((na5) aw7Var2.getValue())));
                rv4Var.o0(z6);
                obj6 = z6;
            }
            aw7 aw7Var3 = (aw7) obj6;
            Object P3 = rv4Var.P();
            Object obj7 = P3;
            if (P3 == obj4) {
                Object z7 = yae.z(Boolean.FALSE);
                rv4Var.o0(z7);
                obj7 = z7;
            }
            aw7 aw7Var4 = (aw7) obj7;
            Object P4 = rv4Var.P();
            Object obj8 = P4;
            if (P4 == obj4) {
                Object i8 = bce.i();
                rv4Var.o0(i8);
                obj8 = i8;
            }
            tg9 tg9Var = (tg9) obj8;
            nq7 A = zbe.A(nq7Var, 24.0f, nae.e, 2);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
            rw1.k.getClass();
            vt4 vt4Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 f4 = pna.f(kq7Var, 1.0f);
            mk0 mk0Var = kh5.F;
            dz dzVar = lz.a;
            gv9 a3 = ev9.a(dzVar, mk0Var, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f4);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            nq7 n = pna.n(kq7Var, 56.0f);
            f99 f99Var = j27.a;
            nq7 k = tte.k(n, ((h27) rv4Var.j(f99Var)).c.c);
            long j = ((zl1) aw7Var3.getValue()).a;
            ba5 ba5Var = lre.g;
            nq7 v = nmd.v(k, j, ba5Var);
            boolean f5 = rv4Var.f(aw7Var2) | rv4Var.h(tg9Var);
            Object P5 = rv4Var.P();
            if (!f5 && P5 != obj4) {
                z3 = false;
                obj = P5;
            } else {
                z3 = false;
                Object qe7Var = new qe7(tg9Var, aw7Var2, 0);
                rv4Var.o0(qe7Var);
                obj = qe7Var;
            }
            nq7 f6 = lbe.f(15, (vt4) obj, v, null, z3);
            b37 d = fu0.d(kh5.e, z3);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f6);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            nk5.a(rp5.c((wk3) ok3.q0.getValue(), rv4Var, 0), null, null, rm1.b(((zl1) aw7Var3.getValue()).a, rv4Var), rv4Var, 48, 4);
            s21.x(rv4Var, true, kq7Var, 16.0f, rv4Var);
            pj1 pj1Var = (pj1) rv4Var.j(dy1.f);
            Object P6 = rv4Var.P();
            Object obj9 = P6;
            if (P6 == obj4) {
                Object s = yte.s(rv4Var);
                rv4Var.o0(s);
                obj9 = s;
            }
            m82 m82Var = (m82) obj9;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            nq7 v2 = nmd.v(tte.k(pna.h(new we6(f, true), 56.0f), ((h27) rv4Var.j(f99Var)).c.c), rm1.g(((h27) rv4Var.j(f99Var)).a, 6.0f), ba5Var);
            Object P7 = rv4Var.P();
            Object obj10 = P7;
            if (P7 == obj4) {
                Object nd7Var = new nd7(aw7Var4, 11);
                rv4Var.o0(nd7Var);
                obj10 = nd7Var;
            }
            nq7 A2 = zbe.A(lbe.f(15, (vt4) obj10, v2, null, false), 12.0f, nae.e, 2);
            gv9 a4 = ev9.a(dzVar, kh5.G, rv4Var, 48);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, A2);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p4);
            boolean e = rv4Var.e(((zl1) aw7Var3.getValue()).a);
            Object P8 = rv4Var.P();
            if (!e && P8 != obj4) {
                z4 = false;
                obj2 = P8;
            } else {
                z4 = false;
                Object upperCase = kve.A(((zl1) aw7Var3.getValue()).a, true, false).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                rv4Var.o0(upperCase);
                obj2 = upperCase;
            }
            String str2 = (String) obj2;
            oyb oybVar = ((h27) rv4Var.j(f99Var)).b.h;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            boolean z8 = z4;
            cvb.c(str2, new we6(f2, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131068);
            ar5 c2 = rp5.c((wk3) jk3.C.getValue(), rv4Var, z8 ? 1 : 0);
            nq7 n2 = pna.n(kq7Var, 44.0f);
            su9 su9Var = uu9.a;
            nq7 k2 = tte.k(n2, su9Var);
            boolean h = rv4Var.h(m82Var) | rv4Var.h(pj1Var) | rv4Var.f(aw7Var3);
            Object P9 = rv4Var.P();
            Object obj11 = P9;
            if (h || P9 == obj4) {
                Object re7Var = new re7(m82Var, pj1Var, aw7Var3, z8 ? 1 : 0);
                rv4Var.o0(re7Var);
                obj11 = re7Var;
            }
            nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) obj11, k2, null, z8), 10.0f), 0L, rv4Var, 48, 8);
            ar5 c3 = rp5.c((wk3) ok3.j0.getValue(), rv4Var, z8 ? 1 : 0);
            nq7 k3 = tte.k(pna.n(kq7Var, 44.0f), su9Var);
            boolean f7 = rv4Var.f(D) | rv4Var.f(aw7Var3);
            Object P10 = rv4Var.P();
            Object obj12 = P10;
            if (f7 || P10 == obj4) {
                Object he1Var = new he1(D, aw7Var3, 12);
                rv4Var.o0(he1Var);
                obj12 = he1Var;
            }
            nk5.a(c3, null, zbe.y(lbe.f(15, (vt4) obj12, k3, null, z8), 10.0f), 0L, rv4Var, 48, 8);
            xbe.i(rv4Var, hl5.e(rv4Var, true, true, kq7Var, 16.0f));
            na5 na5Var = (na5) aw7Var2.getValue();
            nq7 h2 = pna.h(pna.f(kq7Var, 1.0f), 280.0f);
            boolean f8 = rv4Var.f(aw7Var3);
            Object P11 = rv4Var.P();
            Object obj13 = P11;
            if (f8 || P11 == obj4) {
                Object d07Var = new d07(aw7Var3, 22);
                rv4Var.o0(d07Var);
                obj13 = d07Var;
            }
            rte.g(h2, na5Var, false, (xt4) obj13, rv4Var, 390);
            xbe.i(rv4Var, pna.h(kq7Var, 16.0f));
            String A3 = yqe.A((y3b) b3b.F.getValue(), rv4Var);
            boolean f9 = rv4Var.f(D) | rv4Var.f(aw7Var3);
            Object P12 = rv4Var.P();
            Object obj14 = P12;
            if (f9 || P12 == obj4) {
                Object he1Var2 = new he1(D, aw7Var3, 11);
                rv4Var.o0(he1Var2);
                obj14 = he1Var2;
            }
            z1d.f(null, A3, false, null, null, null, null, null, (vt4) obj14, rv4Var, 0, 253);
            xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
            rv4Var.q(true);
            boolean booleanValue = ((Boolean) aw7Var4.getValue()).booleanValue();
            boolean e2 = rv4Var.e(((zl1) aw7Var3.getValue()).a);
            Object P13 = rv4Var.P();
            Object obj15 = P13;
            if (e2 || P13 == obj4) {
                Object A4 = kve.A(((zl1) aw7Var3.getValue()).a, true, false);
                rv4Var.o0(A4);
                obj15 = A4;
            }
            String str3 = (String) obj15;
            Object P14 = rv4Var.P();
            if (P14 == obj4) {
                aw7Var = aw7Var4;
                Object d07Var2 = new d07(aw7Var, 18);
                rv4Var.o0(d07Var2);
                obj3 = d07Var2;
            } else {
                aw7Var = aw7Var4;
                obj3 = P14;
            }
            xt4 xt4Var2 = (xt4) obj3;
            boolean f10 = rv4Var.f(aw7Var2);
            Object P15 = rv4Var.P();
            Object obj16 = P15;
            if (f10 || P15 == obj4) {
                Object pr0Var = new pr0(aw7Var2, aw7Var, 16);
                rv4Var.o0(pr0Var);
                obj16 = pr0Var;
            }
            c(384, xt4Var2, (xt4) obj16, rv4Var, str3, booleanValue);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ge7(str, nq7Var, xt4Var, i);
        }
    }

    public static final void e(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(172282907);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var2)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i5 = i4 | i3;
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            rv4Var2.e0(-889173107);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            boolean z2 = false;
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, null, rv4Var, 0, 0, 261118);
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var, pna.h(kq7Var, 24.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var), false, null, null, null, null, null, vt4Var, rv4Var, 100663296, 252);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var2, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 7168) == 2048) {
                z2 = true;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new ge5(21, vt4Var2);
                rv4Var2.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var2, 0, 4);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(str, nq7Var, vt4Var, vt4Var2, i, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v22, types: [int] */
    /* JADX WARN: Type inference failed for: r3v68 */
    /* JADX WARN: Type inference failed for: r3v74 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [boolean, int] */
    public static final void f(String str, String str2, String str3, String str4, nq7 nq7Var, boolean z, nu4 nu4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        aw7 aw7Var;
        aw7 aw7Var2;
        int i10;
        ?? r8;
        aw7 aw7Var3;
        boolean z6;
        aw7 aw7Var4;
        lh9 lh9Var;
        aw7 aw7Var5;
        kq7 kq7Var;
        kd4 kd4Var;
        rv4 rv4Var2;
        rv4 rv4Var3;
        ?? r3;
        boolean z7;
        boolean z8;
        lh9 lh9Var2;
        aw7 aw7Var6;
        int i11;
        int i12;
        int i13;
        kq7 kq7Var2;
        aw7 aw7Var7;
        int i14;
        rv4 rv4Var4 = rv4Var;
        u22 u22Var = r0f.d;
        rv4Var4.g0(581692067);
        if (rv4Var4.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i15 = i | i2;
        if (rv4Var4.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i16 = i15 | i3;
        if (rv4Var4.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i17 = i16 | i4;
        if (rv4Var4.f(str4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i18 = i17 | i5;
        if (rv4Var4.f(nq7Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i19 = i18 | i6;
        if (rv4Var4.g(z)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i20 = i19 | i7;
        if (rv4Var4.h(nu4Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i21 = i20 | i8;
        if (rv4Var4.h(vt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i22 = i21 | i9;
        if ((i22 & 4793491) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var4.U(i22 & 1, z2)) {
            Object[] objArr = new Object[0];
            int i23 = i22 & Token.ASSIGN_MOD;
            if (i23 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var4.P();
            lh9 lh9Var3 = ax1.a;
            if (z3 || P == lh9Var3) {
                P = new v85(str2, 6);
                rv4Var4.o0(P);
            }
            aw7 aw7Var8 = (aw7) zpe.k(objArr, (vt4) P, rv4Var4, 0);
            Object[] objArr2 = new Object[0];
            if ((i22 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P2 = rv4Var4.P();
            if (z4 || P2 == lh9Var3) {
                P2 = new v85(str3, 7);
                rv4Var4.o0(P2);
            }
            aw7 aw7Var9 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var4, 0);
            Object[] objArr3 = new Object[0];
            if ((i22 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P3 = rv4Var4.P();
            if (z5 || P3 == lh9Var3) {
                P3 = new v85(str4, 8);
                rv4Var4.o0(P3);
            }
            aw7 aw7Var10 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var4, 0);
            Object P4 = rv4Var4.P();
            String str5 = null;
            if (P4 == lh9Var3) {
                P4 = yae.z(null);
                rv4Var4.o0(P4);
            }
            aw7 aw7Var11 = (aw7) P4;
            Object P5 = rv4Var4.P();
            if (P5 == lh9Var3) {
                P5 = new d07(aw7Var11, 3);
                rv4Var4.o0(P5);
            }
            kd4 v = w92.v(av8.a, (xt4) P5, rv4Var4, 54);
            Object[] objArr4 = new Object[0];
            Object P6 = rv4Var4.P();
            if (P6 == lh9Var3) {
                P6 = new qx6(11);
                rv4Var4.o0(P6);
            }
            aw7 aw7Var12 = (aw7) zpe.k(objArr4, (vt4) P6, rv4Var4, 48);
            nk0 nk0Var = kh5.a;
            b37 d = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var4.T);
            xt8 l = rv4Var4.l();
            nq7 p = lye.p(rv4Var4, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var4, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var4, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var4, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var4);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var4, p);
            kq7 kq7Var3 = kq7.a;
            nq7 C = rte.C(q1d.l(pu0.a.a(pna.c(kq7Var3, 1.0f), kh5.b), rv4Var4, 0), rte.u(rv4Var4), 14);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var4, 48);
            int hashCode2 = Long.hashCode(rv4Var4.T);
            xt8 l2 = rv4Var4.l();
            nq7 p2 = lye.p(rv4Var4, C);
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(npVar, rv4Var4, a2);
            jce.F(npVar2, rv4Var4, l2);
            s21.t(hashCode2, rv4Var4, npVar3, rv4Var4, kgVar);
            jce.F(npVar4, rv4Var4, p2);
            xbe.i(rv4Var4, pna.h(kq7Var3, 44.0f));
            nq7 p3 = pna.p(kq7Var3, 120.0f, 180.0f);
            tza tzaVar = j27.a;
            nq7 k = tte.k(p3, ((h27) rv4Var4.j(tzaVar)).c.b);
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode3 = Long.hashCode(rv4Var4.T);
            xt8 l3 = rv4Var4.l();
            nq7 p4 = lye.p(rv4Var4, k);
            rv4Var4.i0();
            if (rv4Var4.S) {
                rv4Var4.k(zx1Var);
            } else {
                rv4Var4.r0();
            }
            jce.F(npVar, rv4Var4, d2);
            jce.F(npVar2, rv4Var4, l3);
            s21.t(hashCode3, rv4Var4, npVar3, rv4Var4, kgVar);
            jce.F(npVar4, rv4Var4, p4);
            if (((f76) aw7Var11.getValue()) == null) {
                rv4Var4.e0(-1787742880);
                aw7Var = aw7Var11;
                aw7Var2 = aw7Var9;
                i10 = i22;
                r8 = 1;
                do5.c(str, str2, "", "", u22Var, pna.c, rv4Var4, (i22 & 14) | 224640 | i23);
                rv4Var4.q(false);
                r3 = 0;
                kq7Var = kq7Var3;
                aw7Var5 = aw7Var8;
                aw7Var3 = aw7Var10;
                kd4Var = v;
                aw7Var4 = aw7Var12;
                rv4Var3 = rv4Var4;
                lh9Var = lh9Var3;
            } else {
                aw7Var = aw7Var11;
                aw7Var2 = aw7Var9;
                i10 = i22;
                r8 = 1;
                rv4Var4.e0(-1787360960);
                f76 f76Var = (f76) aw7Var.getValue();
                if (f76Var == null) {
                    rv4Var4.e0(-1787360961);
                    rv4Var4.q(false);
                    z6 = false;
                    kq7Var = kq7Var3;
                    aw7Var5 = aw7Var8;
                    aw7Var3 = aw7Var10;
                    kd4Var = v;
                    aw7Var4 = aw7Var12;
                    rv4Var2 = rv4Var4;
                    lh9Var = lh9Var3;
                } else {
                    rv4Var4.e0(-1787360960);
                    aw7Var3 = aw7Var10;
                    z6 = false;
                    aw7Var4 = aw7Var12;
                    lh9Var = lh9Var3;
                    aw7Var5 = aw7Var8;
                    kq7Var = kq7Var3;
                    kd4Var = v;
                    do5.a(f76Var, u22Var, false, null, null, null, pna.c, null, rv4Var4, 12582960, 892);
                    rv4Var2 = rv4Var4;
                    rv4Var2.q(false);
                }
                rv4Var2.q(z6);
                r3 = z6;
                rv4Var3 = rv4Var2;
            }
            rs8.u(rv4Var3, r8, kq7Var, 8.0f, rv4Var3);
            ar5 c2 = rp5.c((wk3) jk3.P.getValue(), rv4Var3, r3);
            String A = yqe.A((y3b) f2b.W.getValue(), rv4Var3);
            boolean f = rv4Var3.f(kd4Var);
            Object P7 = rv4Var3.P();
            if (f || P7 == lh9Var) {
                P7 = new fe1(kd4Var, 11);
                rv4Var3.o0(P7);
            }
            z1d.f(c2, A, false, null, null, null, null, null, (vt4) P7, rv4Var, 0, 252);
            String str6 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var5);
            v72 v72Var = ((h27) rv4Var.j(tzaVar)).c.b;
            nq7 A2 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, r8), 1.0f), 24.0f, nae.e, 2);
            boolean f2 = rv4Var.f(aw7Var5);
            Object P8 = rv4Var.P();
            if (f2 || P8 == lh9Var) {
                P8 = new d07(aw7Var5, 4);
                rv4Var.o0(P8);
            }
            uwe.h(str6, (xt4) P8, A2, false, false, null, kwe.a, null, null, null, false, null, null, null, false, 0, 0, v72Var, null, rv4Var, 1573248, 0, 6291384);
            String str7 = (String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var2);
            v72 v72Var2 = ((h27) rv4Var.j(tzaVar)).c.b;
            nq7 A3 = zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
            boolean f3 = rv4Var.f(aw7Var2);
            Object P9 = rv4Var.P();
            if (f3 || P9 == lh9Var) {
                P9 = new d07(aw7Var2, 5);
                rv4Var.o0(P9);
            }
            uwe.h(str7, (xt4) P9, A3, false, false, null, kwe.b, null, null, null, false, null, null, null, false, 0, 0, v72Var2, null, rv4Var, 1573248, 0, 6291384);
            boolean f4 = rv4Var.f((String) nk2.p(kq7Var, 12.0f, rv4Var, aw7Var3));
            Object P10 = rv4Var.P();
            String str8 = P10;
            if (f4 || P10 == lh9Var) {
                String str9 = "";
                String str10 = str9;
                if (((String) aw7Var3.getValue()).length() != 0) {
                    mv6 e = vve.e((String) aw7Var3.getValue());
                    if (e != null) {
                        str5 = e.c(vve.f());
                    }
                    if (str5 != null) {
                        str9 = str5;
                    }
                    str10 = rs8.l(str9, " (", (String) aw7Var3.getValue(), ")");
                }
                rv4Var.o0(str10);
                str8 = str10;
            }
            String str11 = (String) str8;
            String A4 = yqe.A((y3b) x2b.I.getValue(), rv4Var);
            boolean f5 = rv4Var.f(aw7Var4);
            Object P11 = rv4Var.P();
            if (f5 || P11 == lh9Var) {
                P11 = new ea4(aw7Var4, 29);
                rv4Var.o0(P11);
            }
            aw7 aw7Var13 = aw7Var3;
            lh9 lh9Var4 = lh9Var;
            aw7 aw7Var14 = aw7Var4;
            kq7 kq7Var4 = kq7Var;
            twe.e(3072, (vt4) P11, rv4Var, zbe.A(pna.f(pna.u(kq7Var, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2), str11, A4, null);
            rv4 rv4Var5 = rv4Var;
            xbe.i(rv4Var5, pna.h(kq7Var4, 12.0f));
            if (z) {
                rv4Var5.e0(-1548925816);
                eg0.f(pna.n(kq7Var4, 28.0f), ((h27) rv4Var5.j(tzaVar)).a.d, null, rv4Var, 6, 4);
                rv4Var5 = rv4Var;
                rv4Var5.q(false);
                aw7Var6 = aw7Var13;
                i12 = 0;
                kq7Var2 = kq7Var4;
                aw7Var7 = aw7Var14;
                i13 = 8388608;
                lh9Var2 = lh9Var4;
                i11 = 2;
            } else {
                rv4Var5.e0(-1548702957);
                ar5 c3 = rp5.c((wk3) ok3.j0.getValue(), rv4Var5, 0);
                String A5 = yqe.A((y3b) s2b.E0.getValue(), rv4Var5);
                if (((String) aw7Var5.getValue()).length() > 0 && ((String) aw7Var13.getValue()).length() > 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                nq7 A6 = zbe.A(pna.f(pna.u(kq7Var4, nae.e, 420.0f, 1), 1.0f), 24.0f, nae.e, 2);
                if ((3670016 & i10) == 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean f6 = z8 | rv4Var5.f(aw7Var5) | rv4Var5.f(aw7Var2) | rv4Var5.f(aw7Var13);
                Object P12 = rv4Var5.P();
                if (!f6) {
                    lh9Var2 = lh9Var4;
                    if (P12 != lh9Var2) {
                        aw7Var6 = aw7Var13;
                        i11 = 2;
                        i12 = 0;
                        i13 = 8388608;
                        kq7Var2 = kq7Var4;
                        boolean z9 = z7;
                        aw7Var7 = aw7Var14;
                        z1d.f(c3, A5, z9, null, A6, null, null, null, (vt4) P12, rv4Var5, 24576, 232);
                        rv4Var5.q(false);
                    }
                } else {
                    lh9Var2 = lh9Var4;
                }
                P12 = new mc3(nu4Var, aw7Var5, aw7Var2, aw7Var13, aw7Var, 5);
                aw7Var6 = aw7Var13;
                rv4Var5.o0(P12);
                i11 = 2;
                i12 = 0;
                i13 = 8388608;
                kq7Var2 = kq7Var4;
                boolean z92 = z7;
                aw7Var7 = aw7Var14;
                z1d.f(c3, A5, z92, null, A6, null, null, null, (vt4) P12, rv4Var5, 24576, 232);
                rv4Var5.q(false);
            }
            rv4Var5.q(true);
            boolean booleanValue = ((Boolean) aw7Var7.getValue()).booleanValue();
            boolean f7 = rv4Var5.f(aw7Var7);
            Object P13 = rv4Var5.P();
            if (f7 || P13 == lh9Var2) {
                P13 = new d07(aw7Var7, i11);
                rv4Var5.o0(P13);
            }
            xt4 xt4Var = (xt4) P13;
            boolean f8 = rv4Var5.f(aw7Var6) | rv4Var5.f(aw7Var7);
            Object P14 = rv4Var5.P();
            if (f8 || P14 == lh9Var2) {
                P14 = new pr0(aw7Var6, aw7Var7, 15);
                rv4Var5.o0(P14);
            }
            am8.g(booleanValue, xt4Var, (xt4) P14, rv4Var5, i12);
            ar5 c4 = rp5.c((wk3) jk3.d.getValue(), rv4Var5, i12);
            if ((29360128 & i10) == i13) {
                i14 = 1;
            } else {
                i14 = i12;
            }
            Object P15 = rv4Var5.P();
            if (i14 != 0 || P15 == lh9Var2) {
                P15 = new ge5(20, vt4Var);
                rv4Var5.o0(P15);
            }
            kwe.d(c4, kq7Var2, 0L, (vt4) P15, rv4Var, 48, 4);
            rv4Var4 = rv4Var;
            rv4Var4.q(true);
        } else {
            rv4Var4.X();
        }
        ek9 u = rv4Var4.u();
        if (u != null) {
            u.d = new lc3(str, str2, str3, str4, nq7Var, z, nu4Var, vt4Var, i, 4);
        }
    }

    public static final void g(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1754000317);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.g;
            long j = ((h27) rv4Var2.j(tzaVar)).a.q;
            kq7 kq7Var = kq7.a;
            cvb.c(str, zbe.y(kq7Var, 24.0f), j, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i5 & 14) | 48, 0, 130040);
            eg0.f(pna.n(kq7Var, 48.0f), ((h27) rv4Var.j(tzaVar)).a.q, null, rv4Var, 6, 4);
            rv4Var.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new ge5(19, vt4Var);
                rv4Var.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 9);
        }
    }

    public static final void h(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i2;
        cz7 cz7Var2;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        long v;
        long v2;
        int i3;
        int i4;
        int i5;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(669956785);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new v85(str, 5);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(kd7.class);
                kd7 kd7Var = (kd7) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(kd7Var);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new fo4(kd7Var, 26);
                    rv4Var.o0(P2);
                }
                tte.d(kd7Var, null, (xt4) P2, rv4Var, 0);
                aw7 z4 = jsc.z(kd7Var.t0, rv4Var);
                aw7 z5 = jsc.z(kd7Var.i1, rv4Var);
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                boolean f2 = rv4Var.f((nnb) z4.getValue()) | rv4Var.f(pm1Var);
                Object P3 = rv4Var.P();
                if (f2 || P3 == lh9Var) {
                    if (((nnb) z4.getValue()).a.length() == 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z6 = ((nnb) z4.getValue()).g;
                    if (z3) {
                        v = pm1Var.q;
                    } else {
                        v = kve.v(((nnb) z4.getValue()).d);
                    }
                    long j = v;
                    if (z3) {
                        v2 = pm1Var.p;
                    } else {
                        v2 = kve.v(((nnb) z4.getValue()).e);
                    }
                    P3 = yae.z(new e6c(z3, z6, j, v2, ((nnb) z4.getValue()).f, nae.n(((nnb) z4.getValue()).h)));
                    rv4Var.o0(P3);
                }
                aw7 aw7Var = (aw7) P3;
                aw7 z7 = jsc.z(kd7Var.z0, rv4Var);
                WeakHashMap weakHashMap = yjd.w;
                ix5 o = w92.o(h88.n(rv4Var).b, rv4Var);
                boolean f3 = rv4Var.f((nnb) z4.getValue());
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    th8 th8Var = new th8(((nnb) z4.getValue()).F, ((nnb) z4.getValue()).H, ((nnb) z4.getValue()).G, ((nnb) z4.getValue()).I);
                    rv4Var.o0(th8Var);
                    P4 = th8Var;
                }
                aw7 z8 = jsc.z(kd7Var.A0, rv4Var);
                dxe.l(((nnb) z4.getValue()).o, ((nnb) z4.getValue()).r, ((nnb) z4.getValue()).p, ((nnb) z4.getValue()).q, rv4Var, 0);
                rv4Var2 = rv4Var;
                pc2.f((e6c) aw7Var.getValue(), jce.E(857444609, new ld7(kd7Var, nq7Var, o, cz7Var2, str, (rh8) P4, aw7Var, z5, z7, z4, z8), rv4Var2), rv4Var2, 48);
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
            u.d = new j31(str, cz7Var, nq7Var, i, 6);
        }
    }

    public static final void i(int i, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        int i5;
        str.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(418763505);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        }
        if (rv4Var.h(xt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-1496216915);
                j(i8 & 8190, xt4Var, xt4Var2, rv4Var, str, z);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1496111918);
                k(i8 & 8190, xt4Var, xt4Var2, rv4Var, str, z);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new je7(z, str, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void j(int i, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i2;
        int i3;
        Object obj;
        int i4;
        boolean z2;
        int i5;
        rv4Var.g0(-677582239);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if ((i & 384) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        } else {
            obj = xt4Var;
        }
        if (rv4Var.h(xt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            nmd.d(z, obj, null, true, null, null, 0L, 0L, nae.e, 0L, null, jce.E(-669576771, new pe7(0, xt4Var2, str), rv4Var), rv4Var, (i8 & 14) | 3072 | ((i8 >> 3) & Token.ASSIGN_MOD), 48, 2036);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new je7(z, str, xt4Var, xt4Var2, i, 2);
        }
    }

    public static final void k(int i, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, String str, boolean z) {
        int i2;
        int i3;
        Object obj;
        int i4;
        boolean z2;
        int i5;
        rv4Var.g0(-573905662);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if ((i & 384) == 0) {
            obj = xt4Var;
            if (rv4Var.h(obj)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i7 |= i5;
        } else {
            obj = xt4Var;
        }
        if (rv4Var.h(xt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if ((i8 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            nmd.f(z, obj, null, true, 0L, 0L, nae.e, 0L, nae.e, jce.E(-243094095, new ke7(0, xt4Var2, str), rv4Var), rv4Var, (i8 & 14) | 805309440 | ((i8 >> 3) & Token.ASSIGN_MOD), 500);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new je7(z, str, xt4Var, xt4Var2, i, 1);
        }
    }

    public static final void l(boolean z, String str, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4Var.g0(895984176);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(str)) {
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
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            xb.d(z, xt4Var, jce.E(322590852, new oo7(3, vt4Var, xt4Var), rv4Var), null, null, jce.E(-823819961, new id1(xt4Var, 27, (byte) 0), rv4Var), y9e.d, null, 0L, 0L, nae.e, false, false, jce.E(1709879004, new w0a(str, 3), rv4Var), rv4Var, (i9 & 14) | 1769856 | ((i9 >> 3) & Token.ASSIGN_MOD), 8088);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new gl7(z, str, xt4Var, vt4Var, i, 1);
        }
    }

    public static final void m(boolean z, boolean z2, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        rv4Var.g0(-1048349730);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.f(nq7Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i12 = i11 | i6;
        if (rv4Var.h(vt4Var)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i7;
        if ((74899 & i13) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i13 & 1, z3)) {
            hre.b(0L, nq7Var, jce.E(-1721018802, new ew0(z, xt4Var, z2, xt4Var2, vt4Var), rv4Var), rv4Var, ((i13 >> 3) & Token.ASSIGN_MOD) | 384, 1);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new fw0(z, z2, nq7Var, xt4Var, xt4Var2, vt4Var, i);
        }
    }

    public static final void n(boolean z, vt4 vt4Var, boolean z2, boolean z3, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z4;
        rv4Var.g0(-1780772745);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.g(z2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.g(z3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i6;
        if (rv4Var.h(xt4Var2)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if (rv4Var.h(vt4Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i15 = i14 | i8;
        if ((4793491 & i15) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i15 & 1, z4)) {
            rte.c(z, nq7Var, zt3.g(null, 3), zt3.i(null, 3), null, jce.E(1544158031, new cw0(vt4Var, z2, z3, xt4Var, xt4Var2, vt4Var2), rv4Var), rv4Var, (i15 & 14) | 200112, 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new dw0(z, vt4Var, z2, z3, nq7Var, xt4Var, xt4Var2, vt4Var2, i);
        }
    }

    public static final void o(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        pb2 pb2Var;
        boolean z3;
        int i4;
        String str2 = str;
        str2.getClass();
        cz7Var.getClass();
        rv4Var.g0(961731385);
        if (rv4Var.f(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i6 & 1, z)) {
            int i7 = i6 & 14;
            if (i7 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = new v85(str2, 16);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(lia.class);
                lia liaVar = (lia) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str2), pb2Var2, a3, vt4Var));
                aw7 z4 = jsc.z(liaVar.G, rv4Var);
                aw7 z5 = jsc.z(liaVar.e, rv4Var);
                Object[] objArr = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new oca(29);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P2, rv4Var, 48);
                Object[] objArr2 = new Object[0];
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = new oca(23);
                    rv4Var.o0(P3);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P3, rv4Var, 48);
                Object[] objArr3 = new Object[0];
                Object P4 = rv4Var.P();
                if (P4 == obj) {
                    P4 = new oca(24);
                    rv4Var.o0(P4);
                }
                aw7 aw7Var3 = (aw7) zpe.k(objArr3, (vt4) P4, rv4Var, 48);
                Object[] objArr4 = new Object[0];
                Object P5 = rv4Var.P();
                if (P5 == obj) {
                    P5 = new oca(25);
                    rv4Var.o0(P5);
                }
                aw7 aw7Var4 = (aw7) zpe.k(objArr4, (vt4) P5, rv4Var, 48);
                Object[] objArr5 = new Object[0];
                Object P6 = rv4Var.P();
                if (P6 == obj) {
                    P6 = new oca(26);
                    rv4Var.o0(P6);
                }
                aw7 aw7Var5 = (aw7) zpe.k(objArr5, (vt4) P6, rv4Var, 48);
                s02 s02Var = liaVar.H;
                if ((i6 & Token.ASSIGN_MOD) == 32) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Object P7 = rv4Var.P();
                if (z3 || P7 == obj) {
                    P7 = new u7(cz7Var, (m42) null, 8);
                    rv4Var.o0(P7);
                }
                jye.b(s02Var, null, (mu4) P7, rv4Var, 0);
                fxe.h(((kia) z4.getValue()).a, null, false, jce.E(-1299784267, new ri9(cz7Var, 6), rv4Var), jce.E(1845726430, new g83(aw7Var, aw7Var2, aw7Var3, z5, 21), rv4Var), jce.E(1353394170, new mr3(aw7Var5, 1), rv4Var), jce.E(542682884, new jb2(aw7Var5, liaVar, cz7Var, str, z5), rv4Var), rv4Var, 1797120, 6);
                String A = yqe.A((y3b) o2b.b0.getValue(), rv4Var);
                String str3 = ((kia) z4.getValue()).a;
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean f = rv4Var.f(aw7Var);
                Object P8 = rv4Var.P();
                if (f || P8 == obj) {
                    P8 = new qo7(aw7Var, 27);
                    rv4Var.o0(P8);
                }
                xt4 xt4Var = (xt4) P8;
                boolean f2 = rv4Var.f(liaVar);
                Object P9 = rv4Var.P();
                if (f2 || P9 == obj) {
                    P9 = new ux9(liaVar, 11);
                    rv4Var.o0(P9);
                }
                w92.e(booleanValue, A, str3, xt4Var, (xt4) P9, rv4Var, 0, 0);
                boolean booleanValue2 = ((Boolean) aw7Var3.getValue()).booleanValue();
                String str4 = ((kia) z4.getValue()).a;
                boolean f3 = rv4Var.f(aw7Var3);
                Object P10 = rv4Var.P();
                if (f3 || P10 == obj) {
                    P10 = new qo7(aw7Var3, 29);
                    rv4Var.o0(P10);
                }
                xt4 xt4Var2 = (xt4) P10;
                boolean f4 = rv4Var.f(aw7Var3) | rv4Var.f(liaVar);
                Object P11 = rv4Var.P();
                if (f4 || P11 == obj) {
                    P11 = new mm7(27, liaVar, aw7Var3);
                    rv4Var.o0(P11);
                }
                l(booleanValue2, str4, xt4Var2, (vt4) P11, rv4Var, 0);
                boolean booleanValue3 = ((Boolean) aw7Var2.getValue()).booleanValue();
                boolean f5 = rv4Var.f(aw7Var2);
                Object P12 = rv4Var.P();
                if (!f5 && P12 != obj) {
                    i4 = 0;
                } else {
                    i4 = 0;
                    P12 = new jia(aw7Var2, 0);
                    rv4Var.o0(P12);
                }
                xbe.a(booleanValue3, (xt4) P12, rv4Var, i4);
                String str5 = ((kia) z4.getValue()).a;
                boolean booleanValue4 = ((Boolean) aw7Var5.getValue()).booleanValue();
                boolean f6 = rv4Var.f(aw7Var5);
                Object P13 = rv4Var.P();
                if (f6 || P13 == obj) {
                    P13 = new jia(aw7Var5, 1);
                    rv4Var.o0(P13);
                }
                xt4 xt4Var3 = (xt4) P13;
                boolean f7 = rv4Var.f(liaVar);
                Object P14 = rv4Var.P();
                if (f7 || P14 == obj) {
                    P14 = new el7(liaVar, 14);
                    rv4Var.o0(P14);
                }
                str2 = str;
                tc4.e(str2, str5, booleanValue4, null, xt4Var3, (lu4) P14, rv4Var, i7);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str2, cz7Var, i, 11);
        }
    }

    public static final void p(int i, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var, String str, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        rv4 rv4Var2 = rv4Var;
        str.getClass();
        xt4Var.getClass();
        rv4Var2.g0(1104778799);
        if (rv4Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(xt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i7 & 1, z2)) {
            if ((i7 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i7 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z4 | z3;
            Object P = rv4Var2.P();
            if (z5 || P == ax1.a) {
                P = new up0(1, xt4Var, z);
                rv4Var2.o0(P);
            }
            nq7 t = q1d.t(1, (vt4) P, rv4Var2, nq7Var, false);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, t);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(str, new we6(1.0f, true), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var2, (i7 >> 3) & 14, 0, 131068);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, pna.s(kq7.a, 12.0f));
            tte.g(z, false, null, xt4Var, rv4Var2, i7 & 7182, 6);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new rd0(z, str, nq7Var, xt4Var, i, 1);
        }
    }

    public static final void q(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-942643802);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            rv4Var2.e0(1302187218);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) o2b.P0.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, zr1.q(20), null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.j, rv4Var, 24576, 0, 130030);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, 100663296, 252);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, vt4Var, nq7Var, i, 19);
        }
    }

    public static final void r(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(78031450);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i5 = i4 | i3;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, d);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            ze4 ze4Var = pna.c;
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, ze4Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.g;
            kq7 kq7Var = kq7.a;
            cvb.c(str, zbe.y(kq7Var, 24.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, oybVar, rv4Var, (i5 & 14) | 48, 0, 130044);
            eg0.f(pna.n(kq7Var, 48.0f), ((zl1) rv4Var.j(r12.a)).a, null, rv4Var, 6, 4);
            rv4Var.q(true);
            ar5 c2 = rp5.c((wk3) jk3.d.getValue(), rv4Var, 0);
            nq7 o = nc2.o(kq7Var);
            if ((i5 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new oqd(3, vt4Var);
                rv4Var.o0(P);
            }
            kwe.d(c2, o, 0L, (vt4) P, rv4Var, 0, 4);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 18);
        }
    }

    public static final void s(int i, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i2;
        cz7 cz7Var2;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        int i3;
        int i4;
        int i5;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(835570860);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            cz7Var2 = cz7Var;
            if (rv4Var.f(cz7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        } else {
            cz7Var2 = cz7Var;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z2 = true;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new frd(str, 0);
                rv4Var.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(erd.class);
                erd erdVar = (erd) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var));
                boolean f = rv4Var.f(erdVar);
                Object P2 = rv4Var.P();
                if (f || P2 == lh9Var) {
                    P2 = new zub(erdVar, 15);
                    rv4Var.o0(P2);
                }
                tte.d(erdVar, null, (xt4) P2, rv4Var, 0);
                aw7 z3 = jsc.z(erdVar.j0, rv4Var);
                aw7 z4 = jsc.z(erdVar.X, rv4Var);
                dxe.l(((dm5) z4.getValue()).e, ((dm5) z4.getValue()).q, ((dm5) z4.getValue()).i, ((dm5) z4.getValue()).j, rv4Var, 0);
                rv4Var2 = rv4Var;
                p17.a((dm5) z4.getValue(), jce.E(-1323801496, new i31(nq7Var, cz7Var2, erdVar, z3, 8), rv4Var2), rv4Var2, 48);
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
            u.d = new j31(str, cz7Var, nq7Var, i, 12);
        }
    }

    public static final wcd t(od6 od6Var) {
        wcd wcdVar = od6Var.L;
        if (wcdVar != null) {
            return wcdVar;
        }
        throw a82.f("Required value was null.");
    }

    public static boolean u(Collection collection, Iterator it) {
        collection.getClass();
        it.getClass();
        boolean z = false;
        while (it.hasNext()) {
            z |= collection.add(it.next());
        }
        return z;
    }

    public static final vt4 v(xt4 xt4Var, rv4 rv4Var, int i) {
        boolean z;
        int hashCode = Long.hashCode(rv4Var.T);
        Context context = (Context) rv4Var.j(gh.b);
        pv4 m = p17.m(rv4Var);
        xx9 xx9Var = (xx9) rv4Var.j(ay9.a);
        View view = (View) rv4Var.j(gh.f);
        boolean h = rv4Var.h(context);
        if ((((i & 14) ^ 6) > 4 && rv4Var.f(xt4Var)) || (i & 6) == 4) {
            z = true;
        } else {
            z = false;
        }
        boolean h2 = z | h | rv4Var.h(m) | rv4Var.h(xx9Var) | rv4Var.d(hashCode) | rv4Var.h(view);
        Object P = rv4Var.P();
        if (h2 || P == ax1.a) {
            Object ppVar = new pp(context, xt4Var, m, xx9Var, hashCode, view);
            rv4Var.o0(ppVar);
            P = ppVar;
        }
        return (vt4) P;
    }

    public static final int w(float f, long j, long j2) {
        if (!eh.q(j) && !eh.q(j2) && f > nae.e) {
            int i = az5.c;
            int pow = (int) Math.pow(2.0d, k27.A((float) (Math.log(yz1.k(1, ((int) (j >> 32)) / (((int) (j2 >> 32)) * f))) / i02.a)));
            if (pow < 1) {
                return 1;
            }
            return pow;
        }
        return 0;
    }

    public static b82 x(b82 b82Var, c82 c82Var) {
        c82Var.getClass();
        if (c16.i(b82Var.getKey(), c82Var)) {
            return b82Var;
        }
        return null;
    }

    public static final String y(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int z(String str) {
        char c2;
        if (str == null) {
            return -1;
        }
        String p = lc7.p(str);
        p.getClass();
        switch (p.hashCode()) {
            case -2123537834:
                if (p.equals("audio/eac3-joc")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384011:
                if (p.equals("video/mp2p")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case -1662384007:
                if (p.equals("video/mp2t")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case -1662095187:
                if (p.equals("video/webm")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case -1606874997:
                if (p.equals("audio/amr-wb")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case -1487656890:
                if (p.equals("image/avif")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464693:
                if (p.equals("image/heic")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case -1487464690:
                if (p.equals("image/heif")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case -1487394660:
                if (p.equals("image/jpeg")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1487018032:
                if (p.equals("image/webp")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case -1248337486:
                if (p.equals("application/mp4")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case -1079884372:
                if (p.equals("video/x-msvideo")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case -1004728940:
                if (p.equals("text/vtt")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -879272239:
                if (p.equals("image/bmp")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -879258763:
                if (p.equals("image/png")) {
                    c2 = 14;
                    break;
                }
                c2 = 65535;
                break;
            case -387023398:
                if (p.equals("audio/x-matroska")) {
                    c2 = 15;
                    break;
                }
                c2 = 65535;
                break;
            case -43467528:
                if (p.equals("application/webm")) {
                    c2 = 16;
                    break;
                }
                c2 = 65535;
                break;
            case 13915911:
                if (p.equals("video/x-flv")) {
                    c2 = 17;
                    break;
                }
                c2 = 65535;
                break;
            case 187078296:
                if (p.equals("audio/ac3")) {
                    c2 = 18;
                    break;
                }
                c2 = 65535;
                break;
            case 187078297:
                if (p.equals("audio/ac4")) {
                    c2 = 19;
                    break;
                }
                c2 = 65535;
                break;
            case 187078669:
                if (p.equals("audio/amr")) {
                    c2 = 20;
                    break;
                }
                c2 = 65535;
                break;
            case 187090232:
                if (p.equals("audio/mp4")) {
                    c2 = 21;
                    break;
                }
                c2 = 65535;
                break;
            case 187091926:
                if (p.equals("audio/ogg")) {
                    c2 = 22;
                    break;
                }
                c2 = 65535;
                break;
            case 187099443:
                if (p.equals("audio/wav")) {
                    c2 = 23;
                    break;
                }
                c2 = 65535;
                break;
            case 1331848029:
                if (p.equals("video/mp4")) {
                    c2 = 24;
                    break;
                }
                c2 = 65535;
                break;
            case 1503095341:
                if (p.equals("audio/3gpp")) {
                    c2 = 25;
                    break;
                }
                c2 = 65535;
                break;
            case 1504578661:
                if (p.equals("audio/eac3")) {
                    c2 = 26;
                    break;
                }
                c2 = 65535;
                break;
            case 1504619009:
                if (p.equals("audio/flac")) {
                    c2 = 27;
                    break;
                }
                c2 = 65535;
                break;
            case 1504824762:
                if (p.equals("audio/midi")) {
                    c2 = 28;
                    break;
                }
                c2 = 65535;
                break;
            case 1504831518:
                if (p.equals("audio/mpeg")) {
                    c2 = 29;
                    break;
                }
                c2 = 65535;
                break;
            case 1505118770:
                if (p.equals("audio/webm")) {
                    c2 = 30;
                    break;
                }
                c2 = 65535;
                break;
            case 2039520277:
                if (p.equals("video/x-matroska")) {
                    c2 = 31;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 18:
            case 26:
                return 0;
            case 1:
                return 10;
            case 2:
                return 11;
            case 3:
            case 15:
            case 16:
            case 30:
            case 31:
                return 6;
            case 4:
            case 20:
            case 25:
                return 3;
            case 5:
                return 21;
            case 6:
            case 7:
                return 20;
            case '\b':
                return 14;
            case '\t':
                return 18;
            case '\n':
            case 21:
            case 24:
                return 8;
            case 11:
                return 16;
            case '\f':
                return 13;
            case '\r':
                return 19;
            case 14:
                return 17;
            case 17:
                return 5;
            case 19:
                return 1;
            case 22:
                return 9;
            case 23:
                return 12;
            case 27:
                return 4;
            case 28:
                return 15;
            case 29:
                return 7;
            default:
                return -1;
        }
    }
}
