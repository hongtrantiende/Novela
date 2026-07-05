package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w00  reason: default package */
/* loaded from: classes3.dex */
public final class w00 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ xt4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w00(int i, m42 m42Var, xt4 xt4Var) {
        super(2, m42Var);
        this.a = i;
        this.c = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        xt4 xt4Var = this.c;
        switch (i) {
            case 0:
                return new w00(0, m42Var, xt4Var);
            case 1:
                return new w00(1, m42Var, xt4Var);
            case 2:
                return new w00(2, m42Var, xt4Var);
            case 3:
                return new w00(3, m42Var, xt4Var);
            case 4:
                return new w00(4, m42Var, xt4Var);
            default:
                return new w00(5, m42Var, xt4Var);
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
                return ((w00) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((w00) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((w00) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((w00) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((w00) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((w00) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        xt4 xt4Var = this.c;
        n82 n82Var = n82.a;
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
                Object invoke = xt4Var.invoke(this);
                if (invoke == n82Var) {
                    return n82Var;
                }
                return invoke;
            case 1:
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
                        this.b = 1;
                        obj = xt4Var.invoke(this);
                        if (obj == n82Var) {
                            obj = n82Var;
                        }
                    }
                    return obj;
                } catch (Throwable th) {
                    if (!(th instanceof CancellationException)) {
                        if (((Boolean) z00.b.getValue()).booleanValue()) {
                            ow6 ow6Var = z00.a;
                            lw6 lw6Var = lw6.ERROR;
                            lw6 lw6Var2 = ow6Var.b;
                            if (lw6Var2 == null && (lw6Var2 = ow6.e) == null) {
                                lw6Var2 = lw6.WARN;
                            }
                            if (2 <= lw6Var2.a) {
                                ow6Var.a(lw6Var, "CoroutineScope._async.catch:");
                            }
                            th.printStackTrace();
                        }
                        throw th;
                    }
                    throw th;
                }
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object invoke2 = xt4Var.invoke(this);
                if (invoke2 == n82Var) {
                    return n82Var;
                }
                return invoke2;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object invoke3 = xt4Var.invoke(this);
                if (invoke3 == n82Var) {
                    return n82Var;
                }
                return invoke3;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (xt4Var.invoke(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (xt4Var.invoke(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
