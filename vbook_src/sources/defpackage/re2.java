package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: re2  reason: default package */
/* loaded from: classes3.dex */
public final class re2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ xt4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ re2(int i, m42 m42Var, xt4 xt4Var) {
        super(2, m42Var);
        this.a = i;
        this.c = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        xt4 xt4Var = this.c;
        switch (i) {
            case 0:
                re2 re2Var = new re2(0, m42Var, xt4Var);
                re2Var.b = obj;
                return re2Var;
            case 1:
                re2 re2Var2 = new re2(1, m42Var, xt4Var);
                re2Var2.b = obj;
                return re2Var2;
            default:
                re2 re2Var3 = new re2(xt4Var, m42Var);
                re2Var3.b = obj;
                return re2Var3;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((re2) create((r19) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((re2) create((r19) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                ((re2) create((pv7) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        xt4 xt4Var = this.c;
        switch (i) {
            case 0:
                hre.r(obj);
                r19 r19Var = (r19) this.b;
                r19Var.getClass();
                return xt4Var.invoke(r19Var.c());
            case 1:
                hre.r(obj);
                r19 r19Var2 = (r19) this.b;
                r19Var2.getClass();
                return xt4Var.invoke(r19Var2.c());
            default:
                hre.r(obj);
                xt4Var.invoke((pv7) this.b);
                return pvc.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re2(xt4 xt4Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.c = xt4Var;
    }
}
