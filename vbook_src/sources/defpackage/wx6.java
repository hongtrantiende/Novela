package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wx6  reason: default package */
/* loaded from: classes.dex */
public final class wx6 extends c41 {
    public final h49 c;
    public final long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx6(h49 h49Var, String str, long j) {
        super(str, 3);
        h49Var.getClass();
        this.c = h49Var;
        this.d = j;
    }

    @Override // defpackage.c41
    public final Object d(String str) {
        str.getClass();
        h49 h49Var = this.c;
        h49Var.getClass();
        sn0 d = h49Var.d();
        d.getClass();
        return Long.valueOf(((Number) z87.C(gs3.a, new qn0(d, str, this.d, null, 0))).longValue());
    }

    @Override // defpackage.c41
    public final void f(Object obj, String str) {
        long longValue = ((Number) obj).longValue();
        str.getClass();
        h49 h49Var = this.c;
        h49Var.getClass();
        h49Var.h(longValue, str);
    }
}
