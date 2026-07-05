package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bb1  reason: default package */
/* loaded from: classes3.dex */
public final class bb1 extends aab implements lu4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ eb1 d;
    public final /* synthetic */ tj4 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb1(eb1 eb1Var, tj4 tj4Var, Object obj, m42 m42Var) {
        super(2, m42Var);
        this.d = eb1Var;
        this.e = tj4Var;
        this.c = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        tj4 tj4Var = this.e;
        eb1 eb1Var = this.d;
        switch (i) {
            case 0:
                return new bb1(eb1Var, tj4Var, this.c, m42Var);
            default:
                bb1 bb1Var = new bb1(eb1Var, tj4Var, m42Var);
                bb1Var.c = obj;
                return bb1Var;
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
                return ((bb1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((bb1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
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
                mu4 mu4Var = this.d.e;
                Object obj2 = this.c;
                this.b = 1;
                if (mu4Var.c(this.e, obj2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                m82 m82Var = (m82) this.c;
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
                Object obj3 = new Object();
                eb1 eb1Var = this.d;
                sj4 sj4Var = eb1Var.d;
                db1 db1Var = new db1(obj3, m82Var, eb1Var, this.e, 0);
                this.c = null;
                this.b = 1;
                if (sj4Var.a(db1Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bb1(eb1 eb1Var, tj4 tj4Var, m42 m42Var) {
        super(2, m42Var);
        this.d = eb1Var;
        this.e = tj4Var;
    }
}
