package defpackage;

import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ote  reason: default package */
/* loaded from: classes.dex */
public abstract class ote {
    public static final tu1 a;
    public static final qm1 b;

    static {
        new tu1(new cv1(18), false, -308871205);
        a = new tu1(new cv1(19), false, -2084902034);
        b = qm1.G;
    }

    public static final void A(wr wrVar, es esVar) {
        esVar.b.setValue(wrVar.e.getValue());
        js jsVar = esVar.c;
        js jsVar2 = wrVar.f;
        int b2 = jsVar.b();
        for (int i = 0; i < b2; i++) {
            jsVar.e(i, jsVar2.a(i));
        }
        esVar.e = wrVar.h;
        esVar.d = wrVar.g;
        esVar.f = ((Boolean) wrVar.i.getValue()).booleanValue();
    }

    public static final long a(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void b(float f, int i, int i2, vt4 vt4Var, rv4 rv4Var, ar5 ar5Var, nq7 nq7Var, boolean z) {
        int i3;
        int i4;
        int i5;
        float f2;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        ar5Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(-886978753);
        if (rv4Var.f(ar5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        int i11 = i10 | 3072;
        int i12 = i2 & 16;
        if (i12 != 0) {
            i7 = i10 | 27648;
            f2 = f;
        } else {
            f2 = f;
            if (rv4Var.c(f2)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i7 = i11 | i6;
        }
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            if (i12 != 0) {
                f2 = nae.e;
            }
            tza tzaVar = j27.a;
            long b2 = zl1.b(1.0f, ((h27) rv4Var.j(tzaVar)).a.q);
            nq7 k = tte.k(pna.n(nq7Var, 44.0f), uu9.a);
            if ((i7 & Token.ASSIGN_MOD) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z4 || P == lh9Var) {
                P = new a3c(25, vt4Var);
                rv4Var.o0(P);
            }
            nq7 y = zbe.y(nmd.v(lbe.f(14, (vt4) P, k, null, true), zl1.b(0.4f, ((h27) rv4Var.j(tzaVar)).a.p), lre.g), 10.0f);
            if ((57344 & i7) == 16384) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P2 = rv4Var.P();
            if (z5 || P2 == lh9Var) {
                P2 = new hd(4, f2);
                rv4Var.o0(P2);
            }
            nk5.a(ar5Var, null, axe.k(y, (xt4) P2), b2, rv4Var, (i7 & 14) | 48, 0);
            z3 = true;
        } else {
            rv4Var.X();
            z3 = z;
        }
        float f3 = f2;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new w7d(ar5Var, vt4Var, nq7Var, z3, f3, i, i2);
        }
    }

    public static final void c(long j, long j2, xt4 xt4Var, vt4 vt4Var, vt4 vt4Var2, nq7 nq7Var, List list, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        xt4 xt4Var2;
        rv4 rv4Var2;
        vt4 vt4Var3;
        boolean z2;
        gpa gpaVar;
        lh9 lh9Var;
        int i8;
        aw7 aw7Var;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        xt4 mabVar;
        long j3 = j2;
        xt4Var.getClass();
        vt4Var.getClass();
        vt4Var2.getClass();
        rv4Var.g0(-2034190203);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.e(j3)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.h(xt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(vt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.f(list)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if ((599187 & i14) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i14 & 1, z)) {
            kpa kpaVar = kpa.a;
            tza tzaVar = j27.a;
            gpa d = kpa.d(((h27) rv4Var.j(tzaVar)).a.q, ((h27) rv4Var.j(tzaVar)).a.q, zl1.b(0.3f, ((h27) rv4Var.j(tzaVar)).a.q), rv4Var, 1012);
            long b2 = zl1.b(0.7f, ((h27) rv4Var.j(tzaVar)).a.j);
            if ((i14 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var2 = ax1.a;
            if (z2 || P == lh9Var2) {
                P = yae.z(Float.valueOf((float) j));
                rv4Var.o0(P);
            }
            aw7 aw7Var2 = (aw7) P;
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
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
            cvb.c(eub.o(u(j), " / ", u(j2)), null, ((h27) rv4Var.j(tzaVar)).a.q, null, zr1.q(12), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var, 24576, 0, 262122);
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            b37 d2 = fu0.d(kh5.e, false);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, f);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d2);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            if (j2 > 0 && !list.isEmpty()) {
                rv4Var.e0(-1679311757);
                nq7 h = pna.h(pna.f(kq7Var, 1.0f), 4.0f);
                if ((i14 & 3670016) != 1048576) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if ((i14 & Token.ASSIGN_MOD) == 32) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean e = z7 | z8 | rv4Var.e(b2);
                Object P2 = rv4Var.P();
                if (!e) {
                    lh9Var = lh9Var2;
                    if (P2 != lh9Var) {
                        j3 = j2;
                        mabVar = P2;
                        gpaVar = d;
                        i8 = i14;
                        aw7Var = aw7Var2;
                        z3 = false;
                        bce.a(h, mabVar, rv4Var, 6);
                        rv4Var.q(z3);
                    }
                } else {
                    lh9Var = lh9Var2;
                }
                gpaVar = d;
                i8 = i14;
                aw7Var = aw7Var2;
                z3 = false;
                j3 = j2;
                mabVar = new mab(list, j3, b2, 1);
                rv4Var.o0(mabVar);
                bce.a(h, mabVar, rv4Var, 6);
                rv4Var.q(z3);
            } else {
                j3 = j2;
                gpaVar = d;
                lh9Var = lh9Var2;
                i8 = i14;
                aw7Var = aw7Var2;
                z3 = false;
                rv4Var.e0(-1678191231);
                rv4Var.q(false);
            }
            float floatValue = ((Number) aw7Var.getValue()).floatValue();
            jk1 jk1Var = new jk1(nae.e, Math.max((float) j3, 1.0f));
            nq7 f2 = pna.f(kq7Var, 1.0f);
            boolean f3 = rv4Var.f(aw7Var);
            if ((i8 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = z3;
            }
            boolean z9 = f3 | z4;
            Object P3 = rv4Var.P();
            if (!z9 && P3 != lh9Var) {
                vt4Var3 = vt4Var;
            } else {
                vt4Var3 = vt4Var;
                P3 = new asb(vt4Var3, aw7Var);
                rv4Var.o0(P3);
            }
            xt4 xt4Var3 = (xt4) P3;
            if ((i8 & 896) == 256) {
                z5 = true;
            } else {
                z5 = z3;
            }
            boolean f4 = rv4Var.f(aw7Var) | z5;
            if ((57344 & i8) == 16384) {
                z6 = true;
            } else {
                z6 = z3;
            }
            boolean z10 = f4 | z6;
            Object P4 = rv4Var.P();
            if (!z10 && P4 != lh9Var) {
                xt4Var2 = xt4Var;
            } else {
                xt4Var2 = xt4Var;
                P4 = new ko7(xt4Var2, vt4Var2, aw7Var);
                rv4Var.o0(P4);
            }
            dae.d(floatValue, xt4Var3, f2, false, (vt4) P4, gpaVar, null, 0, ade.b, jce.E(298821886, new pl7(gpaVar, 19), rv4Var), jk1Var, rv4Var, 905970048, 0, Context.VERSION_ES6);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            xt4Var2 = xt4Var;
            rv4Var2 = rv4Var;
            vt4Var3 = vt4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new dt0(j, j3, xt4Var2, vt4Var3, vt4Var2, nq7Var, list, i);
        }
    }

    public static final void d(long j, List list, xt4 xt4Var, nq7 nq7Var, float f, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        Object obj;
        boolean z4;
        int i3;
        int i4;
        int i5;
        boolean h;
        int i6;
        int i7;
        xt4Var.getClass();
        rv4Var.g0(-1893857272);
        if ((i & 6) == 0) {
            if (rv4Var.e(j)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.c(f)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
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
            if ((i2 & Token.ASSIGN_MOD) != 32 && ((i2 & 64) == 0 || !rv4Var.f(list))) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z5 = z2 | z3;
            Object P = rv4Var.P();
            if (z5 || P == ax1.a) {
                Iterator it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        njc njcVar = (njc) obj;
                        long j2 = njcVar.a * 1000;
                        long j3 = njcVar.b * 1000;
                        if (j3 > j2 && j2 <= j && j < j3) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                P = (njc) obj;
                rv4Var.o0(P);
            }
            njc njcVar2 = (njc) P;
            yya a2 = nq.a(f, null, "SkipSegmentButtonBottom", rv4Var, ((i2 >> 12) & 14) | 384, 10);
            if (njcVar2 != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            rte.c(z4, zbe.C(nq7Var, nae.e, nae.e, nae.e, ((rg3) a2.getValue()).a, 7), zt3.g(null, 3).a(zt3.k(null, 0.85f, 0L, 5)), zt3.i(null, 3).a(zt3.m(0.85f, 0L, 5)), null, jce.E(-387067168, new em7(17, njcVar2, xt4Var), rv4Var), rv4Var, 200064, 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new hl3(j, list, xt4Var, nq7Var, f, i);
        }
    }

    public static final void e(float f, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        String Q0;
        xt4Var.getClass();
        rv4Var.g0(-388755686);
        if (rv4Var.c(f)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2 | 48;
        if (rv4Var.h(xt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            Boolean bool = (Boolean) aw7Var.getValue();
            bool.getClass();
            if ((i7 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var.P();
            if (z2 || P2 == lh9Var) {
                P2 = new x7d(xt4Var2, aw7Var, null, 0);
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, bool);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            kq7 kq7Var2 = kq7.a;
            nq7 p = lye.p(rv4Var, kq7Var2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            float f2 = ((int) (f * 100.0f)) / 100.0f;
            int i8 = (int) f2;
            if (Math.abs(f2 - i8) < 0.005f) {
                Q0 = String.valueOf(i8);
            } else {
                Q0 = k4b.Q0(k4b.Q0(String.valueOf(((int) (f2 * 100.0f)) / 100.0d), '0'), '.');
            }
            String u = nk2.u(Q0, "x");
            tza tzaVar = j27.a;
            long j = ((h27) rv4Var.j(tzaVar)).a.q;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.k;
            long q = zr1.q(12);
            nq7 v = nmd.v(tte.k(zbe.A(kq7Var2, 4.0f, nae.e, 2), uu9.a), zl1.b(0.18f, ((h27) rv4Var.j(tzaVar)).a.q), lre.g);
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new clc(aw7Var, 12);
                rv4Var.o0(P3);
            }
            cvb.c(u, zbe.z(lbe.f(15, (vt4) P3, v, null, false), 10.0f, 4.0f), j, null, q, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oybVar, rv4Var, 24576, 24960, 110568);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                P4 = new clc(aw7Var, 13);
                rv4Var.o0(P4);
            }
            int i9 = i7 << 3;
            gq7.a(booleanValue, f, (vt4) P4, xt4Var, rv4Var, (i9 & 7168) | (i9 & Token.ASSIGN_MOD) | 384);
            rv4Var.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new ez7(f, kq7Var, xt4Var, xt4Var2, i);
        }
    }

    public static final void f(int i, int i2, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, nq7 nq7Var, List list) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        rv4 rv4Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        list.getClass();
        xt4Var.getClass();
        rv4Var.g0(-676514712);
        if (rv4Var.f(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i10 = i9 | i6;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i10 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            Boolean bool = (Boolean) aw7Var.getValue();
            bool.getClass();
            if ((57344 & i10) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var.P();
            if (z2 || P2 == lh9Var) {
                P2 = new x7d(xt4Var2, aw7Var, null, 1);
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, bool);
            if ((i10 & Token.ASSIGN_MOD) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i10 & 14) != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean z5 = z4 | z3;
            Object P3 = rv4Var.P();
            if (z5 || P3 == lh9Var) {
                P3 = (mbd) sl1.f0(i, list);
                rv4Var.o0(P3);
            }
            mbd mbdVar = (mbd) P3;
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            if (mbdVar != null) {
                str = mbdVar.a;
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            String str2 = str;
            tza tzaVar = j27.a;
            long j = ((h27) rv4Var.j(tzaVar)).a.q;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.k;
            long q = zr1.q(12);
            nq7 v = nmd.v(tte.k(kq7.a, uu9.a), zl1.b(0.18f, ((h27) rv4Var.j(tzaVar)).a.q), lre.g);
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                P4 = new clc(aw7Var, 14);
                rv4Var.o0(P4);
            }
            cvb.c(str2, zbe.z(lbe.f(15, (vt4) P4, v, null, false), 10.0f, 4.0f), j, null, q, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, oybVar, rv4Var, 24576, 24960, 110568);
            boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
            nk0 nk0Var = kh5.c;
            Object P5 = rv4Var.P();
            if (P5 == lh9Var) {
                P5 = new clc(aw7Var, 15);
                rv4Var.o0(P5);
            }
            iue.e(booleanValue, nk0Var, 0L, null, nae.e, null, (vt4) P5, jce.E(-295831966, new qm7(list, i, xt4Var, aw7Var, 3), rv4Var), rv4Var, 14155824, 60);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new x90(i, i2, xt4Var, xt4Var2, nq7Var, list);
        }
    }

    public static final void g(float f, int i, int i2, vt4 vt4Var, rv4 rv4Var, ar5 ar5Var, nq7 nq7Var, boolean z) {
        int i3;
        nq7 nq7Var2;
        int i4;
        int i5;
        int i6;
        boolean z2;
        float f2;
        boolean z3;
        nq7 nq7Var3;
        ar5Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(662586364);
        if (rv4Var.f(ar5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i5 = i7 | 48;
            nq7Var2 = nq7Var;
        } else {
            nq7Var2 = nq7Var;
            if (rv4Var.f(nq7Var2)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i7 | i4;
        }
        int i9 = i5 | 3456;
        if (rv4Var.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i10 = i9 | i6;
        boolean z4 = false;
        if ((i10 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            if (i8 != 0) {
                nq7Var3 = kq7.a;
            } else {
                nq7Var3 = nq7Var2;
            }
            long b2 = zl1.b(1.0f, ((h27) rv4Var.j(j27.a)).a.q);
            nq7 k = tte.k(pna.n(nq7Var3, 32.0f), uu9.a);
            if ((57344 & i10) == 16384) {
                z4 = true;
            }
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new a3c(26, vt4Var);
                rv4Var.o0(P);
            }
            nk5.a(ar5Var, null, zbe.y(lbe.f(14, (vt4) P, k, null, true), 3.0f), b2, rv4Var, (i10 & 14) | 48, 0);
            nq7Var2 = nq7Var3;
            f2 = 32.0f;
            z3 = true;
        } else {
            rv4Var.X();
            f2 = f;
            z3 = z;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new w7d(ar5Var, nq7Var2, f2, z3, vt4Var, i, i2, 2);
        }
    }

    public static final void h(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-1320828373);
        int i2 = i | 6;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            su9 su9Var = uu9.a;
            kq7 kq7Var = kq7.a;
            nq7 z2 = zbe.z(nmd.v(tte.k(kq7Var, su9Var), zl1.b(0.4f, ((h27) rv4Var.j(j27.a)).a.p), lre.g), 6.0f, 4.0f);
            gv9 a2 = ev9.a(new hz(4.0f, true, new vs(2)), kh5.G, rv4Var, 54);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z2);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, a2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tu1Var.c(jv9.a, rv4Var, 54);
            rv4Var.q(true);
            nq7Var = kq7Var;
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a62(nq7Var, tu1Var, i, 8);
        }
    }

    public static final void i(float f, int i, int i2, vt4 vt4Var, rv4 rv4Var, ar5 ar5Var, nq7 nq7Var, boolean z) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        nq7 nq7Var2;
        boolean z3;
        ar5Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(1723275731);
        if (rv4Var.f(ar5Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        int i8 = i7 | 48;
        int i9 = i2 & 4;
        if (i9 != 0) {
            i5 = i7 | 432;
        } else {
            if (rv4Var.c(f)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i5 = i4 | i8;
        }
        int i10 = i5 | 3072;
        if (rv4Var.h(vt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        boolean z4 = false;
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            if (i9 != 0) {
                f = 24.0f;
            }
            long b2 = zl1.b(1.0f, ((h27) rv4Var.j(j27.a)).a.q);
            nq7Var2 = kq7.a;
            nq7 k = tte.k(pna.n(nq7Var2, 16.0f + f), uu9.a);
            if ((57344 & i11) == 16384) {
                z4 = true;
            }
            Object P = rv4Var.P();
            if (z4 || P == ax1.a) {
                P = new a3c(27, vt4Var);
                rv4Var.o0(P);
            }
            nk5.a(ar5Var, null, zbe.y(lbe.f(14, (vt4) P, k, null, true), 8.0f), b2, rv4Var, (i11 & 14) | 48, 0);
            z3 = true;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            z3 = z;
        }
        float f2 = f;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new w7d(ar5Var, nq7Var2, f2, z3, vt4Var, i, i2, 0);
        }
    }

    public static final Object j(float f, float f2, float f3, xr xrVar, lu4 lu4Var, m42 m42Var) {
        drc drcVar = fca.f;
        Float f4 = new Float(f);
        Float f5 = new Float(f2);
        Float f6 = new Float(f3);
        xt4 xt4Var = drcVar.a;
        js jsVar = (js) xt4Var.invoke(f6);
        if (jsVar == null) {
            jsVar = ((js) xt4Var.invoke(f4)).c();
        }
        js jsVar2 = jsVar;
        Object k = k(new es(drcVar, f4, jsVar2, 56), new xkb(xrVar, drcVar, f4, f5, jsVar2), Long.MIN_VALUE, new fi3(2, lu4Var), m42Var);
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        if (k != n82Var) {
            k = pvcVar;
        }
        if (k == n82Var) {
            return k;
        }
        return pvcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fd A[Catch: CancellationException -> 0x003c, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x003c, blocks: (B:14:0x0037, B:45:0x00e8, B:47:0x00fd, B:51:0x0120, B:53:0x0130, B:54:0x0135), top: B:74:0x0037 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014f A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17, types: [zl9] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19, types: [zl9] */
    /* JADX WARN: Type inference failed for: r1v20, types: [zl9] */
    /* JADX WARN: Type inference failed for: r1v4, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.es r24, defpackage.sr r25, long r26, defpackage.xt4 r28, defpackage.m42 r29) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ote.k(es, sr, long, xt4, m42):java.lang.Object");
    }

    public static /* synthetic */ Object l(float f, float f2, xr xrVar, lu4 lu4Var, m42 m42Var, int i) {
        if ((i & 8) != 0) {
            xrVar = tte.v(nae.e, nae.e, 7, null);
        }
        return j(f, f2, nae.e, xrVar, lu4Var, m42Var);
    }

    public static final Object m(es esVar, pq2 pq2Var, boolean z, xt4 xt4Var, n42 n42Var) {
        long j;
        oq2 oq2Var = new oq2(pq2Var, esVar.a, esVar.b.getValue(), esVar.c);
        if (z) {
            j = esVar.d;
        } else {
            j = Long.MIN_VALUE;
        }
        Object k = k(esVar, oq2Var, j, xt4Var, n42Var);
        if (k == n82.a) {
            return k;
        }
        return pvc.a;
    }

    public static final Object n(es esVar, Float f, xr xrVar, boolean z, xt4 xt4Var, n42 n42Var) {
        long j;
        xkb xkbVar = new xkb(xrVar, esVar.a, esVar.b.getValue(), f, esVar.c);
        if (z) {
            j = esVar.d;
        } else {
            j = Long.MIN_VALUE;
        }
        Object k = k(esVar, xkbVar, j, xt4Var, n42Var);
        if (k == n82.a) {
            return k;
        }
        return pvc.a;
    }

    public static /* synthetic */ Object o(es esVar, Float f, xr xrVar, boolean z, xt4 xt4Var, n42 n42Var, int i) {
        if ((i & 2) != 0) {
            xrVar = tte.v(nae.e, nae.e, 7, null);
        }
        xr xrVar2 = xrVar;
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i & 8) != 0) {
            xt4Var = new dva(10);
        }
        return n(esVar, f, xrVar2, z2, xt4Var, n42Var);
    }

    public static String p(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "kotlin.Double.Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final void q(wr wrVar, long j, float f, sr srVar, es esVar, xt4 xt4Var) {
        long j2;
        if (f == nae.e) {
            j2 = srVar.b();
        } else {
            j2 = ((float) (j - wrVar.c)) / f;
        }
        wrVar.g = j;
        wrVar.e.setValue(srVar.f(j2));
        wrVar.f = srVar.d(j2);
        if (srVar.e(j2)) {
            wrVar.h = wrVar.g;
            wrVar.i.setValue(Boolean.FALSE);
        }
        A(wrVar, esVar);
        xt4Var.invoke(wrVar);
    }

    public static final nq7 r(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new wj3(xt4Var));
    }

    public static final nq7 s(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new dk3(xt4Var));
    }

    public static final nq7 t(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new ek3(xt4Var));
    }

    public static final String u(long j) {
        if (j <= 0) {
            return "0:00";
        }
        long j2 = j / 1000;
        long j3 = j2 / 3600;
        long j4 = (j2 % 3600) / 60;
        long j5 = j2 % 60;
        if (j3 > 0) {
            String r0 = k4b.r0(2, String.valueOf(j4));
            String r02 = k4b.r0(2, String.valueOf(j5));
            return j3 + ":" + r0 + ":" + r02;
        }
        String r03 = k4b.r0(2, String.valueOf(j5));
        return j4 + ":" + r03;
    }

    public static final float v(d82 d82Var) {
        float f;
        jr7 jr7Var = (jr7) d82Var.get(tn3.D);
        if (jr7Var != null) {
            f = jr7Var.g0();
        } else {
            f = 1.0f;
        }
        if (f >= nae.e) {
            return f;
        }
        g39.b("negative scale factor");
        return f;
    }

    public static byte[] w(android.content.Context context, String str) {
        MessageDigest messageDigest;
        PackageInfo b2 = wnd.a(context).b(64, str);
        Signature[] signatureArr = b2.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            int i = 0;
            while (true) {
                if (i < 2) {
                    try {
                        messageDigest = MessageDigest.getInstance("SHA1");
                    } catch (NoSuchAlgorithmException unused) {
                    }
                    if (messageDigest != null) {
                        break;
                    }
                    i++;
                } else {
                    messageDigest = null;
                    break;
                }
            }
            if (messageDigest != null) {
                return messageDigest.digest(b2.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static final nq7 x(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        nq7Var.getClass();
        vt4Var.getClass();
        rv4Var.e0(-247719221);
        if ((i & 1) != 0) {
            z = true;
        }
        if (!z) {
            rv4Var.q(false);
            return nq7Var;
        }
        nq7 f = lbe.f(15, vt4Var, nq7Var, null, false);
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new bo7(21);
            rv4Var.o0(P);
        }
        nq7 D = kwe.D(f, (xt4) P);
        rv4Var.q(false);
        return D;
    }

    public static String y(String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (!str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (!str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (!str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -207262728:
                if (!str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return null;
                }
                return "Companion";
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (!str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (!str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (!str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (!str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (!str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return null;
                }
                return "Companion";
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (!str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return null;
                }
                return "Companion";
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final vl6 z(hk2 hk2Var) {
        hk2Var.getClass();
        String str = hk2Var.a;
        Map map = hk2Var.b;
        Map map2 = hk2Var.c;
        String str2 = hk2Var.d;
        int i = hk2Var.e;
        int i2 = hk2Var.f;
        List list = hk2Var.g;
        String str3 = hk2Var.h;
        String str4 = hk2Var.i;
        String str5 = hk2Var.j;
        Map map3 = hk2Var.o;
        String str6 = hk2Var.k;
        String str7 = hk2Var.l;
        if (str7 == null) {
            str7 = "";
        }
        String str8 = str7;
        int i3 = hk2Var.m;
        boolean z = hk2Var.p;
        int i4 = hk2Var.n;
        String str9 = hk2Var.q;
        String str10 = hk2Var.r;
        int i5 = hk2Var.s;
        double d = hk2Var.t;
        int i6 = hk2Var.u;
        long j = hk2Var.v;
        long j2 = hk2Var.w;
        boolean z2 = hk2Var.x;
        boolean z3 = hk2Var.y;
        boolean z4 = hk2Var.z;
        boolean z5 = hk2Var.A;
        return new vl6(d, i, i2, i3, i4, i5, i6, hk2Var.B, j, j2, hk2Var.E, hk2Var.F, hk2Var.G, hk2Var.H, hk2Var.I, str, str2, str3, str4, str5, str6, str8, str9, str10, list, map, map2, map3, hk2Var.D, hk2Var.C, z, z2, z3, z4, z5);
    }
}
