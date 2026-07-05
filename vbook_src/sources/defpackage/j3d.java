package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j3d  reason: default package */
/* loaded from: classes3.dex */
public final class j3d extends aab implements mu4 {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public final /* synthetic */ xt4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3d(xt4 xt4Var, m42 m42Var) {
        super(3, m42Var);
        this.c = xt4Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        j3d j3dVar = new j3d(this.c, (m42) obj3);
        j3dVar.a = intValue;
        j3dVar.b = intValue2;
        pvc pvcVar = pvc.a;
        j3dVar.invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.b;
        hre.r(obj);
        this.c.invoke(new r24(q24.c, i, i2));
        return pvc.a;
    }
}
