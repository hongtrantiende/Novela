package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cs8  reason: default package */
/* loaded from: classes3.dex */
public abstract class cs8 {
    public static final long a = sve.d(4294305480L);
    public static final long b = sve.d(4284171830L);
    public static final long c = sve.d(4287323708L);

    public static final void a(dm5 dm5Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        long c2;
        boolean g;
        boolean z4;
        dm5Var.getClass();
        rv4Var.g0(-2140775935);
        if (rv4Var.f(dm5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z5 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            om3 om3Var = (om3) rv4Var.j(nm3.a);
            int i4 = dm5Var.u;
            if (i4 == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            long j = c;
            if (P == lh9Var) {
                if (z2) {
                    c2 = j;
                } else {
                    c2 = om3Var.c();
                }
                dl8 dl8Var = (dl8) om3Var.k.getValue();
                if (z2) {
                    g = false;
                } else {
                    g = om3Var.g();
                }
                boolean e = om3Var.e();
                boolean booleanValue = ((Boolean) om3Var.d.getValue()).booleanValue();
                if (i4 == 1) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                om3 om3Var2 = new om3(c2, z4, booleanValue, e, g, om3Var.f(), dl8Var, om3Var.b(), om3Var.a(), (eo4) om3Var.h.getValue());
                rv4Var.o0(om3Var2);
                P = om3Var2;
            }
            om3 om3Var3 = (om3) P;
            if (i4 == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            om3Var3.c.setValue(Boolean.valueOf(z3));
            if (!z2) {
                j = om3Var.c();
            }
            om3Var3.a.setValue(new zl1(j));
            if (!z2) {
                z5 = om3Var.g();
            }
            om3Var3.f.setValue(Boolean.valueOf(z5));
            nm3.a(om3Var3, ((h27) rv4Var.j(j27.a)).c, false, null, jce.E(-1076789899, new vg7(9, dm5Var, (lzb) rv4Var.j(e1c.a), tu1Var), rv4Var), rv4Var, 24576, 12);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lq5(dm5Var, tu1Var, i, 1);
        }
    }
}
