package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jma  reason: default package */
/* loaded from: classes.dex */
public final class jma extends xpe {
    public final g99 f;
    public final hm8 g = yae.z(null);

    public jma(g99 g99Var) {
        this.f = g99Var;
    }

    @Override // defpackage.xpe
    public final boolean e(g99 g99Var) {
        if (g99Var == this.f) {
            return true;
        }
        return false;
    }

    @Override // defpackage.xpe
    public final Object g(g99 g99Var) {
        if (g99Var != this.f) {
            lv5.c("Check failed.");
        }
        Object value = this.g.getValue();
        if (value == null) {
            return null;
        }
        return value;
    }
}
