package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi4  reason: default package */
/* loaded from: classes3.dex */
public final class vi4 extends c41 {
    public final h49 c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi4(h49 h49Var, String str, float f) {
        super(str, 3);
        h49Var.getClass();
        this.c = h49Var;
        this.d = f;
    }

    @Override // defpackage.c41
    public final Object d(String str) {
        str.getClass();
        h49 h49Var = this.c;
        h49Var.getClass();
        sn0 d = h49Var.d();
        d.getClass();
        return Float.valueOf((float) ((Number) z87.C(gs3.a, new pn0(d, str, this.d, (m42) null, 0))).doubleValue());
    }

    @Override // defpackage.c41
    public final void f(Object obj, String str) {
        float floatValue = ((Number) obj).floatValue();
        str.getClass();
        h49 h49Var = this.c;
        h49Var.getClass();
        h49Var.g(str, floatValue);
    }
}
