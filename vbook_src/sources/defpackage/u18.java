package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u18  reason: default package */
/* loaded from: classes.dex */
public final class u18 extends gh0 {
    public final int b;

    static {
        r95.r("NetworkNotRoamingCtrlr");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u18(b28 b28Var) {
        super(b28Var);
        b28Var.getClass();
        this.b = 7;
    }

    @Override // defpackage.l02
    public final boolean c(ymd ymdVar) {
        ymdVar.getClass();
        if (ymdVar.j.a == c28.d) {
            return true;
        }
        return false;
    }

    @Override // defpackage.gh0
    public final int d() {
        return this.b;
    }

    @Override // defpackage.gh0
    public final boolean e(Object obj) {
        z18 z18Var = (z18) obj;
        z18Var.getClass();
        if (z18Var.a && z18Var.d && !z18Var.e) {
            return false;
        }
        return true;
    }
}
