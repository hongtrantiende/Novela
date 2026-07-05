package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s6c  reason: default package */
/* loaded from: classes3.dex */
public final class s6c extends aab implements ou4 {
    public /* synthetic */ String a;
    public /* synthetic */ int b;
    public /* synthetic */ String c;
    public /* synthetic */ float d;
    public final /* synthetic */ w6c e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6c(w6c w6cVar, m42 m42Var) {
        super(5, m42Var);
        this.e = w6cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        int i = this.b;
        String str2 = this.c;
        float f = this.d;
        hre.r(obj);
        cza czaVar = this.e.d;
        if (czaVar != null) {
            while (true) {
                Object value = czaVar.getValue();
                float f2 = f;
                if (czaVar.l(value, p6c.a((p6c) value, null, null, null, null, 0, false, false, false, false, 0, nae.e, str, i, str2, f2, 4095))) {
                    break;
                }
                f = f2;
            }
        }
        return pvc.a;
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int intValue = ((Number) obj2).intValue();
        float floatValue = ((Number) obj4).floatValue();
        s6c s6cVar = new s6c(this.e, (m42) obj5);
        s6cVar.a = (String) obj;
        s6cVar.b = intValue;
        s6cVar.c = (String) obj3;
        s6cVar.d = floatValue;
        pvc pvcVar = pvc.a;
        s6cVar.invokeSuspend(pvcVar);
        return pvcVar;
    }
}
