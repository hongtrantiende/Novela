package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gmc  reason: default package */
/* loaded from: classes3.dex */
public final class gmc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rmc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gmc(rmc rmcVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = rmcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        rmc rmcVar = this.c;
        switch (i) {
            case 0:
                return new gmc(rmcVar, m42Var, 0);
            case 1:
                return new gmc(rmcVar, m42Var, 1);
            case 2:
                return new gmc(rmcVar, m42Var, 2);
            case 3:
                return new gmc(rmcVar, m42Var, 3);
            default:
                return new gmc(rmcVar, m42Var, 4);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((gmc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((gmc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((gmc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((gmc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((gmc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        rmc rmcVar = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                mx mxVar = new mx(rmcVar.J, 4);
                mx mxVar2 = new mx(rmcVar.H, 4);
                plc plcVar = (plc) rmcVar.c;
                ja y = z1d.y(mxVar, mxVar2, z1d.x(new mx(plcVar.g, 4), new mx(plcVar.h, 4), new mx(plcVar.i, 4), new mx(plcVar.j, 4), new mlc(5, 1, null)), new x81(rmcVar, null));
                this.b = 1;
                if (z1d.u(y, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                ja w = z1d.w(rmcVar.f, new mx(rmcVar.J, 4), new mx(rmcVar.K, 4), new mx(rmcVar.L, 4), new mx(rmcVar.M, 4), new hmc(rmcVar, null));
                this.b = 1;
                if (z1d.u(w, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                klc klcVar = rmcVar.c;
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                plc plcVar2 = (plc) klcVar;
                sj4 A = z1d.A(z1d.x(((plc) klcVar).c(), ((plc) klcVar).d(), new mx(rmcVar.H, 4), z1d.x(new mx(plcVar2.g, 4), new mx(plcVar2.h, 4), new mx(plcVar2.i, 4), new mx(plcVar2.j, 4), new mlc(5, 1, null)), new imc(rmcVar, null)));
                kmc kmcVar = new kmc(rmcVar, 0);
                this.b = 1;
                if (A.a(kmcVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                sj4 A2 = z1d.A(new g8c(new sj4[]{new mx(rmcVar.J, 4), new mx(rmcVar.K, 4), new mx(rmcVar.I, 4), new mx(rmcVar.L, 4), new mx(rmcVar.M, 4)}, 1));
                kmc kmcVar2 = new kmc(rmcVar, 1);
                this.b = 1;
                if (A2.a(kmcVar2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                cza czaVar = rmcVar.O;
                kmc kmcVar3 = new kmc(rmcVar, 2);
                this.b = 1;
                czaVar.a(kmcVar3, this);
                return n82Var;
        }
    }
}
