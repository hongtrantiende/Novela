package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wsb  reason: default package */
/* loaded from: classes3.dex */
public final class wsb extends aab implements mu4 {
    public int a;
    public /* synthetic */ j59 b;
    public /* synthetic */ long c;
    public final /* synthetic */ m82 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ yu7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wsb(m82 m82Var, aw7 aw7Var, yu7 yu7Var, m42 m42Var) {
        super(3, m42Var);
        this.d = m82Var;
        this.e = aw7Var;
        this.f = yu7Var;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j = ((y78) obj2).a;
        aw7 aw7Var = this.e;
        yu7 yu7Var = this.f;
        wsb wsbVar = new wsb(this.d, aw7Var, yu7Var, (m42) obj3);
        wsbVar.b = (j59) obj;
        wsbVar.c = j;
        return wsbVar.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        m82 m82Var = this.d;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            j59 j59Var = this.b;
            z87.v(m82Var, null, null, new o0(this.e, this.c, this.f, (m42) null, 10), 3);
            this.a = 1;
            obj = j59Var.m(this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        z87.v(m82Var, null, null, new pz2(6, (m42) null, this.e, this.f, booleanValue), 3);
        return pvc.a;
    }
}
