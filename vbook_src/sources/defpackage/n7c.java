package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n7c  reason: default package */
/* loaded from: classes.dex */
public final class n7c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ o7c c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n7c(o7c o7cVar, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = o7cVar;
        this.d = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        float f = this.d;
        o7c o7cVar = this.c;
        switch (i) {
            case 0:
                return new n7c(o7cVar, f, m42Var, 0);
            default:
                return new n7c(o7cVar, f, m42Var, 1);
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
                return ((n7c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((n7c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        xr xrVar;
        Object c;
        xr xrVar2;
        Object c2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.d;
        n82 n82Var = n82.a;
        o7c o7cVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        c = obj;
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar = o7cVar.P;
                    if (lqVar != null) {
                        Float f2 = new Float(f);
                        if (o7cVar.N) {
                            xrVar = pab.f;
                        } else {
                            xrVar = o7cVar.M;
                        }
                        this.b = 1;
                        c = lq.c(lqVar, f2, xrVar, null, null, this, 12);
                        if (c == n82Var) {
                            return n82Var;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                vr vrVar = (vr) c;
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        c2 = obj;
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar2 = o7cVar.O;
                    if (lqVar2 != null) {
                        Float f3 = new Float(f);
                        if (o7cVar.N) {
                            xrVar2 = pab.f;
                        } else {
                            xrVar2 = o7cVar.M;
                        }
                        this.b = 1;
                        c2 = lq.c(lqVar2, f3, xrVar2, null, null, this, 12);
                        if (c2 == n82Var) {
                            return n82Var;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                vr vrVar2 = (vr) c2;
                return pvcVar;
        }
    }
}
