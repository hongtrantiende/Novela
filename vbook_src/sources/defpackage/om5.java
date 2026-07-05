package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: om5  reason: default package */
/* loaded from: classes3.dex */
public final class om5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vfb b;
    public final /* synthetic */ yya c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ om5(vfb vfbVar, yya yyaVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = vfbVar;
        this.c = yyaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        yya yyaVar = this.c;
        vfb vfbVar = this.b;
        switch (i) {
            case 0:
                return new om5(vfbVar, yyaVar, m42Var, 0);
            default:
                return new om5(vfbVar, yyaVar, m42Var, 1);
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
                ((om5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((om5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vfb vfbVar = this.b;
        yya yyaVar = this.c;
        tfb tfbVar = tfb.a;
        switch (i) {
            case 0:
                hre.r(obj);
                if (((Boolean) yyaVar.getValue()).booleanValue()) {
                    vfbVar.e(tfbVar);
                } else {
                    vfbVar.a(tfbVar);
                }
                return pvcVar;
            default:
                hre.r(obj);
                int i2 = ct8.c;
                if (((Boolean) yyaVar.getValue()).booleanValue()) {
                    vfbVar.e(tfbVar);
                } else {
                    vfbVar.a(tfbVar);
                }
                return pvcVar;
        }
    }
}
