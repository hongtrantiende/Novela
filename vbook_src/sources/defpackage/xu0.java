package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xu0  reason: default package */
/* loaded from: classes.dex */
public final class xu0 extends uq7 {
    public final zu0 b;

    public xu0(zu0 zu0Var) {
        this.b = zu0Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new av0(this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "bringIntoViewRequester");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        av0 av0Var = (av0) mq7Var;
        zu0 zu0Var = av0Var.K;
        if (zu0Var != null) {
            zu0Var.a.j(av0Var);
        }
        zu0 zu0Var2 = this.b;
        if (zu0Var2 != null) {
            zu0Var2.a.b(av0Var);
        }
        av0Var.K = zu0Var2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xu0) {
                if (!c16.i(this.b, ((xu0) obj).b)) {
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
}
