package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sr5  reason: default package */
/* loaded from: classes3.dex */
public final class sr5 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr5(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj3;
        switch (i) {
            case 0:
                sr5 sr5Var = new sr5(3, 0, m42Var);
                sr5Var.b = obj;
                sr5Var.c = obj2;
                return sr5Var.invokeSuspend(pvcVar);
            case 1:
                sr5 sr5Var2 = new sr5(3, 1, m42Var);
                sr5Var2.b = obj;
                sr5Var2.c = obj2;
                return sr5Var2.invokeSuspend(pvcVar);
            case 2:
                sr5 sr5Var3 = new sr5(3, 2, m42Var);
                sr5Var3.b = obj;
                sr5Var3.c = obj2;
                return sr5Var3.invokeSuspend(pvcVar);
            case 3:
                sr5 sr5Var4 = new sr5(3, 3, m42Var);
                sr5Var4.b = obj;
                sr5Var4.c = obj2;
                return sr5Var4.invokeSuspend(pvcVar);
            case 4:
                sr5 sr5Var5 = new sr5(3, 4, m42Var);
                sr5Var5.b = obj;
                sr5Var5.c = obj2;
                return sr5Var5.invokeSuspend(pvcVar);
            case 5:
                sr5 sr5Var6 = new sr5(3, 5, m42Var);
                sr5Var6.b = obj;
                sr5Var6.c = obj2;
                return sr5Var6.invokeSuspend(pvcVar);
            default:
                sr5 sr5Var7 = new sr5(3, 6, m42Var);
                sr5Var7.b = obj;
                sr5Var7.c = obj2;
                return sr5Var7.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Object obj2 = this.b;
                Object obj3 = this.c;
                hre.r(obj);
                return new yk8(obj2, obj3);
            case 1:
                Object obj4 = this.b;
                Object obj5 = this.c;
                hre.r(obj);
                return new yk8(obj4, obj5);
            case 2:
                Object obj6 = this.b;
                Object obj7 = this.c;
                hre.r(obj);
                return new yk8(obj6, obj7);
            case 3:
                Object obj8 = this.b;
                Object obj9 = this.c;
                hre.r(obj);
                return new yk8(obj8, obj9);
            case 4:
                Object obj10 = this.b;
                Object obj11 = this.c;
                hre.r(obj);
                return new yk8(obj10, obj11);
            case 5:
                Object obj12 = this.b;
                Object obj13 = this.c;
                hre.r(obj);
                return new yk8(obj12, obj13);
            default:
                Object obj14 = this.b;
                Object obj15 = this.c;
                hre.r(obj);
                return new yk8(obj14, obj15);
        }
    }
}
