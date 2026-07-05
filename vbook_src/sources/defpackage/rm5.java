package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rm5  reason: default package */
/* loaded from: classes3.dex */
public final class rm5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public aw7 d;
    public final /* synthetic */ aw7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rm5(boolean z, aw7 aw7Var, aw7 aw7Var2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = aw7Var;
        this.e = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new rm5(this.c, this.d, this.e, m42Var, 0);
            case 1:
                return new rm5(this.c, this.d, this.e, m42Var, 1);
            case 2:
                return new rm5(this.c, this.d, this.e, m42Var, 2);
            case 3:
                return new rm5(this.c, this.d, this.e, m42Var, 3);
            case 4:
                return new rm5(this.c, this.d, this.e, m42Var, 4);
            case 5:
                return new rm5(this.c, this.d, this.e, m42Var, 5);
            default:
                return new rm5(this.c, this.e, m42Var);
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
                return ((rm5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((rm5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((rm5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((rm5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((rm5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((rm5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((rm5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        boolean z = this.c;
        n82 n82Var = n82.a;
        aw7 aw7Var = this.e;
        switch (i) {
            case 0:
                aw7 aw7Var2 = this.d;
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
                if (kqe.r(((sm5) aw7Var2.getValue()).a, z)) {
                    kj6 kj6Var = ((sm5) aw7Var2.getValue()).a;
                    boolean z2 = ((dm5) aw7Var.getValue()).p;
                    this.b = 1;
                    if (kqe.w(kj6Var, z2, z, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
            case 1:
                aw7 aw7Var3 = this.d;
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
                if (kqe.q(((sm5) aw7Var3.getValue()).a, z)) {
                    kj6 kj6Var2 = ((sm5) aw7Var3.getValue()).a;
                    boolean z3 = ((dm5) aw7Var.getValue()).p;
                    this.b = 1;
                    if (kqe.u(kj6Var2, z3, z, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
            case 2:
                aw7 aw7Var4 = this.d;
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
                if (kqe.q(((sm5) aw7Var4.getValue()).a, z)) {
                    kj6 kj6Var3 = ((sm5) aw7Var4.getValue()).a;
                    boolean z4 = ((dm5) aw7Var.getValue()).p;
                    this.b = 1;
                    if (kqe.u(kj6Var3, z4, z, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
            case 3:
                aw7 aw7Var5 = this.d;
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
                if (kqe.r(((sm5) aw7Var5.getValue()).a, z)) {
                    kj6 kj6Var4 = ((sm5) aw7Var5.getValue()).a;
                    boolean z5 = ((dm5) aw7Var.getValue()).p;
                    this.b = 1;
                    if (kqe.w(kj6Var4, z5, z, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
            case 4:
                aw7 aw7Var6 = this.d;
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 != 1 && i6 != 2) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    return pvcVar;
                }
                hre.r(obj);
                if (((dm5) aw7Var6.getValue()).n) {
                    if (kqe.q(((sm5) aw7Var.getValue()).a, z)) {
                        kj6 kj6Var5 = ((sm5) aw7Var.getValue()).a;
                        boolean z6 = ((dm5) aw7Var6.getValue()).p;
                        this.b = 1;
                        if (kqe.u(kj6Var5, z6, z, this) != n82Var) {
                            return pvcVar;
                        }
                    } else {
                        return pvcVar;
                    }
                } else if (kqe.r(((sm5) aw7Var.getValue()).a, z)) {
                    kj6 kj6Var6 = ((sm5) aw7Var.getValue()).a;
                    boolean z7 = ((dm5) aw7Var6.getValue()).p;
                    this.b = 2;
                    if (kqe.w(kj6Var6, z7, z, this) != n82Var) {
                        return pvcVar;
                    }
                } else {
                    return pvcVar;
                }
                return n82Var;
            case 5:
                aw7 aw7Var7 = this.d;
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 != 1 && i7 != 2) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    return pvcVar;
                }
                hre.r(obj);
                if (((dm5) aw7Var7.getValue()).n) {
                    if (kqe.r(((sm5) aw7Var.getValue()).a, z)) {
                        kj6 kj6Var7 = ((sm5) aw7Var.getValue()).a;
                        boolean z8 = ((dm5) aw7Var7.getValue()).p;
                        this.b = 1;
                        if (kqe.w(kj6Var7, z8, z, this) != n82Var) {
                            return pvcVar;
                        }
                    } else {
                        return pvcVar;
                    }
                } else if (kqe.q(((sm5) aw7Var.getValue()).a, z)) {
                    kj6 kj6Var8 = ((sm5) aw7Var.getValue()).a;
                    boolean z9 = ((dm5) aw7Var7.getValue()).p;
                    this.b = 2;
                    if (kqe.u(kj6Var8, z9, z, this) != n82Var) {
                        return pvcVar;
                    }
                } else {
                    return pvcVar;
                }
                return n82Var;
            default:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        aw7Var = this.d;
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    if (z && ((String) aw7Var.getValue()) == null) {
                        sw2 sw2Var = ab3.a;
                        ru2 ru2Var = ru2.c;
                        f05 f05Var = new f05(2, null);
                        this.d = aw7Var;
                        this.b = 1;
                        obj = z87.E(ru2Var, f05Var, this);
                        if (obj == n82Var) {
                            return n82Var;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                aw7Var.setValue((String) obj);
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rm5(boolean z, aw7 aw7Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 6;
        this.c = z;
        this.e = aw7Var;
    }
}
