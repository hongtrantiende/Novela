package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wi7  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class wi7 implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ aw7 c;

    public /* synthetic */ wi7(String str, aw7 aw7Var, int i) {
        this.a = i;
        this.b = str;
        this.c = aw7Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        ez ezVar = lz.c;
        kq7 kq7Var = kq7.a;
        aw7 aw7Var = this.c;
        String str = this.b;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    nq7 f = pna.f(kq7Var, 1.0f);
                    xn1 a = wn1.a(ezVar, kh5.I, rv4Var, 0);
                    int hashCode = Long.hashCode(rv4Var.T);
                    xt8 l = rv4Var.l();
                    nq7 p = lye.p(rv4Var, f);
                    rw1.k.getClass();
                    zx1 zx1Var = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a);
                    jce.F(qw1.e, rv4Var, l);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p);
                    int ordinal = ((ox5) aw7Var.getValue()).b.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    throw rs8.b(-1498777822, rv4Var, false);
                                }
                            } else {
                                rv4Var.e0(-1498771205);
                                yae.b(yqe.A((y3b) x2b.w.getValue(), rv4Var), str, rv4Var, 0);
                                rv4Var.q(false);
                            }
                        }
                        rv4Var.e0(782958831);
                        l54 l54Var = ((ox5) aw7Var.getValue()).c;
                        if (l54Var != null) {
                            rv4Var.e0(783030162);
                            yae.a(l54Var, rv4Var, 0);
                            rv4Var.q(false);
                        } else {
                            rv4Var.e0(783116838);
                            yae.b(yqe.A((y3b) x2b.v.getValue(), rv4Var), str, rv4Var, 0);
                            rv4Var.q(false);
                        }
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(-1498776544);
                        yae.c(yqe.A((y3b) x2b.x.getValue(), rv4Var), rv4Var, 0);
                        rv4Var.q(false);
                    }
                    rs8.u(rv4Var, true, kq7Var, 8.0f, rv4Var);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (rv4Var.U(intValue & 1, z2)) {
                    nq7 f2 = pna.f(kq7Var, 1.0f);
                    xn1 a2 = wn1.a(ezVar, kh5.I, rv4Var, 0);
                    int hashCode2 = Long.hashCode(rv4Var.T);
                    xt8 l2 = rv4Var.l();
                    nq7 p2 = lye.p(rv4Var, f2);
                    rw1.k.getClass();
                    zx1 zx1Var2 = qw1.b;
                    rv4Var.i0();
                    if (rv4Var.S) {
                        rv4Var.k(zx1Var2);
                    } else {
                        rv4Var.r0();
                    }
                    jce.F(qw1.f, rv4Var, a2);
                    jce.F(qw1.e, rv4Var, l2);
                    jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode2));
                    jce.C(qw1.h, rv4Var);
                    jce.F(qw1.d, rv4Var, p2);
                    int ordinal2 = ((sx5) aw7Var.getValue()).b.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    throw rs8.b(905810750, rv4Var, false);
                                }
                            } else {
                                rv4Var.e0(905817590);
                                yae.b(yqe.A((y3b) x2b.C.getValue(), rv4Var), str, rv4Var, 0);
                                rv4Var.q(false);
                            }
                        }
                        rv4Var.e0(-1984212531);
                        bbe.k(((sx5) aw7Var.getValue()).c, rv4Var, 0);
                        rv4Var.q(false);
                    } else {
                        rv4Var.e0(905812347);
                        yae.c(yqe.A((y3b) x2b.D.getValue(), rv4Var), rv4Var, 0);
                        rv4Var.q(false);
                    }
                    rs8.u(rv4Var, true, kq7Var, 8.0f, rv4Var);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
        }
    }
}
