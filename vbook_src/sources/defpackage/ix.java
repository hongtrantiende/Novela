package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ix  reason: default package */
/* loaded from: classes3.dex */
public final class ix extends aab implements nu4 {
    public /* synthetic */ int a;
    public /* synthetic */ String b;
    public /* synthetic */ float c;

    /* JADX WARN: Type inference failed for: r4v2, types: [aab, ix] */
    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        float floatValue = ((Number) obj3).floatValue();
        ?? aabVar = new aab(4, (m42) obj4);
        aabVar.a = intValue;
        aabVar.b = (String) obj2;
        aabVar.c = floatValue;
        return aabVar.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.b;
        float f = this.c;
        hre.r(obj);
        return new z5c(i, str, f);
    }
}
