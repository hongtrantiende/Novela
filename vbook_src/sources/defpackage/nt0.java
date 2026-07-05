package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nt0  reason: default package */
/* loaded from: classes3.dex */
public final class nt0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ef2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nt0(ef2 ef2Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ef2Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ef2 ef2Var = this.c;
        switch (i) {
            case 0:
                nt0 nt0Var = new nt0(ef2Var, m42Var, 0);
                nt0Var.b = ((Number) obj).intValue();
                return nt0Var;
            case 1:
                return new nt0(ef2Var, m42Var, 1);
            case 2:
                return new nt0(ef2Var, m42Var, 2);
            case 3:
                return new nt0(ef2Var, m42Var, 3);
            case 4:
                return new nt0(ef2Var, m42Var, 4);
            case 5:
                return new nt0(ef2Var, m42Var, 5);
            case 6:
                return new nt0(ef2Var, m42Var, 6);
            default:
                return new nt0(ef2Var, m42Var, 7);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                ((nt0) create(Integer.valueOf(((Number) obj).intValue()), (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                return ((nt0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((nt0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((nt0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((nt0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((nt0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((nt0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((nt0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        ef2 ef2Var = this.c;
        switch (i) {
            case 0:
                int i2 = this.b;
                hre.r(obj);
                z87.v(ef2Var.a, null, null, new ze2(ef2Var, i2, null), 3);
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar = ef2Var.m;
                    Float f = new Float((float) nae.e);
                    gxa gxaVar = ef2Var.h;
                    this.b = 1;
                    if (lq.c(lqVar, f, gxaVar, null, null, this, 12) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar2 = ef2Var.n;
                    Float f2 = new Float(1.0f);
                    gxa gxaVar2 = ef2Var.i;
                    this.b = 1;
                    if (lq.c(lqVar2, f2, gxaVar2, null, null, this, 12) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar3 = ef2Var.o;
                    Float f3 = new Float(ef2Var.c);
                    gxa gxaVar3 = ef2Var.j;
                    this.b = 1;
                    if (lq.c(lqVar3, f3, gxaVar3, null, null, this, 12) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar4 = ef2Var.p;
                    Float f4 = new Float(ef2Var.c);
                    gxa gxaVar4 = ef2Var.k;
                    this.b = 1;
                    if (lq.c(lqVar4, f4, gxaVar4, null, null, this, 12) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 5:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar5 = ef2Var.n;
                    Float f5 = new Float((float) nae.e);
                    gxa gxaVar5 = ef2Var.i;
                    this.b = 1;
                    if (lq.c(lqVar5, f5, gxaVar5, null, null, this, 12) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            case 6:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar6 = ef2Var.o;
                    Float f6 = new Float(1.0f);
                    gxa gxaVar6 = ef2Var.j;
                    this.b = 1;
                    if (lq.c(lqVar6, f6, gxaVar6, null, null, this, 12) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    lq lqVar7 = ef2Var.p;
                    Float f7 = new Float(1.0f);
                    gxa gxaVar7 = ef2Var.k;
                    this.b = 1;
                    if (lq.c(lqVar7, f7, gxaVar7, null, null, this, 12) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
