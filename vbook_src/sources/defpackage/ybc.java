package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ybc  reason: default package */
/* loaded from: classes.dex */
public final class ybc extends zbc {
    @Override // defpackage.zbc, defpackage.dcc
    /* renamed from: V */
    public final zbc f() {
        super.f();
        this.g = null;
        return this;
    }

    public final String toString() {
        String str;
        if (this.f) {
            str = "/>";
        } else {
            str = ">";
        }
        j40 j40Var = this.g;
        if (j40Var != null) {
            j40Var.getClass();
            if (j40Var.size() > 0) {
                String X = X();
                j40 j40Var2 = this.g;
                return "<" + X + " " + j40Var2 + str;
            }
        }
        return hl5.n("<", X(), str);
    }
}
