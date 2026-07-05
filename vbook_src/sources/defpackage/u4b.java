package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u4b  reason: default package */
/* loaded from: classes.dex */
public final class u4b extends z4b {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u4b(ex3 ex3Var, int i) {
        super(ex3Var);
        this.d = i;
    }

    @Override // defpackage.ex3
    public final int a() {
        switch (this.d) {
            case 0:
                return this.a.a() * 8;
            case 1:
                return this.a.a() + 2;
            default:
                return this.a.a() + 2;
        }
    }

    @Override // defpackage.z4b
    public final boolean g(cp3 cp3Var, y28 y28Var) {
        int i = this.d;
        cp3Var.getClass();
        y28Var.getClass();
        switch (i) {
            case 0:
                if (cp3Var != y28Var) {
                    cp3 A = y28Var.A();
                    while (A != null) {
                        if (h(cp3Var, A)) {
                            return true;
                        }
                        if (A != cp3Var) {
                            A = A.a;
                            if (A == null) {
                                A = null;
                            }
                        }
                    }
                }
                return false;
            case 1:
                return this.a.d(cp3Var, y28Var);
            default:
                return !h(cp3Var, y28Var);
        }
    }

    public final String toString() {
        int i = this.d;
        ex3 ex3Var = this.a;
        switch (i) {
            case 0:
                return ex3Var + " ";
            case 1:
                return ":is(" + ex3Var + ")";
            default:
                return ":not(" + ex3Var + ")";
        }
    }
}
