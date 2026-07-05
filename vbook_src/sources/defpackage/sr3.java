package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sr3  reason: default package */
/* loaded from: classes3.dex */
public final class sr3 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ zm4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sr3(zm4 zm4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = zm4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new sr3(this.c, m42Var, 0);
            case 1:
                return new sr3(this.c, m42Var, 1);
            case 2:
                return new sr3(this.c, m42Var, 2);
            case 3:
                return new sr3(this.c, m42Var, 3);
            case 4:
                return new sr3(this.c, m42Var, 4);
            case 5:
                return new sr3(this.c, m42Var, 5);
            case 6:
                return new sr3(this.c, m42Var, 6);
            case 7:
                return new sr3(this.c, m42Var, 7);
            case 8:
                return new sr3(this.c, m42Var, 8);
            case 9:
                return new sr3(this.c, m42Var, 9);
            case 10:
                return new sr3(this.c, m42Var, 10);
            case 11:
                return new sr3(this.c, m42Var, 11);
            case 12:
                return new sr3(this.c, m42Var, 12);
            case 13:
                return new sr3(this.c, m42Var, 13);
            case 14:
                return new sr3(this.c, m42Var, 14);
            case 15:
                return new sr3(this.c, m42Var, 15);
            default:
                return new sr3(this.c, m42Var, 16);
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
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 7:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 8:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 9:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 10:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 11:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 12:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 13:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 14:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 15:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((sr3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
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
                    hq7 hq7Var4 = wl3.b;
                    long O4 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O4, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
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
                    hq7 hq7Var5 = wl3.b;
                    long O5 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O5, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
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
                    hq7 hq7Var6 = wl3.b;
                    long O6 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O6, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
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
                    hq7 hq7Var7 = wl3.b;
                    long O7 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O7, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 7:
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
                    hq7 hq7Var8 = wl3.b;
                    long O8 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O8, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 8:
                int i10 = this.b;
                if (i10 != 0) {
                    if (i10 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var9 = wl3.b;
                    long O9 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O9, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 9:
                int i11 = this.b;
                if (i11 != 0) {
                    if (i11 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var10 = wl3.b;
                    long O10 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O10, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 10:
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
                    hq7 hq7Var11 = wl3.b;
                    long O11 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O11, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 11:
                int i13 = this.b;
                if (i13 != 0) {
                    if (i13 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var12 = wl3.b;
                    long O12 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O12, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 12:
                int i14 = this.b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var13 = wl3.b;
                    long O13 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O13, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 13:
                int i15 = this.b;
                if (i15 != 0) {
                    if (i15 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var14 = wl3.b;
                    long O14 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O14, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 14:
                int i16 = this.b;
                if (i16 != 0) {
                    if (i16 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var15 = wl3.b;
                    long O15 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O15, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            case 15:
                int i17 = this.b;
                if (i17 != 0) {
                    if (i17 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var16 = wl3.b;
                    long O16 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O16, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
            default:
                int i18 = this.b;
                if (i18 != 0) {
                    if (i18 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    hq7 hq7Var17 = wl3.b;
                    long O17 = jue.O(100, am3Var);
                    this.b = 1;
                    if (ade.r(O17, this) == n82Var) {
                        return n82Var;
                    }
                }
                zm4.a(zm4Var);
                return pvcVar;
        }
    }
}
