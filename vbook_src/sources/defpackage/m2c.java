package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m2c  reason: default package */
/* loaded from: classes3.dex */
public final class m2c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ t2c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2c(int i, t2c t2cVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 4;
        this.b = i;
        this.c = t2cVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        t2c t2cVar = this.c;
        switch (i) {
            case 0:
                return new m2c(t2cVar, m42Var, 0);
            case 1:
                return new m2c(t2cVar, m42Var, 1);
            case 2:
                return new m2c(t2cVar, m42Var, 2);
            case 3:
                return new m2c(t2cVar, m42Var, 3);
            case 4:
                return new m2c(this.b, t2cVar, m42Var);
            case 5:
                return new m2c(t2cVar, m42Var, 5);
            case 6:
                return new m2c(t2cVar, m42Var, 6);
            default:
                return new m2c(t2cVar, this.b, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((m2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 1:
                ((m2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 2:
                ((m2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            case 3:
                return ((m2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                ((m2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                return ((m2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                ((m2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82Var;
            default:
                ((m2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        t2c t2cVar = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                cza czaVar = t2cVar.c.b;
                l2c l2cVar = new l2c(t2cVar, 0);
                this.b = 1;
                czaVar.a(l2cVar, this);
                return n82Var;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                cza czaVar2 = t2cVar.c.c;
                l2c l2cVar2 = new l2c(t2cVar, 1);
                this.b = 1;
                czaVar2.a(l2cVar2, this);
                return n82Var;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                cza czaVar3 = t2cVar.c.d;
                l2c l2cVar3 = new l2c(t2cVar, 2);
                this.b = 1;
                czaVar3.a(l2cVar3, this);
                return n82Var;
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
                mfb mfbVar = ix3.a;
                ja jaVar = new ja(4, (xv7) ix3.a.getValue(), cm9.a(hpc.class));
                iz7 iz7Var = new iz7(t2cVar, null, 18);
                this.b = 1;
                if (z1d.v(jaVar, iz7Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 4:
                hre.r(obj);
                int i6 = this.b % 3;
                int i7 = i6 + ((((i6 ^ 3) & ((-i6) | i6)) >> 31) & 3);
                ((i2c) t2cVar.C).a.k.e(y1c.o[10], Integer.valueOf(i7));
                cza czaVar4 = t2cVar.c.d;
                Integer valueOf = Integer.valueOf(i7);
                czaVar4.getClass();
                czaVar4.n(null, valueOf);
                return pvcVar;
            case 5:
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
                sj4 A = z1d.A(new mx(t2cVar.c.a, 10));
                l2c l2cVar4 = new l2c(t2cVar, 3);
                this.b = 1;
                if (A.a(l2cVar4, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 6:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                cza czaVar5 = t2cVar.c.a;
                l2c l2cVar5 = new l2c(t2cVar, 4);
                this.b = 1;
                czaVar5.a(l2cVar5, this);
                return n82Var;
            default:
                hre.r(obj);
                t2cVar.d.a(this.b, 0, ((n1c) t2cVar.F.getValue()).a);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2c(t2c t2cVar, int i, m42 m42Var) {
        super(2, m42Var);
        this.a = 7;
        this.c = t2cVar;
        this.b = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m2c(t2c t2cVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = t2cVar;
    }
}
