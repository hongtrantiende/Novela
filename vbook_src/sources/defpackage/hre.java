package defpackage;

import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hre  reason: default package */
/* loaded from: classes.dex */
public abstract class hre {
    public static final tu1 a = new tu1(new cv1(2), false, 1937612688);
    public static final tu1 b = new tu1(new cv1(3), false, 1888813113);
    public static final Class[] c = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};

    public static final void a(final nq7 nq7Var, final dt8 dt8Var, final float f, boolean z, ti8 ti8Var, final boolean z2, final xt4 xt4Var, final tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        ti8 ti8Var2;
        ti8 ti8Var3;
        int i3;
        final boolean z5;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(-1922240814);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(dt8Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var.c(f)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        int i11 = i2 | 3072;
        if ((i & 24576) == 0) {
            i11 = i2 | 11264;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.g(z2)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i11 |= i7;
        }
        boolean z6 = true;
        if ((1572864 & i) == 0) {
            if (rv4Var.g(true)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i11 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i11 |= i5;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i11 |= i4;
        }
        if ((38347923 & i11) != 38347922) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i11 & 1, z3)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                ti8Var3 = ti8Var;
                i3 = i11 & (-57345);
                z5 = z;
            } else {
                ti8Var3 = ti8.c;
                i3 = i11 & (-57345);
                z5 = true;
            }
            rv4Var.r();
            if ((i3 & Token.ASSIGN_MOD) != 32) {
                z6 = false;
            }
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new gd3(dt8Var, 0);
                rv4Var.o0(P);
            }
            yte.b(dt8Var, (xt4) P, rv4Var);
            final aw7 n = yae.n(dt8Var.a.d, rv4Var);
            ly1 ly1Var = ki8.b;
            Boolean bool = (Boolean) dt8Var.h.getValue();
            bool.getClass();
            final ti8 ti8Var4 = ti8Var3;
            pye.a(ly1Var.a(bool), jce.E(-918240750, new lu4() { // from class: hd3
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z7;
                    rv4 rv4Var2 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z7)) {
                        boolean a2 = ((zc6) n.getValue()).k.a();
                        nq7 nq7Var2 = nq7.this;
                        dt8 dt8Var2 = dt8Var;
                        xt4 xt4Var2 = xt4Var;
                        tu1 tu1Var2 = tu1Var;
                        if (a2) {
                            rv4Var2.e0(-663409056);
                            ti8 ti8Var5 = ti8Var4;
                            fre.j(nq7Var2, dt8Var2, z5, ti8Var5.a, ti8Var5.b, z2, xt4Var2, tu1Var2, rv4Var2, 0);
                            rv4Var2.q(false);
                        } else {
                            rv4Var2.e0(-662732543);
                            hu7.c(nq7Var2, dt8Var2, f, xt4Var2, tu1Var2, rv4Var2, 0);
                            rv4Var2.q(false);
                        }
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 56);
            ti8Var2 = ti8Var4;
            z4 = z5;
        } else {
            rv4Var.X();
            z4 = z;
            ti8Var2 = ti8Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new go7(nq7Var, dt8Var, f, z4, ti8Var2, z2, xt4Var, tu1Var, i);
        }
    }

    public static final void b(long j, nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        nq7 nq7Var2;
        kq7 kq7Var;
        int i5;
        int i6;
        rv4Var.g0(-284686771);
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 = i | 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(tu1Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i3 |= i6;
        }
        if ((i3 & Token.TARGET) != 144) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i5 = i3 & (-15);
                kq7Var = nq7Var;
            } else {
                j = ((h27) rv4Var.j(j27.a)).a.p;
                int i8 = i3 & (-15);
                if (i7 != 0) {
                    kq7Var = kq7.a;
                } else {
                    kq7Var = nq7Var;
                }
                i5 = i8;
            }
            rv4Var.r();
            int i9 = i5 >> 3;
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, kq7Var);
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
            tu1Var.c(pu0.a, rv4Var, Integer.valueOf((i9 & Token.ASSIGN_MOD) | 6));
            rv4Var.q(true);
            nq7Var2 = kq7Var;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        long j2 = j;
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rh(j2, nq7Var2, tu1Var, i, i2);
        }
    }

    public static final void c(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        boolean z;
        int i3;
        int i4;
        rv4Var.g0(-1194141881);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            fxe.h(null, nq7Var, true, jce.E(-807866293, new zr(8, vt4Var), rv4Var), null, null, ctd.c, rv4Var, ((i2 << 3) & Token.ASSIGN_MOD) | 1576320, 49);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ai8(nq7Var, vt4Var, i, 1);
        }
    }

    public static final void d(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        pb2 pb2Var;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(-331728223);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        boolean z2 = false;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            vfb vfbVar = (vfb) rv4Var.j(nm3.b);
            long j = ((h27) rv4Var.j(j27.a)).a.n;
            boolean f = rv4Var.f(vfbVar);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (f || P == lh9Var) {
                P = new rg0(vfbVar, null, 19);
                rv4Var.o0(P);
            }
            int i6 = i5 & 14;
            yte.g((lu4) P, rv4Var, str);
            boolean f2 = rv4Var.f(vfbVar) | rv4Var.e(j);
            Object P2 = rv4Var.P();
            if (f2 || P2 == lh9Var) {
                P2 = new lh6(vfbVar, j, 5);
                rv4Var.o0(P2);
            }
            yte.b(str, (xt4) P2, rv4Var);
            if (i6 == 4) {
                z2 = true;
            }
            Object P3 = rv4Var.P();
            if (z2 || P3 == lh9Var) {
                P3 = new v85(str, 14);
                rv4Var.o0(P3);
            }
            vt4 vt4Var = (vt4) P3;
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                q0a a3 = o96.a(rv4Var);
                gi1 a4 = cm9.a(gj9.class);
                v9b.a(pna.c, null, 0L, 0L, nae.e, nae.e, null, jce.E(680755174, new ax(4, cz7Var, str, jsc.z(((gj9) ((fdd) voe.z(a4, a2.i(), eub.o(a4.f(), "-", str), pb2Var2, a3, vt4Var))).C, rv4Var)), rv4Var), rv4Var, 12582918, Token.ELSE);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str, cz7Var, i, 10);
        }
    }

    public static final void e(int i, int i2, int i3, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, String str) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        rv4Var.g0(-2128367096);
        if (rv4Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i3;
        if (rv4Var.d(i)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (rv4Var.d(i2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i10 = i9 | i6;
        if (rv4Var.f(cz7Var)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i11 = i10 | i7;
        boolean z2 = true;
        if ((i11 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i11 & 1, z)) {
            if (i != 1) {
                if (i != 2) {
                    lh9 lh9Var = ax1.a;
                    if (i != 3) {
                        if (i != 4) {
                            rv4Var.e0(423116426);
                            if ((i11 & 7168) != 2048) {
                                z2 = false;
                            }
                            Object P = rv4Var.P();
                            if (z2 || P == lh9Var) {
                                P = new px6(cz7Var, 27);
                                rv4Var.o0(P);
                            }
                            c(6, (vt4) P, rv4Var, nq7Var);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(422502781);
                            if (i2 != 41) {
                                if (i2 != 42) {
                                    rv4Var.e0(422893474);
                                    if ((i11 & 7168) != 2048) {
                                        z2 = false;
                                    }
                                    Object P2 = rv4Var.P();
                                    if (z2 || P2 == lh9Var) {
                                        P2 = new px6(cz7Var, 26);
                                        rv4Var.o0(P2);
                                    }
                                    c(6, (vt4) P2, rv4Var, nq7Var);
                                    rv4Var.q(false);
                                } else {
                                    rv4Var.e0(422660168);
                                    n4f.f(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                                    rv4Var.q(false);
                                }
                            } else {
                                rv4Var.e0(422545561);
                                zpe.b(str, null, rv4Var, i11 & 14);
                                rv4Var.q(false);
                            }
                            rv4Var.q(false);
                        }
                    } else {
                        rv4Var.e0(421987282);
                        if (i2 != 30) {
                            if (i2 != 31) {
                                rv4Var.e0(422234786);
                                if ((i11 & 7168) != 2048) {
                                    z2 = false;
                                }
                                Object P3 = rv4Var.P();
                                if (z2 || P3 == lh9Var) {
                                    P3 = new px6(cz7Var, 25);
                                    rv4Var.o0(P3);
                                }
                                c(6, (vt4) P3, rv4Var, nq7Var);
                                rv4Var.q(false);
                            } else {
                                rv4Var.e0(422141786);
                                fpe.a(str, null, rv4Var, i11 & 14);
                                rv4Var.q(false);
                            }
                        } else {
                            rv4Var.e0(422033658);
                            hma.l(str, null, rv4Var, i11 & 14);
                            rv4Var.q(false);
                        }
                        rv4Var.q(false);
                    }
                } else {
                    rv4Var.e0(420677811);
                    if (i2 != 17) {
                        switch (i2) {
                            case 20:
                                rv4Var.e0(420703045);
                                zbe.d(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                                rv4Var.q(false);
                                break;
                            case 21:
                                rv4Var.e0(420956935);
                                nae.c(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                                rv4Var.q(false);
                                break;
                            case 22:
                                rv4Var.e0(421208903);
                                ct8.e(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                                rv4Var.q(false);
                                break;
                            default:
                                rv4Var.e0(421696037);
                                zbe.d(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                                rv4Var.q(false);
                                break;
                        }
                    } else {
                        rv4Var.e0(421460871);
                        nq2.s(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                        rv4Var.q(false);
                    }
                    rv4Var.q(false);
                }
            } else {
                rv4Var.e0(418311426);
                if (i2 != 19 && i2 != 23) {
                    switch (i2) {
                        case 10:
                            rv4Var.e0(418303397);
                            hbe.W(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                            rv4Var.q(false);
                            break;
                        case 11:
                            rv4Var.e0(418558310);
                            gue.d(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                            rv4Var.q(false);
                            break;
                        case 12:
                            rv4Var.e0(418812262);
                            nq2.h(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                            rv4Var.q(false);
                            break;
                        case 13:
                            rv4Var.e0(419065191);
                            n4f.j(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                            rv4Var.q(false);
                            break;
                        case 14:
                            rv4Var.e0(419570150);
                            zxe.d(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                            rv4Var.q(false);
                            break;
                        case 15:
                            break;
                        case 16:
                            rv4Var.e0(419317159);
                            uue.d(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                            rv4Var.q(false);
                            break;
                        case 17:
                            rv4Var.e0(420121795);
                            yf2.o(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                            rv4Var.q(false);
                            break;
                        default:
                            rv4Var.e0(420360805);
                            hbe.W(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                            rv4Var.q(false);
                            break;
                    }
                    rv4Var.q(false);
                }
                rv4Var.e0(419869703);
                qre.e(((i11 >> 6) & Token.ASSIGN_MOD) | (i11 & 14) | 384, rv4Var, nq7Var, cz7Var, str);
                rv4Var.q(false);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ni9(str, i, i2, cz7Var, nq7Var, i3);
        }
    }

    public static final float[] f(qd6 qd6Var, jfa jfaVar) {
        float c2 = dna.c(qd6Var.a.b()) / 2.0f;
        float[] fArr = new float[4];
        for (int i = 0; i < 4; i++) {
            fArr[i] = c2;
        }
        return fArr;
    }

    public static void g(StringBuilder sb, Object obj, xt4 xt4Var) {
        boolean z;
        if (xt4Var != null) {
            sb.append((CharSequence) xt4Var.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final boolean h(Object obj) {
        if (obj instanceof ira) {
            ira iraVar = (ira) obj;
            if (iraVar.d() == r0f.J || iraVar.d() == zj1.G || iraVar.d() == r0f.L) {
                Object value = iraVar.getValue();
                if (value != null) {
                    return h(value);
                }
                return true;
            }
        } else if (!(obj instanceof hu4) || !(obj instanceof Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (c[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final gs9 i(Throwable th) {
        th.getClass();
        return new gs9(th);
    }

    public static final void j(it7 it7Var, k61 k61Var, hy0 hy0Var, float f, nea neaVar, gpb gpbVar, bk3 bk3Var) {
        ArrayList arrayList = it7Var.h;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ll8 ll8Var = (ll8) arrayList.get(i);
            ll8Var.a.g(k61Var, hy0Var, f, neaVar, gpbVar, bk3Var);
            k61Var.p(nae.e, ll8Var.a.b());
        }
    }

    public static final int k(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static int l(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static final int m(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int i2 = Integer.MIN_VALUE;
        for (int i3 = (int) (j >> 32); i3 < i; i3++) {
            i2 = Math.max(i2, iArr[i3]);
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:202:0x03ab, code lost:
        r14 = l(r11);
        r15 = k(r42);
        r68 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x03b5, code lost:
        if (r14 == r15) goto L617;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x03b7, code lost:
        r43 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x03bd, code lost:
        if (r11[r14] != r11[r15]) goto L616;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03bf, code lost:
        r14 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:207:0x03c1, code lost:
        r43 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x03c4, code lost:
        r43 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x03c6, code lost:
        r3 = r42[r14];
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x03c9, code lost:
        if (r3 != (-1)) goto L567;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x03cb, code lost:
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:212:0x03cc, code lost:
        r3 = r9.j(r3, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:213:0x03d0, code lost:
        if (r3 >= 0) goto L569;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x03d2, code lost:
        r4 = r42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:215:0x03d4, code lost:
        if (r43 != false) goto L605;
     */
    /* JADX WARN: Code restructure failed: missing block: B:217:0x03da, code lost:
        if (o(r4, r65, r11, r14) == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:219:0x03dd, code lost:
        r15 = r66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:220:0x03e0, code lost:
        if (r69 == false) goto L596;
     */
    /* JADX WARN: Code restructure failed: missing block: B:221:0x03e2, code lost:
        r9.x();
        r0 = r4.length;
        r2 = new int[r0];
        r3 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:222:0x03e9, code lost:
        if (r3 >= r0) goto L609;
     */
    /* JADX WARN: Code restructure failed: missing block: B:223:0x03eb, code lost:
        r2[r3] = -1;
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03f2, code lost:
        r0 = r11.length;
        r3 = new int[r0];
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:225:0x03f6, code lost:
        if (r4 >= r0) goto L613;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x03f8, code lost:
        r3[r4] = r11[r14];
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x0406, code lost:
        return n(r65, r66, r2, r3, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:229:0x0407, code lost:
        r45 = r5;
        r5 = r46;
        r46 = r13;
        r42 = r6;
        r44 = r7;
        r48 = r8;
        r66 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:230:0x0417, code lost:
        r15 = r66;
        r44 = r7;
        r48 = r8;
        r4 = r42;
        r42 = r6;
        r7 = r65.a(r47, r3, r14);
        r45 = r5;
        r5 = (int) (r7 & 4294967295L);
        r66 = r12;
        r12 = (int) (r7 >> 32);
        r13 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:231:0x0435, code lost:
        if (r13 == 1) goto L590;
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0437, code lost:
        r14 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0439, code lost:
        r14 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x043a, code lost:
        r9.z(r3, r14);
        r14 = r46;
        r6 = r14.Y(r3, r7);
        r7 = m(r11, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x044a, code lost:
        if (r13 == 1) goto L589;
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x044c, code lost:
        r8 = r9.n(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x0451, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x0453, code lost:
        if (r12 >= r5) goto L587;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0457, code lost:
        if (r11[r12] == r7) goto L580;
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0459, code lost:
        r43 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x045b, code lost:
        r39[r12].addFirst(r6);
        r4[r12] = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x0462, code lost:
        if (r8 != null) goto L585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0464, code lost:
        r13 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0466, code lost:
        r13 = r8[r12];
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0468, code lost:
        r11[r12] = (r6.n() + r7) + r13;
        r12 = r12 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x062c, code lost:
        if ((r4 != null ? r4.a : -1) > r10) goto L317;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x010e, code lost:
        r0 = k(r2);
        r5 = r2[r0];
        r6 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0116, code lost:
        if (r7 >= r6) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0118, code lost:
        r37 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011e, code lost:
        if (r2[r7] == r2[r0]) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0120, code lost:
        r6 = r3[r7];
        r10 = r3[r0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
        if (r6 >= r10) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0126, code lost:
        r3[r7] = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0128, code lost:
        r7 = r7 + 1;
        r6 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012d, code lost:
        r5 = r9.j(r5, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
        if (r5 >= 0) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
        r6 = r65.a(r15, r5, r0);
        r0 = r11;
        r10 = (int) (r6 & 4294967295L);
        r37 = r12;
        r11 = (int) (r6 >> 32);
        r12 = r10 - r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014b, code lost:
        if (r12 == 1) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x014d, code lost:
        r0 = -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014f, code lost:
        r0 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0150, code lost:
        r9.z(r5, r0);
        r0 = r13.Y(r5, r6);
        r6 = m(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015c, code lost:
        if (r12 == 1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x015e, code lost:
        r33 = r9.n(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0162, code lost:
        r7 = r67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0164, code lost:
        if (r11 >= r10) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0166, code lost:
        r2[r11] = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0168, code lost:
        if (r33 != null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x016a, code lost:
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x016c, code lost:
        r12 = r33[r11];
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016e, code lost:
        r40 = (r0.n() + r6) + r12;
        r3[r11] = r40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x017a, code lost:
        if ((r37 + r40) > 0) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x017c, code lost:
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x017d, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0548 A[LOOP:23: B:278:0x0546->B:279:0x0548, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x05b8  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x05c1  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x05cf  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x05e7  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x060e  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:341:0x0687  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x068d A[LOOP:28: B:343:0x068b->B:344:0x068d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x069d  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x07ae  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:410:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x07fc  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0801  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x0813  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x0822 A[LOOP:34: B:398:0x07ac->B:426:0x0822, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:430:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x0894  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x08b5  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x08c6  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x08ea  */
    /* JADX WARN: Removed duplicated region for block: B:497:0x0992  */
    /* JADX WARN: Removed duplicated region for block: B:511:0x0a08  */
    /* JADX WARN: Removed duplicated region for block: B:634:0x0831 A[EDGE_INSN: B:634:0x0831->B:428:0x0831 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:646:0x099e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:651:0x07f2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.gk6 n(defpackage.ck6 r65, int r66, int[] r67, int[] r68, boolean r69) {
        /*
            Method dump skipped, instructions count: 2965
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hre.n(ck6, int, int[], int[], boolean):gk6");
    }

    public static final boolean o(int[] iArr, ck6 ck6Var, int[] iArr2, int i) {
        kj kjVar = ck6Var.r;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (kjVar.j(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (kjVar.j(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int q = kjVar.q(0);
        if (q == 0 || q == -1 || q == -2) {
            return false;
        }
        return true;
    }

    public static final void p(int i, int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    public static q2d q() {
        byte[] bArr = new byte[16];
        j4a.a.nextBytes(bArr);
        byte b2 = (byte) (bArr[6] & 15);
        bArr[6] = b2;
        bArr[6] = (byte) (b2 | 64);
        byte b3 = (byte) (bArr[8] & 63);
        bArr[8] = b3;
        bArr[8] = (byte) (b3 | 128);
        long j = lre.j(bArr, 0);
        long j2 = lre.j(bArr, 8);
        if (j == 0 && j2 == 0) {
            return q2d.c;
        }
        return new q2d(j, j2);
    }

    public static final void r(Object obj) {
        if (!(obj instanceof gs9)) {
            return;
        }
        throw ((gs9) obj).a;
    }

    public static final void s(ff1 ff1Var) {
        db7 db7Var;
        ff1Var.getClass();
        if (ff1Var.d == db7.a) {
            db7Var = db7.d;
        } else {
            db7Var = db7.c;
        }
        ff1Var.d = db7Var;
    }

    public abstract int t();

    public abstract sjf u(int i);

    public abstract Object v(int i);

    public abstract Object w(sjf sjfVar);
}
