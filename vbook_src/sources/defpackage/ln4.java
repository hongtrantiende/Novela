package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ln4  reason: default package */
/* loaded from: classes.dex */
public final class ln4 extends uq7 {
    public final yu7 b;

    public ln4(yu7 yu7Var) {
        this.b = yu7Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new mn4(this.b, (qrb) null, 6);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(Boolean.TRUE, "enabled");
        c00Var.b(this.b, "interactionSource");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((mn4) mq7Var).L1(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ln4)) {
            return false;
        }
        if (c16.i(this.b, ((ln4) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        yu7 yu7Var = this.b;
        if (yu7Var != null) {
            return yu7Var.hashCode();
        }
        return 0;
    }
}
