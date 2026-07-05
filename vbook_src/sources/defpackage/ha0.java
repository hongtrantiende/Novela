package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ha0  reason: default package */
/* loaded from: classes3.dex */
public abstract class ha0 {
    public static final List a = tl1.B(new zl1(sve.b(855638016)), new zl1(sve.b(0)));
    public static final float b = 15.0f;

    public static final void a(ja0 ja0Var, h2a h2aVar, nq7 nq7Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        nq7Var.getClass();
        rv4Var.g0(-1958290971);
        if (rv4Var.f(ja0Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.f(h2aVar)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.h(xt4Var)) {
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
            if (((Boolean) ja0Var.e.getValue()).booleanValue()) {
                rv4Var.e0(-905279214);
                Object[] objArr = new Object[0];
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = new mz(25);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new mz(27);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                Boolean bool = (Boolean) aw7Var.getValue();
                bool.booleanValue();
                boolean f = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
                Object P3 = rv4Var.P();
                if (f || P3 == obj) {
                    P3 = new aa0(aw7Var2, aw7Var, (m42) null, 0);
                    rv4Var.o0(P3);
                }
                yte.g((lu4) P3, rv4Var, bool);
                ze4 ze4Var = pna.c;
                b37 d = fu0.d(kh5.a, false);
                int hashCode = Long.hashCode(rv4Var.T);
                xt8 l = rv4Var.l();
                nq7 p = lye.p(rv4Var, ze4Var);
                rw1.k.getClass();
                vt4 vt4Var = qw1.b;
                rv4Var.i0();
                if (rv4Var.S) {
                    rv4Var.k(vt4Var);
                } else {
                    rv4Var.r0();
                }
                jce.F(qw1.f, rv4Var, d);
                jce.F(qw1.e, rv4Var, l);
                jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                jce.C(qw1.h, rv4Var);
                jce.F(qw1.d, rv4Var, p);
                if (ja0Var.d()) {
                    rv4Var.e0(31204780);
                    boolean f2 = rv4Var.f(aw7Var);
                    Object P4 = rv4Var.P();
                    if (f2 || P4 == obj) {
                        P4 = new en(aw7Var, 1);
                        rv4Var.o0(P4);
                    }
                    c(ja0Var, nq7Var, (vt4) P4, rv4Var, (i7 & 14) | 48);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(31482323);
                    boolean f3 = rv4Var.f(aw7Var);
                    Object P5 = rv4Var.P();
                    if (f3 || P5 == obj) {
                        P5 = new en(aw7Var, 3);
                        rv4Var.o0(P5);
                    }
                    b(ja0Var, h2aVar, nq7Var, (vt4) P5, rv4Var, i7 & 1022);
                    rv4Var.q(false);
                }
                boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                boolean c = ja0Var.c();
                float floatValue = ((Number) ja0Var.h.getValue()).floatValue();
                nq7 z7 = zbe.z(pna.u(mwe.u(pu0.a.a(kq7.a, kh5.D), false, 15), nae.e, 460.0f, 1), 24.0f, 12.0f);
                int i8 = i7 & 14;
                if (i8 == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if ((i7 & 7168) == 2048) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                boolean z8 = z2 | z3;
                Object P6 = rv4Var.P();
                if (z8 || P6 == obj) {
                    P6 = new k0(4, ja0Var, xt4Var);
                    rv4Var.o0(P6);
                }
                xt4 xt4Var2 = (xt4) P6;
                if (i8 == 4) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Object P7 = rv4Var.P();
                if (z4 || P7 == obj) {
                    P7 = new y90(ja0Var, 0);
                    rv4Var.o0(P7);
                }
                vt4 vt4Var2 = (vt4) P7;
                if (i8 == 4) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                Object P8 = rv4Var.P();
                if (z5 || P8 == obj) {
                    P8 = new y90(ja0Var, 1);
                    rv4Var.o0(P8);
                }
                vt4 vt4Var3 = (vt4) P8;
                if (i8 == 4) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                Object P9 = rv4Var.P();
                if (z6 || P9 == obj) {
                    P9 = new y90(ja0Var, 2);
                    rv4Var.o0(P9);
                }
                fxe.a(booleanValue, c, floatValue, z7, xt4Var2, vt4Var2, vt4Var3, (vt4) P9, rv4Var, 0);
                rv4Var.q(true);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-903423523);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new i31(ja0Var, h2aVar, nq7Var, xt4Var, i, 9);
        }
    }

    public static final void b(ja0 ja0Var, h2a h2aVar, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i3;
        int i4;
        int i5;
        int i6;
        rv4Var.g0(1652548477);
        if ((i & 6) == 0) {
            if (rv4Var.f(ja0Var)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(h2aVar)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new y4(25);
                rv4Var.o0(P);
            }
            nq7 k = axe.k(nq7Var, (xt4) P);
            if ((i2 & 7168) == 2048) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var.P();
            if (z2 || P2 == lh9Var) {
                P2 = new ba0(1, vt4Var);
                rv4Var.o0(P2);
            }
            pvc pvcVar = pvc.a;
            nq7 b2 = dab.b(k, pvcVar, (PointerInputEventHandler) P2);
            int i7 = i2 & 14;
            if (i7 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P3 = rv4Var.P();
            if (z3 || P3 == lh9Var) {
                P3 = new ga0(ja0Var, 0);
                rv4Var.o0(P3);
            }
            nq7 b3 = dab.b(b2, pvcVar, (PointerInputEventHandler) P3);
            if (i7 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i2 & Token.ASSIGN_MOD) == 32) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z6 = z4 | z5;
            Object P4 = rv4Var.P();
            if (z6 || P4 == lh9Var) {
                P4 = new k0(3, ja0Var, h2aVar);
                rv4Var.o0(P4);
            }
            bce.a(b3, (xt4) P4, rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x90(ja0Var, h2aVar, nq7Var, vt4Var, i, 0);
        }
    }

    public static final void c(ja0 ja0Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-1092499674);
        if ((i & 6) == 0) {
            if (rv4Var.f(ja0Var)) {
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
            if (rv4Var.h(vt4Var)) {
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
            if ((i2 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z2 || P == lh9Var) {
                P = new ba0(3, vt4Var);
                rv4Var.o0(P);
            }
            pvc pvcVar = pvc.a;
            nq7 b2 = dab.b(nq7Var, pvcVar, (PointerInputEventHandler) P);
            if ((i2 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P2 = rv4Var.P();
            if (z3 || P2 == lh9Var) {
                P2 = new ga0(ja0Var, 1);
                rv4Var.o0(P2);
            }
            fu0.a(dab.b(b2, pvcVar, (PointerInputEventHandler) P2), rv4Var, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va((Object) ja0Var, nq7Var, (hu4) vt4Var, i, 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [ja0, java.lang.Object, q95] */
    public static final ja0 d(boolean z, float f, kj6 kj6Var, h2a h2aVar, rv4 rv4Var) {
        kj6Var.getClass();
        Object P = rv4Var.P();
        Object obj = ax1.a;
        if (P == obj) {
            P = yte.s(rv4Var);
            rv4Var.o0(P);
        }
        m82 m82Var = (m82) P;
        r13 r13Var = (r13) rv4Var.j(dy1.h);
        if (z) {
            rv4Var.e0(538231492);
            Object P2 = rv4Var.P();
            if (P2 == obj) {
                m82Var.getClass();
                r13Var.getClass();
                P2 = new ja0(kj6Var, m82Var, r13Var, 0);
                rv4Var.o0(P2);
            }
            o5d o5dVar = (o5d) P2;
            o5dVar.getClass();
            m82Var.getClass();
            r13Var.getClass();
            o5dVar.h.setValue(Float.valueOf(f));
            o5dVar.b = kj6Var;
            o5dVar.c = m82Var;
            o5dVar.d = r13Var;
            rv4Var.q(false);
            return o5dVar;
        }
        rv4Var.e0(538542174);
        Object P3 = rv4Var.P();
        Object obj2 = P3;
        if (P3 == obj) {
            m82Var.getClass();
            r13Var.getClass();
            ?? ja0Var = new ja0(kj6Var, m82Var, r13Var, 0);
            ja0Var.i = h2aVar;
            rv4Var.o0(ja0Var);
            obj2 = ja0Var;
        }
        q95 q95Var = (q95) obj2;
        q95Var.getClass();
        m82Var.getClass();
        r13Var.getClass();
        q95Var.h.setValue(Float.valueOf(f));
        q95Var.b = kj6Var;
        q95Var.i = h2aVar;
        q95Var.c = m82Var;
        q95Var.d = r13Var;
        rv4Var.q(false);
        return q95Var;
    }
}
