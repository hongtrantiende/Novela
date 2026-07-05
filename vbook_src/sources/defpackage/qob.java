package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qob  reason: default package */
/* loaded from: classes.dex */
public final class qob extends uq7 {
    public final lu4 b;

    public qob(lu4 lu4Var) {
        this.b = lu4Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new sob(this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "onPreShowContextMenu");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((sob) mq7Var).M = this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qob)) {
            return false;
        }
        if (this.b == ((qob) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        lu4 lu4Var = this.b;
        if (lu4Var != null) {
            return lu4Var.hashCode();
        }
        return 0;
    }
}
