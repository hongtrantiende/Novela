package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gs1  reason: default package */
/* loaded from: classes.dex */
public final class gs1 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ rj8 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gs1(rj8 rj8Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = rj8Var;
        this.d = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new gs1(this.c, this.d, m42Var, 0);
            case 1:
                return new gs1(this.c, this.d, m42Var, 1);
            case 2:
                return new gs1(this.c, this.d, m42Var, 2);
            case 3:
                return new gs1(this.c, this.d, m42Var, 3);
            case 4:
                return new gs1(this.c, this.d, m42Var, 4);
            case 5:
                return new gs1(this.c, this.d, m42Var, 5);
            case 6:
                return new gs1(this.c, this.d, m42Var, 6);
            case 7:
                return new gs1(this.c, this.d, m42Var, 7);
            case 8:
                return new gs1(this.c, this.d, m42Var, 8);
            case 9:
                return new gs1(this.c, this.d, m42Var, 9);
            case 10:
                return new gs1(this.c, this.d, m42Var, 10);
            default:
                return new gs1(this.c, this.d, m42Var, 11);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((gs1) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((gs1) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object f;
        Object f2;
        Object f3;
        Object f4;
        Object f5;
        Object f6;
        Object f7;
        Object f8;
        Object f9;
        Object f10;
        int i = this.a;
        pvc pvcVar = pvc.a;
        int i2 = this.d;
        rj8 rj8Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
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
                f = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
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
                f2 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f2 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
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
                f3 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f3 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 3:
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
                f4 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f4 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 4:
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
                if (rj8.u(rj8Var, i2, this) == n82Var) {
                    return n82Var;
                }
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
                this.b = 1;
                f5 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f5 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 6:
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
                f6 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f6 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 7:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                f7 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f7 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 8:
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                f8 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f8 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 9:
                int i12 = this.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    if (rj8Var.i(this) == n82Var) {
                        return n82Var;
                    }
                }
                rj8Var.v(rj8Var.j(i2), nae.e, true);
                return pvcVar;
            case 10:
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                f9 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f9 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i14 = this.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                f10 = rj8Var.f(i2, tte.v(nae.e, nae.e, 7, null), this);
                if (f10 == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
