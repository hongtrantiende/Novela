package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ija  reason: default package */
/* loaded from: classes3.dex */
public final class ija extends aab implements pu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ija(int i, m42 m42Var) {
        super(6, m42Var);
        this.a = i;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                Object obj4 = this.d;
                Object obj5 = this.e;
                Object obj6 = this.f;
                hre.r(obj);
                return new Object[]{obj2, obj3, obj4, obj5, obj6};
            default:
                Object obj7 = this.b;
                Object obj8 = this.c;
                Object obj9 = this.d;
                Object obj10 = this.e;
                Object obj11 = this.f;
                hre.r(obj);
                return new Object[]{obj7, obj8, obj9, obj10, obj11};
        }
    }

    @Override // defpackage.pu4
    public final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj6;
        switch (i) {
            case 0:
                ija ijaVar = new ija(0, m42Var);
                ijaVar.b = obj;
                ijaVar.c = obj2;
                ijaVar.d = obj3;
                ijaVar.e = obj4;
                ijaVar.f = obj5;
                return ijaVar.invokeSuspend(pvcVar);
            default:
                ija ijaVar2 = new ija(1, m42Var);
                ijaVar2.b = obj;
                ijaVar2.c = obj2;
                ijaVar2.d = obj3;
                ijaVar2.e = obj4;
                ijaVar2.f = obj5;
                return ijaVar2.invokeSuspend(pvcVar);
        }
    }
}
