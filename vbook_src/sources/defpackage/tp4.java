package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tp4  reason: default package */
/* loaded from: classes3.dex */
public final class tp4 extends aab implements nu4 {
    public /* synthetic */ String a;
    public /* synthetic */ float b;
    public /* synthetic */ float c;
    public final /* synthetic */ vp4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tp4(vp4 vp4Var, m42 m42Var) {
        super(4, m42Var);
        this.d = vp4Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        float floatValue = ((Number) obj2).floatValue();
        float floatValue2 = ((Number) obj3).floatValue();
        tp4 tp4Var = new tp4(this.d, (m42) obj4);
        tp4Var.a = (String) obj;
        tp4Var.b = floatValue;
        tp4Var.c = floatValue2;
        pvc pvcVar = pvc.a;
        tp4Var.invokeSuspend(pvcVar);
        return pvcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object value;
        String str = this.a;
        float f = this.b;
        float f2 = this.c;
        hre.r(obj);
        cza czaVar = this.d.e;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, sp4.a((sp4) value, str, f, f2, null, 17)));
            return pvc.a;
        }
        return pvc.a;
    }
}
