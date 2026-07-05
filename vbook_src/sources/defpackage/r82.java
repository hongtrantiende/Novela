package defpackage;

import androidx.work.CoroutineWorker;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r82  reason: default package */
/* loaded from: classes.dex */
public final class r82 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ CoroutineWorker c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r82(CoroutineWorker coroutineWorker, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = coroutineWorker;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        CoroutineWorker coroutineWorker = this.c;
        switch (i) {
            case 0:
                return new r82(coroutineWorker, m42Var, 0);
            default:
                return new r82(coroutineWorker, m42Var, 1);
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
                ((r82) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                return ((r82) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                int i = this.b;
                if (i != 0) {
                    if (i == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                } else {
                    hre.r(obj);
                    this.b = 1;
                    vs.k("Not implemented");
                }
                return null;
            default:
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
                Object c = this.c.c(this);
                n82 n82Var = n82.a;
                if (c == n82Var) {
                    return n82Var;
                }
                return c;
        }
    }
}
