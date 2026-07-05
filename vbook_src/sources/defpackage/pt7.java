package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pt7  reason: default package */
/* loaded from: classes.dex */
public final class pt7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ st7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pt7(st7 st7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = st7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        st7 st7Var = this.b;
        switch (i) {
            case 0:
                return new pt7(st7Var, m42Var, 0);
            default:
                return new pt7(st7Var, m42Var, 1);
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
                return ((pt7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((pt7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        st7 st7Var = this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                gga ggaVar = (gga) ((hga) st7Var.i.getValue());
                return new Integer(ggaVar.b.nativeGetCounterValue(ggaVar.c));
            default:
                hre.r(obj);
                gga ggaVar2 = (gga) ((hga) st7Var.i.getValue());
                return new Integer(ggaVar2.b.nativeIncrementAndGetCounterValue(ggaVar2.c));
        }
    }
}
