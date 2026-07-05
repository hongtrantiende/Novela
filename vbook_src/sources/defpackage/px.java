package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: px  reason: default package */
/* loaded from: classes3.dex */
public final class px extends aab implements pu4 {
    public /* synthetic */ int a;
    public /* synthetic */ double b;
    public /* synthetic */ float c;
    public /* synthetic */ float d;
    public /* synthetic */ eo4 e;

    public px(m42 m42Var) {
        super(6, m42Var);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        double d = this.b;
        float f = this.c;
        float f2 = this.d;
        eo4 eo4Var = this.e;
        hre.r(obj);
        return new f6c(i, d, f, f2, eo4Var);
    }

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int intValue = ((Number) obj).intValue();
        double doubleValue = ((Number) obj2).doubleValue();
        float floatValue = ((Number) obj3).floatValue();
        float floatValue2 = ((Number) obj4).floatValue();
        px pxVar = new px((m42) obj6);
        pxVar.a = intValue;
        pxVar.b = doubleValue;
        pxVar.c = floatValue;
        pxVar.d = floatValue2;
        pxVar.e = (eo4) obj5;
        return pxVar.invokeSuspend(pvc.a);
    }
}
