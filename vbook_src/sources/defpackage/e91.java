package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e91  reason: default package */
/* loaded from: classes3.dex */
public final class e91 extends aab implements nu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e91(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj4;
        switch (i) {
            case 0:
                e91 e91Var = new e91(4, 0, m42Var);
                e91Var.b = obj;
                e91Var.c = obj2;
                e91Var.d = obj3;
                return e91Var.invokeSuspend(pvcVar);
            case 1:
                e91 e91Var2 = new e91(4, 1, m42Var);
                e91Var2.b = obj;
                e91Var2.c = obj2;
                e91Var2.d = obj3;
                return e91Var2.invokeSuspend(pvcVar);
            case 2:
                e91 e91Var3 = new e91(4, 2, m42Var);
                e91Var3.b = obj;
                e91Var3.c = obj2;
                e91Var3.d = obj3;
                return e91Var3.invokeSuspend(pvcVar);
            case 3:
                e91 e91Var4 = new e91(4, 3, m42Var);
                e91Var4.b = obj;
                e91Var4.c = obj2;
                e91Var4.d = obj3;
                return e91Var4.invokeSuspend(pvcVar);
            case 4:
                e91 e91Var5 = new e91(4, 4, m42Var);
                e91Var5.b = obj;
                e91Var5.c = obj2;
                e91Var5.d = obj3;
                return e91Var5.invokeSuspend(pvcVar);
            default:
                e91 e91Var6 = new e91(4, 5, m42Var);
                e91Var6.b = obj;
                e91Var6.c = obj2;
                e91Var6.d = obj3;
                return e91Var6.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                Object obj4 = this.d;
                hre.r(obj);
                return new moc(obj2, obj3, obj4);
            case 1:
                Object obj5 = this.b;
                Object obj6 = this.c;
                Object obj7 = this.d;
                hre.r(obj);
                return new moc(obj5, obj6, obj7);
            case 2:
                Object obj8 = this.b;
                Object obj9 = this.c;
                Object obj10 = this.d;
                hre.r(obj);
                return new moc(obj8, obj9, obj10);
            case 3:
                Object obj11 = this.b;
                Object obj12 = this.c;
                Object obj13 = this.d;
                hre.r(obj);
                return new moc(obj11, obj12, obj13);
            case 4:
                Object obj14 = this.b;
                Object obj15 = this.c;
                Object obj16 = this.d;
                hre.r(obj);
                return new moc(obj14, obj15, obj16);
            default:
                Object obj17 = this.b;
                Object obj18 = this.c;
                Object obj19 = this.d;
                hre.r(obj);
                return new moc(obj17, obj18, obj19);
        }
    }
}
