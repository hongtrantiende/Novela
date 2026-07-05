package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k86  reason: default package */
/* loaded from: classes.dex */
public final class k86 extends uq7 {
    public final xt4 b;
    public final xt4 c;

    public k86(xt4 xt4Var, xt4 xt4Var2) {
        this.b = xt4Var;
        this.c = xt4Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, m86] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        xt4 xt4Var = this.b;
        if (xt4Var != null) {
            c00Var.b(xt4Var, "onKeyEvent");
        }
        xt4 xt4Var2 = this.c;
        if (xt4Var2 != null) {
            c00Var.b(xt4Var2, "onPreviewKeyEvent");
        }
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        m86 m86Var = (m86) mq7Var;
        m86Var.K = this.b;
        m86Var.L = this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k86)) {
            return false;
        }
        k86 k86Var = (k86) obj;
        if (this.b == k86Var.b && this.c == k86Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        xt4 xt4Var = this.b;
        if (xt4Var != null) {
            i = xt4Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        xt4 xt4Var2 = this.c;
        if (xt4Var2 != null) {
            i2 = xt4Var2.hashCode();
        }
        return i3 + i2;
    }
}
