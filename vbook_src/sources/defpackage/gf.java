package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gf  reason: default package */
/* loaded from: classes3.dex */
public final class gf extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gf(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.a = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new gf(2, 0, m42Var);
            case 1:
                return new gf(2, 1, m42Var);
            case 2:
                return new gf(2, 2, m42Var);
            case 3:
                return new gf(2, 3, m42Var);
            case 4:
                return new gf(2, 4, m42Var);
            case 5:
                return new gf(2, 5, m42Var);
            case 6:
                return new gf(2, 6, m42Var);
            case 7:
                return new gf(2, 7, m42Var);
            case 8:
                return new gf(2, 8, m42Var);
            case 9:
                return new gf(2, 9, m42Var);
            case 10:
                return new gf(2, 10, m42Var);
            case 11:
                return new gf(2, 11, m42Var);
            case 12:
                return new gf(2, 12, m42Var);
            case 13:
                return new gf(2, 13, m42Var);
            case 14:
                return new gf(2, 14, m42Var);
            case 15:
                return new gf(2, 15, m42Var);
            case 16:
                return new gf(2, 16, m42Var);
            case 17:
                gf gfVar = new gf(2, 17, m42Var);
                gfVar.b = ((Number) obj).intValue();
                return gfVar;
            default:
                return new gf(2, 18, m42Var);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 7:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 16:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 17:
                return ((gf) create(Integer.valueOf(((Number) obj).intValue()), (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((gf) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        n82 n82Var = n82.a;
        boolean z = true;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u = yqe.u((y3b) x2b.y0.getValue(), this);
                if (u == n82Var) {
                    return n82Var;
                }
                return u;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u2 = yqe.u((y3b) f2b.Z.getValue(), this);
                if (u2 == n82Var) {
                    return n82Var;
                }
                return u2;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u3 = yqe.u((y3b) f2b.Y.getValue(), this);
                if (u3 == n82Var) {
                    return n82Var;
                }
                return u3;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u4 = yqe.u((y3b) f2b.d0.getValue(), this);
                if (u4 == n82Var) {
                    return n82Var;
                }
                return u4;
            case 4:
                int i6 = this.b;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u5 = yqe.u((y3b) f2b.b0.getValue(), this);
                if (u5 == n82Var) {
                    return n82Var;
                }
                return u5;
            case 5:
                int i7 = this.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u6 = yqe.u((y3b) f2b.a0.getValue(), this);
                if (u6 == n82Var) {
                    return n82Var;
                }
                return u6;
            case 6:
                int i8 = this.b;
                if (i8 != 0) {
                    if (i8 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u7 = yqe.u((y3b) f2b.d0.getValue(), this);
                if (u7 == n82Var) {
                    return n82Var;
                }
                return u7;
            case 7:
                int i9 = this.b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u8 = yqe.u((y3b) f2b.c0.getValue(), this);
                if (u8 == n82Var) {
                    return n82Var;
                }
                return u8;
            case 8:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u9 = yqe.u((y3b) o3b.F.getValue(), this);
                if (u9 == n82Var) {
                    return n82Var;
                }
                return u9;
            case 9:
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u10 = yqe.u((y3b) f2b.f0.getValue(), this);
                if (u10 == n82Var) {
                    return n82Var;
                }
                return u10;
            case 10:
                int i12 = this.b;
                if (i12 != 0) {
                    if (i12 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u11 = yqe.u((y3b) f2b.e0.getValue(), this);
                if (u11 == n82Var) {
                    return n82Var;
                }
                return u11;
            case 11:
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u12 = yqe.u((y3b) b3b.j.getValue(), this);
                if (u12 == n82Var) {
                    return n82Var;
                }
                return u12;
            case 12:
                int i14 = this.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u13 = yqe.u((y3b) o3b.C.getValue(), this);
                if (u13 == n82Var) {
                    return n82Var;
                }
                return u13;
            case 13:
                int i15 = this.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u14 = yqe.u((y3b) o3b.E.getValue(), this);
                if (u14 == n82Var) {
                    return n82Var;
                }
                return u14;
            case 14:
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u15 = yqe.u((y3b) x2b.n0.getValue(), this);
                if (u15 == n82Var) {
                    return n82Var;
                }
                return u15;
            case 15:
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u16 = yqe.u((y3b) o3b.F.getValue(), this);
                if (u16 == n82Var) {
                    return n82Var;
                }
                return u16;
            case 16:
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                Object u17 = yqe.u((y3b) x2b.G0.getValue(), this);
                if (u17 == n82Var) {
                    return n82Var;
                }
                return u17;
            case 17:
                int i19 = this.b;
                hre.r(obj);
                if (i19 <= 0) {
                    z = false;
                }
                return Boolean.valueOf(z);
            default:
                int i20 = this.b;
                if (i20 != 0) {
                    if (i20 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    this.b = 1;
                    if (fpe.q(this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvc.a;
        }
    }
}
