package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r0  reason: default package */
/* loaded from: classes.dex */
public final class r0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ t0 c;
    public final /* synthetic */ l59 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(t0 t0Var, l59 l59Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = t0Var;
        this.d = l59Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        l59 l59Var = this.d;
        t0 t0Var = this.c;
        switch (i) {
            case 0:
                return new r0(t0Var, l59Var, m42Var, 0);
            case 1:
                return new r0(t0Var, l59Var, m42Var, 1);
            case 2:
                return new r0(t0Var, l59Var, m42Var, 2);
            default:
                return new r0(t0Var, l59Var, m42Var, 3);
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
                return ((r0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((r0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((r0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((r0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        l59 l59Var = this.d;
        t0 t0Var = this.c;
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
                yu7 yu7Var = t0Var.M;
                if (yu7Var != null) {
                    k59 k59Var = new k59(l59Var);
                    this.b = 1;
                    if (yu7Var.b(k59Var, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
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
                yu7 yu7Var2 = t0Var.M;
                if (yu7Var2 != null) {
                    k59 k59Var2 = new k59(l59Var);
                    this.b = 1;
                    if (yu7Var2.b(k59Var2, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
            case 2:
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
                yu7 yu7Var3 = t0Var.M;
                if (yu7Var3 != null) {
                    this.b = 1;
                    if (yu7Var3.b(l59Var, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
            default:
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
                yu7 yu7Var4 = t0Var.M;
                if (yu7Var4 != null) {
                    m59 m59Var = new m59(l59Var);
                    this.b = 1;
                    if (yu7Var4.b(m59Var, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
