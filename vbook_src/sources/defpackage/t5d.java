package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t5d  reason: default package */
/* loaded from: classes.dex */
public final class t5d implements b37 {
    public final /* synthetic */ vt4 a;
    public final /* synthetic */ vt4 b;
    public final /* synthetic */ e3a c;
    public final /* synthetic */ yya d;

    public t5d(vt4 vt4Var, vt4 vt4Var2, e3a e3aVar, yya yyaVar) {
        this.a = vt4Var;
        this.b = vt4Var2;
        this.c = e3aVar;
        this.d = yyaVar;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        e37Var.getClass();
        list.getClass();
        int n = dce.n((int) (((Number) this.a.invoke()).floatValue() * x02.h(j)), 0, x02.h(j));
        mw8 M = ((w27) list.get(0)).M(x02.b(j, 0, 0, n, n, 3));
        mw8 M2 = ((w27) list.get(1)).M(j);
        mw8 M3 = ((w27) list.get(2)).M(j);
        return e37Var.q0(x02.i(j), x02.h(j), ls3.a, new x94(j, this.b, this.c, M, M2, M3, this.d));
    }
}
