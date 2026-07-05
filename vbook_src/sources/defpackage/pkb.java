package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pkb  reason: default package */
/* loaded from: classes3.dex */
public final class pkb extends fs9 implements lu4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ mu4 D;
    public final /* synthetic */ xt4 E;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ m82 d;
    public final /* synthetic */ j59 e;
    public final /* synthetic */ xt4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkb(m82 m82Var, j59 j59Var, xt4 xt4Var, xt4 xt4Var2, mu4 mu4Var, xt4 xt4Var3, m42 m42Var) {
        super(2, m42Var);
        this.d = m82Var;
        this.e = j59Var;
        this.f = xt4Var;
        this.C = xt4Var2;
        this.D = mu4Var;
        this.E = xt4Var3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        pkb pkbVar = new pkb(this.d, this.e, this.f, this.C, this.D, this.E, m42Var);
        pkbVar.c = obj;
        return pkbVar;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((pkb) create((gab) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            this.b = 1;
            Object h = ukb.h((gab) this.c, this.d, this.e, this.f, this.C, this.D, this.E, this);
            n82 n82Var = n82.a;
            if (h == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
