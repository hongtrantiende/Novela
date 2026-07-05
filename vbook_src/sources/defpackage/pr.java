package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pr  reason: default package */
/* loaded from: classes.dex */
public final class pr extends fb6 implements mu4 {
    public final /* synthetic */ xt4 a;
    public final /* synthetic */ tkc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr(xt4 xt4Var, tkc tkcVar) {
        super(3);
        this.a = xt4Var;
        this.b = tkcVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        long j;
        e37 e37Var = (e37) obj;
        mw8 M = ((w27) obj2).M(((x02) obj3).a);
        if (e37Var.I0()) {
            if (!((Boolean) this.a.invoke(this.b.d.getValue())).booleanValue()) {
                j = 0;
                return e37Var.q0((int) (j >> 32), (int) (4294967295L & j), ls3.a, new dg(M, 2));
            }
        }
        j = (M.a << 32) | (M.b & 4294967295L);
        return e37Var.q0((int) (j >> 32), (int) (4294967295L & j), ls3.a, new dg(M, 2));
    }
}
