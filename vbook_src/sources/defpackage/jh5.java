package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jh5  reason: default package */
/* loaded from: classes3.dex */
public final class jh5 extends aab implements lu4 {
    public int a;
    public /* synthetic */ long b;

    /* JADX WARN: Type inference failed for: r1v1, types: [aab, jh5, m42] */
    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        ?? aabVar = new aab(2, m42Var);
        aabVar.b = ((Number) obj).longValue();
        return aabVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((jh5) create(Long.valueOf(((Number) obj).longValue()), (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        long j = this.b;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            this.b = j;
            this.a = 1;
            Object q = ade.q(j, this);
            n82 n82Var = n82.a;
            if (q == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
