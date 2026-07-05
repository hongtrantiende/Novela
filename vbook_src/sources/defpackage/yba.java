package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yba  reason: default package */
/* loaded from: classes.dex */
public final class yba implements un3 {
    public final int a;
    public final int b;

    public yba(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.un3
    public final void a(lu0 lu0Var) {
        boolean z;
        if (lu0Var.d != -1) {
            z = true;
        } else {
            z = false;
        }
        cw cwVar = (cw) lu0Var.f;
        if (z) {
            lu0Var.d = -1;
            lu0Var.e = -1;
        }
        int n = dce.n(this.a, 0, cwVar.e());
        int n2 = dce.n(this.b, 0, cwVar.e());
        if (n != n2) {
            if (n < n2) {
                lu0Var.g(n, n2);
            } else {
                lu0Var.g(n2, n);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yba)) {
            return false;
        }
        yba ybaVar = (yba) obj;
        if (this.a == ybaVar.a && this.b == ybaVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return hl5.i(this.a, this.b, "SetComposingRegionCommand(start=", ", end=", ")");
    }
}
