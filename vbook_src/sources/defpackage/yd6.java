package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yd6  reason: default package */
/* loaded from: classes.dex */
public final class yd6 extends ld6 {
    public final /* synthetic */ be6 b;
    public final /* synthetic */ lu4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd6(be6 be6Var, lu4 lu4Var, String str) {
        super(str);
        this.b = be6Var;
        this.c = lu4Var;
    }

    @Override // defpackage.b37
    public final c37 e(e37 e37Var, List list, long j) {
        be6 be6Var = this.b;
        wd6 wd6Var = be6Var.D;
        wd6Var.a = e37Var.getLayoutDirection();
        wd6Var.b = e37Var.f();
        wd6Var.c = e37Var.G0();
        boolean I0 = e37Var.I0();
        lu4 lu4Var = this.c;
        if (!I0 && be6Var.a.E != null) {
            be6Var.e = 0;
            c37 c37Var = (c37) lu4Var.invoke(be6Var.E, new x02(j));
            return new xd6(c37Var, be6Var, be6Var.e, c37Var, 0);
        }
        be6Var.d = 0;
        c37 c37Var2 = (c37) lu4Var.invoke(wd6Var, new x02(j));
        return new xd6(c37Var2, be6Var, be6Var.d, c37Var2, 1);
    }
}
