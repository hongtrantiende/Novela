package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: upa  reason: default package */
/* loaded from: classes.dex */
public final class upa extends aab implements mu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ long c;
    public final /* synthetic */ yu7 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ upa(yu7 yu7Var, Object obj, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.d = yu7Var;
        this.f = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj4 = this.f;
        yu7 yu7Var = this.d;
        j59 j59Var = (j59) obj;
        y78 y78Var = (y78) obj2;
        switch (i) {
            case 0:
                long j = y78Var.a;
                upa upaVar = new upa(yu7Var, (wpa) obj4, (m42) obj3, 0);
                upaVar.e = j59Var;
                upaVar.c = j;
                return upaVar.invokeSuspend(pvcVar);
            default:
                long j2 = y78Var.a;
                upa upaVar2 = new upa(yu7Var, (ytb) obj4, (m42) obj3, 1);
                upaVar2.e = j59Var;
                upaVar2.c = j2;
                return upaVar2.invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        Throwable th2;
        float intBitsToFloat;
        ez5 k59Var;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.f;
        n82 n82Var = n82.a;
        l59 l59Var = null;
        switch (i) {
            case 0:
                int i2 = this.b;
                yu7 yu7Var = this.d;
                try {
                } catch (Throwable th3) {
                    th = th3;
                }
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                vs.k("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            th2 = (Throwable) this.e;
                            hre.r(obj);
                            throw th2;
                        }
                        hre.r(obj);
                        return pvcVar;
                    }
                    l59Var = (l59) this.e;
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    j59 j59Var = (j59) this.e;
                    long j = this.c;
                    l59 l59Var2 = new l59(j);
                    try {
                        yu7Var.c(l59Var2);
                        wpa wpaVar = (wpa) obj2;
                        if (wpaVar.n == ff8.a) {
                            intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                        } else if (wpaVar.j) {
                            intBitsToFloat = wpaVar.h.h() - Float.intBitsToFloat((int) (j >> 32));
                        } else {
                            intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        }
                        wpaVar.r.i(intBitsToFloat - wpaVar.q.h());
                        this.e = l59Var2;
                        this.b = 1;
                        obj = j59Var.m(this);
                        if (obj != n82Var) {
                            l59Var = l59Var2;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        l59Var = l59Var2;
                        if (l59Var != null) {
                            k59 k59Var2 = new k59(l59Var);
                            this.e = th;
                            this.b = 3;
                            if (yu7Var.b(k59Var2, this) != n82Var) {
                                th2 = th;
                                throw th2;
                            }
                            return n82Var;
                        }
                        throw th;
                    }
                    return n82Var;
                }
                if (((Boolean) obj).booleanValue()) {
                    k59Var = new m59(l59Var);
                } else {
                    k59Var = new k59(l59Var);
                }
                yu7Var.c(k59Var);
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
                j59 j59Var2 = (j59) this.e;
                long j2 = this.c;
                yu7 yu7Var2 = this.d;
                if (yu7Var2 != null) {
                    hg1 hg1Var = new hg1(j59Var2, (ytb) obj2, j2, yu7Var2, (m42) null);
                    this.b = 1;
                    if (k27.p(hg1Var, this) == n82Var) {
                        return n82Var;
                    }
                    return pvcVar;
                }
                return pvcVar;
        }
    }
}
