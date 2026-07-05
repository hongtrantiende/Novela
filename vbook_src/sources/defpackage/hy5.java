package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hy5  reason: default package */
/* loaded from: classes.dex */
public final class hy5 extends c41 {
    public final h49 c;
    public final int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy5(h49 h49Var, String str, int i) {
        super(str, 3);
        h49Var.getClass();
        this.c = h49Var;
        this.d = i;
    }

    @Override // defpackage.c41
    public final Object d(String str) {
        str.getClass();
        h49 h49Var = this.c;
        h49Var.getClass();
        sn0 d = h49Var.d();
        d.getClass();
        return Integer.valueOf((int) ((Number) z87.C(gs3.a, new qn0(d, str, this.d, null, 0))).longValue());
    }

    @Override // defpackage.c41
    public final void f(Object obj, String str) {
        int intValue = ((Number) obj).intValue();
        str.getClass();
        h49 h49Var = this.c;
        h49Var.getClass();
        h49Var.h(intValue, str);
    }
}
