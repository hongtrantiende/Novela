package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mra  reason: default package */
/* loaded from: classes.dex */
public final class mra extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ lu4 d;
    public final /* synthetic */ aw7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mra(lu4 lu4Var, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = lu4Var;
        this.e = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                mra mraVar = new mra(this.d, this.e, m42Var, 0);
                mraVar.c = obj;
                return mraVar;
            case 1:
                mra mraVar2 = new mra(this.d, this.e, m42Var, 1);
                mraVar2.c = obj;
                return mraVar2;
            case 2:
                mra mraVar3 = new mra(this.d, this.e, m42Var, 2);
                mraVar3.c = obj;
                return mraVar3;
            default:
                mra mraVar4 = new mra(this.d, this.e, m42Var, 3);
                mraVar4.c = obj;
                return mraVar4;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((mra) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((mra) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((mra) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((mra) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.e;
        lu4 lu4Var = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                x69 x69Var = new x69(aw7Var, ((m82) this.c).q());
                this.b = 1;
                if (lu4Var.invoke(x69Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                x69 x69Var2 = new x69(aw7Var, ((m82) this.c).q());
                this.b = 1;
                if (lu4Var.invoke(x69Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                x69 x69Var3 = new x69(aw7Var, ((m82) this.c).q());
                this.b = 1;
                if (lu4Var.invoke(x69Var3, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                x69 x69Var4 = new x69(aw7Var, ((m82) this.c).q());
                this.b = 1;
                if (lu4Var.invoke(x69Var4, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
