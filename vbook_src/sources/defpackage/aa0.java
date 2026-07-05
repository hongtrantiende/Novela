package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aa0  reason: default package */
/* loaded from: classes3.dex */
public final class aa0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ aw7 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa0(int i, aw7 aw7Var, aw7 aw7Var2, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.b = i;
        this.c = aw7Var;
        this.d = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aw7 aw7Var = this.d;
        aw7 aw7Var2 = this.c;
        switch (i) {
            case 0:
                return new aa0(aw7Var2, aw7Var, m42Var, 0);
            case 1:
                return new aa0(aw7Var2, aw7Var, m42Var, 1);
            case 2:
                return new aa0(aw7Var2, aw7Var, m42Var, 2);
            default:
                return new aa0(this.b, aw7Var2, aw7Var, m42Var);
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
                return ((aa0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((aa0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((aa0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((aa0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        am3 am3Var = am3.MILLISECONDS;
        n82 n82Var = n82.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        aw7 aw7Var2 = this.c;
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
                    List list = ha0.a;
                    if (((Number) aw7Var2.getValue()).intValue() <= 1) {
                        aw7Var2.setValue(Integer.valueOf(((Number) aw7Var2.getValue()).intValue() + 1));
                        hq7 hq7Var = wl3.b;
                        long O = jue.O(3000, am3Var);
                        this.b = 1;
                        if (ade.r(O, this) == n82Var) {
                            return n82Var;
                        }
                    }
                    return pvcVar;
                }
                List list2 = ha0.a;
                if (((Number) aw7Var2.getValue()).intValue() == 1) {
                    aw7Var.setValue(Boolean.FALSE);
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
                    if (((Number) aw7Var2.getValue()).intValue() <= 1) {
                        aw7Var2.setValue(Integer.valueOf(((Number) aw7Var2.getValue()).intValue() + 1));
                        hq7 hq7Var2 = wl3.b;
                        long O2 = jue.O(3000, am3Var);
                        this.b = 1;
                        if (ade.r(O2, this) == n82Var) {
                            return n82Var;
                        }
                    }
                    return pvcVar;
                }
                if (((Number) aw7Var2.getValue()).intValue() == 1) {
                    aw7Var.setValue(Boolean.FALSE);
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
                    s02 G = yae.G(new ea4(aw7Var2, 16));
                    zr2 zr2Var = new zr2(aw7Var, 1);
                    this.b = 1;
                    if (G.a(zr2Var, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
            default:
                hre.r(obj);
                tza tzaVar = e1c.a;
                if (!((Boolean) aw7Var2.getValue()).booleanValue()) {
                    aw7Var.setValue(Float.valueOf(this.b));
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ aa0(aw7 aw7Var, aw7 aw7Var2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = aw7Var;
        this.d = aw7Var2;
    }
}
