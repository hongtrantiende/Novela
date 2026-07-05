package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wk7  reason: default package */
/* loaded from: classes3.dex */
public final class wk7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ yha c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wk7(yha yhaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = yhaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new wk7(this.c, m42Var, 0);
            case 1:
                return new wk7(this.c, m42Var, 1);
            case 2:
                return new wk7(this.c, m42Var, 2);
            case 3:
                return new wk7(this.c, m42Var, 3);
            case 4:
                return new wk7(this.c, m42Var, 4);
            case 5:
                return new wk7(this.c, m42Var, 5);
            case 6:
                return new wk7(this.c, m42Var, 6);
            default:
                return new wk7(this.c, m42Var, 7);
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
                return ((wk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((wk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((wk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((wk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((wk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((wk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((wk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((wk7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        zha zhaVar = zha.a;
        pvc pvcVar = pvc.a;
        yha yhaVar = this.c;
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
                this.b = 1;
                if (yhaVar.f(this) == n82Var) {
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
                this.b = 1;
                yhaVar.getClass();
                if (yha.a(yhaVar, zhaVar, this) == n82Var) {
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
                this.b = 1;
                pe peVar = yhaVar.b;
                pd pdVar = new pd(peVar, peVar.k.h(), null);
                if (peVar.b(zha.b, jw7.a, pdVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 3:
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
                this.b = 1;
                if (yhaVar.f(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                yhaVar.getClass();
                if (yha.a(yhaVar, zhaVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 5:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (yhaVar.f(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 6:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                yhaVar.getClass();
                if (yha.a(yhaVar, zhaVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                yhaVar.getClass();
                if (yha.a(yhaVar, zhaVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
