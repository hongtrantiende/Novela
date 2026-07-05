package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iob  reason: default package */
/* loaded from: classes3.dex */
public final class iob extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ nnb c;
    public final /* synthetic */ h2a d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iob(h2a h2aVar, nnb nnbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = h2aVar;
        this.c = nnbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        nnb nnbVar = this.c;
        h2a h2aVar = this.d;
        switch (i) {
            case 0:
                return new iob(h2aVar, nnbVar, m42Var, 0);
            case 1:
                return new iob(nnbVar, h2aVar, m42Var, 1);
            case 2:
                return new iob(nnbVar, h2aVar, m42Var, 2);
            default:
                return new iob(h2aVar, nnbVar, m42Var, 3);
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
                return ((iob) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((iob) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((iob) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((iob) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        nnb nnbVar = this.c;
        h2a h2aVar = this.d;
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
                boolean z = nnbVar.A;
                this.b = 1;
                if (h2aVar.m(z, null) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1 && i3 != 2) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    return pvcVar;
                }
                hre.r(obj);
                boolean z2 = nnbVar.y;
                boolean z3 = nnbVar.A;
                if (z2) {
                    this.b = 1;
                    if (h2aVar.l(z3, null) != n82Var) {
                        return pvcVar;
                    }
                } else {
                    this.b = 2;
                    if (h2aVar.m(z3, null) != n82Var) {
                        return pvcVar;
                    }
                }
                return n82Var;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1 && i4 != 2) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    return pvcVar;
                }
                hre.r(obj);
                boolean z4 = nnbVar.y;
                boolean z5 = nnbVar.A;
                if (z4) {
                    this.b = 1;
                    if (h2aVar.m(z5, null) != n82Var) {
                        return pvcVar;
                    }
                } else {
                    this.b = 2;
                    if (h2aVar.l(z5, null) != n82Var) {
                        return pvcVar;
                    }
                }
                return n82Var;
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
                boolean z6 = nnbVar.A;
                this.b = 1;
                if (h2aVar.l(z6, null) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iob(nnb nnbVar, h2a h2aVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = nnbVar;
        this.d = h2aVar;
    }
}
