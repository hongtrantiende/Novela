package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vpa  reason: default package */
/* loaded from: classes.dex */
public abstract class vpa {
    public static final float a = uue.q;
    public static final float b;
    public static final float c;
    public static final float d;
    public static final m5d e;

    /* JADX WARN: Type inference failed for: r0v4, types: [m5d, ec] */
    static {
        float f = uue.o;
        b = f;
        float f2 = uue.n;
        ote.a(f, f2);
        ote.a(f2, f);
        c = 6.0f;
        d = 2.0f;
        e = new ec(spa.a);
    }

    public static final void a(final float f, final xt4 xt4Var, final nq7 nq7Var, final boolean z, final vt4 vt4Var, gpa gpaVar, final yu7 yu7Var, final int i, final mu4 mu4Var, final mu4 mu4Var2, final jk1 jk1Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        Object obj;
        Object obj2;
        Object obj3;
        int i5;
        boolean z2;
        boolean z3;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        rv4Var.g0(985901935);
        if ((i2 & 6) == 0) {
            if (rv4Var.c(f)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i4 = i16 | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(xt4Var)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i4 |= i15;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i14 = 256;
            } else {
                i14 = Token.CASE;
            }
            i4 |= i14;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.g(z)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i4 |= i13;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.h(vt4Var)) {
                i12 = 16384;
            } else {
                i12 = 8192;
            }
            i4 |= i12;
        }
        if ((196608 & i2) == 0) {
            obj = gpaVar;
            if (rv4Var.f(obj)) {
                i11 = 131072;
            } else {
                i11 = Parser.ARGC_LIMIT;
            }
            i4 |= i11;
        } else {
            obj = gpaVar;
        }
        if ((1572864 & i2) == 0) {
            obj2 = yu7Var;
            if (rv4Var.f(obj2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i4 |= i10;
        } else {
            obj2 = yu7Var;
        }
        if ((12582912 & i2) == 0) {
            if (rv4Var.d(i)) {
                i9 = 8388608;
            } else {
                i9 = 4194304;
            }
            i4 |= i9;
        }
        if ((100663296 & i2) == 0) {
            obj3 = mu4Var;
            if (rv4Var.h(obj3)) {
                i8 = 67108864;
            } else {
                i8 = 33554432;
            }
            i4 |= i8;
        } else {
            obj3 = mu4Var;
        }
        if ((i2 & 805306368) == 0) {
            if (rv4Var.h(mu4Var2)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i4 |= i7;
        }
        if ((i3 & 6) == 0) {
            if (rv4Var.f(jk1Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i5 = i3 | i6;
        } else {
            i5 = i3;
        }
        boolean z4 = false;
        if ((i4 & 306783379) == 306783378 && (i5 & 3) == 2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
            }
            rv4Var.r();
            if ((29360128 & i4) == 8388608) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((((i5 & 14) ^ 6) > 4 && rv4Var.f(jk1Var)) || (i5 & 6) == 4) {
                z4 = true;
            }
            boolean z5 = z3 | z4;
            Object P = rv4Var.P();
            if (z5 || P == ax1.a) {
                P = new wpa(f, i, vt4Var, jk1Var);
                rv4Var.o0(P);
            }
            wpa wpaVar = (wpa) P;
            wpaVar.b = vt4Var;
            wpaVar.e = xt4Var;
            wpaVar.d(f);
            int i17 = i4 >> 9;
            b(wpaVar, nq7Var, z, null, obj2, obj3, mu4Var2, rv4Var, ((i4 >> 3) & 1008) | ((i4 >> 6) & 57344) | (458752 & i17) | (i17 & 3670016));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            final gpa gpaVar2 = obj;
            u.d = new lu4() { // from class: lpa
                @Override // defpackage.lu4
                public final Object invoke(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    int p = xoe.p(i2 | 1);
                    int p2 = xoe.p(i3);
                    vpa.a(f, xt4Var, nq7Var, z, vt4Var, gpaVar2, yu7Var, i, mu4Var, mu4Var2, jk1Var, (rv4) obj4, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(wpa wpaVar, nq7 nq7Var, boolean z, gpa gpaVar, yu7 yu7Var, mu4 mu4Var, mu4 mu4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        gpa gpaVar2;
        int i3;
        gpa c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(409861960);
        if ((i & 6) == 0) {
            if (rv4Var.h(wpaVar)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i2 = i9 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i2 |= i8;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i2 |= i7;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.f(yu7Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i2 |= i6;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(mu4Var)) {
                i5 = 131072;
            } else {
                i5 = Parser.ARGC_LIMIT;
            }
            i2 |= i5;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(mu4Var2)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i2 |= i4;
        }
        if ((599187 & i2) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i3 = i2 & (-7169);
                c2 = gpaVar;
            } else {
                kpa kpaVar = kpa.a;
                i3 = i2 & (-7169);
                c2 = kpa.c(rv4Var);
            }
            rv4Var.r();
            if (wpaVar.a >= 0) {
                int i10 = i3 >> 3;
                c(nq7Var, wpaVar, z, yu7Var, mu4Var, mu4Var2, rv4Var, (i3 & 896) | (i10 & 14) | ((i3 << 3) & Token.ASSIGN_MOD) | (i10 & 7168) | (57344 & i10) | (i10 & 458752));
                gpaVar2 = c2;
            } else {
                vs.m("steps should be >= 0");
                return;
            }
        } else {
            rv4Var.X();
            gpaVar2 = gpaVar;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg1(wpaVar, nq7Var, z, gpaVar2, yu7Var, mu4Var, mu4Var2, i);
        }
    }

    public static final void c(nq7 nq7Var, wpa wpaVar, boolean z, yu7 yu7Var, mu4 mu4Var, mu4 mu4Var2, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        mu4 mu4Var3;
        wpa wpaVar2;
        boolean z3;
        aw7 aw7Var;
        boolean z4;
        nq7 nq7Var2;
        ff8 ff8Var;
        dm8 dm8Var;
        nq7 x;
        float f;
        float f2;
        nq7 nq7Var3;
        r13 r13Var;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        mu4 mu4Var4 = mu4Var2;
        rv4Var.g0(898172835);
        if ((i & 6) == 0) {
            if (rv4Var.f(nq7Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(wpaVar)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.f(yu7Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(mu4Var)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(mu4Var4)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        int i9 = i2;
        if ((74899 & i9) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            if (rv4Var.j(dy1.n) == tc6.b) {
                z3 = true;
            } else {
                z3 = false;
            }
            wpaVar.j = z3;
            dm8 dm8Var2 = wpaVar.d;
            ff8 ff8Var2 = wpaVar.n;
            int i10 = i9 >> 9;
            aw7 l = y9e.l(yu7Var, rv4Var, i10 & 14);
            Boolean bool = (Boolean) l.getValue();
            bool.getClass();
            wpaVar.k.setValue(bool);
            if (ff8Var2 == ff8.b && wpaVar.j) {
                aw7Var = l;
                z4 = true;
            } else {
                aw7Var = l;
                z4 = false;
            }
            kq7 kq7Var = kq7.a;
            if (z) {
                nq7Var2 = dab.c(kq7Var, wpaVar, yu7Var, new w42(3, yu7Var, wpaVar));
            } else {
                nq7Var2 = kq7Var;
            }
            ff8 ff8Var3 = wpaVar.n;
            boolean booleanValue = ((Boolean) wpaVar.o.getValue()).booleanValue();
            boolean h = rv4Var.h(wpaVar);
            Object P = rv4Var.P();
            aw7 aw7Var2 = aw7Var;
            Object obj = ax1.a;
            if (!h && P != obj) {
                ff8Var = ff8Var3;
                dm8Var = dm8Var2;
            } else {
                ff8Var = ff8Var3;
                dm8Var = dm8Var2;
                P = new ao0(wpaVar, null, 2);
                rv4Var.o0(P);
            }
            nq7 nq7Var4 = nq7Var2;
            nq7 a2 = nj3.a(kq7Var, wpaVar, ff8Var, z, yu7Var, booleanValue, null, (mu4) P, z4, 32);
            hpa hpaVar = hpa.a;
            ff8 ff8Var4 = ff8.a;
            if (ff8Var2 == ff8Var4) {
                x = pna.v(bze.o(kq7Var, hpaVar));
            } else {
                x = pna.x(bze.o(kq7Var, hpaVar));
            }
            vt9 vt9Var = ((wt9) rv4Var.j(jt9.a)).a;
            rv4Var.e0(-177303905);
            rv4Var.q(false);
            r13 r13Var2 = (r13) rv4Var.j(dy1.h);
            n95 n95Var = jz5.a;
            nq7 a0 = nq7Var.a0(pc7.b);
            float f3 = b;
            float f4 = a;
            if (ff8Var2 == ff8Var4) {
                f = f4;
            } else {
                f = f3;
            }
            if (ff8Var2 == ff8Var4) {
                f2 = f3;
            } else {
                f2 = f4;
            }
            nq7 c2 = y7a.c(pna.m(a0, f, f2, nae.e, nae.e, 12), false, new nf0(z, wpaVar, 6));
            jk1 jk1Var = wpaVar.c;
            if (ff8Var2 == ff8Var4) {
                nq7Var3 = a5.b;
            } else {
                nq7Var3 = a5.a;
            }
            nq7 nq7Var5 = x;
            nq7 A = owe.A(y7a.c(c2.a0(nq7Var3), true, new ra7(dm8Var.h(), new jk1(jk1Var.a, jk1Var.b), wpaVar.a)), z, yu7Var);
            int i11 = wpaVar.a;
            jk1 jk1Var2 = wpaVar.c;
            float h2 = dm8Var.h();
            boolean h3 = rv4Var.h(wpaVar);
            Object P2 = rv4Var.P();
            if (h3 || P2 == obj) {
                P2 = new opa(wpaVar, 0);
                rv4Var.o0(P2);
            }
            xt4 xt4Var = (xt4) P2;
            boolean z6 = z4;
            vt4 vt4Var = wpaVar.b;
            if (ff8Var2 == ff8Var4) {
                r13Var = r13Var2;
                z5 = true;
            } else {
                r13Var = r13Var2;
                z5 = false;
            }
            if (i11 >= 0) {
                wpaVar2 = wpaVar;
                r13 r13Var3 = r13Var;
                nq7 a02 = tye.l(A, new tpa(z, jk1Var2, i11, z6, xt4Var, z5, h2, vt4Var)).a0(nq7Var4).a0(a2);
                boolean g = rv4Var.g(false) | rv4Var.f(aw7Var2) | rv4Var.h(wpaVar2);
                Object P3 = rv4Var.P();
                if (g || P3 == obj) {
                    P3 = new eq6(wpaVar2, aw7Var2);
                    rv4Var.o0(P3);
                }
                b37 b37Var = (b37) P3;
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l2 = rv4Var.l();
                nq7 p = lye.p(rv4Var, a02);
                rw1.k.getClass();
                vt4 vt4Var2 = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var2);
                } else {
                    rv4Var.r0();
                }
                np npVar = qw1.f;
                jce.F(npVar, rv4Var, b37Var);
                np npVar2 = qw1.e;
                jce.F(npVar2, rv4Var, l2);
                Integer valueOf = Integer.valueOf(hashCode);
                np npVar3 = qw1.g;
                jce.F(npVar3, rv4Var, valueOf);
                kg kgVar = qw1.h;
                jce.C(kgVar, rv4Var);
                np npVar4 = qw1.d;
                jce.F(npVar4, rv4Var, p);
                nq7 a03 = nq7Var5.a0(kq7Var);
                boolean g2 = rv4Var.g(false) | rv4Var.f(aw7Var2) | rv4Var.f(r13Var3) | rv4Var.h(wpaVar2);
                Object P4 = rv4Var.P();
                if (g2 || P4 == obj) {
                    P4 = new opa(r13Var3, wpaVar2, aw7Var2);
                    rv4Var.o0(P4);
                }
                nq7 l3 = pbe.l(a03, (xt4) P4);
                nk0 nk0Var = kh5.a;
                b37 d2 = fu0.d(nk0Var, false);
                int hashCode2 = Long.hashCode(rv4Var.T);
                xt8 l4 = rv4Var.l();
                nq7 p2 = lye.p(rv4Var, l3);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, d2);
                jce.F(npVar2, rv4Var, l4);
                s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p2);
                int i12 = (i9 >> 3) & 14;
                mu4Var3 = mu4Var;
                mu4Var3.c(wpaVar2, rv4Var, Integer.valueOf((i10 & Token.ASSIGN_MOD) | i12));
                rv4Var.q(true);
                nq7 o = bze.o(kq7Var, hpa.b);
                b37 d3 = fu0.d(nk0Var, false);
                int hashCode3 = Long.hashCode(rv4Var.T);
                xt8 l5 = rv4Var.l();
                nq7 p3 = lye.p(rv4Var, o);
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var2);
                } else {
                    rv4Var.r0();
                }
                jce.F(npVar, rv4Var, d3);
                jce.F(npVar2, rv4Var, l5);
                s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
                jce.F(npVar4, rv4Var, p3);
                mu4Var4 = mu4Var2;
                mu4Var4.c(wpaVar2, rv4Var, Integer.valueOf(i12 | ((i9 >> 12) & Token.ASSIGN_MOD)));
                rv4Var.q(true);
                rv4Var.q(true);
            } else {
                vs.m("steps should be >= 0");
                return;
            }
        } else {
            mu4Var3 = mu4Var;
            wpaVar2 = wpaVar;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sg1(nq7Var, wpaVar2, z, yu7Var, mu4Var3, mu4Var4, i, 6);
        }
    }

    public static final float d(float f, float f2, float f3, float[] fArr) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f4);
            } else {
                float abs = Math.abs(b23.o(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float abs2 = Math.abs(b23.o(f2, f3, f5) - f);
                        if (Float.compare(abs, abs2) > 0) {
                            f4 = f5;
                            abs = abs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                valueOf = Float.valueOf(f4);
            }
        }
        if (valueOf != null) {
            return b23.o(f2, f3, valueOf.floatValue());
        }
        return f;
    }
}
