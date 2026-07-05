package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uw5  reason: default package */
/* loaded from: classes3.dex */
public final class uw5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ zm4 c;
    public final /* synthetic */ bsa d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw5(zm4 zm4Var, bsa bsaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = zm4Var;
        this.d = bsaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new uw5(this.c, this.d, m42Var, 0);
            case 1:
                return new uw5(this.c, this.d, m42Var, 1);
            case 2:
                return new uw5(this.c, this.d, m42Var, 2);
            default:
                return new uw5(this.c, this.d, m42Var, 3);
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
                return ((uw5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((uw5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((uw5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((uw5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        bsa bsaVar = this.d;
        zm4 zm4Var = this.c;
        am3 am3Var = am3.MILLISECONDS;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var = wl3.b;
                    long O = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                if (bsaVar != null) {
                    ((w03) bsaVar).b();
                    return pvcVar;
                }
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
                    hq7 hq7Var2 = wl3.b;
                    long O2 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O2, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                if (bsaVar != null) {
                    ((w03) bsaVar).b();
                    return pvcVar;
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
                    hq7 hq7Var3 = wl3.b;
                    long O3 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O3, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                if (bsaVar != null) {
                    ((w03) bsaVar).b();
                    return pvcVar;
                }
                return pvcVar;
            default:
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
                    hq7 hq7Var4 = wl3.b;
                    long O4 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O4, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                if (bsaVar != null) {
                    ((w03) bsaVar).b();
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
