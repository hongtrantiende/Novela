package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lnd  reason: default package */
/* loaded from: classes.dex */
public final class lnd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ nnd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lnd(nnd nndVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = nndVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        nnd nndVar = this.c;
        switch (i) {
            case 0:
                return new lnd(nndVar, m42Var, 0);
            default:
                return new lnd(nndVar, m42Var, 1);
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
                return ((lnd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((lnd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object hndVar;
        int i = this.a;
        n82 n82Var = n82.a;
        nnd nndVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object a = nnd.a(nndVar, this);
                if (a == n82Var) {
                    return n82Var;
                }
                return a;
            default:
                int i3 = this.b;
                try {
                    if (i3 != 0) {
                        if (i3 == 1) {
                            hre.r(obj);
                        } else {
                            vs.k("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        hre.r(obj);
                        y26 y26Var = nndVar.m;
                        lnd lndVar = new lnd(nndVar, null, 0);
                        this.b = 1;
                        obj = z87.E(y26Var, lndVar, this);
                        if (obj == n82Var) {
                            return n82Var;
                        }
                    }
                    hndVar = (knd) obj;
                } catch (fnd e) {
                    hndVar = new jnd(e.a);
                } catch (CancellationException unused) {
                    hndVar = new hnd();
                } catch (Throwable th) {
                    r95.n().k(ond.a, "Unexpected error in WorkerWrapper", th);
                    hndVar = new hnd();
                }
                Object n = nndVar.h.n(new db4(1, hndVar, nndVar));
                n.getClass();
                return n;
        }
    }
}
