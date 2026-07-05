package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jsc  reason: default package */
/* loaded from: classes3.dex */
public abstract class jsc {
    public static final tu1 a = new tu1(new ov1(0), false, 966237379);
    public static final tu1 b = new tu1(new nv1(16), false, -985947784);
    public static final tu1 c = new tu1(new ov1(1), false, 1566575581);
    public static final tu1 d = new tu1(new ov1(2), false, -134841583);
    public static final tu1 e = new tu1(new ov1(3), false, 1515415098);
    public static final vhe f = new vhe(7);
    public static final i6f g = new i6f(hne.class, sbe.class);

    public static final b9a C(r36 r36Var, f06 f06Var, s76 s76Var, uq2 uq2Var) {
        Iterator u46Var;
        int i;
        String str;
        r36Var.getClass();
        s76Var.getClass();
        uh9 q = fce.q(r36Var, f06Var, new char[16384]);
        int ordinal = uq2Var.ordinal();
        uq2 uq2Var2 = uq2.a;
        if (ordinal != 0) {
            uq2 uq2Var3 = uq2.b;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    if (q.w() == 8) {
                        q.h((byte) 8);
                    }
                } else {
                    xk5.o();
                    return null;
                }
            } else if (q.w() == 8) {
                q.h((byte) 8);
            } else {
                String u = pbe.u((byte) 8);
                int i2 = q.b;
                if (i2 > 0) {
                    i = i2 - 1;
                } else {
                    i = i2;
                }
                pz pzVar = q.F;
                if (i2 != pzVar.b && i >= 0) {
                    str = String.valueOf(pzVar.a[i]);
                } else {
                    str = "EOF";
                }
                z1.r(q, hl5.o("Expected ", u, ", but had '", str, "' instead"), i, null, 4);
                throw null;
            }
            uq2Var2 = uq2Var3;
        }
        int ordinal2 = uq2Var2.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                if (ordinal2 != 2) {
                    xk5.o();
                    return null;
                }
                vs.k("AbstractJsonLexer.determineFormat must be called beforehand.");
                return null;
            }
            u46Var = new t46(r36Var, q, s76Var);
        } else {
            u46Var = new u46(r36Var, q, s76Var);
        }
        return new k02(new l56(u46Var, 0));
    }

    public static final void D(r36 r36Var, g06 g06Var, s76 s76Var, Object obj) {
        r36Var.getClass();
        s76Var.getClass();
        new n1b(new ih1(g06Var, 2), r36Var, znd.c, new n1b[znd.D.a()]).G(s76Var, obj);
    }

    public static final void E(zc2 zc2Var) {
        zc2Var.getClass();
        zc2Var.d(cs5.a(zc2Var.a(), 0, y78.b(zc2Var.a().b, Float.intBitsToFloat((int) (zc2Var.a().b >> 32)) * (-1.0f), nae.e, 2), 5));
    }

    public static final void F(zc2 zc2Var) {
        zc2Var.getClass();
        zc2Var.d(cs5.a(zc2Var.a(), 0, y78.b(zc2Var.a().b, nae.e, Float.intBitsToFloat((int) (zc2Var.a().b & 4294967295L)) * (-1.0f), 1), 5));
    }

    public static boolean G(int i, Object obj) {
        int i2;
        if (obj instanceof hu4) {
            if (obj instanceof vu4) {
                i2 = ((vu4) obj).getArity();
            } else if (obj instanceof vt4) {
                i2 = 0;
            } else if (obj instanceof xt4) {
                i2 = 1;
            } else if (obj instanceof lu4) {
                i2 = 2;
            } else if (obj instanceof mu4) {
                i2 = 3;
            } else if (obj instanceof nu4) {
                i2 = 4;
            } else if (obj instanceof ou4) {
                i2 = 5;
            } else if (obj instanceof pu4) {
                i2 = 6;
            } else if (obj instanceof qu4) {
                i2 = 7;
            } else if (obj instanceof ru4) {
                i2 = 8;
            } else if (obj instanceof su4) {
                i2 = 9;
            } else if (obj instanceof wt4) {
                i2 = 10;
            } else if (obj instanceof yt4) {
                i2 = 11;
            } else if (obj instanceof zt4) {
                i2 = 12;
            } else if (obj instanceof au4) {
                i2 = 13;
            } else if (obj instanceof bu4) {
                i2 = 14;
            } else if (obj instanceof cu4) {
                i2 = 15;
            } else if (obj instanceof du4) {
                i2 = 16;
            } else if (obj instanceof eu4) {
                i2 = 17;
            } else if (obj instanceof fu4) {
                i2 = 18;
            } else if (obj instanceof gu4) {
                i2 = 19;
            } else if (obj instanceof iu4) {
                i2 = 20;
            } else if (obj instanceof ju4) {
                i2 = 21;
            } else {
                i2 = -1;
            }
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean H(Object obj) {
        if (obj instanceof Map.Entry) {
            if (!(obj instanceof j76) || (obj instanceof m76)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean I(int i, long j, int i2) {
        int k = x02.k(j);
        if (i <= x02.i(j) && k <= i) {
            int j2 = x02.j(j);
            if (i2 <= x02.h(j) && j2 <= i2) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final y3b J(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 5) {
                        return (y3b) k2b.m0.getValue();
                    }
                    return (y3b) o2b.a.getValue();
                }
                return (y3b) k2b.n0.getValue();
            }
            return (y3b) k2b.k0.getValue();
        }
        return (y3b) k2b.l0.getValue();
    }

    public static void K(Object obj, String str) {
        String name;
        if (obj == null) {
            name = "null";
        } else {
            name = obj.getClass().getName();
        }
        ClassCastException classCastException = new ClassCastException(eub.o(name, " cannot be cast to ", str));
        c16.v(classCastException, jsc.class.getName());
        throw classCastException;
    }

    public static final void L(StringBuilder sb, Iterator it, fn8 fn8Var) {
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            sb.append(fn8.m(entry.getKey()));
            sb.append(" : ");
            sb.append(fn8.m(entry.getValue()));
            while (it.hasNext()) {
                sb.append(",\n  ");
                Map.Entry entry2 = (Map.Entry) it.next();
                sb.append(fn8.m(entry2.getKey()));
                sb.append(" : ");
                sb.append(fn8.m(entry2.getValue()));
            }
        }
    }

    public static final void a(l23 l23Var, vt4 vt4Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        kq7 kq7Var;
        boolean z2;
        boolean z3;
        rv4 rv4Var2 = rv4Var;
        String str = l23Var.f;
        String str2 = l23Var.a;
        float f2 = l23Var.g;
        vt4Var.getClass();
        rv4Var2.g0(970410875);
        if (rv4Var2.f(l23Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3 | 384;
        if ((i5 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            nq7 f3 = pna.f(kq7Var2, 1.0f);
            lk0 lk0Var = kh5.I;
            ez ezVar = lz.c;
            xn1 a2 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f3);
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
            nq7 v = nmd.v(tte.k(pna.f(kq7Var2, 1.0f), r0f.z(rv4Var2).c), rm1.g(r0f.y(rv4Var2), 7.0f), lre.g);
            if ((i5 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var2.P();
            if (z2 || P == ax1.a) {
                P = new a3c(9, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 y = zbe.y(q1d.b(v, false, 0.98f, (vt4) P, 1), 10.0f);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, y);
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
            do5.d(str2, l23Var.c, l23Var.e, r0f.d, tte.k(pna.h(pna.s(kq7Var2, 48.0f), 72.0f), r0f.z(rv4Var2).b), rv4Var2, 3072);
            we6 d2 = rs8.d(kq7Var2, 12.0f, rv4Var2, 1.0f, true);
            xn1 a4 = wn1.a(ezVar, lk0Var, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, d2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a4);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            cvb.c(str2, pna.f(kq7Var2, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, r0f.A(rv4Var2).i, rv4Var, 48, 24960, 109564);
            xbe.i(rv4Var, pna.h(kq7Var2, 4.0f));
            String str3 = l23Var.b;
            if (k4b.j0(str3)) {
                str3 = l23Var.d;
            }
            String str4 = str3;
            cvb.c(str4, pna.f(kq7Var2, 1.0f), r0f.y(rv4Var).s, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 1, 0, null, r0f.A(rv4Var).n, rv4Var, 48, 24960, 109560);
            rv4Var2 = rv4Var;
            if (f2 > nae.e) {
                s21.w(rv4Var2, 2112167282, kq7Var2, 4.0f, rv4Var2);
                z3 = false;
                b(f2, null, rv4Var2, 0);
                rv4Var2.q(false);
            } else {
                z3 = false;
                rv4Var2.e0(2112295095);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
            if (str.length() > 0) {
                s21.w(rv4Var2, 1015227260, kq7Var2, 12.0f, rv4Var2);
                cvb.c(str, pna.f(kq7Var2, 1.0f), zl1.b(0.88f, r0f.y(rv4Var2).q), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 0, false, 0, 0, null, r0f.A(rv4Var2).j, rv4Var, 48, 0, 130040);
                rv4Var2 = rv4Var;
                rv4Var2.q(z3);
            } else {
                rv4Var2.e0(1015585713);
                rv4Var2.q(z3);
            }
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new vg7(l23Var, vt4Var, kq7Var, i, 24);
        }
    }

    public static final void b(float f2, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        boolean z2;
        wk3 wk3Var;
        long j;
        rv4Var.g0(-957617580);
        if (rv4Var.c(f2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 48;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7Var2 = kq7.a;
            nq7 p = lye.p(rv4Var, nq7Var2);
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
            rv4Var.e0(1671335335);
            for (int i4 = 1; i4 < 6; i4++) {
                if (i4 <= ((int) f2)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    wk3Var = (wk3) ok3.A.getValue();
                } else {
                    wk3Var = (wk3) ok3.z.getValue();
                }
                ar5 c2 = rp5.c(wk3Var, rv4Var, 0);
                if (z2) {
                    rv4Var.e0(1671344575);
                    j = ((h27) rv4Var.j(j27.a)).a.a;
                } else {
                    rv4Var.e0(1671345832);
                    j = ((h27) rv4Var.j(j27.a)).a.s;
                }
                rv4Var.q(false);
                nk5.a(c2, null, pna.n(nq7Var2, 16.0f), j, rv4Var, 432, 0);
            }
            rv4Var.q(false);
            rv4Var.q(true);
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yq0(f2, nq7Var2, i, 1);
        }
    }

    public static final void c(int i, int i2, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        int i4;
        boolean z;
        nq7 nq7Var2;
        nq7 nq7Var3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(241701980);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i | i4;
        } else {
            i3 = i;
        }
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            if (i5 != 0) {
                nq7Var3 = kq7.a;
            } else {
                nq7Var3 = nq7Var;
            }
            nq7 f2 = pna.f(nq7Var3, 1.0f);
            tza tzaVar = j27.a;
            nq7 z2 = zbe.z(nmd.v(tte.k(f2, ((h27) rv4Var2.j(tzaVar)).c.d), zl1.b(0.05f, ((h27) rv4Var2.j(tzaVar)).a.a), lre.g), 12.0f, 14.0f);
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z2);
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
            cvb.c(yqe.A((y3b) k2b.s.getValue(), rv4Var2), null, ((h27) rv4Var2.j(tzaVar)).a.s, null, 0L, new wp4(1), dq4.e, null, 0L, gpb.d, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.j, rv4Var, 806879232, 0, 130458);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            nq7Var2 = nq7Var3;
        } else {
            rv4Var2.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new jq5(nq7Var2, i, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v5, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(java.util.List r40, boolean r41, defpackage.nq7 r42, defpackage.xt4 r43, defpackage.xt4 r44, defpackage.lu4 r45, defpackage.rv4 r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsc.d(java.util.List, boolean, nq7, xt4, xt4, lu4, rv4, int, int):void");
    }

    public static final void e(co3 co3Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        co3Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(-550873260);
        if (rv4Var.f(co3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(lu4Var)) {
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
        if (rv4Var.U(i5 & 1, z)) {
            boolean booleanValue = ((Boolean) co3Var.a.getValue()).booleanValue();
            nq7 x = mwe.x(kq7.a, 14);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new if7(co3Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(1161620392, new jf7(co3Var, lu4Var), rv4Var), null, x, jce.E(-236658453, new be3(co3Var, 1), rv4Var), b23.c, null, 0L, 0L, nae.e, false, false, jce.E(532284928, new be3(co3Var, 2), rv4Var), rv4Var, 1769856, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jf7(co3Var, lu4Var, i);
        }
    }

    public static final void f(boolean z, String str, String str2, int i, int i2, List list, io5 io5Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z2;
        rv4 rv4Var2;
        str.getClass();
        str2.getClass();
        list.getClass();
        io5Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(1418312802);
        if (rv4Var.g(z)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i13 = i3 | i4;
        if (rv4Var.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i14 = i13 | i5;
        if (rv4Var.f(str2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i15 = i14 | i6;
        if (rv4Var.d(i)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i16 = i15 | i7;
        if (rv4Var.d(i2)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i17 = i16 | i8;
        if (rv4Var.f(list)) {
            i9 = 131072;
        } else {
            i9 = Parser.ARGC_LIMIT;
        }
        int i18 = i17 | i9;
        if (rv4Var.f(io5Var)) {
            i10 = 1048576;
        } else {
            i10 = 524288;
        }
        int i19 = i18 | i10;
        if (rv4Var.h(xt4Var)) {
            i11 = 8388608;
        } else {
            i11 = 4194304;
        }
        int i20 = i19 | i11;
        if (rv4Var.h(xt4Var2)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i21 = i20 | i12;
        if ((38347923 & i21) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i21 & 1, z2)) {
            tu1 E = jce.E(138894057, new ke7(2, xt4Var, str2), rv4Var);
            tu1 E2 = jce.E(-1493487645, new xj7(str, i, i2, list, io5Var, xt4Var2), rv4Var);
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-930653770);
                rv4Var2 = rv4Var;
                hc2.b(pna.c, null, jce.E(195916563, new qh7(z, xt4Var, E, E2, 1), rv4Var), rv4Var2, 3078, 6);
                rv4Var2.q(false);
            } else {
                rv4Var.e0(-930039939);
                nmd.f(z, xt4Var, null, false, 0L, 0L, nae.e, 0L, nae.e, jce.E(919526647, new mh7(E, E2, 1), rv4Var), rv4Var, (i21 & 14) | 805309440 | ((i21 >> 18) & Token.ASSIGN_MOD), 500);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new e01(z, str, str2, i, i2, list, io5Var, xt4Var, xt4Var2, i3);
        }
    }

    public static final void g(nq7 nq7Var, ar5 ar5Var, String str, rv4 rv4Var, int i, int i2) {
        int i3;
        boolean z;
        ar5 ar5Var2;
        String str2;
        ar5 ar5Var3;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(1122727137);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0 && rv4Var.f(ar5Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0 && rv4Var.f(str)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                str3 = str;
                i4 = i3;
                ar5Var2 = ar5Var;
            } else {
                if ((i2 & 2) != 0) {
                    ar5Var3 = owe.D(rv4Var);
                    i3 &= -113;
                } else {
                    ar5Var3 = ar5Var;
                }
                if ((i2 & 4) != 0) {
                    str3 = yqe.A((y3b) o2b.l0.getValue(), rv4Var);
                    ar5 ar5Var4 = ar5Var3;
                    i4 = i3 & (-897);
                    ar5Var2 = ar5Var4;
                } else {
                    ar5 ar5Var5 = ar5Var3;
                    i4 = i3;
                    ar5Var2 = ar5Var5;
                    str3 = str;
                }
            }
            rv4Var.r();
            str2 = str3;
            jxe.d(ar5Var2, str2, null, zbe.A(nq7Var, 24.0f, nae.e, 2), null, null, rv4Var, (i4 >> 3) & Token.ELSE, 52);
        } else {
            rv4Var.X();
            ar5Var2 = ar5Var;
            str2 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qu0(nq7Var, ar5Var2, str2, i, i2, 4);
        }
    }

    public static final void h(String str, boolean z, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        rv4 rv4Var2;
        kq7 kq7Var;
        long j;
        dq4 dq4Var;
        long j2;
        rv4Var.g0(-11037314);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 384;
        if (rv4Var.h(vt4Var)) {
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
        if (rv4Var.U(i7 & 1, z2)) {
            kq7 kq7Var2 = kq7.a;
            nq7 f2 = lbe.f(15, vt4Var, pna.f(kq7Var2, 1.0f), null, false);
            if (z) {
                rv4Var.e0(-2016914000);
                j = zl1.b(0.1f, ((h27) rv4Var.j(j27.a)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-2016913047);
                rv4Var.q(false);
                j = zl1.h;
            }
            nq7 z3 = zbe.z(nmd.v(f2, j, lre.g), 24.0f, 14.0f);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z3);
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
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.k;
            if (z) {
                dq4Var = dq4.D;
            } else {
                dq4Var = dq4.e;
            }
            dq4 dq4Var2 = dq4Var;
            if (z) {
                rv4Var.e0(-291785943);
                j2 = ((h27) rv4Var.j(tzaVar)).a.a;
            } else {
                rv4Var.e0(-291784693);
                j2 = ((h27) rv4Var.j(tzaVar)).a.q;
            }
            rv4Var.q(false);
            cvb.c(str, new we6(1.0f, true), j2, null, 0L, null, dq4Var2, null, 0L, null, null, 0L, 2, false, 2, 0, null, oybVar, rv4Var, i7 & 14, 24960, 110520);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ib2(str, z, kq7Var, vt4Var, i, 1);
        }
    }

    public static final void i(String str, int i, int i2, io5 io5Var, th8 th8Var, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        rv4Var.g0(-1098758614);
        if (rv4Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i10 = i3 | i4;
        if (rv4Var.d(i)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i11 = i10 | i5;
        if (rv4Var.d(i2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i12 = i11 | i6;
        if (rv4Var.f(io5Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i13 = i12 | i7;
        if (rv4Var.f(th8Var)) {
            i8 = 16384;
        } else {
            i8 = 8192;
        }
        int i14 = i13 | i8;
        if (rv4Var.h(xt4Var)) {
            i9 = 1048576;
        } else {
            i9 = 524288;
        }
        int i15 = i14 | i9;
        if ((599187 & i15) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i15 & 1, z)) {
            int i16 = i - 1;
            if (i16 < 0) {
                i16 = 0;
            }
            do5.f(io5Var, jce.E(626746533, new u34(th8Var, tg6.a(dce.n(i2, 0, i16), 2, rv4Var), nq7Var, i, str, i2, xt4Var), rv4Var), rv4Var, ((i15 >> 9) & 14) | 48);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new u34(str, i, i2, io5Var, th8Var, nq7Var, xt4Var, i3, 2);
        }
    }

    public static final void j(String str, int i, boolean z, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z2;
        float f2;
        boolean z3;
        long b2;
        boolean z4;
        boolean z5;
        boolean z6;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        String str2 = str;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-537087231);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(str2)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.d(i)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.g(z)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i3 & 1, z2)) {
            kq7 kq7Var = kq7.a;
            nq7 f3 = lbe.f(15, vt4Var, kq7Var, null, false);
            xn1 a2 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, f3);
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
            int i8 = i3;
            nq7 v = nmd.v(tte.k(t(0.72f, pna.f(kq7Var, 1.0f), false), r0f.z(rv4Var2).b), rm1.g(r0f.y(rv4Var2), 2.0f), lre.g);
            if (z) {
                f2 = 2.0f;
            } else {
                f2 = 1.0f;
            }
            if (z) {
                rv4Var2.e0(-1368314598);
                b2 = r0f.y(rv4Var2).a;
                z3 = false;
                rv4Var2.q(false);
            } else {
                z3 = false;
                rv4Var2.e0(-1368227488);
                b2 = zl1.b(0.4f, r0f.y(rv4Var2).B);
                rv4Var2.q(false);
            }
            nq7 d2 = st0.d(v, f2, b2, r0f.z(rv4Var2).b);
            b37 d3 = fu0.d(kh5.a, z3);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, d2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            if ((i8 & 14) == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i8 & Token.ASSIGN_MOD) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z7 = z4 | z5;
            Object P = rv4Var2.P();
            if (!z7 && P != ax1.a) {
                str2 = str;
            } else {
                str2 = str;
                P = new sq8(str2, i);
                rv4Var2.o0(P);
            }
            do5.b((sq8) P, r0f.e, false, null, jce.E(1757837641, new zj7(i, 0), rv4Var2), pna.c, rv4Var2, 1769520, Token.SET_REF_OP);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.h(kq7Var, 4.0f));
            String valueOf2 = String.valueOf(i + 1);
            oyb oybVar = r0f.A(rv4Var2).o;
            if (z) {
                rv4Var2.e0(648639646);
                j = r0f.y(rv4Var2).a;
                z6 = false;
            } else {
                z6 = false;
                rv4Var2.e0(648640896);
                j = r0f.y(rv4Var2).q;
            }
            rv4Var2.q(z6);
            cvb.c(valueOf2, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ak7(i, i2, vt4Var, str2, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0147, code lost:
        if (r1 == r0) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(final java.lang.String r21, final int r22, final int r23, final java.util.List r24, final defpackage.io5 r25, defpackage.nq7 r26, final defpackage.xt4 r27, defpackage.rv4 r28, int r29) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsc.k(java.lang.String, int, int, java.util.List, io5, nq7, xt4, rv4, int):void");
    }

    public static final void l(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1639402832);
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
            nq7 C = zbe.C(nq7Var, 24.0f, nae.e, 12.0f, 4.0f, 2);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, C);
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
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.h;
            cvb.c(str, new we6(1.0f, true), ((h27) rv4Var2.j(tzaVar)).a.q, null, 0L, null, dq4.C, null, 0L, null, null, 0L, 2, false, 1, 0, null, oybVar, rv4Var, (i5 & 14) | 1572864, 24960, 110520);
            rv4Var2 = rv4Var;
            kwe.d(rp5.c((wk3) jk3.w.getValue(), rv4Var2, 0), null, 0L, vt4Var, rv4Var2, (i5 << 3) & 7168, 6);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new k31(str, nq7Var, vt4Var, i, 10);
        }
    }

    public static final void m(final List list, final int i, final th8 th8Var, final nq7 nq7Var, final xt4 xt4Var, rv4 rv4Var, final int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        ek9 u;
        lu4 lu4Var;
        boolean z2;
        boolean z3;
        int i7;
        boolean z4;
        boolean z5;
        boolean z6;
        rv4Var.g0(-883761781);
        if (rv4Var.f(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i2 | i3;
        if (rv4Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i9 = i8 | i4;
        if (rv4Var.f(th8Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(xt4Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            if (list.isEmpty()) {
                rv4Var.e0(2518317);
                g(nq7Var, owe.F(rv4Var), yqe.A((y3b) o3b.M.getValue(), rv4Var), rv4Var, 6, 0);
                rv4Var.q(false);
                u = rv4Var.u();
                if (u != null) {
                    lu4Var = new lu4(list, i, th8Var, nq7Var, xt4Var, i2, 0) { // from class: vj7
                        public final /* synthetic */ int a;
                        public final /* synthetic */ List b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ th8 d;
                        public final /* synthetic */ nq7 e;
                        public final /* synthetic */ xt4 f;

                        {
                            this.a = r7;
                        }

                        @Override // defpackage.lu4
                        public final Object invoke(Object obj, Object obj2) {
                            int i12 = this.a;
                            pvc pvcVar = pvc.a;
                            switch (i12) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int p = xoe.p(3073);
                                    jsc.m(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p);
                                    return pvcVar;
                                default:
                                    ((Integer) obj2).getClass();
                                    int p2 = xoe.p(3073);
                                    jsc.m(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p2);
                                    return pvcVar;
                            }
                        }
                    };
                    u.d = lu4Var;
                }
                return;
            }
            rv4Var.e0(2712439);
            rv4Var.q(false);
            int i12 = i11 & 14;
            if (i12 != 4) {
                z2 = false;
            } else {
                z2 = true;
            }
            int i13 = i11 & Token.ASSIGN_MOD;
            if (i13 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z2 | z3;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z7 || P == lh9Var) {
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        if (((mq5) listIterator.previous()).c <= i) {
                            i7 = listIterator.nextIndex();
                            break;
                        }
                    } else {
                        i7 = -1;
                        break;
                    }
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                P = Integer.valueOf(i7);
                rv4Var.o0(P);
            }
            kj6 a2 = mj6.a(((Number) P).intValue(), rv4Var, 0, 2);
            bkd r = mwe.r(th8Var, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            if (i12 != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i13 == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z8 = z4 | z5;
            if ((57344 & i11) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z9 = z8 | z6;
            Object P2 = rv4Var.P();
            if (z9 || P2 == lh9Var) {
                P2 = new wj7(i, 0, xt4Var, list);
                rv4Var.o0(P2);
            }
            pc2.c(nq7Var, a2, th8Var, null, null, null, false, r, 0L, 0L, 6.0f, (xt4) P2, rv4Var, 6 | (i11 & 896), 48, 1784);
        } else {
            rv4Var.X();
        }
        u = rv4Var.u();
        if (u != null) {
            lu4Var = new lu4(list, i, th8Var, nq7Var, xt4Var, i2, 1) { // from class: vj7
                public final /* synthetic */ int a;
                public final /* synthetic */ List b;
                public final /* synthetic */ int c;
                public final /* synthetic */ th8 d;
                public final /* synthetic */ nq7 e;
                public final /* synthetic */ xt4 f;

                {
                    this.a = r7;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    int i122 = this.a;
                    pvc pvcVar = pvc.a;
                    switch (i122) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int p = xoe.p(3073);
                            jsc.m(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p);
                            return pvcVar;
                        default:
                            ((Integer) obj2).getClass();
                            int p2 = xoe.p(3073);
                            jsc.m(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p2);
                            return pvcVar;
                    }
                }
            };
            u.d = lu4Var;
        }
    }

    public static final void n(rj8 rj8Var, List list, List list2, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4Var.g0(-1621040980);
        if (rv4Var.f(rj8Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(list2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            d3a.c(rj8Var.k(), nq7Var, zl1.h, 0L, nae.e, jce.E(-1520562228, new os1(rj8Var, 5), rv4Var), fca.e, jce.E(1319312844, new rj7(list, rj8Var, xt4Var, list2), rv4Var), rv4Var, 14377392, 8);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wp0(rj8Var, list, list2, nq7Var, xt4Var, i, 18);
        }
    }

    public static final void o(p23 p23Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        long j;
        kq7 kq7Var2;
        rv4 rv4Var2 = rv4Var;
        int i3 = p23Var.b;
        rv4Var2.g0(-708638944);
        if (rv4Var2.f(p23Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 48;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i4 & 1, z)) {
            kq7 kq7Var3 = kq7.a;
            nq7 y = zbe.y(nmd.v(tte.k(pna.f(kq7Var3, 1.0f), r0f.z(rv4Var2).d), zl1.b(0.88f, r0f.y(rv4Var2).p), lre.g), 12.0f);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, kq7Var3);
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
            String A = yqe.A(J(i3), rv4Var2);
            oyb oybVar = r0f.A(rv4Var2).m;
            if (i3 == 5) {
                rv4Var2.e0(1944219167);
                j = r0f.y(rv4Var2).a;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(1944297814);
                j = r0f.y(rv4Var2).s;
                rv4Var2.q(false);
            }
            cvb.c(A, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 0, 0, 131066);
            xbe.i(rv4Var, new we6(1.0f, true));
            cvb.c(p23Var.a.b, null, r0f.y(rv4Var).s, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).m, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            if (!k4b.j0(p23Var.c)) {
                s21.w(rv4Var2, -370011624, kq7Var3, 8.0f, rv4Var2);
                kq7Var2 = kq7Var3;
                cvb.c(p23Var.c, null, zl1.b(0.84f, r0f.y(rv4Var).q), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, r0f.A(rv4Var).k, rv4Var, 0, 0, 131066);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                kq7Var2 = kq7Var3;
                rv4Var2.e0(-369746388);
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            kq7Var = kq7Var2;
        } else {
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new f58(p23Var, kq7Var, i, 23);
        }
    }

    public static final void p(q23 q23Var, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        q23 q23Var2;
        kq7 kq7Var;
        int i3;
        y3b y3bVar;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        int i4 = q23Var.b;
        rv4Var2.g0(-1390260552);
        if (rv4Var2.f(q23Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2 | 48;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            kq7Var = kq7Var2;
            cvb.c(q23Var.a, null, 0L, null, 0L, null, dq4.C, null, 0L, null, null, zr1.o(1.15d), 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var, 1572864, 48, 128958);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7Var, 10.0f));
            gv9 a3 = ev9.a(new hz(8.0f, true, new vs(2)), kh5.F, rv4Var2, 6);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, kq7Var);
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
            q23Var2 = q23Var;
            int i6 = q23Var2.c;
            if (i6 != 1) {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i3 = 4;
                        if (i6 != 4) {
                            y3bVar = (y3b) x2b.H.getValue();
                        } else {
                            y3bVar = (y3b) k3b.H0.getValue();
                        }
                    } else {
                        i3 = 4;
                        y3bVar = (y3b) k3b.I0.getValue();
                    }
                } else {
                    i3 = 4;
                    y3bVar = (y3b) s2b.f0.getValue();
                }
            } else {
                i3 = 4;
                y3bVar = (y3b) x2b.H.getValue();
            }
            q(yqe.A(y3bVar, rv4Var2), false, null, rv4Var2, 48, 4);
            String A = yqe.A(J(i4), rv4Var2);
            if (i4 == i3) {
                z2 = true;
            } else {
                z2 = false;
            }
            q(A, z2, null, rv4Var2, 0, 4);
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            q23Var2 = q23Var;
            rv4Var2.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new f58(q23Var2, kq7Var, i, 24);
        }
    }

    public static final void q(String str, boolean z, nq7 nq7Var, rv4 rv4Var, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        boolean z2;
        rv4 rv4Var2;
        Object obj2;
        nq7 nq7Var2;
        long g2;
        long b2;
        long j;
        int i6;
        str.getClass();
        rv4Var.g0(1282193106);
        if (rv4Var.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i | i3;
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i7 |= i6;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i5 = i7 | 384;
            obj = nq7Var;
        } else {
            obj = nq7Var;
            if (rv4Var.f(obj)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i5 = i7 | i4;
        }
        if ((i5 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i5 & 1, z2)) {
            if (i8 != 0) {
                nq7Var2 = kq7.a;
            } else {
                nq7Var2 = obj;
            }
            su9 su9Var = uu9.a;
            nq7 k = tte.k(nq7Var2, su9Var);
            if (z) {
                rv4Var.e0(-1624089645);
                g2 = zl1.b(0.14f, ((h27) rv4Var.j(j27.a)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1623991375);
                g2 = rm1.g(((h27) rv4Var.j(j27.a)).a, 6.0f);
                rv4Var.q(false);
            }
            nq7 v = nmd.v(k, g2, lre.g);
            if (z) {
                rv4Var.e0(-1623793068);
                b2 = zl1.b(0.2f, ((h27) rv4Var.j(j27.a)).a.a);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1623695759);
                b2 = zl1.b(0.08f, ((h27) rv4Var.j(j27.a)).a.q);
                rv4Var.q(false);
            }
            nq7 z3 = zbe.z(st0.d(v, 1.0f, b2, su9Var), 10.0f, 6.0f);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, z3);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var.j(tzaVar)).b.m;
            if (z) {
                rv4Var.e0(1701556233);
                j = ((h27) rv4Var.j(tzaVar)).a.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(1701626944);
                j = ((h27) rv4Var.j(tzaVar)).a.s;
                rv4Var.q(false);
            }
            obj2 = nq7Var2;
            cvb.c(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, i5 & 14, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
            obj2 = obj;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ak7(str, z, obj2, i, i2);
        }
    }

    public static Collection r(Object obj) {
        if ((obj instanceof j76) && !(obj instanceof k76)) {
            K(obj, "kotlin.collections.MutableCollection");
            throw null;
        }
        try {
            return (Collection) obj;
        } catch (ClassCastException e2) {
            c16.v(e2, jsc.class.getName());
            throw e2;
        }
    }

    public static Map s(Object obj) {
        if ((obj instanceof j76) && !(obj instanceof n76)) {
            K(obj, "kotlin.collections.MutableMap");
            throw null;
        }
        try {
            return (Map) obj;
        } catch (ClassCastException e2) {
            c16.v(e2, jsc.class.getName());
            throw e2;
        }
    }

    public static final nq7 t(float f2, nq7 nq7Var, boolean z) {
        return nq7Var.a0(new f00(f2, z));
    }

    public static void u(int i, Object obj) {
        if (obj != null && !G(i, obj)) {
            K(obj, "kotlin.jvm.functions.Function" + i);
            throw null;
        }
    }

    public static final Bundle v(yk8... yk8VarArr) {
        Bundle bundle = new Bundle(yk8VarArr.length);
        for (yk8 yk8Var : yk8VarArr) {
            String str = (String) yk8Var.a;
            Object obj = yk8Var.b;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else if (Serializable.class.isAssignableFrom(componentType)) {
                    bundle.putSerializable(str, (Serializable) obj);
                } else {
                    vs.m(hl5.o("Illegal value array type ", componentType.getCanonicalName(), " for key \"", str, "\""));
                    return null;
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else if (obj instanceof SizeF) {
                bundle.putSizeF(str, (SizeF) obj);
            } else {
                vs.m(hl5.o("Illegal value type ", obj.getClass().getCanonicalName(), " for key \"", str, "\""));
                return null;
            }
        }
        return bundle;
    }

    public static void w(Object obj, String str) {
        if (obj != null) {
            return;
        }
        xk5.k(str);
    }

    public static final aw7 x(sj4 sj4Var, Object obj, rv4 rv4Var, int i) {
        return y(sj4Var, obj, ((un6) rv4Var.j(nu6.a)).k(), rv4Var, (i & Token.ASSIGN_MOD) | (((i >> 3) & 8) << 3));
    }

    public static final aw7 y(sj4 sj4Var, Object obj, xn6 xn6Var, rv4 rv4Var, int i) {
        boolean z;
        kn6 kn6Var = kn6.d;
        Object obj2 = gs3.a;
        Object[] objArr = {sj4Var, xn6Var, kn6Var, obj2};
        boolean h = rv4Var.h(xn6Var);
        if ((((i & 7168) ^ 3072) > 2048 && rv4Var.d(kn6Var.ordinal())) || (i & 3072) == 2048) {
            z = true;
        } else {
            z = false;
        }
        boolean h2 = z | h | rv4Var.h(obj2) | rv4Var.h(sj4Var);
        Object P = rv4Var.P();
        Object obj3 = ax1.a;
        if (h2 || P == obj3) {
            P = new uw2(xn6Var, sj4Var, (m42) null, 27);
            rv4Var.o0(P);
        }
        lu4 lu4Var = (lu4) P;
        Object P2 = rv4Var.P();
        if (P2 == obj3) {
            P2 = yae.z(obj);
            rv4Var.o0(P2);
        }
        aw7 aw7Var = (aw7) P2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean h3 = rv4Var.h(lu4Var);
        Object P3 = rv4Var.P();
        if (h3 || P3 == obj3) {
            P3 = new mra(lu4Var, aw7Var, null, 3);
            rv4Var.o0(P3);
        }
        yte.j(copyOf, (lu4) P3, rv4Var);
        return aw7Var;
    }

    public static final aw7 z(aza azaVar, rv4 rv4Var) {
        return y(azaVar, azaVar.getValue(), ((un6) rv4Var.j(nu6.a)).k(), rv4Var, 0);
    }

    public tb7 A(vb7 vb7Var) {
        boolean z;
        ByteBuffer byteBuffer = vb7Var.e;
        byteBuffer.getClass();
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        return B(vb7Var, byteBuffer);
    }

    public abstract tb7 B(vb7 vb7Var, ByteBuffer byteBuffer);
}
