package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ck4  reason: default package */
/* loaded from: classes3.dex */
public final class ck4 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ sj4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ck4(sj4 sj4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = sj4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        sj4 sj4Var = this.d;
        switch (i) {
            case 0:
                ck4 ck4Var = new ck4(sj4Var, m42Var, 0);
                ck4Var.c = obj;
                return ck4Var;
            default:
                ck4 ck4Var2 = new ck4(sj4Var, m42Var, 1);
                ck4Var2.c = obj;
                return ck4Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        y69 y69Var = (y69) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((ck4) create(y69Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ck4) create(y69Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        sj4 sj4Var = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                y69 y69Var = (y69) this.c;
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
                bk4 bk4Var = new bk4(y69Var, 0);
                this.c = null;
                this.b = 1;
                if (sj4Var.a(bk4Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                y69 y69Var2 = (y69) this.c;
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
                bk4 bk4Var2 = new bk4(y69Var2, 1);
                this.c = null;
                this.b = 1;
                if (sj4Var.a(bk4Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
