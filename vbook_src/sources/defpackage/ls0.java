package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ls0  reason: default package */
/* loaded from: classes3.dex */
public final class ls0 extends c41 {
    public final h49 c;
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls0(h49 h49Var, String str, boolean z) {
        super(str, 3);
        h49Var.getClass();
        this.c = h49Var;
        this.d = z;
    }

    @Override // defpackage.c41
    public final Object d(String str) {
        str.getClass();
        h49 h49Var = this.c;
        h49Var.getClass();
        sn0 d = h49Var.d();
        d.getClass();
        Boolean bool = (Boolean) z87.C(gs3.a, new nn0(d, str, this.d, null, 0));
        bool.getClass();
        return bool;
    }

    @Override // defpackage.c41
    public final void f(Object obj, String str) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        str.getClass();
        h49 h49Var = this.c;
        h49Var.getClass();
        sn0 d = h49Var.d();
        d.getClass();
        z87.B(new nn0(d, str, booleanValue, null, 1));
    }
}
