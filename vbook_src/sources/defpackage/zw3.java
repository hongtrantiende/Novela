package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zw3  reason: default package */
/* loaded from: classes.dex */
public final class zw3 extends ex3 {
    public final int a;
    public final /* synthetic */ int b;

    public zw3(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ex3
    public final boolean b(cp3 cp3Var, cp3 cp3Var2) {
        int i = this.b;
        int i2 = this.a;
        cp3Var.getClass();
        cp3Var2.getClass();
        switch (i) {
            case 0:
                if (cp3Var2.O() != i2) {
                    return false;
                }
                return true;
            case 1:
                if (cp3Var2.O() <= i2) {
                    return false;
                }
                return true;
            default:
                if (cp3Var.equals(cp3Var2) || cp3Var2.O() >= i2) {
                    return false;
                }
                return true;
        }
    }

    public final String toString() {
        switch (this.b) {
            case 0:
                return hl5.l(":eq(", ")", this.a);
            case 1:
                return hl5.l(":gt(", ")", this.a);
            default:
                return hl5.l(":lt(", ")", this.a);
        }
    }
}
