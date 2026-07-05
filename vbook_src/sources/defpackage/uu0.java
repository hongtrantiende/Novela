package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uu0  reason: default package */
/* loaded from: classes.dex */
public final class uu0 extends uq7 {
    public final ep b;

    public uu0(ep epVar) {
        this.b = epVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new wu0(this.b);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        wu0 wu0Var = (wu0) mq7Var;
        ep epVar = this.b;
        wu0Var.K = epVar;
        if (wu0Var.J) {
            epVar.invoke(wu0Var.L);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof uu0) {
                if (this.b != ((uu0) obj).b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
