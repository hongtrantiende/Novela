package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: c6b  reason: default package */
/* loaded from: classes3.dex */
public final class c6b extends uq7 {
    public final vt4 b;

    public c6b(vt4 vt4Var) {
        this.b = vt4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new d6b(this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "onHandwritingSlopExceeded");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((d6b) mq7Var).M = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6b)) {
            return false;
        }
        if (this.b == ((c6b) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
