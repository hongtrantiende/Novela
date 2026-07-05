package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sq  reason: default package */
/* loaded from: classes.dex */
public final class sq extends fb6 implements lu4 {
    public final /* synthetic */ tu1 C;
    public final /* synthetic */ Object a;
    public final /* synthetic */ tkc b;
    public final /* synthetic */ gt8 c;
    public final /* synthetic */ xt4 d;
    public final /* synthetic */ er e;
    public final /* synthetic */ ora f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sq(Object obj, tkc tkcVar, gt8 gt8Var, xt4 xt4Var, er erVar, ora oraVar, tu1 tu1Var) {
        super(2);
        this.a = obj;
        this.b = tkcVar;
        this.c = gt8Var;
        this.d = xt4Var;
        this.e = erVar;
        this.f = oraVar;
        this.C = tu1Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        z22 z22Var;
        gt8 gt8Var;
        lz3 lz3Var;
        rv4 rv4Var = (rv4) obj;
        int intValue = ((Number) obj2).intValue();
        boolean z2 = false;
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(intValue & 1, z)) {
            tkc tkcVar = this.b;
            hm8 hm8Var = tkcVar.e;
            hm8 hm8Var2 = tkcVar.d;
            Object value = hm8Var.getValue();
            Object obj3 = this.a;
            boolean g = rv4Var.g(c16.i(obj3, value));
            Object P = rv4Var.P();
            xt4 xt4Var = this.d;
            lh9 lh9Var = ax1.a;
            er erVar = this.e;
            if (g || P == lh9Var) {
                if (c16.i(obj3, hm8Var.getValue()) && (gt8Var = this.c) != null) {
                    z22Var = (z22) xt4Var.invoke(gt8Var);
                } else {
                    z22Var = (z22) xt4Var.invoke(erVar);
                }
                P = z22Var;
                rv4Var.o0(P);
            }
            z22 z22Var2 = (z22) P;
            boolean g2 = rv4Var.g(c16.i(tkcVar.f().f(), obj3));
            Object P2 = rv4Var.P();
            if (g2 || P2 == lh9Var) {
                if (c16.i(tkcVar.f().f(), obj3)) {
                    lz3Var = lz3.b;
                } else {
                    lz3Var = ((z22) xt4Var.invoke(erVar)).b;
                }
                P2 = lz3Var;
                rv4Var.o0(P2);
            }
            lz3 lz3Var2 = (lz3) P2;
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new yq(c16.i(obj3, hm8Var2.getValue()));
                rv4Var.o0(P3);
            }
            yq yqVar = (yq) P3;
            eu3 eu3Var = z22Var2.a;
            boolean h = rv4Var.h(z22Var2);
            Object P4 = rv4Var.P();
            if (h || P4 == lh9Var) {
                P4 = new oha(z22Var2, 1);
                rv4Var.o0(P4);
            }
            nq7 f = sze.f(kq7.a, (mu4) P4);
            yqVar.a.setValue(Boolean.valueOf(c16.i(obj3, hm8Var2.getValue())));
            if (c16.i(obj3, hm8Var.getValue()) && !c16.i(obj3, hm8Var2.getValue()) && !c16.i(obj3, tkcVar.a.z())) {
                z2 = true;
            }
            yqVar.b.setValue(Boolean.valueOf(z2));
            nq7 a0 = f.a0(yqVar);
            boolean h2 = rv4Var.h(obj3);
            Object P5 = rv4Var.P();
            if (h2 || P5 == lh9Var) {
                P5 = new jc(obj3, 6);
                rv4Var.o0(P5);
            }
            xt4 xt4Var2 = (xt4) P5;
            boolean f2 = rv4Var.f(lz3Var2);
            Object P6 = rv4Var.P();
            if (f2 || P6 == lh9Var) {
                P6 = new y0(lz3Var2, 4);
                rv4Var.o0(P6);
            }
            rte.a(tkcVar, xt4Var2, a0, eu3Var, lz3Var2, (lu4) P6, jce.E(1831990167, new rq(this.f, obj3, erVar, this.C, 0), rv4Var), rv4Var, 100663296);
        } else {
            rv4Var.X();
        }
        return pvc.a;
    }
}
