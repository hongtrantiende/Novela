package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qx  reason: default package */
/* loaded from: classes3.dex */
public final class qx extends aab implements pu4 {
    public /* synthetic */ int a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public /* synthetic */ boolean d;
    public /* synthetic */ boolean e;

    public qx(m42 m42Var) {
        super(6, m42Var);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = this.d;
        boolean z4 = this.e;
        hre.r(obj);
        return new g6c(i, z, z2, z3, z4);
    }

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((Boolean) obj3).booleanValue();
        boolean booleanValue3 = ((Boolean) obj4).booleanValue();
        boolean booleanValue4 = ((Boolean) obj5).booleanValue();
        qx qxVar = new qx((m42) obj6);
        qxVar.a = intValue;
        qxVar.b = booleanValue;
        qxVar.c = booleanValue2;
        qxVar.d = booleanValue3;
        qxVar.e = booleanValue4;
        return qxVar.invokeSuspend(pvc.a);
    }
}
