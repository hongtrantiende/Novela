package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yw3  reason: default package */
/* loaded from: classes.dex */
public final class yw3 extends ex3 {
    public gm9 a;
    public String b;

    @Override // defpackage.ex3
    public final int a() {
        return 8;
    }

    @Override // defpackage.ex3
    public final boolean b(cp3 cp3Var, cp3 cp3Var2) {
        cp3Var.getClass();
        cp3Var2.getClass();
        String str = this.b;
        if (cp3Var2.n(str) && gm9.b(this.a, cp3Var2.c(str)) != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return hl5.o("[", this.b, "~=", this.a.d(), "]");
    }
}
