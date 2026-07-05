package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u29  reason: default package */
/* loaded from: classes.dex */
public final class u29 extends fs9 implements lu4 {
    public final /* synthetic */ int b;
    public int c;
    public /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u29(int i, int i2, m42 m42Var) {
        super(i, m42Var);
        this.b = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.b) {
            case 0:
                u29 u29Var = new u29(2, 0, m42Var);
                u29Var.d = obj;
                return u29Var;
            default:
                u29 u29Var2 = new u29(2, 1, m42Var);
                u29Var2.d = obj;
                return u29Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        pvc pvcVar = pvc.a;
        gab gabVar = (gab) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((u29) create(gabVar, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((u29) create(gabVar, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        s09 s09Var = s09.b;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.c = 1;
                Object j = ukb.j((gab) this.d, s09Var, this);
                if (j == n82Var) {
                    return n82Var;
                }
                return j;
            default:
                gab gabVar = (gab) this.d;
                int i3 = this.c;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.d = null;
                this.c = 1;
                Object j2 = ukb.j(gabVar, s09Var, this);
                if (j2 == n82Var) {
                    return n82Var;
                }
                return j2;
        }
    }
}
