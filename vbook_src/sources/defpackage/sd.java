package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sd  reason: default package */
/* loaded from: classes3.dex */
public final class sd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ lu4 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ m82 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd(lu4 lu4Var, Object obj, m82 m82Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = lu4Var;
        this.d = obj;
        this.e = m82Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new sd(this.c, this.d, this.e, m42Var, 0);
            default:
                return new sd(this.c, this.d, this.e, m42Var, 1);
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
                return ((sd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((sd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = this.e;
        Object obj2 = this.d;
        lu4 lu4Var = this.c;
        n82 n82Var = n82.a;
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
                    this.b = 1;
                    if (lu4Var.invoke(obj2, this) == n82Var) {
                        return n82Var;
                    }
                }
                k27.n(m82Var, new kd());
                return pvcVar;
            default:
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
                    this.b = 1;
                    if (lu4Var.invoke(obj2, this) == n82Var) {
                        return n82Var;
                    }
                }
                k27.n(m82Var, new ld());
                return pvcVar;
        }
    }
}
