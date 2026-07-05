package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uwb  reason: default package */
/* loaded from: classes3.dex */
public final class uwb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ vwb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uwb(vwb vwbVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = vwbVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        vwb vwbVar = this.c;
        switch (i) {
            case 0:
                return new uwb(vwbVar, m42Var, 0);
            case 1:
                return new uwb(vwbVar, m42Var, 1);
            case 2:
                return new uwb(vwbVar, m42Var, 2);
            default:
                return new uwb(vwbVar, m42Var, 3);
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
                return ((uwb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((uwb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((uwb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((uwb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        vwb vwbVar = this.c;
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
                hs0 E = ((be9) vwbVar.d).E(vwbVar.c);
                twb twbVar = new twb(vwbVar, 0);
                this.b = 1;
                if (E.a(twbVar, this) == n82Var) {
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
                hs0 F = ((be9) vwbVar.d).F(vwbVar.c);
                twb twbVar2 = new twb(vwbVar, 1);
                this.b = 1;
                if (F.a(twbVar2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
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
                s02 O = v9e.O(((be9) vwbVar.d).a.Q.s0(1));
                sw2 sw2Var = ab3.a;
                hs0 hs0Var = new hs0(v9e.z(O, ru2.c), 21);
                twb twbVar3 = new twb(vwbVar, 2);
                this.b = 1;
                if (hs0Var.a(twbVar3, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                s02 O2 = v9e.O(((be9) vwbVar.d).a.Q.s0(0));
                sw2 sw2Var2 = ab3.a;
                hs0 hs0Var2 = new hs0(v9e.z(O2, ru2.c), 22);
                twb twbVar4 = new twb(vwbVar, 3);
                this.b = 1;
                if (hs0Var2.a(twbVar4, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
