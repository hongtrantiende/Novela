package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t2  reason: default package */
/* loaded from: classes3.dex */
public final class t2 extends aab implements mu4 {
    public /* synthetic */ r57 a;
    public /* synthetic */ long b;

    /* JADX WARN: Type inference failed for: r2v1, types: [aab, t2] */
    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        ?? aabVar = new aab(3, (m42) obj3);
        aabVar.a = (r57) obj;
        aabVar.b = longValue;
        return aabVar.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        r57 r57Var = this.a;
        long j = this.b;
        hre.r(obj);
        long j2 = r57Var.b;
        if (j2 == 0) {
            return new Float((float) nae.e);
        }
        return new Float(dce.m(((float) j) / ((float) j2), nae.e, 1.0f));
    }
}
