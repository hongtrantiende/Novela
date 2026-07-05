package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zu5  reason: default package */
/* loaded from: classes3.dex */
public final class zu5 extends aab implements lu4 {
    public /* synthetic */ float a;

    /* JADX WARN: Type inference failed for: r1v1, types: [aab, m42, zu5] */
    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        ?? aabVar = new aab(2, m42Var);
        aabVar.a = ((Number) obj).floatValue();
        return aabVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((zu5) create(Float.valueOf(((Number) obj).floatValue()), (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        hre.r(obj);
        if (this.a > nae.e) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
