package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ld2  reason: default package */
/* loaded from: classes.dex */
public final class ld2 extends fb6 implements lu4 {
    public final /* synthetic */ tkc a;
    public final /* synthetic */ lf4 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ tu1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ld2(tkc tkcVar, lf4 lf4Var, Object obj, tu1 tu1Var) {
        super(2);
        this.a = tkcVar;
        this.b = lf4Var;
        this.c = obj;
        this.d = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        Object z2;
        float f;
        xt4 xt4Var;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            oha ohaVar = new oha(this.b, 2);
            drc drcVar = fca.f;
            tkc tkcVar = this.a;
            boolean g = tkcVar.g();
            c3e c3eVar = tkcVar.a;
            lh9 lh9Var = ax1.a;
            if (!g) {
                rv4Var.e0(1666573488);
                boolean f2 = rv4Var.f(tkcVar);
                z2 = rv4Var.P();
                if (f2 || z2 == lh9Var) {
                    zqa f3 = pae.f();
                    if (f3 != null) {
                        xt4Var = f3.e();
                    } else {
                        xt4Var = null;
                    }
                    zqa h = pae.h(f3);
                    try {
                        Object z3 = c3eVar.z();
                        pae.n(f3, h, xt4Var);
                        rv4Var.o0(z3);
                        z2 = z3;
                    } catch (Throwable th) {
                        pae.n(f3, h, xt4Var);
                        throw th;
                    }
                }
                rv4Var.q(false);
            } else {
                rv4Var.e0(1666827533);
                rv4Var.q(false);
                z2 = c3eVar.z();
            }
            rv4Var.e0(1378811975);
            Object obj3 = this.c;
            boolean i = c16.i(z2, obj3);
            float f4 = nae.e;
            if (i) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            rv4Var.q(false);
            Float valueOf = Float.valueOf(f);
            boolean f5 = rv4Var.f(tkcVar);
            Object P = rv4Var.P();
            if (f5 || P == lh9Var) {
                P = yae.q(new tg1(tkcVar, 4));
                rv4Var.o0(P);
            }
            Object value = ((yya) P).getValue();
            rv4Var.e0(1378811975);
            if (c16.i(value, obj3)) {
                f4 = 1.0f;
            }
            rv4Var.q(false);
            Float valueOf2 = Float.valueOf(f4);
            boolean f6 = rv4Var.f(tkcVar);
            Object P2 = rv4Var.P();
            if (f6 || P2 == lh9Var) {
                P2 = yae.q(new tg1(tkcVar, 5));
                rv4Var.o0(P2);
            }
            skc i2 = bze.i(tkcVar, valueOf, valueOf2, (lf4) ohaVar.c(((yya) P2).getValue(), rv4Var, 0), drcVar, rv4Var, 0);
            boolean f7 = rv4Var.f(i2);
            Object P3 = rv4Var.P();
            if (f7 || P3 == lh9Var) {
                P3 = new jc(i2, 16);
                rv4Var.o0(P3);
            }
            nq7 k = axe.k(kq7.a, (xt4) P3);
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, k);
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
            jce.x(rv4Var, Integer.valueOf(hashCode), qw1.g);
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            this.d.c(obj3, rv4Var, 0);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
