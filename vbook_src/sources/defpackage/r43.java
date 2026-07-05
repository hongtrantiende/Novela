package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r43  reason: default package */
/* loaded from: classes3.dex */
public final class r43 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ xt4 c;
    public final /* synthetic */ qg6 d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r43(xt4 xt4Var, qg6 qg6Var, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = xt4Var;
        this.d = qg6Var;
        this.e = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new r43(this.c, this.d, this.e, m42Var, 0);
            default:
                return new r43(this.c, this.d, this.e, m42Var, 1);
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
                return ((r43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((r43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        final float f = this.e;
        final qg6 qg6Var = this.d;
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
                s02 G = yae.G(new vt4() { // from class: q43
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i3 = r3;
                        float f2 = 0.7f;
                        float f3 = f;
                        qg6 qg6Var2 = qg6Var;
                        switch (i3) {
                            case 0:
                                if (qg6Var2.h() <= 0) {
                                    f2 = dce.m(qg6Var2.i() / f3, nae.e, 0.7f);
                                }
                                return Float.valueOf(f2);
                            default:
                                if (qg6Var2.h() <= 0) {
                                    f2 = dce.m(qg6Var2.i() / f3, nae.e, 0.7f);
                                }
                                return Float.valueOf(f2);
                        }
                    }
                });
                xe1 xe1Var = new xe1(2, this.c, b16.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 3);
                this.b = 1;
                if (z1d.v(G, xe1Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                s02 G2 = yae.G(new vt4() { // from class: q43
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i32 = r3;
                        float f2 = 0.7f;
                        float f3 = f;
                        qg6 qg6Var2 = qg6Var;
                        switch (i32) {
                            case 0:
                                if (qg6Var2.h() <= 0) {
                                    f2 = dce.m(qg6Var2.i() / f3, nae.e, 0.7f);
                                }
                                return Float.valueOf(f2);
                            default:
                                if (qg6Var2.h() <= 0) {
                                    f2 = dce.m(qg6Var2.i() / f3, nae.e, 0.7f);
                                }
                                return Float.valueOf(f2);
                        }
                    }
                });
                xe1 xe1Var2 = new xe1(2, this.c, b16.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 4);
                this.b = 1;
                if (z1d.v(G2, xe1Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
