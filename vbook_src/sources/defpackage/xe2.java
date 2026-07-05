package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xe2  reason: default package */
/* loaded from: classes3.dex */
public final class xe2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ef2 c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xe2(ef2 ef2Var, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ef2Var;
        this.d = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        float f = this.d;
        ef2 ef2Var = this.c;
        switch (i) {
            case 0:
                return new xe2(ef2Var, f, m42Var, 0);
            case 1:
                return new xe2(ef2Var, f, m42Var, 1);
            default:
                return new xe2(ef2Var, f, m42Var, 2);
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
                return ((xe2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((xe2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((xe2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        float f = this.d;
        n82 n82Var = n82.a;
        ef2 ef2Var = this.c;
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
                lq lqVar = ef2Var.l;
                Float f2 = new Float(f);
                gxa gxaVar = ef2Var.g;
                this.b = 1;
                if (lq.c(lqVar, f2, gxaVar, null, null, this, 12) == n82Var) {
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
                lq lqVar2 = ef2Var.l;
                Float f3 = new Float(f);
                gxa gxaVar2 = ef2Var.g;
                ft0 ft0Var = new ft0(ef2Var, 5);
                this.b = 1;
                if (lq.c(lqVar2, f3, gxaVar2, null, ft0Var, this, 4) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                lq lqVar3 = ef2Var.m;
                Float f4 = new Float(f);
                gxa gxaVar3 = ef2Var.h;
                this.b = 1;
                if (lq.c(lqVar3, f4, gxaVar3, null, null, this, 12) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
