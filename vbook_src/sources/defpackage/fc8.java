package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fc8  reason: default package */
/* loaded from: classes.dex */
public final class fc8 extends fb6 implements xt4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hn4 b;
    public final /* synthetic */ hn4 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ gp e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fc8(hn4 hn4Var, hn4 hn4Var2, Object obj, int i, gp gpVar, int i2) {
        super(1);
        this.a = i2;
        this.b = hn4Var;
        this.c = hn4Var2;
        this.f = obj;
        this.d = i;
        this.e = gpVar;
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        gp gpVar = this.e;
        int i2 = this.d;
        Object obj2 = this.f;
        hn4 hn4Var = this.c;
        hn4 hn4Var2 = this.b;
        switch (i) {
            case 0:
                ik0 ik0Var = (ik0) obj;
                if (hn4Var2 != ((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean L = sue.L(hn4Var, (hn4) obj2, i2, gpVar);
                Boolean valueOf = Boolean.valueOf(L);
                if (!L && ik0Var.a()) {
                    return null;
                }
                return valueOf;
            default:
                ik0 ik0Var2 = (ik0) obj;
                if (hn4Var2 != ((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).f()) {
                    return Boolean.TRUE;
                }
                boolean E = yae.E(i2, gpVar, hn4Var, (rk9) obj2);
                Boolean valueOf2 = Boolean.valueOf(E);
                if (!E && ik0Var2.a()) {
                    return null;
                }
                return valueOf2;
        }
    }
}
