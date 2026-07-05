package defpackage;

import j$.time.LocalDateTime;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: as2  reason: default package */
/* loaded from: classes3.dex */
public final class as2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ aw7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ as2(aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.c;
        switch (i) {
            case 0:
                return new as2(aw7Var, m42Var, 0);
            case 1:
                return new as2(aw7Var, m42Var, 1);
            case 2:
                return new as2(aw7Var, m42Var, 2);
            case 3:
                return new as2(aw7Var, m42Var, 3);
            default:
                return new as2(aw7Var, m42Var, 4);
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
                return ((as2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                ((as2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
            case 2:
                return ((as2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((as2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((as2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        long O;
        int i = this.a;
        am3 am3Var = am3.SECONDS;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        aw7 aw7Var = this.c;
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
                ua1 ua1Var = new ua1(yr2.a);
                zr2 zr2Var = new zr2(aw7Var, 0);
                this.b = 1;
                if (ua1Var.a(zr2Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
                int i3 = this.b;
                if (i3 != 0 && i3 != 1) {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                do {
                    zx5 k = by5.a.k();
                    int i4 = w9c.b;
                    LocalDateTime localDateTime = c16.x(k, b16.p()).a;
                    String k2 = q0f.k(localDateTime.getHour());
                    String k3 = q0f.k(localDateTime.getMinute());
                    aw7Var.setValue(k2 + ":" + k3);
                    hq7 hq7Var = wl3.b;
                    O = jue.O(1, am3Var);
                    this.b = 1;
                } while (ade.r(O, this) != n82Var);
                return n82Var;
            case 2:
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
                    if (((Boolean) aw7Var.getValue()).booleanValue()) {
                        hq7 hq7Var2 = wl3.b;
                        long O2 = jue.O(3, am3Var);
                        this.b = 1;
                        if (ade.r(O2, this) == n82Var) {
                            return n82Var;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
            case 3:
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
                    int i7 = ct8.c;
                    aw7Var.setValue(Boolean.TRUE);
                    hq7 hq7Var3 = wl3.b;
                    long O3 = jue.O(150, am3.MILLISECONDS);
                    this.b = 1;
                    if (ade.r(O3, this) == n82Var) {
                        return n82Var;
                    }
                }
                int i8 = ct8.c;
                aw7Var.setValue(Boolean.FALSE);
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
                    if (((Boolean) aw7Var.getValue()).booleanValue()) {
                        hq7 hq7Var4 = wl3.b;
                        long O4 = jue.O(3, am3Var);
                        this.b = 1;
                        if (ade.r(O4, this) == n82Var) {
                            return n82Var;
                        }
                    } else {
                        return pvcVar;
                    }
                }
                aw7Var.setValue(Boolean.FALSE);
                return pvcVar;
        }
    }
}
