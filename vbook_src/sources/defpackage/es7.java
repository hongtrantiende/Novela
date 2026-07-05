package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: es7  reason: default package */
/* loaded from: classes.dex */
public final class es7 extends uq7 {
    public final btd b;

    public es7(btd btdVar) {
        this.b = btdVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new is7(this.b);
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        is7 is7Var = (is7) mq7Var;
        is7Var.getClass();
        is7Var.M = this.b;
        is7Var.O.J1();
        is7Var.P.J1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof es7) && this.b == ((es7) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "MouseZoomElement(zoomable=" + this.b + ")";
    }
}
