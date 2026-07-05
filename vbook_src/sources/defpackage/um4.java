package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: um4  reason: default package */
/* loaded from: classes.dex */
public final class um4 extends uq7 {
    public final wm4 b;

    public um4(wm4 wm4Var) {
        this.b = wm4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ym4, mq7] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "scope");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((ym4) mq7Var).K = this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof um4) || !this.b.equals(((um4) obj).b)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.b + ")";
    }
}
