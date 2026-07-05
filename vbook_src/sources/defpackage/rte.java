package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rte  reason: default package */
/* loaded from: classes.dex */
public abstract class rte {
    public static final tu1 a = new tu1(new dv1(2), false, 1891707195);

    public static final void A(up3 up3Var) {
        vt3 vt3Var = vt3.M;
        ArrayList arrayList = up3Var.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i >= 0) {
                lp3 lp3Var = (lp3) vt3Var.invoke((lp3) obj);
                up3Var.b.set(i, lp3Var);
                if (lp3Var instanceof up3) {
                    A((up3) lp3Var);
                }
                i = i3;
            } else {
                tl1.M();
                throw null;
            }
        }
    }

    public static final LinkedHashMap B(up3 up3Var) {
        yk8 yk8Var;
        k5 k5Var;
        yk8 yk8Var2;
        ArrayList arrayList = up3Var.b;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i >= 0) {
                lp3 lp3Var = (lp3) obj;
                xy4 a2 = lp3Var.a();
                if (a2.b(vt3.K)) {
                    yk8Var = (yk8) a2.a(new yk8(null, vy4.a), co5.K);
                } else {
                    yk8Var = new yk8(null, a2);
                }
                o5 o5Var = (o5) yk8Var.a;
                xy4 xy4Var = (xy4) yk8Var.b;
                if (o5Var != null) {
                    k5Var = o5Var.a;
                } else {
                    k5Var = null;
                }
                if (k5Var instanceof hb6) {
                    yk8Var2 = new yk8(k5Var, xy4Var);
                } else {
                    yk8Var2 = new yk8(null, xy4Var);
                }
                hb6 hb6Var = (hb6) yk8Var2.a;
                xy4 xy4Var2 = (xy4) yk8Var2.b;
                if (lp3Var instanceof up3) {
                    for (Map.Entry entry : B((up3) lp3Var).entrySet()) {
                        String str = (String) entry.getKey();
                        List list = (List) entry.getValue();
                        Object obj2 = linkedHashMap.get(str);
                        if (obj2 == null) {
                            obj2 = new ArrayList();
                            linkedHashMap.put(str, obj2);
                        }
                        ((List) obj2).addAll(list);
                    }
                }
                i = i3;
            } else {
                tl1.M();
                throw null;
            }
        }
        return linkedHashMap;
    }

    public static nq7 C(nq7 nq7Var, k2a k2aVar, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return w(nq7Var, k2aVar, z, true);
    }

    public static final void a(tkc tkcVar, xt4 xt4Var, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, lu4 lu4Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        c3e c3eVar;
        boolean z3;
        boolean z4;
        st3 y;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        rv4Var.g0(-1310802509);
        if ((i & 6) == 0) {
            if (rv4Var.f(tkcVar)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i2 = i10 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i2 |= i9;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i8 = 256;
            } else {
                i8 = Token.CASE;
            }
            i2 |= i8;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(eu3Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i2 |= i7;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(lz3Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(lu4Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        int i11 = i2 | 1572864;
        if ((12582912 & i) == 0) {
            if (rv4Var.h(null)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i11 |= i4;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 67108864;
            } else {
                i3 = 33554432;
            }
            i11 |= i3;
        }
        int i12 = i11;
        if ((i12 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i12 & 1, z)) {
            hm8 hm8Var = tkcVar.e;
            hm8 hm8Var2 = tkcVar.d;
            c3e c3eVar2 = tkcVar.a;
            Object value = hm8Var.getValue();
            if (!((Boolean) xt4Var.invoke(hm8Var2.getValue())).booleanValue() && !((Boolean) xt4Var.invoke(c3eVar2.z())).booleanValue() && ((value == null || !((Boolean) xt4Var.invoke(value)).booleanValue()) && !tkcVar.g() && !tkcVar.d())) {
                rv4Var.e0(-270847985);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-274042349);
                int i13 = i12 & 14;
                int i14 = i13 | 48;
                int i15 = i14 & 14;
                if (((i15 ^ 6) > 4 && rv4Var.f(tkcVar)) || (i14 & 6) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (z2 || P == obj) {
                    P = c3eVar2.z();
                    rv4Var.o0(P);
                }
                if (tkcVar.g()) {
                    P = c3eVar2.z();
                }
                rv4Var.e0(-1270450094);
                st3 y2 = y(tkcVar, xt4Var, P, rv4Var);
                rv4Var.q(false);
                Object value2 = hm8Var2.getValue();
                rv4Var.e0(-1270450094);
                st3 y3 = y(tkcVar, xt4Var, value2, rv4Var);
                rv4Var.q(false);
                tkc g = bze.g(tkcVar, y2, y3, "EnterExitTransition", rv4Var, i15 | 3072);
                if (!tkcVar.g()) {
                    rv4Var.e0(782386797);
                    Object value3 = tkcVar.e.getValue();
                    if (value3 == null) {
                        rv4Var.e0(782437481);
                        rv4Var.q(false);
                        y = null;
                    } else {
                        rv4Var.e0(782437482);
                        rv4Var.e0(-1270450094);
                        y = y(tkcVar, xt4Var, value3, rv4Var);
                        rv4Var.q(false);
                        rv4Var.q(false);
                    }
                    g.e.setValue(y);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(782538635);
                    rv4Var.q(false);
                }
                eu3 y4 = zt3.y(g, eu3Var, rv4Var, (i12 >> 6) & Token.ASSIGN_MOD);
                hm8 hm8Var3 = g.d;
                c3e c3eVar3 = g.a;
                lz3 z5 = zt3.z(g, lz3Var, rv4Var, (i12 >> 9) & Token.ASSIGN_MOD);
                Object D = yae.D(lu4Var, rv4Var);
                Object invoke = lu4Var.invoke(c3eVar3.z(), hm8Var3.getValue());
                boolean f = rv4Var.f(g) | rv4Var.f(D);
                Object P2 = rv4Var.P();
                if (!f && P2 != obj) {
                    c3eVar = c3eVar3;
                } else {
                    c3eVar = c3eVar3;
                    P2 = new n0(g, D, null, 7);
                    rv4Var.o0(P2);
                }
                aw7 C = yae.C((lu4) P2, rv4Var, invoke);
                Object z6 = c3eVar.z();
                st3 st3Var = st3.c;
                if (z6 != st3Var || hm8Var3.getValue() != st3Var || !((Boolean) C.getValue()).booleanValue()) {
                    z3 = false;
                    rv4Var.e0(-272355980);
                    if (i13 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    Object P3 = rv4Var.P();
                    if (z4 || P3 == obj) {
                        P3 = new rr(g);
                        rv4Var.o0(P3);
                    }
                    rr rrVar = (rr) P3;
                    rrVar.c.getClass();
                    nq7 b = zt3.b(g, y4, z5, null, rrVar.c, "Built-in", rv4Var, 1575936, 8);
                    rv4Var.e0(-1255668613);
                    rv4Var.q(false);
                    nq7 a0 = nq7Var.a0(b.a0(kq7.a));
                    Object P4 = rv4Var.P();
                    if (P4 == obj) {
                        P4 = new fr(rrVar);
                        rv4Var.o0(P4);
                    }
                    fr frVar = (fr) P4;
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, a0);
                    rw1.k.getClass();
                    vt4 vt4Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(vt4Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, frVar);
                    jce.F(qw1.e, rv4Var, l);
                    jce.x(rv4Var, Integer.valueOf(hashCode), qw1.g);
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    tu1Var.c(rrVar, rv4Var, Integer.valueOf((i12 >> 21) & Token.ASSIGN_MOD));
                    rv4Var.q(true);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-270853937);
                    z3 = false;
                    rv4Var.q(false);
                }
                rv4Var.q(z3);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new tq(tkcVar, xt4Var, nq7Var, eu3Var, lz3Var, lu4Var, tu1Var, i);
        }
    }

    public static final void b(fw7 fw7Var, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, String str, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        String str2;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(657024243);
        if (rv4Var.f(fw7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i2 | i;
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i6 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(eu3Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i6 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(lz3Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i6 |= i3;
        }
        int i7 = i6 | 24576;
        if ((74899 & i7) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i7 & 1, z)) {
            tkc s = bze.s(fw7Var, "AnimatedVisibility", rv4Var, (i7 & 14) | 48, 0);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = kg.Q;
                rv4Var.o0(P);
            }
            int i8 = i7 << 3;
            f(s, (xt4) P, nq7Var, eu3Var, lz3Var, tu1Var, rv4Var, (i8 & 57344) | (i8 & 896) | 48 | (i8 & 7168) | 1572864);
            str2 = "AnimatedVisibility";
        } else {
            rv4Var.X();
            str2 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pq(fw7Var, nq7Var, eu3Var, lz3Var, str2, tu1Var, i);
        }
    }

    public static final void c(boolean z, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, String str, tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        boolean z2;
        nq7 nq7Var2;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(-1448730565);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(eu3Var)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i3 |= i7;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(lz3Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i10 = i3 | 24576;
        if ((196608 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i10 |= i5;
        }
        if ((74899 & i10) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i10 & 1, z2)) {
            if (i9 != 0) {
                nq7Var = kq7.a;
            }
            nq7Var2 = nq7Var;
            tkc t = bze.t(Boolean.valueOf(z), "AnimatedVisibility", rv4Var, (i10 & 14) | ((i10 >> 9) & Token.ASSIGN_MOD), 0);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = kg.N;
                rv4Var.o0(P);
            }
            int i11 = i10 << 3;
            f(t, (xt4) P, nq7Var2, eu3Var, lz3Var, tu1Var, rv4Var, (i11 & 896) | 48 | (i11 & 7168) | (57344 & i11) | (i11 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            str2 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new or(z, nq7Var2, eu3Var, lz3Var, str2, tu1Var, i, i2, 0);
        }
    }

    public static final void d(boolean z, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, String str, tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z2;
        nq7 nq7Var2;
        eu3 eu3Var2;
        lz3 lz3Var2;
        String str2;
        int i6;
        int i7;
        rv4Var.g0(234057107);
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i8 = i3 | 384;
        int i9 = i2 & 4;
        if (i9 != 0) {
            i8 = i3 | 3456;
        } else if ((i & 3072) == 0) {
            if (rv4Var.f(eu3Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i8 |= i4;
        }
        int i10 = i2 & 8;
        if (i10 != 0) {
            i8 |= 24576;
        } else if ((i & 24576) == 0) {
            if (rv4Var.f(lz3Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i8 |= i5;
        }
        int i11 = i8 | 196608;
        if ((1572864 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i11 |= i6;
        }
        if ((599185 & i11) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            if (i9 != 0) {
                eu3Var = zt3.g(null, 3).a(zt3.c());
            }
            if (i10 != 0) {
                lz3Var2 = zt3.i(null, 3).a(zt3.n());
            } else {
                lz3Var2 = lz3Var;
            }
            tkc t = bze.t(Boolean.valueOf(z), "AnimatedVisibility", rv4Var, ((i11 >> 3) & 14) | ((i11 >> 12) & Token.ASSIGN_MOD), 0);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = kg.O;
                rv4Var.o0(P);
            }
            nq7Var2 = kq7.a;
            eu3Var2 = eu3Var;
            f(t, (xt4) P, nq7Var2, eu3Var2, lz3Var2, tu1Var, rv4Var, (i11 & 896) | 48 | (i11 & 7168) | (57344 & i11) | (i11 & 3670016));
            str2 = "AnimatedVisibility";
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            eu3Var2 = eu3Var;
            lz3Var2 = lz3Var;
            str2 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new or(z, nq7Var2, eu3Var2, lz3Var2, str2, tu1Var, i, i2, 1);
        }
    }

    public static final void e(boolean z, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, String str, tu1 tu1Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        Object obj;
        boolean z2;
        nq7 nq7Var2;
        eu3 eu3Var2;
        lz3 lz3Var2;
        String str2;
        int i7;
        int i8;
        rv4Var.g0(1799879339);
        if ((i & 48) == 0) {
            if (rv4Var.g(z)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 = i8 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i3 |= i4;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (rv4Var.f(eu3Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i3 |= i5;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if (rv4Var.f(lz3Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        int i12 = i3 | 196608;
        if ((1572864 & i) == 0) {
            obj = tu1Var;
            if (rv4Var.h(obj)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i12 |= i7;
        } else {
            obj = tu1Var;
        }
        if ((599185 & i12) != 599184) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            if (i9 != 0) {
                nq7Var = kq7.a;
            }
            if (i10 != 0) {
                eu3Var2 = zt3.g(null, 3).a(zt3.e(15));
            } else {
                eu3Var2 = eu3Var;
            }
            if (i11 != 0) {
                lz3Var2 = zt3.i(null, 3).a(zt3.p(15));
            } else {
                lz3Var2 = lz3Var;
            }
            tkc t = bze.t(Boolean.valueOf(z), "AnimatedVisibility", rv4Var, ((i12 >> 3) & 14) | ((i12 >> 12) & Token.ASSIGN_MOD), 0);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = kg.P;
                rv4Var.o0(P);
            }
            nq7Var2 = nq7Var;
            f(t, (xt4) P, nq7Var2, eu3Var2, lz3Var2, obj, rv4Var, (i12 & 3670016) | (i12 & 896) | 48 | (i12 & 7168) | (57344 & i12));
            str2 = "AnimatedVisibility";
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            eu3Var2 = eu3Var;
            lz3Var2 = lz3Var;
            str2 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new or(z, nq7Var2, eu3Var2, lz3Var2, str2, tu1Var, i, i2, 2);
        }
    }

    public static final void f(tkc tkcVar, xt4 xt4Var, nq7 nq7Var, eu3 eu3Var, lz3 lz3Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        Object obj2;
        Object obj3;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(-497872534);
        if ((i & 6) == 0) {
            if (rv4Var.f(tkcVar)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            obj = eu3Var;
            if (rv4Var.f(obj)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        } else {
            obj = eu3Var;
        }
        if ((i & 24576) == 0) {
            obj2 = lz3Var;
            if (rv4Var.f(obj2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        } else {
            obj2 = lz3Var;
        }
        int i9 = i2 | 196608;
        if ((1572864 & i) == 0) {
            obj3 = tu1Var;
            if (rv4Var.h(obj3)) {
                i3 = 1048576;
            } else {
                i3 = 524288;
            }
            i9 |= i3;
        } else {
            obj3 = tu1Var;
        }
        boolean z3 = false;
        if ((599187 & i9) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            int i10 = i9 & Token.ASSIGN_MOD;
            if (i10 == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i11 = i9 & 14;
            if (i11 == 4) {
                z3 = true;
            }
            boolean z4 = z2 | z3;
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z4 || P == lh9Var) {
                P = new pr(xt4Var, tkcVar);
                rv4Var.o0(P);
            }
            nq7 f = sze.f(nq7Var, (mu4) P);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = np.H;
                rv4Var.o0(P2);
            }
            int i12 = i9 << 6;
            a(tkcVar, xt4Var, f, obj, obj2, (lu4) P2, obj3, rv4Var, 196608 | i11 | i10 | (i9 & 7168) | (57344 & i9) | (29360128 & i12) | (i12 & 234881024));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pq(tkcVar, xt4Var, nq7Var, eu3Var, lz3Var, tu1Var, i);
        }
    }

    public static final void g(nq7 nq7Var, na5 na5Var, boolean z, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z2;
        nq7 nq7Var2;
        boolean z3;
        int i4;
        xt4Var.getClass();
        rv4Var.g0(-144183536);
        if (rv4Var.f(na5Var)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i5 = i | i2;
        if (rv4Var.h(xt4Var)) {
            i3 = 2048;
        } else {
            i3 = 1024;
        }
        int i6 = i5 | i3;
        if ((i6 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i6 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (P == obj) {
                P = yae.z(na5Var);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            if ((((i6 & Token.ASSIGN_MOD) ^ 48) > 32 && rv4Var.h(na5Var)) || (i6 & 48) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == obj) {
                P2 = new db(na5Var, aw7Var, null, 7);
                rv4Var.o0(P2);
            }
            yte.g((lu4) P2, rv4Var, na5Var);
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var, 0);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7Var2 = nq7Var;
            nq7 p = lye.p(rv4Var, nq7Var2);
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
            aw7 D = yae.D(xt4Var, rv4Var);
            we6 we6Var = new we6(0.8f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, we6Var);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(vt4Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            we6 f = s21.f(rv4Var, p2, npVar4, 0.8f, true);
            na5 na5Var2 = (na5) aw7Var.getValue();
            boolean f2 = rv4Var.f(D);
            Object P3 = rv4Var.P();
            if (!f2 && P3 != obj) {
                i4 = 0;
            } else {
                i4 = 0;
                P3 = new oi1(aw7Var, D, 0);
                rv4Var.o0(P3);
            }
            hse.b(f, na5Var2, (lu4) P3, rv4Var, i4);
            kq7 kq7Var = kq7.a;
            if (z) {
                s21.w(rv4Var, 1892404204, kq7Var, 8.0f, rv4Var);
                nq7 h = pna.h(kq7Var, 32.0f);
                na5 na5Var3 = (na5) aw7Var.getValue();
                boolean f3 = rv4Var.f(D);
                Object P4 = rv4Var.P();
                if (f3 || P4 == obj) {
                    P4 = new pr0(aw7Var, D, 2);
                    rv4Var.o0(P4);
                }
                hc2.a(h, na5Var3, (xt4) P4, rv4Var, 6);
                rv4Var.q(false);
            } else {
                rv4Var.e0(1892865484);
                rv4Var.q(false);
            }
            s21.x(rv4Var, true, kq7Var, 8.0f, rv4Var);
            nq7 s = pna.s(kq7Var, 32.0f);
            na5 na5Var4 = (na5) aw7Var.getValue();
            boolean f4 = rv4Var.f(D);
            Object P5 = rv4Var.P();
            if (f4 || P5 == obj) {
                P5 = new pr0(aw7Var, D, 3);
                rv4Var.o0(P5);
            }
            b23.b(s, na5Var4, (xt4) P5, rv4Var, 6);
            rv4Var.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(nq7Var2, na5Var, z, xt4Var, i, 3);
        }
    }

    public static final void h(Integer num, int i, kj6 kj6Var, nq7 nq7Var, long j, float f, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        rv4 rv4Var2;
        kq7 kq7Var;
        long j2;
        float f2;
        ek9 u;
        hl3 hl3Var;
        long j3;
        rv4Var.g0(438324610);
        if (rv4Var.f(num)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3;
        if (rv4Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (rv4Var.f(kj6Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i8 = i7 | i5 | 224256;
        boolean z2 = true;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            long j4 = zl1.i;
            kq7 kq7Var2 = kq7.a;
            if (num == null) {
                u = rv4Var.u();
                if (u != null) {
                    hl3Var = new hl3(num, i, kj6Var, kq7Var2, j4, 2.0f, i2, 0);
                } else {
                    return;
                }
            } else {
                e81 e81Var = (e81) rv4Var.j(jt6.a);
                if (zl1.c(j4, j4)) {
                    j3 = e81Var.a.a;
                } else {
                    j3 = j4;
                }
                r71 r71Var = e81Var.c;
                if ((i8 & 14) != 4) {
                    z2 = false;
                }
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (z2 || P == lh9Var) {
                    P = yae.q(new u93(2, kj6Var, num));
                    rv4Var.o0(P);
                }
                Float f3 = (Float) ((yya) P).getValue();
                if (f3 != null) {
                    float floatValue = f3.floatValue();
                    rd2 rd2Var = qt5.a;
                    long j5 = j3;
                    rv4Var2 = rv4Var;
                    yya b = nq.b(floatValue, tte.x(150, 0, rd2Var, 2), null, rv4Var2, 0, 28);
                    yya b2 = nq.b(i, tte.x(150, 0, rd2Var, 2), "DropIndicatorFutureDepth", rv4Var2, 3072, 20);
                    ze4 ze4Var = pna.c;
                    boolean f4 = rv4Var2.f(b2) | rv4Var2.f(r71Var) | rv4Var2.e(j5) | rv4Var2.f(b);
                    Object P2 = rv4Var2.P();
                    if (!f4 && P2 != lh9Var) {
                        j2 = j4;
                        f2 = 2.0f;
                    } else {
                        j2 = j4;
                        wc3 wc3Var = new wc3(2.0f, r71Var, j5, b2, b);
                        f2 = 2.0f;
                        rv4Var2.o0(wc3Var);
                        P2 = wc3Var;
                    }
                    bce.a(ze4Var, (xt4) P2, rv4Var2, 0);
                    kq7Var = kq7Var2;
                } else {
                    u = rv4Var.u();
                    if (u != null) {
                        hl3Var = new hl3(num, i, kj6Var, kq7Var2, j4, 2.0f, i2, 1);
                    } else {
                        return;
                    }
                }
            }
            u.d = hl3Var;
        }
        rv4Var2 = rv4Var;
        rv4Var2.X();
        kq7Var = nq7Var;
        j2 = j;
        f2 = f;
        u = rv4Var2.u();
        if (u != null) {
            hl3Var = new hl3(num, i, kj6Var, kq7Var, j2, f2, i2, 2);
            u.d = hl3Var;
        }
    }

    public static final void i(q9d q9dVar, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        q9dVar.getClass();
        rv4Var.g0(1316131578);
        if ((i & 6) == 0) {
            if (rv4Var.f(q9dVar)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
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
            if (((Boolean) rv4Var.j(lx5.a)).booleanValue()) {
                rv4Var.e0(119517280);
                fu0.a(nq7Var, rv4Var, (i2 >> 3) & 14);
                rv4Var.q(false);
            } else {
                rv4Var.e0(119564834);
                tte.h(q9dVar, nq7Var, rv4Var, i2 & Token.ELSE);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yy7(q9dVar, nq7Var, i, 2);
        }
    }

    public static final boolean j(hh3 hh3Var, long j) {
        if (hh3Var.a.J) {
            wv5 wv5Var = (wv5) voe.v(hh3Var).c0.d;
            if (wv5Var.u0.J) {
                long h0 = wv5Var.h0(0L);
                float intBitsToFloat = Float.intBitsToFloat((int) (h0 >> 32));
                float intBitsToFloat2 = Float.intBitsToFloat((int) (h0 & 4294967295L));
                long j2 = hh3Var.N;
                float f = ((int) (j2 >> 32)) + intBitsToFloat;
                float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
                float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
                if (intBitsToFloat <= intBitsToFloat3 && intBitsToFloat3 <= f) {
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
                    if (intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final String k(String str, String str2) {
        str.getClass();
        str2.getClass();
        if (!k4b.j0(str2) && !k4b.j0(str) && !r4b.Q(str, "data:", true)) {
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            String str3 = ".webm";
            switch (lowerCase.hashCode()) {
                case -1662095187:
                    if (!lowerCase.equals("video/webm")) {
                        return str;
                    }
                    break;
                case -979095690:
                    if (!lowerCase.equals("application/x-mpegurl")) {
                        return str;
                    }
                    str3 = ".m3u8";
                    break;
                case -622808459:
                    if (!lowerCase.equals("application/vnd.apple.mpegurl")) {
                        return str;
                    }
                    str3 = ".m3u8";
                    break;
                case -586683234:
                    if (!lowerCase.equals("audio/x-wav")) {
                        return str;
                    }
                    str3 = ".wav";
                    break;
                case -107252314:
                    if (lowerCase.equals("video/quicktime")) {
                        str3 = ".mov";
                        break;
                    } else {
                        return str;
                    }
                case 64194685:
                    if (lowerCase.equals("application/dash+xml")) {
                        str3 = ".mpd";
                        break;
                    } else {
                        return str;
                    }
                case 187078282:
                    if (!lowerCase.equals("audio/aac")) {
                        return str;
                    }
                    str3 = ".m4a";
                    break;
                case 187090232:
                    if (!lowerCase.equals("audio/mp4")) {
                        return str;
                    }
                    str3 = ".m4a";
                    break;
                case 187091926:
                    if (lowerCase.equals("audio/ogg")) {
                        str3 = ".ogg";
                        break;
                    } else {
                        return str;
                    }
                case 187099443:
                    if (!lowerCase.equals("audio/wav")) {
                        return str;
                    }
                    str3 = ".wav";
                    break;
                case 1331848029:
                    if (lowerCase.equals("video/mp4")) {
                        str3 = ".mp4";
                        break;
                    } else {
                        return str;
                    }
                case 1504831518:
                    if (lowerCase.equals("audio/mpeg")) {
                        str3 = ".mp3";
                        break;
                    } else {
                        return str;
                    }
                case 1505115538:
                    if (!lowerCase.equals("audio/wave")) {
                        return str;
                    }
                    str3 = ".wav";
                    break;
                case 1505118770:
                    if (!lowerCase.equals("audio/webm")) {
                        return str;
                    }
                    break;
                case 2039520277:
                    if (lowerCase.equals("video/x-matroska")) {
                        str3 = ".mkv";
                        break;
                    } else {
                        return str;
                    }
                default:
                    return str;
            }
            String lowerCase2 = k4b.G0(k4b.G0(str, '?'), '#').toLowerCase(locale);
            lowerCase2.getClass();
            List<String> B = tl1.B(".m3u8", ".mpd", ".mp4", ".webm", ".mkv", ".mov", ".ts", ".m4a", ".mp3", ".ogg", ".wav");
            if (!B.isEmpty()) {
                for (String str4 : B) {
                    if (r4b.I(lowerCase2, str4, false)) {
                        return str;
                    }
                }
            }
            String C0 = k4b.C0('#', str, "");
            if (C0.length() > 0) {
                if (!B.isEmpty()) {
                    for (String str5 : B) {
                        String lowerCase3 = C0.toLowerCase(Locale.ROOT);
                        lowerCase3.getClass();
                        if (k4b.V(lowerCase3, str5, false)) {
                            return str;
                        }
                    }
                }
                return str.concat(str3);
            }
            return eub.o(str, "#", str3);
        }
        return str;
    }

    public static pt1 l(String str, String str2) {
        sc0 sc0Var = new sc0(str, str2);
        ot1 b = pt1.b(sc0.class);
        b.e = 1;
        b.f = new nt1(sc0Var, 0);
        return b.b();
    }

    public static final ob5 m(String str, Throwable th) {
        String message = th.getMessage();
        if (message == null) {
            message = th.toString();
        }
        return new ob5(str, message);
    }

    public static pt1 n(String str, fb4 fb4Var) {
        ot1 b = pt1.b(sc0.class);
        b.e = 1;
        b.a(x13.b(Context.class));
        b.f = new iu1(6, str, fb4Var);
        return b.b();
    }

    public static final int o() {
        if (((Boolean) au9.f.getValue()).booleanValue()) {
            return 1001;
        }
        if (((Boolean) au9.g.getValue()).booleanValue()) {
            return 1002;
        }
        if (((Boolean) au9.h.getValue()).booleanValue()) {
            return 1003;
        }
        if (((Boolean) au9.i.getValue()).booleanValue()) {
            return 1004;
        }
        if (((Boolean) au9.j.getValue()).booleanValue()) {
            return 1005;
        }
        if (((Boolean) au9.k.getValue()).booleanValue()) {
            return 1006;
        }
        if (((Boolean) au9.l.getValue()).booleanValue()) {
            return 1007;
        }
        if (((Boolean) au9.m.getValue()).booleanValue()) {
            return 1008;
        }
        if (((Boolean) au9.n.getValue()).booleanValue()) {
            return 1009;
        }
        if (((Boolean) au9.o.getValue()).booleanValue()) {
            return 1010;
        }
        if (((Boolean) au9.p.getValue()).booleanValue()) {
            return 1011;
        }
        if (((Boolean) au9.q.getValue()).booleanValue()) {
            return 1012;
        }
        if (((Boolean) au9.r.getValue()).booleanValue()) {
            return 1013;
        }
        if (((Boolean) au9.s.getValue()).booleanValue()) {
            return 1014;
        }
        return 1000;
    }

    public static final String p(vad vadVar) {
        vadVar.getClass();
        if (vadVar instanceof syc) {
            return ((syc) vadVar).a;
        }
        if (vadVar instanceof fi2) {
            fi2 fi2Var = (fi2) vadVar;
            return z(fi2Var.a, fi2Var.c, fi2Var.d);
        }
        xk5.o();
        return null;
    }

    public static nq7 q(nq7 nq7Var, k2a k2aVar, int i) {
        boolean z;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        return w(nq7Var, k2aVar, z, false);
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [vl9, java.lang.Object] */
    public static final Object r(xt4 xt4Var, n42 n42Var) {
        f61 f61Var = new f61(1, w92.t(n42Var));
        f61Var.u();
        ?? obj = new Object();
        f61Var.w(new h66(obj, 2));
        xt4Var.invoke(new i66(obj, f61Var, 1));
        return f61Var.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void s(defpackage.rn9 r7) {
        /*
            java.util.ArrayList r0 = r7.b
            boolean r1 = r0.isEmpty()
            r2 = 1
            if (r1 != 0) goto L53
            r1 = 0
            if (r0 == 0) goto L13
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L13
            goto L27
        L13:
            int r3 = r0.size()
            r4 = r1
        L18:
            if (r4 >= r3) goto L27
            java.lang.Object r5 = r0.get(r4)
            int r4 = r4 + 1
            lp3 r5 = (defpackage.lp3) r5
            boolean r5 = r5 instanceof defpackage.rp3
            if (r5 != 0) goto L18
            goto L53
        L27:
            int r3 = r0.size()
        L2b:
            if (r1 >= r3) goto L6a
            java.lang.Object r4 = r0.get(r1)
            int r1 = r1 + 1
            lp3 r4 = (defpackage.lp3) r4
            r4.getClass()
            rp3 r4 = (defpackage.rp3) r4
            java.util.ArrayList r4 = r4.b
            int r5 = r4.size()
            if (r5 == r2) goto L2b
            mp3 r5 = new mp3
            r5.<init>()
            java.util.ArrayList r6 = r5.b
            defpackage.xl1.P(r6, r4)
            r4.clear()
            r4.add(r5)
            goto L2b
        L53:
            int r1 = r0.size()
            if (r1 != r2) goto L5a
            goto L6a
        L5a:
            mp3 r1 = new mp3
            r1.<init>()
            java.util.ArrayList r2 = r1.b
            defpackage.xl1.P(r2, r0)
            r0.clear()
            r0.add(r1)
        L6a:
            t(r7)
            A(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rte.s(rn9):void");
    }

    public static final void t(up3 up3Var) {
        a73 a73Var;
        a73 a73Var2;
        a73 a73Var3;
        ArrayList arrayList = up3Var.b;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            lp3 lp3Var = (lp3) obj;
            if (lp3Var instanceof up3) {
                t((up3) lp3Var);
            }
        }
        u55 u55Var = (u55) up3Var.a().a(null, co5.M);
        a73 a73Var4 = y63.a;
        if (u55Var != null) {
            a73Var = u55Var.a;
        } else {
            a73Var = a73Var4;
        }
        if ((a73Var instanceof y63) && (arrayList == null || !arrayList.isEmpty())) {
            int size2 = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i3);
                i3++;
                u55 u55Var2 = (u55) ((lp3) obj2).a().a(null, co5.O);
                if (u55Var2 != null) {
                    a73Var3 = u55Var2.a;
                } else {
                    a73Var3 = null;
                }
                if (a73Var3 instanceof v63) {
                    up3Var.b(s9e.q(up3Var.a()));
                    break;
                }
            }
        }
        mid midVar = (mid) up3Var.a().a(null, co5.N);
        if (midVar != null) {
            a73Var4 = midVar.a;
        }
        if (a73Var4 instanceof y63) {
            if (arrayList == null || !arrayList.isEmpty()) {
                int size3 = arrayList.size();
                while (i < size3) {
                    Object obj3 = arrayList.get(i);
                    i++;
                    mid midVar2 = (mid) ((lp3) obj3).a().a(null, co5.P);
                    if (midVar2 != null) {
                        a73Var2 = midVar2.a;
                    } else {
                        a73Var2 = null;
                    }
                    if (a73Var2 instanceof v63) {
                        up3Var.b(s9e.s(up3Var.a()));
                        return;
                    }
                }
            }
        }
    }

    public static final k2a u(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        boolean d = rv4Var.d(0);
        Object P = rv4Var.P();
        if (d || P == ax1.a) {
            P = new zt9(17);
            rv4Var.o0(P);
        }
        return (k2a) zpe.m(objArr, k2a.k, (vt4) P, rv4Var, 0);
    }

    public static final String v(String str, String str2) {
        String obj = k4b.N0(str).toString();
        if (!k4b.j0(obj)) {
            Pattern compile = Pattern.compile("^[a-zA-Z][a-zA-Z0-9+.-]*:");
            compile.getClass();
            if (!compile.matcher(obj).find()) {
                if (!r4b.I(str2, "/", false)) {
                    str2 = str2.concat("/");
                }
                return str2.concat(k4b.t0(obj, "/"));
            }
            return str;
        }
        return str;
    }

    public static nq7 w(nq7 nq7Var, k2a k2aVar, boolean z, boolean z2) {
        ff8 ff8Var;
        nq7 k;
        ff8 ff8Var2 = ff8.a;
        if (z2) {
            ff8Var = ff8Var2;
        } else {
            ff8Var = ff8.b;
        }
        yu7 yu7Var = k2aVar.e;
        kq7 kq7Var = kq7.a;
        if (ff8Var == ff8Var2) {
            k = tte.k(kq7Var, ba5.c);
        } else {
            k = tte.k(kq7Var, ba5.b);
        }
        return nq7Var.a0(k).a0(new m2a(null, null, null, yu7Var, ff8Var, k2aVar, z, false, true)).a0(new p3a(k2aVar, z2));
    }

    public static final String x(tva tvaVar) {
        tvaVar.getClass();
        if (tvaVar.equals(hva.a)) {
            return "bold";
        }
        if (tvaVar.equals(ova.a)) {
            return "italic";
        }
        if (tvaVar.equals(rva.a)) {
            return "underline";
        }
        if (tvaVar.equals(qva.a)) {
            return "strike_through";
        }
        if (tvaVar.equals(lva.a)) {
            return "inline_code";
        }
        if (tvaVar instanceof jva) {
            return "highlight";
        }
        if (tvaVar instanceof iva) {
            return "foreground";
        }
        if (tvaVar instanceof mva) {
            return "inline_image";
        }
        if (tvaVar instanceof sva) {
            return "user_mention";
        }
        if (tvaVar instanceof nva) {
            return "inline_video";
        }
        if (tvaVar instanceof kva) {
            return "inline_audio";
        }
        if (tvaVar instanceof pva) {
            return "link";
        }
        xk5.o();
        return null;
    }

    public static final st3 y(tkc tkcVar, xt4 xt4Var, Object obj, rv4 rv4Var) {
        rv4Var.b0(-422486690, tkcVar);
        boolean g = tkcVar.g();
        c3e c3eVar = tkcVar.a;
        st3 st3Var = st3.c;
        st3 st3Var2 = st3.b;
        st3 st3Var3 = st3.a;
        if (g) {
            rv4Var.e0(-212166497);
            rv4Var.q(false);
            if (((Boolean) xt4Var.invoke(obj)).booleanValue()) {
                st3Var = st3Var2;
            } else if (!((Boolean) xt4Var.invoke(c3eVar.z())).booleanValue()) {
                st3Var = st3Var3;
            }
        } else {
            rv4Var.e0(-211890659);
            Object P = rv4Var.P();
            if (P == ax1.a) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            if (((Boolean) xt4Var.invoke(c3eVar.z())).booleanValue()) {
                aw7Var.setValue(Boolean.TRUE);
            }
            Object value = tkcVar.e.getValue();
            if (((Boolean) xt4Var.invoke(obj)).booleanValue()) {
                st3Var = st3Var2;
            } else if ((value != null && ((Boolean) xt4Var.invoke(value)).booleanValue()) || !((Boolean) aw7Var.getValue()).booleanValue()) {
                st3Var = st3Var3;
            }
            rv4Var.q(false);
        }
        rv4Var.q(false);
        return st3Var;
    }

    public static final String z(String str, String str2, String str3) {
        if (r4b.Q(str, "data:", true)) {
            return str;
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if ((lowerCase.equals("application/x-mpegurl") || lowerCase.equals("application/vnd.apple.mpegurl") || lowerCase.equals("audio/mpegurl") || lowerCase.equals("audio/x-mpegurl")) && !k4b.j0(str3)) {
            str = g9a.d0(new ki4(3, new c00(str, 3), new a23(str3, 17)), "\n");
        }
        if (k4b.j0(str2)) {
            str2 = "application/octet-stream";
        }
        return eub.p("data:", str2, ";base64,", ah0.b(ah0.f, r4b.H(str)));
    }
}
