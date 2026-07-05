package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aca  reason: default package */
/* loaded from: classes.dex */
public final class aca implements un3 {
    public final int a;
    public final int b;

    public aca(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.un3
    public final void a(lu0 lu0Var) {
        int n = dce.n(this.a, 0, ((cw) lu0Var.f).e());
        int n2 = dce.n(this.b, 0, ((cw) lu0Var.f).e());
        if (n < n2) {
            lu0Var.h(n, n2);
        } else {
            lu0Var.h(n2, n);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aca)) {
            return false;
        }
        aca acaVar = (aca) obj;
        if (this.a == acaVar.a && this.b == acaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "SetSelectionCommand(start=", ", end=", ")");
    }
}
