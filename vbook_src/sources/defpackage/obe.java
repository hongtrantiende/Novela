package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import org.mozilla.javascript.ES6Iterator;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: obe  reason: default package */
/* loaded from: classes3.dex */
public abstract class obe {
    public static final fk1 a = new fk1(null);
    public static final tu1 b = new tu1(new sv1(5), false, 251214842);

    public static final void A(vf6 vf6Var, String str, List list, xt4 xt4Var, lu4 lu4Var) {
        vf6Var.getClass();
        str.getClass();
        xt4Var.getClass();
        lu4Var.getClass();
        vf6Var.z(list.size(), new poa(3, new eja(25), list), new aw0(5, new tsa(1, (byte) 0), list), new pj7(26, list), new tu1(new td0(list, str, xt4Var, lu4Var, 11), true, -1117249557));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [vl8, c3e, h4b] */
    public static final void B(xtc xtcVar, xtc xtcVar2) {
        xtcVar.getClass();
        xtcVar2.getClass();
        xtcVar.d = xtcVar2.d;
        String str = xtcVar2.a;
        str.getClass();
        xtcVar.a = str;
        xtcVar.e(xtcVar2.c);
        List list = xtcVar2.h;
        list.getClass();
        xtcVar.h = list;
        xtcVar.e = xtcVar2.e;
        xtcVar.f = xtcVar2.f;
        ?? c3eVar = new c3e(8);
        hu7.h(c3eVar, xtcVar2.i);
        xtcVar.i = c3eVar;
        xtcVar.j = new xyc(c3eVar);
        String str2 = xtcVar2.g;
        str2.getClass();
        xtcVar.g = str2;
        xtcVar.b = xtcVar2.b;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [vl8, c3e] */
    public static final void C(xtc xtcVar, vyc vycVar) {
        int i;
        xtcVar.getClass();
        vycVar.getClass();
        xtcVar.d = vycVar.D;
        String str = vycVar.a;
        str.getClass();
        xtcVar.a = str;
        int i2 = vycVar.b;
        Integer valueOf = Integer.valueOf(i2);
        if (i2 == 0) {
            valueOf = null;
        }
        if (valueOf != null) {
            i = valueOf.intValue();
        } else {
            i = vycVar.E.b;
        }
        xtcVar.e(i);
        jbe.U(xtcVar, (String) vycVar.F.getValue());
        xtcVar.e = (String) vycVar.H.getValue();
        xtcVar.f = (String) vycVar.I.getValue();
        ?? c3eVar = new c3e(8);
        c3eVar.i(ube.A((String) vycVar.G.getValue()));
        xtcVar.i = c3eVar;
        xtcVar.j = new xyc(c3eVar);
        String str2 = (String) vycVar.J.getValue();
        str2.getClass();
        xtcVar.g = str2;
        xtcVar.b = vycVar.f;
    }

    public static void D(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble(ES6Iterator.VALUE_PROPERTY, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong(ES6Iterator.VALUE_PROPERTY, ((Long) obj).longValue());
        } else {
            bundle.putString(ES6Iterator.VALUE_PROPERTY, obj.toString());
        }
    }

    public static Object E(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        vs.k(s21.q(nk2.y("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), "]"));
        return null;
    }

    public static final void c(boolean z, long j, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        xt4Var.getClass();
        xt4Var2.getClass();
        rv4Var.g0(1783631034);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.e(j)) {
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
        if (rv4Var.h(xt4Var2)) {
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
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-1183068417);
                int i10 = i9 & Token.ELSE;
                int i11 = i9 << 3;
                d(z, j, null, xt4Var, xt4Var2, rv4Var, i10 | (i11 & 7168) | (i11 & 57344));
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1182863228);
                int i12 = i9 & Token.ELSE;
                int i13 = i9 << 3;
                e(z, j, null, xt4Var, xt4Var2, rv4Var, i12 | (i13 & 7168) | (i13 & 57344));
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yl(z, j, xt4Var, xt4Var2, i);
        }
    }

    public static final void d(boolean z, final long j, nq7 nq7Var, xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        kq7 kq7Var;
        int i4;
        int i5;
        rv4Var.g0(-615871053);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 384;
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i7 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i7 |= i4;
        }
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            tu1 E = jce.E(1689268751, new mu4() { // from class: kk7
                @Override // defpackage.mu4
                public final Object c(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    rv4 rv4Var2 = (rv4) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zn1) obj).getClass();
                    if ((intValue & 17) != 16) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z3)) {
                        obe.f(j, zbe.A(mwe.x(pna.f(kq7.a, 1.0f), 14), 24.0f, nae.e, 2), xt4Var2, rv4Var2, 0, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var);
            int i8 = (i7 >> 6) & Token.ASSIGN_MOD;
            kq7 kq7Var2 = kq7.a;
            nmd.d(z, xt4Var, kq7Var2, true, null, null, 0L, 0L, nae.e, 0L, null, E, rv4Var, i8 | (i7 & 14) | 3072 | 384, 48, 2032);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lk7(z, j, kq7Var, xt4Var, xt4Var2, i, 0);
        }
    }

