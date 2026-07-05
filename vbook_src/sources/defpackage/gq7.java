package defpackage;

import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gq7  reason: default package */
/* loaded from: classes3.dex */
public abstract class gq7 {
    public static final List a = tl1.B(Float.valueOf(0.25f), Float.valueOf(0.5f), Float.valueOf(1.0f), Float.valueOf(1.5f), Float.valueOf(2.0f), Float.valueOf(2.5f), Float.valueOf(3.0f));

    public static final void a(final boolean z, final float f, final vt4 vt4Var, final xt4 xt4Var, rv4 rv4Var, final int i) {
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        int i4;
        int i5;
        int i6;
        vt4Var.getClass();
        xt4Var.getClass();
        rv4Var.g0(1635375280);
        if ((i & 6) == 0) {
            z2 = z;
            if (rv4Var.g(z2)) {
                i6 = 4;
            } else {
                i6 = 2;
            }
            i2 = i6 | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.c(f)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i2 |= i5;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i2 |= i4;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 2048;
            } else {
                i3 = 1024;
            }
            i2 |= i3;
        }
        if ((i2 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i2 & 1, z3)) {
            boolean z4 = z2;
            iue.e(z4, kh5.c, (Float.floatToRawIntBits(8.0f) & 4294967295L) | (Float.floatToRawIntBits(nae.e) << 32), null, nae.e, null, vt4Var, jce.E(2041576740, new dq7(f, 0, xt4Var), rv4Var), rv4Var, (i2 & 14) | 12583344 | ((i2 << 12) & 3670016), 56);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: eq7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    gq7.a(z, f, vt4Var, xt4Var, (rv4) obj, xoe.p(i | 1));
                    return pvc.a;
                }
            };
        }
    }

    public static final void b(final float f, final boolean z, final vt4 vt4Var, rv4 rv4Var, final int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        long g;
        long b;
        long j;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(2133220924);
        if (rv4Var2.c(f)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i7 & 1, z2)) {
            if (z) {
                rv4Var2.e0(-1846400958);
                g = zl1.b(0.2f, ((h27) rv4Var2.j(j27.a)).a.a);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1846327457);
                g = rm1.g(((h27) rv4Var2.j(j27.a)).a, 6.0f);
                rv4Var2.q(false);
            }
            if (z) {
                rv4Var2.e0(-1846220414);
                b = zl1.b(0.6f, ((h27) rv4Var2.j(j27.a)).a.a);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1846147006);
                b = zl1.b(0.2f, ((h27) rv4Var2.j(j27.a)).a.A);
                rv4Var2.q(false);
            }
            if (z) {
                rv4Var2.e0(-1846045419);
                j = ((h27) rv4Var2.j(j27.a)).a.a;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1845990797);
                j = ((h27) rv4Var2.j(j27.a)).a.q;
                rv4Var2.q(false);
            }
            tza tzaVar = j27.a;
            nq7 z3 = zbe.z(lbe.f(15, vt4Var, st0.d(nmd.v(tte.k(kq7.a, ((h27) rv4Var2.j(tzaVar)).c.c), g, lre.g), 1.0f, b, ((h27) rv4Var2.j(tzaVar)).c.c), null, false), 14.0f, 8.0f);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z3);
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
            cvb.c(yqe.B((y3b) b2b.i.getValue(), new Object[]{c(f)}, rv4Var2), null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4(f, z, vt4Var, i) { // from class: fq7
                public final /* synthetic */ float a;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ vt4 c;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(1);
                    gq7.b(this.a, this.b, this.c, (rv4) obj, p2);
                    return pvc.a;
                }
            };
        }
    }

    public static final String c(float f) {
        float f2 = ((int) (f * 100.0f)) / 100.0f;
        int i = (int) f2;
        if (Math.abs(f2 - i) < 0.005f) {
            return String.valueOf(i);
        }
        return k4b.Q0(k4b.Q0(String.valueOf(((int) (f2 * 100.0f)) / 100.0d), '0'), '.');
    }
}
