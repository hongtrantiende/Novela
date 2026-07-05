package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j91  reason: default package */
/* loaded from: classes3.dex */
public final class j91 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ tj4 c;
    public /* synthetic */ Throwable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j91(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        tj4 tj4Var = (tj4) obj;
        Throwable th = (Throwable) obj2;
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                j91 j91Var = new j91(3, 0, m42Var);
                j91Var.c = tj4Var;
                j91Var.d = th;
                return j91Var.invokeSuspend(pvcVar);
            default:
                j91 j91Var2 = new j91(3, 1, m42Var);
                j91Var2.c = tj4Var;
                j91Var2.d = th;
                return j91Var2.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                tj4 tj4Var = this.c;
                Throwable th = this.d;
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
                if (!(th instanceof CancellationException)) {
                    String message = th.getMessage();
                    if (message == null) {
                        message = "Cbz export failed";
                    }
                    z24 z24Var = z24.c;
                    b34 b34Var = new b34(y24.D, 0, 0, z24Var, message, 38);
                    this.c = null;
                    this.d = null;
                    this.b = 1;
                    if (tj4Var.b(b34Var, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                throw th;
            default:
                tj4 tj4Var2 = this.c;
                Throwable th2 = this.d;
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
                if (!(th2 instanceof CancellationException)) {
                    th2.printStackTrace();
                    this.c = null;
                    this.d = null;
                    this.b = 1;
                    if (tj4Var2.b(null, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                throw th2;
        }
    }
}
