package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n5d  reason: default package */
/* loaded from: classes3.dex */
public final class n5d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ o5d c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5d(o5d o5dVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = o5dVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        o5d o5dVar = this.c;
        switch (i) {
            case 0:
                return new n5d(o5dVar, m42Var, 0);
            default:
                return new n5d(o5dVar, m42Var, 1);
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
                return ((n5d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((n5d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        jw7 jw7Var = jw7.c;
        o5d o5dVar = this.c;
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
                kj6 kj6Var = o5dVar.b;
                this.b = 1;
                if (jxe.q(kj6Var, jw7Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                kj6 kj6Var2 = o5dVar.b;
                q4c q4cVar = new q4c(o5dVar, (m42) null, 18);
                this.b = 1;
                if (kj6Var2.e(jw7Var, q4cVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