    public static final void e(boolean z, long j, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        kq7 kq7Var;
        int i4;
        int i5;
        rv4Var.g0(2095643859);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3 | 384;
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i7 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i7 |= i4;
        }
        if ((i7 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            tu1 tu1Var = pc2.f;
            tu1 E = jce.E(-407559553, new mk7(j, xt4Var2), rv4Var);
            int i8 = (i7 >> 6) & Token.ASSIGN_MOD;
            kq7 kq7Var2 = kq7.a;
            xb.d(z, xt4Var, null, kq7Var2, null, null, tu1Var, null, 0L, 0L, nae.e, false, false, E, rv4Var, i8 | (i7 & 14) | 1572864 | 3072, 8116);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lk7(z, j, kq7Var, xt4Var, xt4Var2, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(long j, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        Object obj;
        int i4;
        int i5;
        int i6;
        boolean z;
        nq7 nq7Var2;
        kq7 kq7Var;
        boolean z2;
        nq7 nq7Var3;
        aw7 aw7Var;
        aw7 aw7Var2;
        Long[] lArr;
        lh9 lh9Var;
        kq7 kq7Var2;
        int i7;
        int i8;
        rv4 rv4Var2;
        float f;
        int i9;
        int i10;
        rv4 rv4Var3 = rv4Var;
        rv4Var3.g0(897470997);
        if (rv4Var3.e(j)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i11 = i | i3;
        int i12 = i2 & 2;
        if (i12 != 0) {
            i5 = i11 | 48;
            obj = nq7Var;
        } else {
            obj = nq7Var;
            if (rv4Var3.f(obj)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 = i11 | i4;
        }
        if (rv4Var3.h(xt4Var)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i13 = i5 | i6;
        if ((i13 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i13 & 1, z)) {
            kq7 kq7Var3 = kq7.a;
            if (i12 != 0) {
                kq7Var = kq7Var3;
            } else {
                kq7Var = obj;
            }
            Object P = rv4Var3.P();
            long j2 = 0;
            lh9 lh9Var2 = ax1.a;
            Long[] lArr2 = P;
            if (P == lh9Var2) {
                Long[] lArr3 = {0L, 1800L, 3600L, 5400L, 7200L};
                rv4Var3.o0(lArr3);
                lArr2 = lArr3;
            }
            Long[] lArr4 = (Long[]) lArr2;
            if ((i13 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var3.P();
            if (z2 || P2 == lh9Var2) {
                long j3 = j / 60;
                if (j3 >= 0) {
                    j2 = j3;
                }
                String valueOf = String.valueOf(j2);
                int length = valueOf.length();
                P2 = yae.z(new jub(valueOf, sze.a(length, length), 4));
                rv4Var3.o0(P2);
            }
            aw7 aw7Var3 = (aw7) P2;
            Object P3 = rv4Var3.P();
            if (P3 == lh9Var2) {
                int r0 = b00.r0(Long.valueOf(j), lArr4);
                Integer valueOf2 = Integer.valueOf(r0);
                if (r0 == -1) {
                    valueOf2 = null;
                }
                if (valueOf2 != null) {
                    i10 = valueOf2.intValue();
                } else {
                    i10 = 5;
                }
                P3 = yae.z(Integer.valueOf(i10));
                rv4Var3.o0(P3);
            }
            aw7 aw7Var4 = (aw7) P3;
            List m = cqe.m((q3b) nz.o.getValue(), rv4Var3);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
            int hashCode = Long.hashCode(rv4Var3.T);
            xt8 l = rv4Var3.l();
            nq7 p = lye.p(rv4Var3, kq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var);
            } else {
                rv4Var3.r0();
            }
            jce.F(qw1.f, rv4Var3, a2);
            jce.F(qw1.e, rv4Var3, l);
            jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var3);
            jce.F(qw1.d, rv4Var3, p);
            nq7 nq7Var4 = kq7Var;
            s9e.f(zbe.z(pna.f(kq7Var3, 1.0f), 12.0f, 12.0f), new hz(8.0f, true, new vs(2)), new hz(8.0f, true, new vs(2)), null, 0, 0, jce.E(765212976, new gg7(m, aw7Var4, 1), rv4Var3), rv4Var3, 1573302);
            if (((Number) aw7Var4.getValue()).intValue() == 5) {
                rv4Var3.e0(717088540);
                Object P4 = rv4Var3.P();
                if (P4 == lh9Var2) {
                    P4 = s21.e(rv4Var3);
                }
                zm4 zm4Var = (zm4) P4;
                Object P5 = rv4Var3.P();
                if (P5 == lh9Var2) {
                    P5 = new l24(zm4Var, null, 6);
                    rv4Var3.o0(P5);
                }
                yte.g((lu4) P5, rv4Var3, pvc.a);
                jub jubVar = (jub) aw7Var3.getValue();
                t86 t86Var = new t86(3, 7, Token.HOOK);
                v72 v72Var = ((h27) rv4Var3.j(j27.a)).c.b;
                nq7 A = zbe.A(mwe.n(pna.f(kq7Var3, 1.0f), zm4Var), 12.0f, nae.e, 2);
                boolean f2 = rv4Var3.f(aw7Var3);
                Object P6 = rv4Var3.P();
                if (f2 || P6 == lh9Var2) {
                    P6 = new dk7(aw7Var3, 3);
                    rv4Var3.o0(P6);
                }
                aw7Var2 = aw7Var3;
                lArr = lArr4;
                nq7Var3 = nq7Var4;
                aw7Var = aw7Var4;
                kq7Var2 = kq7Var3;
                lh9Var = lh9Var2;
                i7 = 0;
                i8 = i13;
                f = 12.0f;
                uwe.g(jubVar, (xt4) P6, A, false, null, pc2.g, pc2.h, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var, 102236160, 12779520, 6127288);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                nq7Var3 = nq7Var4;
                aw7Var = aw7Var4;
                aw7Var2 = aw7Var3;
                lArr = lArr4;
                lh9Var = lh9Var2;
                kq7Var2 = kq7Var3;
                i7 = 0;
                i8 = i13;
                rv4Var2 = rv4Var3;
                f = 12.0f;
                rv4Var2.e0(718190807);
                rv4Var2.q(false);
            }
            xbe.i(rv4Var2, pna.h(kq7Var2, f));
            ar5 c = rp5.c((wk3) jk3.v.getValue(), rv4Var2, i7);
            String A2 = yqe.A((y3b) b3b.F.getValue(), rv4Var2);
            nq7 A3 = zbe.A(pna.f(kq7Var2, 1.0f), 16.0f, nae.e, 2);
            if (((Number) aw7Var.getValue()).intValue() == 5 && ((jub) aw7Var2.getValue()).a.b.length() <= 0) {
                i9 = i7;
            } else {
                i9 = 1;
            }
            if ((i8 & 896) == 256) {
                i7 = 1;
            }
            aw7 aw7Var5 = aw7Var2;
            Long[] lArr5 = lArr;
            int f3 = rv4Var2.f(aw7Var5) | i7 | (rv4Var2.h(lArr5) ? 1 : 0);
            Object P7 = rv4Var2.P();
            if (f3 != 0 || P7 == lh9Var) {
                xw0 xw0Var = new xw0((Object) xt4Var, (Object) lArr5, aw7Var, (yya) aw7Var5, 14);
                rv4Var2.o0(xw0Var);
                P7 = xw0Var;
            }
            z1d.f(c, A2, i9, null, A3, null, null, null, (vt4) P7, rv4Var2, 24576, 232);
            rv4Var3 = rv4Var2;
            rv4Var3.q(true);
            nq7Var2 = nq7Var3;
        } else {
            rv4Var3.X();
            nq7Var2 = obj;
        }
        ek9 u = rv4Var3.u();
        if (u != null) {
            u.d = new mb(j, nq7Var2, xt4Var, i, i2);
        }
    }

    public static final void g(String str, String str2, String str3, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        boolean z2;
        pb2 pb2Var;
        str.getClass();
        xt4Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(1177798217);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (rv4Var.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i10 = i9 | i4;
        if (rv4Var.f(nq7Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i11 = i10 | i5;
        if (rv4Var.h(xt4Var)) {
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
        boolean z3 = true;
        if ((74899 & i13) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            String o = eub.o(str, "-", str3);
            if ((i13 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i13 & 896) != 256) {
                z3 = false;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z4 || P == obj) {
                P = new m43(str, str3, 5);
                rv4Var.o0(P);
            }
            vt4 vt4Var2 = (vt4) P;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(oua.class);
                oua ouaVar = (oua) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", o), pb2Var2, a3, vt4Var2));
                boolean f = rv4Var.f(ouaVar);
                Object P2 = rv4Var.P();
                if (f || P2 == obj) {
                    P2 = new ux9(ouaVar, 18);
                    rv4Var.o0(P2);
                }
                tte.d(ouaVar, null, (xt4) P2, rv4Var, 0);
                aw7 z5 = jsc.z(ouaVar.W, rv4Var);
                if (((kua) z5.getValue()).a) {
                    rv4Var.e0(-2095524984);
                    n(pna.f(nq7Var, 1.0f), rv4Var, 0);
                    rv4Var.q(false);
                } else if (((kua) z5.getValue()).d) {
                    rv4Var.e0(-2095407370);
                    nq7 f2 = pna.f(nq7Var, 1.0f);
                    boolean f3 = rv4Var.f(ouaVar);
                    Object P3 = rv4Var.P();
                    if (f3 || P3 == obj) {
                        P3 = new ak9(ouaVar, 24);
                        rv4Var.o0(P3);
                    }
                    m((i13 >> 3) & 14, (vt4) P3, rv4Var, f2, str2);
                    rv4Var.q(false);
                } else if (!((kua) z5.getValue()).c.isEmpty()) {
                    rv4Var.e0(-2095165632);
                    l(str2, ((kua) z5.getValue()).c, ((kua) z5.getValue()).b, pna.f(nq7Var, 1.0f), vt4Var, xt4Var, rv4Var, ((i13 << 3) & 458752) | ((i13 >> 3) & 57358));
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-2094845929);
                    rv4Var.q(false);
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new bn7(str, str2, str3, nq7Var, xt4Var, vt4Var, i);
        }
    }

    public static final void l(String str, List list, boolean z, nq7 nq7Var, vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        String str2;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        int i8;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(906532615);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if ((i & 64) == 0) {
                h = rv4Var2.f(list);
            } else {
                h = rv4Var2.h(list);
            }
            if (h) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.g(z)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((i9 & 74899) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i9 & 1, z2)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            kq7 kq7Var = kq7.a;
            nq7 f = pna.f(kq7Var, 1.0f);
            if ((i9 & 57344) == 16384) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            boolean z5 = z3;
            lh9 lh9Var = ax1.a;
            if (z5 || P == lh9Var) {
                P = new on7(27, vt4Var);
                rv4Var2.o0(P);
            }
            nq7 t = q1d.t(0, (vt4) P, rv4Var2, f, z);
            gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
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
            rv4Var2.e0(-668038833);
            if (str.length() == 0) {
                str2 = yqe.A((y3b) k2b.b.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            boolean z6 = false;
            rv4Var2.q(false);
            we6 we6Var = new we6(1.0f, true);
            tza tzaVar = j27.a;
            cvb.c(str2, we6Var, ((h27) rv4Var2.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.g, rv4Var, 0, 0, 131064);
            if (z) {
                rv4Var.e0(765909272);
                nk5.a(rp5.c((wk3) jk3.f.getValue(), rv4Var, 0), null, pna.n(kq7Var, 24.0f), 0L, rv4Var, 432, 8);
                rv4Var.q(false);
            } else {
                rv4Var.e0(766116321);
                rv4Var.q(false);
            }
            rs8.u(rv4Var, true, kq7Var, 24.0f, rv4Var);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            hz hzVar = new hz(8.0f, true, new vs(2));
            if ((i9 & Token.ASSIGN_MOD) != 32 && ((i9 & 64) == 0 || !rv4Var.h(list))) {
                z4 = false;
            } else {
                z4 = true;
            }
            if ((i9 & 458752) == 131072) {
                z6 = true;
            }
            boolean z7 = z4 | z6;
            Object P2 = rv4Var.P();
            if (z7 || P2 == lh9Var) {
                P2 = new yv0(list, xt4Var, 10);
                rv4Var.o0(P2);
            }
            jce.e(f2, null, null, false, hzVar, null, null, false, null, (xt4) P2, rv4Var, 24582, 494);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new sg1(str, list, z, nq7Var, vt4Var, xt4Var, i);
        }
    }

    public static final void m(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        boolean z;
        String str2;
        String str3;
        int i3;
        int i4;
        int i5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1865241688);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.h(vt4Var)) {
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
        if (rv4Var2.U(i2 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
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
            rv4Var2.e0(823813244);
            if (str.length() == 0) {
                str3 = yqe.A((y3b) k2b.b.getValue(), rv4Var2);
            } else {
                str3 = str;
            }
            rv4Var2.q(false);
            cvb.c(str3, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.g, rv4Var2, 0, 0, 131070);
            rv4Var2 = rv4Var2;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
            str2 = str;
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var2), false, null, new l95(kh5.J), null, null, null, vt4Var, rv4Var2, (i2 << 18) & 234881024, 236);
            hl5.w(kq7Var, 12.0f, rv4Var2, true);
        } else {
            str2 = str;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new tn7(str2, nq7Var, vt4Var, i);
        }
    }

    public static final void n(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        nq7 nq7Var2;
        rv4 rv4Var2;
        rv4Var.g0(-1354208837);
        if (rv4Var.f(nq7Var)) {
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
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            hc2.b(nq7Var2, null, nae.d, rv4Var2, (i3 & 14) | 3072, 6);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new oa(nq7Var2, i, 27);
        }
    }

    public static final xtc o(String str) {
        str.getClass();
        xtc xtcVar = new xtc();
        ytc.b(xtcVar, str);
        return xtcVar;
    }

    public static final rk9 p(sc6 sc6Var) {
        sc6 Z = sc6Var.Z();
        if (Z != null) {
            return Z.g0(sc6Var, true);
        }
        return new rk9(nae.e, nae.e, (int) (sc6Var.a() >> 32), (int) (sc6Var.a() & 4294967295L));
    }

    public static final rk9 q(sc6 sc6Var, boolean z) {
        sc6 t = t(sc6Var);
        float a2 = (int) (t.a() >> 32);
        float a3 = (int) (t.a() & 4294967295L);
        rk9 g0 = t.g0(sc6Var, z);
        float f = g0.a;
        float f2 = nae.e;
        if (z) {
            if (f < nae.e) {
                f = 0.0f;
            }
            if (f > a2) {
                f = a2;
            }
        }
        float f3 = g0.b;
        if (z) {
            if (f3 < nae.e) {
                f3 = 0.0f;
            }
            if (f3 > a3) {
                f3 = a3;
            }
        }
        float f4 = g0.c;
        if (z) {
            if (f4 < nae.e) {
                f4 = 0.0f;
            }
            if (f4 <= a2) {
                a2 = f4;
            }
            f4 = a2;
        }
        float f5 = g0.d;
        if (z) {
            if (f5 >= nae.e) {
                f2 = f5;
            }
            if (f2 <= a3) {
                a3 = f2;
            }
            f5 = a3;
        }
        if (f == f4 || f3 == f5) {
            return rk9.e;
        }
        long m = t.m((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long m2 = t.m((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f3) & 4294967295L));
        long m3 = t.m((Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
        long m4 = t.m((Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
        float intBitsToFloat = Float.intBitsToFloat((int) (m >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (m2 >> 32));
        float intBitsToFloat3 = Float.intBitsToFloat((int) (m4 >> 32));
        float intBitsToFloat4 = Float.intBitsToFloat((int) (m3 >> 32));
        float min = Math.min(intBitsToFloat, Math.min(intBitsToFloat2, Math.min(intBitsToFloat3, intBitsToFloat4)));
        float max = Math.max(intBitsToFloat, Math.max(intBitsToFloat2, Math.max(intBitsToFloat3, intBitsToFloat4)));
        float intBitsToFloat5 = Float.intBitsToFloat((int) (m & 4294967295L));
        float intBitsToFloat6 = Float.intBitsToFloat((int) (m2 & 4294967295L));
        float intBitsToFloat7 = Float.intBitsToFloat((int) (m4 & 4294967295L));
        float intBitsToFloat8 = Float.intBitsToFloat((int) (m3 & 4294967295L));
        return new rk9(min, Math.min(intBitsToFloat5, Math.min(intBitsToFloat6, Math.min(intBitsToFloat7, intBitsToFloat8))), max, Math.max(intBitsToFloat5, Math.max(intBitsToFloat6, Math.max(intBitsToFloat7, intBitsToFloat8))));
    }

    public static final float r(pq2 pq2Var, float f, float f2) {
        float f3;
        float f4;
        ui4 ui4Var = pq2Var.a;
        fs fsVar = new fs(nae.e);
        int b2 = fsVar.b();
        for (int i = 0; i < b2; i++) {
            if (i == 0) {
                f3 = f;
            } else {
                f3 = 0.0f;
            }
            if (i == 0) {
                f4 = f2;
            } else {
                f4 = 0.0f;
            }
            fsVar.e(i, ui4Var.t(f3, f4));
        }
        return fsVar.a;
    }

    public static final void s(lmd lmdVar, String str) {
        nnd b2;
        WorkDatabase workDatabase = lmdVar.c;
        workDatabase.getClass();
        bnd w = workDatabase.w();
        c23 r = workDatabase.r();
        ArrayList C = tl1.C(str);
        while (!C.isEmpty()) {
            String str2 = (String) xl1.R(C);
            jmd d = w.d(str2);
            if (d != jmd.c && d != jmd.d) {
                ((Number) gae.l(w.a, false, true, new a23(str2, 24))).intValue();
            }
            C.addAll(r.a(str2));
        }
        v69 v69Var = lmdVar.f;
        v69Var.getClass();
        synchronized (v69Var.k) {
            r95 n = r95.n();
            String str3 = v69.l;
            n.c(str3, "Processor cancelling " + str);
            v69Var.i.add(str);
            b2 = v69Var.b(str);
        }
        v69.d(str, b2, 1);
        for (d0a d0aVar : lmdVar.e) {
            d0aVar.d(str);
        }
    }

    public static final sc6 t(sc6 sc6Var) {
        sc6 sc6Var2;
        i38 i38Var;
        sc6 Z = sc6Var.Z();
        while (true) {
            sc6 sc6Var3 = Z;
            sc6Var2 = sc6Var;
            sc6Var = sc6Var3;
            if (sc6Var == null) {
                break;
            }
            Z = sc6Var.Z();
        }
        if (sc6Var2 instanceof i38) {
            i38Var = (i38) sc6Var2;
        } else {
            i38Var = null;
        }
        if (i38Var == null) {
            return sc6Var2;
        }
        i38 i38Var2 = i38Var.S;
        while (true) {
            i38 i38Var3 = i38Var2;
            i38 i38Var4 = i38Var;
            i38Var = i38Var3;
            if (i38Var != null) {
                i38Var2 = i38Var.S;
            } else {
                return i38Var4;
            }
        }
    }

    public static final cp2 u(bb8 bb8Var, String str) {
        int i;
        bb8Var.getClass();
        String B = ube.B();
        String str2 = bb8Var.a;
        String str3 = bb8Var.b;
        if (bb8Var.c == 2) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = i;
        long j = bb8Var.d;
        return new cp2(B, str, str2, str3, 1, i2, j, j);
    }

    public static final cp2 v(eb8 eb8Var, String str) {
        int i;
        eb8Var.getClass();
        String B = ube.B();
        String str2 = eb8Var.a;
        String str3 = eb8Var.b;
        Pattern compile = Pattern.compile("[|/]");
        compile.getClass();
        str3.getClass();
        String replaceAll = compile.matcher(str3).replaceAll("¦");
        replaceAll.getClass();
        if (eb8Var.c == 2) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = i;
        long j = eb8Var.e;
        return new cp2(B, str, str2, replaceAll, 0, i2, j, j);
    }

    public static final cp2 w(pdb pdbVar, String str) {
        pdbVar.getClass();
        str.getClass();
        return new cp2(pdbVar.a, str, pdbVar.b, pdbVar.c, pdbVar.d, pdbVar.e, pdbVar.f, pdbVar.g);
    }

    public static final nq7 y(nq7 nq7Var, xt4 xt4Var) {
        return nq7Var.a0(new wb8(xt4Var));
    }

    public abstract View x(int i);

    public abstract boolean z();
}
