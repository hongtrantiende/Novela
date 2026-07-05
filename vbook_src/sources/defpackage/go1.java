package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: go1  reason: default package */
/* loaded from: classes.dex */
public final class go1 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ io1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ go1(io1 io1Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = io1Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        io1 io1Var = this.c;
        switch (i) {
            case 0:
                return new go1(io1Var, m42Var, 0);
            case 1:
                return new go1(io1Var, m42Var, 1);
            case 2:
                return new go1(io1Var, m42Var, 2);
            case 3:
                return new go1(io1Var, m42Var, 3);
            default:
                return new go1(io1Var, m42Var, 4);
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
                return ((go1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((go1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((go1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((go1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((go1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        io1 io1Var = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    long b = ((ucd) nye.q(io1Var, dy1.t)).b();
                    this.b = 1;
                    if (ade.q(b, this) == n82Var) {
                        return n82Var;
                    }
                }
                vt4 vt4Var = io1Var.g0;
                if (vt4Var != null) {
                    vt4Var.invoke();
                }
                if (io1Var.i0) {
                    ((dx8) ((s35) nye.q(io1Var, dy1.l))).a(0);
                }
                io1Var.p0 = true;
                iya iyaVar = io1Var.n0;
                if (iyaVar != null) {
                    iyaVar.cancel(null);
                }
                io1Var.n0 = null;
                io1Var.m0 = null;
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    long b2 = ((ucd) nye.q(io1Var, dy1.t)).b();
                    this.b = 1;
                    if (ade.q(b2, this) == n82Var) {
                        return n82Var;
                    }
                }
                vt4 vt4Var2 = io1Var.g0;
                if (vt4Var2 != null) {
                    vt4Var2.invoke();
                }
                if (io1Var.i0) {
                    ((dx8) ((s35) nye.q(io1Var, dy1.l))).a(0);
                }
                io1Var.w0 = true;
                iya iyaVar2 = io1Var.u0;
                if (iyaVar2 != null) {
                    iyaVar2.cancel(null);
                }
                io1Var.u0 = null;
                io1Var.t0 = null;
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    long a = ((ucd) nye.q(io1Var, dy1.t)).a();
                    this.b = 1;
                    if (ade.q(a, this) == n82Var) {
                        return n82Var;
                    }
                }
                io1Var.S.invoke();
                io1Var.n0 = null;
                return pvcVar;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    long a2 = ((ucd) nye.q(io1Var, dy1.t)).a();
                    this.b = 1;
                    if (ade.q(a2, this) == n82Var) {
                        return n82Var;
                    }
                }
                io1Var.S.invoke();
                io1Var.u0 = null;
                return pvcVar;
            default:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    long b3 = ((ucd) nye.q(io1Var, dy1.t)).b();
                    this.b = 1;
                    if (ade.q(b3, this) == n82Var) {
                        return n82Var;
                    }
                }
                vt4 vt4Var3 = io1Var.g0;
                if (vt4Var3 != null) {
                    vt4Var3.invoke();
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
