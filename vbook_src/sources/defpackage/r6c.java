package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r6c  reason: default package */
/* loaded from: classes3.dex */
public final class r6c extends aab implements pu4 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ int d;
    public /* synthetic */ float e;
    public final /* synthetic */ w6c f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r6c(w6c w6cVar, m42 m42Var) {
        super(6, m42Var);
        this.f = w6cVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        boolean z = this.a;
        boolean z2 = this.b;
        boolean z3 = this.c;
        int i = this.d;
        float f = this.e;
        hre.r(obj);
        cza czaVar = this.f.d;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, p6c.a((p6c) value, null, null, null, null, 0, false, z, z2, z3, i, f, null, 0, null, nae.e, 63551)));
            return pvc.a;
        }
        return pvc.a;
    }

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        int intValue = ((Number) obj4).intValue();
        float floatValue = ((Number) obj5).floatValue();
        r6c r6cVar = new r6c(this.f, (m42) obj6);
        r6cVar.a = booleanValue;
        r6cVar.b = booleanValue2;
        r6cVar.c = booleanValue3;
        r6cVar.d = intValue;
        r6cVar.e = floatValue;
        pvc pvcVar = pvc.a;
        r6cVar.invokeSuspend(pvcVar);
        return pvcVar;
    }
}
