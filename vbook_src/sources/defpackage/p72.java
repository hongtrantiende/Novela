package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p72  reason: default package */
/* loaded from: classes.dex */
public final class p72 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ d19 c;
    public final /* synthetic */ npb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p72(d19 d19Var, npb npbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = d19Var;
        this.d = npbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new p72(this.c, this.d, m42Var, 0);
            case 1:
                return new p72(this.c, this.d, m42Var, 1);
            default:
                return new p72(this.c, this.d, m42Var, 2);
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
                return ((p72) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((p72) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((p72) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        d19 d19Var = this.c;
        final npb npbVar = this.d;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
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
                    this.b = 1;
                    if (uwe.k(d19Var, npbVar, this) == n82Var) {
                        return n82Var;
                    }
                }
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
                    this.b = 1;
                    Object h = yae.h(d19Var, new d(npbVar, null, 3), this);
                    if (h != n82Var) {
                        h = pvcVar;
                    }
                    if (h == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
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
                    this.b = 1;
                    Object h2 = mi3.h(this.c, new fy6(npbVar, 0), new vt4() { // from class: gy6
                        @Override // defpackage.vt4
                        public final Object invoke() {
                            int i5 = r2;
                            pvc pvcVar2 = pvc.a;
                            npb npbVar2 = npbVar;
                            switch (i5) {
                                case 0:
                                    npbVar2.b();
                                    return pvcVar2;
                                default:
                                    npbVar2.onCancel();
                                    return pvcVar2;
                            }
                        }
                    }, new vt4() { // from class: gy6
                        @Override // defpackage.vt4
                        public final Object invoke() {
                            int i5 = r2;
                            pvc pvcVar2 = pvc.a;
                            npb npbVar2 = npbVar;
                            switch (i5) {
                                case 0:
                                    npbVar2.b();
                                    return pvcVar2;
                                default:
                                    npbVar2.onCancel();
                                    return pvcVar2;
                            }
                        }
                    }, new sj(npbVar, 25), this);
                    if (h2 != n82Var) {
                        h2 = pvcVar;
                    }
                    if (h2 == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
