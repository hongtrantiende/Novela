package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jvc  reason: default package */
/* loaded from: classes.dex */
public final class jvc extends aab implements nu4 {
    public int a;
    public /* synthetic */ Throwable b;
    public /* synthetic */ long c;

    /* JADX WARN: Type inference failed for: r4v2, types: [aab, jvc] */
    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        tj4 tj4Var = (tj4) obj;
        long longValue = ((Number) obj3).longValue();
        ?? aabVar = new aab(4, (m42) obj4);
        aabVar.b = (Throwable) obj2;
        aabVar.c = longValue;
        return aabVar.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
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
            Throwable th = this.b;
            long j = this.c;
            r95.n().k(kvc.a, "Cannot check for unfinished work", th);
            long min = Math.min(j * 30000, kvc.b);
            this.a = 1;
            Object q = ade.q(min, this);
            n82 n82Var = n82.a;
            if (q == n82Var) {
                return n82Var;
            }
        }
        return Boolean.TRUE;
    }
}
