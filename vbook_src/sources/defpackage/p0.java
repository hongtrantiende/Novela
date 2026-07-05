package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p0  reason: default package */
/* loaded from: classes.dex */
public final class p0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yu7 c;
    public final /* synthetic */ l59 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(l59 l59Var, yu7 yu7Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.d = l59Var;
        this.c = yu7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        l59 l59Var = this.d;
        yu7 yu7Var = this.c;
        switch (i) {
            case 0:
                return new p0(l59Var, yu7Var, m42Var);
            case 1:
                return new p0(yu7Var, l59Var, m42Var, 1);
            default:
                return new p0(yu7Var, l59Var, m42Var, 2);
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
                return ((p0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((p0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((p0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        l59 l59Var = this.d;
        yu7 yu7Var = this.c;
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
                m59 m59Var = new m59(l59Var);
                this.b = 1;
                if (yu7Var.b(m59Var, this) == n82Var) {
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
                this.b = 1;
                if (yu7Var.b(l59Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                this.b = 1;
                if (yu7Var.b(l59Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p0(yu7 yu7Var, l59 l59Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = yu7Var;
        this.d = l59Var;
    }
}
