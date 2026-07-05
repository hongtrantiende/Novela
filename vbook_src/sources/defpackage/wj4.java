package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wj4  reason: default package */
/* loaded from: classes3.dex */
public final class wj4 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sj4 c;
    public final /* synthetic */ x69 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wj4(sj4 sj4Var, x69 x69Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = sj4Var;
        this.d = x69Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new wj4(this.c, this.d, m42Var, 0);
            default:
                return new wj4(this.c, this.d, m42Var, 1);
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
                return ((wj4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((wj4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        x69 x69Var = this.d;
        sj4 sj4Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 != 1 && i2 != 2) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                    return pvcVar;
                }
                hre.r(obj);
                vj4 vj4Var = new vj4(x69Var, 0);
                this.b = 1;
                if (sj4Var.a(vj4Var, this) == n82Var) {
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
                vj4 vj4Var2 = new vj4(x69Var, 2);
                this.b = 1;
                if (sj4Var.a(vj4Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
