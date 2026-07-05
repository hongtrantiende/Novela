package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: he3  reason: default package */
/* loaded from: classes3.dex */
public final class he3 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ie3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he3(ie3 ie3Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ie3Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ie3 ie3Var = this.c;
        switch (i) {
            case 0:
                return new he3(ie3Var, m42Var, 0);
            default:
                return new he3(ie3Var, m42Var, 1);
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
                return ((he3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((he3) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        ie3 ie3Var = this.c;
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
                td3 td3Var = ie3Var.c;
                this.b = 1;
                ((ae3) td3Var).a.E.a0();
                if (pvcVar == n82Var) {
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
                s02 O = v9e.O(((ae3) ie3Var.c).a.E.h0());
                sw2 sw2Var = ab3.a;
                hs0 hs0Var = new hs0(v9e.z(O, ru2.c), 2);
                bb bbVar = new bb(ie3Var, 16);
                this.b = 1;
                if (hs0Var.a(bbVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
