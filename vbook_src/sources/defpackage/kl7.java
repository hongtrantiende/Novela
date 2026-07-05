package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kl7  reason: default package */
/* loaded from: classes3.dex */
public final class kl7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public kb b;
    public int c;
    public final /* synthetic */ kb d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kl7(int i, kb kbVar, m42 m42Var) {
        super(2, m42Var);
        this.a = i;
        this.d = kbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new kl7(0, this.d, m42Var);
            case 1:
                return new kl7(1, this.d, m42Var);
            default:
                return new kl7(2, this.d, m42Var);
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
                return ((kl7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((kl7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((kl7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        kb kbVar = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kbVar = this.b;
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = kbVar;
                    this.c = 1;
                    obj = yqe.u((y3b) s2b.F.getValue(), this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                kb.b(kbVar, (String) obj);
                return pvcVar;
            case 1:
                int i3 = this.c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        kbVar = this.b;
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = kbVar;
                    this.c = 1;
                    obj = yqe.u((y3b) o2b.P.getValue(), this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                kb.c(kbVar, (String) obj);
                return pvcVar;
            default:
                int i4 = this.c;
                if (i4 != 0) {
                    if (i4 == 1) {
                        kbVar = this.b;
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = kbVar;
                    this.c = 1;
                    obj = yqe.u((y3b) f3b.f.getValue(), this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                kb.a(kbVar, (String) obj);
                return pvcVar;
        }
    }
}
