package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oha  reason: default package */
/* loaded from: classes.dex */
public final class oha extends fb6 implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oha(Object obj, int i) {
        super(3);
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                yy6 yy6Var = (yy6) obj;
                rv4 rv4Var = (rv4) obj2;
                ((Number) obj3).intValue();
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = yte.s(rv4Var);
                    rv4Var.o0(P);
                }
                m82 m82Var = (m82) P;
                Object P2 = rv4Var.P();
                if (P2 == lh9Var) {
                    P2 = new lha(yy6Var, m82Var);
                    rv4Var.o0(P2);
                }
                lha lhaVar = (lha) P2;
                ((tu1) obj4).h(lhaVar, new qha(lhaVar), rv4Var, 6);
                return pvc.a;
            case 1:
                mw8 M = ((w27) obj2).M(((x02) obj3).a);
                return ((e37) obj).q0(M.a, M.b, ls3.a, new jk(6, M, (z22) obj4));
            default:
                qkc qkcVar = (qkc) obj;
                rv4 rv4Var2 = (rv4) obj2;
                ((Number) obj3).intValue();
                rv4Var2.e0(955869654);
                lf4 lf4Var = (lf4) obj4;
                rv4Var2.q(false);
                return lf4Var;
        }
    }
}
