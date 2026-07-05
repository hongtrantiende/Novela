package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v4a  reason: default package */
/* loaded from: classes.dex */
public final class v4a extends aab implements xt4 {
    public int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ y4a d;
    public final /* synthetic */ tkc e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4a(Object obj, Object obj2, y4a y4aVar, tkc tkcVar, float f, m42 m42Var) {
        super(1, m42Var);
        this.b = obj;
        this.c = obj2;
        this.d = y4aVar;
        this.e = tkcVar;
        this.f = f;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new v4a(this.b, this.c, this.d, this.e, this.f, m42Var);
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        return ((v4a) create((m42) obj)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            u4a u4aVar = new u4a(this.b, this.c, this.d, this.e, this.f, null);
            this.a = 1;
            Object p = k27.p(u4aVar, this);
            n82 n82Var = n82.a;
            if (p == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
