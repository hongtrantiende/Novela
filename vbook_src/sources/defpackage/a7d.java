package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a7d  reason: default package */
/* loaded from: classes3.dex */
public final class a7d extends aab implements lu4 {
    public final /* synthetic */ xt4 C;
    public final /* synthetic */ aw7 D;
    public final /* synthetic */ xt4 E;
    public final /* synthetic */ aw7 F;
    public final /* synthetic */ aw7 G;
    public final /* synthetic */ aw7 H;
    public final /* synthetic */ aw7 I;
    public int a;
    public final /* synthetic */ gcd b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ xt4 e;
    public final /* synthetic */ xt4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7d(gcd gcdVar, aw7 aw7Var, long j, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, aw7 aw7Var2, xt4 xt4Var4, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5, aw7 aw7Var6, m42 m42Var) {
        super(2, m42Var);
        this.b = gcdVar;
        this.c = aw7Var;
        this.d = j;
        this.e = xt4Var;
        this.f = xt4Var2;
        this.C = xt4Var3;
        this.D = aw7Var2;
        this.E = xt4Var4;
        this.F = aw7Var3;
        this.G = aw7Var4;
        this.H = aw7Var5;
        this.I = aw7Var6;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new a7d(this.b, this.c, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((a7d) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hre.r(obj);
        } else {
            hre.r(obj);
            if (((xic) this.c.getValue()) == null) {
                return pvc.a;
            }
            gcd gcdVar = this.b;
            jj9 jj9Var = gcdVar.f;
            z6d z6dVar = new z6d(gcdVar, this.d, this.e, this.f, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
            this.a = 1;
            Object a = jj9Var.a.a(z6dVar, this);
            n82 n82Var = n82.a;
            if (a == n82Var) {
                return n82Var;
            }
        }
        ls2.c();
        return null;
    }
}
