package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bcc  reason: default package */
/* loaded from: classes.dex */
public final class bcc extends zbc {
    public boolean k;

    @Override // defpackage.zbc
    public final /* bridge */ /* synthetic */ zbc V() {
        f();
        return this;
    }

    @Override // defpackage.zbc, defpackage.dcc
    /* renamed from: Y */
    public final void f() {
        super.f();
        this.k = true;
    }

    public final String toString() {
        String str;
        String str2;
        boolean z = this.k;
        if (z) {
            str = "<!";
        } else {
            str = "<?";
        }
        if (z) {
            str2 = ">";
        } else {
            str2 = "?>";
        }
        j40 j40Var = this.g;
        if (j40Var != null) {
            j40Var.getClass();
            if (j40Var.a > 0) {
                String X = X();
                j40 j40Var2 = this.g;
                return str + X + " " + j40Var2 + str2;
            }
        }
        return eub.o(str, X(), str2);
    }
}
